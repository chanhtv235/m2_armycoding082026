package ss8_mvc.util;

import org.w3c.dom.DOMStringList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    // ghi file
    //List<String> stringList: mỗi pt của list là một chuỗi mô tả các thông tin của một đối tượng
    // ví du:
    // try-catch Resource
    public static void writeStringListToCSVFile(String filePath, List<String> stringList,boolean append){
        // tạo đối tượng file từ đường dẫn
        File file = new File(filePath);
        try(
                FileWriter fileWriter = new FileWriter(file,append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.out.println("------lôi ghi file");
        }
    }
    public static List<String> readFileCSVToStringList(String filePath){
        List<String>  stringList = new ArrayList<>();
        File file = new File(filePath);
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
             String line = null;
              while ((line= bufferedReader.readLine())!=null){
                  stringList.add(line);
              }
        }catch (IOException e){
            System.out.println("------lôi ghi file");
        }

        return stringList;
    }
    // đọc file

}
