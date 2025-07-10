import java.util.*;

class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
	System.out.println("Enter row: ");
        n=sc.nextInt();
        int i,j;
	System.out.println("Pattern 2: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}