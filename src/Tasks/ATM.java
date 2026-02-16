package Tasks;

public class ATM {

    double amount;
    String manufactureName, sensor;
    boolean hasCamera;

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > amount) {
            System.out.println("Insufficient balance.");
            return;
        }
        amount -= withdrawAmount;
    }

    public void checkBalance() {
        System.out.println("The ATM has " + amount + " rupees left.");
    }

    public void details() {
        System.out.println("Manufactured by: " + manufactureName +
                "\nThe Machine has:\n\tSensor: " + sensor +
                "\n\tHas Camera: " + (hasCamera ? "Yes" : "No")+"\n");
    }

    public static void main(String[] args) {

        ATM myAtm = new ATM();
        myAtm.manufactureName = "Hitachi";
        myAtm.sensor = "Temperature Sensor";
        myAtm.hasCamera = true;
        myAtm.amount = 120000;

        myAtm.deposit(30000);
        myAtm.withdraw(20000);

        myAtm.details();
        myAtm.checkBalance();
    }
}
