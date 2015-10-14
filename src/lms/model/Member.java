package lms.model;

import java.util.Collection;

public interface Member {
	public Collection<Holding> getCurrentHoldings();
	public BorrowingHistory getBorrowingHistory();
	public String toString();
}
