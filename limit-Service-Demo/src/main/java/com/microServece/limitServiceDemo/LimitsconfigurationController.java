package com.microServece.limitServiceDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServece.limitServiceDemo.bean.Limitconfiguration;

@RestController
public class LimitsconfigurationController {
@GetMapping("/limits")
public Limitconfiguration retriveLimitsFormConfiguration() {
	
	return new Limitconfiguration(10000, 10);
	
}

}
