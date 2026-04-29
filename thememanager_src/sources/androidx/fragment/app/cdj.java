package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.hb;
import androidx.lifecycle.lrht;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes.dex */
final class cdj extends lrht {

    /* JADX INFO: renamed from: r */
    private static final C0924e.toq f4758r = new C0872k();

    /* JADX INFO: renamed from: t */
    private static final String f4759t = "FragmentManager";

    /* JADX INFO: renamed from: p */
    private final boolean f4763p;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, Fragment> f4760g = new HashMap<>();

    /* JADX INFO: renamed from: y */
    private final HashMap<String, cdj> f4765y = new HashMap<>();

    /* JADX INFO: renamed from: s */
    private final HashMap<String, hb> f4764s = new HashMap<>();

    /* JADX INFO: renamed from: h */
    private boolean f4761h = false;

    /* JADX INFO: renamed from: i */
    private boolean f4762i = false;

    /* JADX INFO: renamed from: z */
    private boolean f4766z = false;

    /* JADX INFO: renamed from: androidx.fragment.app.cdj$k */
    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    class C0872k implements C0924e.toq {
        C0872k() {
        }

        @Override // androidx.lifecycle.C0924e.toq
        @lvui
        public <T extends lrht> T toq(@lvui Class<T> cls) {
            return new cdj(true);
        }
    }

    cdj(boolean z2) {
        this.f4763p = z2;
    }

    @lvui
    static cdj lrht(hb hbVar) {
        return (cdj) new C0924e(hbVar, f4758r).m4420k(cdj.class);
    }

    @lvui
    /* JADX INFO: renamed from: c */
    cdj m4237c(@lvui Fragment fragment) {
        cdj cdjVar = this.f4765y.get(fragment.mWho);
        if (cdjVar != null) {
            return cdjVar;
        }
        cdj cdjVar2 = new cdj(this.f4763p);
        this.f4765y.put(fragment.mWho, cdjVar2);
        return cdjVar2;
    }

    @lvui
    /* JADX INFO: renamed from: e */
    hb m4238e(@lvui Fragment fragment) {
        hb hbVar = this.f4764s.get(fragment.mWho);
        if (hbVar != null) {
            return hbVar;
        }
        hb hbVar2 = new hb();
        this.f4764s.put(fragment.mWho, hbVar2);
        return hbVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cdj.class != obj.getClass()) {
            return false;
        }
        cdj cdjVar = (cdj) obj;
        return this.f4760g.equals(cdjVar.f4760g) && this.f4765y.equals(cdjVar.f4765y) && this.f4764s.equals(cdjVar.f4764s);
    }

    @dd
    /* JADX INFO: renamed from: f */
    Fragment m4239f(String str) {
        return this.f4760g.get(str);
    }

    public int hashCode() {
        return (((this.f4760g.hashCode() * 31) + this.f4765y.hashCode()) * 31) + this.f4764s.hashCode();
    }

    void hb(@lvui Fragment fragment) {
        if (this.f4766z) {
            if (FragmentManager.m4(2)) {
                Log.v(f4759t, "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4760g.remove(fragment.mWho) != null) && FragmentManager.m4(2)) {
            Log.v(f4759t, "Updating retained Fragments: Removed " + fragment);
        }
    }

    void hyr(@lvui Fragment fragment) {
        if (FragmentManager.m4(3)) {
            Log.d(f4759t, "Clearing non-config state for " + fragment);
        }
        cdj cdjVar = this.f4765y.get(fragment.mWho);
        if (cdjVar != null) {
            cdjVar.ncyb();
            this.f4765y.remove(fragment.mWho);
        }
        hb hbVar = this.f4764s.get(fragment.mWho);
        if (hbVar != null) {
            hbVar.m4441k();
            this.f4764s.remove(fragment.mWho);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    void m4240j(@dd C0880h c0880h) {
        this.f4760g.clear();
        this.f4765y.clear();
        this.f4764s.clear();
        if (c0880h != null) {
            Collection<Fragment> qVar = c0880h.toq();
            if (qVar != null) {
                for (Fragment fragment : qVar) {
                    if (fragment != null) {
                        this.f4760g.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, C0880h> mapM4279k = c0880h.m4279k();
            if (mapM4279k != null) {
                for (Map.Entry<String, C0880h> entry : mapM4279k.entrySet()) {
                    cdj cdjVar = new cdj(this.f4763p);
                    cdjVar.m4240j(entry.getValue());
                    this.f4765y.put(entry.getKey(), cdjVar);
                }
            }
            Map<String, hb> mapZy = c0880h.zy();
            if (mapZy != null) {
                this.f4764s.putAll(mapZy);
            }
        }
        this.f4762i = false;
    }

    /* JADX INFO: renamed from: m */
    boolean m4241m(@lvui Fragment fragment) {
        if (this.f4760g.containsKey(fragment.mWho)) {
            return this.f4763p ? this.f4761h : !this.f4762i;
        }
        return true;
    }

    void n5r1(@lvui Fragment fragment) {
        if (this.f4766z) {
            if (FragmentManager.m4(2)) {
                Log.v(f4759t, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4760g.containsKey(fragment.mWho)) {
                return;
            }
            this.f4760g.put(fragment.mWho, fragment);
            if (FragmentManager.m4(2)) {
                Log.v(f4759t, "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        if (FragmentManager.m4(3)) {
            Log.d(f4759t, "onCleared called for " + this);
        }
        this.f4761h = true;
    }

    boolean nn86() {
        return this.f4761h;
    }

    /* JADX INFO: renamed from: o */
    void m4242o(boolean z2) {
        this.f4766z = z2;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f4760g.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f4765y.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4764s.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @lvui
    Collection<Fragment> uv6() {
        return new ArrayList(this.f4760g.values());
    }

    @Deprecated
    @dd
    C0880h vyq() {
        if (this.f4760g.isEmpty() && this.f4765y.isEmpty() && this.f4764s.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, cdj> entry : this.f4765y.entrySet()) {
            C0880h c0880hVyq = entry.getValue().vyq();
            if (c0880hVyq != null) {
                map.put(entry.getKey(), c0880hVyq);
            }
        }
        this.f4762i = true;
        if (this.f4760g.isEmpty() && map.isEmpty() && this.f4764s.isEmpty()) {
            return null;
        }
        return new C0880h(new ArrayList(this.f4760g.values()), map, new HashMap(this.f4764s));
    }
}
