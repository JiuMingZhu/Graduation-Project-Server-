package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.GetProperties;

public class DBManager {
	// 数据库链接字段
	String url;
	String port;
	String dbName;
	String userName;
	String passWord;
	String mySqlPath;
	// 数据库操作字段
	String insql;
	String upsql;
	String desql;
	String sesql;
//	 Get current user work directory
	 String propertiesPath;
	 public void SetPropertiesPath(String propertiesPath)
	 {this.propertiesPath=propertiesPath+"/DBManager.properties";
	 System.out.println("设置propertiePath为： "+propertiesPath);}
	// String propertiesPath =
	// "f:/GitHub/Graduation-Project-Server-/src/util/DBManager.properties";
	Connection conn = null;

	public DBManager() {
		// 构造函数
	}

	public java.sql.Connection getConnection() {
		// 从properties文件中读取配置
		// 取得数据库连接
		url = GetProperties.GetValueByKey(propertiesPath, "Url");
		port = GetProperties.GetValueByKey(propertiesPath, "Port");
		dbName = GetProperties.GetValueByKey(propertiesPath, "DbName");
		userName = GetProperties.GetValueByKey(propertiesPath, "UserName");
		passWord = GetProperties.GetValueByKey(propertiesPath, "PassWord");
		mySqlPath = url + port + dbName;
		System.out.println(
				"从properties文件中取得的数据是: " + url + "\t" + port + "\t" + dbName + "\t" + userName + "\t" + passWord);
		System.out.println("mySqlPath是: " + mySqlPath);
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载驱动成功");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("加载驱动失败");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(mySqlPath, userName, passWord);
			System.out.println("连接数据库成功");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertSql(PreparedStatement ps) {
		// 插入数据
		try {
			int result = ps.executeUpdate();
			if (result > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteSql(PreparedStatement ps) {
		// 删除数据
		try {
			int result = ps.executeUpdate();
			if (result > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateSql(PreparedStatement ps) {
		// 更新数据
		try {
			int result = ps.executeUpdate();
			if (result > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ResultSet selectSql(Statement stmt, String sesql) {
		// 查询数据
		try {
			ResultSet rs = stmt.executeQuery(sesql);
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
