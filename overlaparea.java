class AreaCalculator{
	public void area(double radius){
		double result=3.14f*radius*radius;
		System.out.println("The area of circle is:\t"+result);
	}
	public void area(double l,double w){
		double result=l*w;
		System.out.println("The area of rectangle is:\t"+result);
	}
	public void area(float base,float height){
		float result=0.5f*base*height;
		System.out.println("The area of triangle is:\t"+result);
	}
	public void area(int side){
		int result=side*side;
		System.out.println("The area of square is:\t"+result);
	}
}
public class shape {
	public static void main(String[] args) {
		AreaCalculator calc=new AreaCalculator();
		calc.area(15.5);
		calc.area(10,20);
		calc.area(5.5,6.7);
		calc.area(20);
	}
}
