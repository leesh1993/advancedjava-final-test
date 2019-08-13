package prob03;

public class Money {
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Object add(Money money) {	
			return new Money(this.amount + money.getAmount());
	}

	public Object minus(Money money) {	
			return new Money(this.amount - money.getAmount());

	}

	public Object multiply(Money money) {	
			return new Money(this.amount * money.getAmount());

	}

	public Object devide(Money money) {	
			return new Money(this.amount / money.getAmount());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			return (this.amount == ((Money) obj).getAmount());
		}
		return false;
	}
	
	

}
