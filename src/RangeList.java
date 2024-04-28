
public class RangeList extends IntegerList {
	
	/**
	 * Call the parent constructor to create an empty list with an initial capacity of MIN_CAPACITY.
	 */
	public RangeList() {
		super();
	}
	/**
	 *  Call the parent constructor to create an empty list with an initial capacity of MIN_CAPACITY. 
	 * @param lowerBound
	 * @param upperBound
	 * @throws IllegalArgumentException
	 */
	public RangeList(int lowerBound, int upperBound) throws IllegalArgumentException {
		super();
		if (upperBound < lowerBound) {
			throw new IllegalArgumentException ("The upper bound must be greater than or equal to the lower bound.");
		}
		else {
			for (int i = upperBound; i >= lowerBound; i--) {
				super.insert(0, i);
			}
		}
	}
	/**
	 * Adds the range of numbers if it passes the exceptions
	 * @param lowerBound
	 * @param upperBound
	 * @throws IllegalArgumentException
	 */
	public void add(int lowerBound, int upperBound) throws IllegalArgumentException {
		
		if (lowerBound > upperBound) {
			throw new IllegalArgumentException ("The upper bound must be greater than or equal to the lower bound.");
		}
			if (size() == 0) {
				for (int i = upperBound; i >= lowerBound; i--) {
					super.insert(0,i);
				}
			}

			int origLower = get(0);
			int origUpper = get(super.size()-1);
			int iOrigLower = indexOf(origLower);
			
			if (lowerBound < origLower) {
				for (int i = origLower - 1; i >= lowerBound; i--) {
					super.insert(iOrigLower, i);
				}
			}
			int iNewUpper = indexOf(get(super.size()-1));
			if (upperBound > origUpper) {
				for (int i = upperBound; i >= origUpper + 1; i--) {
					super.insert(iNewUpper + 1, i);
				}
			}
			
		
	}
	/**
	 * @throws UnsupportedOperationException
	 */
	@Override
	public void add(int integer) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	/**
	 * @throws UnsupportedOperationException
	 */
	@Override
	public void insert(int index, int integer) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	/**
	 * Removes the given range from the list
	 * @param lowerBound
	 * @param upperBound
	 * @throws IllegalArgumentException
	 */
	public void remove(int lowerBound, int upperBound) throws IllegalArgumentException, UnsupportedOperationException {

			if (lowerBound > upperBound) {
				throw new IllegalArgumentException ("The upper bound must be greater than or equal to the lower bound.");
			}
			if (super.size() <= 0) {
				throw new UnsupportedOperationException ("Cannot remove range from an empty list.");
			}
			if (lowerBound < super.get(0) || upperBound > super.get(super.size()-1)) {
				throw new IllegalArgumentException ("Lower and/or upper bounds are out of the current list range.");
			}
			if (lowerBound != super.get(0) && upperBound != super.get(super.size()-1)) {
				throw new IllegalArgumentException ("Cannot remove non-terminal ranges.");
			}
			else {
			int idx = indexOf(lowerBound);
			for (int i = lowerBound; i <= upperBound; i++) {
				remove(idx);
			}
			}
		
		
	}
	
	
}
