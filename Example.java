public class Example {
    public static void main (String[] args){
        int a = 10; //decimal
        int b = 0b10111; //binary
        int c = 0123; //octal
        int d = 0xF; //hexadecimal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //Converting a string to integer
        String s = "123"; //a string in decimal
        int num1 = Integer.parseInt(s); //converts the string to integer
        System.out.println(num1 * num1);
        //considers a binary number
        String binaryString = "10111";
        int num2 = Integer.parseInt(binaryString, 2);
        System.out.println(num2);
        //octal number
        String octalString = "123";
        System.out.println(Integer.parseInt(octalString, 8));
        //hexa decimal
        String hexaDecimalString = "ABCD";
        System.out.println(Integer.parseInt(hexaDecimalString, 16));
        //integer to string
        int num = 123;
        String s1 = Integer.toString(num);
        System.out.println(s1.charAt(1));
        System.out.println(Integer.toString(num, 2));
        System.out.println(Integer.toString(num, 8));
        System.out.println(Integer.toString(num, 16));
        }
}
