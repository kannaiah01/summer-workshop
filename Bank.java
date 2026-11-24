import java.util.*;

class BankAccount {

    public static String bankName = "Bits_Bank";
    public String name;
    public int accountNo;
    public int balance;
    public long phoneNo;
    public static String ifscCode = "IBn2344SUL";
    public String id;
    public int atmPin;
    public ArrayList<String> passBook;

    public BankAccount(String name, long ph, String idNo) {
        this.name = name;
        this.phoneNo = ph;
        this.id = idNo;
        this.balance = 0;
        this.accountNo = Bank.generateAccountNo(ph, name);
        this.atmPin = 1234; // default PIN
        this.passBook = new ArrayList<>();

        System.out.println("Dear " + name +
                ", your bank account is successfully created in Bits Bank");
        System.out.println("Account Number: " + accountNo);
    }

    public void deposit(int money, int accNo) {
        if (accountNo == accNo) {
            balance += money;
            passBook.add(money + " credited");
            System.out.println(money + " credited successfully");
        } else {
            System.out.println("Incorrect account number");
        }
    }

    public void checkBalance(int accNo) {
        if (accountNo == accNo) {
            System.out.println("Dear " + name +
                    ", your account balance is " + balance);
        } else {
            System.out.println("Incorrect account number");
        }
    }

    public void withDrawATM() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert your debit card");
        System.out.print("Enter your PIN: ");

        if (sc.nextInt() == atmPin) {

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if (balance >= amount) {
                balance -= amount;
                passBook.add(amount + " debited");

                System.out.println("Amount withdrawn successfully");

                System.out.print(
                        "Do you want to display your balance? (1-Yes, 0-No): ");

                if (sc.nextInt() == 1) {
                    System.out.println(
                            "Your account balance is " + balance);
                } else {
                    System.out.println(
                            "Thanks for using this ATM");
                }

                System.out.println(
                        "Please take your cash and card");
            } else {
                System.out.println("Insufficient balance");
            }

        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void showPassbook() {
        System.out.println("Passbook Entries:");
        for (String entry : passBook) {
            System.out.println(entry);
        }
    }
}

public class Bank {

    public static int generateAccountNo(long ph, String nam) {

        int last6 = (int) (ph % 1000000);
        int asciiSum = 0;

        for (int i = 0; i < nam.length(); i++) {
            asciiSum += nam.charAt(i);
        }

        return last6 + asciiSum + 562;
    }

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount("kannaiah", 8074140262L, "A123");

        acc1.deposit(5000, acc1.accountNo);

        acc1.checkBalance(acc1.accountNo);

        acc1.showPassbook();

        // acc1.withDrawATM();
    }
}