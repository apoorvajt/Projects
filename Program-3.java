package Program;

import java.util.Scanner;

public class Program3{
	public static void main(String args[])
	{ 
		int num,line=0;
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	if(num==1)
	{
		System.out.println(num);
	}
	else {
		
	for ( int i = 1; i <= num; i++)
 {
		line=2*i-1;
		System.out.println(line+" ");
	
 }
	}
	}
}
