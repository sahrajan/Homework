import java.util.Map.Entry;

public class HashTableEntry<K,V> implements Entry<K, V> {
	
	private K key;
	private V value;
	private boolean available;
	
	public HashTableEntry(K key, V value){
		// TODO Auto-generated method stub
		this.key = key;
		this.value =value;
		this.available =false;
		
	}
	
	public boolean isAvailable(){
		// TODO Auto-generated method stub
		return available;
	}
	
	public void setAvailable(boolean isAvailable){
		// TODO Auto-generated method stub	
		this.available = available;
	}

	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public V setValue(V value) {
		return this.value =value;
	}
	
	@Override
	public int hashCode(){
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		 if (this == o) return true;
	        if (o == null) return false;
	        if (this.getClass() != o.getClass()) return false;
	        HashTableEntry<K, V> obj = (HashTableEntry<K, V>) o;
	        return available == obj.available
	          && (key.equals(obj.key) 
	          && value.equals(obj.value));
	}

}
