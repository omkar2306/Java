import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

class Insert
{
public static void main(String arg[])throws Exception
{
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1718");
Scanner sc= new Scanner(System.in);
Statement st= con.createStatement();
System.out.println("if we want to insert data enter 1:-");
int call= sc.nextInt();
if(call==1)
{
System.out.println("Enter id:-");
int sid=sc.nextInt();

System.out.println("Enter name:-");
String sname=sc.next();

System.out.println("Enter Adress:-");
String saddress=sc.next();

System.out.println("Enter Percentage:-");
float sper=sc.nextFloat();

String query = "insert into Student values("+sid+", '"+sname+"', '"+saddress+"', "+sper+")";
st.executeUpdate(query);
query="Select* from student ";
ResultSet rs=st.executeQuery(query);
while(rs.next()!=false)
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
}
System.out.println();
}
//DELETION
System.out.println("if we want to delete data enter 1:-");
int call2= sc.nextInt();
if(call2==1)
{
System.out.println("Enter the id for delete data");
int sid= sc.nextInt();
String query= "delete from student where id="+sid;
st.executeUpdate(query);
query = "select* from student";
ResultSet rs= st.executeQuery(query);
if(rs.next()==false)
{
System.out.println("Data are Wrong Please Re Enter");
}
else
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
}
System.out.println();
System.out.println("Data are Deleted Sucessfully");
}
}
}