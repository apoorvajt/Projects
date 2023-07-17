package Program;
import java.util.*;
public class Program-1{
	public static double Addition(double a,double b) {
		return a+b;
	}
	public static double subtractNumbers(double a, double b) {
		return a-b;
	}

	public static double multiplyNumbers(double a, double b) {
		return a*b;
	}
	public static void divideNumbers(double a,double b) {
		if(b!=0) {
			System.out.println(a/b);		}
	}

	public static int findRemainder(int num4,int num5) {
		return num4%num5;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double res4= Addition(a,b);
		double res1=subtractNumbers(a,b);
		double res2=multiplyNumbers(a,b);
		
		
		System.out.println(res4);
		System.out.println(res1);
		System.out.println(res2);
