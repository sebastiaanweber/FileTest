package com.example.demo.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FileService;

@RestController
@RequestMapping("/api")
public class DemoController {

	@Autowired
	FileService filService;

	@GetMapping("/file")
	public String getFilePath() {
		return filService.filePath();
	}

	@GetMapping("/content")
	public String getContent() throws IOException {
		return filService.fileContent();
	}
}
