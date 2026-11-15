public class exercise2 {
    public static void main(String[] args){
        Employee sal = new Employee("Sal", 700);
        Manager dan = new Manager("Dan", 1000);
        Intern cass = new Intern("Cass", 300);

        System.out.println("=========================== BONUS ==========================\n");
        System.out.printf("Sal's bonus is: %.2f\n", sal.calculate_bonus());
        System.out.printf("Dan's bonus is: %.2f\n", dan.calculate_bonus());
        System.out.printf("Cass' bonus is: %.2f\n", cass.calculate_bonus());
        System.out.println("\n======================= GROSS SALARY =======================\n");
        System.out.printf("Sal's Gross Salary: %.2f\n", sal.salaryGetter() + sal.calculate_bonus());
        System.out.printf("Dan's Gross Salary: %.2f\n", dan.salaryGetter() + dan.calculate_bonus());
        System.out.printf("Cass' Gross Salary: %.2f\n", cass.salaryGetter() + cass.calculate_bonus());
        System.out.println("\n============================================================");
    }
}

class Employee{
    private String name;
    protected float salary;

    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public String nameGetter(){
        return this.name;
    }

    public float salaryGetter(){
        return this.salary;
    }

    public float calculate_bonus(){
        return salary * 0.1f;
    }
}

class Manager extends Employee{
    Manager(String name, float salary){
        super(name, salary);
    }

    public float calculate_bonus(){
        return salary * 0.2f;
    }
}

class Intern extends Employee{
    Intern(String name, float salary){
        super(name, salary);
    }

    public float calculate_bonus(){
        return salary * 0.05f;
    }
}