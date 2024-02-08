//public class Q_14_Detecte_Loop_in_linkedlist {
//    public static void main(String[] args) {
//
//    }
//
//    public void detectloop() {
//        if(head==null)
//        {
//            System.out.println("emty list");
//            return;
//        }
//        Node fast = head.next;
//        Node slow = head;
//while(fast.next!=null)
//{
//    slow=slow.next;
//    fast=fast.next.next;
//    if(slow==fast)
//    {
//        System.out.println("There is loop in linkedlist");
//        return;
//    }
//}
//        System.out.println("No loop singly linklist");
//    }
//}