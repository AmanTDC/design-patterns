package strategyPattern;

public class Main {
    public static void main(String[] args) {
        ArrayObject shortRangeArray = new ArrayObject(new CountSorter());
        ArrayObject almostSortedArray = new ArrayObject(new InsertionSorter());
        ArrayObject largeRangeArray = new ArrayObject(new QuickSorter());

        shortRangeArray.sort();
        almostSortedArray.sort();
        largeRangeArray.sort();
    }
}
