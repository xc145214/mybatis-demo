package com.xc.dao;

import com.xc.model.OverdueStatistics;

public interface OverdueStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    int insert(OverdueStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    int insertSelective(OverdueStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    OverdueStatistics selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OverdueStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_overdue_statistics
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OverdueStatistics record);
}