import java.util.Scanner;

public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
	        
	     int num1 = sc.nextInt();
	     int num2 = sc.nextInt();
	       
	     int output[] = new int[4];
	      
	     output[0] = num1 * (num2%10);
	     output[1] = num1 * (num2%100/10);
	     output[2] = num1 * (num2/100);
	     output[3] = num1 * num2;
	        
	     for(int i =0; i < 4; i++){
	         System.out.println(output[i]);
	     }
	       
	     sc.close();
    }
}