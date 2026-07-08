class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int i=0;
        int[] count=new int[128];
        for(int j=0;j<n;j++)
        {
            char ch=s.charAt(j);
            count[ch]++;
            while(count[ch]>1)
            {
                char chl=s.charAt(i);
                count[chl]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}