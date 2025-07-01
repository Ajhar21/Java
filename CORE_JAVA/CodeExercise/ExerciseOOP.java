package CodeExercise;
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDetails(){
        return "Name: "+this.name +", " + "Salary: " +this.salary;
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, double Salary, String department){
        
        super(name, Salary);
        this.department=department;
    }
    public String getDetails(){
        return "Name: "+getName()+", " + "Salary: " +getSalary()+", " + "Department: "+this.department;
    }
}
public class ExerciseOOP {
    public static void main(String[] args) {
        Employee emp=new Employee("Alice", 50000.0);
        String empDetails=emp.getDetails();
        System.out.println(empDetails);

        Employee manager=new Manager("Bob",80000.0,"IT");
        String manDetails=manager.getDetails();
        System.out.println(manDetails);
    }
    
}
