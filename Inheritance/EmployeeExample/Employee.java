public class Employee {

    int id ;
    String name ; 
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void work (){
        System.out.println("Common working method across all the employees");
    }
    



}
