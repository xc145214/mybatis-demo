package com.xc.model;

import java.util.Date;

public class IdentificationLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.origin_id
     *
     * @mbggenerated
     */
    private String originId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.user_real_name
     *
     * @mbggenerated
     */
    private String userRealName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.birthday
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.cert_type
     *
     * @mbggenerated
     */
    private Integer certType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.cert_number
     *
     * @mbggenerated
     */
    private String certNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.province
     *
     * @mbggenerated
     */
    private Integer province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.city
     *
     * @mbggenerated
     */
    private Integer city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.county
     *
     * @mbggenerated
     */
    private Integer county;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.folk
     *
     * @mbggenerated
     */
    private Integer folk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.log_date
     *
     * @mbggenerated
     */
    private Date logDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.from_ip
     *
     * @mbggenerated
     */
    private String fromIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.verify_code
     *
     * @mbggenerated
     */
    private String verifyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.STATUS
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_identification_log.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.origin_id
     *
     * @return the value of uc_identification_log.origin_id
     *
     * @mbggenerated
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.origin_id
     *
     * @param originId the value for uc_identification_log.origin_id
     *
     * @mbggenerated
     */
    public void setOriginId(String originId) {
        this.originId = originId == null ? null : originId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.user_id
     *
     * @return the value of uc_identification_log.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.user_id
     *
     * @param userId the value for uc_identification_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.user_real_name
     *
     * @return the value of uc_identification_log.user_real_name
     *
     * @mbggenerated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.user_real_name
     *
     * @param userRealName the value for uc_identification_log.user_real_name
     *
     * @mbggenerated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.sex
     *
     * @return the value of uc_identification_log.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.sex
     *
     * @param sex the value for uc_identification_log.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.birthday
     *
     * @return the value of uc_identification_log.birthday
     *
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.birthday
     *
     * @param birthday the value for uc_identification_log.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.cert_type
     *
     * @return the value of uc_identification_log.cert_type
     *
     * @mbggenerated
     */
    public Integer getCertType() {
        return certType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.cert_type
     *
     * @param certType the value for uc_identification_log.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(Integer certType) {
        this.certType = certType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.cert_number
     *
     * @return the value of uc_identification_log.cert_number
     *
     * @mbggenerated
     */
    public String getCertNumber() {
        return certNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.cert_number
     *
     * @param certNumber the value for uc_identification_log.cert_number
     *
     * @mbggenerated
     */
    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber == null ? null : certNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.province
     *
     * @return the value of uc_identification_log.province
     *
     * @mbggenerated
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.province
     *
     * @param province the value for uc_identification_log.province
     *
     * @mbggenerated
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.city
     *
     * @return the value of uc_identification_log.city
     *
     * @mbggenerated
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.city
     *
     * @param city the value for uc_identification_log.city
     *
     * @mbggenerated
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.county
     *
     * @return the value of uc_identification_log.county
     *
     * @mbggenerated
     */
    public Integer getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.county
     *
     * @param county the value for uc_identification_log.county
     *
     * @mbggenerated
     */
    public void setCounty(Integer county) {
        this.county = county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.folk
     *
     * @return the value of uc_identification_log.folk
     *
     * @mbggenerated
     */
    public Integer getFolk() {
        return folk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.folk
     *
     * @param folk the value for uc_identification_log.folk
     *
     * @mbggenerated
     */
    public void setFolk(Integer folk) {
        this.folk = folk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.remark
     *
     * @return the value of uc_identification_log.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.remark
     *
     * @param remark the value for uc_identification_log.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.log_date
     *
     * @return the value of uc_identification_log.log_date
     *
     * @mbggenerated
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.log_date
     *
     * @param logDate the value for uc_identification_log.log_date
     *
     * @mbggenerated
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.from_ip
     *
     * @return the value of uc_identification_log.from_ip
     *
     * @mbggenerated
     */
    public String getFromIp() {
        return fromIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.from_ip
     *
     * @param fromIp the value for uc_identification_log.from_ip
     *
     * @mbggenerated
     */
    public void setFromIp(String fromIp) {
        this.fromIp = fromIp == null ? null : fromIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.verify_code
     *
     * @return the value of uc_identification_log.verify_code
     *
     * @mbggenerated
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.verify_code
     *
     * @param verifyCode the value for uc_identification_log.verify_code
     *
     * @mbggenerated
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.STATUS
     *
     * @return the value of uc_identification_log.STATUS
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.STATUS
     *
     * @param status the value for uc_identification_log.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_identification_log.address
     *
     * @return the value of uc_identification_log.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_identification_log.address
     *
     * @param address the value for uc_identification_log.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}