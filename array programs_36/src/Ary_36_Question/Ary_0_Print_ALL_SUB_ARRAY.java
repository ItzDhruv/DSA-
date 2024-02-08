package Ary_36_Question;

class Solution {
    public static void main(String[] args) {

    int nums[]={3,2,1};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {

                max2=max1;
                max3=max2;
                max1=nums[i];
            }
            if(nums[i]>max2 && nums[i]<max1)
            {

                max3=max2;
                max2=nums[i];
            }
            if(nums[i]>max3 && nums[i]<max2)
            {
                max3=nums[i];
            }
        }
        if(nums.length<3)
        {
            System.out.println(max1);
        return;
        }
        System.out.println(max3);    }
}