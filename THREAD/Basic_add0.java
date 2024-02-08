public class Basic_add0 {
    public static void main(String[] args) {
        for(int i =1 ;i<50 ;i++)
        {
            print p = new print(i);
            p.start();
        }
    }
}
class print extends Thread
{
    int i;
    public print(int i)
    {
        this.i = i;
    }
    public void run()
    {
        if(i == 5)
        {
            try{
                Thread.sleep(10000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println(i);
    }
}

