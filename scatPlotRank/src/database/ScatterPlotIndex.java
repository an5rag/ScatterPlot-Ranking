package database;

import java.util.*;
public class ScatterPlotIndex {
	
	public ArrayList<ListElement> list;
	DataStore d;
	int property;
	
	public ScatterPlotIndex(DataStore ds, int p)
	{
		list = new ArrayList<ListElement>();
		d=ds;
		property=p;
		indexTupleList();
	}
	//sort by adding at the right place using binary search
	public  void indexTupleList()
	{
		if(d.dataStore.size()==0)
		 {
			 System.out.println("Nothing to add. d.dataStore empty");
			 return;
		 }
		 for(int i=0; i<d.dataStore.size(); i++)
		 {
			 Tuple t = d.dataStore.get(i);
			 ListElement temp = new ListElement(t, t.properties[property]);
			 if(list.size()==0)
			 {
				 list.add(temp);
				 continue;
			 }
			 int x = getIndexByCoordinate(temp.coordinate);
			 list.add(x, temp);
		 }
	}
	
	public int getIndexByCoordinate(int search)
	{
	    int first  = 0;
	    int last   = list.size() - 1;
	    int middle = (first + last)/2;
	    
	    if(list.get(first).coordinate > search)
	    	return first;
	 
	    while( first <= last )
	    {
	      if (list.get(middle).coordinate  < search )
	        first = middle + 1;    
	     
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	    
	    return first;
	}
	public  void printTupleList()
	{
		if(list.size()==0)
		 {
			 System.out.println("Nothing to print. List empty");
			 return;
		 }
		 for(int i=0; i<list.size(); i++)
		 {
			 list.get(i).t.print();
		 }
		 System.out.println();
	}

}
