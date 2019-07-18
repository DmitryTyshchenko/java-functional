package ztysdmy.functional.tailcall;

public class TailCallUtility {

	private TailCallUtility() {
	}

	public static <T> TailCall<T> done(T result) {

		return new TailCallResult<T>(result);
	}

	public static <T> TailCall<T> call(TailCall<T> nextCall) {
		return nextCall;
	}

	private static class TailCallResult<T> implements TailCall<T> {

		private final T result;

		TailCallResult(T result) {
			this.result = result;
		}

		@Override
		public TailCall<T> apply() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Boolean isComplete() {
			return Boolean.TRUE;
		}

		@Override
		public T result() {
			return this.result;
		}
	}
}
