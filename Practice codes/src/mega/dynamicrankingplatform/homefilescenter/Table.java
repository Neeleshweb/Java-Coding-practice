package mega.dynamicrankingplatform.homefilescenter;
import java.io.*;
import java.util.*;


public class Table {

    public static void main(String[] args) {
     int N;
        Scanner sc= new Scanner(System.in);
         N=sc.nextInt();
        if(N>=2 && N<=20) {
            int i=1;
            while(i<=10) {
                int t=N*i;
                System.out.println(N + " x " + i + " = " + t);
                i++;
            }
            
        }
        else {
            System.out.println("The number range is incorrect");
        }
        
    }
}
