import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class Mysql
{
public static void main(String args[])
{
Connection con=null;
Statement st=null;
ResultSet rs=null;
Scanner sc=null;
try
{
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1718");
}
catch(Exception e)
{
System.out.println("Data base connection Exception");
}
if(con==null)
{
System.out.println("Connection is not Established");
}
else
{
System.out.println("Connection is Established");
st=con.createStatement();


String query="Select* from student ";
try
{
rs= st.executeQuery(query);
}
catch(Exception e)
{
System.out.println("SQL EXception");
}
//System.out.println(con.getClass());
while(rs.next()!=false)
{

System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getFloat(4));
}
}

System.out.println();

sc= new Scanner(System.in);
System.out.println("Please enter Roll no:-");
int roll=sc.nextInt();
st=con.createStatement();

String query ="Select* from student where roll_no="+roll;
try
{
rs= st.executeQuery(query);
}
catch(Exception e)
{
System.out.println("Sql Exception");
}

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
