import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

class Pinsert
{
public static void main(String arg[])throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1718");
ResultSet rs=null;
PreparedStatement ps=null;
Scanner sc= new Scanner(System.in);
Statement st= con.createStatement();

String query="insert into stud values(?,?,?,?)";
ps= con.prepareStatement(query);

System.out.println("Enter the roll no:-");
int roll=sc.nextInt();

System.out.println("Enter the Name:-");
String name=sc.next();

System.out.println("Enter the Address:-");
String address=sc.next();

System.out.println("Enter the Percentage:-");
float perce=sc.nextFloat();

ps.setInt(1,roll);
ps.setString(2,name);
ps.setString(3,address);
ps.setFloat(4,perce);


int count=ps.executeUpdate();

if(count==1)
{
System.out.println("Record Inserted Sucessfully");
}
else
{
System.out.println("Record not inserted");
}
System.out.println();
String query1="select* from stud";
ResultSet rs1= st.executeQuery(query1);

while(rs1.next()!=false)
{
System.out.println(rs1.getInt(1)+" "+ rs1.getString(2)+" "+ rs1.getString(3)+" "+ rs1.getFloat(4));
}
System.out.println();
System.out.println("Enter the ID which data U want to delete:-");
int sroll=sc.nextInt();
String query2="delete from stud where roll="+sroll;
st.executeUpdate(query2);
String query3="Select* from Stud";
ResultSet rs3= st.executeQuery(query3);
while(rs3.next()!=false)
{
System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getString(3)+" "+rs3.getFloat(4));
}

System.out.println();
System.out.println("Data Are Delete Sucessfully");
}
}