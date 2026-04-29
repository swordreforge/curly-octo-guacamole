package okio.internal;

import cyoe.InterfaceC5979h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.sequences.cdj;
import kotlin.sequences.kja0;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.fn3e;
import okio.ncyb;
import okio.zurt;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
@InterfaceC6769y(name = "-FileSystem")
public final class zy {

    /* JADX INFO: renamed from: okio.internal.zy$k */
    /* JADX INFO: compiled from: FileSystem.kt */
    @InterfaceC6205g(m22755c = "okio.internal.-FileSystem", m22756f = "FileSystem.kt", m22757i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m22758l = {116, 135, 145}, m22759m = "collectRecursively", m22760n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class C7559k extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C7559k(InterfaceC6216q<? super C7559k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return zy.m27751k(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: compiled from: FileSystem.kt */
    @InterfaceC6205g(m22755c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m22756f = "FileSystem.kt", m22757i = {}, m22758l = {75}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super ncyb>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ ncyb $fileOrDirectory;
        final /* synthetic */ zurt $this_commonDeleteRecursively;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(zurt zurtVar, ncyb ncybVar, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_commonDeleteRecursively = zurtVar;
            this.$fileOrDirectory = ncybVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super ncyb> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var = (kja0) this.L$0;
                zurt zurtVar = this.$this_commonDeleteRecursively;
                kotlin.collections.ld6 ld6Var = new kotlin.collections.ld6();
                ncyb ncybVar = this.$fileOrDirectory;
                this.label = 1;
                if (zy.m27751k(kja0Var, zurtVar, ld6Var, ncybVar, false, true, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: okio.internal.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @InterfaceC6205g(m22755c = "okio.internal.-FileSystem$commonListRecursively$1", m22756f = "FileSystem.kt", m22757i = {0, 0}, m22758l = {96}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "stack"}, m22761s = {"L$0", "L$1"})
    static final class C8131zy extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super ncyb>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ ncyb $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ zurt $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8131zy(ncyb ncybVar, zurt zurtVar, boolean z2, InterfaceC6216q<? super C8131zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$dir = ncybVar;
            this.$this_commonListRecursively = zurtVar;
            this.$followSymlinks = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C8131zy c8131zy = new C8131zy(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC6216q);
            c8131zy.L$0 = obj;
            return c8131zy;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super ncyb> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C8131zy) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C8131zy c8131zy;
            kja0 kja0Var;
            kotlin.collections.ld6 ld6Var;
            Iterator<ncyb> it;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var2 = (kja0) this.L$0;
                kotlin.collections.ld6 ld6Var2 = new kotlin.collections.ld6();
                ld6Var2.addLast(this.$dir);
                c8131zy = this;
                kja0Var = kja0Var2;
                ld6Var = ld6Var2;
                it = this.$this_commonListRecursively.mo27627z(this.$dir).iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                kotlin.collections.ld6 ld6Var3 = (kotlin.collections.ld6) this.L$1;
                kja0 kja0Var3 = (kja0) this.L$0;
                C6318m.n7h(obj);
                c8131zy = this;
                ld6Var = ld6Var3;
                kja0Var = kja0Var3;
            }
            while (it.hasNext()) {
                ncyb next = it.next();
                zurt zurtVar = c8131zy.$this_commonListRecursively;
                boolean z2 = c8131zy.$followSymlinks;
                c8131zy.L$0 = kja0Var;
                c8131zy.L$1 = ld6Var;
                c8131zy.L$2 = it;
                c8131zy.label = 1;
                if (zy.m27751k(kja0Var, zurtVar, ld6Var, next, z2, false, c8131zy) == objX2) {
                    return objX2;
                }
            }
            return was.f36763k;
        }
    }

    @InterfaceC7396q
    public static final fn3e f7l8(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb path) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(path, "path");
        fn3e fn3eVarA9 = zurtVar.a9(path);
        if (fn3eVarA9 != null) {
            return fn3eVarA9;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final kotlin.sequences.qrj<ncyb> m27750g(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(dir, "dir");
        return cdj.toq(new C8131zy(dir, zurtVar, z2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r14 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        r13 = r12;
        r12 = r11;
        r11 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.sequences.kja0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, kotlin.sequences.kja0, kotlin.sequences.kja0<? super okio.ncyb>] */
    /* JADX WARN: Type inference failed for: r17v1, types: [kotlin.sequences.kja0] */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27751k(@mub.InterfaceC7396q kotlin.sequences.kja0<? super okio.ncyb> r17, @mub.InterfaceC7396q okio.zurt r18, @mub.InterfaceC7396q kotlin.collections.ld6<okio.ncyb> r19, @mub.InterfaceC7396q okio.ncyb r20, boolean r21, boolean r22, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.zy.m27751k(kotlin.sequences.kja0, okio.zurt, kotlin.collections.ld6, okio.ncyb, boolean, boolean, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m27752n(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb path) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(path, "path");
        return zurtVar.a9(path) != null;
    }

    /* JADX INFO: renamed from: q */
    public static final void m27753q(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb fileOrDirectory, boolean z2) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(fileOrDirectory, "fileOrDirectory");
        Iterator it = cdj.toq(new toq(zurtVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            zurtVar.ki((ncyb) it.next(), z2 && !it.hasNext());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0014, B:19:0x003d, B:25:0x0050, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:37:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0014, B:19:0x003d, B:25:0x0050, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:37:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void toq(@mub.InterfaceC7396q okio.zurt r4, @mub.InterfaceC7396q okio.ncyb r5, @mub.InterfaceC7396q okio.ncyb r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.d2ok.m23075h(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.d2ok.m23075h(r6, r0)
            okio.nn86 r5 = r4.lvui(r5)
            r0 = 0
            okio.vyq r4 = r4.oc(r6)     // Catch: java.lang.Throwable -> L51
            okio.qrj r4 = okio.d2ok.m27594q(r4)     // Catch: java.lang.Throwable -> L51
            long r1 = r4.ek5k(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3b
        L2c:
            r4 = r0
            goto L3b
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L39
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            kotlin.kja0.m23173k(r6, r4)     // Catch: java.lang.Throwable -> L51
        L39:
            r4 = r6
            r6 = r0
        L3b:
            if (r4 != 0) goto L50
            kotlin.jvm.internal.d2ok.qrj(r6)     // Catch: java.lang.Throwable -> L51
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L5f
            r5.close()     // Catch: java.lang.Throwable -> L4e
            goto L5f
        L4e:
            r0 = move-exception
            goto L5f
        L50:
            throw r4     // Catch: java.lang.Throwable -> L51
        L51:
            r4 = move-exception
            if (r5 == 0) goto L5c
            r5.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r5 = move-exception
            kotlin.kja0.m23173k(r4, r5)
        L5c:
            r3 = r0
            r0 = r4
            r4 = r3
        L5f:
            if (r0 != 0) goto L65
            kotlin.jvm.internal.d2ok.qrj(r4)
            return
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.zy.toq(okio.zurt, okio.ncyb, okio.ncyb):void");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final ncyb m27754y(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb path) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(path, "path");
        ncyb ncybVarM27620s = zurtVar.jk(path).m27620s();
        if (ncybVarM27620s == null) {
            return null;
        }
        ncyb ncybVarFn3e = path.fn3e();
        d2ok.qrj(ncybVarFn3e);
        return ncybVarFn3e.wvg(ncybVarM27620s);
    }

    public static final void zy(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(dir, "dir");
        kotlin.collections.ld6 ld6Var = new kotlin.collections.ld6();
        for (ncyb ncybVarFn3e = dir; ncybVarFn3e != null && !zurtVar.ni7(ncybVarFn3e); ncybVarFn3e = ncybVarFn3e.fn3e()) {
            ld6Var.addFirst(ncybVarFn3e);
        }
        if (z2 && ld6Var.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = ld6Var.iterator();
        while (it.hasNext()) {
            zurtVar.qrj((ncyb) it.next());
        }
    }
}
