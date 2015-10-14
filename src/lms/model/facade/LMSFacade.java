package lms.model.facade;

import lms.model.Book;
import lms.model.HistoryRecord;
import lms.model.Holding;
import lms.model.LibraryCollection;
import lms.model.Member;
import lms.model.Video;
import lms.model.Library;
import lms.model.exception.InsufficientCreditException;
import lms.model.exception.MultipleBorrowingException;
import lms.model.exception.OverdrawnCreditException;

public class LMSFacade implements LMSModel {
	// private:
	private String date;	
	private Library library = new Library(); 

	@Override
	public boolean addHolding(Holding holding) {
		// retrieve library collection pointer
		LibraryCollection lc = this.library.getCollection();
		
		// add a new holding, return result
		return lc.addHolding(holding);
	}

	@Override
	public boolean removeHolding(int holdingId) {
		// retrieve library collection pointer
		LibraryCollection lc = this.library.getCollection();
		
		// remove a holding, return result
		return lc.removeHolding(holdingId);		
	}

	@Override
	public Holding getHolding(int holdingId) {
		// retrieve library collection pointer
		LibraryCollection lc = this.library.getCollection();
		
		return lc.getHolding(holdingId);
	}

	@Override
	public Holding[] getAllHoldings() {
		return this.library.getCollection().getAllHoldings();
	}

	@Override
	public int countBooks() {
		Holding[] holdings_ = this.getAllHoldings();
		
		int numBooks = 0;
		
		for (Holding h: holdings_) {
			if (h instanceof Book) {
				numBooks++;
			}
		}
		return numBooks;
	}

	@Override
	public int countVideos() {
		Holding[] holdings_ = this.getAllHoldings();
		
		int numVideos = 0;
		
		for (Holding h: holdings_) {
			if (h instanceof Video) {
				numVideos++;
			}
		}
		return numVideos;
	}

	@Override
	public void borrowHolding(int holdingId) throws InsufficientCreditException, MultipleBorrowingException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnHolding(int holdingId) throws OverdrawnCreditException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistoryRecord[] getBorrowingHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoryRecord getHistoryRecord(int holdingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Holding[] getBorrowedHoldings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetMemberCredit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateRemainingCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateTotalLateFees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDate(String currentDate) {
		this.date = currentDate;
	}
	
	public void addCollection(LibraryCollection collection) {
		this.library.setCollection(collection);
	}
	
	public LibraryCollection getCollection() {
		return this.library.getCollection();
	}
	
	public void addMember(Member member) {
		this.library.setMember(member);
	}
	
	public Member getMember() {
		return this.library.getMember();
	}
}