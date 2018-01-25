package com.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.annotation.Log;

@Controller
@RequestMapping(value = "/guest")
public class GuestController extends BaseController{
	private static final Logger LOG = Logger.getLogger(GuestController.class);

	@Log(value = "进入guest", entry = { "parameter1=参数1","parameter2=参数2", })
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String guest(Model model,String parameter1,Integer parameter2) {
		LOG.info("进入guest的index");
		return "guest/guestIndex";
	}

	@Log(value = "进入guest，此处模拟抛出异常")
	@RequestMapping(value = "/guestError", method = RequestMethod.GET)
	public String guestError(Model model) {
		LOG.info("进入guest的index,guestError:此处模拟抛出异常");
		if(true) {
			throw new RuntimeException();
		}
		return "guest/guestIndex";
	}

}