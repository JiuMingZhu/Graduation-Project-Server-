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
	// ���ݿ������ֶ�
	String url;
	String port;
	String dbName;
	String userName;
	String passWord;
	String mySqlPath;
	// ���ݿ�����ֶ�
	String insql;
	String upsql;
	String desql;
	String sesql;
//	 Get current user work directory
	 String propertiesPath;
	 public void SetPropertiesPath(String propertiesPath)
	 {this.propertiesPath=propertiesPath+"/DBManager.properties";
	 System.out.println("����propertiePathΪ�� "+propertiesPath);}
	// String propertiesPath =
	// "f:/GitHub/Graduation-Project-Server-/src/util/DBManager.properties";
	Connection conn = null;

	public DBManager() {
		// ���캯��
	}

	public java.sql.Connection getConnection() {
		// ��properties�ļ��ж�ȡ����
		// ȡ�����ݿ�����
		url = GetProperties.GetValueByKey(propertiesPath, "Url");
		port = GetProperties.GetValueByKey(propertiesPath, "Port");
		dbName = GetProperties.GetValueByKey(propertiesPath, "DbName");
		userName = GetProperties.GetValueByKey(propertiesPath, "UserName");
		passWord = GetProperties.GetValueByKey(propertiesPath, "PassWord");
		mySqlPath = url + port + dbName;
		System.out.println(
				"��properties�ļ���ȡ�õ�������: " + url + "\t" + port + "\t" + dbName + "\t" + userName + "\t" + passWord);
		System.out.println("mySqlPath��: " + mySqlPath);
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���������ɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(mySqlPath, userName, passWord);
			System.out.println("�������ݿ�ɹ�");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�������ݿ�ʧ��");
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertSql(PreparedStatement ps) {
		// ��������
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
		// ɾ������
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
		// ��������
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
		// ��ѯ����
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
