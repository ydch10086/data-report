package com.ane.report.operation.scan.action;


import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.DispatchScanVO;
import com.ane.report.operation.scan.service.IDispatchScanService;



@Controller
public class DispatchScanController extends BaseController{
	
	@Resource
	private IDispatchScanService dispatchScanService;
	/**
	 * 返回页面地址，跳入页面
	 * @return
	 */
	@RequestMapping(value="/toDispatchScanPage")
	public String toSendScanPage(){
		return "opreation/scan/dispatch_Scan";
	}
	/**
	 * 分页查询派件扫描
	 * @param dispatch
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/queryDispatchScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<DispatchScanVO> queryDispatchScan(DispatchScanVO dispatch,Integer pageNum,Integer pageSize){
		PagedResult<DispatchScanVO> pageResult =null;
		pageResult=  dispatchScanService.queryDispatchScanByPage(dispatch, pageNum, pageSize);
		return pageResult;
	}

}
