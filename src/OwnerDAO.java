import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OwnerDAO { // 데이터 배이스 연결
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/orcl";
	String user = "kosea";
	String password = "kosea2019a";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<OwnerVo> list(String name) {
		ArrayList<OwnerVo> list = new ArrayList<OwnerVo>();

		try {
			connDB();

			String query = "SELECT * FROM owner";
			if (name != null) {
				query += " where owner_id = '" + name + "'";
			}
			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected.....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();

				while (rs.next()) {
					String oid = rs.getString("owner_id");
					String opwd = rs.getString("owner_pwd");


					OwnerVo data = new OwnerVo(oid, opwd);
					list.add(data);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jvdc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statemen create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
