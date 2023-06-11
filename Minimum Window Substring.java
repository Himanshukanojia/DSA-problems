class Solution {
    public String minWindow(String s, String t) {
      if(s == null || s.isEmpty() || t == null || t.isEmpty()) return"";

       Map<Character,Integer> map = new HashMap<>();
       for(int i=0;i<t.length();i++){
           char c = t.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
       }  
       int i=0,j =0,min = s.length();
       int left = 0,right = s.length() -1,count = map.size();
       boolean found = false;
       while(j < s.length()){
           char endChar = s.charAt(j++);
           if(map.containsKey(endChar)){
               map.put(endChar,map.get(endChar) -1);
               if(map.get(endChar) == 0) count--;
           }
           if(count > 0) continue;
           while(count == 0){
           char startChar = s.charAt(i++);
           if(map.containsKey(startChar)){
               map.put(startChar,map.get(startChar) +1);
               if(map.get(startChar) > 0) count++;
           }    
           }
           if(j-i < min){
               left = i;
               right = j;
               min = j-i;
               found = true;
           }
       }
       return !found ? "" :s.substring(left -1,right);
    }
}
