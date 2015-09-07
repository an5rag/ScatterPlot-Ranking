package core;
import java.util.*;

public class Rectangle
{
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	
	public void inputCoordinates()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter X1");
		x1  = scanner.nextInt();
		System.out.print("Enter X2");
		x2  = scanner.nextInt();
		System.out.print("Enter Y1");
		y1  = scanner.nextInt();
		System.out.print("Enter Y2");
		y2  = scanner.nextInt();

	}
}
