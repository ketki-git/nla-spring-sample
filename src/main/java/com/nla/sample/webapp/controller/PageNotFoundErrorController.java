package com.nla.sample.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageNotFoundErrorController {

	@RequestMapping(value = "/pageNotFound")
	public String handlePageNotFound() {
		// do something
		return "pageNotFound";
	}
}