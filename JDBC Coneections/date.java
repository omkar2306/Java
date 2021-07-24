import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.sql.Statement;


class Date
{
public static void main(String arg[])throws Exception
{
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
Scanner sc= new Scanner(System.in);
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe", "root","1718");


String query="insert into date values(?,?,?)";
ps = con.prepareStatement(query);

System.out.println("Enter the id:-");
int sid=sc.nextInt();
System.out.println("Enter the Name:-");
String sname=sc.next();
System.out.println("Enter the Birth Date:-");
String sdob=sc.next();

SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
java.util.Date jdate= sdf.parse(sdob);
System.out.println(jdate);

long ms=jdate.getTime();

java.sql.Date sdate = new java.sql.Date(ms);
System.out.println(sdate);

ps.setInt(1,sid);
ps.setString(2,sname);
ps.setDate(3,sdate);

int count= ps.executeUpdate();

if(count==1)
{
System.out.println("Record Inserted Sucessfully");
}
else
{
System.out.println("Record Not Inserted");
}
String query2="select* from date";

Statement st= con.createStatement();
ResultSet rs1= st.executeQuery(query2);

while(rs1.next()!=false)
{
System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
}
}
}