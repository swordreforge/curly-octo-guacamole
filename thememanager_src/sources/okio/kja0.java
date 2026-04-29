package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import miuix.security.C7323k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class kja0 implements Serializable, Comparable<kja0> {

    @InterfaceC7396q
    public static final C7563k Companion = new C7563k(null);

    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 EMPTY = new kja0(new byte[0]);
    private static final long serialVersionUID = 1;

    @InterfaceC7396q
    private final byte[] data;

    /* JADX INFO: renamed from: k */
    private transient int f43781k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private transient String f43782q;

    /* JADX INFO: renamed from: okio.kja0$k */
    /* JADX INFO: compiled from: ByteString.kt */
    @lv5({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class C7563k {
        private C7563k() {
        }

        public /* synthetic */ C7563k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ kja0 m27776h(C7563k c7563k, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = C7575s.m27851g();
            }
            return c7563k.kja0(bArr, i2, i3);
        }

        public static /* synthetic */ kja0 ld6(C7563k c7563k, String str, Charset charset, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charset = C6433g.f81921toq;
            }
            return c7563k.m27780p(str, charset);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "read")
        @l05.qrj
        public final kja0 cdj(@InterfaceC7396q InputStream inputStream, int i2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(inputStream, "<this>");
            int i3 = 0;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
            }
            byte[] bArr = new byte[i2];
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            return new kja0(bArr);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @InterfaceC6769y(name = "-deprecated_read")
        public final kja0 f7l8(@InterfaceC7396q InputStream inputstream, int i2) {
            kotlin.jvm.internal.d2ok.m23075h(inputstream, "inputstream");
            return cdj(inputstream, i2);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC6769y(name = "-deprecated_of")
        /* JADX INFO: renamed from: g */
        public final kja0 m27777g(@InterfaceC7396q byte[] array, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(array, "array");
            return kja0(array, i2, i3);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @InterfaceC6769y(name = "-deprecated_decodeBase64")
        /* JADX INFO: renamed from: k */
        public final kja0 m27778k(@InterfaceC7396q String string) {
            kotlin.jvm.internal.d2ok.m23075h(string, "string");
            return m27783y(string);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "of")
        @l05.qrj
        public final kja0 kja0(@InterfaceC7396q byte[] bArr, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
            int iQrj = C7575s.qrj(bArr, i3);
            C7575s.m27855n(bArr.length, i2, iQrj);
            return new kja0(kotlin.collections.kja0.zkd(bArr, i2, iQrj + i2));
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC6769y(name = "-deprecated_of")
        /* JADX INFO: renamed from: n */
        public final kja0 m27779n(@InterfaceC7396q ByteBuffer buffer) {
            kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
            return qrj(buffer);
        }

        @InterfaceC7396q
        @l05.qrj
        public final kja0 n7h(@InterfaceC7396q byte... data) {
            kotlin.jvm.internal.d2ok.m23075h(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
            return new kja0(bArrCopyOf);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "encodeString")
        @l05.qrj
        /* JADX INFO: renamed from: p */
        public final kja0 m27780p(@InterfaceC7396q String str, @InterfaceC7396q Charset charset) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
            return new kja0(bytes);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @InterfaceC6769y(name = "-deprecated_encodeUtf8")
        /* JADX INFO: renamed from: q */
        public final kja0 m27781q(@InterfaceC7396q String string) {
            kotlin.jvm.internal.d2ok.m23075h(string, "string");
            return x2(string);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "of")
        @l05.qrj
        public final kja0 qrj(@InterfaceC7396q ByteBuffer byteBuffer) {
            kotlin.jvm.internal.d2ok.m23075h(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new kja0(bArr);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: s */
        public final kja0 m27782s(@InterfaceC7396q String str) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((okio.internal.toq.d3(str.charAt(i3)) << 4) + okio.internal.toq.d3(str.charAt(i3 + 1)));
            }
            return new kja0(bArr);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @InterfaceC6769y(name = "-deprecated_decodeHex")
        public final kja0 toq(@InterfaceC7396q String string) {
            kotlin.jvm.internal.d2ok.m23075h(string, "string");
            return m27782s(string);
        }

        @InterfaceC7396q
        @l05.qrj
        public final kja0 x2(@InterfaceC7396q String str) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            kja0 kja0Var = new kja0(ek5k.m27605k(str));
            kja0Var.setUtf8$okio(str);
            return kja0Var;
        }

        @InterfaceC7395n
        @l05.qrj
        /* JADX INFO: renamed from: y */
        public final kja0 m27783y(@InterfaceC7396q String str) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            byte[] bArrM27772k = C7562k.m27772k(str);
            if (bArrM27772k != null) {
                return new kja0(bArrM27772k);
            }
            return null;
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @InterfaceC6769y(name = "-deprecated_encodeString")
        public final kja0 zy(@InterfaceC7396q String string, @InterfaceC7396q Charset charset) {
            kotlin.jvm.internal.d2ok.m23075h(string, "string");
            kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
            return m27780p(string, charset);
        }
    }

    public kja0(@InterfaceC7396q byte[] data) {
        kotlin.jvm.internal.d2ok.m23075h(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(kja0 kja0Var, int i2, byte[] bArr, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        kja0Var.copyInto(i2, bArr, i3, i4);
    }

    @InterfaceC7395n
    @l05.qrj
    public static final kja0 decodeBase64(@InterfaceC7396q String str) {
        return Companion.m27783y(str);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final kja0 decodeHex(@InterfaceC7396q String str) {
        return Companion.m27782s(str);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "encodeString")
    @l05.qrj
    public static final kja0 encodeString(@InterfaceC7396q String str, @InterfaceC7396q Charset charset) {
        return Companion.m27780p(str, charset);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final kja0 encodeUtf8(@InterfaceC7396q String str) {
        return Companion.x2(str);
    }

    public static /* synthetic */ int indexOf$default(kja0 kja0Var, kja0 kja0Var2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kja0Var.indexOf(kja0Var2, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(kja0 kja0Var, kja0 kja0Var2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = C7575s.m27851g();
        }
        return kja0Var.lastIndexOf(kja0Var2, i2);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "of")
    @l05.qrj
    public static final kja0 of(@InterfaceC7396q ByteBuffer byteBuffer) {
        return Companion.qrj(byteBuffer);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final kja0 of(@InterfaceC7396q byte... bArr) {
        return Companion.n7h(bArr);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "of")
    @l05.qrj
    public static final kja0 of(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        return Companion.kja0(bArr, i2, i3);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "read")
    @l05.qrj
    public static final kja0 read(@InterfaceC7396q InputStream inputStream, int i2) throws IOException {
        return Companion.cdj(inputStream, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        kja0 kja0VarCdj = Companion.cdj(objectInputStream, objectInputStream.readInt());
        Field declaredField = kja0.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, kja0VarCdj.data);
    }

    public static /* synthetic */ kja0 substring$default(kja0 kja0Var, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = C7575s.m27851g();
        }
        return kja0Var.substring(i2, i3);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to operator function", replaceWith = @kotlin.hb(expression = "this[index]", imports = {}))
    @InterfaceC6769y(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m28304deprecated_getByte(int i2) {
        return getByte(i2);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "size", imports = {}))
    @InterfaceC6769y(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m28305deprecated_size() {
        return size();
    }

    @InterfaceC7396q
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.d2ok.kja0(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @InterfaceC7396q
    public String base64() {
        return C7562k.zy(getData$okio(), null, 1, null);
    }

    @InterfaceC7396q
    public String base64Url() {
        return C7562k.toq(getData$okio(), C7562k.m27771g());
    }

    public void copyInto(int i2, @InterfaceC7396q byte[] target, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        kotlin.collections.kja0.y2(getData$okio(), target, i3, i2, i4 + i2);
    }

    @InterfaceC7396q
    public kja0 digest$okio(@InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.d2ok.qrj(bArrDigest);
        return new kja0(bArrDigest);
    }

    public final boolean endsWith(@InterfaceC7396q kja0 suffix) {
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kja0) {
            kja0 kja0Var = (kja0) obj;
            if (kja0Var.size() == getData$okio().length && kja0Var.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6769y(name = "getByte")
    public final byte getByte(int i2) {
        return internalGet$okio(i2);
    }

    @InterfaceC7396q
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f43781k;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @InterfaceC7395n
    public final String getUtf8$okio() {
        return this.f43782q;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @InterfaceC7396q
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = okio.internal.toq.oc()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = okio.internal.toq.oc()[b2 & com.google.common.base.zy.f68111cdj];
        }
        return kotlin.text.a9.wx16(cArr);
    }

    @InterfaceC7396q
    public kja0 hmac$okio(@InterfaceC7396q String algorithm, @InterfaceC7396q kja0 key) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.d2ok.kja0(bArrDoFinal, "doFinal(...)");
            return new kja0(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @InterfaceC7396q
    public kja0 hmacSha1(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @InterfaceC7396q
    public kja0 hmacSha256(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @InterfaceC7396q
    public kja0 hmacSha512(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @InterfaceC6768s
    public final int indexOf(@InterfaceC7396q kja0 other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @InterfaceC6768s
    public final int indexOf(@InterfaceC7396q kja0 other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return indexOf(other.internalArray$okio(), i2);
    }

    @InterfaceC6768s
    public final int indexOf(@InterfaceC7396q byte[] other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @InterfaceC7396q
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i2) {
        return getData$okio()[i2];
    }

    @InterfaceC6768s
    public final int lastIndexOf(@InterfaceC7396q kja0 other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @InterfaceC6768s
    public final int lastIndexOf(@InterfaceC7396q kja0 other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return lastIndexOf(other.internalArray$okio(), i2);
    }

    @InterfaceC6768s
    public final int lastIndexOf(@InterfaceC7396q byte[] other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @InterfaceC7396q
    public final kja0 md5() {
        return digest$okio(C7323k.f90061toq);
    }

    public boolean rangeEquals(int i2, @InterfaceC7396q kja0 other, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return other.rangeEquals(i3, getData$okio(), i2, i4);
    }

    public final void setHashCode$okio(int i2) {
        this.f43781k = i2;
    }

    public final void setUtf8$okio(@InterfaceC7395n String str) {
        this.f43782q = str;
    }

    @InterfaceC7396q
    public final kja0 sha1() {
        return digest$okio(C7323k.f90062zy);
    }

    @InterfaceC7396q
    public final kja0 sha256() {
        return digest$okio("SHA-256");
    }

    @InterfaceC7396q
    public final kja0 sha512() {
        return digest$okio("SHA-512");
    }

    @InterfaceC6769y(name = "size")
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@InterfaceC7396q kja0 prefix) {
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    @InterfaceC7396q
    public String string(@InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return new String(this.data, charset);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final kja0 substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final kja0 substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public kja0 substring(int i2, int i3) {
        int iX2 = C7575s.x2(this, i3);
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iX2 <= getData$okio().length) {
            if (iX2 - i2 >= 0) {
                return (i2 == 0 && iX2 == getData$okio().length) ? this : new kja0(kotlin.collections.kja0.zkd(getData$okio(), i2, iX2));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @InterfaceC7396q
    public kja0 toAsciiLowercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new kja0(bArrCopyOf);
            }
        }
        return this;
    }

    @InterfaceC7396q
    public kja0 toAsciiUppercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArrCopyOf[i3] = (byte) (b3 - 32);
                    }
                }
                return new kja0(bArrCopyOf);
            }
        }
        return this;
    }

    @InterfaceC7396q
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC7396q
    public String toString() {
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int iZy = okio.internal.toq.zy(getData$okio(), 64);
            if (iZy != -1) {
                String strUtf8 = utf8();
                String strSubstring = strUtf8.substring(0, iZy);
                kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strUf = kotlin.text.a9.uf(kotlin.text.a9.uf(kotlin.text.a9.uf(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iZy >= strUtf8.length()) {
                    return "[text=" + strUf + ']';
                }
                return "[size=" + getData$okio().length + " text=" + strUf + "…]";
            }
            if (getData$okio().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int iX2 = C7575s.x2(this, 64);
                if (iX2 <= getData$okio().length) {
                    if (!(iX2 + 0 >= 0)) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    sb.append((iX2 == getData$okio().length ? this : new kja0(kotlin.collections.kja0.zkd(getData$okio(), 0, iX2))).hex());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
            str = "[hex=" + hex() + ']';
        }
        return str;
    }

    @InterfaceC7396q
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String strZy = ek5k.zy(internalArray$okio());
        setUtf8$okio(strZy);
        return strZy;
    }

    public void write(@InterfaceC7396q OutputStream out) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        out.write(this.data);
    }

    public void write$okio(@InterfaceC7396q x2 buffer, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        okio.internal.toq.gvn7(this, buffer, i2, i3);
    }

    public static /* synthetic */ int indexOf$default(kja0 kja0Var, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return kja0Var.indexOf(bArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@mub.InterfaceC7396q okio.kja0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.d2ok.m23075h(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.kja0.compareTo(okio.kja0):int");
    }

    public final boolean endsWith(@InterfaceC7396q byte[] suffix) {
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    @InterfaceC6768s
    public int indexOf(@InterfaceC7396q byte[] other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax <= length) {
            while (!C7575s.m27857q(getData$okio(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @InterfaceC6768s
    public int lastIndexOf(@InterfaceC7396q byte[] other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        for (int iMin = Math.min(C7575s.x2(this, i2), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (C7575s.m27857q(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i2, @InterfaceC7396q byte[] other, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return i2 >= 0 && i2 <= getData$okio().length - i4 && i3 >= 0 && i3 <= other.length - i4 && C7575s.m27857q(getData$okio(), i2, other, i3, i4);
    }

    public final boolean startsWith(@InterfaceC7396q byte[] prefix) {
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public static /* synthetic */ int lastIndexOf$default(kja0 kja0Var, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = C7575s.m27851g();
        }
        return kja0Var.lastIndexOf(bArr, i2);
    }
}
