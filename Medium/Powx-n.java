// Brute Force : O(n)
class Solution {
    public double myPow(double x, int n) {
        // Why long datatype? -- to handle -2^31 as, its positive representation -> 2^31 -> integer overflows(as range of integer for positive values is 2^31 -1)
        long N = n;
        if (x == 0) return 0;
        if (N == 0) return 1;

        if(n < 0){
            N = -N;
            x = 1 / x;
        }
        return myPower(x, N);
    }
    // type of n (int) in myPow is not compatible with N (long) -> new function with parameter of long type
    public double myPower(double x, long n){
        if(n == 0)
        return 1;

        return x * myPower(x, n - 1);
    }    
}
// Brute Force approach gives Runtime Error(stack overflow) for huge values of n
// Optimized Approach : O(logn) -- Fast or Binary Exponentiation
/*Intuition behind optimization
if n is even then x^n = x^n/2 * x^n/2
else x^n = x^n/2 * x^n/2 * x
For Example : x^15
-> Brute Force : x * x * x * x ......... 15 times
-> Optimized : x^15 = x^7 * x^7 * x -> x^7 = x^3 * x^3 * x -> x^3 = x^2 * x
-> Brute force recursion subtracts 1 each step → tree height = n → too big.
-> Fast exponentiation halves exponent each step → tree height = log₂(n) → very small.
For n=1,000,000,000 :
-> Brute force → tree height = 1,000,000,000
-> Fast power → tree height ≈ 30
*/
class Solution {
public double myPow(double x, int n) {
    long N = n;
    if (x == 0) return 0;
    if (N == 0) return 1;

    if(n < 0){
        N = -N;
        x = 1 / x;
    }
    return myPower(x, N);
}
public double myPower(double x, long n){
    if(n == 0)
    return 1;

    double value = myPower(x, n / 2);
        
    if(n % 2 == 0)
    return value * value;
    else 
    return value * value * x;
    }    
}
