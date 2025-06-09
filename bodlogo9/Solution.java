package bodlogo3;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) {
    // Write your code here
    
    int H = A.size();          
    int W = A.get(0).size();    
    int surface = 0;

    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            int height = A.get(i).get(j);
            if (height > 0) {
            
                surface += 2;
            }

         
            if (j == 0) {
                surface += height;
            } else {
                surface += Math.max(0, height - A.get(i).get(j - 1));
            }

            
            if (j == W - 1) {
                surface += height;
            } else {
                surface += Math.max(0, height - A.get(i).get(j + 1));
            }

           
            if (i == 0) {
                surface += height;
            } else {
                surface += Math.max(0, height - A.get(i - 1).get(j));
            }

            
            if (i == H - 1) {
                surface += height;
            } else {
                surface += Math.max(0, height - A.get(i + 1).get(j));
            }
        }
    }

    return surface;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            String[] ARowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> ARowItems = new ArrayList<>();

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowTempItems[j]);
                ARowItems.add(AItem);
            }

            A.add(ARowItems);
        }

        int result = Result.surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
