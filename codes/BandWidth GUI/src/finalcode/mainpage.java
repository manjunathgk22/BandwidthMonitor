/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mainpage.java
 *
 * Created on Apr 9, 2010, 8:12:51 PM
 */

package frontend;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;
/**
 *
 * @author kk
 */
public class mainpage extends javax.swing.JFrame {
int cnt=0;
    /** Creates new form mainpage */
    public mainpage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("    BANDWIDTH   MONITOR  AND  TRAFFIC  REPORTER.");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("REPORTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("GRAPH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("BANDWIDTH MONITOR.");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("TRAFFIC REPORTER.");

        jTextArea1.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 13));
        jTextArea1.setForeground(new java.awt.Color(51, 0, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("1) Logs the Bandwidth Usage.\n\n2) Determines the upload\n   and download rates.\n\n3) Generates a graph.");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jTextArea2.setForeground(new java.awt.Color(102, 0, 102));
        jTextArea2.setRows(5);
        jTextArea2.setText("1)Generates reports \n  based on Bandwidth\n  usage.\n2)Generates daily \n  reports.\n3)Generates reports \n  between dates.");
        jScrollPane2.setViewportView(jTextArea2);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("QUIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 153));
        jButton5.setText("CURRENT 2 DAILY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel2))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        new mainpage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new graph().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new report().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

           
         float Upload,Download;


   // System.out.println("Getting All Rows from a table!");
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/";
    String db = "TRAFFIC_REPORT";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String pass = "root";
    Date sysDate = new Date ();
String TodayDate;
TodayDate = new SimpleDateFormat("yyyyMMdd").format(sysDate).toString();
// System.out.println("date="+TodayDate);
    try{
      Class.forName(driver).newInstance();
      con = DriverManager.getConnection(url+db, user, pass);
      try{
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("SELECT IP_Address,sum(UploadinMB) as UploadinMB,sum(DownloadinMB) as DownloadinMB FROM  current_Traffic group by(IP_Address)");
       // System.out.println("IP_Address "+ "\t" + "Upload "+ "\t" + "Download ");
     
        while (res.next()) {

        String  IP_Address=res.getString("IP_Address");
          Upload = res.getFloat("UploadinMB");
            Download = res.getFloat("DownloadinMB");
        //  System.out.println( IP_Address + "\t" + Upload + "\t" + Download );
          //insert into daily_traffic
          try{
        st = con.createStatement();

// int val = st.executeUpdate("INSERT into daily_traffic VALUES("+TodayDate+","+IP_Address+","+Upload+","+Download+")");
 // int val = st.executeUpdate("INSERT into daily_traffic VALUES(date,IP_Address,Upload,Download)");
   // int  val = st.executeUpdate("INSERT daily_traffic "+"VALUES('02/02/02','09.09.09.9',4,6)");


 int  val = st.executeUpdate("INSERT daily_traffic "+"VALUES('"+TodayDate+"','"+IP_Address+"','"+Upload+"','"+Download+"')");
       cnt++;
      }
      catch (SQLException s){
        System.out.println("SQL statement is not executed!"+s);
      }
         st.executeUpdate("delete from current_traffic");
        }
        con.close();
        if(cnt==0)
             JOptionPane.showMessageDialog(null, "No records in current traffic");
        else
       JOptionPane.showMessageDialog(null, "Current traffic records are inserted into daily traffic successfully ");
        cnt=0;
      }
      catch (SQLException s){
        System.out.println("SQL code does not execute."+s);
      }
    }
    catch (Exception e){
      e.printStackTrace();
    }




    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}