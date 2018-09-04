package mamzilla;

import java.util.Scanner;

public class Ticket {

    private static Scanner scanner = new Scanner(System.in);
    String name;
    int insertMoney;
    int ticketPrice;
    int amount;
    int totalRefund;
    int total;


    public Ticket(String destination) {
        System.out.println(" Where would you like to go? ");
        destination = scanner.nextLine();
        destination = name;

    }

    public void promptForDeposit() {
        System.out.println("How much would you like to insert? ");
        insertMoney = scanner.nextInt();
    }

    public int getMoney() {

        return insertMoney;
    }

    public void promptForPrice() {
        System.out.println(" Set the price of the ticket ");
        ticketPrice = scanner.nextInt();

    }

    public int getPrice() {

        return ticketPrice;
    }

    public void promptForAmount() {
        System.out.println("How many tickets would you like to buy? ");
        amount = scanner.nextInt();
    }

    public int getAmount() {

        return amount;
    }

    public int calculateTotal() {
        total = amount * ticketPrice;
        return total;
    }

    public int calculateTotalRefund() {
        totalRefund = insertMoney - total;
        return totalRefund;
    }

    public static void main(String[] args) {
        Ticket myTicket = new Ticket(null);

        myTicket.promptForDeposit();
        if (myTicket.insertMoney > 0) {
            System.out.println("You have inserted the amount of: " + myTicket.getMoney());
        } else {
            System.out.println("that is not possible");
        }

        myTicket.promptForPrice();

        myTicket.getPrice();
        if ((myTicket.ticketPrice > 0) && (myTicket.ticketPrice <= myTicket.insertMoney)) {
            System.out.println(" The price the the ticket(s) are $" + myTicket.ticketPrice);
        } else {
            System.out.println("that is not possible");
        }

        myTicket.promptForAmount();

        myTicket.getAmount();
        if (myTicket.amount > 0) {
            System.out.println(" The amount of tickets are " + myTicket.amount);
        } else {
            System.out.println("that is not possible");
        }

        myTicket.calculateTotal();
        if ((myTicket.total >= 0) && (myTicket.total <= myTicket.insertMoney)) {
            System.out.println("Total is " + myTicket.total + " $");
        } else {
            System.out.println("that is not possible");
        }

        myTicket.calculateTotalRefund();
        if (myTicket.totalRefund >= 0) {
            System.out.println(" Total refund is " + myTicket.totalRefund + " $");
        } else {
            System.out.println("that is not possible");
        }
    return;
    }

}
