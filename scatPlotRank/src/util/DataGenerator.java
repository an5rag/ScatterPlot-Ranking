package util;
import database.*;

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
		for(int i=0; i<10000; i++)
		{
			int propList[] = new int[6];
			for(int j=0; j<6; j++)
				propList[j]= randInt(1,100);
			int len = productList.length;
			int randomNumber = randInt(0,len-1);
			String prod = productList[randomNumber];
			Tuple t = new Tuple(prod, propList);
			d.dataStore.add(t);
		}
	}

}
