package main;

import list.SortedList;

class Main
{
  public static void main( String args[] )
  {
    final int array[] = {5, 0, -18, 13, 42, 23, 137, -4};

    /* TODO
     *
     * - Elemente aus 'array' in die Liste einfügen
     * - die Liste in aufsteigender Ordnung ausgeben
     *
     */
    
    final SortedList dummy = new SortedList( 0 );
    for ( int i = 0; i <= array.length; ++i )
    	dummy.insertSorted(array[i]);
    
    for ( SortedList elem = dummy; elem != null; elem = elem.getNext())
    	System.out.println(elem.getData());
    
    return;
  }
};
