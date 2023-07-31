// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Account account1=new Account("1","Mariam",5000);

        Account account2=new Account("2","Reem",3000);


        System.out.println("Account 1 id : "+account1.getId());
        System.out.println("Account 1 name: "+account1.getName()) ;
        System.out.println("Account 1 Balance: "+account1.getBalance());



        System.out.println("Account 2 id : "+account2.getId());
        System.out.println("Account 2 name: "+account2.getName()) ;
        System.out.println("Account 2 Balance: "+account2.getBalance());

        System.out.println();
        System.out.println();

        System.out.println(" after debit 3000 in account 1 and 1500 in account 2\n");

        account1.debit(3000);
        System.out.println(account1.toString());


        account2.debit(1500);
        System.out.println(account2.toString());

        System.out.println();
        System.out.println();

        System.out.println(" after credit 4000 in account 1 and 6000 in account 2 \n");

        account1.credit(4000);
        System.out.println(account1.toString());

        account2.credit(6000);
        System.out.println(account2.toString());


        System.out.println();
        System.out.println();

        System.out.println("account 1 transfer 1500 to account 2 \n");

        account1.transferTo(account2,1500);

        System.out.println(account1.toString());
        System.out.println(account2.toString());



        ////////// EMPLOYEE


        Employee employee1 = new Employee("1","Sultan",10000);

        System.out.println("Employee id : "+employee1.getId());
        System.out.println("Employee name: "+employee1.getName()) ;
        System.out.println("Account salary: "+employee1.getSalary());


        System.out.println();
        System.out.println();



        System.out.println(" The Annual Salary of the employee : " + employee1.getAnnualSalary());




        System.out.println();
        System.out.println();


        System.out.println(" The employee  Salary  after 10% raise :" + employee1.raiseSalary(10));






    }
}