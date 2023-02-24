package cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel {
    String filePath = "SampleData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void writeExcel() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");
        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salaryCell1 = sheet.getRow(1).createCell(3);
        salaryCell1.setCellValue(4000);
        XSSFCell salaryCell2 = sheet.getRow(2).createCell(3);
        salaryCell2.setCellValue(4500);
        XSSFCell salaryCell3 = sheet.getRow(3).createCell(3);
        salaryCell3.setCellValue(5000);
        XSSFCell salaryCell4 = sheet.getRow(4).createCell(3);
        salaryCell4.setCellValue(5500);

        //TODO: change Hamza's last name Tekin

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Hamza")){
                sheet.getRow(i).getCell(1).setCellValue("Oturak");
                sheet.getRow(i).getCell(0).setCellValue("Hamza Mert");
            }
        }

    // FileInputStream we use for reading the file
    // FileOutputStream we use for writing/save changes the file

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);
    // close all
    fileInputStream.close();
    fileOutputStream.close();
    workbook.close();





    }


}
