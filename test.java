

public class test {

    public static void main (String[] args){

    int[] arr = {10, 20, 30, 40};
    String[] strs = {"tokyo", "rio", "berling"};
    char[] chars = {'x', 'y'};
    boolean[] bools = {false, true, true, true};
    for(int each: arr){
        System.out.println(each);
    }
    for(String each: strs){
        System.out.println(each);
    }
    for(char each: chars){
        System.out.println(each);
    }
    for(boolean each: bools){
        System.out.println(each);
    }
  }
}
