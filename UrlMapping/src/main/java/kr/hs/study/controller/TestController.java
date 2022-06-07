package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub2") //공통 되는 부분 표시
public class TestController {
	/*
	 * @GetMapping("/sub2/test5") public String test5() { return "index"; }
	 * 
	 * @GetMapping("/sub2/test6") public String test6() { return "index"; }
	 * 
	 * @GetMapping("/sub2/test7") public String test7() { return "index"; }
	 */
	@GetMapping("/test5")
	public String test5() {return "index";}

	@GetMapping("/test6")
	public String test6() {return "index";}

	@GetMapping("/test7")
	public String test7() {return "index";}
}
