package com.projects.humanbodytest.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public ArrayList<Question> readQuestions(String filePath) throws EncryptedDocumentException, IOException {
		
		Workbook workbook = WorkbookFactory.create(new File(filePath));
		
		// Get first sheet
		Sheet mainSheet = workbook.getSheetAt(0);
		
		// Get excel data as string
		
		DataFormatter dataFormatter = new DataFormatter();
		
		return null;
		
	}
}
