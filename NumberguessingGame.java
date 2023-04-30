import java.util.Scanner;
import java.util.Random;

public class NumberguessingGame{

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Number Guessing Game-----------");
    
        Random rand = new Random();
        int randomNum = rand.nextInt(101);
        System.out.println("You have 10 attempts!");
        System.out.print("Guess a number between 1-100: ");
        int users_guess = sc.nextInt();
    
        int count=0, attempts=10;
    
        for(int i=0; i<10; i++){
        
            if(users_guess==randomNum){
                System.out.println("\nYou Won!\2 ");
                System.out.println("YOur Score: " + attempts);
                break;
        
            }
            
            else if(users_guess>randomNum){
                    System.out.println("Number is less than "+ users_guess);
                }
            else{
                    System.out.println("Number is greater than "+ users_guess);
                }
    
            count++;
            attempts--;
        
            System.out.println("Number of attempts left: " + attempts);
    
            System.out.print("Try Again: ");
            users_guess = sc.nextInt();
            
            if(i==10){
                System.out.println("Number was: " + randomNum);
            }  
        }
    }
}
