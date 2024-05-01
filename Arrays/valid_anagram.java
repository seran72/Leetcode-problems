public class valid_anagram {
    public static boolean valid(String s, String t){
        int s_len = s.length();
        int t_len = t.length();
        if(s_len != t_len){
            return false;
        }
        int[] store = new int[26];

        for(int i=0; i<s_len; i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']++;
        }
        for(int n : store){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
