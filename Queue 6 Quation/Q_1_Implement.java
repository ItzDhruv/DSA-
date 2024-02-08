public class Q_1_Implement {
    static int front=0;
    static int end=0;
    static int ary[]=new int[50];
    public static int add(int value)
    {
        if(ary.length==end)
        {
            System.out.println("queue is full");
            return end;
        }
        ary[end]=value;
        end++;
        return end;
    }
    public static int remove()
    {
        if(front==end)
        {
            System.out.println("Queue is already empty.");
            return front;
        }
        front++;
        return front;
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
add(10);
add(20);
add(34);
add(44);
remove();
getFront();
getAry();
    }
}
