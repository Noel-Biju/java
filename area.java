
public class InheritanceDemo {
	
	public static void main (String[] args) {
		Circle circle=new Circle();
		System.out.println(circle.area);
		circle.printArea();
		circle.hi();
	}
}
class Shape{
	int area=57;;
	public void printArea() {
		System.out.println("Area:"+area);
	}
}

class Circle extends Shape{
	public void hi() {
		System.out.println("Hi I'm Circle");
	}
}
