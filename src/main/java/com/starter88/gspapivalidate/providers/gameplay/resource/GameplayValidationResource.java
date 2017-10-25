package com.starter88.gspapivalidate.providers.gameplay.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starter88.gspapivalidate.providers.gameplay.service.GameplayValidationService;

@RestController
public class GameplayValidationResource {

	private GameplayValidationService service;

	public GameplayValidationResource(GameplayValidationService service) {
		this.service = service;
	}

	@GetMapping("/validate/gameplay/validate")
	public String validate(@RequestParam(value = "ticket", required = false) String ticket) throws Exception {
		return service.validate(ticket);
	}

}
