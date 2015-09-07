package dataloader;

import database.*;
import util.*;

public class DataLoader {
	
	
	/**
	 * @param d
	 * @param option 1: Imports Test data by Hard Coding
	 * 		  option 2: Imports by Random Test Data
	 * 		  option 3: Imports by csv
	 */
	public DataLoader(DataStore d, int option)
	{
		switch(option)
		{
		case 1: importByHardCode(d);
				break;
		case 2: importByTesting(d);
				break;
		case 3: importByCsv(d);
				break;
		}
	}
	
	public void importByTesting(DataStore d)
	{
		String productList[] = {"P1", "P2","P3", "P4","P5", "P6","P7", "P8","P9", "P10","P11", "P12"};
		DataGenerator dG = new DataGenerator(d, productList); 
	}
	
	public void importByCsv(DataStore d)
	{
		System.out.println("Import Unsuccessful!");
	}
	
	public  void importByHardCode(DataStore d)
	{
		Tuple t = new Tuple(1,0,"P1");
		d.dataStore.add(t);
		t = new Tuple(2,1,"P1");
		d.dataStore.add(t);
		t = new Tuple(1,1,"P1");
		d.dataStore.add(t);
		t = new Tuple(0,1,"P1");
		d.dataStore.add(t);
		t = new Tuple(2,3,"P1");
		d.dataStore.add(t);
		t = new Tuple(3,3,"P1");
		d.dataStore.add(t);
		t = new Tuple(4,0,"P2");
		d.dataStore.add(t);
		t = new Tuple(5,0,"P2");
		d.dataStore.add(t);
		t = new Tuple(4,1,"P2");
		d.dataStore.add(t);
		t = new Tuple(5,1,"P2");
		d.dataStore.add(t);
		t = new Tuple(4,3,"P1");
		d.dataStore.add(t);
		t = new Tuple(5,3,"P1");
		d.dataStore.add(t);
	}
	
}
