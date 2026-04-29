package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0498q;
import java.util.ArrayList;
import java.util.Iterator;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: TaskStackBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c8jq implements Iterable<Intent> {

    /* JADX INFO: renamed from: n */
    private static final String f3135n = "TaskStackBuilder";

    /* JADX INFO: renamed from: k */
    private final ArrayList<Intent> f3136k = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private final Context f3137q;

    /* JADX INFO: renamed from: androidx.core.app.c8jq$k */
    /* JADX INFO: compiled from: TaskStackBuilder.java */
    @zy.hyr(16)
    static class C0416k {
        private C0416k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static PendingIntent m1837k(Context context, int i2, Intent[] intentArr, int i3, Bundle bundle) {
            return PendingIntent.getActivities(context, i2, intentArr, i3, bundle);
        }
    }

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    public interface toq {
        @zy.dd
        Intent x2();
    }

    private c8jq(Context context) {
        this.f3137q = context;
    }

    @zy.lvui
    public static c8jq f7l8(@zy.lvui Context context) {
        return new c8jq(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static c8jq m1830s(Context context) {
        return f7l8(context);
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public c8jq m1831g(@zy.lvui Class<?> cls) {
        return m1834n(new ComponentName(this.f3137q, cls));
    }

    /* JADX INFO: renamed from: h */
    public void m1832h(@zy.dd Bundle bundle) {
        if (this.f3136k.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f3136k.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0498q.t8r(this.f3137q, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f3137q.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @zy.lvui
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3136k.iterator();
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public c8jq m1833k(@zy.lvui Intent intent) {
        this.f3136k.add(intent);
        return this;
    }

    public void kja0() {
        m1832h(null);
    }

    public int ld6() {
        return this.f3136k.size();
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public c8jq m1834n(@zy.lvui ComponentName componentName) {
        int size = this.f3136k.size();
        try {
            Intent qVar = ni7.toq(this.f3137q, componentName);
            while (qVar != null) {
                this.f3136k.add(size, qVar);
                qVar = ni7.toq(this.f3137q, qVar.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(f3135n, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @zy.dd
    public PendingIntent n7h(int i2, int i3, @zy.dd Bundle bundle) {
        if (this.f3136k.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f3136k.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return C0416k.m1837k(this.f3137q, i2, intentArr, i3, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public Intent m1835p(int i2) {
        return m1836y(i2);
    }

    @zy.dd
    public PendingIntent qrj(int i2, int i3) {
        return n7h(i2, i3, null);
    }

    @zy.lvui
    public c8jq toq(@zy.lvui Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3137q.getPackageManager());
        }
        if (component != null) {
            m1834n(component);
        }
        m1833k(intent);
        return this;
    }

    @zy.lvui
    public Intent[] x2() {
        int size = this.f3136k.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f3136k.get(0)).addFlags(268484608);
        for (int i2 = 1; i2 < size; i2++) {
            intentArr[i2] = new Intent(this.f3136k.get(i2));
        }
        return intentArr;
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    public Intent m1836y(int i2) {
        return this.f3136k.get(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zy.lvui
    public c8jq zy(@zy.lvui Activity activity) {
        Intent intentX2 = activity instanceof toq ? ((toq) activity).x2() : null;
        if (intentX2 == null) {
            intentX2 = ni7.m1951k(activity);
        }
        if (intentX2 != null) {
            ComponentName component = intentX2.getComponent();
            if (component == null) {
                component = intentX2.resolveActivity(this.f3137q.getPackageManager());
            }
            m1834n(component);
            m1833k(intentX2);
        }
        return this;
    }
}
