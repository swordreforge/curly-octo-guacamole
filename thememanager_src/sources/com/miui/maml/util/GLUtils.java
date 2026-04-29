package com.miui.maml.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class GLUtils {
    public static Buffer buildBuffer(int[] iArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect.asIntBuffer();
        intBufferAsIntBuffer.put(iArr);
        intBufferAsIntBuffer.position(0);
        return intBufferAsIntBuffer;
    }

    public static Buffer buildBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static Buffer buildBuffer(short[] sArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        return shortBufferAsShortBuffer;
    }

    public static Buffer buildBuffer(char[] cArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(cArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        CharBuffer charBufferAsCharBuffer = byteBufferAllocateDirect.asCharBuffer();
        charBufferAsCharBuffer.put(cArr);
        charBufferAsCharBuffer.position(0);
        return charBufferAsCharBuffer;
    }

    public static Buffer buildBuffer(byte[] bArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.position(0);
        return byteBufferAllocateDirect;
    }

    public static Buffer buildBuffer(long[] jArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(jArr.length * 8);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        LongBuffer longBufferAsLongBuffer = byteBufferAllocateDirect.asLongBuffer();
        longBufferAsLongBuffer.put(jArr);
        longBufferAsLongBuffer.position(0);
        return longBufferAsLongBuffer;
    }

    public static Buffer buildBuffer(double[] dArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(dArr.length * 8);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        DoubleBuffer doubleBufferAsDoubleBuffer = byteBufferAllocateDirect.asDoubleBuffer();
        doubleBufferAsDoubleBuffer.put(dArr);
        doubleBufferAsDoubleBuffer.position(0);
        return doubleBufferAsDoubleBuffer;
    }
}
