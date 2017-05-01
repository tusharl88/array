package arrays;
import java.util.Random;

public class jhakaas {
	public static void main(String[]args)
	{
		int freq[]= new int[7];  // it means zero to six.
		Random fish= new Random();
		
		
		for(int roll=1;roll<=1000;roll++)
		{
		++freq[1+fish.nextInt(6)];				// it means increment by one on random position inside an array.
		}
		
		
		for(int i=1;i<7;i++) 			//process started from one to six.
			{
			
			System.out.println(freq[i]);
			}
	}

}
