public class ThreadEX extends Thread
{
    public void run()
    {
        System.out.println("THread Run ");
    }

    public static void main(String[] args) {

        ThreadEX t = new ThreadEX();

        t.start();

    }
}