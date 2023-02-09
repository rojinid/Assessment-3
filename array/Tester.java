package array;

public class Tester {

	public static void main(String[] args) {
		teacher object1=new teacher("Alex","Java Fundamentals",1200L);
		teacher object2=new teacher("John","JRDBMS",800L);
		teacher object3=new teacher("Sam","Networking",900L);
		teacher object4=new teacher("Maria","Python",900L);
		
		teacher[] teachers= {object1,object2,object3,object4};
		for(teacher Teachers : teachers) 
				 {
				            System.out.print("\nName: " + Teachers.getTeacherName());
				            System.out.print(", Subject: " +Teachers.getSubject());
				            System.out.print(", Salary: " + Teachers.getSalary());
				  }
				    }
}
