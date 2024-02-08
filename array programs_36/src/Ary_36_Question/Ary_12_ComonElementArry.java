package Ary_36_Question;

public class Ary_12_ComonElementArry {
    public static void main(String[] args) {
        int []ary={1,2,3,10,5};
        int []ary2={3,4,6,1,10,12};
        System.out.print("Same value is : ");
        for(int i=0;i<ary.length;i++)
        {
            for(int j=0;j<ary.length;j++)
            {
                if(ary[i]==ary2[j])
                {
                    System.out.print("  "+ary[i]);

                }
            }
        }
    }
}
