class ArithmeticOperators {
    void add(int a, int b){
        System.out.println(a + b);
    }
    void subract(int a, int b){
        System.out.println(a -  b);
    }
    void multiply(int a, int b){
        System.out.println(a * b);
    }
    void divide(int a, int b){
        System.out.println(a/b);
    }
}
public class methods {
        public static void main (String[] args){
          ArithmeticOperators ao = new ArithmeticOperators();
          ao.add(10, 20);
          ao.subract(10, 2);
          ao.multiply(10, 3);
          ao.divide(10, 2);
          
    }
}
