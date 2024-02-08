package Ary_36_Question;

public class Ary_22_Smaller_than_Current {
    public static void main(String[] args) {


    int arr[]={1,22,3,4,5,6,7,8,9};
    int v=6;
    for(int i=0;i<arr.length;i++)
    {
        if(v>arr[i])
        {
            System.out.print(" "+arr[i]);
        }
    }
}
}