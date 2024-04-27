public class Employee {
    int id;
    String name;
    static int salary = Integer.MAX_VALUE;
    Account a1;


    Employee( int id , String name , Account a1 ){
        this.id = id;
        this.name = name;
        this.a1 = a1;
    }

    public void displayDetails(){
        System.out.println("Employee Detailsss : ");
        System.out.println("Name : "+ this.name);
        System.out.println("Id : " + this.id);
        System.out.println("Salary : " + Employee.salary);

        System.out.println("\n\n\n" + "Account Details : ");
        System.out.println("Account Type : " + a1.getAccType());
        System.out.println("Account number : " + a1.getAccNumber());

    }
}
