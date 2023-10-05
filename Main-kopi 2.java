import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Mhaa", " Kasper", " Mhaa1", 21);
        Customer customer2 = new Customer("Karl", " Jensen", " Kar2", 33);
        Customer customer3 = new Customer("Magnus", " Olivens", " Magnus1", 51);


    customerList.add(customer);
    customerList.add(customer2);
    customerList.add(customer3);

    printCustomers(customerList);

    }

   static void printCustomers(ArrayList<Customer> customers) {
          //for each loop
         for (Customer c : customers) {
           System.out.println(c.firstName);

       }
   }

}
