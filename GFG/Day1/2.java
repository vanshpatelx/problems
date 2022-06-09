// https://practice.geeksforgeeks.org/problems/print-table0303/1/
package GFG.Day1;

import java.util.ArrayList;

public class 2 {
    class Solution{
        static ArrayList<Integer> getTable(int N){
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<=10;i++){
               list.add(i*N);
            }
            return list;
        }
}
}
