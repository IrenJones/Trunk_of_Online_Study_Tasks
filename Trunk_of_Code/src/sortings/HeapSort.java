package sortings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {

	
	
	
	public static void main(String[] args) {
		List <String> list = new LinkedList<>();
		list.add("one");
		list.add("four");
		list.add("three");
		list.add("one");
		list.add("five");
		System.out.println(list);
		List<String> sorted = heapSort(list);
		System.out.println(sorted);
	}

	private static List<String> heapSort(List<String> list) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		for (String s:list){
			pq.add(s);
		}
		
		List <String> result = new ArrayList<>();
		
		while(!pq.isEmpty()){
			result.add(pq.poll());
		}
		
		return result;
	}

}
