 Utility classes to support function programming on Java
# Examples of Usage
# Lfiting
```java
Function<String, String> toLift = str->str;
Function<Optional<String>, Optional<String>> lifted = lift(toLift);
String result = lifted.apply(Optional.of("hello")).get();
```
# Recursion
```java
import static ztysdmy.functional.tailcall.TailCallUtility.*;

int result = recursion(0).invoke();

private TailCall<Integer> recursion(int i) {		
 if (i==10000) {
  return done(i);
 }
 int nextParam = i+1;
 return call(()->recursion(nextParam));
}

```
