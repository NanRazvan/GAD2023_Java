package Lambda;

public class LambdaFinal {
    private int a = 10;

    public void calculate(){

        a++;
        Runnable r = () -> {
            System.out.println(this.a);
        };
        r.run();
    }
}
