package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class FileService {

	@Value("${vektis.backups.path}")
	private String pathName;

	private String fileName = "test.txt";

	private Resource fileSystemResource;

	public String filePath() {
		setFileSystemResource();
		return fileSystemResource.toString();
	}

	public String fileContent() throws IOException {
		return new String(Files.readAllBytes(Paths.get(fileSystemResource.getURI())));
	}

	private void setFileSystemResource() {
		fileSystemResource = new FileSystemResource(pathName + fileName);
	}

}
