package miuix.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import gb.toq;
import java.text.NumberFormat;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: compiled from: ProgressDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class dd extends ki {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f86836bo = 1;

    /* JADX INFO: renamed from: u */
    public static final int f38787u = 0;

    /* JADX INFO: renamed from: a */
    private boolean f38788a;

    /* JADX INFO: renamed from: b */
    private boolean f38789b;

    /* JADX INFO: renamed from: c */
    private int f38790c;

    /* JADX INFO: renamed from: e */
    private int f38791e;

    /* JADX INFO: renamed from: f */
    private int f38792f;

    /* JADX INFO: renamed from: h */
    private TextView f38793h;

    /* JADX INFO: renamed from: i */
    private int f38794i;

    /* JADX INFO: renamed from: j */
    private Drawable f38795j;

    /* JADX INFO: renamed from: l */
    private int f38796l;

    /* JADX INFO: renamed from: m */
    private CharSequence f38797m;

    /* JADX INFO: renamed from: o */
    private Drawable f38798o;

    /* JADX INFO: renamed from: p */
    private TextView f38799p;

    /* JADX INFO: renamed from: r */
    private int f38800r;

    /* JADX INFO: renamed from: s */
    private ProgressBar f38801s;

    /* JADX INFO: renamed from: t */
    private NumberFormat f38802t;

    /* JADX INFO: renamed from: x */
    private Handler f38803x;

    /* JADX INFO: renamed from: z */
    private String f38804z;

    /* JADX INFO: renamed from: miuix.appcompat.app.dd$k */
    /* JADX INFO: compiled from: ProgressDialog.java */
    class HandlerC6914k extends Handler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f38805k;

        HandlerC6914k(int i2) {
            this.f38805k = i2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            dd.this.f38799p.setText(dd.this.f38797m);
            if (dd.this.f38802t == null || dd.this.f38793h == null) {
                return;
            }
            double max = ((double) dd.this.f38796l) / ((double) dd.this.f38801s.getMax());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = dd.this.f38802t.format(max);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f38805k), 0, str.length(), 34);
            dd.this.f38801s.setProgress(dd.this.f38796l);
            dd.this.f38793h.setText(spannableStringBuilder);
        }
    }

    public dd(Context context) {
        super(context);
        this.f38794i = 0;
        a98o();
    }

    private void a98o() {
        this.f38804z = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f38802t = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public static dd dr(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        return m24873v(context, charSequence, charSequence2, z2, false, null);
    }

    public static dd gyi(Context context, CharSequence charSequence, CharSequence charSequence2) {
        return dr(context, charSequence, charSequence2, false);
    }

    /* JADX INFO: renamed from: v */
    public static dd m24873v(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z2, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        dd ddVar = new dd(context);
        ddVar.setTitle(charSequence);
        ddVar.n5r1(charSequence2);
        ddVar.m24877x(z2);
        ddVar.setCancelable(z3);
        ddVar.setOnCancelListener(onCancelListener);
        ddVar.show();
        return ddVar;
    }

    public static dd xwq3(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z2, boolean z3) {
        return m24873v(context, charSequence, charSequence2, z2, z3, null);
    }

    private void zp() {
        Handler handler;
        if (this.f38794i != 1 || (handler = this.f38803x) == null || handler.hasMessages(0)) {
            return;
        }
        this.f38803x.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m24874a() {
        ProgressBar progressBar = this.f38801s;
        return progressBar != null ? progressBar.isIndeterminate() : this.f38789b;
    }

    /* JADX INFO: renamed from: b */
    public int m24875b() {
        ProgressBar progressBar = this.f38801s;
        return progressBar != null ? progressBar.getSecondaryProgress() : this.f38792f;
    }

    public void bf2(int i2) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar == null) {
            this.f38790c += i2;
        } else {
            progressBar.incrementProgressBy(i2);
            zp();
        }
    }

    public void bo(NumberFormat numberFormat) {
        this.f38802t = numberFormat;
        zp();
    }

    public void c8jq(int i2) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar == null) {
            this.f38792f = i2;
        } else {
            progressBar.setSecondaryProgress(i2);
            zp();
        }
    }

    public void ch(Drawable drawable) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(drawable);
        } else {
            this.f38798o = drawable;
        }
    }

    public void i1(int i2) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar == null) {
            this.f38791e += i2;
        } else {
            progressBar.incrementSecondaryProgressBy(i2);
            zp();
        }
    }

    public void lv5(int i2) {
        this.f38796l = i2;
        if (this.f38788a) {
            zp();
        }
    }

    @Override // miuix.appcompat.app.ki
    public void n5r1(CharSequence charSequence) {
        if (this.f38801s == null) {
            this.f38797m = charSequence;
            return;
        }
        if (this.f38794i == 1) {
            this.f38797m = charSequence;
        }
        this.f38799p.setText(charSequence);
    }

    public void nmn5(int i2) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar == null) {
            this.f38800r = i2;
        } else {
            progressBar.setMax(i2);
            zp();
        }
    }

    @Override // miuix.appcompat.app.ki, androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        View viewInflate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, toq.ki.f76075etdu, R.attr.alertDialogStyle, 0);
        TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(new int[]{toq.C6055q.zxa9});
        int color = typedArrayObtainStyledAttributes2.getColor(0, getContext().getResources().getColor(toq.C6050g.jog));
        typedArrayObtainStyledAttributes2.recycle();
        if (this.f38794i == 1) {
            this.f38803x = new HandlerC6914k(color);
            viewInflate = layoutInflaterFrom.inflate(typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76227z4, toq.qrj.f76711i1), (ViewGroup) null);
            this.f38793h = (TextView) viewInflate.findViewById(toq.C6054p.l7o);
        } else {
            viewInflate = layoutInflaterFrom.inflate(typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76092gc3c, toq.qrj.f76764wo), (ViewGroup) null);
        }
        this.f38801s = (ProgressBar) viewInflate.findViewById(R.id.progress);
        TextView textView = (TextView) viewInflate.findViewById(toq.C6054p.f76361le7);
        this.f38799p = textView;
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(getContext().getResources().getDimensionPixelSize(toq.f7l8.verb));
        }
        m25025e(viewInflate);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = this.f38800r;
        if (i2 > 0) {
            nmn5(i2);
        }
        int i3 = this.f38796l;
        if (i3 > 0) {
            lv5(i3);
        }
        int i4 = this.f38792f;
        if (i4 > 0) {
            c8jq(i4);
        }
        int i5 = this.f38790c;
        if (i5 > 0) {
            bf2(i5);
        }
        int i6 = this.f38791e;
        if (i6 > 0) {
            i1(i6);
        }
        Drawable drawable = this.f38795j;
        if (drawable != null) {
            t8iq(drawable);
        }
        Drawable drawable2 = this.f38798o;
        if (drawable2 != null) {
            ch(drawable2);
        }
        CharSequence charSequence = this.f38797m;
        if (charSequence != null) {
            n5r1(charSequence);
        }
        m24877x(this.f38789b);
        zp();
        super.onCreate(bundle);
    }

    @Override // miuix.appcompat.app.ki, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f38788a = true;
    }

    @Override // miuix.appcompat.app.ki, androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onStop() {
        super.onStop();
        this.f38788a = false;
    }

    public void t8iq(Drawable drawable) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        } else {
            this.f38795j = drawable;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24876u(String str) {
        this.f38804z = str;
        zp();
    }

    /* JADX INFO: renamed from: x */
    public void m24877x(boolean z2) {
        ProgressBar progressBar = this.f38801s;
        if (progressBar != null) {
            progressBar.setIndeterminate(z2);
        } else {
            this.f38789b = z2;
        }
    }

    public void y2(int i2) {
        this.f38794i = i2;
    }

    public int y9n() {
        ProgressBar progressBar = this.f38801s;
        return progressBar != null ? progressBar.getProgress() : this.f38796l;
    }

    public int yz() {
        ProgressBar progressBar = this.f38801s;
        return progressBar != null ? progressBar.getMax() : this.f38800r;
    }

    public dd(Context context, int i2) {
        super(context, i2);
        this.f38794i = 0;
        a98o();
    }
}
