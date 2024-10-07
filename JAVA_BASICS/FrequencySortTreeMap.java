import java.util.*;
import java.util.Arrays;
public class FrequencySortTreeMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // Step 1: Count frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Map.Entry<Integer,Integer>> ar = new ArrayList<>(freqMap.entrySet());
        Collections.sort(ar , new Comparator<Map.Entry<Integer,Integer>>()  {
            public int compare(Map.Entry<Integer,Integer> a , Map.Entry<Integer,Integer> b){
                int freqa = a.getValue();
                int freqb = b.getValue();
                if(freqa != freqb){
                    return freqa-freqb;
                }
                else{
                    return a.getKey() - b.getKey();
                }
            }
        });
        System.out.print(ar);
        Arrays.sort(arr, new Comparator<Integer>() { // we cannot able to do this in array tto perform this we need to change in[] array to integer[] or we can do this using arrayList
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = freqMap.get(a); // Get frequency of 'a'
                int freqB = freqMap.get(b); // Get frequency of 'b'
                
                if (freqA != freqB) {
                    // Sort by frequency (ascending)
                    return Integer.compare(freqA, freqB);
                } else {
                    // If frequencies are the same, sort by element value (ascending)
                    return Integer.compare(a, b);
                }
            }
        });
    }
}
// import java.util.*;

// public class FrequencySort {
//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 2, 4, 3, 3};

//         // Step 1: Count frequency of each element
//         HashMap<Integer, Integer> freqMap = new HashMap<>();
//         for (int num : arr) {
//             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//         }

//         // Step 2: Sort the array based on frequency and value
//         Arrays.sort(arr, new Comparator<Integer>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 int freqA = freqMap.get(a);
//                 int freqB = freqMap.get(b); 
                
//                 if (freqA != freqB) {
//                     return Integer.compare(freqA, freqB);
//                 } else {
//                     // If frequencies are the same, sort by element value (ascending)
//                     return Integer.compare(a, b);
//                 }
//             }
//         });

//         // Print the sorted array
//         System.out.println(Arrays.toString(arr));
//     }
// }
