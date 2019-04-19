
public class BST {
    public Node createnode(int k){
        Node a=new Node();
        a.data=k;
        a.right=null;
        a.left=null;
        return a;
    }
    Node root;
    void insert(int key) { 
           root = insertnode(key,root); 
        }
    void remove(int key) { 
           root = removenode(key,root); 
        }
    public Node insertnode(int val,Node n){
        if(n==null)
            return createnode(val);
        if(val>n.data)
            n.right=insertnode(val,n.right);
        else if(val<n.data)
            n.left=insertnode(val,n.left);
        return n;
    }
    public Node removenode(int val,Node n){
        if(n==null)
        {
            return null;
        }
        if(val<n.data)
            n.left=removenode(val,n.left);
        else if(val>n.data)
            n.right=removenode(val,n.right);
        else{
            if(n.right== null || n.left== null)
                {
                Node temp=null;
                temp=n.left==null?n.right : n.left;
                return temp==null? null : temp;
                }
        else
        {    Node successor=getsuccessor(n);
            n.data=successor.data;
            n.right=removenode(successor.data,n);
            return n;
        }
    }
        return n;
    }
    public Node getsuccessor(Node node){
        if(node==null)
            return null;
        Node temp=node.right;
        while(temp.left!=null)
            temp=temp.left;
        return temp;
    }
     void inorder()  { 
         printviainorder(root); 
        } 
            
    public void printviainorder(Node n){
        if(n==null)
            return;
        else{
            printviainorder(n.left);
            System.out.println(n.data);
            printviainorder(n.right);
        }
    }
        
}



