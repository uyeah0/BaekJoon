import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int s = 0;
        int t = 0;
        int result;
        
        for(int i = 0;i < 4; i++){
            s += sc.nextInt();
        }
        for(int i = 0;i < 4; i++){
            t += sc.nextInt();
        }
        
        if(s<t){
            result = t;
        }else{
            result = s;
        }
        System.out.println(result);
    }
}