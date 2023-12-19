package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("D:/MyLetterToPM.txt");
		try {
			FileReader fr = new FileReader(file);
		int d;
		while((d=fr.read())!=-1)
		System.out.print((char)d);
		fr.close();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
