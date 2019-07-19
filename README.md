 Utility classes to support function programming on Java
# Examples of Usage
# Lfiting
```java
Function<String, String> toLift = str->str;
Function<Optional<String>, Optional<String>> lifted = lift(toLift);
String result = lifted.apply(Optional.of("hello")).get();
```

