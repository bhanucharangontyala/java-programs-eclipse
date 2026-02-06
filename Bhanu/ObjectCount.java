package Bhanu;

public class ObjectCount {
    int count=0;
    {
		count++;
		System.out.println(count);	
	}
    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount obj4 = new ObjectCount();
    }
}
