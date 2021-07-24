import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class Mysql
{
public static void main(String arg[])throws Exception
{
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1718");
if(con==null)
{
System.out.println("Connection is not Established");
}
else
{
System.out.println("Connection is Established");
Statement st=con.createStatement();
String query="Select* from student ";
ResultSet rs= st.executeQuery(query);

//System.out.println(con.getClass());
while(rs.next()!=false)
{

System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getFloat(4));
}
}


System.out.println();

Scanner sc= new Scanner(System.in);
System.out.println("Please enter Roll no:-");
int roll=sc.nextInt();
String query ="Select* from student where roll_no="+roll;
Statement st=con.createStatement();
ResultSet rs= st.executeQuery(query);

if(rs.next())
{
System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getFloat(4));
}
else
{
System.out.println("Record is not found");
}
}
}