package CDGtest;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import CDG.Raisemoney;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaisemoneyTest {
	
	@Test
	public void case1Deposit() {
		Raisemoney a = new Raisemoney();
		a.deposit(100);
		assertEquals(100, a.getBalance());
	}
	
	@Test
	public void case2Deposit() {
		Raisemoney a = new Raisemoney();
		a.deposit(100);
		assertEquals(200, a.getBalance());
	}
	
	@Test
	public void case3Withdraw() {
		Raisemoney a = new Raisemoney();
		a.withdraw(10);
		assertEquals(190, a.getBalance());
	}

	@Test
	public void case4Withdraw() {
		Raisemoney a = new Raisemoney();
		a.withdraw(10);
		assertEquals(180, a.getBalance());
	}
}