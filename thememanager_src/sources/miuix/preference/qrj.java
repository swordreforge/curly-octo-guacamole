package miuix.preference;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Pair;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.nmn5;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.qrj;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.gvn7;
import miuix.appcompat.internal.app.widget.C6998s;
import miuix.appcompat.internal.view.C7040n;
import miuix.core.util.C7085q;
import miuix.core.util.C7103y;
import miuix.core.util.t8r;
import miuix.internal.util.C7164n;
import miuix.preference.kja0;
import miuix.preference.qrj;
import miuix.smooth.C7334n;
import miuix.springback.view.SpringBackLayout;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: PreferenceFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qrj extends androidx.preference.qrj implements gvn7 {
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private boolean mConfigChangeUpdateViewEnable;

    @dd
    protected Rect mContentInset;
    private int mDeviceType;

    @dd
    private C7040n mExtraPaddingPolicy;
    private zy mFrameDecoration;
    private n7h mGroupAdapter;
    private View mListContainer;
    private int mWindowHeightDp;
    private int mWindowWidthDp;
    private boolean mIsOverlayMode = false;
    private boolean mAdapterInvalid = true;
    private boolean mItemSelectable = false;
    private int mCurSelectedItem = -1;
    private boolean mExtraPaddingEnable = true;
    private int mExtraPaddingHorizontal = 0;

    /* JADX INFO: renamed from: miuix.preference.qrj$k */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    class ViewOnLayoutChangeListenerC7308k implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC7308k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void toq(RecyclerView recyclerView) {
            RecyclerView.qrj itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.x2();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            Resources resources = qrj.this.getResources();
            t8r t8rVarM25605p = C7085q.m25605p(qrj.this.getContext(), resources.getConfiguration());
            float f2 = resources.getDisplayMetrics().density;
            qrj.this.mWindowWidthDp = t8rVarM25605p.f39906q.x;
            qrj.this.mWindowHeightDp = t8rVarM25605p.f39906q.y;
            if (qrj.this.mFrameDecoration != null) {
                qrj.this.mFrameDecoration.ni7(t8rVarM25605p.f87381zy.y);
            }
            if (qrj.this.mExtraPaddingPolicy != null) {
                qrj.this.mExtraPaddingPolicy.m25384p(qrj.this.mWindowWidthDp, qrj.this.mWindowHeightDp, i4 - i2, i5 - i3, f2, qrj.this.isInFloatingWindowMode());
                if (qrj.this.mExtraPaddingPolicy.m25385s()) {
                    qrj.this.mExtraPaddingHorizontal = (int) (r2.mExtraPaddingPolicy.m25382g() * f2);
                } else {
                    qrj.this.mExtraPaddingHorizontal = 0;
                }
                if (qrj.this.mGroupAdapter == null || !qrj.this.mGroupAdapter.bf2(qrj.this.mExtraPaddingHorizontal)) {
                    return;
                }
                qrj qrjVar = qrj.this;
                qrjVar.onExtraPaddingChanged(qrjVar.mExtraPaddingHorizontal);
                final RecyclerView listView = qrj.this.getListView();
                if (listView != null) {
                    qrj.this.mGroupAdapter.notifyDataSetChanged();
                    listView.post(new Runnable() { // from class: miuix.preference.x2
                        @Override // java.lang.Runnable
                        public final void run() {
                            qrj.ViewOnLayoutChangeListenerC7308k.toq(listView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: compiled from: PreferenceFragment.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f41499k;

        toq(String str) {
            this.f41499k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qrj.this.mGroupAdapter != null) {
                qrj.this.mGroupAdapter.yz(qrj.this.getListView(), this.f41499k);
            }
        }
    }

    /* JADX INFO: compiled from: PreferenceFragment.java */
    private class zy extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final int f90006cdj = 4;

        /* JADX INFO: renamed from: h */
        private static final int f41501h = 2;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f90007kja0 = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f90008f7l8;

        /* JADX INFO: renamed from: g */
        private int f41502g;

        /* JADX INFO: renamed from: k */
        private Paint f41503k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private C7309q f90009ld6;

        /* JADX INFO: renamed from: n */
        private Pair<Integer, Integer> f41504n;

        /* JADX INFO: renamed from: p */
        private int f41505p;

        /* JADX INFO: renamed from: q */
        private boolean f41506q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f90011qrj;

        /* JADX INFO: renamed from: s */
        private int f41507s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Paint f90012toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private Map<Integer, C7309q> f90013x2;

        /* JADX INFO: renamed from: y */
        private int f41508y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f90014zy;

        /* synthetic */ zy(qrj qrjVar, Context context, ViewOnLayoutChangeListenerC7308k viewOnLayoutChangeListenerC7308k) {
            this(context);
        }

        private void cdj(@lvui Canvas canvas, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z5) {
            if (qrj.this.mAdapterInvalid) {
                return;
            }
            float f2 = i3;
            float f3 = i5;
            RectF rectF = new RectF(i2, f2, i4, f3);
            RectF rectF2 = new RectF(i2 + (z5 ? this.f41507s : this.f41508y) + qrj.this.mExtraPaddingHorizontal, f2, i4 - ((z5 ? this.f41508y : this.f41507s) + qrj.this.mExtraPaddingHorizontal), f3);
            Path path = new Path();
            float f4 = z2 ? this.f41505p : 0.0f;
            float f5 = z3 ? this.f41505p : 0.0f;
            path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f5, f5, f5, f5}, Path.Direction.CW);
            int iSaveLayer = canvas.saveLayer(rectF, this.f41503k, 31);
            canvas.drawRect(rectF, this.f41503k);
            canvas.drawPath(path, this.f90012toq);
            canvas.restoreToCount(iSaveLayer);
        }

        /* JADX INFO: renamed from: h */
        private boolean m26492h(RecyclerView recyclerView, int i2, int i3) {
            int i4 = i2 + 1;
            if (i4 < i3) {
                return !(qrj.this.mGroupAdapter.ni7(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i4))) instanceof RadioSetPreferenceCategory);
            }
            return false;
        }

        private void ki(@lvui Canvas canvas, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z5, boolean z6) {
            if (qrj.this.mAdapterInvalid) {
                return;
            }
            float f2 = i3;
            float f3 = i5;
            RectF rectF = new RectF(i2, f2, i4, f3);
            RectF rectF2 = new RectF(i2 + (z6 ? this.f41507s : this.f41508y) + qrj.this.mExtraPaddingHorizontal, f2, i4 - ((z6 ? this.f41508y : this.f41507s) + qrj.this.mExtraPaddingHorizontal), f3);
            Path path = new Path();
            float f4 = z2 ? this.f41505p : 0.0f;
            float f5 = z3 ? this.f41505p : 0.0f;
            path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f5, f5, f5, f5}, Path.Direction.CW);
            int iSaveLayer = canvas.saveLayer(rectF, this.f41503k, 31);
            canvas.drawRect(rectF, this.f41503k);
            if (z5) {
                this.f41503k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            } else {
                this.f41503k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            }
            canvas.drawPath(path, this.f41503k);
            this.f41503k.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }

        private int t8r(RecyclerView recyclerView, View view, int i2, int i3, boolean z2) {
            View childAt;
            if (z2) {
                if (view == null || view.getBottom() + view.getHeight() >= this.f90011qrj) {
                    return -1;
                }
                do {
                    i2++;
                    if (i2 < i3) {
                        childAt = recyclerView.getChildAt(i2);
                    }
                } while (childAt == null);
                return (int) childAt.getY();
            }
            for (int i4 = i2 - 1; i4 > i3; i4--) {
                View childAt2 = recyclerView.getChildAt(i4);
                if (childAt2 != null) {
                    return ((int) childAt2.getY()) + childAt2.getHeight();
                }
            }
            return -1;
        }

        private void zurt(RecyclerView recyclerView, C7309q c7309q) {
            int size = c7309q.f41493k.size();
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                int iIntValue = c7309q.f41493k.get(i6).intValue();
                View childAt = recyclerView.getChildAt(iIntValue);
                if (childAt != null) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int y3 = (int) childAt.getY();
                    int height = y3 + childAt.getHeight();
                    if (i6 == 0) {
                        i5 = bottom;
                        i3 = height;
                        i2 = y3;
                        i4 = top;
                    }
                    if (i4 > top) {
                        i4 = top;
                    }
                    if (i5 < bottom) {
                        i5 = bottom;
                    }
                    if (i2 > y3) {
                        i2 = y3;
                    }
                    if (i3 < height) {
                        i3 = height;
                    }
                    if (c7309q.f41492g == iIntValue) {
                        int y4 = (int) childAt.getY();
                        c7309q.f41496q = new int[]{y4, childAt.getHeight() + y4};
                    }
                }
            }
            if (c7309q.f41496q == null) {
                c7309q.f41496q = new int[]{i2, i3};
            }
            int i7 = c7309q.f41498y;
            if (i7 != -1 && i7 > c7309q.f90001f7l8) {
                i3 = i7 - this.f90008f7l8;
            }
            int i8 = c7309q.f90001f7l8;
            if (i8 != -1 && i8 < i7) {
                i2 = i8 + this.f41502g;
            }
            c7309q.f90005zy = new int[]{i4, i5};
            c7309q.f90003toq = new int[]{i2, i3};
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        public void f7l8(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            int i2;
            Preference preference;
            C7309q c7309q;
            super.f7l8(canvas, recyclerView, mcpVar);
            if (qrj.this.mAdapterInvalid) {
                return;
            }
            this.f90013x2.clear();
            int childCount = recyclerView.getChildCount();
            this.f41506q = nmn5.toq(recyclerView);
            Pair<Integer, Integer> pairUv6 = qrj.this.mGroupAdapter.uv6(recyclerView, this.f41506q);
            this.f41504n = pairUv6;
            int iIntValue = ((Integer) pairUv6.first).intValue();
            int iIntValue2 = ((Integer) this.f41504n.second).intValue();
            int i3 = 0;
            while (true) {
                ViewOnLayoutChangeListenerC7308k viewOnLayoutChangeListenerC7308k = null;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i3);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                Preference preferenceNi7 = qrj.this.mGroupAdapter.ni7(childAdapterPosition);
                if (preferenceNi7 != null && (preferenceNi7.o1t() instanceof RadioSetPreferenceCategory)) {
                    RadioSetPreferenceCategory radioSetPreferenceCategory = (RadioSetPreferenceCategory) preferenceNi7.o1t();
                    int iVyq = qrj.this.mGroupAdapter.vyq(childAdapterPosition);
                    if (iVyq == 1 || iVyq == 2) {
                        C7309q c7309q2 = new C7309q(qrj.this, viewOnLayoutChangeListenerC7308k);
                        this.f90009ld6 = c7309q2;
                        c7309q2.f90002ld6 |= 1;
                        c7309q2.f41495p = true;
                        i2 = iVyq;
                        preference = preferenceNi7;
                        c7309q2.f90001f7l8 = t8r(recyclerView, childAt, i3, 0, false);
                        this.f90009ld6.m26491k(i3);
                    } else {
                        i2 = iVyq;
                        preference = preferenceNi7;
                    }
                    if (i2 == 4 || i2 == 3) {
                        C7309q c7309q3 = this.f90009ld6;
                        if (c7309q3 != null) {
                            c7309q3.m26491k(i3);
                        } else {
                            C7309q c7309q4 = new C7309q(qrj.this, viewOnLayoutChangeListenerC7308k);
                            this.f90009ld6 = c7309q4;
                            c7309q4.m26491k(i3);
                        }
                        this.f90009ld6.f90002ld6 |= 2;
                    }
                    if (radioSetPreferenceCategory.bap7() == preference && (c7309q = this.f90009ld6) != null) {
                        c7309q.f41492g = i3;
                    }
                    C7309q c7309q5 = this.f90009ld6;
                    if (c7309q5 != null && (i2 == 1 || i2 == 4)) {
                        c7309q5.f41498y = t8r(recyclerView, childAt, i3, childCount, true);
                        this.f90009ld6.f41494n = this.f90013x2.size();
                        this.f90009ld6.f41497s = m26492h(recyclerView, i3, childCount);
                        C7309q c7309q6 = this.f90009ld6;
                        c7309q6.f90002ld6 |= 4;
                        this.f90013x2.put(Integer.valueOf(c7309q6.f41494n), this.f90009ld6);
                        this.f90009ld6 = null;
                    }
                }
                i3++;
            }
            C7309q c7309q7 = this.f90009ld6;
            if (c7309q7 != null && c7309q7.f41493k.size() > 0) {
                C7309q c7309q8 = this.f90009ld6;
                c7309q8.f41498y = -1;
                c7309q8.f41494n = this.f90013x2.size();
                C7309q c7309q9 = this.f90009ld6;
                c7309q9.f41497s = false;
                this.f90013x2.put(Integer.valueOf(c7309q9.f41494n), this.f90009ld6);
                this.f90009ld6 = null;
            }
            Map<Integer, C7309q> map = this.f90013x2;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<Map.Entry<Integer, C7309q>> it = this.f90013x2.entrySet().iterator();
            while (it.hasNext()) {
                zurt(recyclerView, it.next().getValue());
            }
            Iterator<Map.Entry<Integer, C7309q>> it2 = this.f90013x2.entrySet().iterator();
            while (it2.hasNext()) {
                C7309q value = it2.next().getValue();
                int[] iArr = value.f90003toq;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = value.f90002ld6;
                cdj(canvas, iIntValue, i4, iIntValue2, i5, (i6 & 1) != 0, (i6 & 4) != 0, this.f41506q);
            }
        }

        public void fn3e() {
            if (!(qrj.this.getActivity() instanceof miuix.appcompat.app.t8r) || ((miuix.appcompat.app.t8r) qrj.this.getActivity()).isInFloatingWindowMode()) {
                this.f41503k.setColor(C7164n.m25949n(qrj.this.getContext(), kja0.C7297q.wz6j));
            } else {
                this.f41503k.setColor(C7164n.m25949n(qrj.this.getContext(), kja0.C7297q.j59a));
            }
        }

        /* JADX INFO: renamed from: i */
        public void m26494i(Context context) {
            this.f41502g = context.getResources().getDimensionPixelSize(kja0.f7l8.os3j);
            this.f90008f7l8 = context.getResources().getDimensionPixelSize(kja0.f7l8.w82);
            this.f41508y = C7164n.m25953y(context, kja0.C7297q.jmz);
            this.f41507s = C7164n.m25953y(context, kja0.C7297q.s5);
            this.f41505p = context.getResources().getDimensionPixelSize(kja0.f7l8.ca);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect rect, @lvui View view, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            int childAdapterPosition;
            Preference preferenceNi7;
            if (qrj.this.mAdapterInvalid || (preferenceNi7 = qrj.this.mGroupAdapter.ni7((childAdapterPosition = recyclerView.getChildAdapterPosition(view)))) == null || !(preferenceNi7.o1t() instanceof RadioSetPreferenceCategory)) {
                return;
            }
            if (nmn5.toq(recyclerView)) {
                rect.left = recyclerView.getScrollBarSize();
            } else {
                rect.right = recyclerView.getScrollBarSize();
            }
            int iVyq = qrj.this.mGroupAdapter.vyq(childAdapterPosition);
            if (iVyq == 1) {
                rect.top += this.f41502g;
                rect.bottom += this.f90008f7l8;
            } else if (iVyq == 2) {
                rect.top += this.f41502g;
            } else if (iVyq == 4) {
                rect.bottom += this.f90008f7l8;
            }
        }

        public void ni7(int i2) {
            this.f90011qrj = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: s */
        public void mo4713s(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if (qrj.this.mAdapterInvalid) {
                return;
            }
            int iIntValue = ((Integer) this.f41504n.first).intValue();
            int iIntValue2 = ((Integer) this.f41504n.second).intValue();
            Map<Integer, C7309q> map = this.f90013x2;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<Map.Entry<Integer, C7309q>> it = this.f90013x2.entrySet().iterator();
            while (it.hasNext()) {
                C7309q value = it.next().getValue();
                int[] iArr = value.f90003toq;
                int i2 = iArr[0];
                int i3 = iArr[1];
                ki(canvas, iIntValue, i2 - this.f41502g, iIntValue2, i2, false, false, true, this.f41506q);
                ki(canvas, iIntValue, i3, iIntValue2, i3 + this.f90008f7l8, false, false, true, this.f41506q);
                int i4 = value.f90002ld6;
                ki(canvas, iIntValue, i2, iIntValue2, i3, (i4 & 1) != 0, (i4 & 4) != 0, false, this.f41506q);
            }
        }

        private zy(Context context) {
            this.f41506q = false;
            m26494i(context);
            this.f41503k = new Paint();
            fn3e();
            this.f41503k.setAntiAlias(true);
            Paint paint = new Paint();
            this.f90012toq = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            int iM25949n = C7164n.m25949n(context, kja0.C7297q.f89533mub);
            this.f90014zy = iM25949n;
            this.f90012toq.setColor(iM25949n);
            this.f90012toq.setAntiAlias(true);
            this.f90013x2 = new HashMap();
        }
    }

    private void initExtraPaddingPolicy() {
        C7040n qVar = new C7040n.k().toq(this.mDeviceType);
        this.mExtraPaddingPolicy = qVar;
        if (qVar != null) {
            qVar.ld6(this.mExtraPaddingEnable);
            float f2 = getResources().getDisplayMetrics().density;
            if (this.mExtraPaddingPolicy.m25385s()) {
                this.mExtraPaddingHorizontal = (int) (this.mExtraPaddingPolicy.m25382g() * f2);
            } else {
                this.mExtraPaddingHorizontal = 0;
            }
        }
    }

    private boolean isTabletOrFold() {
        int i2 = this.mDeviceType;
        return i2 == 2 || i2 == 3 || i2 == 5;
    }

    private void updateActionBarOverlay() {
        gvn7 gvn7Var;
        Fragment parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == null) {
                gvn7Var = null;
                break;
            }
            if (parentFragment instanceof gvn7) {
                gvn7Var = (gvn7) parentFragment;
                if (gvn7Var.hasActionBar()) {
                    break;
                }
            }
            parentFragment = parentFragment.getParentFragment();
        }
        Context themedContext = gvn7Var != null ? gvn7Var.getThemedContext() : getActivity();
        if (themedContext != null) {
            this.mIsOverlayMode = C7164n.m25951q(themedContext, kja0.C7297q.sxpt, false);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void bindViewWithContentInset(View view) {
        androidx.lifecycle.n7h parentFragment = getParentFragment();
        if (parentFragment instanceof gvn7) {
            ((gvn7) parentFragment).bindViewWithContentInset(view);
            return;
        }
        ActivityC0891q activity = getActivity();
        if (activity instanceof miuix.appcompat.app.t8r) {
            ((miuix.appcompat.app.t8r) activity).bindViewWithContentInset(view);
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public void checkThemeLegality() {
    }

    @Override // miuix.appcompat.app.d3
    public void dismissImmersionMenu(boolean z2) {
    }

    @Override // miuix.appcompat.app.gvn7
    public AbstractC6946k getActionBar() {
        androidx.lifecycle.n7h parentFragment = getParentFragment();
        ActivityC0891q activity = getActivity();
        if (parentFragment == null && (activity instanceof miuix.appcompat.app.t8r)) {
            return ((miuix.appcompat.app.t8r) activity).getAppCompatActionBar();
        }
        if (parentFragment instanceof gvn7) {
            return ((gvn7) parentFragment).getActionBar();
        }
        return null;
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        if (this.mIsOverlayMode && this.mContentInset == null) {
            androidx.lifecycle.n7h parentFragment = getParentFragment();
            if (parentFragment == null && (getActivity() instanceof miuix.appcompat.app.t8r)) {
                this.mContentInset = ((miuix.appcompat.app.t8r) getActivity()).getContentInset();
            } else if (parentFragment instanceof gvn7) {
                this.mContentInset = ((gvn7) parentFragment).getContentInset();
            }
        }
        return this.mContentInset;
    }

    protected int getExtraHorizontalPadding() {
        return this.mExtraPaddingHorizontal;
    }

    @Override // miuix.appcompat.app.gvn7
    public Context getThemedContext() {
        return getContext();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean hasActionBar() {
        return false;
    }

    @Override // miuix.appcompat.app.d3
    public void hideEndOverflowMenu() {
    }

    @Override // miuix.appcompat.app.d3
    public void hideOverflowMenu() {
    }

    protected boolean isActionBarOverlay() {
        return this.mIsOverlayMode;
    }

    public boolean isConfigChangeUpdateViewEnable() {
        return true;
    }

    protected boolean isExtraHorizontalPaddingEnable() {
        return this.mExtraPaddingEnable;
    }

    public boolean isHighlightRequested() {
        n7h n7hVar = this.mGroupAdapter;
        if (n7hVar != null) {
            return n7hVar.m26487j();
        }
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isInEditActionMode() {
        return false;
    }

    protected boolean isInFloatingWindowMode() {
        ActivityC0891q activity = getActivity();
        if (activity instanceof miuix.appcompat.app.t8r) {
            return ((miuix.appcompat.app.t8r) activity).isInFloatingWindowMode();
        }
        return false;
    }

    protected boolean isInMiuiSettingMultiWindowMode() {
        ActivityC0891q activity = getActivity();
        if (activity != null) {
            return C7103y.toq(activity.getIntent());
        }
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isIsInSearchActionMode() {
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isRegisterResponsive() {
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public void onActionModeFinished(ActionMode actionMode) {
    }

    @Override // miuix.appcompat.app.gvn7
    public void onActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        PreferenceScreen preferenceScreen;
        zy zyVar;
        super.onConfigurationChanged(configuration);
        if (getActivity() == null) {
            return;
        }
        int iM26179k = miuix.os.zy.m26179k(getContext());
        if (this.mDeviceType != iM26179k) {
            this.mDeviceType = iM26179k;
            initExtraPaddingPolicy();
            n7h n7hVar = this.mGroupAdapter;
            if (n7hVar != null && n7hVar.bf2(this.mExtraPaddingHorizontal)) {
                onExtraPaddingChanged(this.mExtraPaddingHorizontal);
            }
        }
        if (!isTabletOrFold() || !this.mConfigChangeUpdateViewEnable || (preferenceScreen = getPreferenceScreen()) == null || (zyVar = this.mFrameDecoration) == null) {
            return;
        }
        zyVar.m26494i(preferenceScreen.x2());
        this.mFrameDecoration.fn3e();
        n7h n7hVar2 = this.mGroupAdapter;
        if (n7hVar2 != null) {
            n7hVar2.nn86(preferenceScreen.x2());
            this.mGroupAdapter.y9n(this.mFrameDecoration.f41503k, this.mFrameDecoration.f41502g, this.mFrameDecoration.f90008f7l8, this.mFrameDecoration.f41508y, this.mFrameDecoration.f41507s, this.mFrameDecoration.f41505p);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        View view = getView();
        RecyclerView listView = getListView();
        if (view == null || listView == null) {
            return;
        }
        AbstractC6946k actionBar = getActionBar();
        if (actionBar != null) {
            C6998s c6998s = (C6998s) actionBar;
            if (c6998s.f3f() != null) {
                Rect rect2 = new Rect();
                Rect rect3 = new Rect();
                c6998s.f3f().getGlobalVisibleRect(rect2);
                view.getGlobalVisibleRect(rect3);
                listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), Math.max(0, rect.bottom - Math.max(0, rect2.bottom - rect3.bottom)));
                return;
            }
        }
        listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), rect.bottom);
    }

    @Override // androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mConfigChangeUpdateViewEnable = isConfigChangeUpdateViewEnable();
        Point point = C7085q.m25605p(getContext(), getResources().getConfiguration()).f39906q;
        this.mWindowWidthDp = point.x;
        this.mWindowHeightDp = point.y;
    }

    @Override // androidx.preference.qrj
    protected final RecyclerView.AbstractC1060y onCreateAdapter(PreferenceScreen preferenceScreen) {
        n7h n7hVar = new n7h(preferenceScreen);
        this.mGroupAdapter = n7hVar;
        if (n7hVar.bf2(this.mExtraPaddingHorizontal)) {
            onExtraPaddingChanged(this.mExtraPaddingHorizontal);
        }
        this.mAdapterInvalid = this.mGroupAdapter.getItemCount() < 1;
        zy zyVar = this.mFrameDecoration;
        if (zyVar != null) {
            this.mGroupAdapter.y9n(zyVar.f41503k, this.mFrameDecoration.f41502g, this.mFrameDecoration.f90008f7l8, this.mFrameDecoration.f41508y, this.mFrameDecoration.f41507s, this.mFrameDecoration.f41505p);
        }
        return this.mGroupAdapter;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return false;
    }

    @Override // androidx.preference.qrj
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(kja0.qrj.f89742ukdy, viewGroup, false);
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(false);
        }
        recyclerView.setLayoutManager(onCreateLayoutManager());
        C7334n.m26604g(recyclerView, true);
        this.mFrameDecoration = new zy(this, recyclerView.getContext(), null);
        this.mFrameDecoration.ni7(C7085q.m25605p(getContext(), getResources().getConfiguration()).f87381zy.y);
        recyclerView.addItemDecoration(this.mFrameDecoration);
        this.mListContainer = viewGroup;
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7308k());
        if (viewGroup instanceof SpringBackLayout) {
            ((SpringBackLayout) viewGroup).setTarget(recyclerView);
        }
        return recyclerView;
    }

    @Override // androidx.preference.qrj, androidx.fragment.app.Fragment
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        updateActionBarOverlay();
        this.mDeviceType = miuix.os.zy.m26179k(getActivity());
        initExtraPaddingPolicy();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unregisterCoordinateScrollView(this.mListContainer);
    }

    @Override // miuix.appcompat.app.jp0y
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    @Override // androidx.preference.qrj, androidx.preference.ki.InterfaceC1019k
    public void onDisplayPreferenceDialog(Preference preference) {
        androidx.fragment.app.zy zyVarBtvn;
        boolean zM4710k = getCallbackFragment() instanceof qrj.InterfaceC1030n ? ((qrj.InterfaceC1030n) getCallbackFragment()).m4710k(this, preference) : false;
        if (!zM4710k && (getActivity() instanceof qrj.InterfaceC1030n)) {
            zM4710k = ((qrj.InterfaceC1030n) getActivity()).m4710k(this, preference);
        }
        if (!zM4710k && getFragmentManager().nmn5(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                zyVarBtvn = C7307q.mj(preference.fn3e());
            } else if (preference instanceof ListPreference) {
                zyVarBtvn = f7l8.btvn(preference.fn3e());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                zyVarBtvn = C7311y.btvn(preference.fn3e());
            }
            zyVarBtvn.setTargetFragment(this, 0);
            zyVarBtvn.cyoe(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
    }

    @Override // miuix.appcompat.app.gvn7
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPanelClosed(int i2, Menu menu) {
    }

    @Override // androidx.preference.qrj, androidx.preference.ki.zy
    public boolean onPreferenceTreeClick(Preference preference) {
        int iM4664z;
        int i2;
        View childAt;
        if (this.mItemSelectable && (iM4664z = preference.m4664z()) != (i2 = this.mCurSelectedItem)) {
            if (i2 >= 0 && (childAt = getListView().getChildAt(this.mCurSelectedItem)) != null) {
                childAt.setActivated(false);
            }
            View childAt2 = getListView().getChildAt(iM4664z);
            if (childAt2 != null) {
                childAt2.setActivated(true);
                this.mCurSelectedItem = iM4664z;
            }
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPreparePanel(int i2, View view, Menu menu) {
    }

    @Override // miuix.appcompat.app.jp0y
    public void onProcessBindViewWithContentInset(Rect rect) {
    }

    @Override // androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        stopHighlight();
    }

    @Override // androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.mIsOverlayMode) {
            registerCoordinateScrollView(this.mListContainer);
            getListView().setClipToPadding(false);
            Rect contentInset = getContentInset();
            if (contentInset == null || contentInset.isEmpty()) {
                return;
            }
            onContentInsetChanged(contentInset);
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public void onViewInflated(View view, Bundle bundle) {
    }

    public void registerCoordinateScrollView(View view) {
        AbstractC6946k actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.ktq(view);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        androidx.lifecycle.n7h parentFragment = getParentFragment();
        if (parentFragment instanceof gvn7) {
            return ((gvn7) parentFragment).requestDispatchContentInset();
        }
        ActivityC0891q activity = getActivity();
        if (activity instanceof miuix.appcompat.app.t8r) {
            return ((miuix.appcompat.app.t8r) activity).requestDispatchContentInset();
        }
        return false;
    }

    public void requestHighlight(String str) {
        getListView().post(new toq(str));
    }

    @Override // miuix.appcompat.app.jp0y
    public void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
    }

    public void setExtraHorizontalPaddingEnable(boolean z2) {
        this.mExtraPaddingEnable = z2;
    }

    @Override // miuix.appcompat.app.d3
    public void setImmersionMenuEnabled(boolean z2) {
    }

    public void setItemSelectable(boolean z2) {
        this.mItemSelectable = z2;
    }

    @Override // miuix.appcompat.app.gvn7
    public void setThemeRes(int i2) {
    }

    @Override // miuix.appcompat.app.d3
    public void showEndOverflowMenu() {
    }

    @Override // miuix.appcompat.app.d3
    public void showImmersionMenu() {
    }

    @Override // miuix.appcompat.app.d3
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
    }

    @Override // miuix.appcompat.app.d3
    public void showOverflowMenu() {
    }

    @Override // miuix.appcompat.app.gvn7
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public void stopHighlight() {
        n7h n7hVar = this.mGroupAdapter;
        if (n7hVar != null) {
            n7hVar.m26486a();
        }
    }

    public void unregisterCoordinateScrollView(View view) {
        AbstractC6946k actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.v5yj(view);
        }
    }

    /* JADX INFO: renamed from: miuix.preference.qrj$q */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    private class C7309q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f90001f7l8;

        /* JADX INFO: renamed from: g */
        public int f41492g;

        /* JADX INFO: renamed from: k */
        public List<Integer> f41493k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f90002ld6;

        /* JADX INFO: renamed from: n */
        public int f41494n;

        /* JADX INFO: renamed from: p */
        public boolean f41495p;

        /* JADX INFO: renamed from: q */
        public int[] f41496q;

        /* JADX INFO: renamed from: s */
        public boolean f41497s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int[] f90003toq;

        /* JADX INFO: renamed from: y */
        public int f41498y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int[] f90005zy;

        private C7309q() {
            this.f41493k = new ArrayList();
            this.f90003toq = null;
            this.f90005zy = null;
            this.f41496q = null;
            this.f41494n = 0;
            this.f41492g = -1;
            this.f90001f7l8 = -1;
            this.f41498y = -1;
            this.f41497s = false;
            this.f41495p = false;
            this.f90002ld6 = 0;
        }

        /* JADX INFO: renamed from: k */
        public void m26491k(int i2) {
            this.f41493k.add(Integer.valueOf(i2));
        }

        public String toString() {
            return "PreferenceGroupRect{preferenceList=" + this.f41493k + ", currentMovetb=" + Arrays.toString(this.f90003toq) + ", currentEndtb=" + Arrays.toString(this.f90005zy) + ", currentPrimetb=" + Arrays.toString(this.f41496q) + ", index=" + this.f41494n + ", primeIndex=" + this.f41492g + ", preViewHY=" + this.f90001f7l8 + ", nextViewY=" + this.f41498y + ", end=" + this.f41497s + '}';
        }

        /* synthetic */ C7309q(qrj qrjVar, ViewOnLayoutChangeListenerC7308k viewOnLayoutChangeListenerC7308k) {
            this();
        }
    }
}
