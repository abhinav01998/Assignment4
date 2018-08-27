class Rectangle
{
	public int length,breadth,Area;
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void CalculateArea()
	{
		Area=length*breadth;
		System.out.println("Area is: "+Area);
	}
}

public class Q1
{
    public static void main(String args[])
     {
		 int l,b;
		 l=5;
		b=3;
	    Rectangle R1=new Rectangle(l,b);
		R1.CalculateArea();
     }
}