package ztysdmy.functional.tailcall;

import org.junit.Assert;
import org.junit.Test;


import static ztysdmy.functional.tailcall.TailCallUtility.*;

public class TailCallTest {
	
	@Test
	public void testRecursion() throws Exception {
		
		int result = recursion(0).invoke();
		Assert.assertTrue(result==10000);
	}
	
	private TailCall<Integer> recursion(int i) {
		
		if (i==10000) {
			return done(i);
		}
		int nextParam = i+1;
		return call(()->recursion(nextParam));
	}

}
