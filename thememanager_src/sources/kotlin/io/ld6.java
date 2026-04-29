package kotlin.io;

import cyoe.InterfaceC5979h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.oc;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ld6 implements kotlin.sequences.qrj<File> {

    /* JADX INFO: renamed from: g */
    private final int f36328g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final File f36329k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final InterfaceC5979h<File, IOException, was> f36330n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final cyoe.x2<File, was> f36331q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final x2 f81803toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final cyoe.x2<File, Boolean> f81804zy;

    /* JADX INFO: renamed from: kotlin.io.ld6$k */
    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @lv5({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    private static abstract class AbstractC6256k extends zy {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6256k(@InterfaceC7396q File rootDir) {
            super(rootDir);
            d2ok.m23075h(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    private final class toq extends kotlin.collections.toq<File> {

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final ArrayDeque<zy> f36333n;

        /* JADX INFO: renamed from: kotlin.io.ld6$toq$k */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        private final class C6257k extends AbstractC6256k {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ toq f36334g;

            /* JADX INFO: renamed from: n */
            private boolean f36335n;

            /* JADX INFO: renamed from: q */
            private int f36336q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private boolean f81805toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @InterfaceC7395n
            private File[] f81806zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6257k(@InterfaceC7396q toq toqVar, File rootDir) {
                super(rootDir);
                d2ok.m23075h(rootDir, "rootDir");
                this.f36334g = toqVar;
            }

            @Override // kotlin.io.ld6.zy
            @InterfaceC7395n
            public File toq() {
                if (!this.f36335n && this.f81806zy == null) {
                    cyoe.x2 x2Var = ld6.this.f81804zy;
                    boolean z2 = false;
                    if (x2Var != null && !((Boolean) x2Var.invoke(m22937k())).booleanValue()) {
                        z2 = true;
                    }
                    if (z2) {
                        return null;
                    }
                    File[] fileArrListFiles = m22937k().listFiles();
                    this.f81806zy = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        InterfaceC5979h interfaceC5979h = ld6.this.f36330n;
                        if (interfaceC5979h != null) {
                            interfaceC5979h.invoke(m22937k(), new C6254k(m22937k(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f36335n = true;
                    }
                }
                File[] fileArr = this.f81806zy;
                if (fileArr != null) {
                    int i2 = this.f36336q;
                    d2ok.qrj(fileArr);
                    if (i2 < fileArr.length) {
                        File[] fileArr2 = this.f81806zy;
                        d2ok.qrj(fileArr2);
                        int i3 = this.f36336q;
                        this.f36336q = i3 + 1;
                        return fileArr2[i3];
                    }
                }
                if (!this.f81805toq) {
                    this.f81805toq = true;
                    return m22937k();
                }
                cyoe.x2 x2Var2 = ld6.this.f36331q;
                if (x2Var2 != null) {
                    x2Var2.invoke(m22937k());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.ld6$toq$q */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C6258q {

            /* JADX INFO: renamed from: k */
            public static final /* synthetic */ int[] f36337k;

            static {
                int[] iArr = new int[x2.values().length];
                try {
                    iArr[x2.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x2.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f36337k = iArr;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.ld6$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @lv5({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        private final class C8058toq extends zy {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private boolean f81807toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ toq f81808zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8058toq(@InterfaceC7396q toq toqVar, File rootFile) {
                super(rootFile);
                d2ok.m23075h(rootFile, "rootFile");
                this.f81808zy = toqVar;
            }

            @Override // kotlin.io.ld6.zy
            @InterfaceC7395n
            public File toq() {
                if (this.f81807toq) {
                    return null;
                }
                this.f81807toq = true;
                return m22937k();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        private final class zy extends AbstractC6256k {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ toq f36338n;

            /* JADX INFO: renamed from: q */
            private int f36339q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private boolean f81809toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @InterfaceC7395n
            private File[] f81810zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zy(@InterfaceC7396q toq toqVar, File rootDir) {
                super(rootDir);
                d2ok.m23075h(rootDir, "rootDir");
                this.f36338n = toqVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.ld6.zy
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File toq() {
                /*
                    r10 = this;
                    boolean r0 = r10.f81809toq
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.ld6$toq r0 = r10.f36338n
                    kotlin.io.ld6 r0 = kotlin.io.ld6.this
                    cyoe.x2 r0 = kotlin.io.ld6.m22931n(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.m22937k()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f81809toq = r3
                    java.io.File r0 = r10.m22937k()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f81810zy
                    if (r0 == 0) goto L4b
                    int r2 = r10.f36339q
                    kotlin.jvm.internal.d2ok.qrj(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.ld6$toq r0 = r10.f36338n
                    kotlin.io.ld6 r0 = kotlin.io.ld6.this
                    cyoe.x2 r0 = kotlin.io.ld6.f7l8(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.m22937k()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f81810zy
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.m22937k()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f81810zy = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.ld6$toq r0 = r10.f36338n
                    kotlin.io.ld6 r0 = kotlin.io.ld6.this
                    cyoe.h r0 = kotlin.io.ld6.m22930g(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.m22937k()
                    kotlin.io.k r9 = new kotlin.io.k
                    java.io.File r4 = r10.m22937k()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f81810zy
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.d2ok.qrj(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.ld6$toq r0 = r10.f36338n
                    kotlin.io.ld6 r0 = kotlin.io.ld6.this
                    cyoe.x2 r0 = kotlin.io.ld6.f7l8(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.m22937k()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f81810zy
                    kotlin.jvm.internal.d2ok.qrj(r0)
                    int r1 = r10.f36339q
                    int r2 = r1 + 1
                    r10.f36339q = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.ld6.toq.zy.toq():java.io.File");
            }
        }

        public toq() {
            ArrayDeque<zy> arrayDeque = new ArrayDeque<>();
            this.f36333n = arrayDeque;
            if (ld6.this.f36329k.isDirectory()) {
                arrayDeque.push(f7l8(ld6.this.f36329k));
            } else if (ld6.this.f36329k.isFile()) {
                arrayDeque.push(new C8058toq(this, ld6.this.f36329k));
            } else {
                toq();
            }
        }

        private final AbstractC6256k f7l8(File file) {
            int i2 = C6258q.f36337k[ld6.this.f81803toq.ordinal()];
            if (i2 == 1) {
                return new zy(this, file);
            }
            if (i2 == 2) {
                return new C6257k(this, file);
            }
            throw new oc();
        }

        /* JADX INFO: renamed from: y */
        private final File m22936y() {
            File qVar;
            while (true) {
                zy zyVarPeek = this.f36333n.peek();
                if (zyVarPeek == null) {
                    return null;
                }
                qVar = zyVarPeek.toq();
                if (qVar == null) {
                    this.f36333n.pop();
                } else {
                    if (d2ok.f7l8(qVar, zyVarPeek.m22937k()) || !qVar.isDirectory() || this.f36333n.size() >= ld6.this.f36328g) {
                        break;
                    }
                    this.f36333n.push(f7l8(qVar));
                }
            }
            return qVar;
        }

        @Override // kotlin.collections.toq
        /* JADX INFO: renamed from: k */
        protected void mo22435k() {
            File fileM22936y = m22936y();
            if (fileM22936y != null) {
                zy(fileM22936y);
            } else {
                toq();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    private static abstract class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final File f36340k;

        public zy(@InterfaceC7396q File root) {
            d2ok.m23075h(root, "root");
            this.f36340k = root;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final File m22937k() {
            return this.f36340k;
        }

        @InterfaceC7395n
        public abstract File toq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ld6(File file, x2 x2Var, cyoe.x2<? super File, Boolean> x2Var2, cyoe.x2<? super File, was> x2Var3, InterfaceC5979h<? super File, ? super IOException, was> interfaceC5979h, int i2) {
        this.f36329k = file;
        this.f81803toq = x2Var;
        this.f81804zy = x2Var2;
        this.f36331q = x2Var3;
        this.f36330n = interfaceC5979h;
        this.f36328g = i2;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<File> iterator() {
        return new toq();
    }

    @InterfaceC7396q
    public final ld6 ld6(@InterfaceC7396q InterfaceC5979h<? super File, ? super IOException, was> function) {
        d2ok.m23075h(function, "function");
        return new ld6(this.f36329k, this.f81803toq, this.f81804zy, this.f36331q, function, this.f36328g);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final ld6 m22934p(@InterfaceC7396q cyoe.x2<? super File, Boolean> function) {
        d2ok.m23075h(function, "function");
        return new ld6(this.f36329k, this.f81803toq, function, this.f36331q, this.f36330n, this.f36328g);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final ld6 m22935s(int i2) {
        if (i2 > 0) {
            return new ld6(this.f36329k, this.f81803toq, this.f81804zy, this.f36331q, this.f36330n, i2);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i2 + '.');
    }

    @InterfaceC7396q
    public final ld6 x2(@InterfaceC7396q cyoe.x2<? super File, was> function) {
        d2ok.m23075h(function, "function");
        return new ld6(this.f36329k, this.f81803toq, this.f81804zy, function, this.f36330n, this.f36328g);
    }

    /* synthetic */ ld6(File file, x2 x2Var, cyoe.x2 x2Var2, cyoe.x2 x2Var3, InterfaceC5979h interfaceC5979h, int i2, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(file, (i3 & 2) != 0 ? x2.TOP_DOWN : x2Var, x2Var2, x2Var3, interfaceC5979h, (i3 & 32) != 0 ? Integer.MAX_VALUE : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ld6(@InterfaceC7396q File start, @InterfaceC7396q x2 direction) {
        this(start, direction, null, null, null, 0, 32, null);
        d2ok.m23075h(start, "start");
        d2ok.m23075h(direction, "direction");
    }

    public /* synthetic */ ld6(File file, x2 x2Var, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(file, (i2 & 2) != 0 ? x2.TOP_DOWN : x2Var);
    }
}
