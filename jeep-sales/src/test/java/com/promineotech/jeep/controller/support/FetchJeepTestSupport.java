package com.promineotech.jeep.controller.support;

import org.springframework.web.client.RestTemplate;

public class FetchJeepTestSupport extends BaseTest{

	protected RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
