class heloww
{
    public static void main(String[] args) {
      int nums[]={1000000,1,1000000};
                long max=0;
                for(int i=0;i<nums.length;i++)
                {
                    for(int j=0;j<nums.length;j++)
                    {
                        for(int k=0;k<nums.length;k++)
                        {
                            long x =((long)nums[i] - (long)nums[j]) * (long)nums[k];
                            if(i<j && j<k )
                            {
                                if( x>max )
                                {
                                    max = (long)(nums[i] - (long)nums[j]) * (long)nums[k];
                                }
                            }
                        }
                    }
        }
                    System.out.println(max);
    }
}