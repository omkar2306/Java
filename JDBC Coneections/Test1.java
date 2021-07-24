class Demo
{
static
{
System.out.println("Demo static block");
}
Demo()
{
System.out.println("Demo Constructor");

}
}

class Test1
{
static
{
System.out.println("Test Static Block");

}
Test1()
{
System.out.println("Test constructor");
}
public static void main(String arg[])
{
Class.forName("Demo");
}
}
