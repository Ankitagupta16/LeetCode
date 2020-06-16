/**
* Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
* Note that elements beyond the length of the original array are not written.
* Do the above modifications to the input array in place, do not return anything from your function.
*/

//Time Complexity=O(n^2)
class Solution {
    public void duplicateZeros(int[] arr) {
	for (int i = 0; i < arr.length; i++){
        //ifarr[i]= 0 then shift all elements to right to make space for duplicate 0
        if (arr[i] == 0){
            for (int j = arr.length-1; j > i; j--){
                arr[j] = arr[j-1];                    
            }
            i++;
        }
    }
  }
}

//Time Complexity=O(n)
class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included  
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
