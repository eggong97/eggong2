public class OwnerVo {
	private String oid;
	private String opwd;
	
	public OwnerVo() {
	}

	public OwnerVo(String oid, String opwd) {
		this.oid = oid;
		this.opwd = opwd;

	}

	public String getOid() {
		return oid;
	}

	public String getOpwd( ) {
		return opwd;
	}

}