package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.config.TestConfig;

@SpringBootTest 
@ContextConfiguration(classes = TestConfig.class)
class FileServiceTest {

	
	private String expectedPath = "file [c:\files\test.txt]";
	private String expectedContent = "test...";
	private FileService fileService = new FileService();

	
	@Test
	void testFilePath() {
		String path = fileService.filePath();
		assertEquals(expectedPath, path);
	}

	@Test
	void testFileContent() throws IOException {
		String content = fileService.fileContent();
		assertEquals(expectedContent, content);
		
	}

}
