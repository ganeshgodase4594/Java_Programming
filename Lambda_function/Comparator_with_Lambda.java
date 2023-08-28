
import java.util.*;

class Employee {

    int empid = 0;
    String name = null;

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public String toString() {
        return empid + " : " + name;
    }
}

 class Client {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(1, "ganesh"));
        al.add(new Employee(2, "dhiraj"));
        al.add(new Employee(3, "aniket"));
        al.add(new Employee(4, "vishal"));

        System.out.println("Original List:");
        System.out.println(al);

        Collections.sort(al, (obj1, obj2) ->
                ((Employee) obj1).name.compareTo(((Employee) obj2).name));

        System.out.println("Sorted List:");
        System.out.println(al);
    }
}
