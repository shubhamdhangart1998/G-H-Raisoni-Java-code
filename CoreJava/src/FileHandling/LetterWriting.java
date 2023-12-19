package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LetterWriting {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:/MyLetterToPM.txt");
		FileWriter fw=new FileWriter(file,true);
		fw.write("Dear CM sir, please provide some jobs for Enginner's"+
		" Thank you and regards"
		+" Sonam");
		System.out.println("Success");
		fw.close();

	}
}
