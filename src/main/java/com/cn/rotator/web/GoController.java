package com.cn.rotator.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.inject.Inject;

@Controller
public class GoController {
	
	private RotatorService rotatorService;
	
	@Inject
	public GoController(RotatorService rotatorService) {
		this.rotatorService = rotatorService;
	}
	
	@RequestMapping(value="/Go/{rid}" method = RequestMethod.GET)
	public void go(@PathVariable("rid") long rotatorId, Model model) {
		String url = rotatorService.getDestinationPath(rotatorId);
		// redirect
	}
	
	
}
