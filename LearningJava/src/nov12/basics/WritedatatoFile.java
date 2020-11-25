package nov12.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritedatatoFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sriranganathtottadi/Downloads/Input-file1.txt");
		FileWriter fw = null;
		try
		{
			 fw=new FileWriter(file);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not available");
		}
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi This is SRT");
		bw.write("Hi This is SRT1");
		bw.write("Hi This is SRT2");
		bw.write("Hi This is SRT3");
		bw.close();
		fw.close();
		
		FileReader fr=new FileReader(file);
		BufferedReader reader=new BufferedReader(fr);
		String str;
		str=reader.readLine();
		while (str!=null)
		{
			System.out.println(str);
			str=reader.readLine();
			
		}
		reader.close();
		fr.close();
		

	}

}
