
public class SortedList extends IntegerList {

	/**
	 * Call the parent constructor to create an empty list with an initial capacity of MIN_CAPACITY.
	 */
	public SortedList() {
		super();
	}
	/**
	 * Call the parent constructor to create an empty list with the given capacity.
	 * @param capacity
	 */
	public SortedList(int capacity) {
		super(capacity);
	}
	
	/**
	 * Insert the integer in the list at the position that maintains the sorted order.
	 * @param integer  the integer to add
	 */
	@Override
	public void add(int integer) {
		int index = 0;
		while (index < size() && get(index) < integer) {
			index++;
		}
		super.insert(index, integer);
	}
	/**
	 *  Throw an UnsupportedOperationException to disable this method. That way,
	 *   users of the class cannot insert integers at arbitrary positions in the list.
	 *  @throws UnsupportedOperationException
	 */
	@Override
	public void insert(int index, int integer) {
		throw new UnsupportedOperationException();
	}
}
