
import java.util.*;
public class BST_driverclass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BST root1=new BST();
        int value=0;
        Node r=null;
        do{
            System.out.println("BST-- 1 to insert elements... 2 to delete elements.. 3 to print... 4 to exit");
            value=sc.nextInt();
            
            if(value==1)
            {
                System.out.println("enter the size of BST");
                int n=sc.nextInt();
                int element;
                r=null;
                for(int i=0;i<n;i++)
                {
                    System.out.println("enter your"+(i+1)+" element");
                    element=sc.nextInt();
                    root1.insert(element);
                    
                }
            }
            else if(value==2)
            {
                System.out.println("enter the element to delete");
                int n1=sc.nextInt();
                root1.remove(n1);
            }
            else if(value==3)
            {
                root1.inorder();
            }
            
        }while(value!=4);
            }
        
    }



