package Stream.sender_receiver;

public class Sender implements Runnable{
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        String[] message = {
                "birinchi xabar",
                "ikkinchi xabar",
                "maxfiy kodlar",
                "java kodlari",
                "end"
        };
        for (String s : message){
            System.out.println("------------------------");
            System.out.println("Send message: " + s);
            data.send(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
