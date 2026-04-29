package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.n7h;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.core.view.tfm;
import androidx.recyclerview.widget.C1113t;
import androidx.recyclerview.widget.RecyclerView;
import ij.C6095k;
import java.util.ArrayList;
import zy.InterfaceC7833l;
import zy.dd;
import zy.gvn7;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.p */
/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4051p implements androidx.appcompat.view.menu.n7h {
    private static final String an = "android:menu:adapter";
    public static final int bp = 0;
    private static final String bv = "android:menu:list";
    private static final String id = "android:menu:header";

    /* JADX INFO: renamed from: a */
    @InterfaceC7833l
    int f24560a;

    /* JADX INFO: renamed from: b */
    @InterfaceC7833l
    int f24561b;

    /* JADX INFO: renamed from: c */
    int f24562c;

    /* JADX INFO: renamed from: d */
    private int f24563d;

    /* JADX INFO: renamed from: e */
    @InterfaceC7833l
    int f24564e;

    /* JADX INFO: renamed from: f */
    RippleDrawable f24565f;

    /* JADX INFO: renamed from: g */
    androidx.appcompat.view.menu.f7l8 f24566g;

    /* JADX INFO: renamed from: i */
    @dd
    ColorStateList f24568i;

    /* JADX INFO: renamed from: j */
    int f24569j;

    /* JADX INFO: renamed from: k */
    private NavigationMenuView f24570k;

    /* JADX INFO: renamed from: l */
    Drawable f24571l;

    /* JADX INFO: renamed from: m */
    @InterfaceC7833l
    int f24572m;

    /* JADX INFO: renamed from: n */
    private n7h.InterfaceC0129k f24573n;

    /* JADX INFO: renamed from: o */
    int f24574o;

    /* JADX INFO: renamed from: p */
    LayoutInflater f24575p;

    /* JADX INFO: renamed from: q */
    LinearLayout f24576q;

    /* JADX INFO: renamed from: r */
    ColorStateList f24577r;

    /* JADX INFO: renamed from: s */
    zy f24578s;

    /* JADX INFO: renamed from: t */
    ColorStateList f24579t;

    /* JADX INFO: renamed from: u */
    boolean f24580u;

    /* JADX INFO: renamed from: v */
    private int f24581v;

    /* JADX INFO: renamed from: w */
    int f24582w;

    /* JADX INFO: renamed from: x */
    @InterfaceC7833l
    int f24583x;

    /* JADX INFO: renamed from: y */
    private int f24584y;

    /* JADX INFO: renamed from: h */
    int f24567h = 0;

    /* JADX INFO: renamed from: z */
    int f24585z = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    boolean f67649bo = true;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f67648ab = -1;
    final View.OnClickListener bb = new k();

    /* JADX INFO: renamed from: com.google.android.material.internal.p$f7l8 */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class f7l8 implements n {

        /* JADX INFO: renamed from: k */
        private final C0130p f24586k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f67650toq;

        f7l8(C0130p c0130p) {
            this.f24586k = c0130p;
        }

        /* JADX INFO: renamed from: k */
        public C0130p m14579k() {
            return this.f24586k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$g */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class g implements n {

        /* JADX INFO: renamed from: k */
        private final int f24587k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67651toq;

        public g(int i2, int i3) {
            this.f24587k = i2;
            this.f67651toq = i3;
        }

        /* JADX INFO: renamed from: k */
        public int m14580k() {
            return this.f67651toq;
        }

        public int toq() {
            return this.f24587k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$k */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z2 = true;
            C4051p.this.m14571e(true);
            C0130p itemData = ((NavigationMenuItemView) view).getItemData();
            C4051p c4051p = C4051p.this;
            boolean zX9kr = c4051p.f24566g.x9kr(itemData, c4051p, 0);
            if (itemData != null && itemData.isCheckable() && zX9kr) {
                C4051p.this.f24578s.mcp(itemData);
            } else {
                z2 = false;
            }
            C4051p.this.m14571e(false);
            if (z2) {
                C4051p.this.mo355q(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$ld6 */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class ld6 extends x2 {
        public ld6(@lvui LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C6095k.ld6.f35612r, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$n */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private interface n {
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$p */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class p extends x2 {
        public p(@lvui LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C6095k.ld6.f79322lvui, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$q */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class q implements n {
        q() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$s */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class s extends x2 {
        public s(@lvui LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C6095k.ld6.f79293eqxt, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$toq */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static class toq extends x2 {
        public toq(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$x2 */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private static abstract class x2 extends RecyclerView.fti {
        public x2(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$y */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private class y extends C1113t {
        y(@lvui RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C1113t, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.w831(ki.toq.m3070n(C4051p.this.f24578s.ni7(), 0, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.p$zy */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    private class zy extends RecyclerView.AbstractC1060y<x2> {

        /* JADX INFO: renamed from: h */
        private static final int f24589h = 1;

        /* JADX INFO: renamed from: i */
        private static final int f24590i = 2;

        /* JADX INFO: renamed from: p */
        private static final int f24591p = 0;

        /* JADX INFO: renamed from: s */
        private static final String f24592s = "android:menu:action_views";

        /* JADX INFO: renamed from: y */
        private static final String f24593y = "android:menu:checked";

        /* JADX INFO: renamed from: z */
        private static final int f24594z = 3;

        /* JADX INFO: renamed from: k */
        private final ArrayList<n> f24596k = new ArrayList<>();

        /* JADX INFO: renamed from: n */
        private boolean f24597n;

        /* JADX INFO: renamed from: q */
        private C0130p f24598q;

        zy() {
            wvg();
        }

        private void cdj(int i2, int i3) {
            while (i2 < i3) {
                ((f7l8) this.f24596k.get(i2)).f67650toq = true;
                i2++;
            }
        }

        private void wvg() {
            if (this.f24597n) {
                return;
            }
            boolean z2 = true;
            this.f24597n = true;
            this.f24596k.clear();
            this.f24596k.add(new q());
            int i2 = -1;
            int size = C4051p.this.f24566g.gvn7().size();
            int i3 = 0;
            boolean z3 = false;
            int size2 = 0;
            while (i3 < size) {
                C0130p c0130p = C4051p.this.f24566g.gvn7().get(i3);
                if (c0130p.isChecked()) {
                    mcp(c0130p);
                }
                if (c0130p.isCheckable()) {
                    c0130p.ni7(false);
                }
                if (c0130p.hasSubMenu()) {
                    SubMenu subMenu = c0130p.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f24596k.add(new g(C4051p.this.f24582w, 0));
                        }
                        this.f24596k.add(new f7l8(c0130p));
                        int size3 = this.f24596k.size();
                        int size4 = subMenu.size();
                        int i4 = 0;
                        boolean z5 = false;
                        while (i4 < size4) {
                            C0130p c0130p2 = (C0130p) subMenu.getItem(i4);
                            if (c0130p2.isVisible()) {
                                if (!z5 && c0130p2.getIcon() != null) {
                                    z5 = z2;
                                }
                                if (c0130p2.isCheckable()) {
                                    c0130p2.ni7(false);
                                }
                                if (c0130p.isChecked()) {
                                    mcp(c0130p);
                                }
                                this.f24596k.add(new f7l8(c0130p2));
                            }
                            i4++;
                            z2 = true;
                        }
                        if (z5) {
                            cdj(size3, this.f24596k.size());
                        }
                    }
                } else {
                    int groupId = c0130p.getGroupId();
                    if (groupId != i2) {
                        size2 = this.f24596k.size();
                        z3 = c0130p.getIcon() != null;
                        if (i3 != 0) {
                            size2++;
                            ArrayList<n> arrayList = this.f24596k;
                            int i5 = C4051p.this.f24582w;
                            arrayList.add(new g(i5, i5));
                        }
                    } else if (!z3 && c0130p.getIcon() != null) {
                        cdj(size2, this.f24596k.size());
                        z3 = true;
                    }
                    f7l8 f7l8Var = new f7l8(c0130p);
                    f7l8Var.f67650toq = z3;
                    this.f24596k.add(f7l8Var);
                    i2 = groupId;
                }
                i3++;
                z2 = true;
            }
            this.f24597n = false;
        }

        public C0130p fn3e() {
            return this.f24598q;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui x2 x2Var, int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    g gVar = (g) this.f24596k.get(i2);
                    x2Var.itemView.setPadding(C4051p.this.f24572m, gVar.toq(), C4051p.this.f24561b, gVar.m14580k());
                    return;
                }
                TextView textView = (TextView) x2Var.itemView;
                textView.setText(((f7l8) this.f24596k.get(i2)).m14579k().getTitle());
                int i3 = C4051p.this.f24567h;
                if (i3 != 0) {
                    androidx.core.widget.t8r.a9(textView, i3);
                }
                textView.setPadding(C4051p.this.f24560a, textView.getPaddingTop(), C4051p.this.f24583x, textView.getPaddingBottom());
                ColorStateList colorStateList = C4051p.this.f24568i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) x2Var.itemView;
            navigationMenuItemView.setIconTintList(C4051p.this.f24577r);
            int i4 = C4051p.this.f24585z;
            if (i4 != 0) {
                navigationMenuItemView.setTextAppearance(i4);
            }
            ColorStateList colorStateList2 = C4051p.this.f24579t;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = C4051p.this.f24571l;
            C0683f.wlev(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = C4051p.this.f24565f;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            f7l8 f7l8Var = (f7l8) this.f24596k.get(i2);
            navigationMenuItemView.setNeedsEmptyIcon(f7l8Var.f67650toq);
            C4051p c4051p = C4051p.this;
            int i5 = c4051p.f24562c;
            int i6 = c4051p.f24564e;
            navigationMenuItemView.setPadding(i5, i6, i5, i6);
            navigationMenuItemView.setIconPadding(C4051p.this.f24569j);
            C4051p c4051p2 = C4051p.this;
            if (c4051p2.f24580u) {
                navigationMenuItemView.setIconSize(c4051p2.f24574o);
            }
            navigationMenuItemView.setMaxLines(C4051p.this.f24581v);
            navigationMenuItemView.mo309g(f7l8Var.m14579k(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f24596k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemViewType(int i2) {
            n nVar = this.f24596k.get(i2);
            if (nVar instanceof g) {
                return 2;
            }
            if (nVar instanceof q) {
                return 3;
            }
            if (nVar instanceof f7l8) {
                return ((f7l8) nVar).m14579k().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void jk(boolean z2) {
            this.f24597n = z2;
        }

        @lvui
        public Bundle ki() {
            Bundle bundle = new Bundle();
            C0130p c0130p = this.f24598q;
            if (c0130p != null) {
                bundle.putInt(f24593y, c0130p.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f24596k.size();
            for (int i2 = 0; i2 < size; i2++) {
                n nVar = this.f24596k.get(i2);
                if (nVar instanceof f7l8) {
                    C0130p c0130pM14579k = ((f7l8) nVar).m14579k();
                    View actionView = c0130pM14579k != null ? c0130pM14579k.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(c0130pM14579k.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f24592s, sparseArray);
            return bundle;
        }

        public void mcp(@lvui C0130p c0130p) {
            if (this.f24598q == c0130p || !c0130p.isCheckable()) {
                return;
            }
            C0130p c0130p2 = this.f24598q;
            if (c0130p2 != null) {
                c0130p2.setChecked(false);
            }
            this.f24598q = c0130p;
            c0130p.setChecked(true);
        }

        int ni7() {
            int i2 = C4051p.this.f24576q.getChildCount() == 0 ? 0 : 1;
            for (int i3 = 0; i3 < C4051p.this.f24578s.getItemCount(); i3++) {
                if (C4051p.this.f24578s.getItemViewType(i3) == 0) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(x2 x2Var) {
            if (x2Var instanceof s) {
                ((NavigationMenuItemView) x2Var.itemView).a9();
            }
        }

        public void oc() {
            wvg();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: t */
        public void m14581t(@lvui Bundle bundle) {
            C0130p c0130pM14579k;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0130p c0130pM14579k2;
            int i2 = bundle.getInt(f24593y, 0);
            if (i2 != 0) {
                this.f24597n = true;
                int size = this.f24596k.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    n nVar = this.f24596k.get(i3);
                    if ((nVar instanceof f7l8) && (c0130pM14579k2 = ((f7l8) nVar).m14579k()) != null && c0130pM14579k2.getItemId() == i2) {
                        mcp(c0130pM14579k2);
                        break;
                    }
                    i3++;
                }
                this.f24597n = false;
                wvg();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f24592s);
            if (sparseParcelableArray != null) {
                int size2 = this.f24596k.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    n nVar2 = this.f24596k.get(i4);
                    if ((nVar2 instanceof f7l8) && (c0130pM14579k = ((f7l8) nVar2).m14579k()) != null && (actionView = c0130pM14579k.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(c0130pM14579k.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @dd
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public x2 onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                C4051p c4051p = C4051p.this;
                return new s(c4051p.f24575p, viewGroup, c4051p.bb);
            }
            if (i2 == 1) {
                return new ld6(C4051p.this.f24575p, viewGroup);
            }
            if (i2 == 2) {
                return new p(C4051p.this.f24575p, viewGroup);
            }
            if (i2 != 3) {
                return null;
            }
            return new toq(C4051p.this.f24576q);
        }
    }

    private void nn86() {
        int i2 = (this.f24576q.getChildCount() == 0 && this.f67649bo) ? this.f24563d : 0;
        NavigationMenuView navigationMenuView = this.f24570k;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void a9(@lvui View view) {
        this.f24576q.removeView(view);
        if (this.f24576q.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f24570k;
            navigationMenuView.setPadding(0, this.f24563d, 0, navigationMenuView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14570c(@dd ColorStateList colorStateList) {
        this.f24568i = colorStateList;
        mo355q(false);
    }

    @InterfaceC7833l
    public int cdj() {
        return this.f24572m;
    }

    public void d2ok(@dd RippleDrawable rippleDrawable) {
        this.f24565f = rippleDrawable;
        mo355q(false);
    }

    public void d3(@InterfaceC7833l int i2) {
        this.f24572m = i2;
        mo355q(false);
    }

    public void dd(@zy.cdj int i2) {
        if (this.f24574o != i2) {
            this.f24574o = i2;
            this.f24580u = true;
            mo355q(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14571e(boolean z2) {
        zy zyVar = this.f24578s;
        if (zyVar != null) {
            zyVar.jk(z2);
        }
    }

    public void eqxt(@dd Drawable drawable) {
        this.f24571l = drawable;
        mo355q(false);
    }

    /* JADX INFO: renamed from: f */
    public void m14572f(int i2) {
        this.f67648ab = i2;
        NavigationMenuView navigationMenuView = this.f24570k;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
        n7h.InterfaceC0129k interfaceC0129k = this.f24573n;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, z2);
        }
    }

    public int fn3e() {
        return this.f24562c;
    }

    public void fti(boolean z2) {
        if (this.f67649bo != z2) {
            this.f67649bo = z2;
            nn86();
        }
    }

    @dd
    public ColorStateList fu4() {
        return this.f24579t;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public int getId() {
        return this.f24584y;
    }

    public void gvn7(@InterfaceC7833l int i2) {
        this.f24561b = i2;
        mo355q(false);
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: h */
    public int m14573h() {
        return this.f24561b;
    }

    public void hyr(@InterfaceC7833l int i2) {
        this.f24564e = i2;
        mo355q(false);
    }

    @dd
    /* JADX INFO: renamed from: i */
    public Drawable m14574i() {
        return this.f24571l;
    }

    public boolean jk() {
        return this.f67649bo;
    }

    public void jp0y(@lvui C0130p c0130p) {
        this.f24578s.mcp(c0130p);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f24570k.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(an);
            if (bundle2 != null) {
                this.f24578s.m14581t(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(id);
            if (sparseParcelableArray2 != null) {
                this.f24576q.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public int ki() {
        return this.f24576q.getChildCount();
    }

    @dd
    public C0130p kja0() {
        return this.f24578s.fn3e();
    }

    /* JADX INFO: renamed from: l */
    public void m14575l(@hb int i2) {
        this.f24585z = i2;
        mo355q(false);
    }

    @Override // androidx.appcompat.view.menu.n7h
    public boolean ld6(androidx.appcompat.view.menu.f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    public void lrht(@InterfaceC7833l int i2) {
        this.f24583x = i2;
        mo355q(false);
    }

    public void lvui(int i2) {
        this.f24562c = i2;
        mo355q(false);
    }

    public View mcp(@gvn7 int i2) {
        View viewInflate = this.f24575p.inflate(i2, (ViewGroup) this.f24576q, false);
        qrj(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    public void n5r1(@dd ColorStateList colorStateList) {
        this.f24579t = colorStateList;
        mo355q(false);
    }

    public void n7h(@lvui tfm tfmVar) {
        int iKi = tfmVar.ki();
        if (this.f24563d != iKi) {
            this.f24563d = iKi;
            nn86();
        }
        NavigationMenuView navigationMenuView = this.f24570k;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, tfmVar.kja0());
        C0683f.m3162h(this.f24576q, tfmVar);
    }

    public void ncyb(int i2) {
        this.f24581v = i2;
        mo355q(false);
    }

    public int ni7() {
        return this.f24581v;
    }

    @InterfaceC7833l
    public int o1t() {
        return this.f24564e;
    }

    public void oc(int i2) {
        this.f24584y = i2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(androidx.appcompat.view.menu.t8r t8rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        zy zyVar = this.f24578s;
        if (zyVar != null) {
            zyVar.oc();
        }
    }

    public void qrj(@lvui View view) {
        this.f24576q.addView(view);
        NavigationMenuView navigationMenuView = this.f24570k;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* JADX INFO: renamed from: r */
    public void m14576r(int i2) {
        this.f24569j = i2;
        mo355q(false);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        this.f24573n = interfaceC0129k;
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: t */
    public int m14577t() {
        return this.f24560a;
    }

    public View t8r(int i2) {
        return this.f24576q.getChildAt(i2);
    }

    @Override // androidx.appcompat.view.menu.n7h
    public androidx.appcompat.view.menu.kja0 toq(ViewGroup viewGroup) {
        if (this.f24570k == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f24575p.inflate(C6095k.ld6.f79290dd, viewGroup, false);
            this.f24570k = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new y(this.f24570k));
            if (this.f24578s == null) {
                this.f24578s = new zy();
            }
            int i2 = this.f67648ab;
            if (i2 != -1) {
                this.f24570k.setOverScrollMode(i2);
            }
            this.f24576q = (LinearLayout) this.f24575p.inflate(C6095k.ld6.f79287d2ok, (ViewGroup) this.f24570k, false);
            this.f24570k.setAdapter(this.f24578s);
        }
        return this.f24570k;
    }

    public void uv6(@InterfaceC7833l int i2) {
        this.f24560a = i2;
        mo355q(false);
    }

    public void vyq(@hb int i2) {
        this.f24567h = i2;
        mo355q(false);
    }

    @InterfaceC7833l
    public int wvg() {
        return this.f24583x;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void x2(@lvui Context context, @lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
        this.f24575p = LayoutInflater.from(context);
        this.f24566g = f7l8Var;
        this.f24582w = context.getResources().getDimensionPixelOffset(C6095k.g.f78918ixz);
    }

    public void x9kr(@dd ColorStateList colorStateList) {
        this.f24577r = colorStateList;
        mo355q(false);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo367y(androidx.appcompat.view.menu.f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    @dd
    /* JADX INFO: renamed from: z */
    public ColorStateList m14578z() {
        return this.f24577r;
    }

    public int zurt() {
        return this.f24569j;
    }

    @Override // androidx.appcompat.view.menu.n7h
    @lvui
    public Parcelable zy() {
        Bundle bundle = new Bundle();
        if (this.f24570k != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f24570k.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        zy zyVar = this.f24578s;
        if (zyVar != null) {
            bundle.putBundle(an, zyVar.ki());
        }
        if (this.f24576q != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f24576q.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(id, sparseArray2);
        }
        return bundle;
    }
}
