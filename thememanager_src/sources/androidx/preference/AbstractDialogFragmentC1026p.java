package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import zy.InterfaceC7830i;
import zy.dd;
import zy.gvn7;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.preference.p */
/* JADX INFO: compiled from: PreferenceDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractDialogFragmentC1026p extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c */
    private static final String f5582c = "PreferenceDialogFragment.icon";

    /* JADX INFO: renamed from: f */
    private static final String f5583f = "PreferenceDialogFragment.layout";

    /* JADX INFO: renamed from: i */
    @Deprecated
    protected static final String f5584i = "key";

    /* JADX INFO: renamed from: l */
    private static final String f5585l = "PreferenceDialogFragment.message";

    /* JADX INFO: renamed from: r */
    private static final String f5586r = "PreferenceDialogFragment.negativeText";

    /* JADX INFO: renamed from: t */
    private static final String f5587t = "PreferenceDialogFragment.positiveText";

    /* JADX INFO: renamed from: z */
    private static final String f5588z = "PreferenceDialogFragment.title";

    /* JADX INFO: renamed from: g */
    private CharSequence f5589g;

    /* JADX INFO: renamed from: h */
    private int f5590h;

    /* JADX INFO: renamed from: k */
    private DialogPreference f5591k;

    /* JADX INFO: renamed from: n */
    private CharSequence f5592n;

    /* JADX INFO: renamed from: p */
    private BitmapDrawable f5593p;

    /* JADX INFO: renamed from: q */
    private CharSequence f5594q;

    /* JADX INFO: renamed from: s */
    @gvn7
    private int f5595s;

    /* JADX INFO: renamed from: y */
    private CharSequence f5596y;

    /* JADX INFO: renamed from: androidx.preference.p$k */
    /* JADX INFO: compiled from: PreferenceDialogFragment.java */
    @hyr(30)
    private static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4708k(@lvui Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
        }
    }

    @Deprecated
    public AbstractDialogFragmentC1026p() {
    }

    private void f7l8(@lvui Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            k.m4708k(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    protected void mo4682g(@lvui AlertDialog.Builder builder) {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public DialogPreference m4706k() {
        if (this.f5591k == null) {
            this.f5591k = (DialogPreference) ((DialogPreference.InterfaceC0987k) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f5591k;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public abstract void mo4683n(boolean z2);

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@lvui DialogInterface dialogInterface, int i2) {
        this.f5590h = i2;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.InterfaceC0987k)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.InterfaceC0987k interfaceC0987k = (DialogPreference.InterfaceC0987k) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f5594q = bundle.getCharSequence(f5588z);
            this.f5592n = bundle.getCharSequence(f5587t);
            this.f5589g = bundle.getCharSequence(f5586r);
            this.f5596y = bundle.getCharSequence(f5585l);
            this.f5595s = bundle.getInt(f5583f, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f5582c);
            if (bitmap != null) {
                this.f5593p = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) interfaceC0987k.findPreference(string);
        this.f5591k = dialogPreference;
        this.f5594q = dialogPreference.mbx();
        this.f5592n = this.f5591k.yl();
        this.f5589g = this.f5591k.jbh();
        this.f5596y = this.f5591k.vep5();
        this.f5595s = this.f5591k.h7am();
        Drawable drawableCv06 = this.f5591k.cv06();
        if (drawableCv06 == null || (drawableCv06 instanceof BitmapDrawable)) {
            this.f5593p = (BitmapDrawable) drawableCv06;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableCv06.getIntrinsicWidth(), drawableCv06.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableCv06.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableCv06.draw(canvas);
        this.f5593p = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    @lvui
    public Dialog onCreateDialog(@dd Bundle bundle) {
        Activity activity = getActivity();
        this.f5590h = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f5594q).setIcon(this.f5593p).setPositiveButton(this.f5592n, this).setNegativeButton(this.f5589g, this);
        View viewM4707q = m4707q(activity);
        if (viewM4707q != null) {
            zy(viewM4707q);
            negativeButton.setView(viewM4707q);
        } else {
            negativeButton.setMessage(this.f5596y);
        }
        mo4682g(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (toq()) {
            f7l8(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@lvui DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo4683n(this.f5590h == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f5588z, this.f5594q);
        bundle.putCharSequence(f5587t, this.f5592n);
        bundle.putCharSequence(f5586r, this.f5589g);
        bundle.putCharSequence(f5585l, this.f5596y);
        bundle.putInt(f5583f, this.f5595s);
        BitmapDrawable bitmapDrawable = this.f5593p;
        if (bitmapDrawable != null) {
            bundle.putParcelable(f5582c, bitmapDrawable.getBitmap());
        }
    }

    @Deprecated
    @dd
    /* JADX INFO: renamed from: q */
    protected View m4707q(@lvui Context context) {
        int i2 = this.f5595s;
        if (i2 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    protected boolean toq() {
        return false;
    }

    @Deprecated
    protected void zy(@lvui View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f5596y;
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
}
