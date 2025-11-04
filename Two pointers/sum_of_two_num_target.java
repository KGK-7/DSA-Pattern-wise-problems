import java.util.*;
public class sum_of_two_num_target{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
	System.out.println("Enter "+ n + " numbers");
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter target");
	int target=sc.nextInt();
	
	ArrayList<Integer> target_sum = new ArrayList<>();
	for(int i=1; i<n-1; i++){
		if(arr[i] + arr[i-1] == target){
			target_sum.add(arr[i], arr[i-1]);
			System.out.println(target_sum);
		}
		else{
			return;
		}
	}
	
    }
}