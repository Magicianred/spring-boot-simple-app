package org.magicianred.simpleapp.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

import org.magicianred.simpleapp.model.HomeMessage;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) throws IOException {
		File resource = new ClassPathResource("data/pages/home.md").getFile();
	    String mdText = new String(Files.readAllBytes(resource.toPath()));

		model.addAttribute("mdText", mdText);
		
	    ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<HomeMessage>> typeReference = new TypeReference<List<HomeMessage>>(){};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/data/home_messages.json");
		
		try {
			List<HomeMessage> homeMessages = mapper.readValue(inputStream,typeReference);
			model.addAttribute("homeMessages", homeMessages);
		} catch (IOException e){
			System.out.println("Unable to retrieve data from JSON: " + e.getMessage());
		}
		
		return "home";
	}
}