// Time Complexity - O(kn) where n is the length of the query and k is the number of queries
// Space Complexity - O(1) 

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> result = new ArrayList<>();
        for(String query : queries){
            int j = 0;
            boolean flag = false;
            for(int i=0;i < query.length();i++){
                char ch = query.charAt(i);
                if(j < pattern.length() && ch == pattern.charAt(j)){
                    j++;
                    if(j == pattern.length())
                        flag = true;
                }
                else if(Character.isUpperCase(ch)){
                    flag = false; 
                    break;
                }
            }
            result.add(flag);
        }
        return result;
    }
}
