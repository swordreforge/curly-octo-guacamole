package miuix.preference;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.nmn5;
import androidx.preference.C1016i;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.FolmeBlink;
import miuix.animation.internal.BlinkStateObserver;
import miuix.appcompat.app.AlphaBlendingDrawable;
import miuix.internal.graphics.drawable.C7157g;
import miuix.internal.util.C7164n;
import miuix.preference.kja0;
import miuix.view.C7380g;
import tjz5.C7675k;
import zy.lvui;

/* JADX INFO: compiled from: PreferenceGroupAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
class n7h extends androidx.preference.n7h implements BlinkStateObserver {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int[] f89995ab;
    static final int an = 4;
    private static final int[] as;
    private static final int[] az;
    private static final int[] ba;
    static final int bb = 1;
    private static final int[] bg;
    private static final int[] bl;
    static final int bp = 2;
    static final int bv = 3;
    static final String id = "CardView";
    private static final int[] in;

    /* JADX INFO: renamed from: a */
    private RecyclerView.InterfaceC1049i f41461a;

    /* JADX INFO: renamed from: b */
    private View.OnTouchListener f41462b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f89996bo;

    /* JADX INFO: renamed from: c */
    private FolmeBlink f41463c;

    /* JADX INFO: renamed from: d */
    private int f41464d;

    /* JADX INFO: renamed from: e */
    private int f41465e;

    /* JADX INFO: renamed from: f */
    private RecyclerView f41466f;

    /* JADX INFO: renamed from: h */
    private final RecyclerView.AbstractC1053p f41467h;

    /* JADX INFO: renamed from: i */
    private int f41468i;

    /* JADX INFO: renamed from: j */
    private int f41469j;

    /* JADX INFO: renamed from: l */
    private int f41470l;

    /* JADX INFO: renamed from: m */
    private boolean f41471m;

    /* JADX INFO: renamed from: o */
    private View f41472o;

    /* JADX INFO: renamed from: p */
    private C7302n[] f41473p;

    /* JADX INFO: renamed from: r */
    private int f41474r;

    /* JADX INFO: renamed from: t */
    private int f41475t;

    /* JADX INFO: renamed from: u */
    private int f41476u;

    /* JADX INFO: renamed from: v */
    private int f41477v;

    /* JADX INFO: renamed from: w */
    private int f41478w;

    /* JADX INFO: renamed from: x */
    private Paint f41479x;

    /* JADX INFO: renamed from: z */
    private int f41480z;

    /* JADX INFO: renamed from: miuix.preference.n7h$k */
    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class C7301k extends RecyclerView.AbstractC1053p {
        C7301k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            super.onChanged();
            n7h n7hVar = n7h.this;
            n7hVar.f41473p = new C7302n[n7hVar.getItemCount()];
        }
    }

    /* JADX INFO: renamed from: miuix.preference.n7h$n */
    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class C7302n {

        /* JADX INFO: renamed from: k */
        int[] f41482k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f89997toq;

        C7302n() {
        }
    }

    /* JADX INFO: renamed from: miuix.preference.n7h$q */
    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class C7303q extends RecyclerView.fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f41483k;

        C7303q(int i2) {
            this.f41483k = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@lvui RecyclerView recyclerView, int i2) {
            super.onScrollStateChanged(recyclerView, i2);
            if (i2 == 0) {
                n7h.this.f41469j = this.f41483k;
                n7h n7hVar = n7h.this;
                n7hVar.notifyItemChanged(n7hVar.f41469j);
                recyclerView.removeOnScrollListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class toq implements View.OnTouchListener {

        /* JADX INFO: renamed from: miuix.preference.n7h$toq$k */
        /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
        class RunnableC7304k implements Runnable {
            RunnableC7304k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n7h.this.m26486a();
            }
        }

        toq() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || n7h.this.f41472o == null || n7h.this.f41471m) {
                return false;
            }
            n7h.this.f41471m = true;
            view.post(new RunnableC7304k());
            return true;
        }
    }

    /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
    class zy implements RecyclerView.InterfaceC1049i {

        /* JADX INFO: renamed from: miuix.preference.n7h$zy$k */
        /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
        class RunnableC7305k implements Runnable {
            RunnableC7305k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n7h.this.m26486a();
            }
        }

        /* JADX INFO: compiled from: PreferenceGroupAdapter.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n7h.this.m26486a();
            }
        }

        zy() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        /* JADX INFO: renamed from: k */
        public void mo4812k(@lvui RecyclerView recyclerView, @lvui MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || n7h.this.f41472o == null || n7h.this.f41471m) {
                return;
            }
            n7h.this.f41471m = true;
            recyclerView.post(new toq());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public boolean toq(@lvui RecyclerView recyclerView, @lvui MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 2 && action != 3) || n7h.this.f41472o == null || n7h.this.f41471m) {
                return false;
            }
            n7h.this.f41471m = true;
            recyclerView.post(new RunnableC7305k());
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public void zy(boolean z2) {
        }
    }

    static {
        int i2 = kja0.C7297q.lt;
        int i3 = kja0.C7297q.fd;
        int[] iArr = {R.attr.state_single, R.attr.state_first, R.attr.state_middle, R.attr.state_last, i2, i3};
        f89995ab = iArr;
        Arrays.sort(iArr);
        in = new int[]{R.attr.state_single};
        bl = new int[]{R.attr.state_first};
        as = new int[]{R.attr.state_middle};
        bg = new int[]{R.attr.state_last};
        az = new int[]{i2};
        ba = new int[]{i3};
    }

    public n7h(PreferenceGroup preferenceGroup) {
        super(preferenceGroup);
        this.f41467h = new C7301k();
        this.f41480z = 0;
        this.f41465e = 0;
        this.f41469j = -1;
        this.f41472o = null;
        this.f41471m = false;
        this.f41462b = null;
        this.f41461a = null;
        this.f41473p = new C7302n[getItemCount()];
        nn86(preferenceGroup.x2());
    }

    private void a98o(View view) {
        view.setTag(kja0.C7296p.lg4k, Boolean.TRUE);
        if (this.f41463c == null) {
            this.f41463c = (FolmeBlink) Folme.useAt(view).blink();
        }
        this.f41463c.attach(this);
        this.f41463c.startBlink(3, new AnimConfig[0]);
        this.f41472o = view;
    }

    /* JADX INFO: renamed from: c */
    private List<Preference> m26479c(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < preferenceGroup.uc(); i2++) {
            Preference preferenceYl = preferenceGroup.yl(i2);
            if (preferenceYl.lrht()) {
                arrayList.add(preferenceYl);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m26480e(androidx.preference.Preference r8, int r9) {
        /*
            r7 = this;
            if (r9 < 0) goto L19
            miuix.preference.n7h$n[] r0 = r7.f41473p
            int r1 = r0.length
            if (r9 >= r1) goto L19
            r1 = r0[r9]
            if (r1 != 0) goto L12
            miuix.preference.n7h$n r1 = new miuix.preference.n7h$n
            r1.<init>()
            r0[r9] = r1
        L12:
            miuix.preference.n7h$n[] r0 = r7.f41473p
            r0 = r0[r9]
            int[] r0 = r0.f41482k
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto Lc4
            androidx.preference.PreferenceGroup r0 = r8.o1t()
            if (r0 == 0) goto Lc4
            java.util.List r0 = r7.m26479c(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            return
        L2d:
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L39
            int[] r0 = miuix.preference.n7h.in
            r1 = r2
            goto L61
        L39:
            java.lang.Object r1 = r0.get(r3)
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            int r1 = r8.compareTo(r1)
            if (r1 != 0) goto L49
            int[] r0 = miuix.preference.n7h.bl
            r1 = 2
            goto L61
        L49:
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            int r0 = r8.compareTo(r0)
            if (r0 != 0) goto L5e
            int[] r0 = miuix.preference.n7h.bg
            r1 = 4
            goto L61
        L5e:
            int[] r0 = miuix.preference.n7h.as
            r1 = 3
        L61:
            boolean r4 = r8 instanceof androidx.preference.PreferenceCategory
            if (r4 == 0) goto Lbc
            androidx.preference.PreferenceCategory r8 = (androidx.preference.PreferenceCategory) r8
            boolean r4 = r8 instanceof miuix.preference.PreferenceCategory
            if (r4 == 0) goto L7b
            miuix.preference.PreferenceCategory r8 = (miuix.preference.PreferenceCategory) r8
            boolean r4 = r8.bap7()
            r4 = r4 ^ r2
            boolean r8 = r8.lh()
            if (r8 != 0) goto L79
            goto L84
        L79:
            r2 = r3
            goto L84
        L7b:
            java.lang.CharSequence r8 = r8.lvui()
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r4 = r3
        L84:
            if (r4 != 0) goto L88
            if (r2 == 0) goto Lbc
        L88:
            if (r4 == 0) goto L94
            int[] r8 = miuix.preference.n7h.ba
            int r4 = r8.length
            int[] r4 = new int[r4]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r3, r4, r3, r5)
            goto L96
        L94:
            int[] r4 = new int[r3]
        L96:
            if (r2 == 0) goto La2
            int[] r8 = miuix.preference.n7h.az
            int r2 = r8.length
            int[] r2 = new int[r2]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r3, r2, r3, r5)
            goto La4
        La2:
            int[] r2 = new int[r3]
        La4:
            int r8 = r4.length
            int r5 = r2.length
            int r8 = r8 + r5
            int r5 = r0.length
            int r8 = r8 + r5
            int[] r8 = new int[r8]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r3, r8, r3, r5)
            int r5 = r4.length
            int r6 = r2.length
            java.lang.System.arraycopy(r2, r3, r8, r5, r6)
            int r4 = r4.length
            int r2 = r2.length
            int r4 = r4 + r2
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r8, r4, r2)
            r0 = r8
        Lbc:
            miuix.preference.n7h$n[] r8 = r7.f41473p
            r8 = r8[r9]
            r8.f41482k = r0
            r8.f89997toq = r1
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.preference.n7h.m26480e(androidx.preference.Preference, int):void");
    }

    /* JADX INFO: renamed from: f */
    private void m26481f(List<View> list) {
        int i2 = 0;
        while (i2 < list.size()) {
            boolean z2 = true;
            boolean z3 = i2 == 0;
            if (i2 != list.size() - 1) {
                z2 = false;
            }
            n5r1(list.get(i2), z3, z2);
            i2++;
        }
    }

    private boolean hb(Preference preference) {
        return (preference.m4653i() == null && preference.m4652h() == null && (preference.fu4() == null || (preference instanceof TwoStatePreference)) && !(preference instanceof DialogPreference)) ? false : true;
    }

    private void i1(View view, AlphaBlendingDrawable alphaBlendingDrawable) {
        View childAt;
        if ((view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null && childAt.getClass().getSimpleName().contains(id)) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            int paddingBottom = view.getPaddingBottom();
            if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                paddingLeft += marginLayoutParams.leftMargin;
                paddingTop += marginLayoutParams.topMargin;
                paddingRight += marginLayoutParams.rightMargin;
                paddingBottom += marginLayoutParams.bottomMargin;
            }
            alphaBlendingDrawable.zy(this.f41470l);
            alphaBlendingDrawable.toq(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m26482l(RadioSetPreferenceCategory radioSetPreferenceCategory) {
        int iMo4670q;
        View childAt;
        int iUc = radioSetPreferenceCategory.uc();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iUc; i2++) {
            Preference preferenceYl = radioSetPreferenceCategory.yl(i2);
            if (preferenceYl != null && (iMo4670q = mo4670q(preferenceYl)) != -1 && (childAt = this.f41466f.getChildAt(iMo4670q)) != null) {
                arrayList.add(childAt);
            }
        }
        m26481f(arrayList);
    }

    private void n5r1(View view, boolean z2, boolean z3) {
        if (view != null) {
            x9kr(view.getBackground(), z2, z3);
        }
    }

    private void ncyb(RadioButtonPreferenceCategory radioButtonPreferenceCategory) {
        int iUc = radioButtonPreferenceCategory.uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            Preference preferenceYl = radioButtonPreferenceCategory.yl(i2);
            if (preferenceYl instanceof RadioSetPreferenceCategory) {
                m26482l((RadioSetPreferenceCategory) preferenceYl);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private boolean m26484t(Preference preference) {
        return !(preference instanceof androidx.preference.PreferenceCategory) && (!(preference instanceof RadioButtonPreference) || (preference.o1t() instanceof RadioSetPreferenceCategory)) && (!(preference instanceof InterfaceC7300n) || ((InterfaceC7300n) preference).m26478k());
    }

    /* JADX INFO: renamed from: x */
    private void m26485x(Preference preference) {
        if (preference == null || this.f41466f == null) {
            return;
        }
        if (preference instanceof RadioButtonPreferenceCategory) {
            ncyb((RadioButtonPreferenceCategory) preference);
        } else if (preference instanceof RadioSetPreferenceCategory) {
            m26482l((RadioSetPreferenceCategory) preference);
        } else {
            boolean z2 = preference instanceof RadioButtonPreference;
        }
    }

    private void x9kr(Drawable drawable, boolean z2, boolean z3) {
        if (drawable instanceof C7675k) {
            C7675k c7675k = (C7675k) drawable;
            c7675k.ld6(true);
            Paint paint = this.f41479x;
            int i2 = this.f41476u;
            int i3 = this.f89996bo;
            int i4 = this.f41477v;
            int i5 = this.f41465e;
            c7675k.m28032s(paint, i2, i3, i4 + i5, this.f41464d + i5, this.f41478w);
            boolean qVar = nmn5.toq(this.f41466f);
            Pair pairUv6 = uv6(this.f41466f, qVar);
            c7675k.m28031p(((Integer) pairUv6.first).intValue(), ((Integer) pairUv6.second).intValue(), qVar);
            c7675k.x2(z2, z3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m26486a() {
        View view = this.f41472o;
        if (view != null) {
            zp(view);
            FolmeBlink folmeBlink = this.f41463c;
            if (folmeBlink != null) {
                folmeBlink.detach(this);
            }
            this.f41463c = null;
            this.f41471m = false;
        }
    }

    protected boolean bf2(int i2) {
        if (this.f41465e == i2) {
            return false;
        }
        this.f41465e = i2;
        return true;
    }

    public void dd(C1016i c1016i, int i2) {
        View view = c1016i.itemView;
        if (i2 != this.f41469j) {
            if (Boolean.TRUE.equals(view.getTag(kja0.C7296p.lg4k))) {
                zp(view);
            }
        } else if (this.f41471m) {
            this.f41471m = false;
        } else {
            if (Boolean.TRUE.equals(view.getTag(kja0.C7296p.lg4k))) {
                return;
            }
            a98o(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@lvui C1016i c1016i) {
        super.onViewRecycled(c1016i);
        zp(c1016i.itemView);
    }

    @Override // androidx.preference.n7h, androidx.preference.Preference.toq
    /* JADX INFO: renamed from: g */
    public void mo4666g(Preference preference) {
        Preference qVar;
        super.mo4666g(preference);
        String strQrj = preference.qrj();
        if (TextUtils.isEmpty(strQrj) || (qVar = preference.gvn7().toq(strQrj)) == null) {
            return;
        }
        if (!(preference instanceof androidx.preference.PreferenceCategory)) {
            preference.gc3c(preference.ncyb());
        } else if (qVar instanceof TwoStatePreference) {
            preference.gc3c(((TwoStatePreference) qVar).isChecked());
        } else {
            preference.gc3c(qVar.ncyb());
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m26487j() {
        return this.f41469j != -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@lvui C1016i c1016i) {
        super.onViewDetachedFromWindow(c1016i);
        zp(c1016i.itemView);
    }

    public void nn86(Context context) {
        this.f41468i = C7164n.m25953y(context, kja0.C7297q.srpc);
        this.f41475t = C7164n.m25949n(context, kja0.C7297q.f89516le7);
        this.f41474r = C7164n.m25949n(context, kja0.C7297q.f89533mub);
        this.f41470l = context.getResources().getDimensionPixelSize(kja0.f7l8.o3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onAttachedToRecyclerView(@lvui RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        registerAdapterDataObserver(this.f41467h);
        this.f41466f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onDetachedFromRecyclerView(@lvui RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f41467h);
        this.f41466f = null;
    }

    @Override // miuix.animation.internal.BlinkStateObserver
    public void updateBlinkState(boolean z2) {
        RecyclerView recyclerView;
        if (!z2 || (recyclerView = this.f41466f) == null) {
            return;
        }
        recyclerView.removeOnItemTouchListener(this.f41461a);
        this.f41466f.setOnTouchListener(null);
        this.f41461a = null;
        this.f41462b = null;
        FolmeBlink folmeBlink = this.f41463c;
        if (folmeBlink != null) {
            folmeBlink.detach(this);
        }
    }

    public Pair uv6(RecyclerView recyclerView, boolean z2) {
        int width;
        int i2;
        int scrollBarSize = recyclerView.getScrollBarSize();
        if (z2) {
            i2 = scrollBarSize * 3;
            width = recyclerView.getWidth();
        } else {
            width = recyclerView.getWidth() - (scrollBarSize * 3);
            i2 = 0;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(width));
    }

    int vyq(int i2) {
        return this.f41473p[i2].f89997toq;
    }

    public void y9n(Paint paint, int i2, int i3, int i4, int i5, int i6) {
        this.f41479x = paint;
        this.f41476u = i2;
        this.f89996bo = i3;
        this.f41477v = i4;
        this.f41464d = i5;
        this.f41478w = i6;
    }

    public void yz(RecyclerView recyclerView, String str) {
        int iQrj;
        if (m26487j() || recyclerView == null || TextUtils.isEmpty(str) || (iQrj = qrj(str)) < 0) {
            return;
        }
        if (this.f41462b == null) {
            this.f41462b = new toq();
        }
        if (this.f41461a == null) {
            this.f41461a = new zy();
        }
        recyclerView.setOnTouchListener(this.f41462b);
        recyclerView.addOnItemTouchListener(this.f41461a);
        View childAt = recyclerView.getLayoutManager().getChildAt(iQrj);
        boolean z2 = true;
        if (childAt != null) {
            Rect rect = new Rect();
            childAt.getGlobalVisibleRect(rect);
            z2 = rect.height() < childAt.getHeight();
        }
        if (z2) {
            recyclerView.smoothScrollToPosition(iQrj);
            recyclerView.addOnScrollListener(new C7303q(iQrj));
        } else {
            this.f41469j = iQrj;
            notifyItemChanged(iQrj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.n7h, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z */
    public void onBindViewHolder(@lvui C1016i c1016i, int i2) {
        int i3;
        int i4;
        super.onBindViewHolder(c1016i, i2);
        C7380g.toq(c1016i.itemView, false);
        Preference preferenceNi7 = ni7(i2);
        m26480e(preferenceNi7, i2);
        int[] iArr = this.f41473p[i2].f41482k;
        Drawable background = c1016i.itemView.getBackground();
        int i5 = this.f41465e;
        if ((background instanceof LayerDrawable) && preferenceNi7 != 0) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            if ((preferenceNi7 instanceof RadioButtonPreference) || (preferenceNi7 instanceof androidx.preference.PreferenceCategory) || (preferenceNi7.o1t() instanceof RadioSetPreferenceCategory) || c1016i.itemView.findViewById(kja0.C7296p.qla) != null) {
                layerDrawable.setLayerInset(0, i5, 0, i5, 0);
                C7675k c7675k = new C7675k(background);
                c1016i.itemView.setBackground(c7675k);
                c7675k.setColorFilter(null);
                background = c7675k;
            } else {
                background.setColorFilter(null);
                Rect rect = new Rect();
                if (((LayerDrawable) background).getDrawable(0).getPadding(rect)) {
                    c1016i.itemView.setPadding(rect.left + i5, rect.top, rect.right + i5, rect.bottom);
                }
            }
        }
        if ((background instanceof StateListDrawable) && C7157g.zy((StateListDrawable) background, f89995ab)) {
            C7675k c7675k2 = new C7675k(background);
            c1016i.itemView.setBackground(c7675k2);
            background = c7675k2;
        }
        if (background instanceof C7675k) {
            C7675k c7675k3 = (C7675k) background;
            if (iArr != null) {
                c7675k3.m25930g(iArr);
            }
            Rect rect2 = new Rect();
            if (c7675k3.getPadding(rect2)) {
                int i6 = rect2.left;
                int i7 = rect2.right;
                if (preferenceNi7.o1t() instanceof RadioSetPreferenceCategory) {
                    i7 += this.f41480z;
                }
                rect2.right = nmn5.toq(this.f41466f) ? i6 : i7;
                if (nmn5.toq(this.f41466f)) {
                    i6 = i7;
                }
                rect2.left = i6;
                if (preferenceNi7.o1t() instanceof RadioSetPreferenceCategory) {
                    ViewGroup.LayoutParams layoutParams = c1016i.itemView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
                    marginLayoutParams.setMarginEnd(this.f41466f.getScrollBarSize() * 2);
                    c1016i.itemView.setLayoutParams(marginLayoutParams);
                    RadioSetPreferenceCategory radioSetPreferenceCategory = (RadioSetPreferenceCategory) preferenceNi7.o1t();
                    c7675k3.ld6(false);
                    c7675k3.setColorFilter(radioSetPreferenceCategory.isChecked() ? this.f41475t : this.f41474r, PorterDuff.Mode.SRC_OVER);
                    RecyclerView recyclerView = this.f41466f;
                    if (recyclerView != null) {
                        boolean z2 = preferenceNi7 instanceof RadioButtonPreference;
                        int scrollBarSize = recyclerView.getScrollBarSize();
                        if (nmn5.toq(this.f41466f)) {
                            rect2.right += z2 ? 0 : this.f41468i;
                            rect2.left -= scrollBarSize * 3;
                        } else {
                            rect2.left += z2 ? 0 : this.f41468i;
                            rect2.right -= scrollBarSize * 3;
                        }
                    }
                } else {
                    c7675k3.setColorFilter(null);
                }
                i3 = rect2.left + i5;
                i4 = rect2.right + i5;
            } else {
                i3 = 0;
                i4 = 0;
            }
            c1016i.itemView.setPadding(i3, rect2.top, i4, rect2.bottom);
            if ((preferenceNi7 instanceof RadioButtonPreference) && ((RadioButtonPreference) preferenceNi7).isChecked()) {
                c7675k3.m25930g(new int[]{R.attr.state_checked});
            }
        }
        View viewFindViewById = c1016i.itemView.findViewById(kja0.C7296p.f89358qo);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(hb(preferenceNi7) ? 0 : 8);
        }
        if (m26484t(preferenceNi7)) {
            if (c1016i.itemView.findViewById(kja0.C7296p.qla) != null) {
                Drawable foreground = c1016i.itemView.getForeground();
                if (foreground == null) {
                    Drawable drawableM25952s = C7164n.m25952s(preferenceNi7.x2(), kja0.C7297q.w1q6);
                    if (drawableM25952s instanceof LayerDrawable) {
                        ((LayerDrawable) drawableM25952s).setLayerInset(0, i5, 0, i5, 0);
                    }
                    c1016i.itemView.setForeground(drawableM25952s);
                } else if (foreground instanceof LayerDrawable) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) foreground;
                    layerDrawable2.setLayerInset(0, i5, 0, i5, 0);
                    layerDrawable2.invalidateSelf();
                }
            } else if (c1016i.itemView.getForeground() == null) {
                Drawable drawableM25952s2 = C7164n.m25952s(preferenceNi7.x2(), kja0.C7297q.whyb);
                if (drawableM25952s2 instanceof AlphaBlendingDrawable) {
                    AlphaBlendingDrawable alphaBlendingDrawable = (AlphaBlendingDrawable) drawableM25952s2;
                    alphaBlendingDrawable.zy(0);
                    alphaBlendingDrawable.toq(0, 0, 0, 0);
                    i1(c1016i.itemView, alphaBlendingDrawable);
                }
                c1016i.itemView.setForeground(drawableM25952s2);
            }
        }
        dd(c1016i, i2);
        if (preferenceNi7 instanceof ld6) {
            ((ld6) preferenceNi7).m26477k(c1016i, i5);
        }
    }

    public void zp(View view) {
        if (!m26487j() || view == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        int i2 = kja0.C7296p.lg4k;
        if (bool.equals(view.getTag(i2))) {
            Folme.useAt(view).blink().stopBlink();
            view.setTag(i2, Boolean.FALSE);
            if (this.f41472o == view) {
                this.f41472o = null;
            }
            this.f41469j = -1;
            RecyclerView recyclerView = this.f41466f;
            if (recyclerView != null) {
                recyclerView.removeOnItemTouchListener(this.f41461a);
                this.f41466f.setOnTouchListener(null);
                this.f41461a = null;
                this.f41462b = null;
            }
        }
    }

    @Override // androidx.preference.n7h, androidx.preference.Preference.toq
    public void zy(Preference preference) {
        if (preference != null && !preference.lrht()) {
            m26485x(preference);
        }
        super.zy(preference);
    }
}
