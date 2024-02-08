package Ary_36_Question;

public class Ary_18_DublicateArry {
    public static void main(String[] args) {

        int ary[] = {1, 2,2, 3, 4, 5};
        int v = 6;
        boolean ans = false;
        int count=0;
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]==v)
            {
                count++;
            }
        }

            for (int j = 0; j < ary.length; j++) {
                if (ary[j] == v) {

                    if (ans == true) {
                        System.out.println("This number is Dublicate : " + v);
                        return;
                    }
                    ans=true;
                    }

                }
if(count>0) {
    System.out.println("Not Duplicate : " + v);
}
else {
    System.out.println("This num not present : "+v);
}

    }
}

