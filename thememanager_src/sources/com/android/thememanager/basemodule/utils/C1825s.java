package com.android.thememanager.basemodule.utils;

import android.util.Log;
import android.util.LruCache;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.util.d8wk;
import cyoe.InterfaceC5979h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.vq;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.s */
/* JADX INFO: compiled from: FileLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1825s {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f10405k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f57811toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final LruCache<String, String> f57812zy;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f10404q = new k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final HashMap<String, C1825s> f10403n = new HashMap<>(1);

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.s$k */
    /* JADX INFO: compiled from: FileLruCache.kt */
    public static final class k {

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.s$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileLruCache.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.basemodule.utils.FileLruCache$Companion$getInstance$1$1", m22756f = "FileLruCache.kt", m22757i = {}, m22758l = {142}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C7909k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ i1.C6299y<C1825s> $cache;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7909k(i1.C6299y<C1825s> c6299y, InterfaceC6216q<? super C7909k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$cache = c6299y;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C7909k(this.$cache, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C7909k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    C1825s c1825s = this.$cache.element;
                    this.label = 1;
                    if (c1825s.m7209p(this) == objX2) {
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

        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ C1825s zy(k kVar, String str, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 200;
            }
            return kVar.toq(str, i2);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C1825s m7215k(@InterfaceC7396q String keyMiuixWarningDialog) {
            kotlin.jvm.internal.d2ok.m23075h(keyMiuixWarningDialog, "keyMiuixWarningDialog");
            return toq(keyMiuixWarningDialog, 200);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.android.thememanager.basemodule.utils.s] */
        @InterfaceC7396q
        public final C1825s toq(@InterfaceC7396q String fileName, int i2) {
            kotlin.jvm.internal.d2ok.m23075h(fileName, "fileName");
            i1.C6299y c6299y = new i1.C6299y();
            ?? r1 = C1825s.f10403n.get(fileName);
            c6299y.element = r1;
            if (r1 == 0) {
                c6299y.element = new C1825s(fileName, i2);
                C1825s.f10403n.put(fileName, c6299y.element);
                synchronized (c6299y.element) {
                    if (((C1825s) c6299y.element).f7l8() <= 0) {
                        kotlinx.coroutines.x2.m24649g(vq.f37472k, null, null, new C7909k(c6299y, null), 3, null);
                    }
                    was wasVar = was.f36763k;
                }
            }
            return (C1825s) c6299y.element;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.s$toq */
    /* JADX INFO: compiled from: FileLruCache.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.basemodule.utils.FileLruCache$apply$1", m22756f = "FileLruCache.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return C1825s.this.new toq(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            C1825s.this.m7211g();
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.s$zy */
    /* JADX INFO: compiled from: FileLruCache.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.basemodule.utils.FileLruCache$initResource$2", m22756f = "FileLruCache.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return C1825s.this.new zy(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            LinkedHashMap linkedHashMapLd6 = C1825s.this.ld6();
            if (linkedHashMapLd6 != null && linkedHashMapLd6.size() > 0) {
                for (String str : linkedHashMapLd6.keySet()) {
                    C1825s.this.f57812zy.put(str, linkedHashMapLd6.get(str));
                }
            }
            return was.f36763k;
        }
    }

    public C1825s(@InterfaceC7396q String fileName, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fileName, "fileName");
        this.f10405k = fileName;
        this.f57811toq = i2;
        this.f57812zy = new LruCache<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.FileInputStream, java.io.InputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @zy.y9n
    public final LinkedHashMap<String, String> ld6() throws Throwable {
        AutoCloseable autoCloseable;
        ObjectInputStream objectInputStream;
        ?? r1;
        File file = new File(bf2.toq.toq().getCacheDir(), this.f10405k);
        ?? Exists = file.exists();
        ?? r2 = 0;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStream = new ObjectInputStream(Exists);
                    try {
                        Object object = objectInputStream.readObject();
                        kotlin.jvm.internal.d2ok.n7h(object, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.String?>");
                        LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap) object;
                        y9n.m7246g(Exists);
                        y9n.m7246g(objectInputStream);
                        return linkedHashMap;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        r1 = Exists;
                        y9n.m7246g(r1);
                        y9n.m7246g(objectInputStream);
                        return null;
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        e.printStackTrace();
                        d8wk.x2(file.getPath());
                        r1 = Exists;
                        y9n.m7246g(r1);
                        y9n.m7246g(objectInputStream);
                        return null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    objectInputStream = null;
                } catch (OutOfMemoryError e6) {
                    e = e6;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    autoCloseable = null;
                    r2 = Exists;
                    y9n.m7246g(r2);
                    y9n.m7246g(autoCloseable);
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                Exists = 0;
                objectInputStream = null;
            } catch (OutOfMemoryError e8) {
                e = e8;
                Exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                autoCloseable = null;
                y9n.m7246g(r2);
                y9n.m7246g(autoCloseable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @zy.y9n
    private final void n7h() throws Throwable {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        File file = new File(bf2.toq.toq().getCacheDir(), this.f10405k);
        if (!file.exists()) {
            try {
                C1821p.m7190s(file.getParent());
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        Map<String, String> mapSnapshot = this.f57812zy.snapshot();
        kotlin.jvm.internal.d2ok.kja0(mapSnapshot, "snapshot(...)");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            } catch (IOException e3) {
                e = e3;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
        try {
            objectOutputStream.writeObject(mapSnapshot);
            objectOutputStream.flush();
            y9n.m7246g(fileOutputStream);
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            try {
                e.printStackTrace();
                y9n.m7246g(fileOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                y9n.m7246g(fileOutputStream2);
                y9n.m7246g(objectOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = fileOutputStream;
            y9n.m7246g(fileOutputStream2);
            y9n.m7246g(objectOutputStream);
            throw th;
        }
        y9n.m7246g(objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m7209p(InterfaceC6216q<? super was> interfaceC6216q) throws Throwable {
        Object objM24523y = C6708p.m24523y(ek5k.f7l8.m22238k(), new zy(null), interfaceC6216q);
        return objM24523y == C6199q.x2() ? objM24523y : was.f36763k;
    }

    public final int f7l8() {
        return this.f57812zy.size();
    }

    @zy.y9n
    /* JADX INFO: renamed from: g */
    public final void m7211g() throws Throwable {
        n7h();
    }

    /* JADX INFO: renamed from: n */
    public final void m7212n(@InterfaceC7396q ActivityC0891q activity) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k(activity), C6481a.zy(), null, new toq(null), 2, null);
    }

    @InterfaceC7396q
    public final C1825s qrj(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        if (str == null) {
            Log.e(ld6.f10347k, "setData: key is null");
            return this;
        }
        if (str2 == null) {
            this.f57812zy.put(str, com.android.thememanager.basemodule.analysis.ld6.mdr);
        } else {
            this.f57812zy.put(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final int m7213s() {
        return this.f57811toq;
    }

    @InterfaceC7396q
    public final String x2(@InterfaceC7396q String key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        String strRemove = this.f57812zy.remove(key);
        kotlin.jvm.internal.d2ok.kja0(strRemove, "remove(...)");
        return strRemove;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final String m7214y(@InterfaceC7395n String str) {
        if (str == null) {
            return null;
        }
        return this.f57812zy.get(str);
    }
}
