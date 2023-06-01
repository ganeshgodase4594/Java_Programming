/*
 
   Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554"

 */

//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        if (num == 0) {
            return 5;
        }

        int sum = 0;
        int mult = 1;

        while (num > 0) {
            int rem = num % 10;

            if (rem == 0) {
                rem = 5;
            }

            sum =sum+rem*mult;
            mult =mult*10;
            num = num/10;
        }

        return sum;
    }
}

