import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LinearProbingHashTable<K, V> implements GradableMap<K, V> {
	
//	private int n;           // number of key-value pairs in the symbol table
//    private int m;           // size of linear probing table
//    private Key[] keys;      // the keys
//    private Value[] vals; 
	
	private HashTableEntry<K,V>[] array;
	private int size;
	private double maxLoadFactor;
	
	//private final static int INITIAL_SIZE = 11;
	
	public LinearProbingHashTable(){
		// TODO Auto-generated method stub
		this.size = size;
		this.maxLoadFactor = maxLoadFactor;
		
	}
	
	public LinearProbingHashTable(int size){
		// TODO Auto-generated method stub
		this.size=size;
		this.maxLoadFactor = 0.75;
		
	}

	public LinearProbingHashTable(int size, double loadFactor){
		// TODO Auto-generated method stub
		
		this.size=11;
		this.maxLoadFactor = 0.75;
	
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		  size = 0;
	     //  Entry<K,V> [] table = new String[];
	     // String[] value = new String[INITIAL_SIZE];
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return get(arg0) != null;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return get(arg0) != null;
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		HashSet<Entry<K, V>> set = new HashSet<>(size);
		for (int i = 0; i < array.length; i++) {
			Entry <K, V> entry = array[i];
			if (entry != null && !((HashTableEntry<K, V>) entry).isAvailable()) {
				set.add(entry);
			}
		}
		return set;
	}

	@Override
	public V get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		int hash = hashKey(key);
		int index = indexForHash(hash, array);
		
		if (array[index] == null) {
			addEntryAtIndex(index, key, value);
			return null;
		} else {
			Entry <K, V> entry = array[index];
			while (entry != null) {
				if (!((HashTableEntry<K, V>) entry).isAvailable() && (entry.getKey() == key || entry.getKey().equals(key))) {
					V oldValue = entry.getValue();
					entry.setValue(value);
					((HashTableEntry<K, V>) entry).setAvailable((value == null) ? true : false);
					return oldValue;
				}
				
				index = indexForHash(index + 1, array);
				entry = array[index];
			}
		}
		
		// So we're now at a point where we can just insert it.
		// Thanks, linear probing!
		addEntryAtIndex(index, key, value);
		return null;
	}
	@Override
	public void putAll(Map<? extends K, ? extends V> otherMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		Entry <K, V> entry = removeEntryWithKey(key);
		if (entry == null) return null;
		V value = entry.getValue();
		entry.setValue(null);
		return value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		ArrayList<V> arr = new ArrayList<>(size);
		for (int i = 0; i < array.length; i++) {
			Entry <K, V> entry = array[i];
			if (entry != null && !((HashTableEntry<K, V>) entry).isAvailable()) {
				arr.add(entry.getValue());
			}
		}
		return arr;
	}

	@Override
	public HashTableEntry<K, V>[] getArray() {
		// TODO Auto-generated method stub
		return (HashTableEntry<K, V>[]) array;
	}

	@Override
	public void setArray(HashTableEntry<K, V>[] array) {
		// TODO Auto-generated method stub
		this.array = array;
		
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		this.size = size;
		
	}

	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		return ;
		
	}

	@Override
	public void getArray(HashTableEntry<K, V>[] array) {
		// TODO Auto-generated method stub
		this.array = array;
		
	}
	
	private static int hashKey(Object key) {
		return Math.abs(key.hashCode());
	}
	
	private static int indexForHash(int hash, Entry<?,?>[] table) {
		return hash % (table.length - 1);
	}
	
	private void addEntryAtIndex(int hash, K key, V value) {
		addEntryToTableAtIndex(array, hash, key, value);
		size++;
//		if (size >= size) {
//			size(); //resize
//		}
	}
		private void addEntryToTableAtIndex(Entry<K,V>[] table, int idx, K key, V value) {
			HashTableEntry<K, V> entry = new HashTableEntry<>(key, value);
			((HashTableEntry<K, V>) entry).setAvailable((value == null) ? true : false);
			table[idx] = entry;
		}
		private Entry<K, V> removeEntryWithKey(Object key) {
			int hash = hashKey(key);
			int index = indexForHash(hash, array);
			
			Entry <K, V> entry = array[index];
			while (entry != null) {
				if (!((HashTableEntry<K, V>) entry).isAvailable() && (entry.getKey() == key || entry.getKey().equals(key))) {
					((HashTableEntry<K, V>) entry).setAvailable(true);
					size--;
					break;
				}
				
				index = indexForHash(index + 1, array);
				entry = array[index];
			}
			return entry;
		}
		
		 public void printHashTable()
		    {
		        System.out.println("\nHash Table: ");
		        for (int i = 0; i < size; i++)
		            if (array[i] != null)
		                System.out.println(array[i] +" "+ array[i]);
		        System.out.println();
		    } 
		 
		 
		
		public static void main(String[] args) {
			System.out.println("works");
			
			
			Scanner scan = new Scanner(System.in);
	        System.out.println("Hash Table Test\n\n");
	       
	        /** maxSizeake object of LinearProbingHashTable **/
	        LinearProbingHashTable<String, String> lpht = new LinearProbingHashTable(scan.nextInt() );
	 
	        char ch;
	        /**  Perform LinearProbingHashTable operations  **/
	        do    
	        {
	            System.out.println("\nHash Table Operations\n");
	            System.out.println("1. insert ");
	            System.out.println("2. remove");
	            System.out.println("3. get");            
	            System.out.println("4. clear");
	            System.out.println("5. size");
	 
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter key and value");
	                lpht.put(scan.next(), scan.next() ); 
	                break;                          
	            case 2 :                 
	                System.out.println("Enter key");
	                lpht.remove( scan.next() ); 
	                break;                        
	            case 3 : 
	                System.out.println("Enter key");
	                System.out.println("Value = "+ lpht.get( scan.next() )); 
	                break;                                   
	            case 4 : 
	                lpht.clear();
	                System.out.println("Hash Table Cleared\n");
	                break;
	            case 5 : 
	                System.out.println("Size = " );
	                break;         
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
	            /** Display hash table **/
	           // lpht.printHashTable();  
	 
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');  
	    
		}

}
