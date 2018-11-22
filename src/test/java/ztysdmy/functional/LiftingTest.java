package ztysdmy.functional;

import org.junit.Assert;
import org.junit.Test;


import java.util.Optional;
import java.util.function.Function;
import static ztysdmy.functional.Lifting.*;

public class LiftingTest {

	@Test
	public void shouldLift() throws Exception {
	
		Function<String, String> toLift = str->str;
		Function<Optional<String>, Optional<String>> lifted = lift(toLift);
		String result = lifted.apply(Optional.of("hello")).get();
		Assert.assertEquals("hello", result);
	}
	
	@Test
	public void shouldUnfilt() throws Exception {
		Function<Optional<String>, Optional<String>> toUnlift = optStr->optStr;
		Function<String, String> unlifted = unLift(toUnlift);
		String result = unlifted.apply("hello");
		Assert.assertEquals("hello", result);
	}
	
}
