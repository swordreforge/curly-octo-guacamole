package com.android.thememanager.controller.online;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.controller.online.qrj;
import com.android.thememanager.model.AdListener;
import com.android.thememanager.model.PageItem;
import com.android.thememanager.view.ResourceScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PageItemViewController.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f57973f7l8;

    /* JADX INFO: renamed from: g */
    private int f11035g;

    /* JADX INFO: renamed from: k */
    private Activity f11036k;

    /* JADX INFO: renamed from: p */
    private ResourceScrollView f11038p;

    /* JADX INFO: renamed from: s */
    private int f11040s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private com.android.thememanager.fu4 f57974toq;

    /* JADX INFO: renamed from: y */
    private int f11041y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ViewStub f57975zy;

    /* JADX INFO: renamed from: n */
    private List<View> f11037n = new ArrayList();

    /* JADX INFO: renamed from: q */
    private ViewGroup f11039q = null;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.x2$k */
    /* JADX INFO: compiled from: PageItemViewController.java */
    static /* synthetic */ class C1943k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f11042k;

        static {
            int[] iArr = new int[qrj.EnumC1929n.values().length];
            f11042k = iArr;
            try {
                iArr[qrj.EnumC1929n.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11042k[qrj.EnumC1929n.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11042k[qrj.EnumC1929n.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11042k[qrj.EnumC1929n.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public x2(Activity activity, ViewStub containerStub, ResourceScrollView resScrollView) {
        this.f11036k = activity;
        this.f57975zy = containerStub;
        this.f11038p = resScrollView;
    }

    private void f7l8(ViewGroup container, List<View> viewPool) {
        Iterator<View> it = viewPool.iterator();
        while (it.hasNext()) {
            container.removeView(it.next());
        }
        viewPool.clear();
    }

    /* JADX INFO: renamed from: k */
    private void m7641k(List<PageItem> pageItems, ViewGroup container, List<View> viewPool, qrj.InterfaceC1927g pageItemCallback) {
        qrj qrjVar = new qrj(this.f11036k, this.f57974toq);
        qrjVar.n7h(pageItemCallback);
        viewPool.clear();
        for (qrj.f7l8 f7l8Var : qrjVar.x2(pageItems)) {
            int i2 = f7l8Var.f10982k == qrj.EnumC1929n.NONE ? 0 : this.f11035g;
            f7l8Var.f57960zy.setPaddingRelative(i2, m7643q(f7l8Var.f57959toq), i2, 0);
            View view = f7l8Var.f57960zy;
            if (view instanceof AdListener) {
                this.f11038p.m10294k(view);
            }
            container.addView(f7l8Var.f57960zy, new LinearLayout.LayoutParams(-1, -2));
            viewPool.add(f7l8Var.f57960zy);
        }
    }

    private void kja0() {
        ViewGroup viewGroup = this.f11039q;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            return;
        }
        ViewStub viewStub = this.f57975zy;
        if (viewStub != null) {
            this.f11039q = (ViewGroup) viewStub.inflate();
            this.f57975zy = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m7642n() {
        ViewGroup viewGroup = this.f11039q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void n7h(List<PageItem> pageItems) {
        TextView textView = (TextView) this.f11039q.findViewById(R.id.title);
        if (textView == null || pageItems == null || pageItems.isEmpty()) {
            return;
        }
        String name = pageItems.get(0).getName();
        if (!TextUtils.isEmpty(name)) {
            textView.setText(name);
        } else {
            textView.setVisibility(8);
            this.f11039q.findViewById(com.android.thememanager.R.id.divider).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q */
    private int m7643q(qrj.EnumC1929n paddingType) {
        int i2 = C1943k.f11042k[paddingType.ordinal()];
        if (i2 == 1) {
            return this.f57973f7l8;
        }
        if (i2 == 2) {
            return this.f11041y;
        }
        if (i2 != 3) {
            return 0;
        }
        return this.f11040s;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7644g() {
        ViewGroup viewGroup = this.f11039q;
        if (viewGroup == null) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (this.f11039q.getChildAt(i2).getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    public void ld6(List<PageItem> pageItems) {
        x2(pageItems, null);
    }

    /* JADX INFO: renamed from: p */
    public void m7645p(int horizontalPadding, int verticalPadding, int largeVerticalPadding, int firstVerticalPadding) {
        this.f11035g = horizontalPadding;
        this.f57973f7l8 = verticalPadding;
        this.f11040s = largeVerticalPadding;
        this.f11041y = firstVerticalPadding;
    }

    public void qrj(com.android.thememanager.fu4 resContext) {
        this.f57974toq = resContext;
    }

    /* JADX INFO: renamed from: s */
    public void m7646s(int left, int top, int right, int bottom) {
        ViewGroup viewGroup = this.f11039q;
        if (viewGroup != null) {
            viewGroup.setPaddingRelative(left, top, right, bottom);
        }
    }

    public void toq() {
        ViewGroup viewGroup = this.f11039q;
        if (viewGroup != null) {
            f7l8(viewGroup, this.f11037n);
        }
    }

    public void x2(List<PageItem> pageItems, qrj.InterfaceC1927g pageItemCallback) {
        toq();
        if (pageItems == null) {
            m7642n();
            return;
        }
        kja0();
        m7641k(pageItems, this.f11039q, this.f11037n, pageItemCallback);
        n7h(pageItems);
    }

    /* JADX INFO: renamed from: y */
    public void m7647y(String tagId, View adView) {
        kja0();
        if (this.f11039q != null) {
            for (int i2 = 0; i2 < this.f11039q.getChildCount(); i2++) {
                if (tagId.equals(this.f11039q.getChildAt(i2).getTag())) {
                    this.f11039q.removeViewAt(i2);
                    this.f11039q.addView(adView, i2);
                }
            }
        }
    }

    public ViewStub zy() {
        return this.f57975zy;
    }
}
