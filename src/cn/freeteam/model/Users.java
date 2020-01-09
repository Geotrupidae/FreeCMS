package cn.freeteam.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Users implements Serializable{
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String id;
    private String ismail;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.name
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String name;
    private String unitNames;
    private String unitIds;
    private String roleNames;
    private String mobilephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.loginName
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String loginname;
    private int loginFailNum;
    private int loginNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.pwd
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.sex
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.birthday
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private Date birthday;
    private String birthdayStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.tel
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.isOk
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private String isok;
    private String isokStr;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lastLoginTime
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    private Date lastlogintime;
    private Date addTime;
    private String addTimeStr;
    private Date lastestlogintime;
    private String lastestlogintimeStr;
    private String lastLoginTimeStr;
    
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static SimpleDateFormat birthsdf=new SimpleDateFormat("yyyy-MM-dd");

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.name
     *
     * @return the value of users.name
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.name
     *
     * @param name the value for users.name
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.loginName
     *
     * @return the value of users.loginName
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.loginName
     *
     * @param loginname the value for users.loginName
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.pwd
     *
     * @return the value of users.pwd
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.pwd
     *
     * @param pwd the value for users.pwd
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.sex
     *
     * @return the value of users.sex
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.sex
     *
     * @param sex the value for users.sex
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.birthday
     *
     * @return the value of users.birthday
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.birthday
     *
     * @param birthday the value for users.birthday
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.tel
     *
     * @return the value of users.tel
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.tel
     *
     * @param tel the value for users.tel
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.isOk
     *
     * @return the value of users.isOk
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public String getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.isOk
     *
     * @param isok the value for users.isOk
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lastLoginTime
     *
     * @return the value of users.lastLoginTime
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lastLoginTime
     *
     * @param lastlogintime the value for users.lastLoginTime
     *
     * @mbggenerated Tue Mar 01 20:39:43 CST 2011
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

	public String getLastLoginTimeStr() {
		if (getLastlogintime()!=null&&!sdf.format(getLastlogintime()).equals("2010-01-01 00:00")) {
			return sdf.format(getLastlogintime());
		}else {
			return "第一次登录";
		}
	}

	public void setLastLoginTimeStr(String lastLoginTimeStr) {
		this.lastLoginTimeStr = lastLoginTimeStr;
	}

	public Date getLastestlogintime() {
		return lastestlogintime;
	}

	public void setLastestlogintime(Date lastestlogintime) {
		this.lastestlogintime = lastestlogintime;
	}

	public String getBirthdayStr() {
		birthdayStr="";
		if (getBirthday()!=null) {
			birthdayStr=birthsdf.format(getBirthday());
		}
		return birthdayStr;
	}

	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}


	public int getLoginFailNum() {
		return loginFailNum;
	}

	public void setLoginFailNum(int loginFailNum) {
		this.loginFailNum = loginFailNum;
	}

	public int getLoginNum() {
		return loginNum;
	}

	public void setLoginNum(int loginNum) {
		this.loginNum = loginNum;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getAddTimeStr() {
		if (addTime!=null) {
			return birthsdf.format(addTime);
		}
		return addTimeStr;
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public String getLastestlogintimeStr() {
		if (lastestlogintime!=null) {
			return birthsdf.format(lastestlogintime);
		}
		return lastestlogintimeStr;
	}

	public void setLastestlogintimeStr(String lastestlogintimeStr) {
		this.lastestlogintimeStr = lastestlogintimeStr;
	}

	public String getIsokStr() {
		if ("1".equals(isok)) {
			return "是";
		}
		return "否";
	}

	public void setIsokStr(String isokStr) {
		this.isokStr = isokStr;
	}

	public String getUnitNames() {
		return unitNames;
	}

	public void setUnitNames(String unitNames) {
		this.unitNames = unitNames;
	}

	public String getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}

	public String getUnitIds() {
		return unitIds;
	}

	public void setUnitIds(String unitIds) {
		this.unitIds = unitIds;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getIsmail() {
		return ismail;
	}

	public void setIsmail(String ismail) {
		this.ismail = ismail;
	}
}