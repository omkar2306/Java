import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

class img1
{
public static void main(String args[])throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe","root","1718");

Scanner sc=new Scanner(System.in);
String query="select *from image5 where sid=?";
ps = con.prepareStatement(query);
System.out.println("Enter id to see image");
int sid=sc.nextInt();
ps.setInt(1,sid);
rs=ps.executeQuery();
rs.next();
InputStream is= rs.getBinaryStream(2);
FileOutputStream fos= new FileOutputStream("ma.jpeg");
IOUtils.copy(is,fos);
System.out.println("Image are Fetched");

}
}