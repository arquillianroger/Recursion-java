/* Two Pointer Approach --O(n) time and O(1) space
class Solution {
    public void reverseString(char[] s) {
        int i = 0; 
        int j = s.length - 1;
        while(i < j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
*/
// Recursion -- O(n) time and O(n) space
class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    void reverse(char[] s, int i, int j){
        // Base Case -- As at this point our array will be reversed
        if(i >= j)
        return; 

        //swapping
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        //Recursive Call
        reverse(s, i + 1, j - 1);
    }
}
