
//TC: O(V+E)
//SC: O(V)

class Solution {
    public int findJudge(int n, int[][] trusts) {
        int[] indegrees = new int[n];
        for(int[] trust : trusts ){
            indegrees[trust[0]-1]--;
            indegrees[trust[1]-1]++;
        }
        for(int i=0;i<n;i++){
            if(indegrees[i] == n-1) return i+1;
        }
        return -1;
    }
}
