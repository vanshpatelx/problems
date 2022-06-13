// https://practice.geeksforgeeks.org/problems/12-hour-clock-subtraction1708/1/
package GFG.Day2;
public class 1{
    public static void main(String[] args) {
        class Solution {
            static int subClock(int num1, int num2) {
                // // code here
                // if(num1>=12){
                //     num1 %= 12;
                // }
                
                // if(num2>=12){
                //     num2 %=12;
                // }
                
                // if((num1-num2)<0){
                //     return 12 + num1 - num2;
                // }
                
                // return num1 - num2;
                
                 int sub=(num1-num2)%12;
               return (sub>=0)?sub:12+sub;
            }
        };
    }
}