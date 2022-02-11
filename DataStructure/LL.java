public class LL {
    Node head; // head
    class Node{
        String data;
        Node next;
                        //created a node 
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // inserting data to list . 
    //begining to list 

    public void addFirst(String data){
        Node newNode = new Node(data);
            if(head==null){
                    head = newNode;
                    return;
            }
            newNode.next=head;
            head=newNode;
    }

    // adding last to the list
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }
    //printing linkedlsit
    public void printList(){
        if(head==null){
            System.out.println("list is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
    //deleting Node from start
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head =head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
       Node secondLast = head;
       Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("is"); 
        list.addLast("a");
        list.addFirst("this");
        list.addLast("list");

        list.printList();
    }

}
