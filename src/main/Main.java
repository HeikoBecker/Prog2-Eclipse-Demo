package main;

import list.SortedLinkedList;

public class Main
{
  public static void main( String args[] )
  {
    final int array[] = {5, 0, -18, 13, 42, 23, 137, -4};

    /*
     * - sortierte verkettete Liste entwerfen
     * - Elemente aus 'array' in die Liste einfügen
     * - die Liste in aufsteigender Ordnung ausgeben
     */

    final SortedLinkedList head = new SortedLinkedList( 0 );
    for ( int i = 0; i < array.length; ++i )
      head.insert( array[ i ] );

    for ( SortedLinkedList elem = head.getNext(); elem != null;
        elem = elem.getNext() )
      System.out.println( elem.getData() );

    return;
  }
};
