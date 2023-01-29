package de.konsl.mpg123wrapper;

import com.sun.jna.IntegerType;
import com.sun.jna.Native;

import java.io.Serial;

public class NativeSize extends IntegerType {
    @Serial
    private static final long serialVersionUID = 2398288011955445078L;

    public static int SIZE = Native.POINTER_SIZE; // Platform.is64Bit() ? 8 : 4;

    /** Create a zero-valued Size. */
    public NativeSize() {
        this(0);
    }

    /** Create a Size with the given value. */
    public NativeSize(long value) {
        super(SIZE, value);
    }
}
