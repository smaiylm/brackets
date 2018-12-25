/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/
import java.lang.Math;
import java.lang.Comparable;

/** Binary Search Tree implementation for Dictionary ADT */
class BST<Key extends Comparable<? super Key>, E>
         implements Dictionary<Key, E> {
  private BSTNode<Key,E> root; // Root of the BST
  int nodecount;             // Number of nodes in the BST

  /** Constructor */
  BST() { root = null; nodecount = 0; }

  /** Reinitialize tree */
  public void clear() { root = null; nodecount = 0; }

  /** Insert a record into the tree.
      @param k Key value of the record.
      @param e The record to insert. */
  public void insert(Key k, E e) {
    root = inserthelp(root, k, e);
    nodecount++;
  }

  /** Remove a record from the tree.
      @param k Key value of record to remove.
      @return The record removed, null if there is none. */
  public E remove(Key k) {
    E temp = findhelp(root, k);   // First find it
    if (temp != null) {
      root = removehelp(root, k); // Now remove it
      nodecount--;
    }
    return temp;
  }

  /** Remove and return the root node from the dictionary.
      @return The record removed, null if tree is empty. */
  public E removeAny() {
    if (root == null) return null;
    E temp = root.element();
    root = removehelp(root, root.key());
    nodecount--;
    return temp;
  }

  //INSERTING A METHOD FROM 5.20
  
//Use inorder traversal - Left, Visit, Right
  
  public void printRange(BSTNode<Key, E> rt, Key lo, Key hi){
	  
	  printRangeHelp(rt, lo, hi);
  }
  
  
  
  
  
  
  public boolean checkBST(BSTNode <Key, E> rt){
	  
	  if (rt == null){
		  return false;
	  }
	  if(rt.key().compareTo(rt.left().key()) > 0 && rt.key().compareTo(rt.right().key() < 0 ){
		  
	  }
			  
	  
	  
	  
	return false;
	  
  }
  
  
  
  
  
  public BinNode<E> pruneLeaves(BinNode<E> rt){

  if(rt == null){
  return rt;
  }

  
  
  
  
  return rt;
  }
  
  
  
  
  
  
 public boolean isFull(BSTNode<Key, E> rt){
  

if(rt == null || rt.isLeaf()){

return true;

}

if(rt.left()== null && rt.right() == null)

return true;

if(rt.left() == null || rt.right() == null){

return false;

}

return true;
 }
  
  
  
 
 
 
 
 
 public boolean isBalanced(BSTNode<Key, E> rt){
	// boolean removed = true;

	 int leftHeight = getHeightHelp(root.left());

	 int rightHeight = getHeightHelp(root.right());

	 if (Math.abs(leftHeight - rightHeight)  > 1){

	 return false;

	 }

	 return true;

	 
	 //return removed;
	 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
  
  public void printRangeHelp(BSTNode<Key, E> rt, Key lo, Key hi){
	  
	  
	 //base case 
	  if (rt == null){
		 
		  return ; 

		  
	  }	  
	  
	//recursive case	  
		  
	  //printRangeHelp(rt.right(), lo, hi);
	   //compare if the key is between the low and hi
	  if (rt.key().compareTo(lo) > 0 && rt.key().compareTo(hi) < 0){
		  
		  System.out.println(rt.key() + "");
	  }
		  
	  
	  printRangeHelp(rt.right(), lo, hi);
		  
		 
		  
	  
  }
  
  
  

  
  //5.20 ending
  
  //printRange(BSTNode<>)
  
  
 
  
  
  
  //GETHEIGHT Method
  
  
  private int getHeightHelp(BSTNode<Key, E> root) { 
	  
	  
	  if(root == null)
		  return 0;
	  
	  if(root.isLeaf() == true)
		  return 0;
	  

		  //recursive call of the method
	  int leftHeight = getHeightHelp(root.left());
	  int rightHeight = getHeightHelp(root.right());
	  
	  
	  //check if one is bigger than the other
	  
	  if(leftHeight > rightHeight){
		  
		  return leftHeight + 1;   //return 1 + the largest height
	  }
	  
	  
	  else{
		  
		  return rightHeight + 1; //if the larger height is the right one
	  }
	  
	  
	  
  }
	  public int getHeight(){
	  
	  
	  return getHeightHelp(root);
	}
  
  
  
  
  
 


  //GETHEIGHT Method ends
  
  
  
	//isComplete method
	  
	  
	  public boolean isCompleteHelp (BSTNode<Key, E> root){
		  
		  LQueue <BSTNode <Key, E>>	q = new LQueue <BSTNode <Key, E>>();
		  boolean isComplete = true;
		  int nodecount = 0;
		  int leafcount = 0;
		  
		   //check all lines except last one
		   
			  
			  
			  if (root == null){
					 
				  return false ; 

				  
				 
			  }	  
			  
			  
			  //first run
			  if(root !=null ){
			  q.enqueue(root);
			 
			  }
			  
			  while(q.length() >0){     //while the amount of items in the queue is not zero ->goes through all nodes in the binary tree
				  
				 // q.enqueue(q.frontValue());
				  if(q.frontValue().isLeaf()) {   //if it is a leaf, don't enqueue the value left, because Null Pointer Exception. Just dequeue the frontValue itself.
					  leafcount ++;
				  }
				  //use nodecount
				  else{ //if it is not a leaf...
					  	if (q.frontValue().left() == null || q.frontValue().right() == null){ //if the current node is NOT a leaf AND has only one child, the tree is not complete.
					  			isComplete = false;
					  		}
				  		else{ //in case the node has two children (both left and right)
				  				q.enqueue(q.frontValue().left());
				  				q.enqueue(q.frontValue().right());
				  			}
				  }
				  
				  
				  
				  
				  
				  q.dequeue(); //removes the front value
				  
				  
				  
				  
				  nodecount ++;
			
				  
			  }
			  
			  
			  int nodecountSupposed = (int) Math.pow(2, getHeight() - 1);
			 
			if(nodecount < nodecountSupposed - leafcount)  {
				
				isComplete = false;
			}
				
			 
			  
			  
			  
			  
		   
		 
		return isComplete;
		   
		   
		   
		   
}

	  
	  public boolean isComplete () {
		  
		  return isCompleteHelp(root);
	  }
	  
	  
	  
	  //isComplete ends
	  
  
	  //toStringLines method
	  
	  public void toStringLines (){
		  
		  return toStringLinesHelper;
	  }
	  
	  
	  
	  
	  
	  public void toStringLinesHelper(BSTNode<Key, E> root){
		  LQueue <BSTNode <Key, E>>	 queueOfNodes;
		  
		  if (root == null){
				 
			  return ; 

			  
		  }	  
		  // while(queueOfNodes.length() > 0){
		  queueOfNodes.enqueue(root);
		  //enqueue non-null children of the front value - uSE THE FRONT VALUE - no recursion
		  queueOfNodes.enqueue(root.left());
		  queueOfNodes.enqueue(root.right());
		  queueOfNodes.dequeue();   //also print it 
		  queueOfNodes.enqueue(); 
		  //come up with a recursive definition - how to call the method itself... or is it possible?
		  
		  //} while loop ends
		  //revision two - make sure A is printed on the first line,  B and C on second line - line breaks
		  
		  
	  }
	  
	  
	  //if root is re-assigned, the first root gets deleted - DOES NOT WORK
	  
	  private void toStringLinesHelper (BSTNode<Key, E>a){
		  if (root == null){
			  
			  System.out.println(root);
		  }
		  LQueue <BSTNode<Key, E>> q = new LQueue <BSTNode<Key, E>>();
		  
	  // if (frontValue()==null) ->< checks if the front value is null. Null pointer exception printed out if asked for frontValue.left() is asked
	  
	  
	  
	  while (q.length()> 0){
		  
		  if(root.left() != null){
			  q.enqueue(q.frontValue().left());
			 
		  }
		  
		  
		  if(root.right() != null){
			  
			  q.enqueue(q.frontValue().right());
			  
		  }
		  
		  
		  System.out.println(q.dequeue().key());
		  a = q.frontValue();
		  
		  
	  }
	  
	  
	  
	  
	  
	  }
	  
  
  /** @return Record with key value k, null if none exist.
      @param k The key value to find. */
  public E find(Key k) { return findhelp(root, k); }

  /** @return The number of records in the dictionary. */
  public int size() { return nodecount; }
private E findhelp(BSTNode<Key,E> rt, Key k) {
  if (rt == null) return null;
  if (rt.key().compareTo(k) > 0)
    return findhelp(rt.left(), k);
  else if (rt.key().compareTo(k) == 0) return rt.element();
  else return findhelp(rt.right(), k);
}
/** @return The current subtree, modified to contain
   the new item */
private BSTNode<Key,E> inserthelp(BSTNode<Key,E> rt,
                                  Key k, E e) {
  if (rt == null) return new BSTNode<Key,E>(k, e);
  if (rt.key().compareTo(k) > 0)
    rt.setLeft(inserthelp(rt.left(), k, e));
  else
    rt.setRight(inserthelp(rt.right(), k, e));
  return rt;
}
/** Remove a node with key value k
    @return The tree with the node removed */
private BSTNode<Key,E> removehelp(BSTNode<Key,E> rt,Key k) {     //
  if (rt == null) return null;
  if (rt.key().compareTo(k) > 0)
    rt.setLeft(removehelp(rt.left(), k));
  else if (rt.key().compareTo(k) < 0)
    rt.setRight(removehelp(rt.right(), k));
  else { // Found it
    if (rt.left() == null) return rt.right();
    else if (rt.right() == null) return rt.left();
    else { // Two children
      BSTNode<Key,E> temp = getmin(rt.right());
      rt.setElement(temp.element());
      rt.setKey(temp.key());
      rt.setRight(deletemin(rt.right()));
    }
  }
  return rt;
}
private BSTNode<Key,E> getmin(BSTNode<Key,E> rt) {
  if (rt.left() == null) return rt;
  return getmin(rt.left());
}
private BSTNode<Key,E> deletemin(BSTNode<Key,E> rt) {
  if (rt.left() == null) return rt.right();
  rt.setLeft(deletemin(rt.left()));
  return rt;
}
  private void printhelp(BSTNode<Key,E> rt) {
    if (rt == null) return;
    printhelp(rt.left());
    printVisit(rt.element());
    printhelp(rt.right());
  }

  private StringBuffer out;
//IMPLEMENT GETHEIGHT for hw for 2/2
  public String toString() {
    out = new StringBuffer(100);
    printhelp(root);
    return out.toString();
  }
  private void printVisit(E it) {
    out.append(it + " ");
  }

}