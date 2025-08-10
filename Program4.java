package assignment;

// Base class
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000.0; // Example base salary
    }
}

// Subclass of Employee
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

// Main class
public class Program4 {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();                    // Output: Employee is working
        System.out.println("Salary: " + emp.getSalary()); // Output: Salary: 30000.0

        HRManager hr = new HRManager();
        hr.work();                     // Output: HR Manager is managing employees
        System.out.println("Salary: " + hr.getSalary());  // Inherited from Employee
        hr.addEmployee();             // Output: Adding a new employee
    }
}
