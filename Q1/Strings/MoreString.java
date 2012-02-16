public class MoreString {
public static int myIndexOf(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        boolean i = true;
        int pos=0;
        int pos2=0;
        int spot=-1;
        String char1;
        String char2;
        boolean check1 = true;
        boolean check2 = true;
        while(i && check1)
        {
         char1 = s1.substring(pos,pos+1);
         char2 = s2.substring(0,1);
         
         System.out.println("Character position: " + pos); 
         System.out.println("s1 character: " + char1);
         System.out.println("s2 characeter: " + char2);
         System.out.println("state of i: " + i);
         System.out.println("Check1: " + check1);
         System.out.println("check2: " + check2);
         if(char1.equals(char2)&& l2==1)
            {
               spot = pos;
               i= false;               
            }
            else
            {
                 if(char1.equals(char2))
                 {
                    spot = pos;
                    
                    while(check1&& check2)
                    {
                        pos++;
                        pos2++;
                        check1 = (pos+1<=l1-1);
                        check2 = (pos2+1<=l2-1);
                        char2 = s2.substring(pos2,pos2+1);
                        if(char1.equals(char2))  
                        {
                            i = false;   
                        }
                        
               }
              }
              else
              {
                pos++;
                check1 = (pos+1<=l1-1);
              }
            }
        }
        return spot;
    }
}    