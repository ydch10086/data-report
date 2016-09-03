package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.SiteScanCompMonitorVO;

public interface ISiteScanCompMonitorDao {
	/**
	 * 查询“本站有收--本站未发”
	 * @param siteScanCompMonitorVO
	 * @return 
	 */
	List<SiteScanCompMonitorVO> querySiteScanCompMonitorYSWFByPage(SiteScanCompMonitorVO siteScanCompMonitorVO);
	/**
	 * 查询“本站有发--本站未收”
	 * @param siteScanCompMonitorVO
	 * @return 
	 */
	List<SiteScanCompMonitorVO> querySiteScanCompMonitorYFWSByPage(SiteScanCompMonitorVO siteScanCompMonitorVO);
	/**
	 * 查询“本站有到--本站未派”
	 * @param siteScanCompMonitorVO
	 * @return 
	 */
	List<SiteScanCompMonitorVO> querySiteScanCompMonitorYDWPByPage(SiteScanCompMonitorVO siteScanCompMonitorVO);
	/**
	 * 查询“本站有派--本站未签”
	 * @param siteScanCompMonitorVO
	 * @return 
	 */
	List<SiteScanCompMonitorVO> querySiteScanCompMonitorYPWQByPage(SiteScanCompMonitorVO siteScanCompMonitorVO);
	/**
	 * 查询“本站有签--本站未派”
	 * @param siteScanCompMonitorVO
	 * @return 
	 */
	List<SiteScanCompMonitorVO> querySiteScanCompMonitorYQWPByPage(SiteScanCompMonitorVO siteScanCompMonitorVO);
}
