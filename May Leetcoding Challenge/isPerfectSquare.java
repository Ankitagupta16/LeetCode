/**
*Given a positive integer num, 
*write a function which returns True if num is a perfect square else False.
*Note: Do not use any built-in library function such as sqrt()
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num <= 1) return true;
        int i = 2;
        int j = num;
        while (i <= j) {
            int  k = i + (j - i) / 2; // avoid integer overflow
            if (k * k == num) return true;
            if (k * k > num) {
                j = k - 1;
            } else {
                i = k + 1;
            }
        }
        return false; 
    }
}
