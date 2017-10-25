package com.starter88.gspapivalidate.providers.cmd.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starter88.gspapivalidate.providers.cmd.service.CmdValidationService;

@RestController
public class CmdValidationResource {
	
	private CmdValidationService service;

	@Autowired
	public CmdValidationResource(CmdValidationService service) {
		this.service = service;
	}

	@GetMapping("/validate/cmd/validate_token")
	@ResponseBody public String validate(@RequestParam(value="token" , required = true) String token) throws Exception {
		return service.validate(token);	
	}
}
