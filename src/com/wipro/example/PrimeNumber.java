package com.wipro.example;

import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		//int num=100;
		System.out.println("Please Enter a Number In which Range You want to find prime Number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();

		int count=0;
for(int i=2;i<=num;i++){
count=0;
for(int j=2;j<=i/2;j++){
if(i%j==0){
count++;
break;

}


}
if(count==0){
System.out.println(i);

}


}


	}
}
