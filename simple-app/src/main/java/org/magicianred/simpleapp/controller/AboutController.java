package org.magicianred.simpleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

		@GetMapping("/about")
		public String index(Model model) {
			
			return "about";
		}
}
