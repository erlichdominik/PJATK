package b_Money;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	Currency SEK;
	Bank bank1;
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		bank1 = new Bank("bank1", SEK);
		bank1.openAccount("John");
		testAccount = new Account("Hans", SEK);
		testAccount.deposit(new Money(10000000, SEK));

		bank1.deposit("John", new Money(3000000, SEK));
	}
	
	@Test
	public void testAddRemoveTimedPayment() throws AccountDoesNotExistException {
		//adding
		testAccount.addTimedPayment("Hans transaction",
				10,
				2,
				new Money(10000000, SEK),
				bank1,
				"John");
		testAccount.tick();
		assertEquals("10000000 SEK",testAccount.getBalance().toString());
		testAccount.tick();
		testAccount.tick();
		assertEquals("0 SEK",testAccount.getBalance().toString());
		assertEquals("13000000", bank1.getBalance("John").toString());
		
		// removing
		testAccount.addTimedPayment("Hans transaction",
				10,
				0,
				new Money(10000000, SEK),
				bank1,
				"John");
		testAccount.removeTimedPayment("Hans transaction");
		testAccount.tick();
		assertEquals("0 SEK",testAccount.getBalance().toString());
		assertEquals("13000000", bank1.getBalance("John").toString());
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		testAccount.addTimedPayment("Hans transaction",
				10,
				2,
				new Money(10000000, SEK),
				bank1,
				"John");
		assertTrue(testAccount.timedPaymentExists("Hans transaction"));
	}

	@Test
	public void testAddWithdraw() {
		testAccount.withdraw(new Money(10000000, SEK));
		assertEquals("0 SEK", testAccount.getBalance().toString());
		testAccount.deposit(new Money(100, SEK));
		assertEquals("100 SEK", testAccount.getBalance().toString());
	}
	
	@Test
	public void testGetBalance() {
		assertEquals(Integer.valueOf(10000000),testAccount.getBalance().getAmount());
		assertEquals(SEK,testAccount.getBalance().getCurrency());
	}
}
