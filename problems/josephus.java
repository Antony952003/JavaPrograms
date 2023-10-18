package problems;
import java.util.*;
public class josephus {
    Node head;
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
            newnode.next = head;
        }
        else{
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
    }
    public int calc(int k)
    {
        Node temp,temp1;
        temp = temp1 = head;
        while(temp.next!=temp)
        {
            for(int i=0;i<k-1;i++)
            {
                temp1 = temp;
                temp = temp.next;
            }
            temp1.next = temp.next;
            temp = temp1.next;
        }
        head = temp1;
        return temp1.data;
    }
    public void display()
    {
        Node temp = head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        josephus j = new josephus();
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            j.push(i);
        }
        j.display();
        System.out.println();
        System.out.println("Enter the kth value :");
        int k = sc.nextInt();
        int val = j.calc(k);
        System.out.println(val);
        
        }
    }
