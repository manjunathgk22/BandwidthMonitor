/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author iseadmin
 */
import java.io.*;

	import jpcap.JpcapCaptor;

	import jpcap.NetworkInterface;

	import jpcap.packet.*;
import java.net.*;


	class Main {

 public int download=0;
public String upload="0";
public String counts;
//public float upload=2.5f,download=4.5f;
public String IP="bdksd";
//public Float fO = new Float(upload);
//public Float f= new Float(download);
public String count=new String();

 int serverPort = 6000;
String address = "192.168.20.184";	/* variables */

	JpcapCaptor captor;

	NetworkInterface[] list;

	String str,info;

	int x, choice;



	public static void main(String args[]) {

	new Main();

	}



	public Main() {



	/* first fetch available interfaces to listen on */

	list = JpcapCaptor.getDeviceList();

	System.out.println("Available interfaces: ");



	for(x=0; x<list.length; x++) {

	System.out.println(x+" -> "+list[x].description);

	}

	System.out.println("-------------------------\n");

	choice = Integer.parseInt(getInput("Choose interface (0,1..): "));

	System.out.println("Listening on interface -> "+list[choice].description);

	System.out.println("-------------------------\n");

	/*Setup device listener */

	try {

	captor=JpcapCaptor.openDevice(list[choice], 65535, false, 20);

	/* listen for TCP/IP only */

	captor.setFilter("ip and tcp", true);

	}

	catch(IOException ioe) { ioe.printStackTrace(); }

try {
     InetAddress thisIp =
        InetAddress.getLocalHost();
      IP=thisIp.getHostAddress();
     }
    catch(Exception e) {
    e.printStackTrace();
     }
	/* start listening for packets */

	
try {
InetAddress ipAddress = InetAddress.getByName(address);
System.out.println("client waiting for connection at " + address + " and port " + serverPort + "?");

 Socket socket = new Socket(ipAddress, serverPort);
System.out.println(" client socket created");


InputStream sin = socket.getInputStream();
OutputStream sout = socket.getOutputStream();


DataInputStream in = new DataInputStream(sin);
DataOutputStream out = new DataOutputStream(sout);


BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

 String line = null;
 while(true) {
//line = keyboard.readLine(); // wait for the user to type in something and press enter.
while (true) {
	Packet info = captor.getPacket();

	if(info != null)
        {
	//System.out.println(getPacketText(info));
       // System.out.println(captor.getPacket().len);
        try{
   //  System.out.println(captor.getPacket().data);
            // System.out.println(captor.getPacket().header);
             System.out.println(captor.getPacket().len);
             download+=captor.getPacket().len;
             byte[] b=captor.getPacket().header;
             System.out.println(b[0]);
             Integer c=new Integer(download);
             count=c.toString();
            
          //  System.out.println(captor.getPacket().data);
            // System.out.println(captor.getPacket().header);
System.out.println("count="+download);
        }
catch(Exception e)
        {
            System.out.println(e);
        }
            }
 System.out.println("Sending this line to the server...");
out.writeUTF(IP); // send the above line to the server.

out.writeUTF(upload);
out.writeUTF(count);
download=0;
System.out.println(IP);
System.out.println(count);
//out.writeUTF(s);
out.flush();
Long stoptime = 2000L; //2 Seconds
try {
Thread.sleep(stoptime);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println();
}
} 
}
 catch(Exception x) {

x.printStackTrace();
}

}
  
	
            





	/* get user input */

	public static String getInput(String q) {

	String input = "";

	System.out.print(q);

	BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));

	try {

	input = bufferedreader.readLine();

	}

	catch(IOException ioexception) { }

	return input;

	}





	/* return packet data in true text */

	String getPacketText(Packet pack){

	int i=0,j=0;

	byte[] bytes=new byte[pack.header.length + pack.data.length];



	System.arraycopy(pack.header, 0, bytes, 0, pack.header.length);

	System.arraycopy(pack.data, 0, bytes, pack.header.length, pack.data.length);

	StringBuffer buffer = new StringBuffer();



	for(i=0; i<bytes.length;) {

	for(j=0;j<8 && i<bytes.length;j++,i++) {

	String d = Integer.toHexString((int)(bytes [i] &0xff));

	buffer.append((d.length() == 1 ? "0" + d:d ) + " ");



	if(bytes[i]<32 || bytes[i]>126)

	bytes[i] = 46;

	}

	}

	return new String(bytes,i - j, j);

	}

	} /* end class */


