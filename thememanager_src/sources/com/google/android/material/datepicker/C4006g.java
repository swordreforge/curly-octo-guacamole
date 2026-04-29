package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0639p;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.wvg;
import com.google.android.material.button.MaterialButton;
import ij.C6095k;
import java.util.Calendar;
import java.util.Iterator;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C4006g<S> extends n7h<S> {

    /* JADX INFO: renamed from: c */
    private static final String f24302c = "CURRENT_MONTH_KEY";

    /* JADX INFO: renamed from: e */
    private static final int f24303e = 3;

    /* JADX INFO: renamed from: f */
    private static final String f24304f = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: l */
    private static final String f24306l = "GRID_SELECTOR_KEY";

    /* JADX INFO: renamed from: r */
    private static final String f24309r = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: g */
    @dd
    private CalendarConstraints f24310g;

    /* JADX INFO: renamed from: h */
    private RecyclerView f24311h;

    /* JADX INFO: renamed from: i */
    private RecyclerView f24312i;

    /* JADX INFO: renamed from: n */
    @dd
    private DateSelector<S> f24313n;

    /* JADX INFO: renamed from: p */
    private com.google.android.material.datepicker.toq f24314p;

    /* JADX INFO: renamed from: q */
    @hb
    private int f24315q;

    /* JADX INFO: renamed from: s */
    private ld6 f24316s;

    /* JADX INFO: renamed from: t */
    private View f24317t;

    /* JADX INFO: renamed from: y */
    @dd
    private Month f24318y;

    /* JADX INFO: renamed from: z */
    private View f24319z;

    /* JADX INFO: renamed from: j */
    @yz
    static final Object f24305j = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: o */
    @yz
    static final Object f24308o = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: m */
    @yz
    static final Object f24307m = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: b */
    @yz
    static final Object f24301b = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$f7l8 */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class f7l8 extends RecyclerView.fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.android.material.datepicker.x2 f24320k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ MaterialButton f67561toq;

        f7l8(com.google.android.material.datepicker.x2 x2Var, MaterialButton materialButton) {
            this.f24320k = x2Var;
            this.f67561toq = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@lvui RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                recyclerView.announceForAccessibility(this.f67561toq.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@lvui RecyclerView recyclerView, int i2, int i3) {
            int iFindFirstVisibleItemPosition = i2 < 0 ? C4006g.this.rp().findFirstVisibleItemPosition() : C4006g.this.rp().findLastVisibleItemPosition();
            C4006g.this.f24318y = this.f24320k.ki(iFindFirstVisibleItemPosition);
            this.f67561toq.setText(this.f24320k.fn3e(iFindFirstVisibleItemPosition));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$g */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class g extends C0701k {
        g() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.bek6(C4006g.this.f24317t.getVisibility() == 0 ? C4006g.this.getString(C6095k.qrj.f79819jz5) : C4006g.this.getString(C6095k.qrj.f79786bz2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$k */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f24322k;

        k(int i2) {
            this.f24322k = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4006g.this.f24312i.smoothScrollToPosition(this.f24322k);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$ld6 */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    enum ld6 {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$n */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class n extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private final Calendar f24325k = cdj.zurt();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Calendar f67563toq = cdj.zurt();

        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        public void f7l8(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if ((recyclerView.getAdapter() instanceof ki) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                ki kiVar = (ki) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0639p<Long, Long> c0639p : C4006g.this.f24313n.getSelectedRanges()) {
                    Long l2 = c0639p.f3889k;
                    if (l2 != null && c0639p.f50633toq != null) {
                        this.f24325k.setTimeInMillis(l2.longValue());
                        this.f67563toq.setTimeInMillis(c0639p.f50633toq.longValue());
                        int iFn3e = kiVar.fn3e(this.f24325k.get(1));
                        int iFn3e2 = kiVar.fn3e(this.f67563toq.get(1));
                        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFn3e);
                        View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iFn3e2);
                        int iLd6 = iFn3e / gridLayoutManager.ld6();
                        int iLd62 = iFn3e2 / gridLayoutManager.ld6();
                        int i2 = iLd6;
                        while (i2 <= iLd62) {
                            if (gridLayoutManager.findViewByPosition(gridLayoutManager.ld6() * i2) != null) {
                                canvas.drawRect(i2 == iLd6 ? viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2) : 0, r9.getTop() + C4006g.this.f24314p.f24369q.m14423n(), i2 == iLd62 ? viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - C4006g.this.f24314p.f24369q.toq(), C4006g.this.f24314p.f24370y);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$p */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class p implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.android.material.datepicker.x2 f24326k;

        p(com.google.android.material.datepicker.x2 x2Var) {
            this.f24326k = x2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = C4006g.this.rp().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                C4006g.this.r6ty(this.f24326k.ki(iFindLastVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$q */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class q implements x2 {
        q() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.C4006g.x2
        /* JADX INFO: renamed from: k */
        public void mo14417k(long j2) {
            if (C4006g.this.f24310g.getDateValidator().mo14365s(j2)) {
                C4006g.this.f24313n.fn3e(j2);
                Iterator<qrj<S>> it = C4006g.this.f24354k.iterator();
                while (it.hasNext()) {
                    it.next().toq(C4006g.this.f24313n.getSelection());
                }
                C4006g.this.f24312i.getAdapter().notifyDataSetChanged();
                if (C4006g.this.f24311h != null) {
                    C4006g.this.f24311h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$s */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class s implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.android.material.datepicker.x2 f24329k;

        s(com.google.android.material.datepicker.x2 x2Var) {
            this.f24329k = x2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = C4006g.this.rp().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < C4006g.this.f24312i.getAdapter().getItemCount()) {
                C4006g.this.r6ty(this.f24329k.ki(iFindFirstVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$toq */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class toq extends C0701k {
        toq() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.w831(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$x2 */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    interface x2 {
        /* JADX INFO: renamed from: k */
        void mo14417k(long j2);
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$y */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4006g.this.zff0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$zy */
    /* JADX INFO: compiled from: MaterialCalendar.java */
    class zy extends kja0 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f67565toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(Context context, int i2, boolean z2, int i3) {
            super(context, i2, z2);
            this.f67565toq = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(@lvui RecyclerView.mcp mcpVar, @lvui int[] iArr) {
            if (this.f67565toq == 0) {
                iArr[0] = C4006g.this.f24312i.getWidth();
                iArr[1] = C4006g.this.f24312i.getWidth();
            } else {
                iArr[0] = C4006g.this.f24312i.getHeight();
                iArr[1] = C4006g.this.f24312i.getHeight();
            }
        }
    }

    private void cyoe(int i2) {
        this.f24312i.post(new k(i2));
    }

    @lvui
    private RecyclerView.kja0 kiv() {
        return new n();
    }

    @lvui
    public static <T> C4006g<T> l05(@lvui DateSelector<T> dateSelector, @hb int i2, @lvui CalendarConstraints calendarConstraints) {
        C4006g<T> c4006g = new C4006g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f24309r, i2);
        bundle.putParcelable(f24306l, dateSelector);
        bundle.putParcelable(f24304f, calendarConstraints);
        bundle.putParcelable(f24302c, calendarConstraints.ld6());
        c4006g.setArguments(bundle);
        return c4006g;
    }

    @InterfaceC7833l
    static int o5(@lvui Context context) {
        return context.getResources().getDimensionPixelSize(C6095k.g.vf);
    }

    private void uf(@lvui View view, @lvui com.google.android.material.datepicker.x2 x2Var) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C6095k.y.f79971f3f);
        materialButton.setTag(f24301b);
        C0683f.zwy(materialButton, new g());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C6095k.y.f80048nyj);
        materialButton2.setTag(f24308o);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C6095k.y.f79995i3x9);
        materialButton3.setTag(f24307m);
        this.f24319z = view.findViewById(C6095k.y.f80127zuf);
        this.f24317t = view.findViewById(C6095k.y.f80013kt06);
        yp31(ld6.DAY);
        materialButton.setText(this.f24318y.zurt());
        this.f24312i.addOnScrollListener(new f7l8(x2Var, materialButton));
        materialButton.setOnClickListener(new y());
        materialButton3.setOnClickListener(new s(x2Var));
        materialButton2.setOnClickListener(new p(x2Var));
    }

    private static int yw(@lvui Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C6095k.g.fai) + resources.getDimensionPixelOffset(C6095k.g.ym8) + resources.getDimensionPixelOffset(C6095k.g.crha);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C6095k.g.gl8t);
        int i2 = com.google.android.material.datepicker.ld6.f24343s;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C6095k.g.vf) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(C6095k.g.f1)) + resources.getDimensionPixelOffset(C6095k.g.g8);
    }

    com.google.android.material.datepicker.toq bih() {
        return this.f24314p;
    }

    @dd
    Month ec() {
        return this.f24318y;
    }

    @Override // com.google.android.material.datepicker.n7h
    @dd
    public DateSelector<S> ix() {
        return this.f24313n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24315q = bundle.getInt(f24309r);
        this.f24313n = (DateSelector) bundle.getParcelable(f24306l);
        this.f24310g = (CalendarConstraints) bundle.getParcelable(f24304f);
        this.f24318y = (Month) bundle.getParcelable(f24302c);
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f24315q);
        this.f24314p = new com.google.android.material.datepicker.toq(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthX2 = this.f24310g.x2();
        if (com.google.android.material.datepicker.f7l8.mi1u(contextThemeWrapper)) {
            i2 = C6095k.ld6.f79356xwq3;
            i3 = 1;
        } else {
            i2 = C6095k.ld6.f79279bo;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(yw(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C6095k.y.f79954d1ts);
        C0683f.zwy(gridView, new toq());
        gridView.setAdapter((ListAdapter) new C4011n());
        gridView.setNumColumns(monthX2.f24274n);
        gridView.setEnabled(false);
        this.f24312i = (RecyclerView) viewInflate.findViewById(C6095k.y.f80030m8);
        this.f24312i.setLayoutManager(new zy(getContext(), i3, false, i3));
        this.f24312i.setTag(f24305j);
        com.google.android.material.datepicker.x2 x2Var = new com.google.android.material.datepicker.x2(contextThemeWrapper, this.f24313n, this.f24310g, new q());
        this.f24312i.setAdapter(x2Var);
        int integer = contextThemeWrapper.getResources().getInteger(C6095k.s.f35712l);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C6095k.y.f80127zuf);
        this.f24311h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f24311h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f24311h.setAdapter(new ki(this));
            this.f24311h.addItemDecoration(kiv());
        }
        if (viewInflate.findViewById(C6095k.y.f79971f3f) != null) {
            uf(viewInflate, x2Var);
        }
        if (!com.google.android.material.datepicker.f7l8.mi1u(contextThemeWrapper)) {
            new wvg().attachToRecyclerView(this.f24312i);
        }
        this.f24312i.scrollToPosition(x2Var.ni7(this.f24318y));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f24309r, this.f24315q);
        bundle.putParcelable(f24306l, this.f24313n);
        bundle.putParcelable(f24304f, this.f24310g);
        bundle.putParcelable(f24302c, this.f24318y);
    }

    @Override // com.google.android.material.datepicker.n7h
    public boolean r25n(@lvui qrj<S> qrjVar) {
        return super.r25n(qrjVar);
    }

    void r6ty(Month month) {
        com.google.android.material.datepicker.x2 x2Var = (com.google.android.material.datepicker.x2) this.f24312i.getAdapter();
        int iNi7 = x2Var.ni7(month);
        int iNi72 = iNi7 - x2Var.ni7(this.f24318y);
        boolean z2 = Math.abs(iNi72) > 3;
        boolean z3 = iNi72 > 0;
        this.f24318y = month;
        if (z2 && z3) {
            this.f24312i.scrollToPosition(iNi7 - 3);
            cyoe(iNi7);
        } else if (!z2) {
            cyoe(iNi7);
        } else {
            this.f24312i.scrollToPosition(iNi7 + 3);
            cyoe(iNi7);
        }
    }

    @lvui
    LinearLayoutManager rp() {
        return (LinearLayoutManager) this.f24312i.getLayoutManager();
    }

    void yp31(ld6 ld6Var) {
        this.f24316s = ld6Var;
        if (ld6Var == ld6.YEAR) {
            this.f24311h.getLayoutManager().scrollToPosition(((ki) this.f24311h.getAdapter()).fn3e(this.f24318y.f24275q));
            this.f24319z.setVisibility(0);
            this.f24317t.setVisibility(8);
        } else if (ld6Var == ld6.DAY) {
            this.f24319z.setVisibility(8);
            this.f24317t.setVisibility(0);
            r6ty(this.f24318y);
        }
    }

    @dd
    CalendarConstraints z4t() {
        return this.f24310g;
    }

    void zff0() {
        ld6 ld6Var = this.f24316s;
        ld6 ld6Var2 = ld6.YEAR;
        if (ld6Var == ld6Var2) {
            yp31(ld6.DAY);
        } else if (ld6Var == ld6.DAY) {
            yp31(ld6Var2);
        }
    }
}
