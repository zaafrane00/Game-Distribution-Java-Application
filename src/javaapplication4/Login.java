
package javaapplication4;
import java.sql.*;
public class Login {
   protected String essm="";
    public boolean  exist (String username,String pass){
		String emaill="";
		String password="";
                 String Nomm="";
                 String Prenomm="";
                 String photoo="";
                 String dateu="";
                 
		 		try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String sql="select * from userr where email='"+username+"'";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			  Nomm=rs.getString(1);
			Prenomm=rs.getString(2);
			 emaill= rs.getString(3) ;
                         password = rs.getString(4) ;
                          photoo=rs.getString(5);
                          dateu=rs.getString(6);
			 }	
		//user p=new user(Nom,Prenom,email,date,Password,photo);
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}
		 emaill=emaill.toUpperCase();
		 password=password.toUpperCase();
                  System.out.println(Nomm+emaill);
		 if(emaill.equals(username.toUpperCase())&&password.equals(pass.toUpperCase()))
                 {
			essm=username;
                     return true ;
                     
                 }
		 else
		 return false;
	}

		
}

