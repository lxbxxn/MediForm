package kr.or.ddit.ppt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/mediform/ppt")
public class PPTController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		
		log.info("ppt 컨트롤러 실행");
		return "PPT/home";
	}
	@RequestMapping(value = "/qanda", method = RequestMethod.GET)
	public String main() {
		
		log.info("ppt 컨트롤러 실행");
		return "PPT/QandA";
	}

}
