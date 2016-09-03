package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SendPackScanVO;
import com.ane.report.operation.scan.service.ISendPackScanService;


/**
 * 发包扫描管理
 * @author Administrator
 *
 */
@Controller
public class SendPackScanController extends BaseController{
	@Resource
	private ISendPackScanService sendPackScanService;
	/**
	 * 返回页面地址，跳入页面
	 * @return
	 */
	@RequestMapping(value="/toSendPackScanPage")
	public String toSendScanPage(){
		return "opreation/scan/sendPack_Scan";
	}
	/**
	 * 分页查询发包扫描
	 * @param sendPackScan
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/querySendPackScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<SendPackScanVO> querySendPackScan(SendPackScanVO sendPackScan,Integer pageNum,Integer pageSize){
		PagedResult<SendPackScanVO> pageResult = null;
		pageResult =  sendPackScanService.querySendPackByPage(sendPackScan, pageNum, pageSize);
		return pageResult;
	}

}
