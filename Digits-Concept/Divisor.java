import java.util.*;

class Divisor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int i;
        ArrayList<Integer> list=new ArrayList<>();
        for(i=1;i<=n;i++){
                    if(n%i==0){
                        list.add(i);
                    }
            }
            //into Array
            int [] result=new int[list.size()];
            for(i=0;i<list.size();i++){
                result[i]=list.get(i);
            }
            for(i=0;i<list.size();i++){
			System.out.print(result[i]);
		}
	}
}