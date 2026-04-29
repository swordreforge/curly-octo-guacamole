package androidx.fragment.app;

import androidx.lifecycle.hb;
import java.util.Collection;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: compiled from: FragmentManagerNonConfig.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C0880h {

    /* JADX INFO: renamed from: k */
    @dd
    private final Collection<Fragment> f4791k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final Map<String, C0880h> f51486toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final Map<String, hb> f51487zy;

    C0880h(@dd Collection<Fragment> collection, @dd Map<String, C0880h> map, @dd Map<String, hb> map2) {
        this.f4791k = collection;
        this.f51486toq = map;
        this.f51487zy = map2;
    }

    @dd
    /* JADX INFO: renamed from: k */
    Map<String, C0880h> m4279k() {
        return this.f51486toq;
    }

    /* JADX INFO: renamed from: q */
    boolean m4280q(Fragment fragment) {
        Collection<Fragment> collection = this.f4791k;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }

    @dd
    Collection<Fragment> toq() {
        return this.f4791k;
    }

    @dd
    Map<String, hb> zy() {
        return this.f51487zy;
    }
}
