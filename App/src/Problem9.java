import java.util.*;

public class Problem9 {

    static void twoSum(int[] nums,int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){

            int complement=target-num;

            if(map.containsKey(complement)){
                System.out.println(num+" + "+complement+" = "+target);
            }

            map.put(num,1);
        }
    }

    public static void main(String[] args){

        int[] arr={500,300,200};

        twoSum(arr,500);
    }
}