class Solution {
    public boolean isAnagram(String s, String t) {
        /*HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
       for(char arr:s.toCharArray()){
        map.put(arr,map.getOrDefault(arr,0)+1);
       }
       for(char ch:t.toCharArray()){
        if(map.containsKey(ch)==false){
            return false;
        }
        map.put(ch,map.get(ch)-1);
       }
       for (int value : map.values()) {
            if (value != 0) {
                return false;
       }
       }
         return true;
         */
         char[]s1=s.toCharArray();
         char[]s2=t.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(s2);
         return Arrays.equals(s1,s2);
    }
}
