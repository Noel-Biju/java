class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount(){
		System.out.println(studentCount);
	}
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll NO: "+rollNumber);
	}
}
public class staticmethod {
	public static void main(String[] args) {
		Student student1=new Student("Adarsh",5);
		Student student2=new Student("Alwin",16);
		Student student3=new Student("Noel",59);
		student1.printDetails();
		student2.printDetails();
		student3.printDetails();
		System.out.println("The Number of students is:");
		Student.displayStudentCount();
	}

}
