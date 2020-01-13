package com.revature.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.revature.pojo.Car;

public class CarDAO {

	public void createCarDB(HashMap<String, Car> lot) {

		try (FileOutputStream fos = new FileOutputStream("CarLot.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(lot);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, Car> readCarDB() {
		HashMap<String, Car> lot = null;
		try (FileInputStream fis = new FileInputStream("CarLot.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			lot = (HashMap<String, Car>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return lot;
	}

}
