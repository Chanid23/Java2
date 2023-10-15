import java.sql.*; 
public class Example11_9 {
   public static void main(String args[]) {
      Connection con=null;
      Statement sql; 
      ResultSet rs;
      try{  //加载JDBC-Access连接器:
             Class.forName("com.hxtt.sql.access.AccessDriver"); 
       }
       catch(Exception e){ }
       String databasePath = "./students.accdb";
       String loginName ="";
       String password ="";
       try{
          con = 
          DriverManager.getConnection("jdbc:Access://"+databasePath, 
                                      loginName, password); //连接
       }
       catch(SQLException e){ 
           System.out.println(e);
       }

      try { 
          sql=con.createStatement();
          rs=sql.executeQuery("SELECT * FROM mess"); //查询mess表
          while(rs.next()) {
             String number=rs.getString(1);
             String name=rs.getString(2);
             Date date=rs.getDate(3);
             float height=rs.getFloat(4);
             System.out.printf("%s\t",number);
             System.out.printf("%s\t",name);
             System.out.printf("%s\t",date); 
             System.out.printf("%.2f\n",height);
          }
          con.close();
      }
      catch(SQLException e) { 
         System.out.println(e);
      }
  }
}
