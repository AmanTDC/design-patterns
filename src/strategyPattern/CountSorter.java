package strategyPattern;

public class CountSorter implements  Sorter{
    @Override
    public void sort() {
        System.out.println("Sorted by counting");
    }
}
