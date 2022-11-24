public FeeCalculation feeCalculation;
public void setUp() {
	feeCalculation = new FeeCalculation();
}
@Test
public void testTypicalResults() {
	Account accounts[] = new Account[3];

	accounts[0] = new Account();
	accounts[0].principal = 35;
	accounts[0].rate = (float) .04;
	accounts[0].daysActive = 365;
	accounts[0].accountType = Account.PREMIUM;

	accounts[1] = new Account();
	accounts[1].principal = 100;
	accounts[1].rate = (float) .035;
	accounts[1].daysActive = 100;
	accounts[1].accountType = Account.BUDGET;

	accounts[2] = new Account();
	accounts[2].principal = 50;
	accounts[2].rate = (float) .04;
	accounts[2].daysActive = 600;
	accounts[2].accountType = Account.PREMIUM_PLUS;

	float result = feeCalculation.calculateFee(accounts);
	assertEquals(result, (float) 0.060289, (float) 0.00001);
