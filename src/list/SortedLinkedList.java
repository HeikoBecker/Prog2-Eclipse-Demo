package list;

public class SortedLinkedList
{
  public SortedLinkedList( final int data )
  {
    this.data = data;
  }

  public int getData()
  {
    return data;
  }

  public SortedLinkedList getNext()
  {
    return next;
  }

  public void insert( final int data )
  {
    if ( null == this.next || data < this.next.data )
    {
      final SortedLinkedList elem = new SortedLinkedList( data );
      elem.next = this.next;
      this.next = elem;
    }
    else
      this.next.insert( data );
  }

  private SortedLinkedList next;
  private int data;
}
