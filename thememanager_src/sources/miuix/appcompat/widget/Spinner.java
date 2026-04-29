package miuix.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.C0136q;
import androidx.appcompat.widget.InterfaceC0204m;
import androidx.appcompat.widget.nmn5;
import androidx.core.graphics.x2;
import androidx.core.view.C0683f;
import androidx.core.view.tfm;
import gb.toq;
import java.lang.reflect.Field;
import miuix.animation.Folme;
import miuix.animation.IFolme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.adapter.C6897k;
import miuix.appcompat.app.fti;
import miuix.appcompat.app.ki;
import miuix.appcompat.internal.adapter.C6963k;
import miuix.core.util.C7080i;
import miuix.internal.util.C7169q;
import miuix.internal.util.ld6;
import miuix.internal.util.n7h;
import miuix.internal.widget.C7177g;
import miuix.view.C7380g;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import p023g.C6045k;
import zy.dd;
import zy.fn3e;

/* JADX INFO: loaded from: classes3.dex */
public class Spinner extends android.widget.Spinner {

    /* JADX INFO: renamed from: b */
    private static Field f39648b = null;

    /* JADX INFO: renamed from: c */
    private static final int f39649c = 8;

    /* JADX INFO: renamed from: e */
    private static final String f39650e = "Spinner";

    /* JADX INFO: renamed from: f */
    private static final int f39651f = 15;

    /* JADX INFO: renamed from: j */
    private static final int f39652j = 0;

    /* JADX INFO: renamed from: m */
    private static final int f39653m = -1;

    /* JADX INFO: renamed from: o */
    private static final int f39654o = 1;

    /* JADX INFO: renamed from: g */
    private boolean f39655g;

    /* JADX INFO: renamed from: h */
    int f39656h;

    /* JADX INFO: renamed from: i */
    int f39657i;

    /* JADX INFO: renamed from: k */
    private final Context f39658k;

    /* JADX INFO: renamed from: l */
    private f7l8 f39659l;

    /* JADX INFO: renamed from: n */
    private final boolean f39660n;

    /* JADX INFO: renamed from: p */
    int f39661p;

    /* JADX INFO: renamed from: q */
    private SpinnerAdapter f39662q;

    /* JADX INFO: renamed from: r */
    final Rect f39663r;

    /* JADX INFO: renamed from: s */
    private IFolme f39664s;

    /* JADX INFO: renamed from: t */
    private float f39665t;

    /* JADX INFO: renamed from: y */
    private InterfaceC7055s f39666y;

    /* JADX INFO: renamed from: z */
    private float f39667z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.appcompat.widget.Spinner.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        boolean f39668k;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f39668k ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f39668k = parcel.readByte() != 0;
        }
    }

    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        void mo25459k();
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$g */
    private class C7051g extends C7177g implements InterfaceC7055s {
        private static final int aj = -1;
        private static final float ay = 0.1f;
        private static final float be = 0.1f;
        private int ac;
        private int ad;
        private CharSequence an;
        private int as;
        private int ax;
        private int az;
        private View ba;
        private int bg;
        private int bl;
        private int bq;
        ListAdapter id;
        private final Rect in;

        /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$g$k */
        class k implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Spinner f39669k;

            k(Spinner spinner) {
                this.f39669k = spinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                Spinner.this.setSelection(i2);
                Spinner.this.ki();
                if (Spinner.this.getOnItemClickListener() != null) {
                    C7051g c7051g = C7051g.this;
                    Spinner.this.performItemClick(view, i2, c7051g.id.getItemId(i2));
                }
                C7051g.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$g$toq */
        class toq implements PopupWindow.OnDismissListener {
            toq() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                Spinner.this.qrj();
            }
        }

        public C7051g(Context context, AttributeSet attributeSet, int i2) {
            super(context);
            this.in = new Rect();
            this.az = -1;
            Resources resources = context.getResources();
            this.as = context.getResources().getDimensionPixelSize(toq.f7l8.vibj);
            this.ad = resources.getDimensionPixelSize(toq.f7l8.fv);
            this.bg = resources.getDimensionPixelSize(toq.f7l8.id);
            this.bq = ((resources.getDimensionPixelSize(toq.f7l8.zaso) * 2) + resources.getDimensionPixelSize(toq.f7l8.zi4o)) * 2;
            m26039m(8388659);
            m26034b(new k(Spinner.this));
        }

        private void bo(int i2, int i3) {
            ListView listViewDd = dd();
            listViewDd.setChoiceMode(1);
            listViewDd.setTextDirection(i2);
            listViewDd.setTextAlignment(i3);
            int selectedItemPosition = Spinner.this.getSelectedItemPosition();
            listViewDd.setSelection(selectedItemPosition);
            listViewDd.setItemChecked(selectedItemPosition, true);
        }

        private void ch() {
            if (this.ba != null) {
                return;
            }
            Spinner spinner = Spinner.this;
            if ((spinner.getContext() instanceof fti) && ((fti) spinner.getContext()).isInFloatingWindowMode()) {
                gyi(spinner.getRootView().findViewById(toq.C6054p.f34891e));
            }
        }

        private int lv5() {
            ListView listViewDd = dd();
            int width = getWidth();
            if (listViewDd == null || listViewDd.getAdapter() == null) {
                this.f40470i.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = 0 + this.f40470i.getMeasuredHeight();
                this.ac = measuredHeight;
                return measuredHeight;
            }
            ListAdapter adapter = listViewDd.getAdapter();
            int count = adapter.getCount();
            if (count >= 8) {
                count = 8;
            }
            int measuredHeight2 = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, null, listViewDd);
                view.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight2 += view.getMeasuredHeight();
                if (i2 == count - 1) {
                    this.ac = measuredHeight2;
                }
            }
            return measuredHeight2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int t8iq(int r9, int r10, int r11, int r12, android.graphics.Rect r13) {
            /*
                r8 = this;
                int r0 = r8.as
                int r1 = r13.left
                int r1 = java.lang.Math.max(r0, r1)
                int r13 = r13.right
                int r13 = java.lang.Math.max(r0, r13)
                int r0 = r8.getWidth()
                int r2 = r8.ad
                if (r0 <= r2) goto L1b
                r8.setWidth(r2)
                int r0 = r8.ad
            L1b:
                int r2 = r9 + r10
                int r3 = r11 + r12
                int r4 = r9 + r0
                int r4 = r4 + r1
                r5 = 1
                r6 = 0
                if (r4 > r12) goto L28
                r4 = r5
                goto L29
            L28:
                r4 = r6
            L29:
                int r7 = r2 - r0
                int r7 = r7 - r13
                if (r7 < 0) goto L2f
                goto L30
            L2f:
                r5 = r6
            L30:
                if (r4 == 0) goto L38
                if (r9 >= r1) goto L36
            L34:
                int r11 = r11 + r1
                goto L4d
            L36:
                int r11 = r11 + r9
                goto L4d
            L38:
                if (r5 == 0) goto L41
                int r12 = r12 - r13
                if (r2 <= r12) goto L3e
                goto L49
            L3e:
                int r11 = r11 + r2
                int r11 = r11 - r0
                goto L4d
            L41:
                int r9 = r12 - r2
                int r12 = r12 - r10
                int r12 = r12 / 2
                if (r9 < r12) goto L49
                goto L34
            L49:
                int r9 = r3 - r13
                int r11 = r9 - r0
            L4d:
                int r9 = r11 + r0
                int r3 = r3 - r13
                if (r9 <= r3) goto L55
                int r1 = r3 - r0
                goto L59
            L55:
                if (r11 >= r1) goto L58
                goto L59
            L58:
                r1 = r11
            L59:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.widget.Spinner.C7051g.t8iq(int, int, int, int, android.graphics.Rect):int");
        }

        /* JADX INFO: renamed from: u */
        private int m25460u(int i2, int i3, int i4, int i5, Rect rect) {
            int iMax;
            int i6;
            int i7;
            int i8;
            int i9 = this.bg;
            int i10 = rect.top;
            int i11 = rect.bottom;
            int iMax2 = Math.max(i9, i10);
            int iMax3 = Math.max(i9, i11);
            int i12 = iMax2 + iMax3;
            this.ax = (i5 - iMax2) - iMax3;
            int iLv5 = lv5();
            int iMin = Math.min(this.ax, this.ac);
            this.ax = iMin;
            if (iLv5 > iMin) {
                iLv5 = iMin;
            }
            setHeight(iLv5);
            m26036j(getHeight());
            int i13 = i4 + i5;
            int i14 = i3 + i2;
            int iMin2 = i5 - i12;
            if (i14 + iLv5 <= iMin2) {
                return i14 < iMax2 ? i4 + iMax2 : i4 + i14;
            }
            if (i2 - iLv5 >= iMax2) {
                return i2 > i5 - iMax3 ? (i13 - iMax3) - iLv5 : (i4 + i2) - iLv5;
            }
            if (i14 >= iMax2) {
                int i15 = i13 - iMax3;
                if (i2 > i15) {
                    iMax = i15 - iMin2;
                } else if (i2 < i5 / 2) {
                    iMin2 -= i14;
                    i7 = i4 + i14;
                    if (iMin2 < iLv5 && iMin2 < (i8 = this.bq)) {
                        iMin2 = Math.min(iLv5, i8);
                        iMax = Math.min(i14, (i13 - iMin2) - iMax3);
                    }
                } else {
                    iMin2 = i2 - iMax2;
                    int i16 = (i4 + i2) - iMin2;
                    if (iMin2 >= iLv5 || iMin2 >= (i6 = this.bq)) {
                        iMax = i16;
                    } else {
                        iMin2 = Math.min(iLv5, i6);
                        iMax = Math.max(i2 - iMin2, i4 + iMax2);
                    }
                }
                setHeight(Math.min(iMin2, this.ax));
                m26036j(getHeight());
                return iMax;
            }
            i7 = i4 + iMax2;
            iMax = i7;
            setHeight(Math.min(iMin2, this.ax));
            m26036j(getHeight());
            return iMax;
        }

        private void xwq3(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            View rootView = view.getRootView();
            Point point = new Point(rootView.getWidth(), rootView.getHeight());
            View rootView2 = this.ba;
            if (rootView2 == null) {
                rootView2 = view.getRootView();
            }
            View view2 = rootView2;
            view2.getLocationInWindow(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = i2 - i4;
            int i7 = i3 - i5;
            Rect rect = new Rect();
            WindowInsets rootWindowInsets = Spinner.this.getRootWindowInsets();
            if (rootWindowInsets != null) {
                x2 x2VarM3466g = tfm.eqxt(rootWindowInsets).m3466g(tfm.qrj.m3498s() | tfm.qrj.zy());
                rect.set(x2VarM3466g.f3600k, x2VarM3466g.f50489toq, x2VarM3466g.f50490zy, x2VarM3466g.f3601q);
            }
            rect.left = Math.max(0, rect.left - i4);
            rect.right = Math.max(0, rect.right - (point.x - (view2.getWidth() + i4)));
            rect.top = Math.max(0, rect.top - i5);
            rect.bottom = Math.max(0, rect.bottom - (point.y - (view2.getHeight() + i5)));
            int iT8iq = t8iq(i6, view.getWidth(), i4, view2.getWidth(), rect);
            int iM25460u = m25460u(i7, view.getHeight(), i5, view2.getHeight(), rect);
            if (isShowing()) {
                update(iT8iq, iM25460u, getWidth(), getHeight());
            } else {
                showAtLocation(view, 0, iT8iq, iM25460u);
                C7177g.fti(this.f40469h.getRootView());
            }
        }

        boolean c8jq(View view) {
            return C0683f.zsr0(view) && view.getGlobalVisibleRect(this.in);
        }

        public void dr(int i2) {
            this.az = i2;
        }

        public void gyi(View view) {
            this.ba = view;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public int ld6() {
            return this.bl;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void n7h(int i2, int i3, float f2, float f3) {
            ch();
            boolean zIsShowing = isShowing();
            nmn5();
            setInputMethodMode(2);
            View rootView = Spinner.this.getRootView();
            Rect rect = new Rect();
            n7h.m25961y(rootView, rect);
            if (m26035e(Spinner.this, null, rect)) {
                xwq3(Spinner.this);
            }
            bo(i2, i3);
            if (zIsShowing) {
                return;
            }
            setOnDismissListener(new toq());
        }

        void nmn5() {
            Drawable background = getBackground();
            int i2 = 0;
            if (background != null) {
                background.getPadding(Spinner.this.f39663r);
                i2 = nmn5.toq(Spinner.this) ? Spinner.this.f39663r.right : -Spinner.this.f39663r.left;
            } else {
                Rect rect = Spinner.this.f39663r;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = Spinner.this.getPaddingLeft();
            int paddingRight = Spinner.this.getPaddingRight();
            int width = Spinner.this.getWidth();
            Spinner spinner = Spinner.this;
            int i3 = spinner.f39661p;
            if (i3 == -2) {
                int iF7l8 = spinner.f7l8((SpinnerAdapter) this.id, getBackground());
                int i4 = Spinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = Spinner.this.f39663r;
                int i5 = (i4 - rect2.left) - rect2.right;
                int i6 = this.as;
                int i7 = i5 - (i6 * 2);
                if (iF7l8 > i7) {
                    iF7l8 = i7;
                }
                mo25461o(Math.max(iF7l8, ((width - paddingLeft) - paddingRight) - (i6 * 2)));
            } else if (i3 == -1) {
                mo25461o(((width - paddingLeft) - paddingRight) - (this.as * 2));
            } else {
                mo25461o(i3);
            }
            toq(nmn5.toq(Spinner.this) ? i2 + (((width - paddingRight) - getWidth()) - ld6()) : i2 + paddingLeft + ld6());
        }

        @Override // miuix.internal.widget.C7177g
        /* JADX INFO: renamed from: o */
        public void mo25461o(int i2) {
            super.mo25461o(Math.max(Math.min(i2, Spinner.this.f39657i), Spinner.this.f39656h));
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: q */
        public void mo25462q(CharSequence charSequence) {
            this.an = charSequence;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: s */
        public void mo25463s(int i2, int i3) {
            n7h(i2, i3, 0.0f, 0.0f);
        }

        @Override // miuix.internal.widget.C7177g, miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void x2(ListAdapter listAdapter) {
            super.x2(listAdapter);
            this.id = listAdapter;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: y */
        public void mo25464y(int i2) {
            this.bl = i2;
        }

        protected boolean y2() {
            ListView listViewDd = dd();
            if (listViewDd.getFirstVisiblePosition() != 0 || listViewDd.getLastVisiblePosition() != listViewDd.getAdapter().getCount() - 1) {
                return true;
            }
            int measuredHeight = 0;
            for (int i2 = 0; i2 <= listViewDd.getLastVisiblePosition(); i2++) {
                measuredHeight += listViewDd.getChildAt(i2).getMeasuredHeight();
            }
            return listViewDd.getMeasuredHeight() < measuredHeight;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public CharSequence zy() {
            return this.an;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$k */
    class ViewTreeObserverOnGlobalLayoutListenerC7052k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC7052k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!Spinner.this.f39666y.isShowing()) {
                Spinner.this.kja0();
            }
            ViewTreeObserver viewTreeObserver = Spinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$n */
    private static class C7053n extends C7054q {
        C7053n(@dd SpinnerAdapter spinnerAdapter, @dd Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }

        @Override // miuix.appcompat.widget.Spinner.C7054q, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            ld6.zy(view2, i2, getCount());
            return view2;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$q */
    private static class C7054q implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: k */
        private SpinnerAdapter f39673k;

        /* JADX INFO: renamed from: q */
        private ListAdapter f39674q;

        public C7054q(@dd SpinnerAdapter spinnerAdapter, @dd Resources.Theme theme) {
            this.f39673k = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f39674q = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0204m) {
                    InterfaceC0204m interfaceC0204m = (InterfaceC0204m) spinnerAdapter;
                    if (interfaceC0204m.getDropDownViewTheme() == null) {
                        interfaceC0204m.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f39674q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            View dropDownView = getDropDownView(i2, view, viewGroup);
            if (view == null) {
                C7169q.toq(dropDownView);
            }
            return dropDownView;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f39674q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f39673k;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$s */
    private interface InterfaceC7055s {
        void dismiss();

        Drawable getBackground();

        boolean isShowing();

        /* JADX INFO: renamed from: k */
        int mo25465k();

        int ld6();

        /* JADX INFO: renamed from: n */
        void mo25466n(int i2);

        void n7h(int i2, int i3, float f2, float f3);

        /* JADX INFO: renamed from: p */
        int mo25467p();

        /* JADX INFO: renamed from: q */
        void mo25462q(CharSequence charSequence);

        /* JADX INFO: renamed from: s */
        void mo25463s(int i2, int i3);

        void setBackgroundDrawable(Drawable drawable);

        void toq(int i2);

        void x2(ListAdapter listAdapter);

        /* JADX INFO: renamed from: y */
        void mo25464y(int i2);

        CharSequence zy();
    }

    private class toq implements InterfaceC7055s, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        ki f39676k;

        /* JADX INFO: renamed from: n */
        private CharSequence f39677n;

        /* JADX INFO: renamed from: q */
        private ListAdapter f39678q;

        /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$toq$k */
        class DialogInterfaceOnDismissListenerC7056k implements DialogInterface.OnDismissListener {
            DialogInterfaceOnDismissListenerC7056k() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                Spinner.this.qrj();
            }
        }

        private toq() {
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void dismiss() {
            ki kiVar = this.f39676k;
            if (kiVar != null) {
                kiVar.dismiss();
                this.f39676k = null;
            }
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public Drawable getBackground() {
            return null;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public boolean isShowing() {
            ki kiVar = this.f39676k;
            return kiVar != null && kiVar.isShowing();
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: k */
        public int mo25465k() {
            return 0;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public int ld6() {
            return 0;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: n */
        public void mo25466n(int i2) {
            Log.e(Spinner.f39650e, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void n7h(int i2, int i3, float f2, float f3) {
            mo25463s(i2, i3);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            Spinner.this.setSelection(i2);
            HapticCompat.performHapticFeedback(Spinner.this, C7385p.f92232cdj);
            if (Spinner.this.getOnItemClickListener() != null) {
                Spinner.this.performItemClick(null, i2, this.f39678q.getItemId(i2));
            }
            dismiss();
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: p */
        public int mo25467p() {
            return 0;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: q */
        public void mo25462q(CharSequence charSequence) {
            this.f39677n = charSequence;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: s */
        public void mo25463s(int i2, int i3) {
            if (this.f39678q == null) {
                return;
            }
            ki.C6947k c6947k = new ki.C6947k(Spinner.this.getPopupContext());
            CharSequence charSequence = this.f39677n;
            if (charSequence != null) {
                c6947k.uv6(charSequence);
            }
            ki kiVarM25037g = c6947k.m25036f(this.f39678q, Spinner.this.getSelectedItemPosition(), this).oc(new DialogInterfaceOnDismissListenerC7056k()).m25037g();
            this.f39676k = kiVarM25037g;
            ListView listViewCdj = kiVarM25037g.cdj();
            listViewCdj.setTextDirection(i2);
            listViewCdj.setTextAlignment(i3);
            this.f39676k.show();
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(Spinner.f39650e, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void toq(int i2) {
            Log.e(Spinner.f39650e, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public void x2(ListAdapter listAdapter) {
            this.f39678q = listAdapter;
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        /* JADX INFO: renamed from: y */
        public void mo25464y(int i2) {
            Log.e(Spinner.f39650e, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // miuix.appcompat.widget.Spinner.InterfaceC7055s
        public CharSequence zy() {
            return this.f39677n;
        }

        /* synthetic */ toq(Spinner spinner, ViewTreeObserverOnGlobalLayoutListenerC7052k viewTreeObserverOnGlobalLayoutListenerC7052k) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.Spinner$y */
    private static class C7057y implements C6963k.toq {

        /* JADX INFO: renamed from: k */
        private Spinner f39680k;

        public C7057y(Spinner spinner) {
            this.f39680k = spinner;
        }

        @Override // miuix.appcompat.internal.adapter.C6963k.toq
        /* JADX INFO: renamed from: k */
        public boolean mo25093k(int i2) {
            return this.f39680k.getSelectedItemPosition() == i2;
        }
    }

    private static class zy extends C7054q {
        zy(@dd SpinnerAdapter spinnerAdapter, @dd Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }
    }

    static {
        try {
            Field declaredField = android.widget.Spinner.class.getDeclaredField("mForwardingListener");
            f39648b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.e(f39650e, "static initializer: ", e2);
        }
    }

    public Spinner(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean cdj() {
        sendAccessibilityEvent(1);
        return false;
    }

    /* JADX INFO: renamed from: g */
    private void m25450g() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (!(interfaceC7055s instanceof C7051g) || ((C7051g) interfaceC7055s).getHeight() <= 0) {
            return;
        }
        ((C7051g) this.f39666y).setHeight(-2);
        ((C7051g) this.f39666y).setWidth(-2);
    }

    private IFolme getFolmeAnimTarget() {
        if (this.f39664s == null) {
            this.f39664s = Folme.useAt(this);
        }
        return this.f39664s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki() {
        HapticCompat.m26766g(this, C7385p.f92242jp0y, C7385p.f92251qrj);
    }

    private void ld6() {
        Field field = f39648b;
        if (field == null) {
            return;
        }
        try {
            field.set(this, null);
        } catch (IllegalAccessException e2) {
            Log.e(f39650e, "makeSupperForwardingListenerInvalid: ", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m25452n() {
        if (getBackground() != null) {
            getFolmeAnimTarget().touch().setTintMode(1).setScale(1.0f, new ITouchStyle.TouchType[0]).touchDown(new AnimConfig[0]);
            this.f39655g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m25453p() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s != null && interfaceC7055s.isShowing() && (this.f39666y instanceof C7051g)) {
            if (miuix.core.util.ld6.qrj(this.f39658k)) {
                m25457s();
            } else {
                Point pointQrj = C7080i.qrj(getPopupContext());
                m25456h(pointQrj.x * this.f39667z, pointQrj.y * this.f39665t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj() {
        getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
        x2();
    }

    private void x2() {
        f7l8 f7l8Var = this.f39659l;
        if (f7l8Var != null) {
            f7l8Var.mo25459k();
        }
    }

    /* JADX INFO: renamed from: y */
    private int m25455y(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null || spinnerAdapter.getCount() == 0) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        View view = spinnerAdapter.getView(Math.max(0, Math.min(spinnerAdapter.getCount() - 1, getSelectedItemPosition())), null, this);
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMax = Math.max(0, view.getMeasuredWidth());
        if (drawable == null) {
            return iMax;
        }
        drawable.getPadding(this.f39663r);
        Rect rect = this.f39663r;
        return iMax + rect.left + rect.right;
    }

    int f7l8(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f39663r);
        Rect rect = this.f39663r;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        return interfaceC7055s != null ? interfaceC7055s.mo25465k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        return interfaceC7055s != null ? interfaceC7055s.mo25467p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f39666y != null ? this.f39661p : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        return interfaceC7055s != null ? interfaceC7055s.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f39658k;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        return interfaceC7055s != null ? interfaceC7055s.zy() : super.getPrompt();
    }

    /* JADX INFO: renamed from: h */
    void m25456h(float f2, float f3) {
        this.f39666y.n7h(getTextDirection(), getTextAlignment(), f2, f3);
    }

    void kja0() {
        getLocationInWindow(new int[2]);
        m25456h(r0[0], r0[1]);
    }

    public boolean n7h(float f2, float f3) {
        Point pointQrj = C7080i.qrj(getPopupContext());
        this.f39667z = f2 / pointQrj.x;
        this.f39665t = f3 / pointQrj.y;
        if (cdj()) {
            return true;
        }
        if (this.f39666y == null) {
            return super.performClick();
        }
        m25450g();
        if (!this.f39666y.isShowing()) {
            m25456h(f2, f3);
            HapticCompat.m26766g(this, C7385p.f92242jp0y, C7385p.f92232cdj);
        }
        return true;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new Runnable() { // from class: miuix.appcompat.widget.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f39735k.m25453p();
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s == null || !interfaceC7055s.isShowing()) {
            return;
        }
        this.f39666y.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f39666y == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.min(getMeasuredWidth(), m25455y(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f39668k || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7052k());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC7055s interfaceC7055s = this.f39666y;
        savedState.f39668k = interfaceC7055s != null && interfaceC7055s.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m25452n();
        }
        if (this.f39655g && ((motionEvent.getAction() == 1 && !isPressed()) || motionEvent.getAction() == 3)) {
            getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
            this.f39655g = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        getLocationInWindow(new int[2]);
        return n7h(r0[0], r0[1]);
    }

    /* JADX INFO: renamed from: s */
    void m25457s() {
        this.f39666y.dismiss();
    }

    public void setDoubleLineContentAdapter(C6897k c6897k) {
        setAdapter((SpinnerAdapter) new C6963k(getContext(), toq.qrj.f76748se, c6897k, new C7057y(this)));
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC7055s.mo25464y(i2);
            this.f39666y.toq(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s != null) {
            interfaceC7055s.mo25466n(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f39666y != null) {
            this.f39661p = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setFenceView(View view) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s instanceof C7051g) {
            ((C7051g) interfaceC7055s).gyi(view);
        }
    }

    public void setFenceX(int i2) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s instanceof C7051g) {
            ((C7051g) interfaceC7055s).dr(i2);
        }
    }

    public void setFenceXFromView(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setFenceX(iArr[0]);
    }

    public void setOnSpinnerDismissListener(f7l8 f7l8Var) {
        this.f39659l = f7l8Var;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s != null) {
            interfaceC7055s.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@fn3e int i2) {
        setPopupBackgroundDrawable(C6045k.toq(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s != null) {
            interfaceC7055s.mo25462q(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int i2) {
        super.setSelection(i2);
        getFolmeAnimTarget().touch().touchUp(new AnimConfig[0]);
    }

    public Spinner(Context context, int i2) {
        this(context, null, toq.C6055q.n8, i2);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f39660n) {
            this.f39662q = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC7055s interfaceC7055s = this.f39666y;
        if (interfaceC7055s instanceof toq) {
            interfaceC7055s.x2(new zy(spinnerAdapter, getPopupContext().getTheme()));
        } else if (interfaceC7055s instanceof C7051g) {
            interfaceC7055s.x2(new C7053n(spinnerAdapter, getPopupContext().getTheme()));
        }
    }

    public Spinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C6055q.n8);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        this.f39655g = false;
        this.f39663r = new Rect();
        int[] iArr = toq.ki.bvt;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (theme != null) {
            this.f39658k = new C0136q(context, theme);
        } else {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(toq.ki.fx, 0);
            if (resourceId != 0) {
                this.f39658k = new C0136q(context, resourceId);
            } else {
                this.f39658k = context;
            }
        }
        i3 = i3 == -1 ? typedArrayObtainStyledAttributes.getInt(toq.ki.wa, 0) : i3;
        ViewTreeObserverOnGlobalLayoutListenerC7052k viewTreeObserverOnGlobalLayoutListenerC7052k = null;
        if (i3 == 0) {
            toq toqVar = new toq(this, viewTreeObserverOnGlobalLayoutListenerC7052k);
            this.f39666y = toqVar;
            toqVar.mo25462q(typedArrayObtainStyledAttributes.getString(toq.ki.tre1));
        } else if (i3 == 1) {
            C7051g c7051g = new C7051g(this.f39658k, attributeSet, i2);
            TypedArray typedArrayObtainStyledAttributes2 = this.f39658k.obtainStyledAttributes(attributeSet, iArr, i2, 0);
            this.f39661p = typedArrayObtainStyledAttributes2.getLayoutDimension(toq.ki.iz1i, -2);
            this.f39656h = typedArrayObtainStyledAttributes2.getLayoutDimension(toq.ki.eyzx, -2);
            this.f39657i = typedArrayObtainStyledAttributes2.getLayoutDimension(toq.ki.qj, -2);
            int i4 = toq.ki.pstq;
            int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            if (resourceId2 != 0) {
                setPopupBackgroundResource(resourceId2);
            } else {
                c7051g.setBackgroundDrawable(typedArrayObtainStyledAttributes2.getDrawable(i4));
            }
            c7051g.mo25462q(typedArrayObtainStyledAttributes.getString(toq.ki.tre1));
            typedArrayObtainStyledAttributes2.recycle();
            this.f39666y = c7051g;
        }
        ld6();
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(toq.ki.g5n4);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, toq.qrj.f76748se, R.id.text1, textArray);
            arrayAdapter.setDropDownViewResource(toq.qrj.f76682bwp);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f39660n = true;
        SpinnerAdapter spinnerAdapter = this.f39662q;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f39662q = null;
        }
        C7380g.toq(this, false);
    }
}
