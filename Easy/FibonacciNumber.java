class Solution {
    public int fib(int n) {
        //Base Case
        if(n == 0) // term 0
        return 0;
        if(n == 1) // term 1
        return 1;

        //Recurrence Relation
        return fib(n - 1) + fib(n - 2);
    }
}
