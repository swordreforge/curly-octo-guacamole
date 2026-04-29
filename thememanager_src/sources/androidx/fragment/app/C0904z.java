package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes.dex */
class C0904z {

    /* JADX INFO: renamed from: q */
    private static final String f4954q = "FragmentManager";

    /* JADX INFO: renamed from: k */
    private final ArrayList<Fragment> f4955k = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HashMap<String, zurt> f51549toq = new HashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private cdj f51550zy;

    C0904z() {
    }

    void cdj(@lvui zurt zurtVar) {
        Fragment fragmentLd6 = zurtVar.ld6();
        if (zy(fragmentLd6.mWho)) {
            return;
        }
        this.f51549toq.put(fragmentLd6.mWho, zurtVar);
        if (fragmentLd6.mRetainInstanceChangedWhileDetached) {
            if (fragmentLd6.mRetainInstance) {
                this.f51550zy.n5r1(fragmentLd6);
            } else {
                this.f51550zy.hb(fragmentLd6);
            }
            fragmentLd6.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m4(2)) {
            Log.v(f4954q, "Added fragment to active set " + fragmentLd6);
        }
    }

    @dd
    Fragment f7l8(@InterfaceC7843t int i2) {
        for (int size = this.f4955k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4955k.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                Fragment fragmentLd6 = zurtVar.ld6();
                if (fragmentLd6.mFragmentId == i2) {
                    return fragmentLd6;
                }
            }
        }
        return null;
    }

    void fn3e() {
        this.f51549toq.clear();
    }

    @dd
    ArrayList<String> fu4() {
        synchronized (this.f4955k) {
            if (this.f4955k.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4955k.size());
            for (Fragment fragment : this.f4955k) {
                arrayList.add(fragment.mWho);
                if (FragmentManager.m4(2)) {
                    Log.v(f4954q, "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    @dd
    /* JADX INFO: renamed from: g */
    Fragment m4358g(@lvui String str) {
        zurt zurtVar = this.f51549toq.get(str);
        if (zurtVar != null) {
            return zurtVar.ld6();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    cdj m4359h() {
        return this.f51550zy;
    }

    /* JADX INFO: renamed from: i */
    void m4360i(@lvui Fragment fragment) {
        synchronized (this.f4955k) {
            this.f4955k.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: renamed from: k */
    void m4361k(@lvui Fragment fragment) {
        if (this.f4955k.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4955k) {
            this.f4955k.add(fragment);
        }
        fragment.mAdded = true;
    }

    void ki(@lvui zurt zurtVar) {
        Fragment fragmentLd6 = zurtVar.ld6();
        if (fragmentLd6.mRetainInstance) {
            this.f51550zy.hb(fragmentLd6);
        }
        if (this.f51549toq.put(fragmentLd6.mWho, null) != null && FragmentManager.m4(2)) {
            Log.v(f4954q, "Removed fragment from active set " + fragmentLd6);
        }
    }

    @lvui
    List<Fragment> kja0() {
        ArrayList arrayList;
        if (this.f4955k.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4955k) {
            arrayList = new ArrayList(this.f4955k);
        }
        return arrayList;
    }

    int ld6() {
        return this.f51549toq.size();
    }

    /* JADX INFO: renamed from: n */
    void m4362n(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
        String str2 = str + "    ";
        if (!this.f51549toq.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (zurt zurtVar : this.f51549toq.values()) {
                printWriter.print(str);
                if (zurtVar != null) {
                    Fragment fragmentLd6 = zurtVar.ld6();
                    printWriter.println(fragmentLd6);
                    fragmentLd6.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4955k.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f4955k.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @dd
    zurt n7h(@lvui String str) {
        return this.f51549toq.get(str);
    }

    @lvui
    ArrayList<FragmentState> ni7() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f51549toq.size());
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                Fragment fragmentLd6 = zurtVar.ld6();
                FragmentState fragmentStateT8r = zurtVar.t8r();
                arrayList.add(fragmentStateT8r);
                if (FragmentManager.m4(2)) {
                    Log.v(f4954q, "Saved state of " + fragmentLd6 + ": " + fragmentStateT8r.f4732l);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    int m4363p(@lvui Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f4955k.indexOf(fragment);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.f4955k.get(i2);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f4955k.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4955k.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m4364q(int i2) {
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                zurtVar.fn3e(i2);
            }
        }
    }

    @lvui
    List<Fragment> qrj() {
        ArrayList arrayList = new ArrayList();
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                arrayList.add(zurtVar.ld6());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @dd
    /* JADX INFO: renamed from: s */
    Fragment m4365s(@lvui String str) {
        Fragment fragmentFindFragmentByWho;
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null && (fragmentFindFragmentByWho = zurtVar.ld6().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    void t8r() {
        Iterator<Fragment> it = this.f4955k.iterator();
        while (it.hasNext()) {
            zurt zurtVar = this.f51549toq.get(it.next().mWho);
            if (zurtVar != null) {
                zurtVar.qrj();
            }
        }
        for (zurt zurtVar2 : this.f51549toq.values()) {
            if (zurtVar2 != null) {
                zurtVar2.qrj();
                Fragment fragmentLd6 = zurtVar2.ld6();
                if (fragmentLd6.mRemoving && !fragmentLd6.isInBackStack()) {
                    ki(zurtVar2);
                }
            }
        }
    }

    void toq() {
        this.f51549toq.values().removeAll(Collections.singleton(null));
    }

    @lvui
    List<zurt> x2() {
        ArrayList arrayList = new ArrayList();
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                arrayList.add(zurtVar);
            }
        }
        return arrayList;
    }

    @dd
    /* JADX INFO: renamed from: y */
    Fragment m4366y(@dd String str) {
        if (str != null) {
            for (int size = this.f4955k.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4955k.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (zurt zurtVar : this.f51549toq.values()) {
            if (zurtVar != null) {
                Fragment fragmentLd6 = zurtVar.ld6();
                if (str.equals(fragmentLd6.mTag)) {
                    return fragmentLd6;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    void m4367z(@lvui cdj cdjVar) {
        this.f51550zy = cdjVar;
    }

    void zurt(@dd List<String> list) {
        this.f4955k.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM4358g = m4358g(str);
                if (fragmentM4358g == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m4(2)) {
                    Log.v(f4954q, "restoreSaveState: added (" + str + "): " + fragmentM4358g);
                }
                m4361k(fragmentM4358g);
            }
        }
    }

    boolean zy(@lvui String str) {
        return this.f51549toq.get(str) != null;
    }
}
