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
		return "Jodie Whittaker: <ul><li><a href='https://broadchurch.fandom.com/fr/wiki/Jodie_Whittaker'>En blonde</a></li>" +
				"<li><a href='https://www.countryandtownhouse.co.uk/culture/rurbanist-jodie-whittaker-qa/'>En brune</a></li>" +
				"<li><a href='https://cdn-static.denofgeek.com/sites/denofgeek/files/styles/main_wide/public/2017/04/jodie_whittaker_broadchurch.jpg?itok=T3rqVUAr'>En rousse</a></li>" +
				"<li><a href='https://www.deguisetoi.fr/p-221747-deguisement-infirmiere-femme.html?type=product'>En infirmière</a></li>" +
				"</ul>";
	}

	@GetMapping("/doctor/1")
	@ResponseBody
	public String index1() {
		return "Jodie Whittaker en blonde";
	}

	@GetMapping("/doctor/2")
	@ResponseBody
	public String index2() {
		return "Jodie Whittaker en brune";
	}

	@GetMapping("/doctor/3")
	@ResponseBody
	public String index3() {
		return "Jodie Whittaker en rousse";
	}

	@GetMapping("/doctor/4")
	@ResponseBody
	public String index4() {
		return "Jodie Whittaker en infirmière";
	}

}
