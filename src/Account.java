
public class Account {
	Integer AccountNumber;
	Address AccountAddress;
	Integer AccountBalance;
	
	public Account(Integer AccountNumber, String AccountAddress, Integer AccountBalance) {
		this.AccountNumber = AccountNumber;
		this.AccountAddress = new Address(AccountAddress);
		this.AccountBalance = AccountBalance;
	}
	
	public String getCountry() {
		return AccountAddress.getCountry();
	}
}
