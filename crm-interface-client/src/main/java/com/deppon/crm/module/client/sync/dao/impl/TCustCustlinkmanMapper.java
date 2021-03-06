package com.deppon.crm.module.client.sync.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.deppon.crm.module.client.sync.domain.dto.TCustCustlinkman;

public interface TCustCustlinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to thresulte database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int countByExample(TCustCustlinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int deleteByExample(TCustCustlinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int deleteByPrimaryKey(Short fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int insert(TCustCustlinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int insertSelective(TCustCustlinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    List<TCustCustlinkman> selectByExample(TCustCustlinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    TCustCustlinkman selectByPrimaryKey(Short fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int updateByExampleSelective(@Param("record") TCustCustlinkman record, @Param("example") TCustCustlinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int updateByExample(@Param("record") TCustCustlinkman record, @Param("example") TCustCustlinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int updateByPrimaryKeySelective(TCustCustlinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVELOP.T_CUST_CUSTLINKMAN
     *
     * @mbggenerated Mon May 28 16:56:56 CST 2012
     */
    int updateByPrimaryKey(TCustCustlinkman record);
}