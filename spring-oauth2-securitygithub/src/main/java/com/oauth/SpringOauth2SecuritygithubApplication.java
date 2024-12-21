package com.oauth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
public class SpringOauth2SecuritygithubApplication {

	
	@GetMapping
	public String getUseInfoFromGitHub(Principal principal) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(principal);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2SecuritygithubApplication.class, args);
	}

}
