/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.awt.Color;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author theki
 */
public class Games extends javax.swing.JFrame {
protected s2Prj s1;

protected InMenugames s3;
  protected   Recherche s0;
;

    /**
     * Creates new form MENU
     */
    public Games() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        game1 = new javax.swing.JLabel();
        game2 = new javax.swing.JLabel();
        game3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        game4 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        game5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        game6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel157 = new javax.swing.JLabel();
        game7 = new javax.swing.JLabel();
        jLabel157777 = new javax.swing.JLabel();
        game8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserNAME_Games = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UserLastNAME_Games = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Your Owned Games :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        game1.setText("1");
        jPanel2.add(game1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 480, -1, -1));

        game2.setText("2");
        jPanel2.add(game2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        game3.setText("3");
        jPanel2.add(game3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\theki\\Desktop\\assets\\icons8_Expand_Arrow_30px_1.png")); // NOI18N
        jButton1.setText("Show Games");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDoubleBuffered(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel6.setText(".");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel11.setText(".");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel13.setText(".");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        game4.setText("4");
        jPanel2.add(game4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, -1, -1));

        label15.setText(".");
        jPanel2.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, -1, -1));

        jLabel4.setText("..");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        game5.setText("jLabel10");
        jPanel2.add(game5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 920, -1, -1));

        jLabel10.setText("..");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        game6.setText("jLabel15");
        jPanel2.add(game6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 920, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 512, 1100, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 1080, 10));

        jLabel157.setText("..");
        jPanel2.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        game7.setText("jLabel16");
        jPanel2.add(game7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 920, -1, -1));

        jLabel157777.setText("..");
        jPanel2.add(jLabel157777, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, -1, -1));

        game8.setText("jLabel16");
        jPanel2.add(game8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 920, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 970, 1070, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1170, 990));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1180, 570));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\assets\\9999.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\theki\\Desktop\\assets\\icons8_Close_Window_48px.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 280, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\theki\\Desktop\\assets\\icons8_Search_24px.png")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 50));

        UserNAME_Games.setText("1");
        jPanel3.add(UserNAME_Games, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 70, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("_________");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 80, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_______");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 70, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1190, -1));

        UserLastNAME_Games.setText("2");
        jPanel3.add(UserLastNAME_Games, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 70, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("_________");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 51));
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\theki\\Desktop\\assets\\icons8_User_48px_1.png")); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(false);
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\theki\\Desktop\\assets\\icons8_Menu_24px.png")); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 24, -1, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Store");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 90));

        setSize(new java.awt.Dimension(1182, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    declarations();
        this.setVisible(false);
        s3.setVisible(true);
        s3.UserLastNAME_ingamem.setText(this.UserLastNAME_Games.getText());
s3.UserNAME_ingamem.setText(this.UserNAME_Games.getText());
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //nomgame= new String[8];
       String gamexx="";
       Vector c=new Vector();
       c.setSize(10);
       
       String emailgame1=getemail(this.UserLastNAME_Games.getText(),this.UserNAME_Games.getText());
       String pwdgame1=getpwd(this.UserLastNAME_Games.getText(),this.UserNAME_Games.getText());
       System.out.println(emailgame1+pwdgame1);
       try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
                
		String sql="select * from play where email='"+emailgame1+"' and pass='"+pwdgame1+"'";
                
		ResultSet rs=st.executeQuery(sql);
		int i=0;
		while(rs.next()){
			 
			 gamexx= rs.getString(3) ;  
                         
                   c.set(i, gamexx);
                   i++;
			 }
                 System.out.println(c.get(0));
                game1.setText(c.get(0).toString());
                game2.setText(c.get(1).toString());
                game3.setText(c.get(2).toString());
                game4.setText(c.get(3).toString());
              game5.setText(c.get(4).toString());
              game6.setText(c.get(5).toString());
              game7.setText(c.get(6).toString());
              game8.setText(c.get(7).toString());
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}
       /***********************************************************************************/
      // System.out.println(getpathI(game1.getText()));
      ImageIcon i =new ImageIcon(getpathI(game1.getText()));
      ImageIcon i1 =new ImageIcon(getpathI(game2.getText()));
      ImageIcon i2 =new ImageIcon(getpathI(game3.getText()));
       ImageIcon i3 =new ImageIcon(getpathI(game4.getText()));
      ImageIcon i4 =new ImageIcon(getpathI(game5.getText()));
       ImageIcon i5 =new ImageIcon(getpathI(game6.getText()));
        ImageIcon i6 =new ImageIcon(getpathI(game7.getText()));
        ImageIcon i7 =new ImageIcon(getpathI(game8.getText()));
      jLabel6.setIcon(i);
      jLabel11.setIcon(i1);
      jLabel13.setIcon(i2);
      label15.setIcon(i3);
     jLabel4.setIcon(i4);
     jLabel10.setIcon(i5);
      jLabel157.setIcon(i6);
        jLabel157777.setIcon(i7);
       /***********************************************************************************/
       /***********************************************************************************/
       /***********************************************************************************/
       
      
      this.setVisible(true);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
String rech =jTextField1.getText();
String name=getnomG(rech);
if(name!=null)
{
    s0=new Recherche();
    s0.setVisible(true);
    System.out.println(name);
    s0.essem.setText(name);
    String path= getpathI(name).toString();
     ImageIcon a =new ImageIcon(path);
    s0.tasswira.setIcon(a);
    
}
    }//GEN-LAST:event_jLabel5MouseClicked
       
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Games().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel UserLastNAME_Games;
    protected javax.swing.JLabel UserNAME_Games;
    protected javax.swing.JLabel game1;
    private javax.swing.JLabel game2;
    private javax.swing.JLabel game3;
    private javax.swing.JLabel game4;
    private javax.swing.JLabel game5;
    private javax.swing.JLabel game6;
    private javax.swing.JLabel game7;
    private javax.swing.JLabel game8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel157777;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label15;
    // End of variables declaration//GEN-END:variables

    protected void declarations()
    {
       
      s3=new InMenugames();
    }
    protected String getemail(String essm,String lakab)
{
                String emaill="";
                
                
                 	try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String sql="select * from userr where nom='"+lakab+"' and prenom ='"+essm+"'";
                
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			 
			 emaill= rs.getString(3) ;
                     
			 }
                //user p=new user(Nom,Prenom,email,date,Password,photo);
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}return emaill ;
}
protected String getpwd(String essm,String lakab)
{
                String pass="";
                
                
                 	try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String sql="select * from userr where nom='"+lakab+"' and prenom ='"+essm+"'";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			 
			 pass= rs.getString(4) ;
                     
			 }
                //user p=new user(Nom,Prenom,email,date,Password,photo);
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}return pass ;
}

protected String getpathI(String essm)
{
    String path="";
                
                
                 	try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String sql="select * from game where name='"+essm+"'";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			 
			 path= rs.getString(5) ;
                     
			 }
                //user p=new user(Nom,Prenom,email,date,Password,photo);
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}return path ;
}
protected String getnomG(String essm)
{
    String essmmmm="";
                
                
                 	try {
			Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String sql="select * from game where name='"+essm+"'";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			 
			 essmmmm= rs.getString(1) ;
                     
			 }
                //user p=new user(Nom,Prenom,email,date,Password,photo);
		rs.close();
		st.close();
		con.close();
		
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}return essmmmm ;
}

}

