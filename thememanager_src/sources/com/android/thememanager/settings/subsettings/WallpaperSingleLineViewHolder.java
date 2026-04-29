package com.android.thememanager.settings.subsettings;

import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.WallpaperMiuiTabActivity;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.view.ThemePreferenceView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mbx.C6812k;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
class WallpaperSingleLineViewHolder extends BaseThemeAdapter.ViewHolder<f7l8> implements View.OnClickListener, InterfaceC1357q, InterfaceC2616k {

    /* JADX INFO: renamed from: l */
    private static final GridLayoutManager.zy f15409l = new C2610q();

    /* JADX INFO: renamed from: g */
    private final TextView f15410g;

    /* JADX INFO: renamed from: h */
    private final RecyclerView f15411h;

    /* JADX INFO: renamed from: i */
    private final qrj f15412i;

    /* JADX INFO: renamed from: p */
    private final View f15413p;

    /* JADX INFO: renamed from: r */
    private p000a.zy f15414r;

    /* JADX INFO: renamed from: s */
    private final TextView f15415s;

    /* JADX INFO: renamed from: t */
    private final LinearLayout f15416t;

    /* JADX INFO: renamed from: y */
    private final TextView f15417y;

    /* JADX INFO: renamed from: z */
    private f7l8 f15418z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.WallpaperSingleLineViewHolder$k */
    class C2609k implements p000a.zy {
        C2609k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            C2687z.kja0();
            WallpaperSingleLineViewHolder.this.d2ok();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(WallpaperSingleLineViewHolder.this.fn3e(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.WallpaperSingleLineViewHolder$q */
    class C2610q extends GridLayoutManager.zy {
        C2610q() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int index) {
            return index == 0 ? 2 : 1;
        }
    }

    class toq extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f15421k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f15422n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f15423q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f60853toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f60854zy;

        toq(final boolean val$twoLine, final int val$dimen, final int val$edgeExtraStart, final int val$edgeExtraEnd, final boolean val$isRightLayout) {
            this.f15421k = val$twoLine;
            this.f60853toq = val$dimen;
            this.f60854zy = val$edgeExtraStart;
            this.f15423q = val$edgeExtraEnd;
            this.f15422n = val$isRightLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
            int childLayoutPosition = parent.getChildLayoutPosition(view);
            if (parent.getAdapter() == null) {
                return;
            }
            int itemCount = parent.getAdapter().getItemCount();
            int i2 = 0;
            boolean z2 = childLayoutPosition == 0;
            boolean z3 = childLayoutPosition == itemCount + (-1) || (this.f15421k && childLayoutPosition == itemCount + (-2) && childLayoutPosition % 2 == 1);
            boolean z5 = childLayoutPosition == 0 || childLayoutPosition % 2 != 0;
            boolean z6 = childLayoutPosition % 2 == 0;
            boolean z7 = this.f15421k;
            int i3 = (!z7 || z5) ? 0 : this.f60853toq / 2;
            if (z7 && !z6) {
                i2 = this.f60853toq / 2;
            }
            int i4 = z2 ? this.f60854zy + this.f60853toq : this.f60853toq / 2;
            int i5 = z3 ? this.f15423q + this.f60853toq : this.f60853toq / 2;
            boolean z8 = this.f15422n;
            int i6 = !z8 ? i4 : i5;
            if (!z8) {
                i4 = i5;
            }
            outRect.set(i6, i3, i4, i2);
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WallpaperSingleLineViewHolder.this.f15411h.scrollToPosition(0);
        }
    }

    WallpaperSingleLineViewHolder(View view, @zy.lvui WallpaperSubVAdapter parentAdapter, boolean isNightMode, float imageScalingFactor) {
        super(view, parentAdapter);
        this.f15414r = new C2609k();
        ThemePreferenceView themePreferenceView = (ThemePreferenceView) view.findViewById(R.id.preference_view);
        themePreferenceView.setSupportAnimation(false);
        this.f15410g = themePreferenceView.getTitleView();
        this.f15417y = themePreferenceView.getSummaryView();
        this.f15415s = themePreferenceView.getMoreInfoView();
        this.f15413p = themePreferenceView.getMoreArrow();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hRecyclerView);
        this.f15411h = recyclerView;
        recyclerView.setItemAnimator(null);
        this.f15412i = new qrj(parentAdapter.m6705z(), isNightMode, imageScalingFactor);
        this.f15416t = themePreferenceView;
    }

    private List<PageGroup> jk(String str) {
        int i2 = !"WALLPAPER".equals(this.f15418z.f15450g) ? 1 : 0;
        PageGroup pageGroup = new PageGroup();
        Page page = new Page();
        page.setFlag(i2 | 16);
        page.setKey(this.f15418z.f60865x2);
        pageGroup.addPage(page);
        pageGroup.setTitle(str);
        return Collections.singletonList(pageGroup);
    }

    private List<PageGroup> mcp() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {this.itemView.getResources().getString(R.string.wallpaper_static), this.itemView.getResources().getString(R.string.wallpaper_dynamic), this.itemView.getResources().getString(R.string.de_icon_text_favorite)};
        int[] iArr = {8, 9, 12};
        for (int i2 = 0; i2 < 3; i2++) {
            PageGroup pageGroup = new PageGroup();
            Page page = new Page();
            page.setFlag(iArr[i2] | 0);
            pageGroup.addPage(page);
            pageGroup.setTitle(strArr[i2]);
            arrayList.add(pageGroup);
        }
        return arrayList;
    }

    private List<PageGroup> oc() {
        boolean z2;
        f7l8 f7l8Var = this.f15418z;
        boolean z3 = true;
        if (f7l8Var.f60862f7l8) {
            z2 = true;
        } else {
            boolean zEquals = false;
            z2 = false;
            for (Resource resource : f7l8Var.f60866zy) {
                zEquals |= "wallpaper".equals(resource.getCategory());
                z2 |= resource.getCategory() != null && resource.getCategory().contains("video");
            }
            z3 = zEquals;
        }
        ArrayList arrayList = new ArrayList();
        if (z3) {
            PageGroup pageGroup = new PageGroup();
            Page page = new Page();
            page.setFlag(4);
            page.setKey(this.f15418z.f15454q);
            pageGroup.addPage(page);
            pageGroup.setTitle(this.itemView.getResources().getString(R.string.wallpaper_static));
            arrayList.add(pageGroup);
        }
        if (z2) {
            PageGroup pageGroup2 = new PageGroup();
            Page page2 = new Page();
            page2.setFlag(5);
            page2.setKey(this.f15418z.f15454q);
            pageGroup2.addPage(page2);
            pageGroup2.setTitle(this.itemView.getResources().getString(R.string.wallpaper_dynamic));
            arrayList.add(pageGroup2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    private List<PageGroup> m9163t() {
        boolean z2;
        f7l8 f7l8Var = this.f15418z;
        boolean z3 = true;
        if (f7l8Var.f60862f7l8) {
            z2 = true;
        } else {
            boolean zEquals = false;
            z2 = false;
            for (Resource resource : f7l8Var.f60866zy) {
                zEquals |= "wallpaper".equals(resource.getCategory());
                z2 |= resource.getCategory() != null && resource.getCategory().contains("video");
            }
            z3 = zEquals;
        }
        ArrayList arrayList = new ArrayList();
        if (z3) {
            PageGroup pageGroup = new PageGroup();
            Page page = new Page();
            page.setFlag(20);
            page.setKey(this.f15418z.f15454q);
            pageGroup.addPage(page);
            pageGroup.setTitle(this.itemView.getResources().getString(R.string.wallpaper_static));
            arrayList.add(pageGroup);
        }
        if (z2) {
            PageGroup pageGroup2 = new PageGroup();
            Page page2 = new Page();
            page2.setFlag(21);
            page2.setKey(this.f15418z.f15454q);
            pageGroup2.addPage(page2);
            pageGroup2.setTitle(this.itemView.getResources().getString(R.string.wallpaper_dynamic));
            arrayList.add(pageGroup2);
        }
        return arrayList;
    }

    public void d2ok() {
        f7l8 f7l8Var;
        ActivityC0891q activityC0891qKi = ki();
        if (this.f15413p.getVisibility() == 8 || (f7l8Var = this.f15418z) == null || activityC0891qKi == null) {
            return;
        }
        String str = f7l8Var.f15454q;
        Intent intentM24743n = C1807g.m7081r() ? C6812k.m24743n(activityC0891qKi) : new Intent(activityC0891qKi, (Class<?>) WallpaperMiuiTabActivity.class);
        if (intentM24743n == null) {
            Log.e("WallpaperSingleLineViewHolder", "onBtnMoreClick: intent is null!");
            return;
        }
        int i2 = this.f15418z.f15451k;
        List<PageGroup> listMcp = i2 == 1 ? mcp() : i2 == 8 ? m9163t() : i2 == 2 ? oc() : jk(str);
        intentM24743n.putExtra(com.android.thememanager.f7l8.f58072zy, activityC0891qKi.getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false));
        intentM24743n.putExtra(com.android.thememanager.f7l8.f11607n, activityC0891qKi.getIntent().getIntExtra(com.android.thememanager.f7l8.f11607n, -1));
        intentM24743n.putExtra("moreData", true);
        intentM24743n.putExtra(InterfaceC1357q.f53943tfm, false);
        intentM24743n.putExtra(InterfaceC1357q.f53866eqxt, str);
        intentM24743n.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) listMcp);
        intentM24743n.putExtra(InterfaceC1357q.f53949uv6, 10);
        intentM24743n.putExtra("category_type", this.f15418z.f15451k);
        activityC0891qKi.startActivityForResult(intentM24743n, 113);
        if (activityC0891qKi instanceof AbstractActivityC1717k) {
            String strYz = ((AbstractActivityC1717k) activityC0891qKi).yz();
            com.android.thememanager.basemodule.analysis.kja0.f7l8(strYz, com.android.thememanager.basemodule.analysis.toq.pf98 + this.f15418z.zy(), "");
            C1708s.f7l8().ld6().ni7(C1706p.kja0(strYz, com.android.thememanager.basemodule.analysis.toq.pf98 + this.f15418z.zy(), ""));
        }
    }

    void dd(@zy.lvui f7l8 data) {
        if (data.f15451k != this.f15418z.f15451k) {
            lvui(data);
        } else {
            this.f15412i.m9182z(data);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void lvui(f7l8 f7l8Var) {
        RecyclerView.AbstractC1048h linearLayoutManager;
        int iM9779k;
        int i2;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelOffset;
        int i3;
        if (f7l8Var == null) {
            return;
        }
        this.f15418z = f7l8Var;
        this.f15410g.setText(f7l8Var.f15454q);
        if (TextUtils.isEmpty(f7l8Var.f15452n)) {
            this.f15417y.setVisibility(8);
        } else {
            this.f15417y.setText(f7l8Var.f15452n);
            this.f15417y.setVisibility(0);
        }
        boolean z2 = true;
        boolean z3 = f7l8Var.f60864toq == 11;
        boolean z5 = f7l8Var.f15451k == 1;
        this.f15415s.setText(String.valueOf((z5 || (i3 = f7l8Var.f15456y) <= 0) ? "" : Integer.valueOf(i3)));
        if (8 != f7l8Var.f15451k) {
            if (f7l8Var.f15453p || z3 || (!z5 && f7l8Var.f15456y <= 6)) {
                z2 = false;
            }
            this.f15413p.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f15416t.setOnClickListener(this);
            } else {
                this.f15416t.setClickable(false);
            }
        } else {
            this.f15413p.setVisibility(8);
        }
        this.f15412i.m9182z(f7l8Var);
        if (z3) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.itemView.getContext(), 2, 0, false);
            gridLayoutManager.fn3e(f15409l);
            linearLayoutManager = gridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(this.itemView.getContext(), 0, false);
        }
        int dimensionPixelSize3 = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_my_card_space);
        boolean zX9kr = C1819o.x9kr();
        if (C1807g.m7081r()) {
            boolean zNcyb = C1819o.ncyb(fn3e());
            if (C6812k.m24741g(ki()) && zNcyb) {
                dimensionPixelSize2 = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_my_card_space_padding_dialog_land);
                dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_title_layout_margin_dialog_land);
                dimensionPixelOffset = dimensionPixelSize2;
            } else {
                dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_title_layout_margin_start);
                dimensionPixelSize2 = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wallpaper_my_card_space_padding_start);
                dimensionPixelOffset = this.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.wallpaper_my_card_space_padding_end);
            }
            LinearLayout linearLayout = this.f15416t;
            if ((linearLayout instanceof ThemePreferenceView) && zNcyb) {
                ((ThemePreferenceView) linearLayout).setPaddingHorzintal(dimensionPixelSize, linearLayout.getPaddingEnd());
            }
            iM9779k = dimensionPixelSize2;
            i2 = dimensionPixelOffset;
        } else {
            iM9779k = gc3c.m9779k(2.0f);
            i2 = iM9779k;
        }
        toq toqVar = new toq(z3, dimensionPixelSize3, iM9779k, i2, zX9kr);
        while (this.f15411h.getItemDecorationCount() > 0) {
            this.f15411h.removeItemDecorationAt(0);
        }
        this.f15411h.addItemDecoration(toqVar);
        this.f15411h.setLayoutManager(linearLayoutManager);
        this.f15411h.setAdapter(this.f15412i);
        this.f15411h.post(new zy());
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        if (this.f15418z == null || this.f15413p.getVisibility() != 0) {
            return;
        }
        m6706z().n5r1(com.android.thememanager.basemodule.analysis.toq.pf98 + this.f15418z.zy());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (this.f15418z.f15451k != 1) {
            d2ok();
        } else {
            if (lvui.qrj((AbstractActivityC1717k) ki(), this.f15414r)) {
                return;
            }
            d2ok();
        }
    }

    /* JADX INFO: renamed from: r */
    void m9164r(@zy.lvui f7l8 data) {
        if (data.f15451k == 2) {
            this.f15412i.o1t();
        }
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        if (this.f15418z == null || this.f15413p.getVisibility() != 0) {
            return;
        }
        m6706z().ncyb(com.android.thememanager.basemodule.analysis.toq.pf98 + this.f15418z.zy());
    }
}
