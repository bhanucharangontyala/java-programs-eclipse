package student;

public class JavaStrings {

	public static void main(String[] args) {
		String name = "BhanuCharanGontyala";
		String name2 = "    Bhanu Charan Gontyal    ";
		String name3 = "Eren \"Attack on Titans\" Eager";
		String txt = "The \bcharacter\tis \n called \r backslash.";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("Cha"));
		System.out.println(name.charAt(9));
		System.out.println(name.equals(name2));
		System.out.println(name2.trim());
		System.out.println(name.concat(name2));
		System.out.println(name+name2);
		System.out.println(name3);
		System.out.println(txt);
	}

}
