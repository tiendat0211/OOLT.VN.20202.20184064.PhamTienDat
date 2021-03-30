import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;



public class NoGarbage {
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        FileReader fr = new FileReader("D:\\OOP-Homework\\OOLT.VN.20202.20184064.PhamTienDat\\java\\OtherProjects\\Hust\\Soict\\Hedspi\\garbage\\src\\Data.txt");
        Scanner inFile = new Scanner(fr);

		StringBuffer line =  new StringBuffer();

        // Read lines from the file till end of file
        while (inFile.hasNext())
        {
            // Read the next line.
            line.append(inFile.nextLine());
            line.append("\n");
            
        }
		System.out.println( line );
        // Close the file.
        inFile.close();
    }
}
