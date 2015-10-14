package lms.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMember implements Member {
	// protected:
	protected String id;
	protected String fullName;
	protected int initialCredit;
	protected List<Holding> holdings = new ArrayList<Holding>();
	protected BorrowingHistory history;
	
	public AbstractMember(String id, String name) {
		this.id = id;
		this.fullName = name;
	}
	
	@Override
	public Collection<Holding> getCurrentHoldings() {
		return this.holdings;
	}
	
	@Override
	public BorrowingHistory getBorrowingHistory() {
		return this.history;
	}
	
	public int getRemainingCredit() {
		// TODO: implement calculation
		return this.initialCredit;
	}
	
	public String toString() {
		// potential alternative to adding the 'type' string in children
		String className = this.getClass().getSimpleName();
		className = className.replace("Member", "");
		className = className.toUpperCase();
		
		return String.format("%s:%s:%d", this.id, this.fullName, this.getRemainingCredit());
	}
}
