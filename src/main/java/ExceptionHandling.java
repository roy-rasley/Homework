import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

    public static void Main(String[] args){

        try{
            FileReader file =new FileReader("someFile.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
