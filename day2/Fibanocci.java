package week2.day2;

public class Fibanocci {

	public static void main(String[] args) {
		
		int a=0, b=1, sum;
		System.out.print(a+" "+b+" ");
		
		for(int i=1;i<=11;i++)
		{
			sum=a+b;   
			a=b;
			b=sum;
			System.out.print(sum+" ");
			
		}

	}

}
