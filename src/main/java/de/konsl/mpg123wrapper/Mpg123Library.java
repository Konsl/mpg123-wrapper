package de.konsl.mpg123wrapper;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * JNA Wrapper for library <b>Mpg123</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface Mpg123Library extends Library {
    String JNA_LIBRARY_NAME = "Mpg123";
    NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(Mpg123Library.JNA_LIBRARY_NAME);
    Mpg123Library INSTANCE = Native.load(Mpg123Library.JNA_LIBRARY_NAME, Mpg123Library.class);

    /**
     * Original signature : <code>int mpg123_init()</code><br>
     * <i>native declaration : line 20</i>
     */
    int mpg123_init();

    /**
     * Original signature : <code>void* mpg123_new(const char*, int*)</code><br>
     * <i>native declaration : line 21</i><br>
     *
     * @deprecated use the safer methods {@link #mpg123_new(java.lang.String, java.nio.IntBuffer)} and {@link #mpg123_new(com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference)} instead
     */
    @Deprecated
    Pointer mpg123_new(Pointer decoder, IntByReference error);

    /**
     * Original signature : <code>void* mpg123_new(const char*, int*)</code><br>
     * <i>native declaration : line 21</i>
     */
    Pointer mpg123_new(String decoder, IntBuffer error);

    /**
     * Original signature : <code>void mpg123_delete(void*)</code><br>
     * <i>native declaration : line 22</i>
     */
    void mpg123_delete(Pointer mh);

    /**
     * Original signature : <code>int mpg123_open_feed(void*)</code><br>
     * <i>native declaration : line 23</i>
     */
    int mpg123_open_feed(Pointer mh);

    /**
     * Original signature : <code>int mpg123_close(void*)</code><br>
     * <i>native declaration : line 24</i>
     */
    int mpg123_close(Pointer mh);

    /**
     * Original signature : <code>int mpg123_decode(void*, const unsigned char*, size_t, unsigned char*, size_t, size_t*)</code><br>
     * <i>native declaration : line 25</i>
     */
    int mpg123_decode(Pointer mh, byte inmemory[], NativeSize inmemsize, ByteBuffer outmemory, NativeSize outmemsize, NativeSizeByReference done);
}
