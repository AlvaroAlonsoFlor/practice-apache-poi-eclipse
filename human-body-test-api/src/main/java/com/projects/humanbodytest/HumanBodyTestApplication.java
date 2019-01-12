package com.projects.humanbodytest;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projects.humanbodytest.models.ExcelReader;

@SpringBootApplication
public class HumanBodyTestApplication {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelReader excelReader = new ExcelReader();
		
		ArrayList<String> questions = excelReader.readQuestions("./questions-data/database.xlsx");
		
		
		
		SpringApplication.run(HumanBodyTestApplication.class, args);
	}

}

