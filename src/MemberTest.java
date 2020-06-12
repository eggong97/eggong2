import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list(null);
		for (int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo) list.get(i);
			String oname = data.getOname();
			String ophone = data.getOphone();

			System.out.println(oname + ", "+ ophone);
		}
	}
}