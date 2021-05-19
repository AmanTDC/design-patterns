package strategyPattern;

public class ArrayObject {
    Sorter sorter;
    ArrayObject(Sorter sorter){
        this.sorter =sorter;
    }
    void sort(){
        sorter.sort();
    }
}
