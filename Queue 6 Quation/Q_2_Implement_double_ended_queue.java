public class Q_2_Implement_double_ended_queue {
    static int front=0;
    static int end=0;
    static int ary[]=new int[50];
    public static int add_first(int value)
    {
        if(front==0)
        {
            System.out.println("queue is alredy full in first");
            return end;
        }
        front--;
        ary[front]=value;

        return front;
    }
    public static int add_last(int value)
    {
        if(end== ary.length)
        {
            System.out.println("queue is alredy full from last");
            return end;
        }
if(end<front)
{
    end=front;
}
        ary[end]=value;
end++;
        return end;
    }
    //
    public static int remove_first()
    {
        if(front>end)
        {
            System.out.println("queue is empty in first");
            return end;
        }
        front++;

        return front;
    }
    public static int remove_last()
    {
        if(front>end)
        {
            System.out.println("queue is empty");
            return end;
        }

       end--;
        return end;
    }

    public static void first_peek () {
        System.out.println("Front peek is : "+ary[front]);
    }
    public static void last_peek () {
        System.out.println("Front peek is : "+ary[end]);
    }

    public static void getFront() {
        System.out.println(ary[front]);
    }

    public static void getEnd() {
        System.out.println(ary[end]);
    }

    public static void getAry() {
        for(int i=front;i<end;i++)
        {
            System.out.println(ary[i]);
        }
    }

    public static void main(String[] args) {
       add_last(10);
       add_last(16);
       add_last(60);
       add_last(78);
       add_last(78);
       getAry();
       remove_first();
       remove_first();
        System.out.println("After deleting : ");
        getAry();
        add_first(3456);
        add_first(432);
        System.out.println("After adding : ");
        getAry();

    }
}
