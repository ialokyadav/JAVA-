
import java.util.Scanner;
/*

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linked_List{
    Node  head;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void main() {
        
    } ;
    
}

public class LinkedList{
    public static void main(String args[]) {
        System.out.println("Hello World");
        Linked_List list = new Linked_List();

        int data, len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list : ");
        len = sc.nextInt();

        System.out.println("Enter the node of list : ");
        for(int i = 0; i < len; i++){ 
            data = sc.nextInt();
            list.insert(data);
        }
        list.display();
    }
}
*/

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linked_List{
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }
}

public class LinkedList{
    public static void main(String args[]){
        int len, data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of data : ");
        len = sc.nextInt();

        Linked_List list = new Linked_List();

        for(int i = 0; i < len; i++){
            data = sc.nextInt();
            list.insert(data);
        }

        list.display();

    }
}
