class A
{
void fun()
{
System.out.println("fun function of class A");
}
virtual void gun()
{
System.out.println("virtual gun function of class A");
}

void sun()
{
System.out.println("sun function of class A");
}

virtual void run()
{
System.out.println("virtual run function of class A");
}
}
class B:public A
{
virtual void fun()
{
System.out.println("virtual fun function of class B");
}
virtual void gun()
{
System.out.println("virtual function of class B");
}

virtual void sun()
{
System.out.println("sun function of class B");
}

void run()
{
System.out.println("run function of class B");
}

void mun()
{
System.out.println("Mun function of class B");
}

void tun()
{
System.out.println("tun function of class B");
}
}