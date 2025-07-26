public class RunnableEX implements Runnable
{
        public void run()
        {
            System.out.println("Runnable Interface");
        }

        public static void main(String[] args) {
            
            RunnableEX r = new RunnableEX();

            Thread t = new Thread(r);

            t.start();
        }
}
