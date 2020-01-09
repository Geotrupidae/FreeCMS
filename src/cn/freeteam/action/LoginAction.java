package cn.freeteam.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

import cn.freeteam.base.BaseAction;
import cn.freeteam.model.Users;
import cn.freeteam.service.UserService;
import cn.freeteam.util.EscapeUnescape;
import cn.freeteam.util.HttpsClientUtil;
import cn.freeteam.util.MybatisSessionFactory;
import cn.freeteam.util.OperLogUtil;
import cn.freeteam.util.PropertiesUtil;
import cn.freeteam.util.ResponseUtil;




/**
 * 登录
 * @author freeteam
 *
 */

public class LoginAction extends BaseAction{

	private Users user;
	private String ValidateCode;
	private String RememberMe;
	private String msg;
	private UserService userService;
	private String code;
	
	private final String GRANT_TYPE = "authorization_code";
	
	private final String propertiesFilePath = "freecms.properties";
	
	private final String CLIENT_ID = PropertiesUtil.getConfig(propertiesFilePath, "clientId");
	
	private final String CLIENT_SECRET = PropertiesUtil.getConfig(propertiesFilePath, "clientSecret");
	
	private final String getTokenUrl = PropertiesUtil.getConfig(propertiesFilePath, "httpGetTokenUrl");
	
	private final String getUserInfoUrl = PropertiesUtil.getConfig(propertiesFilePath, "httpGetUserInfoUrl");
			
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LoginAction() {
		init("userService");
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String oauth(){
		//获取页面跳转中携带的code参数
		String oauthCode = code;
		JSONObject paramJson = new JSONObject();
		paramJson.put("code", oauthCode);
		paramJson.put("client_id", CLIENT_ID);
		paramJson.put("client_secret", CLIENT_SECRET);
		paramJson.put("grant_type", GRANT_TYPE);
		Map<String, String> tokenParam = new HashMap<String, String>();
		JSONObject accessTokenObj ;
		String accessToken = "";
		String userName = "";
		try {
			//获取登陆凭证access_token
			String requstResult = HttpsClientUtil.doPost(paramJson, getTokenUrl);
			accessTokenObj = JSONObject.parseObject(requstResult);
			if(accessTokenObj.getString("access_token") != null){
				accessToken = accessTokenObj.getString("access_token");
			}
			tokenParam.put("client_id", CLIENT_ID);
			tokenParam.put("access_token", accessToken);
			//通过access_token获取用户信息
			String userInfoResult = HttpsClientUtil.doGet(getUserInfoUrl, new HashMap<String, String>(), tokenParam, "UTF-8");
			JSONObject userInfoObj = JSONObject.parseObject(userInfoResult);
			System.out.println("user info:"+userInfoResult);
			if(StringUtils.isNotEmpty(userInfoObj.getString("loginName"))){
				userName = userInfoObj.getString("loginName");
			}
			Users loginUser = new Users();
			loginUser.setLoginname(userName);
			//通过username查找用户在本地数据库中是否存在
			msg = userService.checkLoginUserName(getHttpSession(), loginUser);
			if (msg==null || "".equals(msg)) {
				OperLogUtil.log(loginUser.getLoginname(), "登录系统", getHttpRequest());
				return "admin";
			}else {
				ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('"+msg+"');</script>");
				return null;
			}
		} catch (Exception e) {
			try {
				MybatisSessionFactory.getSession().rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			OperLogUtil.log(user.getLoginname(), "登录系统失败:"+e.toString(), getHttpRequest());
			ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('出现错误:"+e.toString()+"');history.back();</script>");
			return null;
		}
	}
	
	public String login(){
		try {
			//记住用户名
			if("on".equals(RememberMe)){
				Cookie cookie=new Cookie("FreeCMS_loginName",EscapeUnescape.escape(user.getLoginname()));
				cookie.setMaxAge(60*60*24*365);//有效时间为一年
				getHttpResponse().addCookie(cookie);
			}
		    HttpSession session =getHttpSession();
			if (ValidateCode!=null && ValidateCode.equals(session.getAttribute("rand"))) {
				msg=userService.checkLogin(getHttpSession(), user);
			}else {
				msg="验证码错误!";
			}
			if (msg==null || "".equals(msg)) {
				OperLogUtil.log(user.getLoginname(), "登录系统", getHttpRequest());
				return "admin";
			}else {
				ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('"+msg+"');history.back();</script>");
				return null;
			}
		} catch (Exception e) {
			try {
				MybatisSessionFactory.getSession().rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			OperLogUtil.log(user.getLoginname(), "登录系统失败:"+e.toString(), getHttpRequest());
			ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('出现错误:"+e.toString()+"');history.back();</script>");
			return null;
		}
	}
	
	public String weblogin(){
		try {
			//记住用户名
			if("on".equals(RememberMe)){
				Cookie cookie=new Cookie("FreeCMS_loginName",EscapeUnescape.escape(user.getLoginname()));
				cookie.setMaxAge(60*60*24*365);//有效时间为一年
				getHttpResponse().addCookie(cookie);
			}
		    HttpSession session =getHttpSession();
			msg=userService.checkLogin(getHttpSession(), user);
			if (msg==null || "".equals(msg)) {
				OperLogUtil.log(user.getLoginname(), "登录系统", getHttpRequest());
				return "admin";
			}else {
				ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('"+msg+"');history.back();</script>");
				return null;
			}
		} catch (Exception e) {
			try {
				MybatisSessionFactory.getSession().rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			OperLogUtil.log(user.getLoginname(), "登录系统失败:"+e.toString(), getHttpRequest());
			ResponseUtil.writeGBK(getHttpResponse(), "<script>alert('出现错误:"+e.toString()+"');history.back();</script>");
			return null;
		}
	}
	//退出
	public String out(){
	    HttpSession session =getHttpSession();
	    user=(Users)session.getAttribute("loginAdmin");
	    if (user!=null) {
			OperLogUtil.log(user.getLoginname(), "退出系统", getHttpRequest());
		}
	    session.removeAttribute("loginAdmin");
	    session.removeAttribute("manageSite");
	    session.removeAttribute("siteAdmin");
	    session.removeAttribute("loginUnits");
	    session.removeAttribute("loginRoles");
	    session.removeAttribute("funcs");
		return "login";
	}
	
	//sp自身退出接口，供IDP进行回调
	public String oauthLogout(){
	    HttpSession session =getHttpSession();
	    user=(Users)session.getAttribute("loginAdmin");
	    if (user!=null) {
			OperLogUtil.log(user.getLoginname(), "退出系统", getHttpRequest());
		}
	    session.removeAttribute("loginAdmin");
	    session.removeAttribute("manageSite");
	    session.removeAttribute("siteAdmin");
	    session.removeAttribute("loginUnits");
	    session.removeAttribute("loginRoles");
	    session.removeAttribute("funcs");
		return "success";
	}
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getValidateCode() {
		return ValidateCode;
	}
	public void setValidateCode(String validateCode) {
		ValidateCode = validateCode;
	}
	public String getRememberMe() {
		return RememberMe;
	}
	public void setRememberMe(String rememberMe) {
		RememberMe = rememberMe;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
