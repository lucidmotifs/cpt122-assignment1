package lms.model;

public abstract class Holding {
	// protected:
	protected String title;
	
	protected int loanFee;
	protected int pentaltyFee;	
	protected int loanPeriod;
	protected int code;
	
	public Holding(int code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String toString() {
		// potential alternative to adding the 'type' property
		String className = this.getClass().getSimpleName();
		className = className.toUpperCase();
				
		return String.format("%s:%s:%d:%d:%s", this.code, this.title, this.loanFee, this.loanPeriod, className);
	}
}
