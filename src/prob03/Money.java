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
		if(money instanceof Money) {		
			return this.amount + money.getAmount();
		}else {
			return null;
		}
	}

	public Object minus(Money money) {
		if(money instanceof Money) {		
			return this.amount - money.getAmount();
		}else {
			return null;
		}
	}

	public Object multiply(Money money) {
		if(money instanceof Money) {		
			return this.amount * money.getAmount();
		}else {
			return null;
		}
	}

	public Object devide(Money money) {
		if(money instanceof Money) {		
			return this.amount / money.getAmount();
		}else {
			return null;
		}
	}  
}
