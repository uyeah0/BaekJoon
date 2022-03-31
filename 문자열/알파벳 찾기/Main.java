import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
     
     String s = sc.next();
     int alpha[] = new int[26];
     int print[] = new int[26];
     
     for(int i = 0; i < 26; i++){
         alpha[i] = i+97;
         print[i] = -1;
     }
     
     for(int i =0; i < s.length(); i++){
         for(int j = 0; j < 26; j++){
             if((char)alpha[j] == s.charAt(i)){
                if(print[j] == -1) {
                	print[j] = i;	
                }
                //System.out.println((char)alpha[j] + " : " + j);
                 break;
             }
         }
     }
     
     for(int i = 0; i < 26; i++) {
    	 System.out.print(print[i] + " ");
     }
    }
}
