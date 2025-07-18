class Student{
	String name;
	int rollNo;
	String dept;
	Student(String name,int rollNo,String dept){
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
	}
	public void printStudentInfo(){
		System.out.println("Name:\t"+name);
		System.out.println("Roll NO:\t"+rollNo);
		System.out.println("Department:\t"+dept);
	}
}
public class Demo2 {
	public static void main(String[] args){
		Student std1=new Student("Noel",59,"CSE");
		std1.printStudentInfo();
		Student std2=new Student("Alwin",16,"CSE");
		std2.printStudentInfo();
	}
}
