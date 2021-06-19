package com.deepak.apchepoi.example.exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Created by deepak on 19-06-2021.
 */
public class WriteFormulaCell2 {

    public static void main(String[] args) throws IOException {

        String path="src\\main\\resources\\datafiles\\books.xlsx";

        FileInputStream fis=new FileInputStream(path);

        XSSFWorkbook workbook=new XSSFWorkbook(fis);

        XSSFSheet sheet=workbook.getSheetAt(0);

        sheet.getRow(7).getCell(2).setCellFormula("SUM(C2:C6)");

        fis.close();

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);

        workbook.close();
        fos.close();

        System.out.println("Done!!!");

    }
}
