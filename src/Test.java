import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Test {
	
	
	
	
	
	
	
	
	public static void main (String[] args){
		
		
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:rose@//localhost:1521/xe", "rose", "Slirf1111?");
		PreparedStatement statement = conn.prepareStatement("select * from demo_customers");
			ResultSet res = statement.executeQuery();
			
			while (res.next()){
				System.out.println("ID : "+res.getObject("customer_id")+" "+res.getString("cust_first_name"));
				
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("IO");
	}

}
