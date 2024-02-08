package Ary_36_Question;

public class Ary_20_AllUniqueNumberPrint {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,2,5};
        for(int i=0;i<arr.length;i++)
        {int cont=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        cont++;
                    }
                }
            }
            if(cont==0)
            {
                System.out.println(" "+arr[i]);
            }
        }
    }
}
