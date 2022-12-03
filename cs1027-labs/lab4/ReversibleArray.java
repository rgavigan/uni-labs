public class ReversibleArray<T> {
    // Create two private instance variables
    private int count;
    private T[] array;

    ReversibleArray (T[] value) {
        // Initialize array with input array value
        // Set count to array length
        this.array = value;
        this.count = this.array.length;
    }

    public String toString() {
        String retString = "";
        for (int i = 0; i < this.count; ++i) {
            if (i == this.count - 1) {
                retString = retString + this.array[i].toString();
            }
            else {
                retString = retString + this.array[i].toString() + ", ";
            }
        }
        return retString;
    }

    public void reverse () {
        for (int i = 0; i < this.count / 2; ++i) {
            T temp = this.array[i];
            this.array[i] = this.array[this.count - i - 1];
            this.array[this.count - i - 1] = temp;
        }
    }
}
