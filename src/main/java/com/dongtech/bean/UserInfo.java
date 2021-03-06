package com.dongtech.bean;

import java.io.Serializable;

public class UserInfo implements Serializable {
    public UserInfo() {
    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", worktime='" + worktime + '\'' +
                ", workstatus='" + workstatus + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.id
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.username
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.worktime
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private String worktime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.workstatus
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private String workstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.password
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.email
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.id
     *
     * @return the value of userinfo.id
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.id
     *
     * @param id the value for userinfo.id
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.username
     *
     * @return the value of userinfo.username
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.username
     *
     * @param username the value for userinfo.username
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.worktime
     *
     * @return the value of userinfo.worktime
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public String getWorktime() {
        return worktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.worktime
     *
     * @param worktime the value for userinfo.worktime
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.workstatus
     *
     * @return the value of userinfo.workstatus
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public String getWorkstatus() {
        return workstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.workstatus
     *
     * @param workstatus the value for userinfo.workstatus
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.password
     *
     * @return the value of userinfo.password
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.password
     *
     * @param password the value for userinfo.password
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.email
     *
     * @return the value of userinfo.email
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.email
     *
     * @param email the value for userinfo.email
     *
     * @mbggenerated Fri Aug 03 14:32:13 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }
}