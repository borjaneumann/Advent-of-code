import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day01 {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("day01input.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        char up='(';
        char down=')';
        int count=0;

        while((i=br.read())!=-1){
            System.out.print((char)i);
            if ((char)i==up){
                count=count+1;
            }else if((char)i==down){
                count=count-1;
            }
            System.out.println(count);
        }
        br.close();
        fr.close();
    }
}
