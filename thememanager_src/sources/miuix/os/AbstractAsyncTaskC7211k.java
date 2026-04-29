package miuix.os;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import java.util.HashMap;
import miuix.appcompat.app.dd;

/* JADX INFO: renamed from: miuix.os.k */
/* JADX INFO: compiled from: AsyncTaskWithProgress.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC7211k<Params, Result> extends AsyncTask<Params, Integer, Result> {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final HashMap<String, AbstractAsyncTaskC7211k<?, ?>> f87862n7h = new HashMap<>();

    /* JADX INFO: renamed from: k */
    private final FragmentManager f40701k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87866toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87868zy = 0;

    /* JADX INFO: renamed from: q */
    private CharSequence f40704q = null;

    /* JADX INFO: renamed from: n */
    private int f40702n = 0;

    /* JADX INFO: renamed from: g */
    private CharSequence f40700g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f87863f7l8 = false;

    /* JADX INFO: renamed from: y */
    private boolean f40706y = false;

    /* JADX INFO: renamed from: s */
    private int f40705s = 0;

    /* JADX INFO: renamed from: p */
    private int f40703p = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f87864ld6 = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private volatile zy f87867x2 = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final AbstractAsyncTaskC7211k<Params, Result>.toq f87865qrj = new toq();

    /* JADX INFO: renamed from: miuix.os.k$toq */
    /* JADX INFO: compiled from: AsyncTaskWithProgress.java */
    private class toq implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
        private toq() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            onClick(dialogInterface, -2);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            Dialog dialogU38j;
            if (AbstractAsyncTaskC7211k.this.f87867x2 == null || (dialogU38j = AbstractAsyncTaskC7211k.this.f87867x2.u38j()) == null || dialogInterface != dialogU38j || i2 != -2) {
                return;
            }
            AbstractAsyncTaskC7211k.this.cancel(true);
        }
    }

    /* JADX INFO: renamed from: miuix.os.k$zy */
    /* JADX INFO: compiled from: AsyncTaskWithProgress.java */
    public static class zy extends androidx.fragment.app.zy {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private AbstractAsyncTaskC7211k<?, ?> f87869ab;

        static zy yp31(String str) {
            zy zyVar = new zy();
            Bundle bundle = new Bundle();
            bundle.putString("task", str);
            zyVar.setArguments(bundle);
            return zyVar;
        }

        @Override // androidx.fragment.app.zy
        public Dialog nnh(Bundle bundle) {
            if (this.f87869ab == null) {
                return super.nnh(bundle);
            }
            dd ddVar = new dd(getActivity(), ((AbstractAsyncTaskC7211k) this.f87869ab).f87866toq);
            if (((AbstractAsyncTaskC7211k) this.f87869ab).f87868zy != 0) {
                ddVar.setTitle(((AbstractAsyncTaskC7211k) this.f87869ab).f87868zy);
            } else {
                ddVar.setTitle(((AbstractAsyncTaskC7211k) this.f87869ab).f40704q);
            }
            if (((AbstractAsyncTaskC7211k) this.f87869ab).f40702n != 0) {
                ddVar.n5r1(getActivity().getText(((AbstractAsyncTaskC7211k) this.f87869ab).f40702n));
            } else {
                ddVar.n5r1(((AbstractAsyncTaskC7211k) this.f87869ab).f40700g);
            }
            ddVar.y2(((AbstractAsyncTaskC7211k) this.f87869ab).f40703p);
            ddVar.m24877x(((AbstractAsyncTaskC7211k) this.f87869ab).f40706y);
            if (!((AbstractAsyncTaskC7211k) this.f87869ab).f40706y) {
                ddVar.nmn5(((AbstractAsyncTaskC7211k) this.f87869ab).f40705s);
                ddVar.lv5(((AbstractAsyncTaskC7211k) this.f87869ab).f87864ld6);
            }
            if (((AbstractAsyncTaskC7211k) this.f87869ab).f87863f7l8) {
                ddVar.fti(-2, ddVar.getContext().getText(R.string.cancel), ((AbstractAsyncTaskC7211k) this.f87869ab).f87865qrj);
                ddVar.setCancelable(true);
            } else {
                ddVar.fti(-2, null, null);
                ddVar.setCancelable(false);
            }
            return ddVar;
        }

        @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractAsyncTaskC7211k<?, ?> abstractAsyncTaskC7211k = this.f87869ab;
            if (abstractAsyncTaskC7211k != null && ((AbstractAsyncTaskC7211k) abstractAsyncTaskC7211k).f87863f7l8) {
                ((AbstractAsyncTaskC7211k) this.f87869ab).f87865qrj.onCancel(dialogInterface);
            }
            super.onCancel(dialogInterface);
        }

        @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            AbstractAsyncTaskC7211k<?, ?> abstractAsyncTaskC7211k = (AbstractAsyncTaskC7211k) AbstractAsyncTaskC7211k.f87862n7h.get(getArguments().getString("task"));
            this.f87869ab = abstractAsyncTaskC7211k;
            if (abstractAsyncTaskC7211k == null) {
                o1t o1tVarKi = getFragmentManager().ki();
                o1tVarKi.fu4(this);
                o1tVarKi.qrj();
            }
        }

        @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            AbstractAsyncTaskC7211k<?, ?> abstractAsyncTaskC7211k = this.f87869ab;
            if (abstractAsyncTaskC7211k != null) {
                ((AbstractAsyncTaskC7211k) abstractAsyncTaskC7211k).f87867x2 = this;
            }
        }

        @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
        public void onStop() {
            AbstractAsyncTaskC7211k<?, ?> abstractAsyncTaskC7211k = this.f87869ab;
            if (abstractAsyncTaskC7211k != null) {
                ((AbstractAsyncTaskC7211k) abstractAsyncTaskC7211k).f87867x2 = null;
            }
            super.onStop();
        }

        void zff0(int i2) {
            Dialog dialogU38j = u38j();
            if (dialogU38j instanceof dd) {
                ((dd) dialogU38j).lv5(i2);
            }
        }
    }

    public AbstractAsyncTaskC7211k(FragmentManager fragmentManager) {
        this.f40701k = fragmentManager;
    }

    private void kja0() {
        zy zyVar = (zy) this.f40701k.nmn5("AsyncTaskWithProgress@" + hashCode());
        if (zyVar != null) {
            zyVar.mo4377w();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        this.f87864ld6 = numArr[0].intValue();
        if (this.f87867x2 != null) {
            this.f87867x2.zff0(this.f87864ld6);
        }
    }

    public AbstractAsyncTaskC7211k<Params, Result> fn3e(int i2) {
        this.f40702n = i2;
        this.f40700g = null;
        return this;
    }

    public AbstractAsyncTaskC7211k<Params, Result> fu4(int i2) {
        this.f87866toq = i2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public Activity m26170h() {
        if (this.f87867x2 != null) {
            return this.f87867x2.getActivity();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public AbstractAsyncTaskC7211k<Params, Result> m26171i(int i2) {
        this.f40705s = i2;
        return this;
    }

    public AbstractAsyncTaskC7211k<Params, Result> ki(boolean z2) {
        this.f87863f7l8 = z2;
        return this;
    }

    public AbstractAsyncTaskC7211k<Params, Result> ni7(int i2) {
        this.f40703p = i2;
        return this;
    }

    public AbstractAsyncTaskC7211k<Params, Result> o1t(CharSequence charSequence) {
        this.f87868zy = 0;
        this.f40704q = charSequence;
        return this;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        f87862n7h.remove("AsyncTaskWithProgress@" + hashCode());
        kja0();
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Result result) {
        f87862n7h.remove("AsyncTaskWithProgress@" + hashCode());
        kja0();
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        String str = "AsyncTaskWithProgress@" + hashCode();
        f87862n7h.put(str, this);
        if (this.f40701k != null) {
            this.f87867x2 = zy.yp31(str);
            this.f87867x2.ec(this.f87863f7l8);
            this.f87867x2.cyoe(this.f40701k, str);
        }
    }

    public AbstractAsyncTaskC7211k<Params, Result> t8r(boolean z2) {
        this.f40706y = z2;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public AbstractAsyncTaskC7211k<Params, Result> m26172z(int i2) {
        this.f87868zy = i2;
        this.f40704q = null;
        return this;
    }

    public AbstractAsyncTaskC7211k<Params, Result> zurt(CharSequence charSequence) {
        this.f40702n = 0;
        this.f40700g = charSequence;
        return this;
    }
}
