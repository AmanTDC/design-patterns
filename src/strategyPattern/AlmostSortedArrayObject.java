package strategyPattern;

public class AlmostSortedArrayObject extends ArrayObject{

    AlmostSortedArrayObject() {
        super(new InsertionSorter());
    }
}
