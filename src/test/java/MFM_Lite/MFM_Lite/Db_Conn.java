package MFM_Lite.MFM_Lite;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

import org.opencv.gpu.Gpu;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;

public class Db_Conn {

       // Connection object
       static Connection con = null;

       // Statement object
       private static Statement stmt;
       private static Statement stmt1;
       // Constant for Database URL
       public static String DB_URL = "jdbc:oracle:thin:@devdb:6021:CLFYSITG";//sit g
//       public static String DB_URL = "jdbc:oracle:thin:@devdb:3012:CLFYSCI";//sit ci
      // public static String DB_URL = "jdbc:oracle:thin:@devdb:3011:CLFYSIT1";
       // Constant for Database Username
       public static String DB_USER = "sa";
       // Constant for Database Password
       public static String DB_PASSWORD = "sasitg";
//       public static String DB_PASSWORD = "sasci";
      // public static String DB_PASSWORD = "sasit1";
       
       private String esn;
       private String sim;
       private String pin;
       
       public static CallableStatement cstmt;
 
       @Test
       public void setUp(String product) throws Exception {
    	    	   
    	   
    	   if(product.equals("GoSmart"))
    	   {
    		   chkGoSmart();
    	   }
    	   else if(product.equals("FamilyMobile"))
    	   {
    		   chkFamliyMobile();
    	   }
    	   else if(product.equals("Net10"))
    	   {
    		   chkNet10();
    	   }
    	   else if(product.equals("SimpleMobile"))
    	   {
    		   chkSimpleMobile();
    	   }
    	   else if(product.equals("Telcel"))
    	   {
    		   chkTelcel();
    	   }
    	   else if(product.equals("TotalWireless"))
    	   {
    		   chkTotalWireless();
    	   }
    	   else if(product.equals("StraightTalk"))
    	   {
    		   chkStraightTalk();
    	   }
    	   else if(product.equals("TracFone"))
    	   {
    		   chkTracfone();
    	   }
    	   else if(product.equals("MFM_Lite"))
    	   {
    		   chkMFMLite();
    	   }
    	   
       }   
       
       public void chkMFMLite()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "WFMLGL57BGP" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "WFM128PSIMT5TM" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "WFMAPPU0039" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }
       }
       
       public void chkTracfone()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "TFLGL57BGP4" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "TF128PSIMC4N" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "TSAPP50030" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }
       }
              
       
       public void chkStraightTalk()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "STALA571VCP" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "TF256PSIMV9RM" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "NTAPPMP00045" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }
       }
       
       public void chkTotalWireless()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "TWLGL52VC" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "TF256PSIMV9N" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "TWAPP00035" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }
       }
       
       
       public void chkTelcel()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "TCALA570BGRCS5" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "TF128PSIMT5RM" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "TCAPP00045ILD" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }
       }
       
       
       public void chkGoSmart()throws Exception
       {
//    	   try{
               // Make the database connection
               String dbClass = "oracle.jdbc.driver.OracleDriver";
               Class.forName(dbClass).newInstance();
               // Get connection to DB
               Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
               // Statement object to send the SQL statement to the Database
               stmt = con.createStatement();
               
               //Get ESN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");
	
	                     cstmt.registerOutParameter(1, Types.VARCHAR);
	                     cstmt.setString(2, "PHGS128PSIMT5DD" );
	                     Boolean mytxt = cstmt.execute();
	                     
	                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
	                     //System.out.println("Esn Value is : "+esnValue);
               
               //Get_SIM
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");
	
	                     sim.registerOutParameter(1, Types.VARCHAR);
	                     sim.setString(2, "GS128PSIMT5DD" );
	                     Boolean sim1 = sim.execute();
	                    
	                     String Sim = sim.getString(1); // this will have the ESN value. 
	                     //System.out.println("SIM Value is : "+Sim);
               
               
               //Get_PIN
		                   //code snippet to execute and get the results for PL/SQL function. 
		                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
		
		                     pin.registerOutParameter(1, Types.VARCHAR);
		                     pin.setString(2, "GSAPPU0045" );
		                     Boolean Pin1 = pin.execute();
		                    
		                     String Pin = pin.getString(1); // this will have the ESN value. 
		                     System.out.println("Esn Value is : "+esnValue+"\n"+
		                    		 			"Pin Value is : "+Pin+"\n"+
		                    		 			"SIM Value is : "+Sim);
		                    
   	      // create the java mysql update preparedstatement
	                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
	                     PreparedStatement preparedStmt = con.prepareStatement(query);
	                     preparedStmt.setString(1, Sim);
	                     preparedStmt.setString(2, esnValue);
	                     // execute the java preparedstatement
		         	     preparedStmt.executeUpdate();
		         	     
		         	     setEsn(esnValue);
	                     setSim(Sim);
	                     setPin(Pin);
	                     con.close();
		         	    
//           	  }
//	       catch (Exception e)
//	       {
//		                   e.printStackTrace();
//		                   System.err.println("Got an exception! ");
//		                   System.err.println(e.getMessage());
//	       }
       }
      
       
       public void chkFamliyMobile()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "WFMLGL57BGP" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "WFM128PSIMT5TM" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "WFMAPPU0039" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       } 
       }
       
       public void chkNet10()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "NTLG329GP5P" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "TF64SIMT5" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "NTAPP6U040" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }  
       }
      
       
       public void chkSimpleMobile()throws Exception
       {
//    	   try{
           // Make the database connection
           String dbClass = "oracle.jdbc.driver.OracleDriver";
           Class.forName(dbClass).newInstance();
           // Get connection to DB
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // Statement object to send the SQL statement to the Database
           stmt = con.createStatement();
           
           //Get ESN
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement cstmt = con.prepareCall("{? = call Get_Test_Esn(?)}");

                     cstmt.registerOutParameter(1, Types.VARCHAR);
                     cstmt.setString(2, "SMZEZ828TG3P5" );
                     Boolean mytxt = cstmt.execute();
                     
                     String esnValue = cstmt.getString(1); // this will have the ESN value. 
                     //System.out.println("Esn Value is : "+esnValue);
           
           //Get_SIM
                   //code snippet to execute and get the results for PL/SQL function. 
                     CallableStatement sim = con.prepareCall("{? = call Get_Test_Sim(?)}");

                     sim.registerOutParameter(1, Types.VARCHAR);
                     sim.setString(2, "SM128PSIMT5N" );
                     Boolean sim1 = sim.execute();
                    
                     String Sim = sim.getString(1); // this will have the ESN value. 
                     //System.out.println("SIM Value is : "+Sim);
           
           
           //Get_PIN
	                   //code snippet to execute and get the results for PL/SQL function. 
	                     CallableStatement pin = con.prepareCall("{? = call Get_Test_Pin(?)}");
	
	                     pin.registerOutParameter(1, Types.VARCHAR);
	                     pin.setString(2, "SMNAPP0050BBUNL" );
	                     Boolean Pin1 = pin.execute();
	                    
	                     String Pin = pin.getString(1); // this will have the ESN value. 
	                     System.out.println("Esn Value is : "+esnValue+"\n"+
	                    		 			"Pin Value is : "+Pin+"\n"+
	                    		 			"SIM Value is : "+Sim);
	                    
	      // create the java mysql update preparedstatement
                     String query = "UPDATE TABLE_PART_INST SET X_ICCID = ? WHERE PART_SERIAL_NO = ?";
                     PreparedStatement preparedStmt = con.prepareStatement(query);
                     preparedStmt.setString(1, Sim);
                     preparedStmt.setString(2, esnValue);
                     // execute the java preparedstatement
	         	     preparedStmt.executeUpdate();
	         	     
	         	     setEsn(esnValue);
                     setSim(Sim);
                     setPin(Pin);
                     con.close();
	         	    
//       	  }
//       catch (Exception e)
//       {
//	                   e.printStackTrace();
//	                   System.err.println("Got an exception! ");
//	                   System.err.println(e.getMessage());
//       }  
       }
       
       
       

       public void setEsn(String esn)
       {
    	   this.esn = esn;
       }
       public String getEsn()
       {
    	   return esn;
       }
       public void setSim(String sim)
       {
    	   this.sim = sim;
       }
       public String getSim()
       {
    	   return sim;
       }
       public void setPin(String pin)
       {
    	   this.pin = pin;
       }
       public String getPin()
       {
    	   return pin;
       }

}