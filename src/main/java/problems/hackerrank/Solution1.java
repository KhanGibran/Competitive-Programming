package problems.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution1
{
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//        String arrayItems[] = bufferedReader.readLine().split(" ");
        int n=9;
        int arr[] =  new int[]{10, 20, 20,10, 10, 30, 50, 10, 20};

//        for(int i=0;i<n;i++){
//            arr[i++] = Integer.parseInt(arrayItems[i]);
//        }

        System.out.println(sockMerchant(arr,n));
    }

    private static int sockMerchant(int[] arr, int n) {
        int pairs = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int x : arr) {
            if (hashMap.containsKey(x)) {
                int keyValue = hashMap.get(x);
                hashMap.put(x, keyValue + 1);
            } else {
                hashMap.put(x, 1);
            }
        }

        for (Map.Entry entrySet : hashMap.entrySet()) {
            int entryKey = (Integer) entrySet.getKey();
            int entryValue = (Integer) entrySet.getValue();
            if (entryValue >= 2) {
                pairs += entryValue / 2;
            }
        }
        return pairs;
    }
}
