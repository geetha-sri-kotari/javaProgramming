//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = (int)(Math.random()*100);
        int num;
        while(true){
            System.out.println("Guess a number from 0 to 100");
            num = sc.nextInt();
            if(num == ans){
                System.out.println("Correct Guess");
                System.out.println("Thank you for trying");
                break;
            }
            else if(num < ans && num != -1){
                System.out.println("Number is greater than your guess");
            }
            else if(num > ans){
                System.out.println("Number is lesser than your guess");
            }
            else if(num == -1){
                System.out.println("Thank you for trying");
                System.out.print("Correct answer is ");
                System.out.println(ans);
                break;
            }
        }
    }
}