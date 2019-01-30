import java.util.*;
class OutputFormatting
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		int i1= sc.nextInt();
		String s2= sc.next();
		int i2= sc.nextInt();
		String s3= sc.next();
		int i3= sc.nextInt();
		if(s1.length()<=10 && s2.length()<=10 && s3.length()<=10 && i1>=0 && i1<1000 && i2>=0 &&i2<1000 && i3>=0 && i3<1000)
		{
			System.out.printf("%-15s%03d",s1,i1);
			System.out.println();
			System.out.printf("%-15s%03d",s2,i2);
			System.out.println();
			System.out.printf("%-15s%03d",s3,i3);
		}
	}
}