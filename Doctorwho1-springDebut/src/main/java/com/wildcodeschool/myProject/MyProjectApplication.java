package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {


		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Doctor who (game of thrones is better): <ul>" +
				"<li><a href='/doctor/1'>Jodie Whittaker</a></li>" +
				"<li><a href='/doctor/2'>David Tennant</a></li>" +
				"<li><a href='/doctor/3'>Matt Smith</a></li>" +
				"<li><a href='/doctor/4'>Bradley Walsh</a></li>" +
		"</ul>";
	}

	@GetMapping("/doctor/1")
	@ResponseBody
	public String index1() {
		return "Jodie Whittaker";
	}

	@GetMapping("/doctor/2")
	@ResponseBody
	public String index2() {
		return "David Tennant";
	}

	@GetMapping("/doctor/3")
	@ResponseBody
	public String index3() {
		return "Matt Smith";
	}

	@GetMapping("/doctor/4")
	@ResponseBody
	public String index4() {
		return "Bradley Walsh";
	}

}
