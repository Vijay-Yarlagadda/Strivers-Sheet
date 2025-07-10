
import java.util.*;

class Pattern5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
	System.out.println("Enter row: ");
        n=sc.nextInt();
        int i,j;
	System.out.println("Pattern 5:");
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}