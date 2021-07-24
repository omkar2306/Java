import java.sql.Connection;
import java.sql.DriverManager;

class Con2
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException c1)
{ 
System.out.println("class not found Exception");
}
Connection con = null;
try
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1718");
}
catch(Exception e1)
{
System.out.println("Sql Exception**");
}
if(con==null)
{
System.out.println("connection is not establish");

}
else
{
System.out.println("connection is establish");
}
}
}