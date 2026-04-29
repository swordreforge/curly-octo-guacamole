package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.market.sdk.utils.C5016s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.date.zy;
import miuix.pickerwidget.widget.NumberPicker;
import wtop.toq;

/* JADX INFO: loaded from: classes3.dex */
public class DatePicker extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private static final int f40840a = 12;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static String[] f87996ab = null;

    /* JADX INFO: renamed from: b */
    private static final int f40841b = 2100;
    private static String[] bb = null;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f87997bo = 0;
    private static String[] bp = null;
    private static String bv = null;

    /* JADX INFO: renamed from: d */
    private static final boolean f40842d = true;

    /* JADX INFO: renamed from: j */
    private static final String f40843j = DatePicker.class.getSimpleName();

    /* JADX INFO: renamed from: m */
    private static final int f40844m = 1900;

    /* JADX INFO: renamed from: o */
    private static final String f40845o = "MM/dd/yyyy";

    /* JADX INFO: renamed from: u */
    private static final int f40846u = 0;

    /* JADX INFO: renamed from: v */
    private static final boolean f40847v = false;

    /* JADX INFO: renamed from: w */
    private static final boolean f40848w = true;

    /* JADX INFO: renamed from: x */
    private static final int f40849x = 0;

    /* JADX INFO: renamed from: c */
    private boolean f40850c;

    /* JADX INFO: renamed from: e */
    private boolean f40851e;

    /* JADX INFO: renamed from: f */
    private C7230k f40852f;

    /* JADX INFO: renamed from: g */
    private final NumberPicker f40853g;

    /* JADX INFO: renamed from: h */
    private char[] f40854h;

    /* JADX INFO: renamed from: i */
    private final DateFormat f40855i;

    /* JADX INFO: renamed from: k */
    private final LinearLayout f40856k;

    /* JADX INFO: renamed from: l */
    private C7230k f40857l;

    /* JADX INFO: renamed from: n */
    private final NumberPicker f40858n;

    /* JADX INFO: renamed from: p */
    private String[] f40859p;

    /* JADX INFO: renamed from: q */
    private final NumberPicker f40860q;

    /* JADX INFO: renamed from: r */
    private C7230k f40861r;

    /* JADX INFO: renamed from: s */
    private toq f40862s;

    /* JADX INFO: renamed from: t */
    private C7230k f40863t;

    /* JADX INFO: renamed from: y */
    private Locale f40864y;

    /* JADX INFO: renamed from: z */
    private int f40865z;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.pickerwidget.widget.DatePicker.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        private final boolean f40866g;

        /* JADX INFO: renamed from: k */
        private final int f40867k;

        /* JADX INFO: renamed from: n */
        private final int f40868n;

        /* JADX INFO: renamed from: q */
        private final int f40869q;

        /* synthetic */ SavedState(Parcel parcel, C7235k c7235k) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40867k);
            parcel.writeInt(this.f40869q);
            parcel.writeInt(this.f40868n);
            parcel.writeInt(this.f40866g ? 1 : 0);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i2, int i3, int i4, boolean z2, C7235k c7235k) {
            this(parcelable, i2, i3, i4, z2);
        }

        private SavedState(Parcelable parcelable, int i2, int i3, int i4, boolean z2) {
            super(parcelable);
            this.f40867k = i2;
            this.f40869q = i3;
            this.f40868n = i4;
            this.f40866g = z2;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f40867k = parcel.readInt();
            this.f40869q = parcel.readInt();
            this.f40868n = parcel.readInt();
            this.f40866g = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.DatePicker$k */
    class C7235k implements NumberPicker.ld6 {
        C7235k() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.ld6
        /* JADX INFO: renamed from: k */
        public void mo26324k(NumberPicker numberPicker, int i2, int i3) {
            DatePicker.this.f40863t.setSafeTimeInMillis(DatePicker.this.f40852f.getTimeInMillis(), DatePicker.this.f40851e);
            if (numberPicker == DatePicker.this.f40860q) {
                DatePicker.this.f40863t.add(DatePicker.this.f40851e ? 10 : 9, i3 - i2);
            } else if (numberPicker == DatePicker.this.f40858n) {
                DatePicker.this.f40863t.add(DatePicker.this.f40851e ? 6 : 5, i3 - i2);
            } else {
                if (numberPicker != DatePicker.this.f40853g) {
                    throw new IllegalArgumentException();
                }
                DatePicker.this.f40863t.set(DatePicker.this.f40851e ? 2 : 1, i3);
            }
            DatePicker datePicker = DatePicker.this;
            datePicker.m26313i(datePicker.f40863t.get(1), DatePicker.this.f40863t.get(5), DatePicker.this.f40863t.get(9));
            if (numberPicker == DatePicker.this.f40853g) {
                DatePicker.this.t8r();
            }
            DatePicker.this.wvg();
            DatePicker.this.m26312h();
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo25091k(DatePicker datePicker, int i2, int i3, int i4, boolean z2);
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    private boolean cdj(String str, C7230k c7230k) {
        try {
            c7230k.setSafeTimeInMillis(this.f40855i.parse(str).getTime(), this.f40851e);
            return true;
        } catch (ParseException unused) {
            Log.w(f40843j, "Date: " + str + " not in format: " + f40845o);
            return false;
        }
    }

    private void fn3e(NumberPicker numberPicker, int i2, int i3) {
        ((TextView) numberPicker.findViewById(toq.C7742s.f98432ktq)).setImeOptions(i3 < i2 + (-1) ? 5 : 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m26312h() {
        sendAccessibilityEvent(4);
        toq toqVar = this.f40862s;
        if (toqVar != null) {
            toqVar.mo25091k(this, getYear(), getMonth(), getDayOfMonth(), this.f40851e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m26313i(int i2, int i3, int i4) {
        this.f40852f.set(i2, i3, i4, 12, 0, 0, 0);
        if (this.f40852f.before(this.f40861r)) {
            this.f40852f.setSafeTimeInMillis(this.f40861r.getTimeInMillis(), this.f40851e);
        } else if (this.f40852f.after(this.f40857l)) {
            this.f40852f.setSafeTimeInMillis(this.f40857l.getTimeInMillis(), this.f40851e);
        }
    }

    private void ki() {
        this.f40856k.removeAllViews();
        char[] dateFormatOrder = this.f40854h;
        if (dateFormatOrder == null) {
            dateFormatOrder = android.text.format.DateFormat.getDateFormatOrder(getContext());
        }
        int length = dateFormatOrder.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = dateFormatOrder[i2];
            if (c2 == 'M') {
                this.f40856k.addView(this.f40858n);
                fn3e(this.f40858n, length, i2);
            } else if (c2 == 'd') {
                this.f40856k.addView(this.f40860q);
                fn3e(this.f40860q, length, i2);
            } else {
                if (c2 != 'y') {
                    throw new IllegalArgumentException();
                }
                this.f40856k.addView(this.f40853g);
                fn3e(this.f40853g, length, i2);
            }
        }
    }

    private boolean kja0(int i2, int i3, int i4) {
        return (this.f40852f.get(1) == i2 && this.f40852f.get(5) == i4 && this.f40852f.get(9) == i3) ? false : true;
    }

    private int ld6(C7230k c7230k, boolean z2) {
        if (!z2) {
            return c7230k.get(5);
        }
        int i2 = c7230k.get(6);
        int chineseLeapMonth = c7230k.getChineseLeapMonth();
        if (chineseLeapMonth >= 0) {
            return c7230k.isChineseLeapMonth() || i2 > chineseLeapMonth ? i2 + 1 : i2;
        }
        return i2;
    }

    private void o1t() {
        NumberPicker numberPicker = this.f40860q;
        if (numberPicker == null || this.f40853g == null) {
            return;
        }
        numberPicker.setFormatter(NumberPicker.a7kc);
        this.f40853g.setFormatter(new NumberPicker.C7246s());
    }

    private void qrj() {
        String[] strArr;
        if (f87996ab == null) {
            f87996ab = miuix.pickerwidget.date.toq.n7h(getContext()).zy();
        }
        if (bb == null) {
            bb = miuix.pickerwidget.date.toq.n7h(getContext()).m26293g();
            Resources resources = getContext().getResources();
            int i2 = 0;
            while (true) {
                strArr = bb;
                if (i2 >= strArr.length) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr2 = bb;
                sb.append(strArr2[i2]);
                sb.append(resources.getString(toq.kja0.f45178u));
                strArr2[i2] = sb.toString();
                i2++;
            }
            bp = new String[strArr.length + 1];
        }
        if (bv == null) {
            bv = miuix.pickerwidget.date.toq.n7h(getContext()).m26296n()[1];
        }
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f40864y)) {
            return;
        }
        this.f40864y = locale;
        this.f40865z = this.f40863t.getActualMaximum(5) + 1;
        t8r();
        o1t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        int i2 = 0;
        if (this.f40851e) {
            int chineseLeapMonth = this.f40852f.getChineseLeapMonth();
            if (chineseLeapMonth < 0) {
                this.f40859p = bb;
                return;
            }
            String[] strArr = bp;
            this.f40859p = strArr;
            int i3 = chineseLeapMonth + 1;
            System.arraycopy(bb, 0, strArr, 0, i3);
            String[] strArr2 = bb;
            System.arraycopy(strArr2, chineseLeapMonth, this.f40859p, i3, strArr2.length - chineseLeapMonth);
            this.f40859p[i3] = bv + this.f40859p[i3];
            return;
        }
        if (C5016s.f28231k.equals(this.f40864y.getLanguage().toLowerCase())) {
            this.f40859p = miuix.pickerwidget.date.toq.n7h(getContext()).kja0();
            return;
        }
        this.f40859p = new String[12];
        while (true) {
            String[] strArr3 = this.f40859p;
            if (i2 >= strArr3.length) {
                return;
            }
            int i4 = i2 + 1;
            strArr3[i2] = NumberPicker.a7kc.mo26361k(i4);
            i2 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wvg() {
        if (this.f40851e) {
            this.f40860q.setLabel(null);
            this.f40858n.setLabel(null);
            this.f40853g.setLabel(null);
        } else {
            this.f40860q.setLabel(getContext().getString(toq.kja0.f98090r8s8));
            this.f40858n.setLabel(getContext().getString(toq.kja0.f98050m4));
            this.f40853g.setLabel(getContext().getString(toq.kja0.f98110v0af));
        }
        this.f40860q.setDisplayedValues(null);
        this.f40860q.setMinValue(1);
        this.f40860q.setMaxValue(this.f40851e ? this.f40852f.getActualMaximum(10) : this.f40852f.getActualMaximum(9));
        this.f40860q.setWrapSelectorWheel(true);
        this.f40858n.setDisplayedValues(null);
        this.f40858n.setMinValue(0);
        NumberPicker numberPicker = this.f40858n;
        int i2 = 11;
        if (this.f40851e && this.f40852f.getChineseLeapMonth() >= 0) {
            i2 = 12;
        }
        numberPicker.setMaxValue(i2);
        this.f40858n.setWrapSelectorWheel(true);
        int i3 = this.f40851e ? 2 : 1;
        if (this.f40852f.get(i3) == this.f40861r.get(i3)) {
            this.f40858n.setMinValue(ld6(this.f40861r, this.f40851e));
            this.f40858n.setWrapSelectorWheel(false);
            int i4 = this.f40851e ? 6 : 5;
            if (this.f40852f.get(i4) == this.f40861r.get(i4)) {
                this.f40860q.setMinValue(this.f40851e ? this.f40861r.get(10) : this.f40861r.get(9));
                this.f40860q.setWrapSelectorWheel(false);
            }
        }
        if (this.f40852f.get(i3) == this.f40857l.get(i3)) {
            this.f40858n.setMaxValue(ld6(this.f40857l, this.f40851e));
            this.f40858n.setWrapSelectorWheel(false);
            this.f40858n.setDisplayedValues(null);
            int i5 = this.f40851e ? 6 : 5;
            if (this.f40852f.get(i5) == this.f40857l.get(i5)) {
                this.f40860q.setMaxValue(this.f40851e ? this.f40857l.get(10) : this.f40857l.get(9));
                this.f40860q.setWrapSelectorWheel(false);
            }
        }
        this.f40858n.setDisplayedValues((String[]) Arrays.copyOfRange(this.f40859p, this.f40858n.getMinValue(), this.f40859p.length));
        if (this.f40851e) {
            this.f40860q.setDisplayedValues((String[]) Arrays.copyOfRange(f87996ab, this.f40860q.getMinValue() - 1, f87996ab.length));
        }
        int i6 = n7h() ? 2 : 1;
        this.f40853g.setMinValue(this.f40861r.get(i6));
        this.f40853g.setMaxValue(this.f40857l.get(i6));
        this.f40853g.setWrapSelectorWheel(false);
        if (this.f40851e) {
            this.f40853g.setValue(this.f40852f.get(2));
            this.f40858n.setValue(ld6(this.f40852f, true));
            this.f40860q.setValue(this.f40852f.get(10));
        } else {
            this.f40853g.setValue(this.f40852f.get(1));
            this.f40858n.setValue(this.f40852f.get(5));
            this.f40860q.setValue(this.f40852f.get(9));
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void fu4(boolean z2) {
        this.f40853g.setVisibility(z2 ? 0 : 8);
    }

    public int getDayOfMonth() {
        return this.f40852f.get(this.f40851e ? 10 : 9);
    }

    public long getMaxDate() {
        return this.f40857l.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f40861r.getTimeInMillis();
    }

    public int getMonth() {
        return this.f40851e ? this.f40852f.isChineseLeapMonth() ? this.f40852f.get(6) + 12 : this.f40852f.get(6) : this.f40852f.get(5);
    }

    public boolean getSpinnersShown() {
        return this.f40856k.isShown();
    }

    public int getYear() {
        return this.f40852f.get(this.f40851e ? 2 : 1);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f40850c;
    }

    public boolean n7h() {
        return this.f40851e;
    }

    public void ni7(boolean z2) {
        this.f40858n.setVisibility(z2 ? 0 : 8);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DatePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DatePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(zy.m26303k(getContext(), this.f40852f.getTimeInMillis(), zy.f87989qrj));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m26313i(savedState.f40867k, savedState.f40869q, savedState.f40868n);
        if (this.f40851e != savedState.f40866g) {
            this.f40851e = savedState.f40866g;
            t8r();
        }
        wvg();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f40852f.get(1), this.f40852f.get(5), this.f40852f.get(9), this.f40851e, null);
    }

    public void setDateFormatOrder(char[] cArr) {
        this.f40854h = cArr;
        ki();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        if (this.f40850c == z2) {
            return;
        }
        super.setEnabled(z2);
        this.f40860q.setEnabled(z2);
        this.f40858n.setEnabled(z2);
        this.f40853g.setEnabled(z2);
        this.f40850c = z2;
    }

    public void setLunarMode(boolean z2) {
        if (z2 != this.f40851e) {
            this.f40851e = z2;
            t8r();
            wvg();
        }
    }

    public void setMaxDate(long j2) {
        this.f40863t.setSafeTimeInMillis(j2, this.f40851e);
        if (this.f40863t.get(1) == this.f40857l.get(1) && this.f40863t.get(12) == this.f40857l.get(12)) {
            return;
        }
        this.f40857l.setSafeTimeInMillis(j2, this.f40851e);
        if (this.f40852f.after(this.f40857l)) {
            this.f40852f.setSafeTimeInMillis(this.f40857l.getTimeInMillis(), this.f40851e);
            t8r();
        }
        wvg();
    }

    public void setMinDate(long j2) {
        this.f40863t.setSafeTimeInMillis(j2, this.f40851e);
        if (this.f40863t.get(1) == this.f40861r.get(1) && this.f40863t.get(12) == this.f40861r.get(12)) {
            return;
        }
        this.f40861r.setSafeTimeInMillis(j2, this.f40851e);
        if (this.f40852f.before(this.f40861r)) {
            this.f40852f.setSafeTimeInMillis(this.f40861r.getTimeInMillis(), this.f40851e);
            t8r();
        }
        wvg();
    }

    public void setSpinnersShown(boolean z2) {
        this.f40856k.setVisibility(z2 ? 0 : 8);
    }

    public void x2(int i2, int i3, int i4, toq toqVar) {
        m26313i(i2, i3, i4);
        wvg();
        this.f40862s = toqVar;
    }

    /* JADX INFO: renamed from: z */
    public void m26320z(int i2, int i3, int i4) {
        if (kja0(i2, i3, i4)) {
            m26313i(i2, i3, i4);
            wvg();
            m26312h();
        }
    }

    public void zurt(boolean z2) {
        this.f40860q.setVisibility(z2 ? 0 : 8);
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7741q.f98347yqrt);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        String str;
        super(context, attributeSet, i2);
        this.f40855i = new SimpleDateFormat(f40845o);
        this.f40850c = true;
        this.f40851e = false;
        qrj();
        this.f40863t = new C7230k();
        this.f40861r = new C7230k();
        this.f40857l = new C7230k();
        this.f40852f = new C7230k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.cdj.d9i, i2, toq.C7737h.j3px);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.ybb, true);
        int i4 = typedArrayObtainStyledAttributes.getInt(toq.cdj.xo, f40844m);
        int i5 = typedArrayObtainStyledAttributes.getInt(toq.cdj.ie, f40841b);
        String string = typedArrayObtainStyledAttributes.getString(toq.cdj.rig);
        String string2 = typedArrayObtainStyledAttributes.getString(toq.cdj.l0);
        int i6 = toq.x2.f98533jk;
        this.f40851e = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.jog, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.jglj, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.sm, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.zi4o, true);
        typedArrayObtainStyledAttributes.recycle();
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i6, (ViewGroup) this, true);
        C7235k c7235k = new C7235k();
        this.f40856k = (LinearLayout) findViewById(toq.C7742s.f98414h7am);
        NumberPicker numberPicker = (NumberPicker) findViewById(toq.C7742s.f45247x);
        this.f40860q = numberPicker;
        numberPicker.setOnLongPressUpdateInterval(100L);
        numberPicker.setOnValueChangedListener(c7235k);
        if (!z6) {
            numberPicker.setVisibility(8);
        }
        NumberPicker numberPicker2 = (NumberPicker) findViewById(toq.C7742s.f98377bwp);
        this.f40858n = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(this.f40865z - 1);
        numberPicker2.setDisplayedValues(this.f40859p);
        numberPicker2.setOnLongPressUpdateInterval(200L);
        numberPicker2.setOnValueChangedListener(c7235k);
        if (!z5) {
            numberPicker2.setVisibility(8);
        }
        NumberPicker numberPicker3 = (NumberPicker) findViewById(toq.C7742s.f98376bqie);
        this.f40853g = numberPicker3;
        numberPicker3.setOnLongPressUpdateInterval(100L);
        numberPicker3.setOnValueChangedListener(c7235k);
        if (!z3) {
            numberPicker3.setVisibility(8);
        }
        o1t();
        if (!z2) {
            i3 = 1;
            setSpinnersShown(true);
        } else {
            i3 = 1;
            setSpinnersShown(z2);
        }
        this.f40852f.setSafeTimeInMillis(System.currentTimeMillis(), this.f40851e);
        x2(this.f40852f.get(i3), this.f40852f.get(5), this.f40852f.get(9), null);
        this.f40863t.setSafeTimeInMillis(0L, this.f40851e);
        if (!TextUtils.isEmpty(string)) {
            if (cdj(string, this.f40863t)) {
                str = string2;
            } else {
                str = string2;
                this.f40863t.set(i4, 0, 1, 12, 0, 0, 0);
            }
        } else {
            str = string2;
            if (!cdj("1/31/1900", this.f40863t)) {
                this.f40863t.set(i4, 0, 1, 12, 0, 0, 0);
            }
        }
        setMinDate(this.f40863t.getTimeInMillis());
        this.f40863t.setSafeTimeInMillis(0L, this.f40851e);
        if (TextUtils.isEmpty(str) || !cdj(str, this.f40863t)) {
            this.f40863t.set(i5, 11, 31, 12, 0, 0, 0);
        }
        setMaxDate(this.f40863t.getTimeInMillis());
        ki();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
