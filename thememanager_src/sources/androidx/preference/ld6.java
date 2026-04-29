package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.preference.DialogPreference;
import zy.InterfaceC7830i;
import zy.dd;
import zy.gvn7;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld6 extends androidx.fragment.app.zy implements DialogInterface.OnClickListener {
    private static final String ac = "PreferenceDialogFragment.icon";
    protected static final String as = "key";
    private static final String ax = "PreferenceDialogFragment.message";
    private static final String az = "PreferenceDialogFragment.positiveText";
    private static final String ba = "PreferenceDialogFragment.negativeText";
    private static final String bg = "PreferenceDialogFragment.title";
    private static final String bq = "PreferenceDialogFragment.layout";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private DialogPreference f51976ab;
    private CharSequence an;
    private CharSequence bb;
    private int bl;
    private CharSequence bp;
    private CharSequence bv;

    @gvn7
    private int id;
    private BitmapDrawable in;

    /* JADX INFO: renamed from: androidx.preference.ld6$k */
    /* JADX INFO: compiled from: PreferenceDialogFragmentCompat.java */
    @hyr(30)
    private static class C1022k {
        private C1022k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4699k(@lvui Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
        }
    }

    private void bqie(@lvui Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C1022k.m4699k(window);
        } else {
            f1bi();
        }
    }

    protected void el(@lvui View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.an;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (viewFindViewById.getVisibility() != i2) {
                viewFindViewById.setVisibility(i2);
            }
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void f1bi() {
    }

    public abstract void g0ad(boolean z2);

    protected void imd(@lvui DialogInterfaceC0102q.k kVar) {
    }

    @Override // androidx.fragment.app.zy
    @lvui
    public Dialog nnh(@dd Bundle bundle) {
        this.bl = -2;
        DialogInterfaceC0102q.k kVarMo230h = new DialogInterfaceC0102q.k(requireContext()).setTitle(this.bb).mo229g(this.in).mo239z(this.bp, this).mo230h(this.bv, this);
        View viewWt = wt(requireContext());
        if (viewWt != null) {
            el(viewWt);
            kVarMo230h.setView(viewWt);
        } else {
            kVarMo230h.x2(this.an);
        }
        imd(kVarMo230h);
        DialogInterfaceC0102q dialogInterfaceC0102qCreate = kVarMo230h.create();
        if (zff0()) {
            bqie(dialogInterfaceC0102qCreate);
        }
        return dialogInterfaceC0102qCreate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@lvui DialogInterface dialogInterface, int i2) {
        this.bl = i2;
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.n7h targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.InterfaceC0987k)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.InterfaceC0987k interfaceC0987k = (DialogPreference.InterfaceC0987k) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.bb = bundle.getCharSequence(bg);
            this.bp = bundle.getCharSequence(az);
            this.bv = bundle.getCharSequence(ba);
            this.an = bundle.getCharSequence(ax);
            this.id = bundle.getInt(bq, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(ac);
            if (bitmap != null) {
                this.in = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) interfaceC0987k.findPreference(string);
        this.f51976ab = dialogPreference;
        this.bb = dialogPreference.mbx();
        this.bp = this.f51976ab.yl();
        this.bv = this.f51976ab.jbh();
        this.an = this.f51976ab.vep5();
        this.id = this.f51976ab.h7am();
        Drawable drawableCv06 = this.f51976ab.cv06();
        if (drawableCv06 == null || (drawableCv06 instanceof BitmapDrawable)) {
            this.in = (BitmapDrawable) drawableCv06;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableCv06.getIntrinsicWidth(), drawableCv06.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableCv06.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableCv06.draw(canvas);
        this.in = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@lvui DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        g0ad(this.bl == -1);
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(bg, this.bb);
        bundle.putCharSequence(az, this.bp);
        bundle.putCharSequence(ba, this.bv);
        bundle.putCharSequence(ax, this.an);
        bundle.putInt(bq, this.id);
        BitmapDrawable bitmapDrawable = this.in;
        if (bitmapDrawable != null) {
            bundle.putParcelable(ac, bitmapDrawable.getBitmap());
        }
    }

    @dd
    protected View wt(@lvui Context context) {
        int i2 = this.id;
        if (i2 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i2, (ViewGroup) null);
    }

    public DialogPreference yp31() {
        if (this.f51976ab == null) {
            this.f51976ab = (DialogPreference) ((DialogPreference.InterfaceC0987k) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f51976ab;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    protected boolean zff0() {
        return false;
    }
}
