class Harish
{
    int i;
    static int count=0;
    Harish()
    {
        i=1;
        count++;
    }

    Harish(int x)
    {
        i = x;
        count++;
    }

    Harish(int a,int b)
    {
        i = a+b;
        count++;
    }

    static void showNoOfObjects()
    {
        System.out.println("No of Object created = "+count);
    }
}




public class StaticVariableExample
{
    public static void main(String args[])
    {
            Harish o1  = new Harish();
            
            Harish o2 = new Harish(5);

            Harish o3 =  new Harish(5,6);

            Harish.showNoOfObjects();
    }
}