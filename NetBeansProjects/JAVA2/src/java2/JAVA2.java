
package java2;
import java.util.LinkedList;
import java.util.ListIterator;
 import java.util.Iterator;
public class JAVA2 {
   
    public static void main(String[] args) {
       LinkedList<Integer> obj=new LinkedList<Integer>();
       Integer iobj1=new Integer(101);
       Integer iobj2=new Integer(102);
       Integer iobj3=new Integer(103);
       Integer iobj4=new Integer(104);
        System.out.println("Size of linkedlist is "+ obj.size());
        obj.add(iobj1);
        obj.add(iobj2);
        obj.add(iobj3);
        obj.add(iobj4);
        System.out.println("\nLinkedList after adding objects is: "+obj);
        System.out.println("Size of linkedlist after adding objects is "+ obj.size());
        obj.remove(iobj2);
        obj.remove(iobj3);
        System.out.println("\nLinkedList after removing objects is: "+obj);
        System.out.println("Size of linkedlist after removing objects is "+ obj.size());
        System.out.println("\nthe final linkedList: ");
        ListIterator i=obj.listIterator();
        
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
        LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           //Traversing the list of elements in reverse order  
           
           
          Iterator i2=ll.descendingIterator();  
           while(i2.hasNext())  
           {  
               System.out.println(i2.next());  
           }      
    }
    
    
}
