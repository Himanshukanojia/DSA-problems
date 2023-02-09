class Solution {
    public long distinctNames(String[] ideas) {
        Set<String>[] suffixByLetter=new Set[26];
        for(int i=0;i<26;i++)  suffixByLetter[i]=new HashSet<>();
        for(String idea : ideas) 
        suffixByLetter[idea.charAt(0)-'a'].add(idea.substring(1));

        long pairs=0;
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++){
            int overlapping=0;
            for(String suffix : suffixByLetter[i]){
                if(suffixByLetter[j].contains(suffix)) overlapping++;
            }
            pairs+=(suffixByLetter[i].size()-overlapping) * (suffixByLetter[j].size()-overlapping) *2;
        }
        }
        return pairs;
    }
}
