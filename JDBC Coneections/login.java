import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class Login
{

public static void main(String arg[])throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe","root","1718");
ResultSet rs=null;
Statement st= con.createStatement();
PreparedStatement ps=null;
Scanner sc =new Scanner(System.in);

String query="Select count(0) from user where username=? and password=?";
ps = con.prepareStatement(query);

System.out.println("*****WELCOME TO APP*****");
System.out.println("Enter UserName:-");
String username=sc.next();

System.out.println("Enter Password:-");
String  password=sc.next();

ps.setString(1,username);
ps.setString(2,password);

rs=ps.executeQuery();
rs.next();

int count= rs.getInt(1);
if(count==1)
{
System.out.println("Your Login is Sucessfully");
}
else
{
System.out.println("Invalid Username and Password");
}
}
}