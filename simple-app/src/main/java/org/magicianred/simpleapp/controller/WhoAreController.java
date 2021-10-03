package org.magicianred.simpleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WhoAreController {

		@GetMapping("/whoare")
		public String index(Model model) {
			
			return "whoare";
		}
}
