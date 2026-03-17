class Solution {
    public boolean wordPattern(String pattern, String s) {
     Map<Character,String> map=new HashMap<>();
     String[] arr=s.split(" ");
     if(arr.length!=pattern.length()){
        return false;
     }
     for(int i=0;i<pattern.length();i++){
        char ch=pattern.charAt(i);
        String words=arr[i];
        if(( map.containsKey(ch) && !map.get(ch).equals(words)) || (!map.containsKey(ch) && map.values().contains(words)) ){
            return false;
        }
        map.put(ch,words);
     }
     return true;

    }
}