import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class Login
{

public static void main(String arg[])throw Exception
{
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe","root","1718");

Scanner sc =new Scanner(System.in);
System.out.println("WELCOME TO APP");
System.out.println("Enter UserName:-");
String username=sc.next();
System.out.println("Enter Password:-");
int pass=sc.nextInt();



