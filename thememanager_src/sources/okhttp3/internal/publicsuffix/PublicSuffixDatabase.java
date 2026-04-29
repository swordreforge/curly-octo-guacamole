package okhttp3.internal.publicsuffix;

import b7.C1359g;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a9;
import kotlin.collections.zurt;
import kotlin.io.zy;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.ni7;
import kotlin.sequences.fn3e;
import kotlin.text.fti;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;
import okio.C7576t;
import okio.n7h;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final String f43381g = "publicsuffixes.gz";

    /* JADX INFO: renamed from: s */
    private static final char f43384s = '!';

    /* JADX INFO: renamed from: q */
    private byte[] f43387q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private byte[] f94016zy;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final C7504k f43382n = new C7504k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f94014f7l8 = {42};

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final List<String> f43385y = zurt.ld6("*");

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final PublicSuffixDatabase f43383p = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final AtomicBoolean f43386k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final CountDownLatch f94015toq = new CountDownLatch(1);

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$k */
    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    public static final class C7504k {
        private C7504k() {
        }

        public /* synthetic */ C7504k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toq(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z2;
            int iM5763q;
            int iM5763q2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z3 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z3) {
                        iM5763q = 46;
                        z2 = false;
                    } else {
                        z2 = z3;
                        iM5763q = C1359g.m5763q(bArr2[i9][i10], 255);
                    }
                    iM5763q2 = iM5763q - C1359g.m5763q(bArr[i6 + i11], 255);
                    if (iM5763q2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length != i10) {
                        z3 = z2;
                    } else {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        i10 = -1;
                        z3 = true;
                    }
                }
                if (iM5763q2 >= 0) {
                    if (iM5763q2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                d2ok.kja0(UTF_8, "UTF_8");
                                return new String(bArr, i6, i8, UTF_8);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        @InterfaceC7396q
        public final PublicSuffixDatabase zy() {
            return PublicSuffixDatabase.f43383p;
        }
    }

    private final List<String> f7l8(String str) {
        List<String> listQexj = fti.qexj(str, new char[]{'.'}, false, 0, 6, null);
        return d2ok.f7l8(a9.wwp(listQexj), "") ? a9.kx3(listQexj, 1) : listQexj;
    }

    /* JADX INFO: renamed from: n */
    private final void m27266n() {
        boolean z2 = false;
        while (true) {
            try {
                try {
                    m27267q();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e2) {
                    C7498p.f43366k.f7l8().qrj("Failed to read public suffix list", 5, e2);
                    if (z2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, byte[]] */
    /* JADX INFO: renamed from: q */
    private final void m27267q() throws IOException {
        try {
            i1.C6299y c6299y = new i1.C6299y();
            i1.C6299y c6299y2 = new i1.C6299y();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f43381g);
            if (resourceAsStream == null) {
                return;
            }
            n7h n7hVarM27592n = okio.d2ok.m27592n(new C7576t(okio.d2ok.fn3e(resourceAsStream)));
            try {
                c6299y.element = n7hVarM27592n.lv5(n7hVarM27592n.readInt());
                c6299y2.element = n7hVarM27592n.lv5(n7hVarM27592n.readInt());
                was wasVar = was.f36763k;
                zy.m23032k(n7hVarM27592n, null);
                synchronized (this) {
                    T t2 = c6299y.element;
                    d2ok.qrj(t2);
                    this.f94016zy = (byte[]) t2;
                    T t3 = c6299y2.element;
                    d2ok.qrj(t3);
                    this.f43387q = (byte[]) t3;
                }
            } finally {
            }
        } finally {
            this.f94015toq.countDown();
        }
    }

    private final List<String> toq(List<String> list) {
        String str;
        String qVar;
        String str2;
        List<String> listA9;
        List<String> listA92;
        if (this.f43386k.get() || !this.f43386k.compareAndSet(false, true)) {
            try {
                this.f94015toq.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m27266n();
        }
        if (!(this.f94016zy != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = list.get(i2);
            Charset UTF_8 = StandardCharsets.UTF_8;
            d2ok.kja0(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= size) {
                qVar = null;
                break;
            }
            C7504k c7504k = f43382n;
            byte[] bArr2 = this.f94016zy;
            if (bArr2 == null) {
                d2ok.n5r1("publicSuffixListBytes");
                bArr2 = null;
            }
            qVar = c7504k.toq(bArr2, bArr, i3);
            if (qVar != null) {
                break;
            }
            i3++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = f94014f7l8;
                C7504k c7504k2 = f43382n;
                byte[] bArr4 = this.f94016zy;
                if (bArr4 == null) {
                    d2ok.n5r1("publicSuffixListBytes");
                    bArr4 = null;
                }
                String qVar2 = c7504k2.toq(bArr4, bArr3, i4);
                if (qVar2 != null) {
                    str2 = qVar2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i5 = size - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                C7504k c7504k3 = f43382n;
                byte[] bArr5 = this.f43387q;
                if (bArr5 == null) {
                    d2ok.n5r1("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String qVar3 = c7504k3.toq(bArr5, bArr, i6);
                if (qVar3 != null) {
                    str = qVar3;
                    break;
                }
                i6++;
            }
        }
        if (str != null) {
            return fti.qexj(f43384s + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (qVar == null && str2 == null) {
            return f43385y;
        }
        if (qVar == null || (listA9 = fti.qexj(qVar, new char[]{'.'}, false, 0, 6, null)) == null) {
            listA9 = kotlin.collections.ni7.a9();
        }
        if (str2 == null || (listA92 = fti.qexj(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listA92 = kotlin.collections.ni7.a9();
        }
        return listA9.size() > listA92.size() ? listA9 : listA92;
    }

    /* JADX INFO: renamed from: g */
    public final void m27268g(@InterfaceC7396q byte[] publicSuffixListBytes, @InterfaceC7396q byte[] publicSuffixExceptionListBytes) {
        d2ok.m23075h(publicSuffixListBytes, "publicSuffixListBytes");
        d2ok.m23075h(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.f94016zy = publicSuffixListBytes;
        this.f43387q = publicSuffixExceptionListBytes;
        this.f43386k.set(true);
        this.f94015toq.countDown();
    }

    @InterfaceC7395n
    public final String zy(@InterfaceC7396q String domain) {
        int size;
        int size2;
        d2ok.m23075h(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        d2ok.kja0(unicodeDomain, "unicodeDomain");
        List<String> listF7l8 = f7l8(unicodeDomain);
        List<String> qVar = toq(listF7l8);
        if (listF7l8.size() == qVar.size() && qVar.get(0).charAt(0) != '!') {
            return null;
        }
        if (qVar.get(0).charAt(0) == '!') {
            size = listF7l8.size();
            size2 = qVar.size();
        } else {
            size = listF7l8.size();
            size2 = qVar.size() + 1;
        }
        return fn3e.gc3c(fn3e.i1(a9.ebn(f7l8(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
