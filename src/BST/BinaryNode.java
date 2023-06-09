package BST;
public class BinaryNode extends Node {
   Node root = null;
    public boolean search(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
   public boolean insert(int value){
       Node newNode = new Node(value);
       if (root == null){
           root = newNode;
           return true;
       }
       Node test = root;
       while(true){
           if(newNode.value==test.value)
               return false;
           if(newNode.value< test.value){
               if(test.left==null){
                   test.left = newNode;
                   return true;
               }
               test = test.left;
           }
           else {
               if(test.right==null){
                   test.right = newNode;
                   return true;
               }
               test = test.right;
           }
       }
   }
}
