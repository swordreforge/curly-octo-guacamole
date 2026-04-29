package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.preference.C1016i;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.preference.kja0;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: loaded from: classes2.dex */
public class StretchablePickerPreference extends StretchableWidgetPreference {
    private zy cw14;
    private DateTimePicker.zy dy;
    private long hp;
    private boolean k6e;
    private int mjvl;
    private CharSequence s8y;
    private C7230k sk1t;
    private Context vb6;
    private boolean xk5;

    /* JADX INFO: renamed from: miuix.preference.StretchablePickerPreference$k */
    class C7285k implements DateTimePicker.InterfaceC7239q {
        C7285k() {
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.InterfaceC7239q
        /* JADX INFO: renamed from: k */
        public void mo26336k(DateTimePicker dateTimePicker, long j2) {
            StretchablePickerPreference.this.sk1t.setTimeInMillis(j2);
            StretchablePickerPreference stretchablePickerPreference = StretchablePickerPreference.this;
            stretchablePickerPreference.gcp(stretchablePickerPreference.xk5, j2);
            StretchablePickerPreference.this.hp = j2;
            if (StretchablePickerPreference.this.cw14 != null) {
                StretchablePickerPreference.this.cw14.m26473k(StretchablePickerPreference.this.hp);
            }
            StretchablePickerPreference.this.uv6();
        }
    }

    class toq implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ DateTimePicker f41149k;

        toq(DateTimePicker dateTimePicker) {
            this.f41149k = dateTimePicker;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            StretchablePickerPreference.this.vy(this.f41149k, z2);
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        long m26473k(long j2);
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C7230k c7230k = new C7230k();
        this.sk1t = c7230k;
        this.hp = c7230k.getTimeInMillis();
        this.vb6 = context;
        this.dy = new DateTimePicker.zy(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.cbcd, i2, 0);
        this.k6e = typedArrayObtainStyledAttributes.getBoolean(kja0.ki.dtf, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int bap7() {
        return this.mjvl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gcp(boolean z2, long j2) {
        if (z2) {
            a5id(j2);
        } else {
            lw(j2);
        }
    }

    private CharSequence lh() {
        return this.s8y;
    }

    private void lw(long j2) {
        vep5(ngy(j2));
    }

    private void n2t(SlidingButton slidingButton, DateTimePicker dateTimePicker) {
        slidingButton.setOnPerformCheckedChangeListener(new toq(dateTimePicker));
    }

    private String ngy(long j2) {
        return miuix.pickerwidget.date.zy.m26303k(this.vb6, j2, 908);
    }

    private void oki(DateTimePicker dateTimePicker) {
        dateTimePicker.setOnTimeChangedListener(new C7285k());
    }

    private String pjz9(long j2, Context context) {
        return this.dy.mo26337k(this.sk1t.get(1), this.sk1t.get(5), this.sk1t.get(9)) + " " + miuix.pickerwidget.date.zy.m26303k(context, j2, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy(DateTimePicker dateTimePicker, boolean z2) {
        dateTimePicker.setLunarMode(z2);
        gcp(z2, dateTimePicker.getTimeInMillis());
        this.xk5 = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wlev(SlidingButton slidingButton, DateTimePicker dateTimePicker, View view) {
        boolean z2 = !slidingButton.isChecked();
        slidingButton.setChecked(z2);
        vy(dateTimePicker, z2);
    }

    public void a5id(long j2) {
        vep5(pjz9(j2, this.vb6));
    }

    public void dxef(zy zyVar) {
        this.cw14 = zyVar;
    }

    public void e5(int i2) {
        if (i2 != this.mjvl) {
            this.mjvl = i2;
            uv6();
        }
    }

    public void ga(String str) {
        if (TextUtils.equals(str, this.s8y)) {
            return;
        }
        this.s8y = str;
        uv6();
    }

    public long h4b() {
        return this.hp;
    }

    @Override // miuix.preference.StretchableWidgetPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        boolean z2;
        View view = c1016i.itemView;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(kja0.C7296p.f89330mub);
        final DateTimePicker dateTimePicker = (DateTimePicker) view.findViewById(kja0.C7296p.f89343o05);
        final SlidingButton slidingButton = (SlidingButton) view.findViewById(kja0.C7296p.f89313le7);
        TextView textView = (TextView) view.findViewById(kja0.C7296p.f89267f7z0);
        if (!this.k6e) {
            relativeLayout.setVisibility(8);
        } else if (textView != null) {
            CharSequence charSequenceLh = lh();
            if (TextUtils.isEmpty(charSequenceLh)) {
                z2 = false;
            } else {
                textView.setText(charSequenceLh);
                z2 = true;
            }
            relativeLayout.setFocusable(z2);
            slidingButton.setFocusable(!z2);
            if (z2) {
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: miuix.preference.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f41153k.wlev(slidingButton, dateTimePicker, view2);
                    }
                });
            } else {
                relativeLayout.setOnClickListener(null);
            }
        }
        dateTimePicker.setMinuteInterval(bap7());
        this.hp = dateTimePicker.getTimeInMillis();
        super.mo4638o(c1016i);
        n2t(slidingButton, dateTimePicker);
        gcp(this.xk5, dateTimePicker.getTimeInMillis());
        oki(dateTimePicker);
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.xdbo);
    }

    public StretchablePickerPreference(Context context) {
        this(context, null);
    }
}
