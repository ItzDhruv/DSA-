package Ary_36_Question;

public class Ary_40_subary {
    public static void main(String[] args) {
        int ary[]= {1,6,3,5,7,2};
        int ans=0;
        for(int i=0;i<ary.length;i++)
        {
            int r=i+1;
            int l=ary.length-i;
            int k=l*r;
            ans+=k;
        }
        System.out.println(ans);
    }
}

