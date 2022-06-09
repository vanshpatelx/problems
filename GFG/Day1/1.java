// https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1/
package GFG.Day1;

public class 1 {
    class Solution {
        int digitSum(int n){
            int sum = 0;
            while(n!=0){
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            return sum;
        }
        int revNum(int sum){
            int rev = 0;
            while(sum !=0){
                int digit = sum % 10;
                rev = (rev * 10) + digit;
                sum /= 10;
            }
            return rev;
        }
        int isDigitSumPalindrome(int N) {
            // code here
            int sum = digitSum(N);
            int rev = revNum(sum);
            if(sum == rev){
                return 1;
            }
            else{
                return 0;
            }
        }
        
    }

}
