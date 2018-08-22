package com.bajiuling;


import java.util.Date;

/**
 * 商户服务号用户信息
 * 
 * @author jinlin
 * @email jinlin@890media.com
 * @date 2018-07-26 20:54:32
 */

public class StoreMpUserEntity {
//	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */


	private Integer id;
	/**
	 * 
	 */
	private Integer store_id;
	/**
	 * 商户appid
	 */
	private String app_id;
	/**
	 * 
	 */
	private Integer user_id;
	/**
	 * 商户用户openid
	 */
	private String open_id;
	/**
	 * 
	 */
	private String union_id;

	private String nick_name;
	private String avatar_url;
	private Integer sex;
	/**
	 * 
	 */
	private Date create_time;
	/**
	 * 
	 */
	private Date update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getOpen_id() {
		return open_id;
	}

	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}

	public String getUnion_id() {
		return union_id;
	}

	public void setUnion_id(String union_id) {
		this.union_id = union_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "StoreMpUserEntity{" +
				"id=" + id +
				", store_id=" + store_id +
				", app_id='" + app_id + '\'' +
				", user_id=" + user_id +
				", open_id='" + open_id + '\'' +
				", union_id='" + union_id + '\'' +
				", nick_name='" + nick_name + '\'' +
				", avatar_url='" + avatar_url + '\'' +
				", sex=" + sex +
				", create_time=" + create_time +
				", update_time=" + update_time +
				'}';
	}
}
