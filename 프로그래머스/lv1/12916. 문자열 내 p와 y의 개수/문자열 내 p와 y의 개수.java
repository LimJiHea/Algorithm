class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcnt = 0;
        int ycnt = 0;
       
        s = s.toUpperCase();
        
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='P'){
                pcnt++;
            }else if(s.charAt(i)=='Y'){
                ycnt++;
            }
        }
        
        if(pcnt - ycnt == 0){
            return answer;
        }else{
            answer = false;
        }
        
        
        System.out.println(s);
        
        
        return answer;
    }
}