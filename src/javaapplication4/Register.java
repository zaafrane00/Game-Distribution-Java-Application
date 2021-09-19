
package javaapplication4;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Register {   

public   void regiterbd (String Nomm,String Prenomm,String emaill,String datee,String Passwordd,String photop){
		
		 		try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String personne="INSERT INTO USERR VALUES('"+Nomm+"','"+Prenomm+"','"+emaill+"','"+Passwordd+"','"+photop+"','"+datee+"')";
			int nb=st.executeUpdate(personne);
            
			if(nb == 1) System.out.println("Insertion effectuée avec succès.");//nombre des lignes inserer
			else System.out.println("Pas d'insertion."); 
			st.close();
			con.close();

		
		
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}
		 
	}


        
    }
