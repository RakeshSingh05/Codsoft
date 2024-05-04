import java.util.*;
public class Random_java {
public static void main(String[] args) {
    Random random = new Random();
    int n = random.nextInt(55);
    
    
    boolean number = true;
    int count = 0;
    while(number){
        System.out.println("Enter your number within the range  of 0 - 55 :");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        
       

        if(numb > n){
            System.out.println("Your choise is greater than the exact number:");
            count++;
        }
        
        else if(numb < n ){
            System.out.println(" Your chosen no is almost near by the exact number:");
            count++;

        }
        else if(numb == n){
            System.out.println("you win the gave . \n Congratulations .");
            System.out.println("you complete this game in your "+ count+"    chance.");
            number = false;

        }
    }
    // System.out.println(n);   
}


    
}
