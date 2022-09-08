package Stream.sender_receiver;

public class Data {

    private String message;
    private boolean transfer = true;

    public synchronized String redeive(){
        while (transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        transfer = true;
        String receivedMessage = this.message;
        notifyAll();
        return receivedMessage;
        
    }

    public synchronized void send(String sendMessage){
        while (!transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        transfer = false;
        this.message = sendMessage;
        notifyAll();
    }
}
