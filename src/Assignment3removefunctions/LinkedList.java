/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3removefunctions;

/**
 *
 * @author Bader
 */
public class LinkedList implements ListInterface {

     Node head;
     Node next;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(Object nodeValue) {
        this.head = new Node(nodeValue);
    }

    public int size() {
        if (isEmpty()) {
            return 0;
            //you can also check here if head.getNext() == null to return 1
            //but it's not necessary as it will be checked in the loop
        } else {
            Node currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
        //similar to
//        if(this.head == null){
//            return false;
//        } else {
//            return true;
//        }
    }

    //clear linked list
    public void makeEmpty() {
        this.head = null;
    }

    
    public void add(Object newElement) {
        if (head == null) { //or if(isEmpty())
            head = new Node(newElement);
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(newElement));
        }
    }

    public Node getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        //initialize
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    //remove initial conditions
    public Node getNode(int index) {
        //no need since we are throwing default exception after while loop
//        if (index < 0 || index >= size()) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else if (isEmpty()) {
//            throw new RuntimeException("Cannot fetch node, list is empty!");
//        } else {

        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null) {
            if (i == index) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.getNext();
        }
        throw new RuntimeException("Object at given index is not found!");
//        }
    }

    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    //similar to contain method
    public int indexOf(Object element) {
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            //TODO: solve on your own for course homework
            if (currentNode.getValue().equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    //TODO: homework remove element from back

    /**
     *
     * @return
     */
    public void remove() {
   if(this.isEmpty())
        {
            throw new RuntimeException("list is empty");
        }
        Node current = head;
        while(this.isEmpty()==false){
          if(current.next != null){
          } else {
              current = null;
          }
          current = current.next;
          
        }
    }

    //Course & Lab homework
    //Hint: make use of get functions defined above
    public Object remove(int index) {
       Node current = head;
        Node oldNode;
        int counter=0;
        while(current!=null)
        {
            if(counter == index)
            {
                oldNode = current;
                return current;
                
            }
            counter++;
            current=current.next;
            
        }
         throw new RuntimeException("index "+index+" not found." );
       
    }
    

    public boolean remove(Object element) {
         Node current = head;
        Node oldNode;
        while(current != null)
        {
            if(current.value.equals(element))
            {
                oldNode = current.next;
                current = null;
                return true; 
            }
            current=current.next;
    }
        return false;
    }

    
    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        
        if (list1.isEmpty()) //if list1.head == null
        {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        if (list1.isEmpty() && list2.isEmpty()) {
            throw new RuntimeException();
        }
      
        LinkedList mergedList2 = list1;
        mergedList2.getTailNode().setNext(list2.getHeadNode());

        return mergedList2; 
    }

    void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }
}
