package Stream.sender_receiver;

public class Receiver implements Runnable{
    private Data data;

    public Receiver(Data data){
        this.data = data;
    }


    @Override
    public void run() {
        String s;
        while (!(s = data.redeive()).equalsIgnoreCase("end")){
            System.out.println("Received message: " + s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
