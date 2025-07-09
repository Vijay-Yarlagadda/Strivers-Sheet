
import java.util.*;

class Pattern4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
	System.out.println("Enter row: ");
        n=sc.nextInt();
        int i,j;
	System.out.println("Pattern a:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}