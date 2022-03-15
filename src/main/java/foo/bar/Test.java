package foo.bar;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Test {
    @NonNull
    String shouldFail(){
        return null;
    }
}
