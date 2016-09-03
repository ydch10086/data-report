package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SendScanVO;
import com.ane.report.operation.scan.service.ISendScanService;


/**
 * 发件扫描管理
 * @author Administrator
 *
 */
@Controller
public class SendScanController extends BaseController{
	@SuppressWarnings("unused")
	private final static Logger LOGGER = LoggerFactory.getLogger(SendScanController.class);
	@Resource
	private ISendScanService sendScanService;
	/**
	 * 返回页面地址，跳入页面
	 * @return
	 */
	@RequestMapping(value="/toSendScanPage")
	public String toSendScanPage(){
		return "opreation/scan/send_Scan";
	}
	/**
	 * 分页查询发件扫描
	 * @param sendScan
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/querySendScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<SendScanVO> querySendScan(SendScanVO sendScan,Integer pageNum,Integer pageSize){
		PagedResult<SendScanVO> pageResult = null; 
		pageResult =  sendScanService.querySendScanByPage(sendScan, pageNum, pageSize);
		return pageResult;
	}

}
