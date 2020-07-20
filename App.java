package demoGroup.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * int[] arr = {12,1,34,26,3,34,12,3};
		 * 
		 * int first=arr[0], second=arr[0]; for(int i=0;i<arr.length;++i) { if(first <
		 * arr[i]) { second=first; first=arr[i]; } else if(arr[i] > second && arr[i] <
		 * first) { second=arr[i]; } }
		 * 
		 * List<Integer> list = new ArrayList(); for(int x : arr) {
		 * if(!list.contains(x)) { list.add(x); } }
		 * list.forEach(x->System.out.println("Val" + x));
		 */
		List<String> list = Arrays.asList("Soumik","Sourav","Kishore","Priya","Aditya");
		CustomList<String> listItr = new CustomList<String>(list);
		/*
		 * listItr.push("Soumik"); listItr.push("Sourav"); listItr.push("Kishore");
		 * listItr.push("Priya"); listItr.push("Aditya");
		 */
		
		Iterator<String> itr = listItr.iterator();
		int i=0;
		while(itr.hasNext()) {
			
			  if(i==3) { itr.remove(); }
			 
			String str = itr.next();
			//System.out.println(str.getData());
			i++;
		}
		itr = listItr.iterator();
		/*
		 * while(itr.hasNext()) { Node str = itr.next();
		 * System.out.println(str.getData()); }
		 */
		listItr.forEach(node -> System.out.println(node));
		

	}
}
