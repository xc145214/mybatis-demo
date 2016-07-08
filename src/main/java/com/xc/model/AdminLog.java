package com.xc.model;

import java.util.Date;

public class AdminLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.meta_id
     *
     * @mbggenerated
     */
    private Long metaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.meta_value
     *
     * @mbggenerated
     */
    private String metaValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.operator_user_id
     *
     * @mbggenerated
     */
    private Long operatorUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.target_user_id
     *
     * @mbggenerated
     */
    private Long targetUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.approve_user_id
     *
     * @mbggenerated
     */
    private Long approveUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.from_id
     *
     * @mbggenerated
     */
    private String fromId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.from_ssid
     *
     * @mbggenerated
     */
    private String fromSsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_log.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.id
     *
     * @return the value of admin_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.id
     *
     * @param id the value for admin_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.meta_id
     *
     * @return the value of admin_log.meta_id
     *
     * @mbggenerated
     */
    public Long getMetaId() {
        return metaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.meta_id
     *
     * @param metaId the value for admin_log.meta_id
     *
     * @mbggenerated
     */
    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.meta_value
     *
     * @return the value of admin_log.meta_value
     *
     * @mbggenerated
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.meta_value
     *
     * @param metaValue the value for admin_log.meta_value
     *
     * @mbggenerated
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.operator_user_id
     *
     * @return the value of admin_log.operator_user_id
     *
     * @mbggenerated
     */
    public Long getOperatorUserId() {
        return operatorUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.operator_user_id
     *
     * @param operatorUserId the value for admin_log.operator_user_id
     *
     * @mbggenerated
     */
    public void setOperatorUserId(Long operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.target_user_id
     *
     * @return the value of admin_log.target_user_id
     *
     * @mbggenerated
     */
    public Long getTargetUserId() {
        return targetUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.target_user_id
     *
     * @param targetUserId the value for admin_log.target_user_id
     *
     * @mbggenerated
     */
    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.approve_user_id
     *
     * @return the value of admin_log.approve_user_id
     *
     * @mbggenerated
     */
    public Long getApproveUserId() {
        return approveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.approve_user_id
     *
     * @param approveUserId the value for admin_log.approve_user_id
     *
     * @mbggenerated
     */
    public void setApproveUserId(Long approveUserId) {
        this.approveUserId = approveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.type
     *
     * @return the value of admin_log.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.type
     *
     * @param type the value for admin_log.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.from_id
     *
     * @return the value of admin_log.from_id
     *
     * @mbggenerated
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.from_id
     *
     * @param fromId the value for admin_log.from_id
     *
     * @mbggenerated
     */
    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.from_ssid
     *
     * @return the value of admin_log.from_ssid
     *
     * @mbggenerated
     */
    public String getFromSsid() {
        return fromSsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.from_ssid
     *
     * @param fromSsid the value for admin_log.from_ssid
     *
     * @mbggenerated
     */
    public void setFromSsid(String fromSsid) {
        this.fromSsid = fromSsid == null ? null : fromSsid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.create_time
     *
     * @return the value of admin_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.create_time
     *
     * @param createTime the value for admin_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.remark
     *
     * @return the value of admin_log.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.remark
     *
     * @param remark the value for admin_log.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_log.status
     *
     * @return the value of admin_log.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_log.status
     *
     * @param status the value for admin_log.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}