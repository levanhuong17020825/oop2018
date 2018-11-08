package week9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Utils  {
	public static String readContentFromFile(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		String a = null;
		if(sc.hasNext())
		{
			a = sc.nextLine();
			try{
				while(sc.hasNext())
				{
					String b = sc.nextLine();
					a = a +'\n'+ b;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		return a;
	}
	public static void Clean(String path) throws IOException
	{
		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		pw.write("");
		pw.flush(); 
		pw.close();
	}
	public static void writeContentToFile(String path) throws IOException {
		File file = new File(path);
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(file,false);
			BufferedWriter bf = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bf);
			
			for(int i = 0 ; i < 4;i++)
			{
				String a;
				a = sc.nextLine();
				pw.print(a);
				pw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public static void writeContentToFile1(String path) throws IOException {
			File file = new File(path);
			Scanner sc = new Scanner(System.in);
			try {
				FileWriter fw = new FileWriter(file,true);
				BufferedWriter bf = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bf);
				
				for(int i = 0 ; i < 4;i++)
				{
					String a;
					a = sc.nextLine();
					pw.print(a);
					pw.flush();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	}
	public static File findFileByName(String folderPath, String fileName) {
		File dir = new File(folderPath);
		File b = null;
		File []a = dir.listFiles();
		for(int i = 0; i < a.length; i++ )
		{
			if(a[i].getName().equals(fileName)) b = a[i];
		}
		return b;
	}
	public static void main(String[] args) throws IOException  {
		//Clean("Week9.txt");
		System.out.println(readContentFromFile("Week9.txt"));
		writeContentToFile1("Week9.txt");
		System.out.println(readContentFromFile("Week9.txt"));
		writeContentToFile("Week9.txt");
		System.out.println(readContentFromFile("Week9.txt"));
		System.out.println(findFileByName("E:/Github/oop2018/oop2018/oop2018","Week9.txt").getName());
	}
}
