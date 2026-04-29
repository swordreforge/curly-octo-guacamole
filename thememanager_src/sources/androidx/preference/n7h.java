package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.fn3e;
import androidx.preference.ki;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ld6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p023g.C6045k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PreferenceGroupAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class n7h extends RecyclerView.AbstractC1060y<C1016i> implements Preference.toq, PreferenceGroup.zy {

    /* JADX INFO: renamed from: g */
    private final List<C1025q> f5570g;

    /* JADX INFO: renamed from: k */
    private final PreferenceGroup f5571k;

    /* JADX INFO: renamed from: n */
    private List<Preference> f5572n;

    /* JADX INFO: renamed from: q */
    private List<Preference> f5573q;

    /* JADX INFO: renamed from: s */
    private final Runnable f5574s = new RunnableC1024k();

    /* JADX INFO: renamed from: y */
    private final Handler f5575y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.preference.n7h$k */
    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class RunnableC1024k implements Runnable {
        RunnableC1024k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n7h.this.wvg();
        }
    }

    /* JADX INFO: renamed from: androidx.preference.n7h$q */
    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    private static class C1025q {

        /* JADX INFO: renamed from: k */
        int f5577k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f51977toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f51978zy;

        C1025q(@lvui Preference preference) {
            this.f51978zy = preference.getClass().getName();
            this.f5577k = preference.zurt();
            this.f51977toq = preference.m4658r();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1025q)) {
                return false;
            }
            C1025q c1025q = (C1025q) obj;
            return this.f5577k == c1025q.f5577k && this.f51977toq == c1025q.f51977toq && TextUtils.equals(this.f51978zy, c1025q.f51978zy);
        }

        public int hashCode() {
            return ((((527 + this.f5577k) * 31) + this.f51977toq) * 31) + this.f51978zy.hashCode();
        }
    }

    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class toq extends ld6.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f5578k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ List f51979toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ ki.AbstractC1021q f51980zy;

        toq(List list, List list2, ki.AbstractC1021q abstractC1021q) {
            this.f5578k = list;
            this.f51979toq = list2;
            this.f51980zy = abstractC1021q;
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: k */
        public boolean mo4703k(int i2, int i3) {
            return this.f51980zy.mo4698k((Preference) this.f5578k.get(i2), (Preference) this.f51979toq.get(i3));
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: n */
        public int mo4704n() {
            return this.f5578k.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: q */
        public int mo4705q() {
            return this.f51979toq.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        public boolean toq(int i2, int i3) {
            return this.f51980zy.toq((Preference) this.f5578k.get(i2), (Preference) this.f51979toq.get(i3));
        }
    }

    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class zy implements Preference.InterfaceC0998q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ PreferenceGroup f5580k;

        zy(PreferenceGroup preferenceGroup) {
            this.f5580k = preferenceGroup;
        }

        @Override // androidx.preference.Preference.InterfaceC0998q
        public boolean onPreferenceClick(@lvui Preference preference) {
            this.f5580k.zwy(Integer.MAX_VALUE);
            n7h.this.mo4667s(preference);
            PreferenceGroup.toq toqVarJbh = this.f5580k.jbh();
            if (toqVarJbh == null) {
                return true;
            }
            toqVarJbh.m4669k();
            return true;
        }
    }

    public n7h(@lvui PreferenceGroup preferenceGroup) {
        this.f5571k = preferenceGroup;
        preferenceGroup.py(this);
        this.f5573q = new ArrayList();
        this.f5572n = new ArrayList();
        this.f5570g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).bap7());
        } else {
            setHasStableIds(true);
        }
        wvg();
    }

    private C1027q cdj(PreferenceGroup preferenceGroup, List<Preference> list) {
        C1027q c1027q = new C1027q(preferenceGroup.x2(), list, preferenceGroup.ki());
        c1027q.ltg8(new zy(preferenceGroup));
        return c1027q;
    }

    private void fn3e(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.ngy();
        int iUc = preferenceGroup.uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            Preference preferenceYl = preferenceGroup.yl(i2);
            list.add(preferenceYl);
            C1025q c1025q = new C1025q(preferenceYl);
            if (!this.f5570g.contains(c1025q)) {
                this.f5570g.add(c1025q);
            }
            if (preferenceYl instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceYl;
                if (preferenceGroup2.ixz()) {
                    fn3e(list, preferenceGroup2);
                }
            }
            preferenceYl.py(this);
        }
    }

    private boolean fu4(PreferenceGroup preferenceGroup) {
        return preferenceGroup.mbx() != Integer.MAX_VALUE;
    }

    private List<Preference> ki(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iUc = preferenceGroup.uc();
        int i2 = 0;
        for (int i3 = 0; i3 < iUc; i3++) {
            Preference preferenceYl = preferenceGroup.yl(i3);
            if (preferenceYl.lrht()) {
                if (!fu4(preferenceGroup) || i2 < preferenceGroup.mbx()) {
                    arrayList.add(preferenceYl);
                } else {
                    arrayList2.add(preferenceYl);
                }
                if (preferenceYl instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceYl;
                    if (!preferenceGroup2.ixz()) {
                        continue;
                    } else {
                        if (fu4(preferenceGroup) && fu4(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : ki(preferenceGroup2)) {
                            if (!fu4(preferenceGroup) || i2 < preferenceGroup.mbx()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (fu4(preferenceGroup) && i2 > preferenceGroup.mbx()) {
            arrayList.add(cdj(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    @Override // androidx.preference.Preference.toq
    /* JADX INFO: renamed from: g */
    public void mo4666g(@lvui Preference preference) {
        int iIndexOf = this.f5572n.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f5572n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public long getItemId(int i2) {
        if (hasStableIds()) {
            return ni7(i2).ki();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int i2) {
        C1025q c1025q = new C1025q(ni7(i2));
        int iIndexOf = this.f5570g.indexOf(c1025q);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f5570g.size();
        this.f5570g.add(c1025q);
        return size;
    }

    @dd
    public Preference ni7(int i2) {
        if (i2 < 0 || i2 >= getItemCount()) {
            return null;
        }
        return this.f5572n.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public C1016i onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        C1025q c1025q = this.f5570g.get(i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, fn3e.ld6.f5497k);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(fn3e.ld6.f51896toq);
        if (drawable == null) {
            drawable = C6045k.toq(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c1025q.f5577k, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            C0683f.wlev(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = c1025q.f51977toq;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C1016i(viewInflate);
    }

    @Override // androidx.preference.PreferenceGroup.zy
    /* JADX INFO: renamed from: q */
    public int mo4670q(@lvui Preference preference) {
        int size = this.f5572n.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = this.f5572n.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.preference.PreferenceGroup.zy
    public int qrj(@lvui String str) {
        int size = this.f5572n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, this.f5572n.get(i2).fn3e())) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.toq
    /* JADX INFO: renamed from: s */
    public void mo4667s(@lvui Preference preference) {
        this.f5575y.removeCallbacks(this.f5574s);
        this.f5575y.post(this.f5574s);
    }

    void wvg() {
        Iterator<Preference> it = this.f5573q.iterator();
        while (it.hasNext()) {
            it.next().py(null);
        }
        ArrayList arrayList = new ArrayList(this.f5573q.size());
        this.f5573q = arrayList;
        fn3e(arrayList, this.f5571k);
        List<Preference> list = this.f5572n;
        List<Preference> listKi = ki(this.f5571k);
        this.f5572n = listKi;
        ki kiVarGvn7 = this.f5571k.gvn7();
        if (kiVarGvn7 == null || kiVarGvn7.x2() == null) {
            notifyDataSetChanged();
        } else {
            androidx.recyclerview.widget.ld6.toq(new toq(list, listKi, kiVarGvn7.x2())).m5034n(this);
        }
        Iterator<Preference> it2 = this.f5573q.iterator();
        while (it2.hasNext()) {
            it2.next().m4657q();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui C1016i c1016i, int i2) {
        Preference preferenceNi7 = ni7(i2);
        c1016i.m4686z();
        preferenceNi7.mo4638o(c1016i);
    }

    @Override // androidx.preference.Preference.toq
    public void zy(@lvui Preference preference) {
        mo4667s(preference);
    }
}
