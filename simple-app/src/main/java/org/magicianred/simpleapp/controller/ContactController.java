package org.magicianred.simpleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

		@GetMapping("/contact")
		public String index(Model model) {
			
			return "contact";
		}

		@PostMapping("/contact-confirm")
		public String confirm(Model model) {
			
			return "contact-confirm";
		}
}
