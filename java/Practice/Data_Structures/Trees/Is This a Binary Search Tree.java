/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        if(root!=null){
            
            Node travLeft=root.left;
            Node travRight=root.right;  
          
            if(root.data>travLeft.data || root.data<travRight.data || root.data<travLeft.right.data || root.data>travRight.left.data)
                return true;
           
            checkBST(travRight);
            checkBST(travLeft);
       }
        return false;
    }