package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.ArrivePack;
import com.ane.report.operation.scan.service.IArrivePackService;

@Controller
public class ArrivePackController extends BaseController {
	@Resource
	private IArrivePackService arrivePackService;

	/**
	 * 到包扫描controller
	 * @return
	 */
	@RequestMapping(value = "/toArrivePackScanPage")
	public String toArrivePage() {
		return "opreation/scan/arrivepack";
	}

	@RequestMapping(value = "/queryArrivePack", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<ArrivePack> queryArrive(ArrivePack entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<ArrivePack> pageResult = arrivePackService.queryByPage(
				entity, pageNum, pageSize);
		return pageResult;
	}
}
