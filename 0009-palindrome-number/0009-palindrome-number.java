class Solution {
    public boolean isPalindrome(int x) {
        int f=0;
        int ans=x;
        while(x>0){
            int rem=x%10;
            f=f*10+rem;
            x=x/10;
        }
        return ans==f;
    }
}