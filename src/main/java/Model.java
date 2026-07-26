import java.sql.*;
public class Model {

	private String name;
	private String email;
	private String number;
	private String city;
	private String password;
	private Connection connect;
	private PreparedStatement pstmt;
	int row =0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int register() {
		try {
			connect =Jdbc_util.getConnection();
			
			 String sql =("INSERT INTO userinfo (name,email,number,city,password) VALUES(?,?,?,?,?)");
			 pstmt=connect.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3,number);
			pstmt.setString(4, city);
			pstmt.setString(5, password);
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				Jdbc_util.closeConnection(connect, pstmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row ;
	}
	
}
