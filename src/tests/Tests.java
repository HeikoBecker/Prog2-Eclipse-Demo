package tests;

import static org.junit.Assert.*;
import list.SortedLinkedList;

import org.junit.Test;

public class Tests {
	
	@Test
	public void testInsertionAndHead() {
		SortedLinkedList list = new SortedLinkedList(3);
		assertTrue(list.getNext() == null);
		SortedLinkedList backup = list;
		list.insert(-1);
		assertTrue(list.getNext() == backup);
	}

}
