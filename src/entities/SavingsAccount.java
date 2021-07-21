package entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/*FINAL AJUDA A EVITAR SOBREPOSI��ES MULTIPLAS, 
	 * ALGO QUE PODE GERAR INCONSISTENCIAS 
	 * TAMBEM GERA MELHOR PERFORMACE EM TEMPO DE 
	 * EXECU��O*/
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}
