package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	Currency SEK, DKK;
	Bank bank1, bank2, bank3;
	
	@Before
	public void setUp() throws Exception {
		DKK = new Currency("DKK", 0.20);
		SEK = new Currency("SEK", 0.15);
		bank1 = new Bank("bank1", SEK);
		bank2 = new Bank("bank2", SEK);
		bank3 = new Bank("bank3", DKK);
		bank1.openAccount("Ulrika");
		bank1.openAccount("Bob");
		bank2.openAccount("Bob");
		bank3.openAccount("Gertrud");
	}

	@Test
	public void testGetName() {
		assertEquals("bank1", bank1.getName());
		assertEquals("bank3", bank3.getName());
		assertEquals("bank2", bank2.getName());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK, bank1.getCurrency());
		assertEquals(DKK, bank3.getCurrency());
		assertEquals(SEK, bank2.getCurrency());
	}
	
	// AccountDoesNotExistException when no changes were made to methods in classes
	@Test
	public void testOpenAccount() throws AccountExistsException {
		bank1.openAccount("John");
	}
	
	// got NullPointerException  before changes were made to methods in classes
	@Test
	public void testDeposit() throws AccountDoesNotExistException {
		bank2.deposit("Bob", new Money(5000, SEK));
		assertEquals(Integer.valueOf(5000), bank2.getBalance("Bob"));
	}
	
	// got AccountDoesNotExistException  before changes were made to methods in classes
	@Test
	public void testWithdraw() throws AccountDoesNotExistException {
		bank2.withdraw("Bob", new Money(2000, SEK));
		assertEquals(Integer.valueOf(-2000), bank2.getBalance("Bob"));
	}
	
	// got NullPointerException  before changes were made to methods in classes,
	@Test
	public void testGetBalance() throws AccountDoesNotExistException {
		bank2.deposit("Bob", new Money(5000, SEK));
		assertEquals(Integer.valueOf(5000), bank2.getBalance("Bob"));
	}
	
	// failed before changes were made to methods in classes
	@Test
	public void testTransfer() throws AccountDoesNotExistException {
		// the same bank
		bank1.deposit("Bob", new Money(1000, SEK));
		bank1.transfer("Bob", "Ulrika", new Money(1000, SEK));
		assertEquals(Integer.valueOf(0), bank1.getBalance("Bob"));
		assertEquals(Integer.valueOf(1000), bank1.getBalance("Ulrika"));
		
		// from a bank to another bank
		bank1.deposit("Bob", new Money(1000, SEK));
		bank1.transfer("Bob", bank2, "Bob", new Money(1000, SEK));
		assertEquals(Integer.valueOf(0), bank1.getBalance("Bob"));
		assertEquals(Integer.valueOf(1000), bank2.getBalance("Bob"));
	}
	

	// twice invoked
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		bank1.addTimedPayment(
				"Bob",
				"Bob's shopping",
				10,
				5,
				new Money(1000, SEK),
				bank2,
				"Bob");
		
		bank1.tick();
		assertEquals(Integer.valueOf(0), bank1.getBalance("Bob"));
		assertEquals(Integer.valueOf(0), bank2.getBalance("Bob"));
		for(int i=0; i<5; i++) {
			bank1.tick();
		}
		assertEquals(Integer.valueOf(-1000), bank1.getBalance("Bob"));
		assertEquals(Integer.valueOf(1000), bank2.getBalance("Bob"));
		
		bank1.addTimedPayment(
				"Bob",
				"Bob's shopping",
				10,
				11,
				new Money(1000, SEK),
				bank2,
				"Bob");
		bank1.removeTimedPayment("Bob", "Bob's shopping");
		bank1.tick();
		bank1.tick();
		assertEquals(Integer.valueOf(-1000), bank1.getBalance("Bob"));
		assertEquals(Integer.valueOf(1000), bank2.getBalance("Bob"));
	}
}
