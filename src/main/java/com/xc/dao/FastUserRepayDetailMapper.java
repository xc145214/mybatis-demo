package com.xc.dao;

import com.xc.model.FastUserRepayDetail;

public interface FastUserRepayDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    int insert(FastUserRepayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    int insertSelective(FastUserRepayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    FastUserRepayDetail selectByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastUserRepayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_fast_user_repay_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastUserRepayDetail record);
}