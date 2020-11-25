//package DataStructures;
//
//public class test {
//
//}
//
//
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'medians' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static List<Integer> medians(List<Integer> arr) {
//    // Write your code here
//       int count =0;
//       int median=0;
//       int totalsum=0;
//       
//       List <Integer> medianArray = new ArrayList<Integer>();
//       Collections.sort(arr);
//        Integer[] array1=new Integer [arr.size()];//created an array with same size
//        Integer[] array2=new Integer [arr.size()];//created an array with same size
//       array1=arr.toArray(array1);
//       int length=array1.length;
//        for (int i=0;i<=length;i++)
//        {
//            if(count==0)
//            {
//               array2[count]=array1[i];
//            }
//            else if(count%2==0)
//            {
//              
//                  int sum_middle=array1[length/2]+array1[(length/2)-1];
//                  int median1 =(sum_middle)/2;
//                  array2[count]=median1;
//                
//            }
//            else 
//            {
//               
//            
//                int median1=array1[length/2];
//                array2[count]=median1;
//            
//         
//            }
//            count ++;
//        }
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> result = Result.medians(arr);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
