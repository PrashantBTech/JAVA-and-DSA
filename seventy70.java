// Binary String Problem  { Recursion }
// Print all binary string of size N without consecutive Ones. 

public class seventy70 {
    public static void printBinStrings(int n, int lastplace, String str){
       // base case
       if (n==0) {
        System.out.println(str);
        return;
       }
       
        // kam
       printBinStrings(n-1, 0, str+"0");
       if (lastplace == 0) {
        printBinStrings(n-1, 1, str+"1");
       }

    }
    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}
 