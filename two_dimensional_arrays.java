import java.util.Scanner;
import java.util.Arrays;

public class two_dimensional_arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int r;
        int c;
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //deepToString
        System.out.println(Arrays.deepToString(mat));

        // for - each loop
        
        String[][] seriesList = {{"bhairava", "bujji", "complex"},
                       {"harry", "ron", "hermoine"},
                       {"shannu", "vaishnavi", "don"}};
        for(String[] eachSeries: seriesList){
            for(String eachChar: eachSeries){
                System.out.println(eachChar);
            }
        }
    }
}
