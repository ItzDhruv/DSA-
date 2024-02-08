package Array_Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import java.util.Set;

class a
{
    public static void main(String[] args) {
        int nums[]={2,2,2,1,4,5};
        if(nums.length <= 2) {
            System.out.println(false);
            return;
        }
        int dicision =0;
        for(int i =0;i<nums.length-1;i++)
        {
            if(dicision == 1)    // for increasing
            {
                if(nums[i]>nums[i+1]) {
                    System.out.println(false);
                    return;
                }
            }
            else if (dicision == -1)
            {
                if(nums[i]<nums[i+1])  {
                    System.out.println(false);
                    return;
                }
            }
            else if(dicision == 0)
            {
                if(nums[i]<nums[i+1])
                {
                    dicision = 1;
                }
                else if(nums[i]>nums[i+1])
                {
                    dicision = -1;
                }
                else
                {
                    dicision = 0;
                }
            }
        }
        System.out.println(true);    }
}