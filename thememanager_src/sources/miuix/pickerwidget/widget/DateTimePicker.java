package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.widget.NumberPicker;
import wtop.toq;
import zy.a9;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimePicker extends LinearLayout {

    /* JADX INFO: renamed from: c */
    private static final int f40873c = 1;

    /* JADX INFO: renamed from: e */
    private static final int f40874e = 5;

    /* JADX INFO: renamed from: j */
    private static final int f40875j = 4;

    /* JADX INFO: renamed from: m */
    private static toq f40876m = null;

    /* JADX INFO: renamed from: o */
    private static final int f40877o = 1;

    /* JADX INFO: renamed from: x */
    private static final int f40878x = 60;

    /* JADX INFO: renamed from: f */
    private boolean f40879f;

    /* JADX INFO: renamed from: g */
    private String[] f40880g;

    /* JADX INFO: renamed from: h */
    private C7230k f40881h;

    /* JADX INFO: renamed from: i */
    private int f40882i;

    /* JADX INFO: renamed from: k */
    private NumberPicker f40883k;

    /* JADX INFO: renamed from: l */
    String[] f40884l;

    /* JADX INFO: renamed from: n */
    private NumberPicker f40885n;

    /* JADX INFO: renamed from: p */
    private InterfaceC7239q f40886p;

    /* JADX INFO: renamed from: q */
    private NumberPicker f40887q;

    /* JADX INFO: renamed from: r */
    private C7230k f40888r;

    /* JADX INFO: renamed from: s */
    private toq f40889s;

    /* JADX INFO: renamed from: t */
    private C7230k f40890t;

    /* JADX INFO: renamed from: y */
    private toq f40891y;

    /* JADX INFO: renamed from: z */
    private int f40892z;

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal<C7230k> f40872b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    private static ThreadLocal<C7230k> f40871a = new ThreadLocal<>();

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.DateTimePicker$n */
    private class C7238n implements NumberPicker.ld6 {
        private C7238n() {
        }

        private void toq(DateTimePicker dateTimePicker) {
            DateTimePicker.this.sendAccessibilityEvent(4);
            if (DateTimePicker.this.f40886p != null) {
                DateTimePicker.this.f40886p.mo26336k(dateTimePicker, DateTimePicker.this.getTimeInMillis());
            }
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.ld6
        /* JADX INFO: renamed from: k */
        public void mo26324k(NumberPicker numberPicker, int i2, int i3) {
            if (numberPicker == DateTimePicker.this.f40883k) {
                DateTimePicker.this.f40881h.add(12, ((numberPicker.getValue() - DateTimePicker.this.f40892z) + 5) % 5 != 1 ? -1 : 1);
                DateTimePicker.this.f40892z = numberPicker.getValue();
            } else if (numberPicker == DateTimePicker.this.f40887q) {
                DateTimePicker.this.f40881h.set(18, DateTimePicker.this.f40887q.getValue());
            } else if (numberPicker == DateTimePicker.this.f40885n) {
                DateTimePicker.this.f40881h.set(20, DateTimePicker.this.f40882i * DateTimePicker.this.f40885n.getValue());
            }
            DateTimePicker.this.kja0();
            DateTimePicker.this.fn3e(false);
            DateTimePicker.this.zurt();
            DateTimePicker.this.ni7();
            toq(DateTimePicker.this);
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.DateTimePicker$q */
    public interface InterfaceC7239q {
        /* JADX INFO: renamed from: k */
        void mo26336k(DateTimePicker dateTimePicker, long j2);
    }

    public static class toq {

        /* JADX INFO: renamed from: k */
        protected Context f40896k;

        public toq(Context context) {
            this.f40896k = context.getApplicationContext();
        }

        /* JADX INFO: renamed from: k */
        public String mo26337k(int i2, int i3, int i4) {
            C7230k c7230k = (C7230k) DateTimePicker.f40871a.get();
            if (c7230k == null) {
                c7230k = new C7230k();
                DateTimePicker.f40871a.set(c7230k);
            }
            c7230k.set(1, i2);
            c7230k.set(5, i3);
            c7230k.set(9, i4);
            if (!Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
                return miuix.pickerwidget.date.zy.m26303k(this.f40896k, c7230k.getTimeInMillis(), 13696);
            }
            String strM26303k = miuix.pickerwidget.date.zy.m26303k(this.f40896k, c7230k.getTimeInMillis(), 4480);
            return strM26303k.replace(" ", "") + " " + miuix.pickerwidget.date.zy.m26303k(this.f40896k, c7230k.getTimeInMillis(), 9216);
        }
    }

    public static class zy extends toq {
        public zy(Context context) {
            super(context);
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.toq
        /* JADX INFO: renamed from: k */
        public String mo26337k(int i2, int i3, int i4) {
            C7230k c7230k = (C7230k) DateTimePicker.f40871a.get();
            if (c7230k == null) {
                c7230k = new C7230k();
                DateTimePicker.f40871a.set(c7230k);
            }
            c7230k.set(1, i2);
            c7230k.set(5, i3);
            c7230k.set(9, i4);
            Context context = this.f40896k;
            return c7230k.format(context, context.getString(toq.kja0.f97974cv06));
        }
    }

    public DateTimePicker(Context context) {
        this(context, null);
    }

    private int cdj(C7230k c7230k, C7230k c7230k2) {
        C7230k c7230k3 = (C7230k) c7230k.clone();
        C7230k c7230k4 = (C7230k) c7230k2.clone();
        c7230k3.set(18, 0);
        c7230k3.set(20, 0);
        c7230k3.set(21, 0);
        c7230k3.set(22, 0);
        c7230k4.set(18, 0);
        c7230k4.set(20, 0);
        c7230k4.set(21, 0);
        c7230k4.set(22, 0);
        return (int) (((((c7230k3.getTimeInMillis() / 1000) / 60) / 60) / 24) - ((((c7230k4.getTimeInMillis() / 1000) / 60) / 60) / 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(boolean z2) {
        String[] strArr;
        C7230k c7230k = this.f40890t;
        int iCdj = c7230k == null ? Integer.MAX_VALUE : cdj(this.f40881h, c7230k);
        C7230k c7230k2 = this.f40888r;
        int iCdj2 = c7230k2 != null ? cdj(c7230k2, this.f40881h) : Integer.MAX_VALUE;
        if (iCdj > 1 || iCdj2 > 1) {
            m26326h(this.f40883k, 0, 4);
            this.f40883k.setMinValue(0);
            this.f40883k.setMaxValue(4);
            if (iCdj <= 1) {
                this.f40883k.setValue(iCdj);
                this.f40892z = iCdj;
                this.f40883k.setWrapSelectorWheel(false);
            }
            if (iCdj2 <= 1) {
                int i2 = 4 - iCdj2;
                this.f40892z = i2;
                this.f40883k.setValue(i2);
                this.f40883k.setWrapSelectorWheel(false);
            }
            if (iCdj > 1 && iCdj2 > 1) {
                this.f40883k.setWrapSelectorWheel(true);
            }
        } else {
            int iCdj3 = cdj(this.f40888r, this.f40890t);
            m26326h(this.f40883k, 0, iCdj3);
            this.f40883k.setMinValue(0);
            this.f40883k.setMaxValue(iCdj3);
            this.f40883k.setValue(iCdj);
            this.f40892z = iCdj;
            this.f40883k.setWrapSelectorWheel(false);
        }
        int maxValue = (this.f40883k.getMaxValue() - this.f40883k.getMinValue()) + 1;
        if (z2 || (strArr = this.f40884l) == null || strArr.length != maxValue) {
            this.f40884l = new String[maxValue];
        }
        int value = this.f40883k.getValue();
        ThreadLocal<C7230k> threadLocal = f40872b;
        C7230k c7230k3 = threadLocal.get();
        if (c7230k3 == null) {
            c7230k3 = new C7230k();
            threadLocal.set(c7230k3);
        }
        c7230k3.setSafeTimeInMillis(this.f40881h.getTimeInMillis(), this.f40879f);
        this.f40884l[value] = ki(c7230k3.get(1), c7230k3.get(5), c7230k3.get(9));
        for (int i3 = 1; i3 <= 2; i3++) {
            c7230k3.add(12, 1);
            int i4 = (value + i3) % 5;
            String[] strArr2 = this.f40884l;
            if (i4 >= strArr2.length) {
                break;
            }
            strArr2[i4] = ki(c7230k3.get(1), c7230k3.get(5), c7230k3.get(9));
        }
        c7230k3.setSafeTimeInMillis(this.f40881h.getTimeInMillis(), this.f40879f);
        for (int i5 = 1; i5 <= 2; i5++) {
            c7230k3.add(12, -1);
            int i6 = ((value - i5) + 5) % 5;
            String[] strArr3 = this.f40884l;
            if (i6 >= strArr3.length) {
                break;
            }
            strArr3[i6] = ki(c7230k3.get(1), c7230k3.get(5), c7230k3.get(9));
        }
        this.f40883k.setDisplayedValues(this.f40884l);
    }

    /* JADX INFO: renamed from: h */
    private void m26326h(NumberPicker numberPicker, int i2, int i3) {
        String[] displayedValues = numberPicker.getDisplayedValues();
        if (displayedValues == null || displayedValues.length >= (i3 - i2) + 1) {
            return;
        }
        numberPicker.setDisplayedValues(null);
    }

    private String ki(int i2, int i3, int i4) {
        toq toqVar = f40876m;
        if (this.f40879f) {
            if (this.f40889s == null) {
                this.f40889s = new zy(getContext());
            }
            toqVar = this.f40889s;
        }
        toq toqVar2 = this.f40891y;
        if (toqVar2 != null) {
            toqVar = toqVar2;
        }
        return toqVar.mo26337k(i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0() {
        C7230k c7230k = this.f40890t;
        if (c7230k != null && c7230k.getTimeInMillis() > this.f40881h.getTimeInMillis()) {
            this.f40881h.setSafeTimeInMillis(this.f40890t.getTimeInMillis(), this.f40879f);
        }
        C7230k c7230k2 = this.f40888r;
        if (c7230k2 == null || c7230k2.getTimeInMillis() >= this.f40881h.getTimeInMillis()) {
            return;
        }
        this.f40881h.setSafeTimeInMillis(this.f40888r.getTimeInMillis(), this.f40879f);
    }

    private void n7h(C7230k c7230k, boolean z2) {
        c7230k.set(22, 0);
        c7230k.set(21, 0);
        int i2 = c7230k.get(20) % this.f40882i;
        if (i2 != 0) {
            if (!z2) {
                c7230k.add(20, -i2);
                return;
            }
            int i3 = c7230k.get(20);
            int i4 = this.f40882i;
            if ((i3 + i4) - i2 < 60) {
                c7230k.add(20, i4 - i2);
            } else {
                c7230k.add(18, 1);
                c7230k.set(20, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7() {
        boolean z2;
        C7230k c7230k = this.f40888r;
        if (c7230k != null && cdj(this.f40881h, c7230k) == 0 && this.f40881h.get(18) == this.f40888r.get(18)) {
            int i2 = this.f40888r.get(20);
            this.f40885n.setMinValue(0);
            this.f40885n.setMaxValue(i2 / this.f40882i);
            this.f40885n.setWrapSelectorWheel(false);
            z2 = true;
        } else {
            z2 = false;
        }
        C7230k c7230k2 = this.f40890t;
        if (c7230k2 != null && cdj(this.f40881h, c7230k2) == 0 && this.f40881h.get(18) == this.f40890t.get(18)) {
            this.f40885n.setMinValue(this.f40890t.get(20) / this.f40882i);
            this.f40885n.setWrapSelectorWheel(false);
            z2 = true;
        }
        if (!z2) {
            int i3 = this.f40882i;
            int i4 = 60 / i3;
            if (60 % i3 == 0) {
                i4--;
            }
            m26326h(this.f40885n, 0, i4);
            this.f40885n.setMinValue(0);
            this.f40885n.setMaxValue(i4);
            this.f40885n.setWrapSelectorWheel(true);
        }
        int maxValue = (this.f40885n.getMaxValue() - this.f40885n.getMinValue()) + 1;
        String[] strArr = this.f40880g;
        if (strArr == null || strArr.length != maxValue) {
            this.f40880g = new String[maxValue];
            for (int i5 = 0; i5 < maxValue; i5++) {
                this.f40880g[i5] = NumberPicker.a7kc.mo26361k((this.f40885n.getMinValue() + i5) * this.f40882i);
            }
            this.f40885n.setDisplayedValues(this.f40880g);
        }
        this.f40885n.setValue(this.f40881h.get(20) / this.f40882i);
    }

    private void t8r() {
        Resources resources = getResources();
        boolean z2 = false;
        boolean z3 = resources.getConfiguration().getLayoutDirection() == 1;
        boolean zStartsWith = resources.getString(toq.kja0.f98003ga).startsWith(AnimatedProperty.PROPERTY_NAME_H);
        if ((zStartsWith && z3) || (!zStartsWith && !z3)) {
            z2 = true;
        }
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) this.f40887q.getParent();
            viewGroup.removeView(this.f40887q);
            viewGroup.addView(this.f40887q, viewGroup.getChildCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zurt() {
        boolean z2;
        C7230k c7230k = this.f40888r;
        if (c7230k == null || cdj(this.f40881h, c7230k) != 0) {
            z2 = false;
        } else {
            this.f40887q.setMaxValue(this.f40888r.get(18));
            this.f40887q.setWrapSelectorWheel(false);
            z2 = true;
        }
        C7230k c7230k2 = this.f40890t;
        if (c7230k2 != null && cdj(this.f40881h, c7230k2) == 0) {
            this.f40887q.setMinValue(this.f40890t.get(18));
            this.f40887q.setWrapSelectorWheel(false);
            z2 = true;
        }
        if (!z2) {
            this.f40887q.setMinValue(0);
            this.f40887q.setMaxValue(23);
            this.f40887q.setWrapSelectorWheel(true);
        }
        this.f40887q.setValue(this.f40881h.get(18));
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

    public long getTimeInMillis() {
        return this.f40881h.getTimeInMillis();
    }

    /* JADX INFO: renamed from: i */
    public void m26333i(long j2) {
        this.f40881h.setSafeTimeInMillis(j2, this.f40879f);
        n7h(this.f40881h, true);
        kja0();
        fn3e(true);
        zurt();
        ni7();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DateTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DateTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(miuix.pickerwidget.date.zy.m26303k(getContext(), this.f40881h.getTimeInMillis(), 1420));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f40879f = savedState.f40894q;
        m26333i(savedState.toq());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getTimeInMillis(), this.f40879f);
    }

    public void setDayFormatter(toq toqVar) {
        this.f40891y = toqVar;
        fn3e(true);
    }

    public void setLunarMode(boolean z2) {
        boolean z3 = this.f40879f;
        this.f40879f = z2;
        fn3e(true);
        if (z3 != this.f40879f) {
            this.f40883k.requestLayout();
        }
    }

    public void setMaxDateTime(long j2) {
        if (j2 <= 0) {
            this.f40888r = null;
        } else {
            C7230k c7230k = new C7230k();
            this.f40888r = c7230k;
            c7230k.setSafeTimeInMillis(j2, this.f40879f);
            n7h(this.f40888r, false);
            C7230k c7230k2 = this.f40890t;
            if (c7230k2 != null && c7230k2.getTimeInMillis() > this.f40888r.getTimeInMillis()) {
                this.f40888r.setSafeTimeInMillis(this.f40890t.getTimeInMillis(), this.f40879f);
            }
        }
        kja0();
        fn3e(true);
        zurt();
        ni7();
    }

    public void setMinDateTime(long j2) {
        if (j2 <= 0) {
            this.f40890t = null;
        } else {
            C7230k c7230k = new C7230k();
            this.f40890t = c7230k;
            c7230k.setSafeTimeInMillis(j2, this.f40879f);
            if (this.f40890t.get(21) != 0 || this.f40890t.get(22) != 0) {
                this.f40890t.add(20, 1);
            }
            n7h(this.f40890t, true);
            C7230k c7230k2 = this.f40888r;
            if (c7230k2 != null && c7230k2.getTimeInMillis() < this.f40890t.getTimeInMillis()) {
                this.f40890t.setSafeTimeInMillis(this.f40888r.getTimeInMillis(), this.f40879f);
            }
        }
        kja0();
        fn3e(true);
        zurt();
        ni7();
    }

    public void setMinuteInterval(@a9(from = 1, to = 30) int i2) {
        if (this.f40882i == i2) {
            return;
        }
        this.f40882i = i2;
        n7h(this.f40881h, true);
        kja0();
        zurt();
        ni7();
    }

    public void setOnTimeChangedListener(InterfaceC7239q interfaceC7239q) {
        this.f40886p = interfaceC7239q;
    }

    public DateTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7741q.f98238kcsr);
    }

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.pickerwidget.widget.DateTimePicker.SavedState.1
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
        private long f40893k;

        /* JADX INFO: renamed from: q */
        private boolean f40894q;

        public SavedState(Parcelable parcelable, long j2, boolean z2) {
            super(parcelable);
            this.f40893k = j2;
            this.f40894q = z2;
        }

        public long toq() {
            return this.f40893k;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f40893k);
            parcel.writeInt(this.f40894q ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f40893k = parcel.readLong();
            this.f40894q = parcel.readInt() == 1;
        }
    }

    public DateTimePicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40882i = 1;
        this.f40890t = null;
        this.f40888r = null;
        this.f40884l = null;
        this.f40879f = false;
        f40876m = new toq(getContext());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(toq.x2.f98522a9, (ViewGroup) this, true);
        C7238n c7238n = new C7238n();
        C7230k c7230k = new C7230k();
        this.f40881h = c7230k;
        n7h(c7230k, true);
        ThreadLocal<C7230k> threadLocal = f40872b;
        C7230k c7230k2 = threadLocal.get();
        if (c7230k2 == null) {
            c7230k2 = new C7230k();
            threadLocal.set(c7230k2);
        }
        c7230k2.setSafeTimeInMillis(0L, this.f40879f);
        this.f40883k = (NumberPicker) findViewById(toq.C7742s.f45247x);
        this.f40887q = (NumberPicker) findViewById(toq.C7742s.f98503xwq3);
        this.f40885n = (NumberPicker) findViewById(toq.C7742s.f98406g1);
        this.f40883k.setOnValueChangedListener(c7238n);
        this.f40883k.setMaxFlingSpeedFactor(3.0f);
        this.f40887q.setOnValueChangedListener(c7238n);
        this.f40885n.setOnValueChangedListener(c7238n);
        this.f40885n.setMinValue(0);
        this.f40885n.setMaxValue(59);
        this.f40887q.setFormatter(NumberPicker.a7kc);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.cdj.zaso, i2, 0);
        this.f40879f = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.mkmm, false);
        typedArrayObtainStyledAttributes.recycle();
        t8r();
        kja0();
        fn3e(true);
        zurt();
        ni7();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
