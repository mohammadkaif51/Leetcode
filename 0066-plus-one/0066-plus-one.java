class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int[] n1=new int[n+2];
        if(digits[n]<9){
            digits[n]+=1;
        }
        else{
            while(digits[n]==9){
                if(n==0){
                    n1[0]=1;
                    return n1;
                }
                digits[n]=0;
                n--;
            }
            digits[n]+=1;
        }
        return digits;
    }
}