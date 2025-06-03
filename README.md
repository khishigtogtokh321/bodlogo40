# ПХ. 40 бодлого
Бодлого 1. 
Өгөгдсөн бүхэл тоонуудаас бүрдсэн массивын бүх элементүүдийн нийлбэрийг ол.
Жишээ нь, хэрэв массив нь ar = [1,2,3] бол 1 + 2 + 3 = 6, тэгэхээр хариу нь 6 байна.

 Функцын тодорхойлолт
simpleArraySum нэртэй функцийг дараах параметртэйгээр гүйцээнэ үү:
Параметр:
  ar[n]: бүхэл тоонуудаас бүрдсэн массив
Буцаах утга:
  int: массивын бүх элементүүдийн нийлбэр
  Оролтын формат
1-р мөрөнд массивын хэмжээ болох бүхэл тоо n өгөгдөнө.
2-р мөрөнд n ширхэг зайгаар тусгаарлагдсан бүхэл тоонууд өгөгдөнө.

Бодол:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int simpleArraySum(List<Integer> ar) {
    int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }
        int result = Result.simpleArraySum(ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

Үр дүн:  
![Screenshot (350)](https://github.com/user-attachments/assets/0b1410d3-9c4b-4770-8f9b-30e8c851bcb1)

Бодлогын холбоос: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true



