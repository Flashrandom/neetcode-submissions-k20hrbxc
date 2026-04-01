class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int count_max=0;
        char[] arr = s.toCharArray();
        for( int i=0; i< s.length(); i++){
        Set<Character> st= new HashSet<>();
        int count=0;
            for(int j=i ; j< s.length(); j++){
                if( !st.contains(arr[j])){
                    st.add(arr[j]);
                    count++;
                    count_max = Math.max(count_max, count);
                }else{
                    
                    break;
                }
            }
        }
        
        return count_max;
        
    }
}
