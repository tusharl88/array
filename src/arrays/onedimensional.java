package arrays;

import java.util.Random;

public class onedimensional {
	public static void main(String[]args)
	{
		int tushar[]= new int[5];    // array created.
		Random rand= new Random();   // any one number from 0 to infinity is given to rand.
		tushar[0]=rand.nextInt(6);   // any number form 0 to 5 is given to rand which means there are 6 options.
									// and rand gives to array
	System.out.println(tushar[0]);
	
	System.out.println("");
	
	int seema[]={2,4,5};            // another array created and values assigned to them directly.
	System.out.println(seema[0]);
	
	System.out.println();
	
	int sum=0;
	for(int i=0; i<3;i++){
	sum=sum+ seema[i];
	}
	System.out.println(sum);
	
	System.out.println();
	
	int naveen[]= new int [4];   //another array created.
	Random scala= new Random();
	for(int j =0;j<4;j++ ){
	naveen[j]=scala.nextInt(15);
	System.out.println(naveen[j]);
	}
	
	}
	
	
	}





