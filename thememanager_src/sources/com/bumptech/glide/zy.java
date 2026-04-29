package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.engine.prefill.C3041q;
import com.bumptech.glide.load.resource.bitmap.ni7;
import com.bumptech.glide.manager.InterfaceC3149q;
import com.bumptech.glide.manager.cdj;
import com.bumptech.glide.module.AbstractC3154k;
import com.bumptech.glide.module.C3155n;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.request.target.InterfaceC3175h;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.dd;
import zy.lvui;
import zy.o1t;
import zy.yz;

/* JADX INFO: compiled from: Glide.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: c */
    private static volatile boolean f19114c = false;

    /* JADX INFO: renamed from: f */
    @o1t("Glide.class")
    private static volatile zy f19115f = null;

    /* JADX INFO: renamed from: l */
    private static final String f19116l = "Glide";

    /* JADX INFO: renamed from: r */
    private static final String f19117r = "image_manager_disk_cache";

    /* JADX INFO: renamed from: g */
    private final C3157n f19118g;

    /* JADX INFO: renamed from: i */
    private final InterfaceC3214k f19120i;

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.load.engine.ld6 f19121k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3018p f19122n;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3149q f19123p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3008n f19124q;

    /* JADX INFO: renamed from: s */
    private final cdj f19125s;

    /* JADX INFO: renamed from: t */
    @o1t("this")
    @dd
    private com.bumptech.glide.load.engine.prefill.toq f19126t;

    /* JADX INFO: renamed from: y */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f19127y;

    /* JADX INFO: renamed from: h */
    @o1t("managers")
    private final List<kja0> f19119h = new ArrayList();

    /* JADX INFO: renamed from: z */
    private EnumC3213y f19128z = EnumC3213y.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.zy$k */
    /* JADX INFO: compiled from: Glide.java */
    public interface InterfaceC3214k {
        @lvui
        C3173s build();
    }

    zy(@lvui Context context, @lvui com.bumptech.glide.load.engine.ld6 ld6Var, @lvui InterfaceC3018p interfaceC3018p, @lvui InterfaceC3008n interfaceC3008n, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, @lvui cdj cdjVar, @lvui InterfaceC3149q interfaceC3149q, int i2, @lvui InterfaceC3214k interfaceC3214k, @lvui Map<Class<?>, AbstractC2977h<?, ?>> map, @lvui List<InterfaceC3194y<Object>> list, @lvui List<com.bumptech.glide.module.zy> list2, @dd AbstractC3154k abstractC3154k, @lvui C2972g c2972g) {
        this.f19121k = ld6Var;
        this.f19124q = interfaceC3008n;
        this.f19127y = toqVar;
        this.f19122n = interfaceC3018p;
        this.f19125s = cdjVar;
        this.f19123p = interfaceC3149q;
        this.f19120i = interfaceC3214k;
        this.f19118g = new C3157n(context, toqVar, qrj.m11146q(this, list2, abstractC3154k), new com.bumptech.glide.request.target.ld6(), interfaceC3214k, map, list, ld6Var, c2972g, i2);
    }

    @lvui
    public static kja0 a9(@lvui Context context) {
        return m11280h(context).x2(context);
    }

    @yz
    public static void cdj(@lvui Context context, @lvui C3164q c3164q) {
        GeneratedAppGlideModule generatedAppGlideModuleM11279g = m11279g(context);
        synchronized (zy.class) {
            if (f19115f != null) {
                m11285z();
            }
            m11281i(context, c3164q, generatedAppGlideModuleM11279g);
        }
    }

    @lvui
    public static kja0 fti(@lvui View view) {
        return m11280h(view.getContext()).qrj(view);
    }

    @dd
    /* JADX INFO: renamed from: g */
    private static GeneratedAppGlideModule m11279g(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable(f19116l, 5)) {
                Log.w(f19116l, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e2) {
            o1t(e2);
            return null;
        } catch (InstantiationException e3) {
            o1t(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            o1t(e4);
            return null;
        } catch (InvocationTargetException e6) {
            o1t(e6);
            return null;
        }
    }

    @lvui
    public static kja0 gvn7(@lvui ActivityC0891q activityC0891q) {
        return m11280h(activityC0891q).kja0(activityC0891q);
    }

    @lvui
    /* JADX INFO: renamed from: h */
    private static cdj m11280h(@dd Context context) {
        com.bumptech.glide.util.qrj.m11261n(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m11283n(context).kja0();
    }

    @o1t("Glide.class")
    /* JADX INFO: renamed from: i */
    private static void m11281i(@lvui Context context, @lvui C3164q c3164q, @dd GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.zy> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.zy()) {
            listEmptyList = new C3155n(applicationContext).toq();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo10544q().isEmpty()) {
            Set<Class<?>> setMo10544q = generatedAppGlideModule.mo10544q();
            Iterator<com.bumptech.glide.module.zy> it = listEmptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.module.zy next = it.next();
                if (setMo10544q.contains(next.getClass())) {
                    if (Log.isLoggable(f19116l, 3)) {
                        Log.d(f19116l, "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(f19116l, 3)) {
            Iterator<com.bumptech.glide.module.zy> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d(f19116l, "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c3164q.m11138i(generatedAppGlideModule != null ? generatedAppGlideModule.mo10543n() : null);
        Iterator<com.bumptech.glide.module.zy> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().mo6740k(applicationContext, c3164q);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo6740k(applicationContext, c3164q);
        }
        zy qVar = c3164q.toq(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(qVar);
        f19115f = qVar;
    }

    @lvui
    @Deprecated
    public static kja0 jk(@lvui Fragment fragment) {
        return m11280h(fragment.getActivity()).ld6(fragment);
    }

    @lvui
    public static kja0 jp0y(@lvui androidx.fragment.app.Fragment fragment) {
        return m11280h(fragment.getContext()).n7h(fragment);
    }

    @o1t("Glide.class")
    @yz
    /* JADX INFO: renamed from: k */
    static void m11282k(@lvui Context context, @dd GeneratedAppGlideModule generatedAppGlideModule) {
        if (f19114c) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f19114c = true;
        try {
            t8r(context, generatedAppGlideModule);
        } finally {
            f19114c = false;
        }
    }

    @Deprecated
    @yz
    public static synchronized void ki(zy zyVar) {
        if (f19115f != null) {
            m11285z();
        }
        f19115f = zyVar;
    }

    @lvui
    @Deprecated
    public static kja0 mcp(@lvui Activity activity) {
        return m11280h(activity).m11081p(activity);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static zy m11283n(@lvui Context context) {
        if (f19115f == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM11279g = m11279g(context.getApplicationContext());
            synchronized (zy.class) {
                if (f19115f == null) {
                    m11282k(context, generatedAppGlideModuleM11279g);
                }
            }
        }
        return f19115f;
    }

    private static void o1t(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @yz
    /* JADX INFO: renamed from: q */
    public static void m11284q() {
        ni7.m10992q().x2();
    }

    @dd
    public static File qrj(@lvui Context context, @lvui String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable(f19116l, 6)) {
                Log.e(f19116l, "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @o1t("Glide.class")
    private static void t8r(@lvui Context context, @dd GeneratedAppGlideModule generatedAppGlideModule) {
        m11281i(context, new C3164q(), generatedAppGlideModule);
    }

    @dd
    public static File x2(@lvui Context context) {
        return qrj(context, "image_manager_disk_cache");
    }

    @yz
    /* JADX INFO: renamed from: z */
    public static void m11285z() {
        synchronized (zy.class) {
            if (f19115f != null) {
                f19115f.m11286p().getApplicationContext().unregisterComponentCallbacks(f19115f);
                f19115f.f19121k.qrj();
            }
            f19115f = null;
        }
    }

    @lvui
    public com.bumptech.glide.load.engine.bitmap_recycle.toq f7l8() {
        return this.f19127y;
    }

    public synchronized void fn3e(@lvui C3041q.k... kVarArr) {
        if (this.f19126t == null) {
            this.f19126t = new com.bumptech.glide.load.engine.prefill.toq(this.f19122n, this.f19124q, (com.bumptech.glide.load.toq) this.f19120i.build().m11160l().zy(com.bumptech.glide.load.resource.bitmap.cdj.f62867f7l8));
        }
        this.f19126t.zy(kVarArr);
    }

    @lvui
    public EnumC3213y fu4(@lvui EnumC3213y enumC3213y) {
        com.bumptech.glide.util.kja0.toq();
        this.f19122n.zy(enumC3213y.getMultiplier());
        this.f19124q.zy(enumC3213y.getMultiplier());
        EnumC3213y enumC3213y2 = this.f19128z;
        this.f19128z = enumC3213y;
        return enumC3213y2;
    }

    @lvui
    public cdj kja0() {
        return this.f19125s;
    }

    @lvui
    C3157n ld6() {
        return this.f19118g;
    }

    @lvui
    public x2 n7h() {
        return this.f19118g.m11121s();
    }

    boolean ni7(@lvui InterfaceC3175h<?> interfaceC3175h) {
        synchronized (this.f19119h) {
            Iterator<kja0> it = this.f19119h.iterator();
            while (it.hasNext()) {
                if (it.next().nn86(interfaceC3175h)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        zy();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        wvg(i2);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public Context m11286p() {
        return this.f19118g.getBaseContext();
    }

    /* JADX INFO: renamed from: s */
    InterfaceC3149q m11287s() {
        return this.f19123p;
    }

    /* JADX INFO: renamed from: t */
    void m11288t(kja0 kja0Var) {
        synchronized (this.f19119h) {
            if (!this.f19119h.contains(kja0Var)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f19119h.remove(kja0Var);
        }
    }

    public void toq() {
        com.bumptech.glide.util.kja0.m11228k();
        this.f19121k.m10787n();
    }

    public void wvg(int i2) {
        com.bumptech.glide.util.kja0.toq();
        synchronized (this.f19119h) {
            Iterator<kja0> it = this.f19119h.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i2);
            }
        }
        this.f19122n.mo10714k(i2);
        this.f19124q.mo10667k(i2);
        this.f19127y.mo10696k(i2);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public InterfaceC3008n m11289y() {
        return this.f19124q;
    }

    void zurt(kja0 kja0Var) {
        synchronized (this.f19119h) {
            if (this.f19119h.contains(kja0Var)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f19119h.add(kja0Var);
        }
    }

    public void zy() {
        com.bumptech.glide.util.kja0.toq();
        this.f19122n.toq();
        this.f19124q.toq();
        this.f19127y.toq();
    }
}
