package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import zy.dd;
import zy.y9n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.i */
/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3774i implements InterfaceC3775k {

    /* JADX INFO: renamed from: h */
    private static final HashSet<File> f22904h = new HashSet<>();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f66764kja0 = ".uid";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f66765n7h = 10;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f66766qrj = "SimpleCache";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Random f66767f7l8;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, ArrayList<InterfaceC3775k.toq>> f22905g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f66768ld6;

    /* JADX INFO: renamed from: n */
    @dd
    private final C3772g f22906n;

    /* JADX INFO: renamed from: p */
    private long f22907p;

    /* JADX INFO: renamed from: q */
    private final x2 f22908q;

    /* JADX INFO: renamed from: s */
    private long f22909s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final File f66769toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private InterfaceC3775k.k f66770x2;

    /* JADX INFO: renamed from: y */
    private final boolean f22910y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3779q f66771zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.i$k */
    /* JADX INFO: compiled from: SimpleCache.java */
    class k extends Thread {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ConditionVariable f22911k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f22911k = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (C3774i.this) {
                this.f22911k.open();
                C3774i.this.wvg();
                C3774i.this.f66771zy.mo13364g();
            }
        }
    }

    @Deprecated
    public C3774i(File file, InterfaceC3779q interfaceC3779q) {
        this(file, interfaceC3779q, (byte[]) null, false);
    }

    private static synchronized boolean a9(File file) {
        return f22904h.add(file.getAbsoluteFile());
    }

    private fn3e d2ok(String str, fn3e fn3eVar) {
        if (!this.f22910y) {
            return fn3eVar;
        }
        String name = ((File) C3844k.f7l8(fn3eVar.f22937y)).getName();
        long j2 = fn3eVar.f22934n;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        C3772g c3772g = this.f22906n;
        if (c3772g != null) {
            try {
                c3772g.m13376s(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                ni7.qrj(f66766qrj, "Failed to update index with new touch timestamp.");
            }
        } else {
            z2 = true;
        }
        fn3e fn3eVarX2 = this.f22908q.m13427y(str).x2(fn3eVar, jCurrentTimeMillis, z2);
        gvn7(fn3eVar, fn3eVarX2);
        return fn3eVarX2;
    }

    private static long d3(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void eqxt() {
        ArrayList arrayList = new ArrayList();
        Iterator<ld6> it = this.f22908q.m13426s().iterator();
        while (it.hasNext()) {
            for (fn3e fn3eVar : it.next().m13395g()) {
                if (fn3eVar.f22937y.length() != fn3eVar.f22934n) {
                    arrayList.add(fn3eVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            oc((C3780s) arrayList.get(i2));
        }
    }

    private void fn3e(fn3e fn3eVar) {
        this.f22908q.kja0(fn3eVar.f22933k).m13396k(fn3eVar);
        this.f22907p += fn3eVar.f22934n;
        fti(fn3eVar);
    }

    private void fti(fn3e fn3eVar) {
        ArrayList<InterfaceC3775k.toq> arrayList = this.f22905g.get(fn3eVar.f22933k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo13365k(this, fn3eVar);
            }
        }
        this.f66771zy.mo13365k(this, fn3eVar);
    }

    private static long fu4(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, f66764kja0.length() != 0 ? strValueOf.concat(f66764kja0) : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(strValueOf2);
        throw new IOException(sb.toString());
    }

    private void gvn7(fn3e fn3eVar, C3780s c3780s) {
        ArrayList<InterfaceC3775k.toq> arrayList = this.f22905g.get(fn3eVar.f22933k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo13366n(this, fn3eVar, c3780s);
            }
        }
        this.f66771zy.mo13366n(this, fn3eVar, c3780s);
    }

    private static long jk(File[] fileArr) {
        int length = fileArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArr[i2];
            String name = file.getName();
            if (name.endsWith(f66764kja0)) {
                try {
                    return d3(name);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                    sb.append("Malformed UID file: ");
                    sb.append(strValueOf);
                    ni7.m13702q(f66766qrj, sb.toString());
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private void jp0y(C3780s c3780s) {
        ArrayList<InterfaceC3775k.toq> arrayList = this.f22905g.get(c3780s.f22933k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo13367q(this, c3780s);
            }
        }
        this.f66771zy.mo13367q(this, c3780s);
    }

    private static synchronized void lvui(File file) {
        f22904h.remove(file.getAbsoluteFile());
    }

    private void mcp(File file, boolean z2, @dd File[] fileArr, @dd Map<String, C3777n> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z2) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z2 && name.indexOf(46) == -1) {
                mcp(file2, false, file2.listFiles(), map);
            } else if (!z2 || (!x2.cdj(name) && !name.endsWith(f66764kja0))) {
                long j2 = -1;
                long j3 = C3548p.f65257toq;
                C3777n c3777nRemove = map != null ? map.remove(name) : null;
                if (c3777nRemove != null) {
                    j2 = c3777nRemove.f22922k;
                    j3 = c3777nRemove.f66775toq;
                }
                fn3e fn3eVarF7l8 = fn3e.f7l8(file2, j2, j3, this.f22908q);
                if (fn3eVarF7l8 != null) {
                    fn3e(fn3eVarF7l8);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static void ni7(File file) throws InterfaceC3775k.k {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Failed to create cache directory: ");
        sb.append(strValueOf);
        String string = sb.toString();
        ni7.m13702q(f66766qrj, string);
        throw new InterfaceC3775k.k(string);
    }

    private fn3e o1t(String str, long j2, long j3) {
        fn3e fn3eVarM13397n;
        ld6 ld6VarM13427y = this.f22908q.m13427y(str);
        if (ld6VarM13427y == null) {
            return fn3e.m13369p(str, j2, j3);
        }
        while (true) {
            fn3eVarM13397n = ld6VarM13427y.m13397n(j2, j3);
            if (!fn3eVarM13397n.f22932g || fn3eVarM13397n.f22937y.length() == fn3eVarM13397n.f22934n) {
                break;
            }
            eqxt();
        }
        return fn3eVarM13397n;
    }

    private void oc(C3780s c3780s) {
        ld6 ld6VarM13427y = this.f22908q.m13427y(c3780s.f22933k);
        if (ld6VarM13427y == null || !ld6VarM13427y.ld6(c3780s)) {
            return;
        }
        this.f22907p -= c3780s.f22934n;
        if (this.f22906n != null) {
            String name = c3780s.f22937y.getName();
            try {
                this.f22906n.f7l8(name);
            } catch (IOException unused) {
                String strValueOf = String.valueOf(name);
                ni7.qrj(f66766qrj, strValueOf.length() != 0 ? "Failed to remove file index entry for: ".concat(strValueOf) : new String("Failed to remove file index entry for: "));
            }
        }
        this.f22908q.ki(ld6VarM13427y.f66772toq);
        jp0y(c3780s);
    }

    /* JADX INFO: renamed from: t */
    public static synchronized boolean m13379t(File file) {
        return f22904h.contains(file.getAbsoluteFile());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wvg() {
        if (!this.f66769toq.exists()) {
            try {
                ni7(this.f66769toq);
            } catch (InterfaceC3775k.k e2) {
                this.f66770x2 = e2;
                return;
            }
        }
        File[] fileArrListFiles = this.f66769toq.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(this.f66769toq);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(strValueOf);
            String string = sb.toString();
            ni7.m13702q(f66766qrj, string);
            this.f66770x2 = new InterfaceC3775k.k(string);
            return;
        }
        long jJk = jk(fileArrListFiles);
        this.f22909s = jJk;
        if (jJk == -1) {
            try {
                this.f22909s = fu4(this.f66769toq);
            } catch (IOException e3) {
                String strValueOf2 = String.valueOf(this.f66769toq);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(strValueOf2);
                String string2 = sb2.toString();
                ni7.m13700n(f66766qrj, string2, e3);
                this.f66770x2 = new InterfaceC3775k.k(string2, e3);
                return;
            }
        }
        try {
            this.f22908q.m13423h(this.f22909s);
            C3772g c3772g = this.f22906n;
            if (c3772g != null) {
                c3772g.m13375g(this.f22909s);
                Map<String, C3777n> mapZy = this.f22906n.zy();
                mcp(this.f66769toq, true, fileArrListFiles, mapZy);
                this.f22906n.m13377y(mapZy.keySet());
            } else {
                mcp(this.f66769toq, true, fileArrListFiles, null);
            }
            this.f22908q.m13424i();
            try {
                this.f22908q.fn3e();
            } catch (IOException e4) {
                ni7.m13700n(f66766qrj, "Storing index file failed", e4);
            }
        } catch (IOException e6) {
            String strValueOf3 = String.valueOf(this.f66769toq);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 36);
            sb3.append("Failed to initialize cache indices: ");
            sb3.append(strValueOf3);
            String string3 = sb3.toString();
            ni7.m13700n(f66766qrj, string3, e6);
            this.f66770x2 = new InterfaceC3775k.k(string3, e6);
        }
    }

    @y9n
    /* JADX INFO: renamed from: z */
    public static void m13380z(File file, @dd com.google.android.exoplayer2.database.zy zyVar) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (zyVar != null) {
                long jJk = jk(fileArrListFiles);
                if (jJk != -1) {
                    try {
                        C3772g.m13372k(zyVar, jJk);
                    } catch (com.google.android.exoplayer2.database.toq unused) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Failed to delete file metadata: ");
                        sb.append(jJk);
                        ni7.qrj(f66766qrj, sb.toString());
                    }
                    try {
                        x2.f7l8(zyVar, jJk);
                    } catch (com.google.android.exoplayer2.database.toq unused2) {
                        StringBuilder sb2 = new StringBuilder(52);
                        sb2.append("Failed to delete file metadata: ");
                        sb2.append(jJk);
                        ni7.qrj(f66766qrj, sb2.toString());
                    }
                }
            }
            lrht.bz2(file);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized NavigableSet<C3780s> cdj(String str) {
        ld6 ld6VarM13427y;
        C3844k.m13633s(!this.f66768ld6);
        ld6VarM13427y = this.f22908q.m13427y(str);
        return (ld6VarM13427y == null || ld6VarM13427y.f7l8()) ? new TreeSet() : new TreeSet((Collection) ld6VarM13427y.m13395g());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized long f7l8(String str, long j2, long j3) {
        ld6 ld6VarM13427y;
        C3844k.m13633s(!this.f66768ld6);
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        ld6VarM13427y = this.f22908q.m13427y(str);
        return ld6VarM13427y != null ? ld6VarM13427y.zy(j2, j3) : -j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    @dd
    /* JADX INFO: renamed from: g */
    public synchronized C3780s mo13381g(String str, long j2, long j3) throws InterfaceC3775k.k {
        C3844k.m13633s(!this.f66768ld6);
        zurt();
        fn3e fn3eVarO1t = o1t(str, j2, j3);
        if (fn3eVarO1t.f22932g) {
            return d2ok(str, fn3eVarO1t);
        }
        if (this.f22908q.kja0(str).m13398p(j2, fn3eVarO1t.f22934n)) {
            return fn3eVarO1t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: h */
    public synchronized NavigableSet<C3780s> mo13382h(String str, InterfaceC3775k.toq toqVar) {
        C3844k.m13633s(!this.f66768ld6);
        C3844k.f7l8(str);
        C3844k.f7l8(toqVar);
        ArrayList<InterfaceC3775k.toq> arrayList = this.f22905g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f22905g.put(str, arrayList);
        }
        arrayList.add(toqVar);
        return cdj(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: k */
    public synchronized long mo13383k() {
        return this.f22909s;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized void ki(String str, InterfaceC3775k.toq toqVar) {
        if (this.f66768ld6) {
            return;
        }
        ArrayList<InterfaceC3775k.toq> arrayList = this.f22905g.get(str);
        if (arrayList != null) {
            arrayList.remove(toqVar);
            if (arrayList.isEmpty()) {
                this.f22905g.remove(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean kja0(java.lang.String r4, long r5, long r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f66768ld6     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            com.google.android.exoplayer2.util.C3844k.m13633s(r0)     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.x2 r0 = r3.f22908q     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.cache.ld6 r4 = r0.m13427y(r4)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1e
            long r4 = r4.zy(r5, r7)     // Catch: java.lang.Throwable -> L21
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            monitor-exit(r3)
            return r1
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C3774i.kja0(java.lang.String, long, long):boolean");
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized void ld6(C3780s c3780s) {
        C3844k.m13633s(!this.f66768ld6);
        oc(c3780s);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: n */
    public synchronized long mo13384n(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 < 0 ? Long.MAX_VALUE : j5;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long jF7l8 = f7l8(str, j7, j6 - j7);
            if (jF7l8 > 0) {
                j4 += jF7l8;
            } else {
                jF7l8 = -jF7l8;
            }
            j7 += jF7l8;
        }
        return j4;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized void n7h(String str) {
        C3844k.m13633s(!this.f66768ld6);
        Iterator<C3780s> it = cdj(str).iterator();
        while (it.hasNext()) {
            oc(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: p */
    public synchronized void mo13385p(C3780s c3780s) {
        C3844k.m13633s(!this.f66768ld6);
        ld6 ld6Var = (ld6) C3844k.f7l8(this.f22908q.m13427y(c3780s.f22933k));
        ld6Var.qrj(c3780s.f22935q);
        this.f22908q.ki(ld6Var.f66772toq);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: q */
    public synchronized void mo13386q(String str, n7h n7hVar) throws InterfaceC3775k.k {
        C3844k.m13633s(!this.f66768ld6);
        zurt();
        this.f22908q.m13425n(str, n7hVar);
        try {
            this.f22908q.fn3e();
        } catch (IOException e2) {
            throw new InterfaceC3775k.k(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized void qrj(File file, long j2) throws InterfaceC3775k.k {
        boolean z2 = true;
        C3844k.m13633s(!this.f66768ld6);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            fn3e fn3eVar = (fn3e) C3844k.f7l8(fn3e.m13370s(file, j2, this.f22908q));
            ld6 ld6Var = (ld6) C3844k.f7l8(this.f22908q.m13427y(fn3eVar.f22933k));
            C3844k.m13633s(ld6Var.m13401y(fn3eVar.f22935q, fn3eVar.f22934n));
            long jM13413n = qrj.m13413n(ld6Var.m13399q());
            if (jM13413n != -1) {
                if (fn3eVar.f22935q + fn3eVar.f22934n > jM13413n) {
                    z2 = false;
                }
                C3844k.m13633s(z2);
            }
            if (this.f22906n == null) {
                fn3e(fn3eVar);
                this.f22908q.fn3e();
                notifyAll();
                return;
            }
            try {
                this.f22906n.m13376s(file.getName(), fn3eVar.f22934n, fn3eVar.f22936s);
                fn3e(fn3eVar);
                try {
                    this.f22908q.fn3e();
                    notifyAll();
                    return;
                } catch (IOException e2) {
                    throw new InterfaceC3775k.k(e2);
                }
            } catch (IOException e3) {
                throw new InterfaceC3775k.k(e3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized void release() {
        if (this.f66768ld6) {
            return;
        }
        this.f22905g.clear();
        eqxt();
        try {
            try {
                this.f22908q.fn3e();
                lvui(this.f66769toq);
            } catch (IOException e2) {
                ni7.m13700n(f66766qrj, "Storing index file failed", e2);
                lvui(this.f66769toq);
            }
            this.f66768ld6 = true;
        } catch (Throwable th) {
            lvui(this.f66769toq);
            this.f66768ld6 = true;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: s */
    public synchronized long mo13387s() {
        C3844k.m13633s(!this.f66768ld6);
        return this.f22907p;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized File toq(String str, long j2, long j3) throws InterfaceC3775k.k {
        ld6 ld6VarM13427y;
        File file;
        C3844k.m13633s(!this.f66768ld6);
        zurt();
        ld6VarM13427y = this.f22908q.m13427y(str);
        C3844k.f7l8(ld6VarM13427y);
        C3844k.m13633s(ld6VarM13427y.m13401y(j2, j3));
        if (!this.f66769toq.exists()) {
            ni7(this.f66769toq);
            eqxt();
        }
        this.f66771zy.zy(this, str, j2, j3);
        file = new File(this.f66769toq, Integer.toString(this.f66767f7l8.nextInt(10)));
        if (!file.exists()) {
            ni7(file);
        }
        return fn3e.x2(file, ld6VarM13427y.f22918k, j2, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized C3780s x2(String str, long j2, long j3) throws InterruptedException, InterfaceC3775k.k {
        C3780s c3780sMo13381g;
        C3844k.m13633s(!this.f66768ld6);
        zurt();
        while (true) {
            c3780sMo13381g = mo13381g(str, j2, j3);
            if (c3780sMo13381g == null) {
                wait();
            }
        }
        return c3780sMo13381g;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    /* JADX INFO: renamed from: y */
    public synchronized Set<String> mo13388y() {
        C3844k.m13633s(!this.f66768ld6);
        return new HashSet(this.f22908q.qrj());
    }

    public synchronized void zurt() throws InterfaceC3775k.k {
        InterfaceC3775k.k kVar = this.f66770x2;
        if (kVar != null) {
            throw kVar;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k
    public synchronized qrj zy(String str) {
        C3844k.m13633s(!this.f66768ld6);
        return this.f22908q.ld6(str);
    }

    @Deprecated
    public C3774i(File file, InterfaceC3779q interfaceC3779q, @dd byte[] bArr) {
        this(file, interfaceC3779q, bArr, bArr != null);
    }

    @Deprecated
    public C3774i(File file, InterfaceC3779q interfaceC3779q, @dd byte[] bArr, boolean z2) {
        this(file, interfaceC3779q, null, bArr, z2, true);
    }

    public C3774i(File file, InterfaceC3779q interfaceC3779q, com.google.android.exoplayer2.database.zy zyVar) {
        this(file, interfaceC3779q, zyVar, null, false, false);
    }

    public C3774i(File file, InterfaceC3779q interfaceC3779q, @dd com.google.android.exoplayer2.database.zy zyVar, @dd byte[] bArr, boolean z2, boolean z3) {
        this(file, interfaceC3779q, new x2(zyVar, file, bArr, z2, z3), (zyVar == null || z3) ? null : new C3772g(zyVar));
    }

    C3774i(File file, InterfaceC3779q interfaceC3779q, x2 x2Var, @dd C3772g c3772g) {
        if (a9(file)) {
            this.f66769toq = file;
            this.f66771zy = interfaceC3779q;
            this.f22908q = x2Var;
            this.f22906n = c3772g;
            this.f22905g = new HashMap<>();
            this.f66767f7l8 = new Random();
            this.f22910y = interfaceC3779q.toq();
            this.f22909s = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new k("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }
}
