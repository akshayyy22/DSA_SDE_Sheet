class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 ; int j = 0 ; int cnt = 0;

        while(i < s.length && j < g.length){
            if(s[i] >= g[j]){
                cnt++;
                j++;
            }
            i++;
        }

        return cnt;
        
    }
}