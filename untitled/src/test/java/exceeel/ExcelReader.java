package exceeel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReader {


    public ArrayList<String> dataDriven(String testcases) throws IOException {

        ArrayList<String> arrayList = new ArrayList<String>();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\PC\\Desktop\\udemi\\untitled\\src\\test\\resources\\book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        int sheets = workbook.getNumberOfSheets();
        for(int i = 0; i<sheets;i++){

            if(workbook.getSheetName(i).equalsIgnoreCase("testdata")){

                XSSFSheet sheet = workbook.getSheetAt(i);
                //System.out.println(sheet + ": --------------" + workbook.getSheetName(i).toString());
                Iterator<Row> row = sheet.iterator();
                Row firstrow = row.next();
                Iterator<Cell> ce = firstrow.cellIterator();
                int k = 0;
                int column = 0;
                while (ce.hasNext()){
                    Cell value = ce.next();
                    //System.out.println(value.getStringCellValue());
                    if(value.getStringCellValue().equalsIgnoreCase("Login")){
                        column=k;
                    }
                    k++;
                }
                //System.out.println(column);
                //Выше читали все колонкки







                Iterator<Row> rows = sheet.iterator();
                while (rows.hasNext()){
                    Row r = rows.next();
                    if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcases)) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()){
                            Cell c = cv.next();
                            if(c.getCellType() == CellType.STRING){
                                arrayList.add(c.getStringCellValue());
                            }else {
                                arrayList.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                            }
                            //System.out.println(cv.next().getStringCellValue());

                        }
                    }
                }
            }


        }

        return arrayList;
    }


    @Test
    public void testPrikol() throws IOException {
        ArrayList<String> data = dataDriven("Login");

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

    }

}
