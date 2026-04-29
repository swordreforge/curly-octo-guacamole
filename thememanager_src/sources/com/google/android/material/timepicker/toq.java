package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0683f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.C4108p;
import com.google.android.material.timepicker.TimePickerView;
import ij.C6095k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: MaterialTimePicker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends androidx.fragment.app.zy implements TimePickerView.InterfaceC4170n {
    public static final int ar = 0;
    public static final int bc = 1;
    static final String bd = "TIME_PICKER_INPUT_MODE";
    static final String bu = "TIME_PICKER_TIME_MODEL";
    static final String dy = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String sk1t = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String tgs = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String tlhn = "TIME_PICKER_TITLE_RES";
    static final String w97r = "TIME_PICKER_TITLE_TEXT";
    static final String yl25 = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String zmmu = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    private CharSequence ac;
    private CharSequence am;
    private TimePickerView an;

    @dd
    private InterfaceC4181y as;
    private CharSequence ax;
    private MaterialButton ay;

    @fn3e
    private int az;
    private Button be;

    @fn3e
    private int bg;

    @dd
    private C4176p bl;
    private TimeModel bs;
    private ViewStub id;

    @dd
    private C4173g in;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final Set<View.OnClickListener> f67967ab = new LinkedHashSet();
    private final Set<View.OnClickListener> bb = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> bp = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> bv = new LinkedHashSet();

    @nn86
    private int ba = 0;

    @nn86
    private int bq = 0;

    @nn86
    private int ad = 0;
    private int aj = 0;
    private int k0 = 0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.toq$k */
    /* JADX INFO: compiled from: MaterialTimePicker.java */
    class ViewOnClickListenerC4179k implements View.OnClickListener {
        ViewOnClickListenerC4179k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = toq.this.f67967ab.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            toq.this.kx3();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.toq$q */
    /* JADX INFO: compiled from: MaterialTimePicker.java */
    public static final class C4180q {

        /* JADX INFO: renamed from: g */
        private CharSequence f25394g;

        /* JADX INFO: renamed from: q */
        private CharSequence f25397q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f67969toq;

        /* JADX INFO: renamed from: y */
        private CharSequence f25399y;

        /* JADX INFO: renamed from: k */
        private TimeModel f25395k = new TimeModel();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @nn86
        private int f67970zy = 0;

        /* JADX INFO: renamed from: n */
        @nn86
        private int f25396n = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @nn86
        private int f67968f7l8 = 0;

        /* JADX INFO: renamed from: s */
        private int f25398s = 0;

        @lvui
        public C4180q cdj(@dd CharSequence charSequence) {
            this.f25394g = charSequence;
            return this;
        }

        @lvui
        public C4180q fn3e(@dd CharSequence charSequence) {
            this.f25397q = charSequence;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: h */
        public C4180q m15147h(@nn86 int i2) {
            this.f25396n = i2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: i */
        public C4180q m15148i(@nn86 int i2) {
            this.f67970zy = i2;
            return this;
        }

        @lvui
        public C4180q ki(@hb int i2) {
            this.f25398s = i2;
            return this;
        }

        @lvui
        public C4180q kja0(@dd CharSequence charSequence) {
            this.f25399y = charSequence;
            return this;
        }

        @lvui
        public C4180q ld6(@a9(from = 0, to = 23) int i2) {
            this.f25395k.m15117y(i2);
            return this;
        }

        @lvui
        public C4180q n7h(@nn86 int i2) {
            this.f67968f7l8 = i2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: p */
        public toq m15149p() {
            return toq.pnt2(this);
        }

        @lvui
        public C4180q qrj(@a9(from = 0, to = 59) int i2) {
            this.f25395k.m15116p(i2);
            return this;
        }

        @lvui
        public C4180q t8r(int i2) {
            TimeModel timeModel = this.f25395k;
            int i3 = timeModel.f25356q;
            int i4 = timeModel.f25355n;
            TimeModel timeModel2 = new TimeModel(i2);
            this.f25395k = timeModel2;
            timeModel2.m15116p(i4);
            this.f25395k.m15117y(i3);
            return this;
        }

        @lvui
        public C4180q x2(int i2) {
            this.f67969toq = i2;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaterialTimePicker.java */
    class ViewOnClickListenerC7979toq implements View.OnClickListener {
        ViewOnClickListenerC7979toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = toq.this.bb.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            toq.this.kx3();
        }
    }

    /* JADX INFO: compiled from: MaterialTimePicker.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            toq toqVar = toq.this;
            toqVar.aj = toqVar.aj == 0 ? 1 : 0;
            toq toqVar2 = toq.this;
            toqVar2.tjz5(toqVar2.ay);
        }
    }

    private void c25() {
        Button button = this.be;
        if (button != null) {
            button.setVisibility(ra() ? 0 : 8);
        }
    }

    private Pair<Integer, Integer> mj(int i2) {
        if (i2 == 0) {
            return new Pair<>(Integer.valueOf(this.bg), Integer.valueOf(C6095k.qrj.f79864xwq3));
        }
        if (i2 == 1) {
            return new Pair<>(Integer.valueOf(this.az), Integer.valueOf(C6095k.qrj.f79784bo));
        }
        throw new IllegalArgumentException("no icon for mode: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public static toq pnt2(@lvui C4180q c4180q) {
        toq toqVar = new toq();
        Bundle bundle = new Bundle();
        bundle.putParcelable(bu, c4180q.f25395k);
        bundle.putInt(bd, c4180q.f67969toq);
        bundle.putInt(tlhn, c4180q.f67970zy);
        if (c4180q.f25397q != null) {
            bundle.putCharSequence(w97r, c4180q.f25397q);
        }
        bundle.putInt(tgs, c4180q.f25396n);
        if (c4180q.f25394g != null) {
            bundle.putCharSequence(yl25, c4180q.f25394g);
        }
        bundle.putInt(zmmu, c4180q.f67968f7l8);
        if (c4180q.f25399y != null) {
            bundle.putCharSequence(sk1t, c4180q.f25399y);
        }
        bundle.putInt(dy, c4180q.f25398s);
        toqVar.setArguments(bundle);
        return toqVar;
    }

    private int qh4d() {
        int i2 = this.k0;
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValueM14747k = com.google.android.material.resources.toq.m14747k(requireContext(), C6095k.zy.in);
        if (typedValueM14747k == null) {
            return 0;
        }
        return typedValueM14747k.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tjz5(MaterialButton materialButton) {
        if (materialButton == null || this.an == null || this.id == null) {
            return;
        }
        InterfaceC4181y interfaceC4181y = this.as;
        if (interfaceC4181y != null) {
            interfaceC4181y.mo15133n();
        }
        InterfaceC4181y interfaceC4181yXblq = xblq(this.aj, this.an, this.id);
        this.as = interfaceC4181yXblq;
        interfaceC4181yXblq.mo15131g();
        this.as.invalidate();
        Pair<Integer, Integer> pairMj = mj(this.aj);
        materialButton.setIconResource(((Integer) pairMj.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairMj.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    private InterfaceC4181y xblq(int i2, @lvui TimePickerView timePickerView, @lvui ViewStub viewStub) {
        if (i2 != 0) {
            if (this.bl == null) {
                this.bl = new C4176p((LinearLayout) viewStub.inflate(), this.bs);
            }
            this.bl.f7l8();
            return this.bl;
        }
        C4173g c4173g = this.in;
        if (c4173g == null) {
            c4173g = new C4173g(timePickerView, this.bs);
        }
        this.in = c4173g;
        return c4173g;
    }

    private void z617(@dd Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(bu);
        this.bs = timeModel;
        if (timeModel == null) {
            this.bs = new TimeModel();
        }
        this.aj = bundle.getInt(bd, 0);
        this.ba = bundle.getInt(tlhn, 0);
        this.ax = bundle.getCharSequence(w97r);
        this.bq = bundle.getInt(tgs, 0);
        this.ac = bundle.getCharSequence(yl25);
        this.ad = bundle.getInt(zmmu, 0);
        this.am = bundle.getCharSequence(sk1t);
        this.k0 = bundle.getInt(dy, 0);
    }

    public void ab(@a9(from = 0, to = 59) int i2) {
        this.bs.m15116p(i2);
        InterfaceC4181y interfaceC4181y = this.as;
        if (interfaceC4181y != null) {
            interfaceC4181y.invalidate();
        }
    }

    public void btvn() {
        this.bv.clear();
    }

    @a9(from = 0, to = 23)
    public int cn02() {
        return this.bs.f25356q % 24;
    }

    @Override // androidx.fragment.app.zy
    public void ec(boolean z2) {
        super.ec(z2);
        c25();
    }

    @a9(from = 0, to = 59)
    public int exv8() {
        return this.bs.f25355n;
    }

    public boolean f1bi(@lvui DialogInterface.OnCancelListener onCancelListener) {
        return this.bp.add(onCancelListener);
    }

    public void gb() {
        this.bp.clear();
    }

    @dd
    C4173g hyow() {
        return this.in;
    }

    public boolean kbj(@lvui View.OnClickListener onClickListener) {
        return this.f67967ab.add(onClickListener);
    }

    public void kq2f() {
        this.bb.clear();
    }

    public boolean lk(@lvui View.OnClickListener onClickListener) {
        return this.f67967ab.remove(onClickListener);
    }

    public boolean mi1u(@lvui DialogInterface.OnDismissListener onDismissListener) {
        return this.bv.remove(onDismissListener);
    }

    @Override // androidx.fragment.app.zy
    @lvui
    public final Dialog nnh(@dd Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), qh4d());
        Context context = dialog.getContext();
        int iF7l8 = com.google.android.material.resources.toq.f7l8(context, C6095k.zy.f80274sc, toq.class.getCanonicalName());
        int i2 = C6095k.zy.t4;
        int i3 = C6095k.n7h.am;
        C4108p c4108p = new C4108p(context, null, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C6095k.kja0.u0t, i2, i3);
        this.az = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.yj1, 0);
        this.bg = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.s4y, 0);
        typedArrayObtainStyledAttributes.recycle();
        c4108p.m14856e(context);
        c4108p.m14867x(ColorStateList.valueOf(iF7l8));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c4108p);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        c4108p.zp(C0683f.m3166l(window.getDecorView()));
        return dialog;
    }

    public boolean ob(@lvui View.OnClickListener onClickListener) {
        return this.bb.add(onClickListener);
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@lvui DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.bp.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        z617(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    public final View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C6095k.ld6.f35596b, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C6095k.y.f80093vwb);
        this.an = timePickerView;
        timePickerView.i1(this);
        this.id = (ViewStub) viewGroup2.findViewById(C6095k.y.f80062qh4d);
        this.ay = (MaterialButton) viewGroup2.findViewById(C6095k.y.f80109xtb7);
        TextView textView = (TextView) viewGroup2.findViewById(C6095k.y.f80027m2t);
        int i2 = this.ba;
        if (i2 != 0) {
            textView.setText(i2);
        } else if (!TextUtils.isEmpty(this.ax)) {
            textView.setText(this.ax);
        }
        tjz5(this.ay);
        Button button = (Button) viewGroup2.findViewById(C6095k.y.f80033mi1u);
        button.setOnClickListener(new ViewOnClickListenerC4179k());
        int i3 = this.bq;
        if (i3 != 0) {
            button.setText(i3);
        } else if (!TextUtils.isEmpty(this.ac)) {
            button.setText(this.ac);
        }
        Button button2 = (Button) viewGroup2.findViewById(C6095k.y.f79991hyow);
        this.be = button2;
        button2.setOnClickListener(new ViewOnClickListenerC7979toq());
        int i4 = this.ad;
        if (i4 != 0) {
            this.be.setText(i4);
        } else if (!TextUtils.isEmpty(this.am)) {
            this.be.setText(this.am);
        }
        c25();
        this.ay.setOnClickListener(new zy());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.as = null;
        this.in = null;
        this.bl = null;
        TimePickerView timePickerView = this.an;
        if (timePickerView != null) {
            timePickerView.i1(null);
            this.an = null;
        }
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@lvui DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.bv.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(bu, this.bs);
        bundle.putInt(bd, this.aj);
        bundle.putInt(tlhn, this.ba);
        bundle.putCharSequence(w97r, this.ax);
        bundle.putInt(tgs, this.bq);
        bundle.putCharSequence(yl25, this.ac);
        bundle.putInt(zmmu, this.ad);
        bundle.putCharSequence(sk1t, this.am);
        bundle.putInt(dy, this.k0);
    }

    public int ovdh() {
        return this.aj;
    }

    public boolean tww7(@lvui DialogInterface.OnDismissListener onDismissListener) {
        return this.bv.add(onDismissListener);
    }

    public boolean vwb(@lvui View.OnClickListener onClickListener) {
        return this.bb.remove(onClickListener);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC4170n
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void vyq() {
        this.aj = 1;
        tjz5(this.ay);
        this.bl.m15136s();
    }

    public void wtop(@a9(from = 0, to = 23) int i2) {
        this.bs.f7l8(i2);
        InterfaceC4181y interfaceC4181y = this.as;
        if (interfaceC4181y != null) {
            interfaceC4181y.invalidate();
        }
    }

    public void xm() {
        this.f67967ab.clear();
    }

    public boolean xtb7(@lvui DialogInterface.OnCancelListener onCancelListener) {
        return this.bp.remove(onCancelListener);
    }

    @yz
    void xzl(@dd InterfaceC4181y interfaceC4181y) {
        this.as = interfaceC4181y;
    }
}
