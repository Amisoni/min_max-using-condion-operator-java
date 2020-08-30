import java.util.*;
class min_max_condition

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No1 : ");
		
		int no1=sc.nextInt();
		
		System.out.println("Enter the No2 : ");
		
		int no2=sc.nextInt();
		
		System.out.println("Enter the No3 : ");
		
		int no3=sc.nextInt();
		
		int big,min;
		
		big=no1>no2?(no1>no3?no1:no3):(no2>no3?no2:no3);
			
		min=no1<no2?(no1<no3?no1:no3):(no2<no3?no2:no3);
		
		System.out.println("Maximum Number is : " + big);
		
		System.out.println("Minimum Number is : " + min);
	}
}