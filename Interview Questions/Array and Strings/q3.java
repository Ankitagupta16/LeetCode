/*
*Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
* Time complexity= O(m+n)
* Space Complexity= O(1)
*/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List result = new ArrayList();
        int m = matrix.length;
        
        //base case
        if(m==0)
            return result;
        
        /*  k - starting row index 
            m - ending row index 
            l - starting column index 
            n - ending column index 
            i - iterator 
        */
        int i, k = 0, l = 0;
        int n = matrix[0].length;
        
        
        while (k < m && l < n) { 
        /* first row from the remaining rows */
        for (i = l; i < n; ++i) { 
            result.add(matrix[k][i]); 
        } 
        k++; 
  
        /* the last column from the remaining columns */
        for (i = k; i < m; ++i) { 
            result.add(matrix[i][n - 1]); 
        } 
        n--; 
  
        /* the last row from the remaining rows */
        if (k < m) { 
            for (i = n - 1; i >= l; --i) { 
                result.add(matrix[m - 1][i]); 
            } 
            m--; 
        } 
  
        /*the first column from the remaining columns */
        if (l < n) { 
            for (i = m - 1; i >= k; --i) { 
                result.add(matrix[i][l]); 
            } 
            l++; 
        } 
    }
        return result;
    }}
