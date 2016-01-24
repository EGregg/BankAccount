
public class Main {

    public static void main(String[] args) {
//    	quick comment out lines (CTRL + /)
//    	to change multiple instances of a variable, (ALT + SHIFT + R)
        Account gregaccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
                // "(087) 123-4567");
//        System.out.println(gregaccount.getNumber());
//        System.out.println(gregaccount.getBalance());

        gregaccount.withdrawal(100.0);

        gregaccount.deposit(50.0);
        gregaccount.withdrawal(100.0);

        gregaccount.deposit(51.0);
        gregaccount.withdrawal(100.0);
    }
}
