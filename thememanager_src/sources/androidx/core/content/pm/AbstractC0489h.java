package androidx.core.content.pm;

import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7840q;
import zy.uv6;
import zy.y9n;

/* JADX INFO: renamed from: androidx.core.content.pm.h */
/* JADX INFO: compiled from: ShortcutInfoCompatSaver.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC0489h<T> {

    /* JADX INFO: renamed from: androidx.core.content.pm.h$k */
    /* JADX INFO: compiled from: ShortcutInfoCompatSaver.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class k extends AbstractC0489h<Void> {
        @Override // androidx.core.content.pm.AbstractC0489h
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public Void mo2197q(List<String> list) {
            return null;
        }

        @Override // androidx.core.content.pm.AbstractC0489h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void zy() {
            return null;
        }

        @Override // androidx.core.content.pm.AbstractC0489h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void mo2196k(List<kja0> list) {
            return null;
        }
    }

    @InterfaceC7840q
    /* JADX INFO: renamed from: k */
    public abstract T mo2196k(List<kja0> list);

    @InterfaceC7840q
    /* JADX INFO: renamed from: q */
    public abstract T mo2197q(List<String> list);

    @y9n
    public List<kja0> toq() throws Exception {
        return new ArrayList();
    }

    @InterfaceC7840q
    public abstract T zy();
}
