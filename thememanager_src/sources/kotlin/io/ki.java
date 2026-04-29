package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class ki {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final ByteBuffer f81800f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final char[] f36322g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ki f36323k = new ki();

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final byte[] f36324n;

    /* JADX INFO: renamed from: q */
    private static boolean f36325q = false;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final StringBuilder f36326s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f81801toq = 32;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final CharBuffer f36327y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static CharsetDecoder f81802zy;

    static {
        byte[] bArr = new byte[32];
        f36324n = bArr;
        char[] cArr = new char[32];
        f36322g = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        d2ok.kja0(byteBufferWrap, "wrap(bytes)");
        f81800f7l8 = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        d2ok.kja0(charBufferWrap, "wrap(chars)");
        f36327y = charBufferWrap;
        f36326s = new StringBuilder();
    }

    private ki() {
    }

    private final void f7l8(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        d2ok.kja0(charsetDecoderNewDecoder, "charset.newDecoder()");
        f81802zy = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f81800f7l8;
        byteBuffer.clear();
        CharBuffer charBuffer = f36327y;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f81802zy;
        if (charsetDecoder == null) {
            d2ok.n5r1("decoder");
            charsetDecoder = null;
        }
        boolean z2 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z2 = true;
        }
        f36325q = z2;
        m22921n();
    }

    /* JADX INFO: renamed from: g */
    private final void m22919g() {
        StringBuilder sb = f36326s;
        sb.setLength(32);
        sb.trimToSize();
    }

    /* JADX INFO: renamed from: k */
    private final int m22920k() {
        ByteBuffer byteBuffer = f81800f7l8;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    /* JADX INFO: renamed from: n */
    private final void m22921n() {
        CharsetDecoder charsetDecoder = f81802zy;
        if (charsetDecoder == null) {
            d2ok.n5r1("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f81800f7l8.position(0);
        f36326s.setLength(0);
    }

    private final int toq(boolean z2) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f81802zy;
            if (charsetDecoder == null) {
                d2ok.n5r1("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f81800f7l8;
            CharBuffer charBuffer = f36327y;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            d2ok.kja0(coderResultDecode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (coderResultDecode.isError()) {
                m22921n();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb = f36326s;
            char[] cArr = f36322g;
            int i2 = iPosition - 1;
            sb.append(cArr, 0, i2);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i2]);
        }
    }

    private final int zy(int i2, int i3) throws CharacterCodingException {
        ByteBuffer byteBuffer = f81800f7l8;
        byteBuffer.limit(i2);
        f36327y.position(i3);
        int qVar = toq(true);
        CharsetDecoder charsetDecoder = f81802zy;
        if (charsetDecoder == null) {
            d2ok.n5r1("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r11 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = kotlin.io.ki.f36322g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r0[r11 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r11 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r0[r11 - 1] != '\r') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r0 = kotlin.io.ki.f36326s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0.length() != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r7 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        return new java.lang.String(kotlin.io.ki.f36322g, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        r0.append(kotlin.io.ki.f36322g, 0, r11);
        r11 = r0.toString();
        kotlin.jvm.internal.d2ok.kja0(r11, "sb.toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (r0.length() <= 32) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        m22919g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c2, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0012, B:7:0x0018, B:11:0x0028, B:13:0x0034, B:22:0x0047, B:36:0x007c, B:38:0x0084, B:40:0x0088, B:42:0x0090, B:43:0x0092, B:48:0x009e, B:51:0x00a7, B:53:0x00bb, B:54:0x00be, B:23:0x004c, B:26:0x0057, B:30:0x005e, B:32:0x006e, B:34:0x0076, B:57:0x00c3, B:9:0x0022), top: B:62:0x0001 }] */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String m22922q(@mub.InterfaceC7396q java.io.InputStream r11, @mub.InterfaceC7396q java.nio.charset.Charset r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.ki.m22922q(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
