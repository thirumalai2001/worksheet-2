package nandha;

public class Volume 
{

	public static void main(String[] args) 
	{   double vol=0;
	    
		box1 obj=new box1(4,4,2);
		System.out.println("volume of first object is"+obj.volume());
		box1 obj1=new box1();
		System.out.println("volume of second object is "+obj1.volume());

	}

}
class box1
{
	double height,width,depth;
	box1(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	
	double volume()
	{
	 double vol;
	 vol=height*width*depth;
	 return vol;
	}
	box1()
	{
	height=40;
	width=40;
	depth=20;
	}
	
	
}

