package Assignment5;
// author Hassan Nassif
    public class CirculardoublyLinkedList implements DLLInterface{
    
    private DLLNode head;

    public CirculardoublyLinkedList() {
        this.head = null;
    }

    public CirculardoublyLinkedList(DLLNode head) {
        this.head = head;
    }
    
     public CirculardoublyLinkedList(Object headValue) {
        this.head = new DLLNode(headValue);
    }
     
    public int size(){
        if(head.getNext()==null){
            return 0;
        }else{
            DLLNode current = this.head;
            int counter = 0;
            while(current.getNext()!=this.head){
                current=current.getNext();
                counter++;
            }
            return counter;
            
        }
        
        
    }
    public boolean isEmpty(){
        if(head.getNext()==null){
            return true;
        }
        else 
            return false;
    }
        
  @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertAtBack(Object newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertAtFront(Object newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  
  
  
    }
    

