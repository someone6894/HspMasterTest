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
@Controller // �� Ŭ������ Controller �� ���� �ǹ�
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) { // MODEL ��ü �ȿ� setAttribute ���� �����ε�
			// /��� ���� �ּҿ� ���Ͽ� get������� ��û �Ǿ��� �� �Ʒ��� �޼��尡 ȣ�� �Ǿ� ����.
		System.out.println("�� �޼��尡 �����!");
		
		
		logger.info("Welcome home! The client locale is {}.", locale); // INFO �α׸� ���

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate ); // ��ܱ��� �ư� ����. home.jsp�� ���� serverTime ���Ÿ� �� �� �ִ�.
														  // Model ��ü�� serverTime �̶�� �̸����� formattedDate�� ���ε�

		return "home"; // home ���ڿ� ��ȯ - home�̶�� �̸��� view �ܿ��� ã�� �׸��� ������ �̵�
	}
	
}
