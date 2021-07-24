import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

class Img
{
public static void main(String arg[])throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
Scanner sc=new Scanner(System.in);
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avcoe", "root","1718");

System.out.println("Enter The id:-");
int sid=sc.nextInt();

String query="select  from image where sid=?";
ps=con.preparedStatement(query);
ps.setInt(1,sid);
rs=ps.executeQuery();
rs.next();
InputStream is =rs.getBinaryStream(4);
FileOutputStream fos =new FileOutStream("mahesh.jpeg");
IOUtils.copy(is,fos);
System.out.println("Image Fetched Sucessfully);
}
}