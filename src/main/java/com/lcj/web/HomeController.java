package com.lcj.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 이 클래스가 Controller 단 임을 의미
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) { // MODEL 객체 안에 setAttribute 같은 역할인데
			// /라는 매핑 주소에 대하여 get방식으로 요청 되었을 때 아래의 메서드가 호출 되어 진다.
		System.out.println("이 메서드가 실행됨!");
		
		
		logger.info("Welcome home! The client locale is {}.", locale); // INFO 로그를 출력

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate ); // 뷰단까지 싣고 간다. home.jsp에 보면 serverTime 쓴거를 볼 수 있다.
														  // Model 객체에 serverTime 이라는 이름으로 formattedDate를 바인딩

		return "home"; // home 문자열 반환 - home이라는 이름의 view 단에서 찾아 그리로 페이지 이동
	}
	
}
