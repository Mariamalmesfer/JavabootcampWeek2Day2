public class Account {

    private String Id;

    private String name;

    private int balance =0;


    // credit ايدعا
    // debet سحب


    public Account(String id) {
        Id = id; }

    public Account(String id, String name) {
        Id = id;
        this.name = name;}

    public Account(String id, String name, int balance) {
        Id = id;
        this.name = name;
        this.balance = balance;}

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // يدعاء credit
    public int debit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    //
    public int credit (int amount) {
        if (amount > this.balance) {
            System.out.println("you don't have this money ");
             return this.balance;
        }
        this.balance = this.balance - amount;
        return this.balance;
    }

    /// need to change it
    public int transferTo(Account another, int amount) {

        int account = this.credit(amount);

        if (account < 0) {
            System.out.println("you don't have this money ");
            return this.balance;
        }
        else {

            account = another.debit(amount);
        }

        return account;
    }


    public String toString() {
        return  "Account Id =  " + Id + " , Account name = " + name + "  , Account balance =" + balance ;
    }
}
