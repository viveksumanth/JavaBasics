package learnjava.comparableinterface.sortinreverseorder;


class ReverseNumber implements Comparable<ReverseNumber> {
    private int value;

    public ReverseNumber(final int value) {
        this.value = value;
    }

    @Override
    public int compareTo(final ReverseNumber other) {
        // Reverse the comparison to sort in descending order
        return other.value - this.value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public Integer getNum() {
        return this.value;
    }
}

