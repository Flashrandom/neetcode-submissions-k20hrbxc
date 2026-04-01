class Solution {
    public int characterReplacement(String s, int k) {
       int l=0; 
       int max_freq=0;
        int res= 0; 
       HashMap<Character, Integer> count= new HashMap<>();
       for( int r=0; r< s.length(); r++){
        count.put( s.charAt(r), count.getOrDefault( s.charAt(r), 0)+1);
        max_freq = Math.max( max_freq , count.get( s.charAt(r) ));

        while( ((r-l+1) - max_freq) >k){
            count.put( s.charAt(l), count.get( s.charAt(l)) -1);
            l++;
            
        }
        res = Math.max( res, r-l+1);
        
       }
       return res; 
    }
}
