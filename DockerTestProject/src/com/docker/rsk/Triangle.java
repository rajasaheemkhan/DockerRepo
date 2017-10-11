package com.docker.rsk;

/*Write a program to generate a Triangle.
eg:
1
2 2
3 3 3
4 4 4 4 and so on as per user given number */
class Triangle{
	public static void main(String args[]){
		int num = Integer.parseInt("5");
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+i+" ");
			}
			System.out.print("\n");
		}
	}
}