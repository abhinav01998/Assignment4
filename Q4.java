import java.util.*;
import java.lang.*;

public class Q4
{
	public int a,b,Ans;
	static
	{
		System.out.println("Program for Multiplication");
	}
	void multiply(int a,int b)
	{
		Ans=a*b;
		System.out.println("Answer is: "+Ans);
		}
	public static void main(String args[])
	{
		Q1 obj=new Q1();
		obj.multiply(3,5);
	}
}