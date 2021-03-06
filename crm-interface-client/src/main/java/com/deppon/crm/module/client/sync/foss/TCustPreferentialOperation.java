package com.deppon.crm.module.client.sync.foss;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.deppon.crm.module.client.sync.domain.CustTransationOperation.OperationFlg;

public class TCustPreferentialOperation implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2379330335584003150L;

	public OperationFlg getOperationFlg() {
		return operationFlg;
	}

	public void setOperationFlg(OperationFlg operationFlg) {
		this.operationFlg = operationFlg;
	}

	private OperationFlg operationFlg;
	
	/**
	 * 优惠所属类型(零担或快递)
	 */
	private String ftype;
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private Date fcreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATEUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fcreateuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTUPDATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private Date flastupdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTMODIFYUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal flastmodifyuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FCONTRACTID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fcontractid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FCHARGEREBATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fchargerebate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FAGENTGATHRATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fagentgathrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FINSUREDPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal finsuredpricerate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FRECEIVEPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal freceivepricerate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DEVELOP.T_CUST_PREFERENTIAL.FDELIVERYPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    private BigDecimal fdeliverypricerate;
    
    /**
     * 执行起始日期
     */
    private Date effectiveDate;
    /**
     * 执行到期日期
     */
    private Date expirationDate;

    public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FID
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FID
     *
     * @param fid the value for DEVELOP.T_CUST_PREFERENTIAL.FID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATETIME
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FCREATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public Date getFcreatetime() {
        return fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATETIME
     *
     * @param fcreatetime the value for DEVELOP.T_CUST_PREFERENTIAL.FCREATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATEUSERID
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FCREATEUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFcreateuserid() {
        return fcreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCREATEUSERID
     *
     * @param fcreateuserid the value for DEVELOP.T_CUST_PREFERENTIAL.FCREATEUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFcreateuserid(BigDecimal fcreateuserid) {
        this.fcreateuserid = fcreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTUPDATETIME
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FLASTUPDATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public Date getFlastupdatetime() {
        return flastupdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTUPDATETIME
     *
     * @param flastupdatetime the value for DEVELOP.T_CUST_PREFERENTIAL.FLASTUPDATETIME
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFlastupdatetime(Date flastupdatetime) {
        this.flastupdatetime = flastupdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTMODIFYUSERID
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FLASTMODIFYUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFlastmodifyuserid() {
        return flastmodifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FLASTMODIFYUSERID
     *
     * @param flastmodifyuserid the value for DEVELOP.T_CUST_PREFERENTIAL.FLASTMODIFYUSERID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFlastmodifyuserid(BigDecimal flastmodifyuserid) {
        this.flastmodifyuserid = flastmodifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCONTRACTID
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FCONTRACTID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFcontractid() {
        return fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCONTRACTID
     *
     * @param fcontractid the value for DEVELOP.T_CUST_PREFERENTIAL.FCONTRACTID
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFcontractid(BigDecimal fcontractid) {
        this.fcontractid = fcontractid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCHARGEREBATE
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FCHARGEREBATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFchargerebate() {
        return fchargerebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FCHARGEREBATE
     *
     * @param fchargerebate the value for DEVELOP.T_CUST_PREFERENTIAL.FCHARGEREBATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFchargerebate(BigDecimal fchargerebate) {
        this.fchargerebate = fchargerebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FAGENTGATHRATE
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FAGENTGATHRATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFagentgathrate() {
        return fagentgathrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FAGENTGATHRATE
     *
     * @param fagentgathrate the value for DEVELOP.T_CUST_PREFERENTIAL.FAGENTGATHRATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFagentgathrate(BigDecimal fagentgathrate) {
        this.fagentgathrate = fagentgathrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FINSUREDPRICERATE
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FINSUREDPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFinsuredpricerate() {
        return finsuredpricerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FINSUREDPRICERATE
     *
     * @param finsuredpricerate the value for DEVELOP.T_CUST_PREFERENTIAL.FINSUREDPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFinsuredpricerate(BigDecimal finsuredpricerate) {
        this.finsuredpricerate = finsuredpricerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FRECEIVEPRICERATE
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FRECEIVEPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFreceivepricerate() {
        return freceivepricerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FRECEIVEPRICERATE
     *
     * @param freceivepricerate the value for DEVELOP.T_CUST_PREFERENTIAL.FRECEIVEPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFreceivepricerate(BigDecimal freceivepricerate) {
        this.freceivepricerate = freceivepricerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FDELIVERYPRICERATE
     *
     * @return the value of DEVELOP.T_CUST_PREFERENTIAL.FDELIVERYPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public BigDecimal getFdeliverypricerate() {
        return fdeliverypricerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DEVELOP.T_CUST_PREFERENTIAL.FDELIVERYPRICERATE
     *
     * @param fdeliverypricerate the value for DEVELOP.T_CUST_PREFERENTIAL.FDELIVERYPRICERATE
     *
     * @mbggenerated Tue May 29 20:34:45 CST 2012
     */
    public void setFdeliverypricerate(BigDecimal fdeliverypricerate) {
        this.fdeliverypricerate = fdeliverypricerate;
    }

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
    

}
