package users;

public class Customer extends Person {
	private int cash;
	private long cardNumber;
//
	public Customer( int cash, long cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) {
		super( firstName, lastName, dateOfB, id, address );
		this.cash = cash;
		this.cardNumber = cardNumber;
	}
//
	public int getcash() {
		return cash;
	}
	public void setcash( int cash ) {
		this.cash = cash;
	}
//
	public long getCardNumber() {
		return cardNumber;
	}
//
	public void setCardNumber( long cardNumber ) {
		this.cardNumber = cardNumber;
	}
//
}