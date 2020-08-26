package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Human;

public class IOWithCollections {
	private static final String humanFile="human.txt";
	public static List<Human> humanList= new ArrayList<Human>();
	
	public static void writeHumanFile() {
		try {
			ObjectOutputStream objectOut= new ObjectOutputStream(new FileOutputStream(humanFile));
			objectOut.writeObject(humanList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readHumanFile() {
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(humanFile));
			humanList= (ArrayList<Human>)objectIn.readObject();
			objectIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
