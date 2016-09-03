package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.Receive;
import com.ane.report.operation.scan.service.IReceiveScanService;
@Controller
public class ReceiveScanController extends BaseController{
	@Resource
	private IReceiveScanService receiveScanService;

	/**
	 * 收件扫描controller
	 */
	@RequestMapping(value = "/toReceiveScanPage")
	public String toArrivePage() {
		return "opreation/scan/receive";
	}

	@RequestMapping(value = "/queryReceiveScan", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<Receive> query(Receive entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<Receive> pageResult = receiveScanService
				.queryByPage(entity, pageNum, pageSize);
		return pageResult;
	}
}
