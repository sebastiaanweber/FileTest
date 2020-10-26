package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

@Service
public class FileService {

	@Value("${vektis.backups.path}")
	private String pathName;

	private String fileName = "test.txt";

	private FileSystemResource fileSystemResource;

	public String filePath() {
		setFileSystemResource();
		return fileSystemResource.toString();
	}

	public String fileContent() throws IOException {
		return new String(Files.readAllBytes(Paths.get(fileSystemResource.getPath())));
	}

	private void setFileSystemResource() {
		fileSystemResource = new FileSystemResource(pathName + fileName);
	}

}
