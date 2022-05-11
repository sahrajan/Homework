import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;
/**
 * 
 * @author shah
 * @version 7.0
 * @Date 05/11/2022
 *
 * @param <T>
 */
public class LinkedList<T> implements List<T> {
	 
		private Node<T> head;
	    private Node<T> tail;
	    private int size;
	 /**
	  *    
	  */
	public LinkedList() { 
		// Do nothing.
	}
	
	
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
	
		 Node<T> newNode = new Node<T>(item, null);
	        if(tail == null){
	            head = newNode;
	            tail = newNode;
	        }else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        size++;
	    }
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		 	size = 0;
	        head = null;
	        tail = null;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		 Node<T> data = head;
			
	        while (data != null && !data.data.equals(item))
	            {
	                data = data.next;
	            }

	        if (data != null)
	            {
	                return true;
	            }
	        else
	            {
	                return false;
	            }
	}

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	
	@Override
	public T remove(Object item) {
		// TODO Auto-generated method stub
		
	if (head==null)	{
		throw new NoSuchElementException();
		}
	
     else if (head.data.equals(item))
         {
    	 if (size==1) {
             T removed = head.data;
             clear();
             return removed;
         }
    	 
    	 else  
         {
             T removed = head.data;
             head = head.next;
             size--;
             
             return removed;
         }
     }
     
     else
     {
    	 Node<T> prev = head;
    	 while (prev != tail && !prev.next.data.equals(item))
    	 {
    		 prev = prev.next;
    	 }
    	 
    	 if (prev != tail)
    	 {
    		 Node<T> next = prev.next.next;
	         T removed = prev.next.data;
	         prev.next = next;
	         size--;
	         
	      if (next == null)
	      {
	      // removing tail
	      tail = prev;
	      }
	      return removed;
	                      
	      }

	            }
		return null;
	    }	

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		
		  if (index < 0 || index > size())
          { 
              throw new IndexOutOfBoundsException();
              
          }
      else if (size == 1)
          {
              T removed = head.data;
              clear();
              return removed;
          }
      else if (index == 0)
          {
              T removed = head.data;
              head = head.next;
              size--;
              return removed;
          }
      else
          {
              Node<T> prev = head;
              for (int i = 1; i < index; i++)
                  {
                      prev = prev.next;
                  }
              
              Node<T> next = prev.next.next;

              T removed = prev.next.data;

              prev.next = next;

              if (next == null)
                  {
                      tail = prev;
                  }

              size--;

              return removed;
          }
		
	}
	
		
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	
   

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		
		 if (index < 0 || index > size())
         {
             throw new IndexOutOfBoundsException();
         }
     else if (index == size())
         {
             add(item);
         }
     else if (index == 0)
         {
             Node<T> newNode = new Node<T>(item, head);
             head = newNode;
             size++;
         }
     else
         {
             Node<T> prev = head;
             for (int i = 0; i < index - 1; i++)
                 {
                     prev = prev.next;
                 }

             Node<T> next = prev.next;

             Node<T> newNode = new Node<T>(item, next);

             prev.next = newNode;

             size++;
         }

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		 if (index < 0 || index >= size)
         {
             throw new IndexOutOfBoundsException();
         }

     Node<T> data = head;
     for (int i = 0; i < index; i++)
         {
             data = data.next;
         }
     return data.data;
		
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		
		int index = 0;
        Node<T> data = head.next;
        while (data != null) {
            if (data.equals( item)) {
                return index;
            }

            index++;
            data = data.next;
        }
        if(index == size && item == null){
            return -1;
        }
        else{
            return index;
        }
        
    }
	

	
	/**
	 * @return the first item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T getFirst() {
		// TODO method stub
		 if(head == null)
	            throw new NoSuchElementException();
	        return head.data;
	}

	/**
	 * @return the last item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T getLast() {
		// TODO method stub
		 if(tail == null)
	            throw new NoSuchElementException();
	        return tail.data;
	}

	/**
	 * Adds 'item' to front of this linked list
	 * 
	 * @param item
	 */
	public void addFirst(T item) {
		// TODO method stub
		
		Node<T> newNode = new Node<T>(item, head);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            head = newNode;
        }
        size++;

	}

	/**
	 * Adds 'item' to the end of this linked list
	 * 
	 * @param item
	 */
	public void addLast(T item) {
		// TODO method stub
		
	     Node<T> newNode = new Node<T>(item, null);
	        if(tail == null){
	            head = newNode;
	            tail = newNode;
	        }else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        size++;
	    }


	/**
	 * Removes and returns the first item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T removeFirst() {
		// TODO method stub
		   T item = null;
	        if(head == null)
	            throw new NoSuchElementException();
	        item = head.data;
	        head = head.next;
	        if(head == null)
	            tail = null;
	        size--;
	        return item;
	}

	/**
	 * Removes and returns the last item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	public T removeLast() {
		// TODO method stub
		 T item = null;
	        Node<T> node = head;
	        if(tail == null)
	            throw new NoSuchElementException();
	        item = tail.data;
	        if(size == 1)
	            removeFirst();
	        else if(size>1){
	            for (int i = 0; i < size-1; i++) {
	                if(i == size-2){
	                    node.next = null;
	                    tail = node;
	                }
	                node = node.next;
	            }
	            size--;
	        }
	        return item;
	}
	
    private static class Node<T>
    {
        private T data;
        private Node<T> next;

        private Node(T d, Node<T> n)
        {
            data = d;
            next = n;
        }


    }
    
    private class LinkedListIterator implements Iterator<T>
    {
       
        private Node<T> nextNode;
        
        public LinkedListIterator()
        {
            nextNode = head;
        }

        /**
         * @return true if and only if there is a next element
         */
        public boolean hasNext()
        {
            return nextNode != null;
        }

        /**
         * @return the element after this iterator
         */
        public T next()
        {
            T nextData = nextNode.data;
            nextNode = nextNode.next;
            return nextData;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
    
    /**
     * This is the main method. I am testing every case in this main method by calling them.
     * @param args
     */
    public static void main(String[] args)
    {
        // test add to end
        LinkedList<String> l1 = new LinkedList<String>();
        
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Cranberry");
        l1.add("Grape");
        l1.add("Mango",0);
        

        for (int i = 0; i < l1.size(); i++)
            {
                System.out.println(l1.get(i));
            }
       
    
        l1.remove("Mango");

        System.out.println("\n=== After removes ===");
        for (int i = 0; i < l1.size(); i++)
            {
                System.out.println(l1.get(i));
            }

       // l1.add("1");

     
        l1.addFirst("raj");
        System.out.println("\n=== Add First ===");
       
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        l1.addLast("Shah");
        System.out.println("\n=== Add last ===");
       
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        l1.removeFirst();
        System.out.println("\n=== Remove First and printing ===");
       
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        
        l1.removeLast();
        System.out.println("\n=== Remove Last and printing ===");
       
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        
        
        System.out.println("\n===  The index that is removed ===");
        System.out.println(l1.remove(0));
        
        
        System.out.println("\n===  The item that is removed ===");
        System.out.println(l1.remove("Grape"));
        
        
        System.out.println("\n=== Remove at index and Printing the list ===");
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
      
        System.out.println("\n===  Get First  ===");
        System.out.println("Get First: "+ l1.getFirst());
        
      
        System.out.println("\n===  Get Last  ===");
        System.out.println("Get last: "+ l1.getLast());
        
        System.out.println("\n===  Get Index  ===");
        System.out.println("IndexContains: "+ l1.get(0));
        
        System.out.println("\n===  Contains Item return true  ===");
        System.out.println("Contains: "+ l1.contains("Cranberry"));
            
        l1.remove("Banana");
        System.out.println("\n=== Remove banana then Print the List ===");
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        System.out.println("\n=== size === ");
        System.out.println("Size: "+l1.size());
        
        System.out.println("\n===  Check the List isEmpty  ===");
        System.out.println("isEmpty: "+l1.isEmpty());
       
        

    }
}
