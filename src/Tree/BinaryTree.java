/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author hassan nassif
 * @param <T>
 */
public class BinaryTree<T> {
 private BinaryNode Root;
	
	public BinaryTree()
	{
		Root = null;
	}
	
    public BinaryTree( T rootValue )
    {
        Root = new BinaryNode( rootValue, null, null );
    }
    
	public BinaryTree(BinaryNode theRoot)
	{
		Root = theRoot;
	}

    public BinaryNode getRoot( )
    {
        return Root;
    }
    
    public void makeEmpty( )
    {
        Root = null;
    }

    public boolean isEmpty( )
    {
        return Root == null;
    }

    public void printPreOrder( ) // N L R
    {
      if( Root != null )
          printPreOrder(Root);   // Method 1
       // Root.printPreOrder( ); // Method 2
    }
   
    // Method 1 - recursive helper
    private void printPreOrder(BinaryNode cn)
    {
       System.out.println(cn.getElement().toString());
       
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
    }

    public void printInOrder( )
    {
        if( Root != null )
        	printInOrder(Root); // Method 1
          	// Root.printInOrder( );  // Method 2
    }
    
    // Method 1 - recursive helper
    private void printInOrder(BinaryNode CR) // L N R
    {
    	if (CR.getLeft() != null)
    		printInOrder(CR.getLeft());
    		
    	System.out.println(CR.getElement().toString());
    	
    	if (CR.getRight() != null)
    		printInOrder(CR.getRight());	
    }

    public void printPostOrder( )
    {
      if( Root != null )
          printPostOrder(Root);   // Method 1
       // Root.printPostOrder( ); // Method 2
    }

    // Method 1 - recursive helper
    private void printPostOrder(BinaryNode cn) // RECURSION HELPER
    {      
       if(cn.getLeft() != null)
    	   printPreOrder(cn.getLeft());
       
       if(cn.getRight() != null)
    	   printPreOrder(cn.getRight());
       
       System.out.println(cn.getElement().toString());
    }
    
    public void PrintLevelOrder() // Using a Queue
    {    	
    	if (Root == null)
    		System.out.println("Tree is empty");
    	else
    	{
        /*
            LinkedQueue<BinaryNode> q = new LinkedQueue<BinaryNode>();
            q.Enqueue(Root);    
        	
        	BinaryNode n;
    		while (! q.isEmpty())
    		{
    			n = q.getFront();
    			// add its left to the q
    			if (n.getLeft() != null)
    				q.Enqueue(n.getLeft());
    			
    			// add its right to the q
    			if (n.getRight() != null)
    				q.Enqueue(n.getRight());
    			
    			// print the value of the node
    			System.out.println(n.getElement().toString());		
    			
    			// remove the node from the q
    			q.Dequeue();
    		}
        */
    	}
    }
    
    public int Size( )
    {
    	return Size(Root);  // Method 1
        // return Root.Size( );  // Method 2
    }

    // Method 1 - recursive helper
    private int Size( BinaryNode currentRoot )
    {
        if( currentRoot == null )
            return 0;
        else
            return 1 + Size( currentRoot.getLeft() ) + Size( currentRoot.getRight() );
    }  
    
     public boolean contains(T item) {
        if (Root == null) {
            return false;
        }

        return contains(Root,item);
    }
     private boolean contains(BinaryNode cn,T item){
          if(item == cn.getElement())
            return true;
          else {
            if(cn.getLeft() != null)
                return contains(cn.getLeft(),item);
             if(cn.getRight() != null)
                return contains(cn.getRight(),item);
        }     
        return false;
     }
      public int count(T item) {
          int count=0;
        if (Root == null) {
            return 0;
        }

        return count(Root,item);
    }
      private int count(BinaryNode cn,T item){
         
          if(cn == null)
            return 0;
         
          else 
              if(cn.getElement() == item)
                  return count(cn.getLeft(),item) + 1 + count(cn.getRight(),item);
          else  
            return count(cn.getLeft(),item) + count(cn.getRight(),item);
     }
//question 3
public int countTwoChildrenNodes(){
        return countTwoChildrenNodes(Root);
    }
    
    private int countTwoChildrenNodes(BinaryNode node){
        int count = 0;    
        if(node != null){
            if(node.getLeft()!=null && node.getRight()!=null){
                count++;
            }
            countTwoChildrenNodes(node.getLeft());
            countTwoChildrenNodes(node.getRight());
        }
           
        
        return count;
    }
//question 2
public int mirrorTreeRecursive(){
        mirrorTree(Root);
    }
    private int mirrorTreeRecursive(BinaryNode X){
        if(X == null) ;
        throw new RunTimeException();
         if (X.getLeft()!=null)
         mirrorRecursiveTree(X.getLeft());
         if (X.getRight()!=null)
         mirrorRecursiveTree(X.getRight());
        Node temp = X.Left;
        X.getLeft = X.getRight;
        X.getRight = temp;
    }
      return X;
           
       }

  