import java.util.Scanner;
public class Recursion {
    public static void main(String args[]){
        System.out.println("Sandesh this said");
        Scanner sc=new Scanner(System.in);
        fact f1=new fact();
        
        int result=f1.value(sc.nextInt());
        System.out.println(result);
    }

    
}

class fact{
    int value(int n){
        if(n==0){
            return 1;
        }
      
            return n*value(n-1);
         
    }
}