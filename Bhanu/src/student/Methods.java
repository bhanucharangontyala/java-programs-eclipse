package student;
import java.util.Scanner;
public class Methods {
    static Scanner sc = new Scanner(System.in);
    int sum = 0;
    int sub = 0;
    int multiply = 0;
    int div = 0;
    void add(int a, int b){
        sum = a + b;
        System.out.println("The Sum is " + sum);
    }
    void subtracion(int sum,int b){
        System.out.println("Enter Number B");
        int c = sc.nextInt();
        sub = sum - c;
        System.out.println("The Subtraction is " + sub);
    }
    void multiply(int sub,int b){
        System.out.println("Enter Number B");
        int d = sc.nextInt();
        multiply = sub * d;
        System.out.println("The Multiplication is " + multiply);
    }
    void division(int multiply,int b){
        System.out.println("Enter Number B");
        int e = sc.nextInt();
        div = multiply / e;
        System.out.println("The Multiplication is " + div);
    }
    public static void main(String[] args) {
        System.out.println("Enter Number A");
        int m = sc.nextInt();
        System.out.println("Enter Number B");
        int n = sc.nextInt();
        Methods obj = new Methods();
        obj.add(m, n);
        obj.subtracion(obj.sum, n);
        obj.multiply(obj.sub, n);
        obj.division(obj.multiply, n);
    }
}
