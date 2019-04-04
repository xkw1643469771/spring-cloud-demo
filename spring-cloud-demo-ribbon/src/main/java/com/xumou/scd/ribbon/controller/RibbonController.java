package com.xumou.scd.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xumou.scd.ribbon.service.RibbonService;

@RestController
public class RibbonController {

	@Autowired
	RibbonService ribbonService;

	@RequestMapping("info")
	public String test() {
		return ribbonService.infoUseHystrix();
	}

}
