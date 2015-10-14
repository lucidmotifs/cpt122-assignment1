package lms.model;

public class StandardMember extends AbstractMember {
	public StandardMember(String id, String name) {
		super(id, name);
		
		this.initialCredit = 30;
	}
	
	public String toString() {
		return String.format("%s:%s", super.toString(), "STANDARD");
	}
}
