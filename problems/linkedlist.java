package problems;
public class linkedlist{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int d)
    {
       Node newnode = new Node(d);
       if(head==null)
       {
        head = newnode;
        tail = head;
       }
       else{
        tail.next = newnode;
        tail = newnode;
       }
    }
    public void pop()
    {
        Node n = head.next;
        head = n;
    }
    public void lpop()
    {
        Node n = head;
        while(n.next.next!=null)
        {
            n = n.next;
        }
        n.next = null;
        tail = n;
    }
    public void middle()
    {
        Node n = head;
        int length = 1;
        while(n.next!=null)
        {
            length++;
            n = n.next;
        }
        int mid = length/2;
        n = head;
        int ref = 1;
        while(n.next!=null)
        {
            if(ref==mid+1)
            {
                System.out.println(n.data);
                break;
            }
            ref++;
            n = n.next;
        }
        

    }
    public void display()
    {
        Node n = head;
        while(n!=tail)
        {
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String[]args)
    {
        linkedlist l = new linkedlist();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        l.display();
        l.middle();
        l.lpop();
        l.display();
        l.middle();
    }
}