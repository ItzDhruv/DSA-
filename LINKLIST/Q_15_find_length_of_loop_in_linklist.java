//public class Q_15_find_length_of_loop_in_linklist {
//    public static void main(String[] args) {
//
//    }
//
//    public void lengthofloopinlist()
//    {
//        if(head==null)
//        {
//            System.out.println("emty list");
//            return;
//        }
//        Node fast = head.next;
//        Node slow = head;
//        while(fast.next!=null)
//        {
//            if(slow==fast)
//            {
//                break;
//            }
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        int count=1;
//        while (fast.next!=slow)
//        {
//            fast=fast.next;
//            count++;
//        }
//        System.out.println("loop size is : "+count);
//    }
//}
//
//
//
//
//
