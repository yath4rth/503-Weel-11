public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    // This method throws an InsufficientFundsException
    public void withdraw(int amount) throws InsufficientFundsException {
        // Check if balance is less than amount, then throw an InsufficientFundsException
        if (this.balance < amount) {
            throw new InsufficientFundsException("withdraw: " + amount);
        } else {
            this.balance -= amount;
        }
    }

    public static void main(String[] args) {
    	BankAccount ba = new BankAccount();
    	ba.deposit(100);
    	try{
    	     ba.withdraw(50);
    	     ba.withdraw(50);
    	   }
    	   catch(InsufficientFundsException e)
    	   {
    	     System.out.println("Insufficient Funds: "+e.getMessage());
    	   }

    	System.out.println("Balance is: "+ba.getBalance());
}
}
