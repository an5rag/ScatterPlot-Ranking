package database;

public class Tuple {
	public static int indexCount=0;
	public int index;
	public String product;
	public int[] properties = new int[6];
    public double score;
	
	
	/**
	 * Non-parameterized constructor 
	 * Sets default values as 0;
	 */
	public Tuple(){
		index=++indexCount;
		product = "Undefined";
		for(int i =0; i<6; i++)
		{
			properties[i] = 0;
		}
		
	}	
	
	/**
	 * Parameterized constructor 
	 * <p>Sets first two properties as provided 
	 * 
	 */
	public Tuple(  int x, int y,String prod){
	

		index=++indexCount;
		properties[0] = x;
		properties[1] = y;
		product = prod;
		for(int i =2; i<6; i++)
		{
			properties[i] = 0;
		}
		
	}
	
	/**
	 * Parameterized constructor 
	 * <p>Sets all values as provided
	 */
	public Tuple(String prod, int[] props)
	{
		index=++indexCount;
		product = prod;
		for(int i =0; i<6; i++)
		{
			properties[i] = props[i];
		}
	}

    public void setScore(double d)
    {
        score = d;
    }
	
	public void print()
	{
//		System.out.println("Index \t Category \t A1 \t A2 \t A3 \t A4 \t A5 \t A6");
		System.out.print("#"+index +"\t");
		System.out.print(product +"\t");
		for(int i = 0; i<6; i++)
		{
			System.out.print(properties[i] +"\t");
		}
        System.out.print(score);
		System.out.println();
		
	}

}
