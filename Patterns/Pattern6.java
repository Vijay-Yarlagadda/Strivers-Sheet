import java.util.*;

class Pattern6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter row: ");
		n=sc.nextInt();
		System.out.println("Pattern 6: ");
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(n-j+1+" ");
			}
			System.out.println();
		}		
	}
}