package database;

import java.util.ArrayList;


public class DataStore {
	
	public ArrayList<Tuple> dataStore;
	
	public DataStore()
	{
		dataStore = new ArrayList<Tuple>();
	}
	
	public void printDataStore()
	{
		if(dataStore.size()==0)
		 {
			 System.out.println("Nothing to print. DataStore empty");
			 return;
		 }
		 for(int i=0; i<dataStore.size(); i++)
		 {
			 dataStore.get(i).print();
		 }
		 System.out.println();
	}

}
