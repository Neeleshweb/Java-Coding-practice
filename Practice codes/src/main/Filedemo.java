package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		
PrintWriter pw=new PrintWriter(f);
pw.write("I am insane");
pw.write("i am awesome");
pw.close();
BufferedReader r=new BufferedReader(new FileReader( f));
String s=null;
while((s = r.readLine()) != null){
	if(r.equals("am")) {
		System.out.println("file read successfully");
	}
}



	}

}
