1	class Account {
2	    float principal;
3	    float rate;
4	    int daysActive;
5	    int accountType;
6	
7	    public static final int  STANDARD = 0;
8	    public static final int  BUDGET = 1;
9	    public static final int  PREMIUM = 2;
10	    public static final int  PREMIUM_PLUS = 3;
11	
12	    float interestEarned() {
13	        float years = daysActive / (float) 365.25;
14	        float compoundInterest = principal * (float) Math.exp( rate * years );
15	        return ( compoundInterest – principal );
16	    }
17	
18	    public boolean isPremium() {
19	        if (accountType == Account.PREMIUM || accountType == Account.PREMIUM_PLUS)
20	            return true;
21	        else
22	            return false;
23	    }
24	}
25	
26	float calculateFee(Account accounts[]) {
27	    float totalFee = 0;
28	    Account account;
29	    for (int i = 0; i < accounts.length; i++) {
30	        account = accounts[i];
31	        if ( account.isPremium() ) {
32	            totalFee += BROKER_FEE_PERCENT * account.interestEarned();
33	        }
34	    }
35	    return totalFee;
36	}
37	
38	static final double BROKER_FEE_PERCENT = 0.0125;

// Explanation for the refactor

// there are many account types but only two are being checked.

