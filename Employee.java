public class Employee {

    private String id;

    private String name;

    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;}

    public String getId() {
        return id;}

    public String getName() {
        return name;}

    public int getSalary() {
        return salary;}

    public int getAnnualSalary() {
        int annual = salary * 12;
        return annual;
    }

    public int raiseSalary(int percent) {
        int ra = salary * percent / 100;
         salary = salary+ ra;
         return salary;
    }


    public String toString() {
        return  "Employee Id =  " + id + " , Employee name = " + name + "  , Employee salary  =" + salary ;
    }







}
