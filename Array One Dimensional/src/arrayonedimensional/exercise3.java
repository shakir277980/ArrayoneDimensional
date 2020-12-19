package arrayonedimensional;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		//program that create an array of ten element size,
		//your program should prompt the user to imput numbers in array and display the sum of all array element 	
			
		Scanner input = new Scanner(System.in);	
		int sum=0;
		int[] num=new int[10];
		
		System.out.println("Enter 10 number: ");	
		for(int i=0;i<num.length;i++) {
			
			num[i]=input.nextInt();
			sum=sum+num[i];
		}
		System.out.println(" 10 numbers you have enter: ");	
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}System.out.println("sum" + sum);
		

	}

}
