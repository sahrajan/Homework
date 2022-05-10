public class ArrayList<T> implements List<T> {

	private static final int DEFAULT_INITIAL_CAPACITY = 11;
	private Object[] data; //This stores the items added to the List.
	private int size; //This keeps track of how many items have been added to the List.
	
	private static final Object[] EMPTY_ELEMENT_DATA = {};
	
	//T[] data = (T[]) new Object[DEFAULT_INITIAL_CAPACITY]; //This is how you instantiate a generic array.


	/**
	 * Constructs an ArrayList using the default capacity
	 */
	public ArrayList() {
		// TODO Complete Constructor
			
		
		super();
        this.data = EMPTY_ELEMENT_DATA;

	}

	/**
	 * Constructs an ArrayList with an 'initialCapacity'
	 * 
	 * If 'initalCapacity' is non-positive use the default capacity
	 * 
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		// TODO Complete Constructor
		
		super();  
	      if (initialCapacity < 0) 
	          throw new IllegalArgumentException("Illegal Capacity: "+  initialCapacity);  
	      		this.data = new Object[initialCapacity];  
	  }  

	

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		//initializing arryList
		rangeCheck(index);

		InternalCapacity(size + 1);  // Increments modCount!!
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = item;
        size++;
        
//        if (item instanceof Integer) {
//            return;
//        } else if (item instanceof Double) {
//            return;
//        } else if (item instanceof String) {
//            return;//  (T) String.valueOf(a.toString() + b.toString());
//        }
    
			
	}

	private void rangeCheck(int index) {
		// TODO Auto-generated method stub
		 if (index > size || index < 0)
	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
		
	}

	private String outOfBoundsMsg(int index) {
		// TODO Auto-generated method stub
		 return "Index: "+index+", Size: "+size;
	}

	private void InternalCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		
		 if (data == EMPTY_ELEMENT_DATA) {
	            minCapacity = Math.max(DEFAULT_INITIAL_CAPACITY, minCapacity);
	        }

	        ensureExplicitCapacity(minCapacity);
		
	}

	private void ensureExplicitCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		if (minCapacity - data.length > 0)
            regrow(minCapacity);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

        for (int i = 0; i < size; i++)
            data[i] = null;

        size = 0;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		
		return indexOf(item) >= 0;
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		
		 	rangeCheck(index);
	        return null;
		
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		
		if (item == null) {
            for (int i = 0; i < size; i++)
                if (data[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (item.equals(data[i]))
                    return i;
        }
		return -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
   
	    
    private void regrow(int minCapacity) // The grow method expands the size of the Array  
{  
        // overflow-conscious code  
    	// overflow-conscious code
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - DEFAULT_INITIAL_CAPACITY > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
       data = ArrayList.copyOf(data, newCapacity);
    }  
 
	private static Object[] copyOf(Object[] data2, int newCapacity) {
		// TODO Auto-generated method stub
		return null;
	}

	private int hugeCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		 if (minCapacity < 0) // overflow
	            throw new OutOfMemoryError();
	        return (minCapacity > DEFAULT_INITIAL_CAPACITY) ?
	            Integer.MAX_VALUE : DEFAULT_INITIAL_CAPACITY;
		
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
	System.out.println("My Code Compile but doesnt work");
	
	 ArrayList<String> myList = new ArrayList<String>();
	 myList.add("rr",0);
	 myList.add("rr",1);
	 myList.add("rr",2);
	 
	
	 System.out.println(myList);
	
	}

	

	
}
