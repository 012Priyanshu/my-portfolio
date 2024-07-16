class abb implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("i="+i);
        }
    }
}

public class ab{
    public static void main(String[] args) {
        abb ob=new abb();
        ob.run();
    }

}