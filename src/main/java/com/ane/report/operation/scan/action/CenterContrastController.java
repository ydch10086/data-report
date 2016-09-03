package com.ane.report.operation.scan.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.CenterContrastVO;
import com.ane.report.operation.scan.service.ICenterContrastService;
/***
 * 中心对比监控
 * @author qiugy
 *
 */
@Controller
public class CenterContrastController extends BaseController{
	@Resource
	private ICenterContrastService centerContrastService;

	@RequestMapping(value = "/toCenterContrast")
	public String toArrivePage() {
		return "opreation/scan/centerContrast";
	}

	@RequestMapping(value = "/queryLoadcar", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<CenterContrastVO> queryLoadcar(CenterContrastVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<CenterContrastVO> pageResult = centerContrastService
				.queryLoadcar(entity, pageNum, pageSize);
		return pageResult;
	}
	
	@RequestMapping(value = "/queryUnloadcar", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<CenterContrastVO> queryUnloadcar(CenterContrastVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<CenterContrastVO> pageResult = centerContrastService
				.queryUnloadcar(entity, pageNum, pageSize);
		return pageResult;
	}
}
