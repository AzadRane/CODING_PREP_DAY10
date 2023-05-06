

class MyNumber
{
    private int i ;

    MyNumber()
    {
        i = 0;
    }

    MyNumber(int i)
    {
        this.i=i;
    }

    boolean isNegative()
    {
        if(i<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isPositive()
    {
        if(i>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isZero()
    {
        if(i==0)
        return true;
        else
        return false;
    }

    boolean isOdd()
    {
        if(i%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    boolean isEven()
    {
        if(i%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


public class MyNumberDemo{
    
    public static void main(String []args)
    {

        MyNumber ob;

        if(args.length==0)
        {
             ob = new MyNumber();
        }
        else
        {
             ob = new MyNumber(Integer.parseInt(args[0]));
        }


        if(ob.isEven())
            System.out.println("Given Number is EVEN");
        if(ob.isOdd())
            System.out.println("Given Number is ODD");
        if(ob.isZero())
            System.out.println("Given Number is ZERO");
        if(ob.isNegative())
            System.out.println("Given Number is NEGATIVE");
        if(ob.isPositive())
            System.out.println("Given Number is POSITIVE");
        
        
        
         
    }
}
