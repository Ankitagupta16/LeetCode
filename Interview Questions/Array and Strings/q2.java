/**Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) 
*there are such that A[i] + B[j] + C[k] + D[l] is zero.
*To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. 
*All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.
*/

//Time Complexity =O(n^2)

class Solution {
public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for(int a : A)
            for(int b : B){
                int s = a+b;
                map.put( s, map.getOrDefault(s, 0)+1 ); 
            }
        
        int result=0;
        for(int c : C)
            for(int d : D){
                int s = -c-d;
                result += map.getOrDefault(s, 0);
            }
        return result; 
    }
}
