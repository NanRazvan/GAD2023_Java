package CodeChallages.RabbitRace;

public class RabbitRunnable implements Runnable{
    private int nr;
    public RabbitRunnable(int nr){
        this.nr= nr;
    }
    @Override
    public void run() {
        System.out.println("Rabbit "+nr+" is not running");
    }
}
