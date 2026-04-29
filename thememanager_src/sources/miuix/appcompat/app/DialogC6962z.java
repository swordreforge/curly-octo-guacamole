package miuix.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import gb.toq;
import miuix.pickerwidget.date.C7230k;
import miuix.pickerwidget.widget.DatePicker;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: renamed from: miuix.appcompat.app.z */
/* JADX INFO: compiled from: DatePickerDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC6962z extends ki {

    /* JADX INFO: renamed from: h */
    private final C7230k f39010h;

    /* JADX INFO: renamed from: i */
    private View f39011i;

    /* JADX INFO: renamed from: p */
    private final zy f39012p;

    /* JADX INFO: renamed from: r */
    private DatePicker.toq f39013r;

    /* JADX INFO: renamed from: s */
    private final DatePicker f39014s;

    /* JADX INFO: renamed from: t */
    private boolean f39015t;

    /* JADX INFO: renamed from: z */
    private SlidingButton f39016z;

    /* JADX INFO: renamed from: miuix.appcompat.app.z$k */
    /* JADX INFO: compiled from: DatePickerDialog.java */
    class k implements DatePicker.toq {
        k() {
        }

        @Override // miuix.pickerwidget.widget.DatePicker.toq
        /* JADX INFO: renamed from: k */
        public void mo25091k(DatePicker datePicker, int i2, int i3, int i4, boolean z2) {
            if (DialogC6962z.this.f39015t) {
                DialogC6962z.this.i1(i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.z$toq */
    /* JADX INFO: compiled from: DatePickerDialog.java */
    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogC6962z.this.m25087b();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.z$zy */
    /* JADX INFO: compiled from: DatePickerDialog.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void m25092k(DatePicker datePicker, int i2, int i3, int i4);
    }

    public DialogC6962z(Context context, zy zyVar, int i2, int i3, int i4) {
        this(context, 0, zyVar, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m25087b() {
        if (this.f39012p != null) {
            this.f39014s.clearFocus();
            zy zyVar = this.f39012p;
            DatePicker datePicker = this.f39014s;
            zyVar.m25092k(datePicker, datePicker.getYear(), this.f39014s.getMonth(), this.f39014s.getDayOfMonth());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ek5k(CompoundButton compoundButton, boolean z2) {
        this.f39014s.setLunarMode(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(int i2, int i3, int i4) {
        this.f39010h.set(1, i2);
        this.f39010h.set(5, i3);
        this.f39010h.set(9, i4);
        super.setTitle(miuix.pickerwidget.date.zy.m26303k(getContext(), this.f39010h.getTimeInMillis(), 14208));
    }

    public void bf2(int i2, int i3, int i4) {
        this.f39014s.m26320z(i2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public DatePicker m25090m() {
        return this.f39014s;
    }

    @Override // miuix.appcompat.app.ki, androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f39015t = false;
    }

    public void y9n(boolean z2) {
        this.f39016z.setChecked(z2);
        this.f39014s.setLunarMode(z2);
    }

    public void yz(boolean z2) {
        this.f39011i.setVisibility(z2 ? 0 : 8);
    }

    public DialogC6962z(Context context, int i2, zy zyVar, int i3, int i4, int i5) {
        super(context, i2);
        this.f39015t = true;
        this.f39013r = new k();
        this.f39012p = zyVar;
        this.f39010h = new C7230k();
        Context context2 = getContext();
        fti(-1, context2.getText(R.string.ok), new toq());
        fti(-2, getContext().getText(R.string.cancel), null);
        dd(0);
        View viewInflate = ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(toq.qrj.f76777zp, (ViewGroup) null);
        m25025e(viewInflate);
        DatePicker datePicker = (DatePicker) viewInflate.findViewById(toq.C6054p.f76303e5);
        this.f39014s = datePicker;
        datePicker.x2(i3, i4, i5, this.f39013r);
        i1(i3, i4, i5);
        this.f39011i = viewInflate.findViewById(toq.C6054p.f76427ula6);
        SlidingButton slidingButton = (SlidingButton) viewInflate.findViewById(toq.C6054p.f76436vy);
        this.f39016z = slidingButton;
        slidingButton.setOnPerformCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: miuix.appcompat.app.fu4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f38939k.ek5k(compoundButton, z2);
            }
        });
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        this.f39015t = false;
    }
}
