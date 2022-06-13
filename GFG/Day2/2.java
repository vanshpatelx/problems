package GFG.Day2;

public class 2 {
    // https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1/
    public static void main(String[] args) {
        class Solution {
            static String delAlternate(String S) {
                // code here
                String str = "";
                int count = 1;
                int itration = S.length();
                for(int i=0;i<itration;i++){
                    if(count%2==0){
                        
                    }else{
                        str += S.charAt(count-1);
                    }
                    count++;
                }
                return str;
            }
        }
    }
}
