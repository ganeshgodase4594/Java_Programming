


class Solution
{
    static int penaltyScore(String S)
    {
        int score=0;
        
        for(int i=0;i<S.length()-1;i++){
          
           if(S.substring(i,i+2).equals("21")){
               
            
            score++;
        }  
            
        }
       
        
        return score;
    }

    public static void main(String[] args) {
        String S = "1012012112110";

        System.out.println(penaltyScore(S));
    }
}