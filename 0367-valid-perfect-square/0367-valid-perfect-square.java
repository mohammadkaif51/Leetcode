class Solution {
    public boolean isPerfectSquare(int num) {
        int l=0;
        int r=num;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(Math.pow(mid,2)==num){
                return true;
            }
            else if(Math.pow(mid,2)<num)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}