package miuix.stretchablewidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.slidingwidget.widget.SlidingButton;
import miuix.stretchablewidget.toq;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class StretchableDatePicker extends StretchableWidget {

    /* JADX INFO: renamed from: a */
    private SlidingButton f41898a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f90410ab;
    private long an;

    /* JADX INFO: renamed from: b */
    private DateTimePicker f41899b;
    private boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private C7230k f90411bo;
    private boolean bp;
    private int bv;

    /* JADX INFO: renamed from: d */
    private TextView f41900d;
    private zy id;

    /* JADX INFO: renamed from: u */
    private RelativeLayout f41901u;

    /* JADX INFO: renamed from: v */
    private DateTimePicker.zy f41902v;

    /* JADX INFO: renamed from: w */
    private String f41903w;

    /* JADX INFO: renamed from: x */
    private LinearLayout f41904x;

    /* JADX INFO: renamed from: miuix.stretchablewidget.StretchableDatePicker$k */
    class C7360k implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f41905k;

        C7360k(Context context) {
            this.f41905k = context;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            StretchableDatePicker.this.f41899b.setLunarMode(z2);
            StretchableDatePicker.this.t8r(z2, this.f41905k);
            StretchableDatePicker.this.bp = z2;
        }
    }

    class toq implements DateTimePicker.InterfaceC7239q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f41907k;

        toq(Context context) {
            this.f41907k = context;
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.InterfaceC7239q
        /* JADX INFO: renamed from: k */
        public void mo26336k(DateTimePicker dateTimePicker, long j2) {
            StretchableDatePicker.this.f90411bo.setTimeInMillis(j2);
            StretchableDatePicker stretchableDatePicker = StretchableDatePicker.this;
            stretchableDatePicker.t8r(stretchableDatePicker.bp, this.f41907k);
            StretchableDatePicker.this.an = j2;
            if (StretchableDatePicker.this.id != null) {
                StretchableDatePicker.this.id.m26745k(j2);
            }
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        long m26745k(long j2);
    }

    public StretchableDatePicker(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h */
    private String m26739h(long j2, Context context) {
        return miuix.pickerwidget.date.zy.m26303k(context, j2, 908);
    }

    private void ki(Context context) {
        setDetailMessage(m26739h(this.f90411bo.getTimeInMillis(), context));
    }

    private String kja0(long j2, Context context) {
        return this.f41902v.mo26337k(this.f90411bo.get(1), this.f90411bo.get(5), this.f90411bo.get(9)) + " " + miuix.pickerwidget.date.zy.m26303k(context, j2, 12);
    }

    /* JADX INFO: renamed from: q */
    private void m26741q(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.cdj.yaw, i2, 0);
        this.bb = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.lzd, false);
        this.f41903w = typedArrayObtainStyledAttributes.getString(toq.cdj.mjed);
        this.f90410ab = typedArrayObtainStyledAttributes.getInteger(toq.cdj.ahy0, 1);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(toq.x2.f91773d3, (ViewGroup) null);
        this.f41904x = linearLayout;
        this.f41899b = (DateTimePicker) linearLayout.findViewById(toq.C7370s.f91699nmn5);
        this.f41901u = (RelativeLayout) this.f41904x.findViewById(toq.C7370s.f91713py);
        this.f41900d = (TextView) this.f41904x.findViewById(toq.C7370s.f91659i9jn);
        this.f41898a = (SlidingButton) this.f41904x.findViewById(toq.C7370s.f91764zsr0);
        if (!this.bb) {
            this.f41901u.setVisibility(8);
        }
        this.f41898a.setOnCheckedChangeListener(new C7360k(context));
        this.f41904x.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.bv = this.f41904x.getMeasuredHeight();
        setLayout(this.f41904x);
        this.f90411bo = new C7230k();
        setLunarText(this.f41903w);
        this.f41902v = new DateTimePicker.zy(context);
        setMinuteInterval(this.f90410ab);
        ki(context);
        this.an = this.f90411bo.getTimeInMillis();
        this.f41899b.setOnTimeChangedListener(new toq(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r(boolean z2, Context context) {
        if (z2) {
            cdj(context);
        } else {
            ki(context);
        }
    }

    public void cdj(Context context) {
        setDetailMessage(kja0(this.f90411bo.getTimeInMillis(), context));
    }

    public long getTime() {
        return this.an;
    }

    @Override // miuix.stretchablewidget.StretchableWidget
    /* JADX INFO: renamed from: n */
    protected void mo26744n(Context context, AttributeSet attributeSet, int i2) {
        m26741q(context, attributeSet, i2);
    }

    public void setLunarModeOn(boolean z2) {
        SlidingButton slidingButton = this.f41898a;
        if (slidingButton != null) {
            slidingButton.setChecked(z2);
        }
    }

    public void setLunarText(String str) {
        this.f41900d.setText(str);
    }

    public void setMinuteInterval(int i2) {
        this.f41899b.setMinuteInterval(i2);
    }

    public void setOnTimeChangeListener(zy zyVar) {
        this.id = zyVar;
    }

    @Override // miuix.stretchablewidget.StretchableWidget
    protected void toq() {
        this.f41916j = this.bv;
    }

    public StretchableDatePicker(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StretchableDatePicker(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f90410ab = 1;
    }
}
