package student;

import java.util.Scanner;
public class Methods2 {
    static Scanner sc = new Scanner(System.in);
    int sum = 0;
    int sub = 0;
    int multiply = 0;
    int div = 0;
    
    
    void add(int a, int b){
        sum = a + b;
        System.out.println("The Sum is " + sum);
        System.out.println("Enter Number for subtraction");
        int c = sc.nextInt();
        subtracion(sum,c);
    }
    
    void subtracion(int sum,int c){
        sub = sum - c;
        System.out.println("The Subtraction is " + sub);
        System.out.println("Enter Number for multiplication");
        int d = sc.nextInt();
        multiply(sub, d);
    }
    
    void multiply(int sub,int d){
        multiply = sub * d;
        System.out.println("The Multiplication is " + multiply);
        System.out.println("Enter Number for division");
        int e = sc.nextInt();
        division(multiply, e);
    }
    
    void division(int multiply,int e){
        div = multiply / e;
        System.out.println("The Division is " + div);
    }
    
    
    void main(String[] args) {
        System.out.println("Enter Number A");
        int m = sc.nextInt();
        System.out.println("Enter Number B");
        int n = sc.nextInt();
        add(m, n);
    }
}
