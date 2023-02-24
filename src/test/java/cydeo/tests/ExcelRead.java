package cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        System.out.println("sheet.getRow(1).getCell(1) = " + sheet.getRow(1).getCell(1)); // sheet.getRow(1).getCell(1) = Mert
        System.out.println("sheet.getRow(1).getCell(1) = " + sheet.getRow(2).getCell(0)); // sheet.getRow(1).getCell(1) = Gulcan
      //  System.out.println("sheet.getRow(1).getCell(1) = " + sheet.getRow(3));  did not work

        int usedRows=sheet.getPhysicalNumberOfRows(); // counting from 1 => usedRows = 5
        System.out.println("usedRows = " + usedRows);
        int lastUsedRows = sheet.getLastRowNum(); // counting from 0 => lastUsedRows = 4
        System.out.println("lastUsedRows = " + lastUsedRows);

        //TODO: create a logic to print Gulcan name
        for(int rownumber = 0; rownumber <usedRows; rownumber++){
            if(sheet.getRow(rownumber).getCell(0).toString().equals("Gulcan")){
                System.out.println(sheet.getRow(rownumber).getCell(0));
            }
        }

        // TODO: create a logic to print Ali's job ID

        for(int rownumber = 0; rownumber <usedRows; rownumber++){
            if(sheet.getRow(rownumber).getCell(0).toString().equals("Ali")){
                System.out.println(sheet.getRow(rownumber).getCell(0)+" : "
                        + sheet.getRow(rownumber).getCell(2));
            }
        }
    }

}
