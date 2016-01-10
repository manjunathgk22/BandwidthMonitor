/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servercode;

/**
 *
 * @author iseadmin
 */

import java.net.*;  //impoerting various packages required
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;

  class Serverjava {

public static void main(String[] ar) {

 int port = 6000;
    Date sysDate = new Date ();
String sysDateStr2;
sysDateStr2 = new SimpleDateFormat("yyyy-MM-dd").format(sysDate).toString();
  try {
    ServerSocket ss = new ServerSocket(port);
    System.out.println("Waiting for a client to connect...");
 System.out.println("client connected");
 System.out.println();

 String msg= null;
 String IP,Date;
 float upload,download;
  Socket socket = ss.accept();
          InputStream sin = socket.getInputStream();
    OutputStream sout = socket.getOutputStream();
      DataInputStream in = new DataInputStream(sin);
    DataOutputStream out = new DataOutputStream(sout);
    while(true)
    {
        
 msg= in.readUTF(); // wait for the client to send a line of text.
  System.out.println("IP address:" +msg);
  IP=msg;
   msg= in.readUTF();
     System.out.println("Upload:" +msg);

       upload=Float.parseFloat(msg);
   msg= in.readUTF();
 System.out.println("Download:" +msg);
 download=Float.parseFloat(msg);
 System.out.println("Date:" +sysDateStr2);
Date=sysDateStr2;
 recieveTrafficRates(IP,upload,download);
 out.writeUTF(msg);
 //in.read(b);
 out.flush();
 System.out.println("Waiting for the next line...");
 System.out.println();
}

} catch(Exception x) {

x.printStackTrace();
}
}



 public static void recieveTrafficRates(String IP,float upload,float download) {
       System.out.println("Insertion of Data into Database!");
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "traffic_report";
    String driverName = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "root";
    String IP_address=IP;

    float up=upload,down=download;

    try{
      Class.forName(driverName).newInstance();
      con = DriverManager.getConnection(url+dbName, userName, password);
      try{
        Statement st = con.createStatement();

        int val = st.executeUpdate("INSERT current_traffic VALUES('"+IP+"','"+up+"','"+down+"')");

        System.out.println("Data Entry process successfully!");
      }
      catch(SQLException s){
        System.out.println("Table all ready exists!"+s);
      }
      con.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
    }
 }


