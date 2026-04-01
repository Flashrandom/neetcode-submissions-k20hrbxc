class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append('*').append(s);
        }

        return res.toString();


        

    }

    public List<String> decode(String str) {

        List<String> lst = new ArrayList<>();
        int i =0;
        while(i<str.length()){

            StringBuilder len = new StringBuilder();
            while (str.charAt(i) != '*') {
                len.append(str.charAt(i));
                i++;
            }
            
            int sb_len = Integer.parseInt(len.toString());

            i++;

            String s = str.substring(i, i+sb_len);
            lst.add(s);

            i = i+sb_len;
        }


        return lst;


        

    }
}