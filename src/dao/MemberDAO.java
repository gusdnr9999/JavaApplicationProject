package dao;

import java.sql.*;
import vo.*;

public class MemberDAO {

  private Connection conn;
  private PreparedStatement ps;
  private static MemberDAO dao;
  private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

  private MemberDAO() {
	try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (Exception ex) {
	  throw new RuntimeException(ex);
	}
  }

  public static MemberDAO newInstance() {
	return new MemberDAO();
  }

  public Connection getConnection() {
	try {
	  conn = DriverManager.getConnection(URL, "hr", "happy");
	} catch (Exception ex) {
	  ex.printStackTrace();
	}
	return conn;
  }

  public void disConnection() {
	try {
	  if (ps != null) {
		ps.close();
	  }
	  if (conn != null) {
		conn.close();
	  }
	} catch (Exception ex) {
	  throw new RuntimeException(ex);
	}
  }

  public MemberVO isLogin(String id, String pwd) {
	MemberVO vo = new MemberVO();
	try {
	  getConnection();
	  String sql = "SELECT COUNT(*) "
		  + "FROM member "
		  + "WHERE id=?";
	  ps = conn.prepareStatement(sql);
	  ps.setString(1, id);
	  ResultSet rs = ps.executeQuery();
	  rs.next();
	  int cnt = rs.getInt(1);
	  rs.close();
	  if (cnt == 0) {
		vo.setMsg("NO ID");
	  } else {
		sql = "SELECT id, pwd, name, sex "
			+ "FROM member "
			+ "WHERE id=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		rs = ps.executeQuery();
		rs.next();
		vo.setId(rs.getString(1));
		vo.setName(rs.getString(3));
		vo.setSex(rs.getString(4));

		String db_pwd = rs.getString(2);
		if (db_pwd.equals(pwd)) {
		  vo.setMsg("OK");
		} else {
		  vo.setMsg("NOPWD");
		}
	  }
	} catch (Exception ex) {
	  ex.printStackTrace();
	} finally {
	  disConnection();
	}
	return vo;
  }
}
