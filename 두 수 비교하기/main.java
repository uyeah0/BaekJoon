import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A,B;
        String r;
        A = sc.nextInt();
        B = sc.nextInt();
        if(A>B) r = ">";
        else if(A<B) r="<";
        else r="==";
        System.out.println(r);
        
    }
}
