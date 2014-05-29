package tests;

import static org.junit.Assert.*;
import list.SortedLinkedList;

import org.junit.Test;

public class Tests {
	
	@Test
	public void testInsertionAndHead() {
		SortedLinkedList list = new SortedLinkedList(0);
		assertTrue(list.getNext() == null);
		list.insert(3);
		list.insert(-1);
		list = list.getNext();
		assertTrue(list.getData() == -1);
		list = list.getNext();
		assertTrue(list.getData() == 3);
	}
	
	@Test
	public void testNullAsEnd(){
		SortedLinkedList list = new SortedLinkedList(-1);
		
		for(int i = 0; i < 10; i++){
			list.insert(i);
		}
		
		for(int i = 0; i < 11; i++){
			assertTrue(list.getData() == i-1);
			list = list.getNext();
		}
		assertTrue(list == null);
	}
}
