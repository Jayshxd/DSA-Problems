class Solution {
    public int[] plusOne(int[] arr) {
        /*last digit is 9 
          new arr = old arr length + 1;
          copy elements and 1, 0 at end

        last digit is not 9
            change the last digit

        if all 9 
            carry = 0;


        2 arrays 
        2 ptrs = one at org array and one at new array -> both starting from end 
        maintain a carry 
        if curr is 9 then set carry 1 
        if not then set carry 0
        if the number is 9
            we will place 0 at new array ptr
            and add carry to next number 1
          */  
          if(arr.length==1 && arr[0]==9){
            return new int[]{1,0};
          }
          if(arr.length==1){
            return new int[]{arr[0]+1};
          }

          boolean flag = true;
          for(int i : arr){
            if(i!=9){
                flag = false;
                break;
            }
          }

          if(flag){
            int[] na = new int[arr.length+1];
            na[0] = 1;
            for(int i = 1; i<na.length; i++) na[i] = 0;
            return na;
          }else{
            // 1 2 3 9 9 9;
            int carry = 0;
            for(int i = arr.length-1; i>=0; i--){
                if(arr[i]==9){
                    arr[i]=0;
                }else{
                    arr[i] = arr[i] + 1;
                    break;
                }
            }
            return arr;
          }
    }
}
