package cn.freeteam.cms.model;

public class Htmlquartz {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.id
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.siteid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private String siteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.channelid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private String channelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.type
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private String type;
    public static String TYPE_EXETIME="0";//定时执行
    public static String TYPE_INTERVAL="1";//间隔重复执行

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.exetimehour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private Integer exetimehour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.exetimemin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private Integer exetimemin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.intervalhour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private String intervaltype;
    public static String INTERVALTYPE_HOUR="0";
    public static String INTERVALTYPE_MIN="1";
    private Integer intervalhour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_htmlQuartz.intervalmin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    private Integer intervalmin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.id
     *
     * @return the value of freecms_htmlQuartz.id
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.id
     *
     * @param id the value for freecms_htmlQuartz.id
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.siteid
     *
     * @return the value of freecms_htmlQuartz.siteid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.siteid
     *
     * @param siteid the value for freecms_htmlQuartz.siteid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.channelid
     *
     * @return the value of freecms_htmlQuartz.channelid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getChannelid() {
        return channelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.channelid
     *
     * @param channelid the value for freecms_htmlQuartz.channelid
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.type
     *
     * @return the value of freecms_htmlQuartz.type
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.type
     *
     * @param type the value for freecms_htmlQuartz.type
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.exetimehour
     *
     * @return the value of freecms_htmlQuartz.exetimehour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getExetimehour() {
        return exetimehour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.exetimehour
     *
     * @param exetimehour the value for freecms_htmlQuartz.exetimehour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setExetimehour(Integer exetimehour) {
        this.exetimehour = exetimehour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.exetimemin
     *
     * @return the value of freecms_htmlQuartz.exetimemin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getExetimemin() {
        return exetimemin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.exetimemin
     *
     * @param exetimemin the value for freecms_htmlQuartz.exetimemin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setExetimemin(Integer exetimemin) {
        this.exetimemin = exetimemin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.intervalhour
     *
     * @return the value of freecms_htmlQuartz.intervalhour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getIntervalhour() {
        return intervalhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.intervalhour
     *
     * @param intervalhour the value for freecms_htmlQuartz.intervalhour
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setIntervalhour(Integer intervalhour) {
        this.intervalhour = intervalhour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_htmlQuartz.intervalmin
     *
     * @return the value of freecms_htmlQuartz.intervalmin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public Integer getIntervalmin() {
        return intervalmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_htmlQuartz.intervalmin
     *
     * @param intervalmin the value for freecms_htmlQuartz.intervalmin
     *
     * @mbggenerated Wed Jan 23 21:55:47 CST 2013
     */
    public void setIntervalmin(Integer intervalmin) {
        this.intervalmin = intervalmin;
    }

	public String getIntervaltype() {
		return intervaltype;
	}

	public void setIntervaltype(String intervaltype) {
		this.intervaltype = intervaltype;
	}
}