package day1;

class P
{
    public static void m1()
    {
        System.out.println("Parent class");
        
    }
}
class C extends P
{
    public static void m1()
    {
        System.out.println("Child class");
    }
}
class Test
{
    @SuppressWarnings("static-access")
	public static void main(String[] args)
    {
    P p = new P();
    p.m1();
    C c = new C();
    c.m1();
    P p1 = new C();
    p1.m1();
    }
}

