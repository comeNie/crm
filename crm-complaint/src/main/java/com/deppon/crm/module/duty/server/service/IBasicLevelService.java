package com.deppon.crm.module.duty.server.service;

import java.math.BigDecimal;
import java.util.List;

import com.deppon.crm.module.duty.shared.domain.BasicBusScopeVO;
import com.deppon.crm.module.duty.shared.domain.BasicInfo;
import com.deppon.crm.module.duty.shared.domain.BasicLevel;
import com.deppon.crm.module.duty.shared.domain.BasicSearchCondition;
/**
 * 
 * <p>
 * Description:基础层级<br />
 * </p>
 * @title IComplaintService.java
 * @package com.deppon.crm.module.complaint.server.service 
 * @author ouy
 * @version 0.1 2012-4-12
 */
public interface IBasicLevelService {
	
	

	/**
	 * <p>
	 * Description: 新基础资料--查询基础资料数据<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-22
	 * @param bsc
	 * @param rb
	 */
	public List<BasicInfo> searchBasicInfo(BasicSearchCondition bsc,int start,int limit);
	/**
	 * <p>
	 * Description: 新基础资料--查询基础资料总计<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-22
	 * @param bsc
	 */
	public int searchCountBasicInfo(BasicSearchCondition bsc);
	/**
	 * <p>
	 * Description: 新基础资料--新增业务项或业务范围<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param basicLevel
	 * @param rb
	 */
	public int saveBasicLevel(BasicLevel basicLevel);
	/**
	 * <p>
	 * Description: 新基础资料--根据ID修改业务项或业务范围<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param basicLevel
	 * @param int
	 */
	public int updateBasicLevelById(BasicLevel basicLevel);
	/**
	 * <p>
	 * Description: 新基础资料--根据parentID修改业务范围<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param basicLevel
	 * @param int
	 */
	public int updateBasicLevelByParentId(BasicLevel basicLevel);
	/**
	 * <p>
	 * Description: 新基础资料--查询出业务范围及对应的业务类型用于修改基础资料页面<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param BasicBusScopeVO
	 * @param BasicBusScopeVO
	 */
	public List<BasicBusScopeVO> searchBasicBusScopeVO(BasicBusScopeVO bbs);
	/**
	 * <p>
	 * Description: 新基础资料--删除业务项<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-26
	 * @param List<String> 
	 * @param int
	 */
	public int deleteBusItemByIds(List<String> ids);
	/**
	 * <p>
	 * Description: 新基础资料--根据业务范围ID删除业务范围<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-26
	 * @param List<String> 
	 * @param int
	 */
	public int deleteBusScopeById(String id);
	/**
	 * <p>
	 * Description: 新基础资料--根据上报类型查询业务项<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param reportType
	 */
	public List<BasicInfo> searchBusItemByType(String reportType);
	/**
	 * <p>
	 * Description: (只有有业务类型才能查出的业务项)新基础资料--根据上报类型查询业务项<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-4-19
	 * @param reportType
	 */
	public List<BasicInfo> searchBusItemByTypeOnly(String reportType);
	/**
	 * <p>
	 * Description: 新基础资料--根据业务项ID查询业务范围<br />
	 * </p>
	 * @author ZhouYuan
	 * @version 0.1 2013-2-23
	 * @param busItemId
	 */
	public List<BasicInfo> searchBusScopeByBusItemId(String busItemId);
	
	/**
	 * <p>
	 * Description: 查询业务范围<br />
	 * </p>
	 * @author zhangbin
	 * @version 0.1 2013-3-11
	 * @param busItemId
	 */
	List<BasicLevel> selectBusScope(BigDecimal parentid);
	/**
	 * <p>
	 * Description:只查询有业务类型的业务范围<br />
	 * </p>
	 * @author zhangbin
	 * @version 0.1 2013-4-19
	 * @param busItemId
	 */
	public List<BasicLevel> selectBusScopeOnly(BigDecimal parentid);
}
