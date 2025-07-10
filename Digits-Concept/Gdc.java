import java.util.*;

class Gdc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n1,n2;
	System.out.println("Enter two numbers: ");
	n1=sc.nextInt();
	n2=sc.nextInt();
        int i,temp=0;
            for(i=1;i<=Math.min(n1,n2);i++){
                if(n1%i==0 && n2%i==0){
                    temp=i;
                }
            }
	System.out.println("GDC:" );
		System.out.println(temp);
    }
}