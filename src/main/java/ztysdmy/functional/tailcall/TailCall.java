package ztysdmy.functional.tailcall;

import java.util.stream.Stream;

public interface TailCall<T> {

	default Boolean isComplete() {
		return Boolean.FALSE;
	}
	
	default T result() {
		throw new UnsupportedOperationException();
	}
	
	TailCall<T> apply();
	
	default T invoke() {
		return Stream.iterate(this, TailCall::apply).filter(TailCall::isComplete).findFirst().get().result();
	}
}
