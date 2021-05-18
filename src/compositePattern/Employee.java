package compositePattern;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    //public static Object addEmp;
    int employeeId ;
    String employeeName;
    String employeePost;
    List<Employee> subordinates;

    public Employee(int employeeId, String employeeName, String employeePost) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePost = employeePost;
        this.subordinates = new ArrayList<>();
    }

    public void addEmp(Employee employee){
        subordinates.add(employee);
    }


    public void removeEmp(Employee employee){
        subordinates.remove(employee);
    }

    public String toString(){
        return (employeeId+" "+employeeName+" "+employeePost);
    }

    void listSubordinates(){
        if(subordinates.size()>0)
            System.out.println(employeeName+"'s subordinates-");
        for (Employee emp : subordinates) {
            System.out.println(emp);
        }
        for(Employee emp : subordinates){
            emp.listSubordinates();
        }
    }


}
