package com.xc.dao;

import com.xc.model.Coin;

public interface CoinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    int insert(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    int insertSelective(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    Coin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Coin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uac_coin
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Coin record);
}