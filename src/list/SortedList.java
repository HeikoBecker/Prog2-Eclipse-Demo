package list;

public class SortedList {
	public SortedList( final int data ){
		this.data = data;
		this.next = null;
	}
	
	public SortedList getNext()
	{
		return next;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void insertSorted( final int data )
	{
		if ( data < this.next.data )
		{
			final SortedList elem = new SortedList( data );
			elem.next = this.next;
			this.next = elem;
		}
		else
			this.next.insertSorted(data);
	}
	
	private SortedList next;
	private int data;

}
