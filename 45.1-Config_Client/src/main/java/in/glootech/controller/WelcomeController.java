package in.glootech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WelcomeController {
	
	@Value("${msg:error}")
	public String msg;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return msg;
	}
}
