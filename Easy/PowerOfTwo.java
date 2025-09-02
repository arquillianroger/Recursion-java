// Brute Force : O(logn) time and O(logn) space for stack
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        // 2^x can never be negative, odd or zero
        if(n <= 0 || n % 2 != 0) return false;
      
        return isPowerOfTwo(n / 2);
    }
}
//Optimized Solution : O(1) time and O(1) space --Bit Manipulation
class Solution {
    public boolean isPowerOfTwo(int n) {
        // Bitwise AND
        // Example : 
        // n -> 32(100000), n - 1 -> 31(011111)
        // n & (n - 1) = 0 -> n is power of 2
        return n > 0 && (n & (n - 1)) == 0;
    }
}
