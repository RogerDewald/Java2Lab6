
public class UniqueList extends IntegerList {

	/**
	 * Call the parent constructor to create an empty list with an initial capacity of MIN_CAPACITY.
	 */
	public UniqueList() {
		super();
	
	/**
	 *  Call the parent constructor to create an empty list with the given capacity.
	 *  @param the capacity of the new list
	 */
	}
	public UniqueList(int capacity) {
		super(capacity);
		
	}
	/**
	 * 	Check whether the given integer is already in the list before appending it.
	 *  If so, throw an IllegalArgumentException with the message shown in the unit tests.
	 *  @param integer  the integer to be appended
	 *  @throws IllegalArgumentException
	 */
	@Override
	public void add(int integer) throws IllegalArgumentException {
		
			if (indexOf(integer) != -1) {
				throw new IllegalArgumentException ("The integer " + integer + " is already in the list.");
			}
			super.add(integer);
		
	}
	/**
	 * Insert the given integer at the given index in the list. Shift the existing integers to the right to make room.
	 *  @param index  The index at which to insert
	 *  @param integer the integer to be inserted
	 *  @throws IllegalArgumentException
	 */
	@Override
	public void insert(int index, int integer) throws IllegalArgumentException {
			if (indexOf(integer) != -1) {
				throw new IllegalArgumentException ("The integer " + integer + " is already in the list.");
			}
			super.insert(index, integer);
		
		
	}
}
	
