package constructors;

public class Course1 {
	int cId;
	String cName;
	int duration;
	Course1(int cId){
		this.cId=cId;
	}
	Course1(Course1 c,String name){
		this.cId=c.cId;
		this.cName=name;
	}
	
	void show() {
		System.out.println("Course Id :" + cId);
		System.out.println("Course Name :" + cName);
		System.out.println("Course Duration :" + duration);
	}
	public static void main(String[] args) {
		Course1 c=new Course1(23);
		c.show();
		Course1 c1=new Course1(c,"apple");
		c1.show();
	}

}
