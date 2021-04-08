import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day01_02 {

    public static void main (String[]args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\AMS\\Desktop\\Home\\code\\Challenges\\Advent-of-code\\java\\2015\\01\\02" +
                "\\day01input.txt");

        Scanner scnr = new Scanner(inputFile);
        String lineNumber;

        int count=0;
        while(scnr.hasNext()){
            lineNumber = scnr.next();
            char[] ch = lineNumber.toCharArray();
            char up='(';
            char down=')';
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]==up){
                    count=count+1;
                }else if (ch[i]==down){
                    count=count-1;
                }
                if (count==-1){
                    System.out.println("---------------");
                    System.out.println("basement: "+(i+1));
                }

                System.out.println("Final count is:" + count);
            }
        }
    }
}



