public class ClassA {
	private final int SIZE_ARRAY = 5;
	public int numItems;
	public int[] arrItems;

	public ClassA(int n, int[] arr) {
		numItems = n;
		arrItems = arr;
	}

	public ClassA() {
		numItems = 0;
		arrItems = new int[SIZE_ARRAY];
	}
	
	public boolean equals(ClassA otherClass) {
		if ((this.numItems == otherClass.numItems) && (this.arrItems == null) && (otherClass.arrItems == null)) {
			return true;
		}
		else if (this.numItems == otherClass.numItems) {
			for (int i1 = 0; i1 < this.numItems; i1++) {
				if (this.arrItems[i1] != otherClass.arrItems[i1]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
}
