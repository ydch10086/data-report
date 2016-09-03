package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.Arrive;
import com.ane.report.operation.scan.service.IArriveService;

@Controller
public class ArriveController extends BaseController{
	@Resource
	private IArriveService arriveService;

	/**
	 * 到件扫描controller
	 */
	@RequestMapping(value = "/toArriveScanPage")
	public String toArrivePage() {
		return "opreation/scan/arrive";
	}

	@RequestMapping(value = "/queryArrive", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<Arrive> query(Arrive arrive, Integer pageNum,
			Integer pageSize) {
		PagedResult<Arrive> pageResult = arriveService
				.queryByPage(arrive, pageNum, pageSize);
		return pageResult;
	}
}
