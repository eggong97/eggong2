import java.util.ArrayList;

public class OwnerTest {
	public static void main(String[] args) {
		OwnerDAO dao = new OwnerDAO();
		ArrayList<OwnerVo> list = dao.list(null);
		for (int i = 0; i < list.size(); i++) {
			OwnerVo data = (OwnerVo) list.get(i);
			String oid = data.getOid();
			String opwd = data.getOpwd();

			System.out.println(oid + ", "+ opwd);
		}
	}
}