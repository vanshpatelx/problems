package GFG.Day3;
// https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1/
public class que1 {
    class Solution {
        //Function to reverse every sub-array group of size k.
        void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
            // code here
                // code here
                          if(n<k){
                    int temp1 = 0;
                    int temp2 = arr.size()-1;
                    while(temp1<=temp2) {
                        int temp = arr.get(temp1);
                        arr.set(temp1, arr.get(temp2));
                        arr.set(temp2, temp);
                        temp1++;
                        temp2--;
                    }
                }else{
                    int start = 0;
                    int end = k - 1;
                    int arrLen = arr.size() - 1;
                    int intr = 0;
                    if(n%k==0){
                        intr = n/k;
                    }else{
                        intr = n/k + 1;
                    }
    
                    for(int i=0;i<intr;i++){
                        int temp1 = start;
                        int temp2 = end;
                        int diff = end - start;
    
    //                for(int j=0;j<=diff/2;j++){
    //                    int temp = arr.get(temp1);
    //                    arr.set(temp1,arr.get(temp2));
    //                    arr.set(temp2,temp);
    //                    temp1++;
    //                    temp2--;
    //                }
                        while(temp1<=temp2){
                            int temp = arr.get(temp1);
                            arr.set(temp1,arr.get(temp2));
                            arr.set(temp2,temp);
                            temp1++;
                            temp2--;
                        }
                        start = end + 1;
                        if(arrLen > end+k){
                            end = end + k;
                        }else{
                            end = arrLen;
                        }
                    }
                }
        }
    }
    
}
