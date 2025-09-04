class Solution {
    final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        // even index --even number or more precisely even digits from 0 - 9 : 0, 2, 4, 6, 8
        // odd index --prime number or more precisely one digit prime numbers from 0 - 9 : 2, 3, 5, 7
        // choices -> decision(digits to include?) -> Recursion
        
        long countEvenIndex = (n + 1)/ 2; // n = 13 -> (13 + 1)/2 -> 7 even indexes
        long countOddIndex =  n / 2; // n = 13 -> 13/2 -> 6 odd indexes
        // Math.floor(n / 2.0) and Math.ceil(n / 2.0) will not work for 10^15 as division result may not be precise to the unit place anymore. 
       // Applying ceil or floor could give a wrong integer (off by 1).
      
        // Even Index Contribution --5 choices per index
        // For n = 13, we have 7 even index and total choices would be 5^7
        long productEvenIndex = myPower(5, countEvenIndex);
        
        // Odd Index Contribution --4 choices per index
        // For n = 13, we have 6 odd index and total choices would be 4^6
        long productOddIndex = myPower(4, countOddIndex);

        return (int)(productEvenIndex * productOddIndex % MOD);
    }
    // Using Fast Exponentiation as it takes O(logn) computations to calculate x^n
    // Using Recursion
    long myPower(int x, long n){
        // Base Case
        if(n == 0) return 1;

        // Recursive Call
        long value = myPower(x, n/2);

        // Induction Part
        if(n % 2 == 0)
            return value * value % MOD;
        else
            return value * value * x % MOD; 
    }
    // Using Loops
    long myPowerLoop(int x, long n){
      
    }
}
