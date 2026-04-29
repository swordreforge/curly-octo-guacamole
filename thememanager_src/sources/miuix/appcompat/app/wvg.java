package miuix.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import gb.toq;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: compiled from: DateTimePickerDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class wvg extends ki {

    /* JADX INFO: renamed from: h */
    private View f39004h;

    /* JADX INFO: renamed from: i */
    private SlidingButton f39005i;

    /* JADX INFO: renamed from: p */
    private toq f39006p;

    /* JADX INFO: renamed from: s */
    private DateTimePicker f39007s;

    /* JADX INFO: renamed from: miuix.appcompat.app.wvg$k */
    /* JADX INFO: compiled from: DateTimePickerDialog.java */
    class DialogInterfaceOnClickListenerC6960k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC6960k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (wvg.this.f39006p != null) {
                toq toqVar = wvg.this.f39006p;
                wvg wvgVar = wvg.this;
                toqVar.m25085k(wvgVar, wvgVar.f39007s.getTimeInMillis());
            }
        }
    }

    /* JADX INFO: compiled from: DateTimePickerDialog.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m25085k(wvg wvgVar, long j2);
    }

    public wvg(Context context, toq toqVar) {
        this(context, toqVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m25082m(CompoundButton compoundButton, boolean z2) {
        this.f39007s.setLunarMode(z2);
    }

    /* JADX INFO: renamed from: o */
    private void m25083o(int i2) {
        fti(-1, getContext().getText(R.string.ok), new DialogInterfaceOnClickListenerC6960k());
        fti(-2, getContext().getText(R.string.cancel), null);
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(toq.qrj.f76687ch, (ViewGroup) null);
        m25025e(viewInflate);
        DateTimePicker dateTimePicker = (DateTimePicker) viewInflate.findViewById(toq.C6054p.f76270a5id);
        this.f39007s = dateTimePicker;
        dateTimePicker.setMinuteInterval(i2);
        this.f39004h = viewInflate.findViewById(toq.C6054p.f76427ula6);
        SlidingButton slidingButton = (SlidingButton) viewInflate.findViewById(toq.C6054p.f76436vy);
        this.f39005i = slidingButton;
        slidingButton.setOnPerformCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: miuix.appcompat.app.o1t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f38977k.m25082m(compoundButton, z2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m25084b(boolean z2) {
        this.f39005i.setChecked(z2);
        this.f39007s.setLunarMode(z2);
    }

    public void bf2(long j2) {
        this.f39007s.m26333i(j2);
    }

    public void ek5k(boolean z2) {
        this.f39004h.setVisibility(z2 ? 0 : 8);
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void y9n(long j2) {
        this.f39007s.setMinDateTime(j2);
    }

    public void yz(long j2) {
        this.f39007s.setMaxDateTime(j2);
    }

    public wvg(Context context, toq toqVar, @zy.a9(from = 1, to = 30) int i2) {
        super(context);
        this.f39006p = toqVar;
        m25083o(i2);
        setTitle(toq.C6051h.f75964yqrt);
    }
}
