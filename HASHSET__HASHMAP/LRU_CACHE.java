import org.w3c.dom.Node;

import java.util.HashMap;

public class LRU_CACHE {
    public static void main(String[] args) {

        lru lru = new lru(4);
        lru.add(1);
        lru.add(2);
        lru.add(3);
        lru.add(2);
        lru.add(4);
        lru.add(5);
        lru.add(6);
        lru.add(5);
        lru.print();
    }
}
    class lru
    {
        HashMap<Integer, node> hm = new HashMap<>();
        doublyll dl = new doublyll();
        int capicity;


        public lru(int x)
        {
            this.capicity = x;
        }

        public void add(int val)
        {
           if(hm.containsKey(val)) {
               if (dl.istail(val)) {
                   return;
               }
               node adress = (node) hm.get(val);
               dl.remove(adress);
               hm.remove(val);
           }
               if(hm.size() == capicity)
               {
                   int d = dl.removeFirst();
                   hm.remove(d);
               }
node nn = dl.insertLast(val);
               hm.put(val,nn);


        }
        public void print() {
            dl.print();
        }
    }


    class doublyll
    {
        node head,tail;

public void addlast(int data)
{
    node nn = new node(data);
    if(head==null)
    {
head=tail=nn;
    }
    tail.next=nn;
    nn.prev=tail;
    tail=nn;
}
        public node insertLast(int data) {
            node nn = new node(data);
            if (head == null){
                head = tail = nn;
            }else {
                tail.next = nn;
                nn.prev = tail;
                tail = nn;
            }
            return nn;
        }
public boolean istail(int x)
{
    if(tail.data == x) return true;
    return false;
}
        public void print() {
            if (head == null){
                return;
            }
            node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
public void deletefirst()
{
    if(head==null)
    {
        System.out.println("alredy empty");
        return;
    }
    if(head.next==null)
    {
        head = null;
        tail = null;
        return;
    }
    node temp=head;
    head=head.next;
    temp=null;
}

        public boolean empty() {
    if(head==null) return true;

    return false;
        }

        public void remove(node address) {
            if(head == address && head == tail){
                head = tail = null;
            }else if (address == head){
                head = head.next;
                head.prev = null;
            }else {
                address.prev.next = address.next;
                address.next.prev = address.prev;
            }
        }

        public int removeFirst() {
            int data = head.data;
            head = head.next;
            head.prev = null;
            return data;
        }
    }
class node
{
    int data;
    node next,prev;
    public node(int val)
    {
        data=val;
    }
}


