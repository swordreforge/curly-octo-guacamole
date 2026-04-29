package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.trackselection.ld6;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.InterfaceC7828g;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    @zy.dd
    private Comparator<zy> f22544c;

    /* JADX INFO: renamed from: e */
    @zy.dd
    private InterfaceC3735q f22545e;

    /* JADX INFO: renamed from: f */
    private boolean f22546f;

    /* JADX INFO: renamed from: g */
    private final CheckedTextView f22547g;

    /* JADX INFO: renamed from: h */
    private boolean f22548h;

    /* JADX INFO: renamed from: i */
    private InterfaceC3746f f22549i;

    /* JADX INFO: renamed from: k */
    private final int f22550k;

    /* JADX INFO: renamed from: l */
    private C3629x f22551l;

    /* JADX INFO: renamed from: n */
    private final CheckedTextView f22552n;

    /* JADX INFO: renamed from: p */
    private boolean f22553p;

    /* JADX INFO: renamed from: q */
    private final LayoutInflater f22554q;

    /* JADX INFO: renamed from: r */
    private int f22555r;

    /* JADX INFO: renamed from: s */
    private final SparseArray<C3705g.g> f22556s;

    /* JADX INFO: renamed from: t */
    private ld6.C3709k f22557t;

    /* JADX INFO: renamed from: y */
    private final toq f22558y;

    /* JADX INFO: renamed from: z */
    private CheckedTextView[][] f22559z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$q */
    public interface InterfaceC3735q {
        /* JADX INFO: renamed from: k */
        void m13256k(boolean z2, List<C3705g.g> list);
    }

    private class toq implements View.OnClickListener {
        private toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.f7l8(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zy {

        /* JADX INFO: renamed from: k */
        public final int f22561k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f66081toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final xwq3 f66082zy;

        public zy(int i2, int i3, xwq3 xwq3Var) {
            this.f22561k = i2;
            this.f66081toq = i3;
            this.f66082zy = xwq3Var;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(View view) {
        if (view == this.f22552n) {
            m13253s();
        } else if (view == this.f22547g) {
            m13254y();
        } else {
            m13251p(view);
        }
        qrj();
        InterfaceC3735q interfaceC3735q = this.f22545e;
        if (interfaceC3735q != null) {
            interfaceC3735q.m13256k(getIsDisabled(), getOverrides());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m13249g(Comparator comparator, zy zyVar, zy zyVar2) {
        return comparator.compare(zyVar.f66082zy, zyVar2.f66082zy);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean ld6(int i2) {
        return this.f22553p && this.f22551l.toq(i2).f21222k > 1 && this.f22557t.m13142k(this.f22555r, i2, false) != 0;
    }

    private void n7h() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f22557t == null) {
            this.f22552n.setEnabled(false);
            this.f22547g.setEnabled(false);
            return;
        }
        this.f22552n.setEnabled(true);
        this.f22547g.setEnabled(true);
        C3629x c3629xF7l8 = this.f22557t.f7l8(this.f22555r);
        this.f22551l = c3629xF7l8;
        this.f22559z = new CheckedTextView[c3629xF7l8.f21701k][];
        boolean zX2 = x2();
        int i2 = 0;
        while (true) {
            C3629x c3629x = this.f22551l;
            if (i2 >= c3629x.f21701k) {
                qrj();
                return;
            }
            C3564a qVar = c3629x.toq(i2);
            boolean zLd6 = ld6(i2);
            CheckedTextView[][] checkedTextViewArr = this.f22559z;
            int i3 = qVar.f21222k;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            zy[] zyVarArr = new zy[i3];
            for (int i4 = 0; i4 < qVar.f21222k; i4++) {
                zyVarArr[i4] = new zy(i2, i4, qVar.toq(i4));
            }
            Comparator<zy> comparator = this.f22544c;
            if (comparator != null) {
                Arrays.sort(zyVarArr, comparator);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 == 0) {
                    addView(this.f22554q.inflate(C3748h.s.f66559toq, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f22554q.inflate((zLd6 || zX2) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f22550k);
                checkedTextView.setText(this.f22549i.mo13291k(zyVarArr[i5].f66082zy));
                checkedTextView.setTag(zyVarArr[i5]);
                if (this.f22557t.m13147y(this.f22555r, i2, i5) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f22558y);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f22559z[i2][i5] = checkedTextView;
                addView(checkedTextView);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m13251p(View view) {
        this.f22546f = false;
        zy zyVar = (zy) C3844k.f7l8(view.getTag());
        int i2 = zyVar.f22561k;
        int i3 = zyVar.f66081toq;
        C3705g.g gVar = this.f22556s.get(i2);
        C3844k.f7l8(this.f22557t);
        if (gVar == null) {
            if (!this.f22548h && this.f22556s.size() > 0) {
                this.f22556s.clear();
            }
            this.f22556s.put(i2, new C3705g.g(i2, i3));
            return;
        }
        int i4 = gVar.f22253n;
        int[] iArr = gVar.f22254q;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zLd6 = ld6(i2);
        boolean z2 = zLd6 || x2();
        if (zIsChecked && z2) {
            if (i4 == 1) {
                this.f22556s.remove(i2);
                return;
            } else {
                this.f22556s.put(i2, new C3705g.g(i2, m13252q(iArr, i3)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zLd6) {
            this.f22556s.put(i2, new C3705g.g(i2, zy(iArr, i3)));
        } else {
            this.f22556s.put(i2, new C3705g.g(i2, i3));
        }
    }

    /* JADX INFO: renamed from: q */
    private static int[] m13252q(int[] iArr, int i2) {
        int[] iArr2 = new int[iArr.length - 1];
        int i3 = 0;
        for (int i4 : iArr) {
            if (i4 != i2) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    private void qrj() {
        this.f22552n.setChecked(this.f22546f);
        this.f22547g.setChecked(!this.f22546f && this.f22556s.size() == 0);
        for (int i2 = 0; i2 < this.f22559z.length; i2++) {
            C3705g.g gVar = this.f22556s.get(i2);
            int i3 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f22559z[i2];
                if (i3 < checkedTextViewArr.length) {
                    if (gVar != null) {
                        this.f22559z[i2][i3].setChecked(gVar.toq(((zy) C3844k.f7l8(checkedTextViewArr[i3].getTag())).f66081toq));
                    } else {
                        checkedTextViewArr[i3].setChecked(false);
                    }
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m13253s() {
        this.f22546f = true;
        this.f22556s.clear();
    }

    private boolean x2() {
        return this.f22548h && this.f22551l.f21701k > 1;
    }

    /* JADX INFO: renamed from: y */
    private void m13254y() {
        this.f22546f = false;
        this.f22556s.clear();
    }

    private static int[] zy(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i2;
        return iArrCopyOf;
    }

    public boolean getIsDisabled() {
        return this.f22546f;
    }

    public List<C3705g.g> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f22556s.size());
        for (int i2 = 0; i2 < this.f22556s.size(); i2++) {
            arrayList.add(this.f22556s.valueAt(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m13255n(ld6.C3709k c3709k, int i2, boolean z2, List<C3705g.g> list, @zy.dd final Comparator<xwq3> comparator, @zy.dd InterfaceC3735q interfaceC3735q) {
        this.f22557t = c3709k;
        this.f22555r = i2;
        this.f22546f = z2;
        this.f22544c = comparator == null ? null : new Comparator() { // from class: com.google.android.exoplayer2.ui.vyq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.m13249g(comparator, (TrackSelectionView.zy) obj, (TrackSelectionView.zy) obj2);
            }
        };
        this.f22545e = interfaceC3735q;
        int size = this.f22548h ? list.size() : Math.min(list.size(), 1);
        for (int i3 = 0; i3 < size; i3++) {
            C3705g.g gVar = list.get(i3);
            this.f22556s.put(gVar.f22252k, gVar);
        }
        n7h();
    }

    public void setAllowAdaptiveSelections(boolean z2) {
        if (this.f22553p != z2) {
            this.f22553p = z2;
            n7h();
        }
    }

    public void setAllowMultipleOverrides(boolean z2) {
        if (this.f22548h != z2) {
            this.f22548h = z2;
            if (!z2 && this.f22556s.size() > 1) {
                for (int size = this.f22556s.size() - 1; size > 0; size--) {
                    this.f22556s.remove(size);
                }
            }
            n7h();
        }
    }

    public void setShowDisableOption(boolean z2) {
        this.f22552n.setVisibility(z2 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC3746f interfaceC3746f) {
        this.f22549i = (InterfaceC3746f) C3844k.f7l8(interfaceC3746f);
        n7h();
    }

    public TrackSelectionView(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        super(context, attributeSet, i2);
        setOrientation(1);
        this.f22556s = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f22550k = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f22554q = layoutInflaterFrom;
        toq toqVar = new toq();
        this.f22558y = toqVar;
        this.f22549i = new C3764s(getResources());
        this.f22551l = C3629x.f21698g;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22552n = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C3748h.ld6.f66247hyr);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(toqVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(C3748h.s.f66559toq, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22547g = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C3748h.ld6.f66256n5r1);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(toqVar);
        addView(checkedTextView2);
    }
}
