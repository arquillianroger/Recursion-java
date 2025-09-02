class Solution {
    void printNos(int N) {
        // Base Case -- smallest valid input
        if(N == 1){
            System.out.print(N);
            return;
        }
        //Induction Part --print N
        System.out.print(N + " ");
        
        //Recursive Call
        printNos(N - 1);
    }
}
