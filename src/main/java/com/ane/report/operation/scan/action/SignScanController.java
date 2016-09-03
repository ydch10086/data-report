package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SignScanVO;
import com.ane.report.operation.scan.service.ISignScanService;

/**
 * 签收扫描管理
 * @author Administrator
 *
 */
@Controller
public class SignScanController extends BaseController{
	@Resource
	private ISignScanService signScanService;
	/**
	 * 返回页面地址，跳入页面
	 * @return
	 */
	@RequestMapping(value="/toSignScanPage")
	public String toSendScanPage(){
		return "opreation/scan/sign_Scan";
	}
	/**
	 * 分页查询签收扫描信息
	 * @param signScan
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/querySignScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<SignScanVO> querySignScan(SignScanVO signScan,Integer pageNum,Integer pageSize){
		PagedResult<SignScanVO> pageResult =null;
		pageResult =  signScanService.querySignScanByPage(signScan, pageNum, pageSize);
		return pageResult;
	}

}
