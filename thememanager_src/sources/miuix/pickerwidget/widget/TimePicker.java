package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.internal.widget.ProperPaddingViewGroup;
import miuix.pickerwidget.widget.NumberPicker;
import wtop.toq;

/* JADX INFO: loaded from: classes3.dex */
public class TimePicker extends FrameLayout {

    /* JADX INFO: renamed from: f */
    private static final InterfaceC7249g f40954f = new C7250k();

    /* JADX INFO: renamed from: l */
    private static final int f40955l = 12;

    /* JADX INFO: renamed from: r */
    private static final boolean f40956r = true;

    /* JADX INFO: renamed from: g */
    private final NumberPicker f40957g;

    /* JADX INFO: renamed from: h */
    private InterfaceC7249g f40958h;

    /* JADX INFO: renamed from: i */
    private C7230k f40959i;

    /* JADX INFO: renamed from: k */
    private boolean f40960k;

    /* JADX INFO: renamed from: n */
    private final NumberPicker f40961n;

    /* JADX INFO: renamed from: p */
    private boolean f40962p;

    /* JADX INFO: renamed from: q */
    private boolean f40963q;

    /* JADX INFO: renamed from: s */
    private final Button f40964s;

    /* JADX INFO: renamed from: t */
    private ProperPaddingViewGroup f40965t;

    /* JADX INFO: renamed from: y */
    private final NumberPicker f40966y;

    /* JADX INFO: renamed from: z */
    private Locale f40967z;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.pickerwidget.widget.TimePicker.SavedState.1
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

        /* JADX INFO: renamed from: k */
        private final int f40968k;

        /* JADX INFO: renamed from: q */
        private final int f40969q;

        /* synthetic */ SavedState(Parcel parcel, C7250k c7250k) {
            this(parcel);
        }

        /* JADX INFO: renamed from: k */
        public int m26384k() {
            return this.f40968k;
        }

        public int toq() {
            return this.f40969q;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40968k);
            parcel.writeInt(this.f40969q);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i2, int i3, C7250k c7250k) {
            this(parcelable, i2, i3);
        }

        private SavedState(Parcelable parcelable, int i2, int i3) {
            super(parcelable);
            this.f40968k = i2;
            this.f40969q = i3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f40968k = parcel.readInt();
            this.f40969q = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.TimePicker$g */
    public interface InterfaceC7249g {
        /* JADX INFO: renamed from: k */
        void mo26386k(TimePicker timePicker, int i2, int i3);
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.TimePicker$k */
    class C7250k implements InterfaceC7249g {
        C7250k() {
        }

        @Override // miuix.pickerwidget.widget.TimePicker.InterfaceC7249g
        /* JADX INFO: renamed from: k */
        public void mo26386k(TimePicker timePicker, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.TimePicker$n */
    class C7251n implements NumberPicker.ld6 {
        C7251n() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.ld6
        /* JADX INFO: renamed from: k */
        public void mo26324k(NumberPicker numberPicker, int i2, int i3) {
            numberPicker.requestFocus();
            TimePicker.this.f40963q = !r1.f40963q;
            TimePicker.this.m26381s();
            TimePicker.this.f7l8();
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.TimePicker$q */
    class ViewOnClickListenerC7252q implements View.OnClickListener {
        ViewOnClickListenerC7252q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.requestFocus();
            TimePicker.this.f40963q = !r2.f40963q;
            TimePicker.this.m26381s();
            TimePicker.this.f7l8();
        }
    }

    class toq implements NumberPicker.ld6 {
        toq() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.ld6
        /* JADX INFO: renamed from: k */
        public void mo26324k(NumberPicker numberPicker, int i2, int i3) {
            if (!TimePicker.this.m26383n() && ((i2 == 11 && i3 == 12) || (i2 == 12 && i3 == 11))) {
                TimePicker.this.f40963q = !r2.f40963q;
                TimePicker.this.m26381s();
            }
            TimePicker.this.f7l8();
        }
    }

    class zy implements NumberPicker.ld6 {
        zy() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.ld6
        /* JADX INFO: renamed from: k */
        public void mo26324k(NumberPicker numberPicker, int i2, int i3) {
            TimePicker.this.f7l8();
        }
    }

    public TimePicker(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        sendAccessibilityEvent(4);
        InterfaceC7249g interfaceC7249g = this.f40958h;
        if (interfaceC7249g != null) {
            interfaceC7249g.mo26386k(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m26377g() {
        return getContext().getString(toq.kja0.f98007gcp).startsWith("a");
    }

    /* JADX INFO: renamed from: p */
    private void m26379p() {
        if (m26383n()) {
            this.f40961n.setMinValue(0);
            this.f40961n.setMaxValue(23);
            this.f40961n.setFormatter(NumberPicker.a7kc);
        } else {
            this.f40961n.setMinValue(1);
            this.f40961n.setMaxValue(12);
            this.f40961n.setFormatter(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m26381s() {
        if (m26383n()) {
            NumberPicker numberPicker = this.f40966y;
            if (numberPicker != null) {
                numberPicker.setVisibility(8);
            } else {
                this.f40964s.setVisibility(8);
            }
        } else {
            int i2 = !this.f40963q ? 1 : 0;
            NumberPicker numberPicker2 = this.f40966y;
            if (numberPicker2 != null) {
                numberPicker2.setValue(i2);
                this.f40966y.setVisibility(0);
            } else {
                this.f40964s.setText(miuix.pickerwidget.date.toq.n7h(getContext()).toq()[i2]);
                this.f40964s.setVisibility(0);
            }
        }
        sendAccessibilityEvent(4);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f40967z)) {
            return;
        }
        this.f40967z = locale;
        if (this.f40959i == null) {
            this.f40959i = new C7230k();
        }
    }

    /* JADX INFO: renamed from: y */
    private void m26382y(View view, int i2, int i3) {
        View viewFindViewById = view.findViewById(i2);
        if (viewFindViewById != null) {
            viewFindViewById.setContentDescription(getContext().getString(i3));
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f40961n.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.f40961n.getValue();
        return m26383n() ? Integer.valueOf(value) : this.f40963q ? Integer.valueOf(value % 12) : Integer.valueOf((value % 12) + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f40957g.getValue());
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f40962p;
    }

    /* JADX INFO: renamed from: n */
    public boolean m26383n() {
        return this.f40960k;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TimePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TimePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        int i2 = this.f40960k ? 44 : 28;
        this.f40959i.set(18, getCurrentHour().intValue());
        this.f40959i.set(20, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(miuix.pickerwidget.date.zy.m26303k(getContext(), this.f40959i.getTimeInMillis(), i2));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.m26384k()));
        setCurrentMinute(Integer.valueOf(savedState.toq()));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), null);
    }

    public void set24HourView(Boolean bool) {
        if (this.f40960k == bool.booleanValue()) {
            return;
        }
        this.f40960k = bool.booleanValue();
        int iIntValue = getCurrentHour().intValue();
        m26379p();
        setCurrentHour(Integer.valueOf(iIntValue));
        m26381s();
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num.equals(getCurrentHour())) {
            return;
        }
        if (!m26383n()) {
            if (num.intValue() >= 12) {
                this.f40963q = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.f40963q = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            m26381s();
        }
        this.f40961n.setValue(num.intValue());
        f7l8();
    }

    public void setCurrentMinute(Integer num) {
        if (num.equals(getCurrentMinute())) {
            return;
        }
        this.f40957g.setValue(num.intValue());
        f7l8();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        if (this.f40962p == z2) {
            return;
        }
        super.setEnabled(z2);
        this.f40957g.setEnabled(z2);
        this.f40961n.setEnabled(z2);
        NumberPicker numberPicker = this.f40966y;
        if (numberPicker != null) {
            numberPicker.setEnabled(z2);
        } else {
            this.f40964s.setEnabled(z2);
        }
        this.f40962p = z2;
    }

    public void setFixedContentHorizontalPadding(int i2, int i3) {
        this.f40965t.setFixedContentHorizontalPadding(i2, i3);
    }

    public void setOnTimeChangedListener(InterfaceC7249g interfaceC7249g) {
        this.f40958h = interfaceC7249g;
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40962p = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(toq.x2.f98534jp0y, (ViewGroup) this, true);
        this.f40965t = (ProperPaddingViewGroup) findViewById(toq.C7742s.f98506yl);
        NumberPicker numberPicker = (NumberPicker) findViewById(toq.C7742s.f98503xwq3);
        this.f40961n = numberPicker;
        numberPicker.setOnValueChangedListener(new toq());
        int i3 = toq.C7742s.f98432ktq;
        ((EditText) numberPicker.findViewById(i3)).setImeOptions(5);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(toq.C7742s.f98406g1);
        this.f40957g = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setOnLongPressUpdateInterval(100L);
        numberPicker2.setFormatter(NumberPicker.a7kc);
        numberPicker2.setOnValueChangedListener(new zy());
        ((EditText) numberPicker2.findViewById(i3)).setImeOptions(5);
        View viewFindViewById = findViewById(toq.C7742s.f45233j);
        if (viewFindViewById instanceof Button) {
            this.f40966y = null;
            Button button = (Button) viewFindViewById;
            this.f40964s = button;
            button.setOnClickListener(new ViewOnClickListenerC7252q());
        } else {
            this.f40964s = null;
            NumberPicker numberPicker3 = (NumberPicker) viewFindViewById;
            this.f40966y = numberPicker3;
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(1);
            numberPicker3.setDisplayedValues(miuix.pickerwidget.date.toq.n7h(getContext()).toq());
            numberPicker3.setOnValueChangedListener(new C7251n());
            ((EditText) numberPicker3.findViewById(i3)).setImeOptions(6);
        }
        if (m26377g()) {
            ViewGroup viewGroup = (ViewGroup) findViewById(toq.C7742s.f98394ec);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(viewFindViewById, 0);
        }
        m26379p();
        m26381s();
        setOnTimeChangedListener(f40954f);
        setCurrentHour(Integer.valueOf(this.f40959i.get(18)));
        setCurrentMinute(Integer.valueOf(this.f40959i.get(20)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
