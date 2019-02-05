package com.sssm.demosite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sssm.demosite.model.SearchQuery;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView land() {
		SearchQuery searchQuery = new SearchQuery();
		ModelAndView mav = new ModelAndView("homepage", "searchQuery", searchQuery);
		return mav;
	}
	
	@PostMapping("/search")
	public ModelAndView search(SearchQuery searchQuery) {
		System.out.println("SEARCH");
		System.out.println(searchQuery.toString());
		ModelAndView mav = new ModelAndView("homepage");
		return mav;
	}

}
