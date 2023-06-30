package com.devops.integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerGitJenkinsIntegration {

	@GetMapping("/integration")
	public String DockerGitJenkinsIntegrationData() {
		return "DockerGitJenkinsIntegration is successfully Done"; 
	}
	@GetMapping("/sample")
	public String DockerGitJenkinsIntegrationsample() {
		return "DockerGitJenkinsIntegration is successfully Done again"; 
	}
}
