class Complex
{
	int real,imag;
	Complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	void Display()
	{
		System.out.println("Complex number is: "+real+"+"+imag+"i");
	}
}

public class Q2
{
	public static void main(String args[])
	{
		int r,i;
		r=2;
		i=5;
		Complex c1 = new Complex(r,i);
		c1.Display();
	}
}