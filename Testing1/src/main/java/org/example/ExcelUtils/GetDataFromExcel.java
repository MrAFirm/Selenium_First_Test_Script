package org.example.ExcelUtils;

import org.example.Utils.StaticDatas;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GetDataFromExcel
{
    public ArrayList getExcel(int c) throws IOException
    {
        String f = StaticDatas.exeData;

        File fl = new File(f);
        FileInputStream fis = new FileInputStream(fl);

        XSSFWorkbook w = new XSSFWorkbook(fis);

        XSSFSheet sheet = w.getSheet("TestCase1");

        Iterator r = sheet.rowIterator();

        r.next();
        ArrayList<String> arr = new ArrayList();

        while(r.hasNext())
        {
            Row rw = (Row)r.next();

            Cell cell = rw.getCell(c);

            String cellValue = cell.getStringCellValue();

            arr.add(cellValue);

            arr.add(((Row) r.next()).getCell(c).getStringCellValue());
        }
        System.out.println("Get all cell data in the list : " + arr);
        return arr;
    }
    public void getFile(int j){
    }
}
