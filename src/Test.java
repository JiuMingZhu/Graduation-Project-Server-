
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.DBManager;
import util.GetProperties;

public class Test {
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// DB Connection
		Connection conn = null;
		// Insql
		String insql;
		// Desql
		String desql;
		// Upsql
		String upsql;
		// Sesql
		String sesql;
		// PreparedStatement
		PreparedStatement ps = null;
		Statement stmt =null;
		DBManager gc = new DBManager();
		conn = gc.getConnection();
		if (conn == null)
			throw new Exception("Error when getting DB Connection");

		// Initial ps
		/**
		 * ≤‚ ‘≤Â»Î
		 */
		insql = "insert into USER(userName,userPasswd) values(?,?)";
		ps = (PreparedStatement) conn.prepareStatement(insql);
		ps.setString(1, "UserName");
		ps.setString(2, "UserPasswd");
		if (gc.insertSql(ps))
			System.out.println("Insert Success!");
		else
			System.out.println("Insert Failure!");
		ps = null;
		
//		/**
//		 * ≤‚ ‘…æ≥˝
//		 */
//		desql = "delete from USER where userName='UserName' and userPasswd='UserPasswd'";
//		ps = (PreparedStatement) conn.prepareStatement(desql);
//		if (gc.deleteSql(ps))
//			System.out.println("Delete Success!");
//		else
//			System.out.println("Delete Failure!");

		/**
		 * ≤‚ ‘∏¸–¬
		 */
		upsql = "update USER set userPasswd='1' where userName='UserName'";
		ps = (PreparedStatement) conn.prepareStatement(upsql);
		if (gc.updateSql(ps))
			System.out.println("Update Success!");
		else
			System.out.println("Update Failure!");
		
		
		/**
		 * ≤‚ ‘≤È—Ø
		 */
		sesql ="select * from USER";
		stmt =conn.createStatement();
		ResultSet rs=gc.selectSql(stmt, sesql);
		if(rs!=null){
			System.out.println("”√ªß√˚"+"\t\t"+"√‹¬Î"+"\t");
			while(rs.next()){
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println();
			}
		}
		else
			System.out.println("Select Failure!");
	}
}
