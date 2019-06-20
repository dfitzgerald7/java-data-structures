
public class LinkedList {
    Node head; 

    public LinkedList(Node node) {
        head = node;
    } 

    void push(Node node){
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    void print() {
        Node current = head;
        System.out.println("Printing List: ");
        while(current != null){
            System.out.println(current.id);
            current = current.next; 
        }
        
    }

    public static void main(String[] args){
        System.out.println("Test 2");
    }
}


class LinkedListTest {
    public static void main(String[] args){
        Node head = new Node(1);
        LinkedList myList = new LinkedList(head);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        myList.print();

        Node fourth = new Node(4);
        myList.push(fourth);
        myList.print();
    }
}

