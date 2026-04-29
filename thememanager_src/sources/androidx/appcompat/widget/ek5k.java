package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import zy.uv6;

/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ek5k extends ContextWrapper {

    /* JADX INFO: renamed from: q */
    private static ArrayList<WeakReference<ek5k>> f1009q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Object f46856zy = new Object();

    /* JADX INFO: renamed from: k */
    private final Resources f1010k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Resources.Theme f46857toq;

    private ek5k(@zy.lvui Context context) {
        super(context);
        if (!ch.m570q()) {
            this.f1010k = new y9n(this, context.getResources());
            this.f46857toq = null;
            return;
        }
        ch chVar = new ch(this, context.getResources());
        this.f1010k = chVar;
        Resources.Theme themeNewTheme = chVar.newTheme();
        this.f46857toq = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: k */
    private static boolean m583k(@zy.lvui Context context) {
        return ((context instanceof ek5k) || (context.getResources() instanceof y9n) || (context.getResources() instanceof ch) || !ch.m570q()) ? false : true;
    }

    public static Context toq(@zy.lvui Context context) {
        if (!m583k(context)) {
            return context;
        }
        synchronized (f46856zy) {
            ArrayList<WeakReference<ek5k>> arrayList = f1009q;
            if (arrayList == null) {
                f1009q = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<ek5k> weakReference = f1009q.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1009q.remove(size);
                    }
                }
                for (int size2 = f1009q.size() - 1; size2 >= 0; size2--) {
                    WeakReference<ek5k> weakReference2 = f1009q.get(size2);
                    ek5k ek5kVar = weakReference2 != null ? weakReference2.get() : null;
                    if (ek5kVar != null && ek5kVar.getBaseContext() == context) {
                        return ek5kVar;
                    }
                }
            }
            ek5k ek5kVar2 = new ek5k(context);
            f1009q.add(new WeakReference<>(ek5kVar2));
            return ek5kVar2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1010k.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1010k;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46857toq;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f46857toq;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
