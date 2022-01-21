import java.util.*;

class Collections{
	public static void main(String args[]){
		//1. ArayList
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ArrayList");
		arrayList.add("LinkedList");
		arrayList.add("Vector");
		arrayList.add("Stack");
		
		System.out.print("\nArrayList: ");
		for(String str:arrayList){
			System.out.print(str + ", ");
		}
		
		//2. HashSet
		HashSet<Double> hashSet = new HashSet<Double>();
		hashSet.add(1.2);
		hashSet.add(2.3);
		hashSet.add(3.4);
		hashSet.add(1.2); //will not add duplicate
		
		Iterator<Double> itr1 = hashSet.iterator();
		System.out.print("\n\nHashSet: ");
		while(itr1.hasNext()){
			System.out.print(itr1.next() + ", "); // it will not be in inserted order.
		}
		
		//3. HashMap
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		hashMap.put(2, "Two again"); // will not add duplicate
		
		System.out.print("\n\nHashMap:\n");
		for(Map.Entry m: hashMap.entrySet()){
			System.out.println(m.getKey() + "->  " + m.getValue());
		}
		
		//4. TreeSet
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1); // will not add duplicate
		
		Iterator<Integer> itr2 = treeSet.iterator();
		System.out.print("\n\nTreeSet: ");
		while(itr2.hasNext()){
			System.out.print(itr2.next() + ", "); // it will be in Accending order.
		}
		
		//5. TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(5, "Five");
		treeMap.put(6, "Five"); // will not add duplicate
		treeMap.put(6, "Six");
		treeMap.put(7, "Seven");
		treeMap.put(8, "Eight");
		
		System.out.print("\n\nTreeMap:\n");
		for(Integer i: treeMap.keySet()){
			System.out.println(i + "-> " + treeMap.get(i)); // it will be in Accending order.
		}
	}
}