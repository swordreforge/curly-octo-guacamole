package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
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
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.core.view.C0683f;
import androidx.core.view.InterfaceC0704l;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC0704l {

    /* JADX INFO: renamed from: f */
    private static final int f753f = -1;

    /* JADX INFO: renamed from: i */
    private static final int[] f754i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: l */
    private static final int f755l = 1;

    /* JADX INFO: renamed from: r */
    private static final int f756r = 0;

    /* JADX INFO: renamed from: t */
    private static final String f757t = "AppCompatSpinner";

    /* JADX INFO: renamed from: z */
    private static final int f758z = 15;

    /* JADX INFO: renamed from: g */
    private SpinnerAdapter f759g;

    /* JADX INFO: renamed from: h */
    final Rect f760h;

    /* JADX INFO: renamed from: k */
    private final C0206n f761k;

    /* JADX INFO: renamed from: n */
    private dd f762n;

    /* JADX INFO: renamed from: p */
    int f763p;

    /* JADX INFO: renamed from: q */
    private final Context f764q;

    /* JADX INFO: renamed from: s */
    private InterfaceC0157g f765s;

    /* JADX INFO: renamed from: y */
    private final boolean f766y;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
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
        boolean f767k;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f767k ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f767k = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    @zy.yz
    interface InterfaceC0157g {
        void dismiss();

        Drawable getBackground();

        boolean isShowing();

        /* JADX INFO: renamed from: k */
        int mo452k();

        int ld6();

        /* JADX INFO: renamed from: n */
        void mo453n(int i2);

        /* JADX INFO: renamed from: p */
        int mo454p();

        /* JADX INFO: renamed from: q */
        void mo455q(CharSequence charSequence);

        /* JADX INFO: renamed from: s */
        void mo456s(int i2, int i3);

        void setBackgroundDrawable(Drawable drawable);

        void toq(int i2);

        void x2(ListAdapter listAdapter);

        /* JADX INFO: renamed from: y */
        void mo457y(int i2);

        CharSequence zy();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$k */
    class C0158k extends dd {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0159n f769z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0158k(View view, C0159n c0159n) {
            super(view);
            this.f769z = c0159n;
        }

        @Override // androidx.appcompat.widget.dd
        public androidx.appcompat.view.menu.cdj toq() {
            return this.f769z;
        }

        @Override // androidx.appcompat.widget.dd
        @SuppressLint({"SyntheticAccessor"})
        public boolean zy() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.toq();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$n */
    @zy.yz
    class C0159n extends n5r1 implements InterfaceC0157g {
        ListAdapter aj;
        private CharSequence be;
        private final Rect bs;
        private int k0;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$n$k */
        class k implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AppCompatSpinner f770k;

            k(AppCompatSpinner appCompatSpinner) {
                this.f770k = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AppCompatSpinner.this.setSelection(i2);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0159n c0159n = C0159n.this;
                    AppCompatSpinner.this.performItemClick(view, i2, c0159n.aj.getItemId(i2));
                }
                C0159n.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$n$toq */
        class toq implements ViewTreeObserver.OnGlobalLayoutListener {
            toq() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0159n c0159n = C0159n.this;
                if (!c0159n.m459x(AppCompatSpinner.this)) {
                    C0159n.this.dismiss();
                } else {
                    C0159n.this.zp();
                    C0159n.super.mo318g();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$n$zy */
        class zy implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f773k;

            zy(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f773k = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f773k);
                }
            }
        }

        public C0159n(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.bs = new Rect();
            x9kr(AppCompatSpinner.this);
            nn86(true);
            yz(0);
            m670j(new k(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public int ld6() {
            return this.k0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: q */
        public void mo455q(CharSequence charSequence) {
            this.be = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: s */
        public void mo456s(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            zp();
            uv6(2);
            super.mo318g();
            ListView listViewN7h = n7h();
            listViewN7h.setChoiceMode(1);
            listViewN7h.setTextDirection(i2);
            listViewN7h.setTextAlignment(i3);
            m664b(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            toq toqVar = new toq();
            viewTreeObserver.addOnGlobalLayoutListener(toqVar);
            hb(new zy(toqVar));
        }

        /* JADX INFO: renamed from: x */
        boolean m459x(View view) {
            return C0683f.zsr0(view) && view.getGlobalVisibleRect(this.bs);
        }

        @Override // androidx.appcompat.widget.n5r1, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public void x2(ListAdapter listAdapter) {
            super.x2(listAdapter);
            this.aj = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: y */
        public void mo457y(int i2) {
            this.k0 = i2;
        }

        void zp() {
            Drawable background = getBackground();
            int i2 = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f760h);
                i2 = nmn5.toq(AppCompatSpinner.this) ? AppCompatSpinner.this.f760h.right : -AppCompatSpinner.this.f760h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f760h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f763p;
            if (i3 == -2) {
                int iM450k = appCompatSpinner.m450k((SpinnerAdapter) this.aj, getBackground());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f760h;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (iM450k > i5) {
                    iM450k = i5;
                }
                m672l(Math.max(iM450k, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                m672l((width - paddingLeft) - paddingRight);
            } else {
                m672l(i3);
            }
            toq(nmn5.toq(AppCompatSpinner.this) ? i2 + (((width - paddingRight) - a9()) - ld6()) : i2 + paddingLeft + ld6());
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public CharSequence zy() {
            return this.be;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$q */
    private static class C0160q implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: k */
        private SpinnerAdapter f775k;

        /* JADX INFO: renamed from: q */
        private ListAdapter f776q;

        public C0160q(@zy.dd SpinnerAdapter spinnerAdapter, @zy.dd Resources.Theme theme) {
            this.f775k = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f776q = (ListAdapter) spinnerAdapter;
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
            ListAdapter listAdapter = this.f776q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f775k;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f775k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f775k;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f775k;
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
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f775k;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f776q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f775k;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f775k;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.toq();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @zy.yz
    class zy implements InterfaceC0157g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        @zy.yz
        DialogInterfaceC0102q f779k;

        /* JADX INFO: renamed from: n */
        private CharSequence f780n;

        /* JADX INFO: renamed from: q */
        private ListAdapter f781q;

        zy() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public void dismiss() {
            DialogInterfaceC0102q dialogInterfaceC0102q = this.f779k;
            if (dialogInterfaceC0102q != null) {
                dialogInterfaceC0102q.dismiss();
                this.f779k = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public boolean isShowing() {
            DialogInterfaceC0102q dialogInterfaceC0102q = this.f779k;
            if (dialogInterfaceC0102q != null) {
                return dialogInterfaceC0102q.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: k */
        public int mo452k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public int ld6() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: n */
        public void mo453n(int i2) {
            Log.e(AppCompatSpinner.f757t, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f781q.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: p */
        public int mo454p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: q */
        public void mo455q(CharSequence charSequence) {
            this.f780n = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: s */
        public void mo456s(int i2, int i3) {
            if (this.f781q == null) {
                return;
            }
            DialogInterfaceC0102q.k kVar = new DialogInterfaceC0102q.k(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f780n;
            if (charSequence != null) {
                kVar.setTitle(charSequence);
            }
            DialogInterfaceC0102q dialogInterfaceC0102qCreate = kVar.jk(this.f781q, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f779k = dialogInterfaceC0102qCreate;
            ListView listViewF7l8 = dialogInterfaceC0102qCreate.f7l8();
            listViewF7l8.setTextDirection(i2);
            listViewF7l8.setTextAlignment(i3);
            this.f779k.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(AppCompatSpinner.f757t, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public void toq(int i2) {
            Log.e(AppCompatSpinner.f757t, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public void x2(ListAdapter listAdapter) {
            this.f781q = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        /* JADX INFO: renamed from: y */
        public void mo457y(int i2) {
            Log.e(AppCompatSpinner.f757t, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0157g
        public CharSequence zy() {
            return this.f780n;
        }
    }

    public AppCompatSpinner(@zy.lvui Context context) {
        this(context, (AttributeSet) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            c0206n.toq();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0157g interfaceC0157g = this.f765s;
        return interfaceC0157g != null ? interfaceC0157g.mo452k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0157g interfaceC0157g = this.f765s;
        return interfaceC0157g != null ? interfaceC0157g.mo454p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f765s != null ? this.f763p : super.getDropDownWidth();
    }

    @zy.yz
    final InterfaceC0157g getInternalPopup() {
        return this.f765s;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0157g interfaceC0157g = this.f765s;
        return interfaceC0157g != null ? interfaceC0157g.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f764q;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0157g interfaceC0157g = this.f765s;
        return interfaceC0157g != null ? interfaceC0157g.zy() : super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    int m450k(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.f760h);
        Rect rect = this.f760h;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g == null || !interfaceC0157g.isShowing()) {
            return;
        }
        this.f765s.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f765s == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m450k(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f767k || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new toq());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0157g interfaceC0157g = this.f765s;
        savedState.f767k = interfaceC0157g != null && interfaceC0157g.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dd ddVar = this.f762n;
        if (ddVar == null || !ddVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g == null) {
            return super.performClick();
        }
        if (interfaceC0157g.isShowing()) {
            return true;
        }
        toq();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0157g.mo457y(i2);
            this.f765s.toq(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g != null) {
            interfaceC0157g.mo453n(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f765s != null) {
            this.f763p = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g != null) {
            interfaceC0157g.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@zy.fn3e int i2) {
        setPopupBackgroundDrawable(C6045k.toq(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0157g interfaceC0157g = this.f765s;
        if (interfaceC0157g != null) {
            interfaceC0157g.mo455q(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f761k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    void toq() {
        this.f765s.mo456s(getTextDirection(), getTextAlignment());
    }

    public AppCompatSpinner(@zy.lvui Context context, int i2) {
        this(context, null, C7397k.toq.f92828c25, i2);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f766y) {
            this.f759g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f765s != null) {
            Context context = this.f764q;
            if (context == null) {
                context = getContext();
            }
            this.f765s.x2(new C0160q(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92828c25);
    }

    public AppCompatSpinner(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(@zy.lvui android.content.Context r7, @zy.dd android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
