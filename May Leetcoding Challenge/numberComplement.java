/**
*Given a positive integer, output its complement number. 
*The complement strategy is to flip the bits of its binary representation.
*/

class Solution {
    public int findComplement(int num) {
       return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
