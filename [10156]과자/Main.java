import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt(); // 과자 한 개의 가격
        int n = sc.nextInt(); // 사려고 하는 과자의 개수
        int m = sc.nextInt(); // 현재 동수가 가진 돈
        
        if(k*n<=m){
            System.out.println(0);
        }else{
            System.out.println(k*n-m);
        }
    }
}