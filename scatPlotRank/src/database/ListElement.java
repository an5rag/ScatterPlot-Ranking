
package database;


public class ListElement {
	public int coordinate;
	public Tuple t;
	
	public boolean equals(Object o)
	{
		ListElement l = (ListElement) o;
		if (this.t.index==l.t.index)
		return true;
		else
			return false;
	}
	
	
	public ListElement(Tuple a, int b)
	{
		t = a;
		coordinate=b;
	}
	
	
	
}
