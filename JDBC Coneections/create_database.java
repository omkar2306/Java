import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Create
{
public static void main(String arg[])throws Exception
{
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","1718");
Statement st= con.createStatement();
if(con!=null)
{
st=con.createStatement();
}
else
{
System.out.println("Connection are not Established");
}

if(st!=null)
{
int count=st.executeUpdate("create database Avcoe");

	if(count!=0)
	{
	System.out.println("Database created");
	}
	else
	{
	System.out.println("Database does not created");
	}
}

else 
  {
  System.out.println("statement not created");
  }
}
}