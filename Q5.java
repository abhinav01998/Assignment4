import java.util.*;
import java.lang.*;

public class Q5
{
  public static void main(String args[])
  {
  int i,n,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array");
  n=sc.nextInt();
  int a[]=new int[n+1];
  for(i=0;i<n;i++)
  {
	  a[i]=sc.nextInt();
  }
  for(i=0;i<n;i++)
  {
	  if(i%2==0)
	  {
		temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;		
	  }
  }
  for(i=0;i<n;i++)
  {
	  System.out.print(a[i]+" ");
  }
  }
}