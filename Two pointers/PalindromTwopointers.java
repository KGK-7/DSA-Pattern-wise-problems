import java.util.*;
class palindromeCheck{
	public static Boolean palCheck(String s){
		
		int left = 0, right = s.length()-1;
		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;

	}
}
public class PalindromTwopointers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
        Boolean result = palindromeCheck.palCheck(s);
        System.out.println("Is palindrome: " + result);
    }
}