package org.Datatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDtest {

	public static void main(String[] args) throws IOException {

		File path = new File("C:\\Users\\WINDOW'S\\eclipse-workspace\\DatadrivernTest\\Excelsample\\shake.xlsx");

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		Sheet sheet = workbook.getSheet("Shake");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(0);

		System.out.println(cell);

	} 

}
