/**
*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
*Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
*The letters in J are guaranteed distinct, and all characters in J and S are letters. 
*Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] jewelSet = J.toCharArray();
        char[] mySet = S.toCharArray();
        HashMap<Integer, Character> hash_map = new HashMap<Integer, Character>(); 
  
        // Mapping string values to int keys
        for(int i = 0;i < jewelSet.length; ++i)
            hash_map.put(i, jewelSet[i]);
        
        for(int i = 0; i < mySet.length; ++i){
            if (hash_map.containsValue(mySet[i]))
                count++;
        }   
        return count;
    }
}
