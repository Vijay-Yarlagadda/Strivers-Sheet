import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int count=0;
            for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
          }
	System.out.println(count==2);
    }
}