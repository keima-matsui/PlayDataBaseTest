package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;


@Entity
@Table(name = "user_master")
public class UserMaster extends Model {

	/**
	 * user id
	 */
	@Id
	@Column(name = "user_id")
	private String userId;

	/**
	 * username
	 */
	@Column(name = "user_name")
	private String userName;

	/**
	 * password
	 */
	@Column(name = "password")
	private String password;

	/**
	 * regist date
	 */
	@CreatedTimestamp
	@Column(name = "regist_time")
	private Timestamp registTime;

	/**
	 * update date
	 */
	@UpdatedTimestamp
	@Column(name = "update_time")
	private Timestamp updateTime;

	/**
	 * find
	 */
	private static Find<Long, UserMaster> find = new Find<Long, UserMaster>() {
	};

	/**
	 * get userid
	 *
	 * @return userid
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * user id conf
	 *
	 * @param userId
	 *            userid
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * username
	 *
	 * @return username
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * username conf
	 *
	 * @param userName
	 *            username
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * get password
	 *
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * password conf
	 *
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * get regist date
	 *
	 * @return regist date
	 */
	public Timestamp getRegistTime() {
		return registTime;
	}

	/**
	 * regist date conf
	 *
	 * @param registTime
	 *            regit date
	 */
	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	/**
	 * get update date
	 *
	 * @return update date
	 */
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	/**
	 * update date conf
	 *
	 * @param updateTime
	 *            updatedate
	 */
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * get find
	 *
	 * @return find
	 */
	public static Find<Long, UserMaster> getFind() {
		return find;
	}

	/**
	 * find conf
	 *
	 * @param find
	 *            find
	 */
	public static void setFind(Find<Long, UserMaster> find) {
		UserMaster.find = find;
	}
}