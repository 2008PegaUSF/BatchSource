package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	private static final String outFile="output.txt";
	private static final String inFile="input.txt";
	//Write data to a file
	
	public void writeOutputStreamContents(String contents) {
		OutputStream os= null;
		File file = new File(outFile);
		try {
			//false would overwrite. true appends to end
			os= new FileOutputStream(file,true);
			os.write(contents.getBytes());			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(os!=null) {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//Read a String from a file
	public String readInputStreamContents() {
		InputStream is= null;
		File file= new File(inFile);
		StringBuilder s= new StringBuilder();
		
		try {
			is= new FileInputStream(file);
			int b=0;
			while((b=is.read())!=-1) {
				char c=(char)b;
				s.append(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	return s.toString();
		
		
	}
}
