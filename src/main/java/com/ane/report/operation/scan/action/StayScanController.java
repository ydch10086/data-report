package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.StayWarehouseVO;
import com.ane.report.operation.scan.service.IStayScanService;
@Controller
public class StayScanController extends BaseController{
	@Resource
	private IStayScanService stayScanService;

	/**
	 * 留仓扫描controller
	 */
	@RequestMapping(value = "/toStayScanPage")
	public String toArrivePage() {
		return "opreation/scan/stayScan";
	}

	@RequestMapping(value = "/queryStayScan", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<StayWarehouseVO> query(StayWarehouseVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<StayWarehouseVO> pageResult = stayScanService
				.queryByPage(entity, pageNum, pageSize);
		System.out.println(entity.toString());
		return pageResult;
	}
}
