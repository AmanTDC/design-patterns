package compositePattern;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee(1,"Rajesh","CEO");

        Employee CTO = new Employee(2,"Prakash","CTO");
        Employee CFO = new Employee(3,"Aryan","CFO");

        Employee md1 = new Employee(4,"Vaibhav","MD");
        Employee md2 = new Employee(5,"Saurabh","MD");
        Employee md3 = new Employee(6,"Chitranshi","MD");

        Employee sd1 = new Employee(7,"Aman","SDE");
        Employee sd2 = new Employee(8,"Ankit","SDE");
        Employee sd3 = new Employee(9,"Shubham","SDE");
        Employee bo1 = new Employee(10,"Amit","BO");
        Employee bo2 = new Employee(11,"Jatin","BO");

        CEO.addEmp(CTO);
        CEO.addEmp(CFO);

        CTO.addEmp(md1);
        CTO.addEmp(md2);

        CFO.addEmp(md3);

        md1.addEmp(sd1);
        md1.addEmp(sd2);

        md2.addEmp(sd3);

        md3.addEmp(bo1);
        md3.addEmp(bo2);

        CEO.listSubordinates();


    }
}
