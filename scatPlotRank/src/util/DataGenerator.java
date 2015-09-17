package util;
import database.DataStore;
import database.Tuple;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DataGenerator {
	Random rand;
	DataStore d;
	
	public void setSeed(long seed)
	{
//		long seed = System.currentTimeMillis();
		rand = new Random(seed);
		System.out.println("Randomizing seed: "+ seed);
	}
	public int randInt(int min, int max) {	   

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	public DataGenerator(DataStore ds, String productList[])
	{
		long seed = System.currentTimeMillis();
		setSeed(seed);
		d = ds;
        String spreadOutProduct = productList[6];
		for(int i=0; i<50; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(1,20);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[0];
			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
            Tuple t2 = new Tuple(spreadOutProduct, propList);
            d.dataStore.add(t2);
		}
		for(int i=0; i<50; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(20,40);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[1];
			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
            Tuple t2 = new Tuple(spreadOutProduct, propList);
            d.dataStore.add(t2);
		}
		for(int i=0; i<50; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(40,60);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[2];

			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
            Tuple t2 = new Tuple(spreadOutProduct, propList);
            d.dataStore.add(t2);
		}
		for(int i=0; i<50; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(60,80);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[3];
			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
            Tuple t2 = new Tuple(spreadOutProduct, propList);
            d.dataStore.add(t2);
		}
		for(int i=0; i<50; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(80,100);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[4];
			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
            Tuple t2 = new Tuple(spreadOutProduct, propList);
            d.dataStore.add(t2);
		}
		generateCsvFile("tuples.csv",d.dataStore);
	}
	private static void generateCsvFile(String fileName, ArrayList<Tuple> tuples)
	{
		try
		{
			FileWriter writer = new FileWriter(fileName);

			writer.append("Product");
			writer.append(',');
			writer.append("Property 1");
			writer.append(',');
			writer.append("Property 2");
			writer.append('\n');

			for (Tuple t: tuples) {
			writer.append(t.product);
			writer.append(',');
			writer.append(String.valueOf(t.properties[0]));
			writer.append(',');
			writer.append(String.valueOf(t.properties[1]));
			writer.append('\n');
		}

			writer.flush();
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
