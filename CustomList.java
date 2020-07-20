package demoGroup.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T> implements Iterable<T> {
	private Node first;
    private Node last;
	private List<T> list;
	public CustomList(List<T> list) {
		//first=last=null;
		this.list = list;
	}
	 public void push(T data) {
	        Node tempo = new Node();
	        tempo.setData(data);
	        tempo.setNext(null);
	        if (first == null) {
	            tempo.setPrev(null);
	            first = last = tempo;
	        } else {
	            tempo.setPrev(last);
	            last.setNext(tempo);
	            last = tempo;
	        }
	    }
	@Override
	public Iterator iterator() {
		//return new ListIterator(first);
		return new ListIterator();
	}
	public class ListIterator<T> implements Iterator<T> {
		int size = list.size();
		int current = 0;
		//private Node current;
		@Override
		public boolean hasNext() {
			return current < size;
			//return current!=null;
		}

		@Override
		public T next() {

			T val = (T) list.get(current);
			current = current + 1;
			return val;

			/*
			 * Node tempo = current; current = current.getNext(); return tempo;
			 */
		}
		
		@Override
		public void remove() {
	        if(hasNext()) {
				/*
				 * Node prevNode = current.getPrev(); Node nextNode = current.getNext();
				 * current.setPrev(null); current.setNext(null); //current.setData(null);
				 * prevNode.setNext(nextNode);
				 */
	        	List<T> list2 = new ArrayList();
	        	T val = getPrev();
	        	list = list.stream().filter(x -> !x.equals(val)).collect(Collectors.toList());
	        	size = size - 1;
	        }
	    }
		
		private T getPrev() {
			T val = (T) list.get(current);
			return val;
		}

	}
}
