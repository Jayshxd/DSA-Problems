package com.dsa.problems.arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        List<List<Integer>> res1 = brute(arr,n);
        List<List<Integer>> res2 = better(arr,n);
        List<List<Integer>> res3 = optimal(arr,n);
        System.out.println(res3);
    }

    /*
    Time Complexity: O(N3 * log(no. of unique triplets)), where N = size of the array.
Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.
     */
    static List<List<Integer>> brute(int[] arr,int n){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }


    /*
    Time Complexity: O(N2 * log(no. of unique triplets)), where N = size of the array.
Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set.
     */
    static  List<List<Integer>> better(int[] a,int n){
       //a[i]+a[j]+a[k] = 0 ->  a[k] = -(a[i]+a[j])
       //if a[k] contains then -> triplet
       //but add a[j] in a set if not contains
       //after j loop complete clear set
       Set<List<Integer>> set = new HashSet<>();
       for(int i=0;i<n;i++){
           Set<Integer> tempSet = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int check = -(a[i]+a[j]);
                if(tempSet.contains(check)){
                    List<Integer> temp = Arrays.asList(a[i],a[j],check);
                    temp.sort(null);
                    set.add(temp);
                }
                tempSet.add(a[j]);
            }
       }
       return new ArrayList<>(set);
    }


    /*
    Time Complexity: O(NlogN)+O(N2), where N = size of the array.
Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2).

Space Complexity: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
     */
    static List<List<Integer>> optimal(int[] a,int n){
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(i>0 && a[i]==a[i-1])continue;
            int j = i+1; int k = n-1;
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                if(sum==0){
                    res.add(Arrays.asList(a[i],a[j],a[k]));
                    while(j<k && a[j]==a[j+1]){
                        j++;
                    }
                    while(j<k && a[k]==a[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}
