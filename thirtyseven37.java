import java.util.*;

public class thirtyseven37 {
    public static boolean search(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for(int j =0; j<arr[0].length;j++){
               if (arr[i][j] == key) {
                System.out.print("found at "+ i+","+j);
                return true;
               }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n=matrix.length, m=matrix[0].length;//n = rows, m= columns
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for(int j =0; j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
            
        }
        //output
        for (int i = 0; i < n; i++) {
            for(int j =0; j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
            
        }
        // search
        int key =5;
        search(matrix, key);

    }
}
