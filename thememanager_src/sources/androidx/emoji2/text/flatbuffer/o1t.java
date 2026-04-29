package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: compiled from: Utf8Old.java */
/* JADX INFO: loaded from: classes.dex */
public class o1t extends fu4 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<C0815k> f51103toq = ThreadLocal.withInitial(new Supplier() { // from class: androidx.emoji2.text.flatbuffer.z
        @Override // java.util.function.Supplier
        public final Object get() {
            return o1t.f7l8();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.o1t$k */
    /* JADX INFO: compiled from: Utf8Old.java */
    static class C0815k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        CharSequence f51105zy = null;

        /* JADX INFO: renamed from: q */
        ByteBuffer f4460q = null;

        /* JADX INFO: renamed from: k */
        final CharsetEncoder f4459k = StandardCharsets.UTF_8.newEncoder();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final CharsetDecoder f51104toq = StandardCharsets.UTF_8.newDecoder();

        C0815k() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0815k f7l8() {
        return new C0815k();
    }

    @Override // androidx.emoji2.text.flatbuffer.fu4
    /* JADX INFO: renamed from: k */
    public String mo3871k(ByteBuffer byteBuffer, int i2, int i3) {
        CharsetDecoder charsetDecoder = f51103toq.get().f51104toq;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i2);
        byteBufferDuplicate.limit(i2 + i3);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e2) {
            throw new IllegalArgumentException("Bad encoding", e2);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.fu4
    public void toq(CharSequence charSequence, ByteBuffer byteBuffer) {
        C0815k c0815k = f51103toq.get();
        if (c0815k.f51105zy != charSequence) {
            zy(charSequence);
        }
        byteBuffer.put(c0815k.f4460q);
    }

    @Override // androidx.emoji2.text.flatbuffer.fu4
    public int zy(CharSequence charSequence) {
        C0815k c0815k = f51103toq.get();
        int length = (int) (charSequence.length() * c0815k.f4459k.maxBytesPerChar());
        ByteBuffer byteBuffer = c0815k.f4460q;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c0815k.f4460q = ByteBuffer.allocate(Math.max(128, length));
        }
        c0815k.f4460q.clear();
        c0815k.f51105zy = charSequence;
        CoderResult coderResultEncode = c0815k.f4459k.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), c0815k.f4460q, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e2) {
                throw new IllegalArgumentException("bad character encoding", e2);
            }
        }
        c0815k.f4460q.flip();
        return c0815k.f4460q.remaining();
    }
}
