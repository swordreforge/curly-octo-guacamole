package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.lifecycle.kja0;
import java.io.PrintWriter;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes.dex */
final class C0884k extends o1t implements FragmentManager.ld6, FragmentManager.InterfaceC0861h {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f51488dd = "FragmentManager";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    final FragmentManager f51489d2ok;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    boolean f51490lvui;

    /* JADX INFO: renamed from: r */
    int f4820r;

    C0884k(@lvui FragmentManager fragmentManager) {
        super(fragmentManager.vq(), fragmentManager.qo() != null ? fragmentManager.qo().m4330g().getClassLoader() : null);
        this.f4820r = -1;
        this.f51489d2ok = fragmentManager;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m4293e(o1t.C0889k c0889k) {
        Fragment fragment = c0889k.f51529toq;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    void m4294c(boolean z2) {
        for (int size = this.f51527zy.size() - 1; size >= 0; size--) {
            o1t.C0889k c0889k = this.f51527zy.get(size);
            Fragment fragment = c0889k.f51529toq;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.bap7(this.f4854y));
                fragment.setSharedElementNames(this.f51517cdj, this.f4848h);
            }
            switch (c0889k.f4856k) {
                case 1:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, true);
                    this.f51489d2ok.ebn(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0889k.f4856k);
                case 3:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.ld6(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.oki(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, true);
                    this.f51489d2ok.i9jn(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.cdj(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, true);
                    this.f51489d2ok.mcp(fragment);
                    break;
                case 8:
                    this.f51489d2ok.a5id(null);
                    break;
                case 9:
                    this.f51489d2ok.a5id(fragment);
                    break;
                case 10:
                    this.f51489d2ok.vy(fragment, c0889k.f51528f7l8);
                    break;
            }
            if (!this.f51519ki && c0889k.f4856k != 3 && fragment != null && !FragmentManager.f51435x9kr) {
                this.f51489d2ok.se(fragment);
            }
        }
        if (this.f51519ki || !z2 || FragmentManager.f51435x9kr) {
            return;
        }
        FragmentManager fragmentManager = this.f51489d2ok;
        fragmentManager.gc3c(fragmentManager.f51437cdj, true);
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t d2ok(@dd Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f51489d2ok) {
            return super.d2ok(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t eqxt(@lvui Fragment fragment, @lvui kja0.zy zyVar) {
        if (fragment.mFragmentManager != this.f51489d2ok) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f51489d2ok);
        }
        if (zyVar == kja0.zy.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + zyVar + " after the Fragment has been created");
        }
        if (zyVar != kja0.zy.DESTROYED) {
            return super.eqxt(fragment, zyVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + zyVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: f */
    void m4295f() {
        int size = this.f51527zy.size();
        for (int i2 = 0; i2 < size; i2++) {
            o1t.C0889k c0889k = this.f51527zy.get(i2);
            Fragment fragment = c0889k.f51529toq;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4854y);
                fragment.setSharedElementNames(this.f4848h, this.f51517cdj);
            }
            switch (c0889k.f4856k) {
                case 1:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, false);
                    this.f51489d2ok.ld6(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0889k.f4856k);
                case 3:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.ebn(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.i9jn(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, false);
                    this.f51489d2ok.oki(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.mcp(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c0889k.f51530zy, c0889k.f4858q, c0889k.f4857n, c0889k.f4855g);
                    this.f51489d2ok.e5(fragment, false);
                    this.f51489d2ok.cdj(fragment);
                    break;
                case 8:
                    this.f51489d2ok.a5id(fragment);
                    break;
                case 9:
                    this.f51489d2ok.a5id(null);
                    break;
                case 10:
                    this.f51489d2ok.vy(fragment, c0889k.f4859y);
                    break;
            }
            if (!this.f51519ki && c0889k.f4856k != 1 && fragment != null && !FragmentManager.f51435x9kr) {
                this.f51489d2ok.se(fragment);
            }
        }
        if (this.f51519ki || FragmentManager.f51435x9kr) {
            return;
        }
        FragmentManager fragmentManager = this.f51489d2ok;
        fragmentManager.gc3c(fragmentManager.f51437cdj, true);
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t fn3e(@lvui Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f51489d2ok) {
            return super.fn3e(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t fu4(@lvui Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f51489d2ok) {
            return super.fu4(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    @dd
    public CharSequence getBreadCrumbShortTitle() {
        return this.f51522n7h != 0 ? this.f51489d2ok.qo().m4330g().getText(this.f51522n7h) : this.f51520kja0;
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    public int getBreadCrumbShortTitleRes() {
        return this.f51522n7h;
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    @dd
    public CharSequence getBreadCrumbTitle() {
        return this.f51526x2 != 0 ? this.f51489d2ok.qo().m4330g().getText(this.f51526x2) : this.f51523qrj;
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    public int getBreadCrumbTitleRes() {
        return this.f51526x2;
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    public int getId() {
        return this.f4820r;
    }

    @Override // androidx.fragment.app.FragmentManager.ld6
    @dd
    public String getName() {
        return this.f51521ld6;
    }

    @Override // androidx.fragment.app.o1t
    /* JADX INFO: renamed from: h */
    public void mo4296h() {
        t8r();
        this.f51489d2ok.m4194b(this, true);
    }

    public void hb() {
        if (this.f51524t8r != null) {
            for (int i2 = 0; i2 < this.f51524t8r.size(); i2++) {
                this.f51524t8r.get(i2).run();
            }
            this.f51524t8r = null;
        }
    }

    public void hyr(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f51521ld6);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4820r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f51490lvui);
            if (this.f4854y != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4854y));
            }
            if (this.f4852q != 0 || this.f4850n != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4852q));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4850n));
            }
            if (this.f4847g != 0 || this.f51518f7l8 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4847g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f51518f7l8));
            }
            if (this.f51526x2 != 0 || this.f51523qrj != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f51526x2));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f51523qrj);
            }
            if (this.f51522n7h != 0 || this.f51520kja0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f51522n7h));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f51520kja0);
            }
        }
        if (this.f51527zy.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f51527zy.size();
        for (int i2 = 0; i2 < size; i2++) {
            o1t.C0889k c0889k = this.f51527zy.get(i2);
            switch (c0889k.f4856k) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0889k.f4856k;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0889k.f51529toq);
            if (z2) {
                if (c0889k.f51530zy != 0 || c0889k.f4858q != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0889k.f51530zy));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0889k.f4858q));
                }
                if (c0889k.f4857n != 0 || c0889k.f4855g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0889k.f4857n));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0889k.f4855g));
                }
            }
        }
    }

    @Override // androidx.fragment.app.o1t
    /* JADX INFO: renamed from: i */
    void mo4297i(int i2, Fragment fragment, @dd String str, int i3) {
        super.mo4297i(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f51489d2ok;
    }

    /* JADX INFO: renamed from: j */
    void m4298j(Fragment.x2 x2Var) {
        for (int i2 = 0; i2 < this.f51527zy.size(); i2++) {
            o1t.C0889k c0889k = this.f51527zy.get(i2);
            if (m4293e(c0889k)) {
                c0889k.f51529toq.setOnStartEnterTransitionListener(x2Var);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0861h
    /* JADX INFO: renamed from: k */
    public boolean mo4209k(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m4(2)) {
            Log.v(f51488dd, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4853s) {
            return true;
        }
        this.f51489d2ok.m4206s(this);
        return true;
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t ki(@lvui Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f51489d2ok) {
            return super.ki(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.o1t
    public void kja0() {
        t8r();
        this.f51489d2ok.m4194b(this, false);
    }

    /* JADX INFO: renamed from: l */
    int m4299l(boolean z2) {
        if (this.f51490lvui) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m4(2)) {
            Log.v(f51488dd, "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new gvn7(f51488dd));
            n5r1("  ", printWriter);
            printWriter.close();
        }
        this.f51490lvui = true;
        if (this.f4853s) {
            this.f4820r = this.f51489d2ok.kja0();
        } else {
            this.f4820r = -1;
        }
        this.f51489d2ok.ek5k(this, z2);
        return this.f4820r;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment lrht(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.o1t$k> r5 = r0.f51527zy
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.o1t$k> r5 = r0.f51527zy
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.o1t$k r5 = (androidx.fragment.app.o1t.C0889k) r5
            int r6 = r5.f4856k
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.o1t$k> r6 = r0.f51527zy
            androidx.fragment.app.o1t$k r7 = new androidx.fragment.app.o1t$k
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f51529toq
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f51529toq
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f51529toq
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.o1t$k> r3 = r0.f51527zy
            androidx.fragment.app.o1t$k r6 = new androidx.fragment.app.o1t$k
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f51529toq
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = r8
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.o1t$k> r3 = r0.f51527zy
            androidx.fragment.app.o1t$k r15 = new androidx.fragment.app.o1t$k
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.o1t$k r15 = new androidx.fragment.app.o1t$k
            r15.<init>(r10, r14)
            int r2 = r5.f51530zy
            r15.f51530zy = r2
            int r2 = r5.f4857n
            r15.f4857n = r2
            int r2 = r5.f4858q
            r15.f4858q = r2
            int r2 = r5.f4855g
            r15.f4855g = r2
            java.util.ArrayList<androidx.fragment.app.o1t$k> r2 = r0.f51527zy
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.o1t$k> r2 = r0.f51527zy
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f4856k = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f51529toq
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0884k.lrht(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public void n5r1(String str, PrintWriter printWriter) {
        hyr(str, printWriter, true);
    }

    @Override // androidx.fragment.app.o1t
    public int n7h() {
        return m4299l(true);
    }

    void ncyb(int i2) {
        if (this.f4853s) {
            if (FragmentManager.m4(2)) {
                Log.v(f51488dd, "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f51527zy.size();
            for (int i3 = 0; i3 < size; i3++) {
                o1t.C0889k c0889k = this.f51527zy.get(i3);
                Fragment fragment = c0889k.f51529toq;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.m4(2)) {
                        Log.v(f51488dd, "Bump nesting of " + c0889k.f51529toq + " to " + c0889k.f51529toq.mBackStackNesting);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.o1t
    public boolean ni7() {
        return this.f51527zy.isEmpty();
    }

    boolean nn86() {
        for (int i2 = 0; i2 < this.f51527zy.size(); i2++) {
            if (m4293e(this.f51527zy.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment m4300o(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.o1t$k> r0 = r5.f51527zy
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.o1t$k> r2 = r5.f51527zy
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.o1t$k r2 = (androidx.fragment.app.o1t.C0889k) r2
            int r3 = r2.f4856k
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.kja0$zy r3 = r2.f51528f7l8
            r2.f4859y = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f51529toq
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f51529toq
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f51529toq
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0884k.m4300o(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.o1t
    public int qrj() {
        return m4299l(false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4820r >= 0) {
            sb.append(" #");
            sb.append(this.f4820r);
        }
        if (this.f51521ld6 != null) {
            sb.append(" ");
            sb.append(this.f51521ld6);
        }
        sb.append("}");
        return sb.toString();
    }

    boolean uv6(int i2) {
        int size = this.f51527zy.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f51527zy.get(i3).f51529toq;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean vyq(ArrayList<C0884k> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f51527zy.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f51527zy.get(i5).f51529toq;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    C0884k c0884k = arrayList.get(i7);
                    int size2 = c0884k.f51527zy.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = c0884k.f51527zy.get(i8).f51529toq;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.o1t
    @lvui
    public o1t x9kr(@lvui Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f51489d2ok) {
            return super.x9kr(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
