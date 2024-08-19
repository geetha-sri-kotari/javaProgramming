import java.util.Scanner;
public class Ternary {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println((a > b && a > c) ? a : (b > c && b > a) ? b : c);
        read.close();
    }
}
