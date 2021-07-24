import java.sql.Connection;
import java.sql.DriverManager;

class Connection
{
public static void main(String args[])throws Exception
{

//Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = null;
con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1718");

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