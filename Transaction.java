public class Transaction {
    String sender;
    String receiver;
    int amount;
    boolean isExecuted;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public int getAmount() {
        return amount;
    }

    public String getReceiver() {
        return receiver;
    }
}


