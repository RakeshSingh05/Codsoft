import java.util.*;
public class grade {
    public static String grade_calculator(int n){
        
        double percentage = ((double) n / 600) * 100;

        if( percentage >= 90 ){
            return "A+";
        }
        if(percentage >= 80){
            return "A";
        }
        if(percentage >= 70){
            return "B+";
        }
        if(percentage >=60){
            return "B";
        }
        if(percentage >= 50){
            return "C+";

        }
        if(percentage >= 33){
            return "C";

        }

      
        return "F";
    }
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter the marks of your subjects : \n 1. Maths \n 2.Oops \n 3.DSA \n 4.BE\n 5.DELD\n 6.EVS.\n");
        int arr[] = new int[6];
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(" Enter the marks of your "+  (i+1)  +" subject :");
            arr[i] = sc.nextInt();
            total =  total + arr[i];

        }
        
        if(total > 600){
            System.out.println("Please enter a valid numbers for the above subjects .\n The data you had provided is wrong . ");
        }
        System.out.println("Total marks out of 600 you get is :"+ total);
        String x;
         x = grade_calculator(total);
        System.out.println( "Your grade is  :"+x);
        sc.close();
    }
       
    }