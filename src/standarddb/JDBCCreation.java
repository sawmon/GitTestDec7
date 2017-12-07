package standarddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreation {
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	// Database credentials
	static final String USER = "nttd";
	static final String PASS = "nttd";

	public static void main(String args[]) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			// Class.forName("com.oracle.jdbc.Driver");
			// Class.forName is loading the class...
			// Three ways to load the class, with new, accessing the static
			// members,
			// and Class.forName()
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			String sql = "";
			sql = "CREATE TABLE ACCOUNTUSER(ACCNUMBER VARCHAR(256) NOT NULL,"+
				 "ACCHOLDER VARCHAR(256),BALANCE NUMBER(10,0),"+
			     "PRIMARY KEY (ACCNUMBER))";
			System.out.println(sql);
		stmt.execute(sql);
			
           
			
			//String sql="";
			 sql="CREATE TABLE PAYEMPLOYEE(EMPLOYEEID VARCHAR(256),"+
			  "EMPLOYEENAME VARCHAR(256),DEPTID VARCHAR(256),POSITION VARCHAR(256),"+
			  "FN VARCHAR(256),MN VARCHAR(256),PERMENTADD VARCHAR(256),CURRENTADD VARCHAR(256),"+
			  "NATIONALID VARCHAR(256),CONTACTNO VARCHAR(256),EMAIL VARCHAR(256)," +			  
			  "SALARYPERDAY NUMBER(10,0),OVERTIMERATEPERHOUR NUMBER(10,0),ACCNUMBER VARCHAR(256),"+
			  "STATUS VARCHAR(256),PRIMARY KEY(EMPLOYEEID))";
			  System.out.println(sql);
			  stmt.execute(sql);
			  
			  sql="";
			  sql="CREATE TABLE ALLOWANCE(YEAR NUMBER(10,0),MONTH NUMBER(10,0),"
			  +"TRANSPORTATIONALLOWANCEPERDAY NUMBER(10,0),HEALTHALLOWNACE NUMBER(10,0),"
			+ "HOUSINGALLOWANCE NUMBER(10,0))"; 
			  System.out.println(sql);
			  stmt.execute(sql);
			 
			  sql="";
			 sql="INSERT INTO ALLOWANCE VALUES(null,1,1000,10000,100000)";
			 System.out.println(sql);
			  stmt.execute(sql);
			  sql="";
			  sql="INSERT INTO ALLOWANCE VALUES(1,null ,1000,120000,1200000)";
			  System.out.println(sql);
			 stmt.execute(sql);
			  
			 sql="";
			  sql="CREATE TABLE SALARY(EMPLOYEEID VARCHAR(256)NOT NULL,"+
			  "TOTALWORKINGDAY NUMBER(10,0),TOTALOVERTIME NUMBER(10,0),TOTALSALARY NUMBER(10,0),"
			  + "MONTH NUMBER(10,0),YEAR NUMBER(10,0),STATUS VARCHAR(256))";
			  System.out.println(sql);
			  stmt.execute(sql);
			 

			System.out.println("Created table in given database...");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}// do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}

}
