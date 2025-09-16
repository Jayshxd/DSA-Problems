package com.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternateElementsBySign {

    public static void main(String[] args) {
    int[] arr = {1,2,-3,-1,-2,-3};
    int[] arr2 = {1,2,-4,-5,3,4};
    int n = arr.length;
    int[] result = brute(arr,n);
    int[] result1 = optimal1(arr,n);
    int[] result2 = bestOptimal(arr,n);
    int[] result3 = varient2(arr2,n);
    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(result1));
    System.out.println(Arrays.toString(result2));
    System.out.println(Arrays.toString(result3));
    }
    //inplace
    //Time Complexity: O(n²)
    //Space Complexity: O(1)
    static int[] brute(int[] arr,int n){
        for(int i = 0;i<n;i++){
            if(i%2==0){
                if(arr[i]<0){
                    for(int x : arr){
                        if(x>0){
                            int temp = arr[i];
                            arr[i]=x;
                            x=temp;
                            break;
                        }
                    }
                }
            }else{
                if(arr[i]>0){
                    for(int x : arr){
                        if(x<0){
                            int temp = arr[i];
                            arr[i]=x;
                            x=temp;
                            break;
                        }
                    }
                }
            }
        }
        return arr;
    }

    //2 seperate arrays 1 for +ve and 1 for -ve and add those into the array again by alternate
    /*
    Time: O(n) (ek baar traverse, fir merge)
    Space: O(n) (kyunki 2 extra arrays bana rahe ho)
     */
    static int[] optimal1(int[] arr,int n){
        int[] ap = new int[n/2]; //n/2 since equal number of +ve and -ve
        int[] an = new int[n/2];
        int app = 0;
        int ann = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>0){
                ap[app++]=arr[i];
            }else{
                an[ann++]=arr[i];
            }
        }
        app=0;
        ann=0;
        int i = 0;
        while(app<ap.length && ann<an.length){
            arr[i++]=ap[app++];
            arr[i++]=an[ann++];
        }
        return arr;
    }

    //only 1 seperate arr to pur +ve and -ve
    /*
    Time Complexity
    Loop ek hi baar chala n times.
    Har step constant time me kaam ho raha hai.
                👉 O(n)

    Space Complexity
    Ek new array ans[] banayi size n.
                👉 O(n) extra space
        */
    static int[] bestOptimal(int[] arr,int n){
        int[] ans = new int[n];
        int pp = 0;
        int np = 1;
        for(int i = 0; i<n;i++){
            if(arr[i]>0){

            ans[pp]=arr[i];
            pp+=2;
            }else {
                ans[np] = arr[i];
                np += 2;
            }
        }
        return ans;
    }

    //for arr where +ve and -ve numbers are not equal.
    /*
            🔹 Time & Space Complexity

                Step 1: Split into two ArrayLists → O(n)

            Step 2: Fill array based on smaller size → O(n)

            Total Time = O(n)

            Space = O(n) (because of extra ArrayLists)
     */
    static int[] varient2(int[] arr,int n){
        ArrayList<Integer> ap = new ArrayList<>();
        ArrayList<Integer> an = new ArrayList<>();
        for(int x : arr){
            if(x>=0){
                ap.add(x);
            }else{
                an.add(x);
            }
        }
        //there can be 2 cases
        //either pos>neg or neg>pos
        //means jiske elements kam hai utna hee hum loop lagayenge
        if(ap.size()>an.size()){
            for(int i = 0; i<an.size();i++){
                arr[2*i] = ap.get(i);
                arr[2*i+1] = an.get(i);
            }
            int index = an.size()*2;
            for(int i = an.size(); i<ap.size();i++){
                arr[index++] = ap.get(i);
            }
        }else{
            for(int i = 0; i<ap.size();i++){
                arr[2*i] = ap.get(i);
                arr[2*i+1] = an.get(i);
            }
            int index = ap.size()*2;
            for(int i = ap.size(); i<an.size();i++){
                arr[index++] = an.get(i);
            }
        }
        return arr;
    }
}



