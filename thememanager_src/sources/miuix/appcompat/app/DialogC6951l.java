package miuix.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import miuix.pickerwidget.widget.TimePicker;

/* JADX INFO: renamed from: miuix.appcompat.app.l */
/* JADX INFO: compiled from: TimePickerDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC6951l extends ki {

    /* JADX INFO: renamed from: l */
    private static final String f38958l = "miuix:is24hour";

    /* JADX INFO: renamed from: r */
    private static final String f38959r = "miuix:minute";

    /* JADX INFO: renamed from: t */
    private static final String f38960t = "miuix:hour";

    /* JADX INFO: renamed from: h */
    int f38961h;

    /* JADX INFO: renamed from: i */
    int f38962i;

    /* JADX INFO: renamed from: p */
    private final toq f38963p;

    /* JADX INFO: renamed from: s */
    private final TimePicker f38964s;

    /* JADX INFO: renamed from: z */
    boolean f38965z;

    /* JADX INFO: renamed from: miuix.appcompat.app.l$k */
    /* JADX INFO: compiled from: TimePickerDialog.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogC6951l.this.hb();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.l$toq */
    /* JADX INFO: compiled from: TimePickerDialog.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m25057k(TimePicker timePicker, int i2, int i3);
    }

    public DialogC6951l(Context context, toq toqVar, int i2, int i3, boolean z2) {
        this(context, 0, toqVar, i2, i3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hb() {
        if (this.f38963p != null) {
            this.f38964s.clearFocus();
            toq toqVar = this.f38963p;
            TimePicker timePicker = this.f38964s;
            toqVar.m25057k(timePicker, timePicker.getCurrentHour().intValue(), this.f38964s.getCurrentMinute().intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m25056j(int i2, int i3) {
        this.f38964s.setCurrentHour(Integer.valueOf(i2));
        this.f38964s.setCurrentMinute(Integer.valueOf(i3));
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i2 = bundle.getInt(f38960t);
        int i3 = bundle.getInt(f38959r);
        this.f38964s.set24HourView(Boolean.valueOf(bundle.getBoolean(f38958l)));
        this.f38964s.setCurrentHour(Integer.valueOf(i2));
        this.f38964s.setCurrentMinute(Integer.valueOf(i3));
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putInt(f38960t, this.f38964s.getCurrentHour().intValue());
        bundleOnSaveInstanceState.putInt(f38959r, this.f38964s.getCurrentMinute().intValue());
        bundleOnSaveInstanceState.putBoolean(f38958l, this.f38964s.m26383n());
        return bundleOnSaveInstanceState;
    }

    public DialogC6951l(Context context, int i2, toq toqVar, int i3, int i4, boolean z2) {
        super(context, i2);
        this.f38963p = toqVar;
        this.f38961h = i3;
        this.f38962i = i4;
        this.f38965z = z2;
        dd(0);
        setTitle(toq.C6051h.wkrb);
        Context context2 = getContext();
        fti(-1, context2.getText(R.string.ok), new k());
        fti(-2, getContext().getText(R.string.cancel), null);
        View viewInflate = ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(toq.qrj.f76719jz5, (ViewGroup) null);
        m25025e(viewInflate);
        TimePicker timePicker = (TimePicker) viewInflate.findViewById(toq.C6054p.jp);
        this.f38964s = timePicker;
        timePicker.set24HourView(Boolean.valueOf(this.f38965z));
        timePicker.setCurrentHour(Integer.valueOf(this.f38961h));
        timePicker.setCurrentMinute(Integer.valueOf(this.f38962i));
        timePicker.setOnTimeChangedListener(null);
    }
}
