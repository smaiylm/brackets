class Tester
{
  public static void main(String[] args)
  {
    BST<Integer, String> tree = new BST<Integer, String>();
    tree.insert(15,"A");
    tree.insert(20,"B");
    tree.insert(25,"C");
    tree.insert(18,"D");
//BSTNode rt is needed
    tree.isComplete();
  }
}