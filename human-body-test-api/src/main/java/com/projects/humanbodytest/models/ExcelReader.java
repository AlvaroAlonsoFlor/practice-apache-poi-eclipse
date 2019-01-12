package com.projects.humanbodytest.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public ArrayList<String> readQuestions(String filePath) throws EncryptedDocumentException, IOException {
		
		//init result
		ArrayList<String> result;
		result = new ArrayList<>();
		
		Workbook workbook = WorkbookFactory.create(new File(filePath));
		
		// Get first sheet
		Sheet mainSheet = workbook.getSheetAt(0);
		
		// Get excel data as string
		
		DataFormatter dataFormatter = new DataFormatter();
		
		// Iterate over the rows and add answers
		for (Row row: mainSheet) {
			String answer = dataFormatter.formatCellValue(row.getCell(1));
			result.add(answer);	
            
        }		
		
		
		 workbook.close();
		
		return result;
		
	}
}
