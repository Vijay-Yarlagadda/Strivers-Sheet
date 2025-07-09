
import java.util.*;

class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
	System.out.println("Enter row: ");
        n=sc.nextInt();
        int i,j;
	System.out.println("PAttern 3:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}