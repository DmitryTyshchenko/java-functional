package ztysdmy.functional;

import java.util.Optional;
import java.util.function.Function;

public class Lifting {

	private Lifting() {
	}

	public static <T, R> Function<Optional<T>, Optional<R>> lift(Function<T, R> function) {

		return a -> a.map(function);
	}
	
	public static <T, R> Function<T, R> unLift(Function<Optional<T>, Optional<R>> function) {
		return t -> {
			return function.apply(Optional.of(t)).get();
		};
	}
}
