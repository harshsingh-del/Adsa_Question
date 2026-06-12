class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        while(n>0){
            int num=n%10;
            if(mp.containsKey(num))  mp.put(num,mp.get(num)+1);
            else mp.put(num,1);
            n/=10;
        }
        int ans=0;
        for(int key:mp.keySet()){
            ans+=(key*mp.get(key));
        }
        return ans;
    }
}