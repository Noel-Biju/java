class Calculator{
	public void add(int num1,int num2){
		int sum=num1+num2;
		System.out.println("The Sum is:\t"+sum);
	}
	public void add(int a,int b,int c){
		int sum=a+b+c;
		System.out.println("The Sum of Three Integers are:\t"+sum);
	}
	public void add(double n1,double n2){
		double sum=n1+n2;
		System.out.println("The Sum of Two Doubles are:\t"+sum);
	}
	public void add(String str,int d){
		String sum=str+d;
		System.out.println("The Sum of String and an Integer is:\t"+sum);
	}
}
public class OverlappingDemo {
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add(10,30);
		calculator.add(5,10,20);
		calculator.add(69.420,77.817);
		calculator.add("Noel",27);
	}
}
