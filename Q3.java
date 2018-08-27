import java.lang.*;
import java.util.*;

class Arrays
{
	public int i,max,largest;
	public int arr1[]=new int[10];
	Scanner sc=new Scanner(System.in);
	void input()
	{
		for(i=0;i<10;i++)
		{
			arr1[i]=sc.nextInt();
		}
	}
	void Second_largest()
	{
		max=arr1[0];
		for(i=0;i<10;i++)
		{
			if(arr1[i]>max)
			{
				max=arr1[i];
			}
		}
		largest=max;
		max=arr1[0];
		for(i=0;i<10;i++)
		{
			if(arr1[i]>max && arr1[i]<largest)
			{
				max=arr1[i];
			}
		}
			System.out.println("Second largest is: "+max);

	}
}

public class Q3
{
  public static void main(String args[])
  {
	  Arrays a1=new Arrays();
	  a1.input();
	  a1.Second_largest();
  }
}