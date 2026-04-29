package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0834q;
import androidx.emoji2.text.C0835s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import zy.InterfaceC7839p;
import zy.InterfaceC7840q;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.o1t;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: compiled from: EmojiCompat.java */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7840q
public class C0830n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f51151cdj = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f51152fn3e = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f51153fu4 = 1;

    /* JADX INFO: renamed from: h */
    public static final int f4525h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f4526i = 0;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f51154jk = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f51155ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f51156kja0 = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @o1t("CONFIG_LOCK")
    private static volatile boolean f51157mcp = false;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f51158n7h = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f51159ni7 = 0;

    /* JADX INFO: renamed from: t */
    @o1t("INSTANCE_LOCK")
    @dd
    private static volatile C0830n f4527t = null;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f51161t8r = 2;

    /* JADX INFO: renamed from: z */
    @uv6({uv6.EnumC7844k.LIBRARY})
    static final int f4528z = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f51163zurt = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final boolean f51164f7l8;

    /* JADX INFO: renamed from: g */
    @lvui
    final y f4529g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int f51165ld6;

    /* JADX INFO: renamed from: n */
    @lvui
    private final toq f4531n;

    /* JADX INFO: renamed from: p */
    private final boolean f4532p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final q f51166qrj;

    /* JADX INFO: renamed from: s */
    @dd
    final int[] f4534s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @o1t("mInitLock")
    @lvui
    private final Set<n> f51167toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f51168x2;

    /* JADX INFO: renamed from: y */
    final boolean f4535y;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final Object f51160o1t = new Object();

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final Object f51162wvg = new Object();

    /* JADX INFO: renamed from: k */
    @lvui
    private final ReadWriteLock f4530k = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @o1t("mInitLock")
    private volatile int f51169zy = 3;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Handler f4533q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.n$f7l8 */
    /* JADX INFO: compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$g */
    /* JADX INFO: compiled from: EmojiCompat.java */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: k */
        private final List<n> f4536k;

        /* JADX INFO: renamed from: n */
        private final int f4537n;

        /* JADX INFO: renamed from: q */
        private final Throwable f4538q;

        g(@lvui n nVar, int i2) {
            this(Arrays.asList((n) androidx.core.util.n7h.qrj(nVar, "initCallback cannot be null")), i2, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4536k.size();
            int i2 = 0;
            if (this.f4537n != 1) {
                while (i2 < size) {
                    this.f4536k.get(i2).mo511k(this.f4538q);
                    i2++;
                }
            } else {
                while (i2 < size) {
                    this.f4536k.get(i2).toq();
                    i2++;
                }
            }
        }

        g(@lvui Collection<n> collection, int i2) {
            this(collection, i2, null);
        }

        g(@lvui Collection<n> collection, int i2, @dd Throwable th) {
            androidx.core.util.n7h.qrj(collection, "initCallbacks cannot be null");
            this.f4536k = new ArrayList(collection);
            this.f4537n = i2;
            this.f4538q = th;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$k */
    /* JADX INFO: compiled from: EmojiCompat.java */
    @hyr(19)
    private static final class k extends toq {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile C0835s f51170toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private volatile kja0 f51171zy;

        /* JADX INFO: renamed from: androidx.emoji2.text.n$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: EmojiCompat.java */
        class C7878k extends s {
            C7878k() {
            }

            @Override // androidx.emoji2.text.C0830n.s
            /* JADX INFO: renamed from: k */
            public void mo3865k(@dd Throwable th) {
                k.this.f4540k.ki(th);
            }

            @Override // androidx.emoji2.text.C0830n.s
            public void toq(@lvui kja0 kja0Var) {
                k.this.f7l8(kja0Var);
            }
        }

        k(C0830n c0830n) {
            super(c0830n);
        }

        void f7l8(@lvui kja0 kja0Var) {
            if (kja0Var == null) {
                this.f4540k.ki(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f51171zy = kja0Var;
            kja0 kja0Var2 = this.f51171zy;
            ld6 ld6Var = new ld6();
            q qVar = this.f4540k.f51166qrj;
            C0830n c0830n = this.f4540k;
            this.f51170toq = new C0835s(kja0Var2, ld6Var, qVar, c0830n.f4535y, c0830n.f4534s);
            this.f4540k.t8r();
        }

        @Override // androidx.emoji2.text.C0830n.toq
        /* JADX INFO: renamed from: g */
        void mo4040g(@lvui EditorInfo editorInfo) {
            editorInfo.extras.putInt(C0830n.f51158n7h, this.f51171zy.m4020y());
            editorInfo.extras.putBoolean(C0830n.f51156kja0, this.f4540k.f51164f7l8);
        }

        @Override // androidx.emoji2.text.C0830n.toq
        /* JADX INFO: renamed from: k */
        String mo4041k() {
            String strM3884r = this.f51171zy.f7l8().m3884r();
            return strM3884r == null ? "" : strM3884r;
        }

        @Override // androidx.emoji2.text.C0830n.toq
        /* JADX INFO: renamed from: n */
        CharSequence mo4042n(@lvui CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            return this.f51170toq.m4076s(charSequence, i2, i3, i4, z2);
        }

        @Override // androidx.emoji2.text.C0830n.toq
        /* JADX INFO: renamed from: q */
        void mo4043q() {
            try {
                this.f4540k.f4529g.mo3864k(new C7878k());
            } catch (Throwable th) {
                this.f4540k.ki(th);
            }
        }

        @Override // androidx.emoji2.text.C0830n.toq
        boolean toq(@lvui CharSequence charSequence) {
            return this.f51170toq.zy(charSequence) != null;
        }

        @Override // androidx.emoji2.text.C0830n.toq
        boolean zy(@lvui CharSequence charSequence, int i2) {
            C0836y c0836yZy = this.f51170toq.zy(charSequence);
            return c0836yZy != null && c0836yZy.m4088q() <= i2;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$ld6 */
    /* JADX INFO: compiled from: EmojiCompat.java */
    @hyr(19)
    @uv6({uv6.EnumC7844k.LIBRARY})
    static class ld6 {
        ld6() {
        }

        /* JADX INFO: renamed from: k */
        AbstractC0833p m4044k(@lvui C0836y c0836y) {
            return new cdj(c0836y);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$n */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class n {
        /* JADX INFO: renamed from: k */
        public void mo511k(@dd Throwable th) {
        }

        public void toq() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$p */
    /* JADX INFO: compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface p {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$q */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public interface q {
        /* JADX INFO: renamed from: k */
        boolean mo4045k(@lvui CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3, @a9(from = 0) int i4);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$s */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class s {
        /* JADX INFO: renamed from: k */
        public abstract void mo3865k(@dd Throwable th);

        public abstract void toq(@lvui kja0 kja0Var);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$toq */
    /* JADX INFO: compiled from: EmojiCompat.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        final C0830n f4540k;

        toq(C0830n c0830n) {
            this.f4540k = c0830n;
        }

        /* JADX INFO: renamed from: g */
        void mo4040g(@lvui EditorInfo editorInfo) {
        }

        /* JADX INFO: renamed from: k */
        String mo4041k() {
            return "";
        }

        /* JADX INFO: renamed from: n */
        CharSequence mo4042n(@lvui CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3, @a9(from = 0) int i4, boolean z2) {
            return charSequence;
        }

        /* JADX INFO: renamed from: q */
        void mo4043q() {
            this.f4540k.t8r();
        }

        boolean toq(@lvui CharSequence charSequence) {
            return false;
        }

        boolean zy(@lvui CharSequence charSequence, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$y */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public interface y {
        /* JADX INFO: renamed from: k */
        void mo3864k(@lvui s sVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.n$zy */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class zy {

        /* JADX INFO: renamed from: g */
        boolean f4541g;

        /* JADX INFO: renamed from: k */
        @lvui
        final y f4542k;

        /* JADX INFO: renamed from: n */
        @dd
        Set<n> f4543n;

        /* JADX INFO: renamed from: q */
        @dd
        int[] f4544q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f51173toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f51174zy;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f51172f7l8 = -16711936;

        /* JADX INFO: renamed from: y */
        int f4546y = 0;

        /* JADX INFO: renamed from: s */
        @lvui
        q f4545s = new C0835s.toq();

        protected zy(@lvui y yVar) {
            androidx.core.util.n7h.qrj(yVar, "metadataLoader cannot be null.");
            this.f4542k = yVar;
        }

        @lvui
        public zy f7l8(boolean z2) {
            this.f51173toq = z2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public zy m4046g(int i2) {
            this.f4546y = i2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        protected final y m4047k() {
            return this.f4542k;
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public zy m4048n(@lvui q qVar) {
            androidx.core.util.n7h.qrj(qVar, "GlyphChecker cannot be null");
            this.f4545s = qVar;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: p */
        public zy m4049p(@lvui n nVar) {
            androidx.core.util.n7h.qrj(nVar, "initCallback cannot be null");
            Set<n> set = this.f4543n;
            if (set != null) {
                set.remove(nVar);
            }
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public zy m4050q(boolean z2) {
            this.f4541g = z2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: s */
        public zy m4051s(boolean z2, @dd List<Integer> list) {
            this.f51174zy = z2;
            if (!z2 || list == null) {
                this.f4544q = null;
            } else {
                this.f4544q = new int[list.size()];
                int i2 = 0;
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    this.f4544q[i2] = it.next().intValue();
                    i2++;
                }
                Arrays.sort(this.f4544q);
            }
            return this;
        }

        @lvui
        public zy toq(@lvui n nVar) {
            androidx.core.util.n7h.qrj(nVar, "initCallback cannot be null");
            if (this.f4543n == null) {
                this.f4543n = new androidx.collection.zy();
            }
            this.f4543n.add(nVar);
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: y */
        public zy m4052y(boolean z2) {
            return m4051s(z2, null);
        }

        @lvui
        public zy zy(@zy.x2 int i2) {
            this.f51172f7l8 = i2;
            return this;
        }
    }

    private C0830n(@lvui zy zyVar) {
        this.f51164f7l8 = zyVar.f51173toq;
        this.f4535y = zyVar.f51174zy;
        this.f4534s = zyVar.f4544q;
        this.f4532p = zyVar.f4541g;
        this.f51165ld6 = zyVar.f51172f7l8;
        this.f4529g = zyVar.f4542k;
        this.f51168x2 = zyVar.f4546y;
        this.f51166qrj = zyVar.f4545s;
        androidx.collection.zy zyVar2 = new androidx.collection.zy();
        this.f51167toq = zyVar2;
        Set<n> set = zyVar.f4543n;
        if (set != null && !set.isEmpty()) {
            zyVar2.addAll(zyVar.f4543n);
        }
        this.f4531n = new k(this);
        cdj();
    }

    private void cdj() {
        this.f4530k.writeLock().lock();
        try {
            if (this.f51168x2 == 0) {
                this.f51169zy = 0;
            }
            this.f4530k.writeLock().unlock();
            if (m4035n() == 0) {
                this.f4531n.mo4043q();
            }
        } catch (Throwable th) {
            this.f4530k.writeLock().unlock();
            throw th;
        }
    }

    public static boolean f7l8(@lvui Editable editable, int i2, @lvui KeyEvent keyEvent) {
        return C0835s.m4073n(editable, i2, keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4029g(@lvui InputConnection inputConnection, @lvui Editable editable, @a9(from = 0) int i2, @a9(from = 0) int i3, boolean z2) {
        return C0835s.m4074q(inputConnection, editable, i2, i3, z2);
    }

    private boolean kja0() {
        return m4035n() == 1;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static C0830n ld6(@lvui Context context, @dd C0834q.k kVar) {
        C0830n c0830n;
        if (f51157mcp) {
            return f4527t;
        }
        if (kVar == null) {
            kVar = new C0834q.k(null);
        }
        zy zyVarZy = kVar.zy(context);
        synchronized (f51162wvg) {
            if (!f51157mcp) {
                if (zyVarZy != null) {
                    x2(zyVarZy);
                }
                f51157mcp = true;
            }
            c0830n = f4527t;
        }
        return c0830n;
    }

    @dd
    @uv6({uv6.EnumC7844k.TESTS})
    public static C0830n o1t(@dd C0830n c0830n) {
        C0830n c0830n2;
        synchronized (f51160o1t) {
            f4527t = c0830n;
            c0830n2 = f4527t;
        }
        return c0830n2;
    }

    @dd
    /* JADX INFO: renamed from: p */
    public static C0830n m4031p(@lvui Context context) {
        return ld6(context, null);
    }

    public static boolean qrj() {
        return f4527t != null;
    }

    @lvui
    public static C0830n toq() {
        C0830n c0830n;
        synchronized (f51160o1t) {
            c0830n = f4527t;
            androidx.core.util.n7h.kja0(c0830n != null, f51154jk);
        }
        return c0830n;
    }

    @uv6({uv6.EnumC7844k.TESTS})
    public static void wvg(boolean z2) {
        synchronized (f51162wvg) {
            f51157mcp = z2;
        }
    }

    @lvui
    public static C0830n x2(@lvui zy zyVar) {
        C0830n c0830n = f4527t;
        if (c0830n == null) {
            synchronized (f51160o1t) {
                c0830n = f4527t;
                if (c0830n == null) {
                    c0830n = new C0830n(zyVar);
                    f4527t = c0830n;
                }
            }
        }
        return c0830n;
    }

    @lvui
    /* JADX INFO: renamed from: z */
    public static C0830n m4032z(@lvui zy zyVar) {
        C0830n c0830n;
        synchronized (f51160o1t) {
            c0830n = new C0830n(zyVar);
            f4527t = c0830n;
        }
        return c0830n;
    }

    @InterfaceC7839p
    @dd
    public CharSequence fn3e(@dd CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3) {
        return zurt(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public void fu4(@lvui n nVar) {
        androidx.core.util.n7h.qrj(nVar, "initCallback cannot be null");
        this.f4530k.writeLock().lock();
        try {
            if (this.f51169zy == 1 || this.f51169zy == 2) {
                this.f4533q.post(new g(nVar, this.f51169zy));
            } else {
                this.f51167toq.add(nVar);
            }
        } finally {
            this.f4530k.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4033h() {
        androidx.core.util.n7h.kja0(this.f51168x2 == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (kja0()) {
            return;
        }
        this.f4530k.writeLock().lock();
        try {
            if (this.f51169zy == 0) {
                return;
            }
            this.f51169zy = 0;
            this.f4530k.writeLock().unlock();
            this.f4531n.mo4043q();
        } finally {
            this.f4530k.writeLock().unlock();
        }
    }

    @InterfaceC7839p
    @dd
    /* JADX INFO: renamed from: i */
    public CharSequence m4034i(@dd CharSequence charSequence) {
        return fn3e(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    void ki(@dd Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4530k.writeLock().lock();
        try {
            this.f51169zy = 2;
            arrayList.addAll(this.f51167toq);
            this.f51167toq.clear();
            this.f4530k.writeLock().unlock();
            this.f4533q.post(new g(arrayList, this.f51169zy, th));
        } catch (Throwable th2) {
            this.f4530k.writeLock().unlock();
            throw th2;
        }
    }

    public void mcp(@lvui EditorInfo editorInfo) {
        if (!kja0() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f4531n.mo4040g(editorInfo);
    }

    /* JADX INFO: renamed from: n */
    public int m4035n() {
        this.f4530k.readLock().lock();
        try {
            return this.f51169zy;
        } finally {
            this.f4530k.readLock().unlock();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean n7h() {
        return this.f4532p;
    }

    @InterfaceC7839p
    @dd
    public CharSequence ni7(@dd CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3, @a9(from = 0) int i4, int i5) {
        boolean z2;
        androidx.core.util.n7h.kja0(kja0(), "Not initialized yet");
        androidx.core.util.n7h.m2977p(i2, "start cannot be negative");
        androidx.core.util.n7h.m2977p(i3, "end cannot be negative");
        androidx.core.util.n7h.m2977p(i4, "maxEmojiCount cannot be negative");
        androidx.core.util.n7h.toq(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.n7h.toq(i2 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.n7h.toq(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z2 = i5 != 2 ? this.f51164f7l8 : false;
        } else {
            z2 = true;
        }
        return this.f4531n.mo4042n(charSequence, i2, i3, i4, z2);
    }

    @zy.x2
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    public int m4036q() {
        return this.f51165ld6;
    }

    /* JADX INFO: renamed from: s */
    public boolean m4037s(@lvui CharSequence charSequence, @a9(from = 0) int i2) {
        androidx.core.util.n7h.kja0(kja0(), "Not initialized yet");
        androidx.core.util.n7h.qrj(charSequence, "sequence cannot be null");
        return this.f4531n.zy(charSequence, i2);
    }

    /* JADX INFO: renamed from: t */
    public void m4038t(@lvui n nVar) {
        androidx.core.util.n7h.qrj(nVar, "initCallback cannot be null");
        this.f4530k.writeLock().lock();
        try {
            this.f51167toq.remove(nVar);
        } finally {
            this.f4530k.writeLock().unlock();
        }
    }

    void t8r() {
        ArrayList arrayList = new ArrayList();
        this.f4530k.writeLock().lock();
        try {
            this.f51169zy = 1;
            arrayList.addAll(this.f51167toq);
            this.f51167toq.clear();
            this.f4530k.writeLock().unlock();
            this.f4533q.post(new g(arrayList, this.f51169zy));
        } catch (Throwable th) {
            this.f4530k.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m4039y(@lvui CharSequence charSequence) {
        androidx.core.util.n7h.kja0(kja0(), "Not initialized yet");
        androidx.core.util.n7h.qrj(charSequence, "sequence cannot be null");
        return this.f4531n.toq(charSequence);
    }

    @InterfaceC7839p
    @dd
    public CharSequence zurt(@dd CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3, @a9(from = 0) int i4) {
        return ni7(charSequence, i2, i3, i4, 0);
    }

    @lvui
    public String zy() {
        androidx.core.util.n7h.kja0(kja0(), "Not initialized yet");
        return this.f4531n.mo4041k();
    }
}
