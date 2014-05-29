package tests;

import static org.junit.Assert.*;
import list.SortedLinkedList;

import org.junit.Test;

public class Tests {
	
@Test
public void testListHead() {
	SortedLinkedList list = new SortedLinkedList(0);
	SortedLinkedList backup = list;
	for (int i = 0; i < 10; i++){
		list.insert(i);
		assertTrue(list.getData() == 0);
		assertTrue(list == backup);
	}
}
	
@Test
public void testInsertSorted() {
	SortedLinkedList list = new SortedLinkedList(0);
	for (int i = 0; i < 10; i++){
		list.insert(10-i);
	}
	list = list.getNext();
	int i = 1;
	while(list != null){
		assertTrue(list.getData() == i);
		list = list.getNext();
		i++;
	}
}
}
