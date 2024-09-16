package com.socgen.waleed.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/greeting")
	String getGreeting() {
		return "Hey there, howdy?";
	}
	
	@RequestMapping("/")
	String getMessage() {
		return "We are doing Spring boot now...";
	}

}

//	Participants rest api
//		- /participants - Get all participants - Get
//		- /participants/id - Get a participant by id - Get
//		- /participants - Add a new participant - Post
//		- /participants/id - Update participant by id - Put
//		- /participants/id - Delete participant by id - Delete

















