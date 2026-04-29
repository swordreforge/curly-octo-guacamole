package miuix.view.inputmethod;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import miuix.core.util.cdj;

/* JADX INFO: renamed from: miuix.view.inputmethod.k */
/* JADX INFO: compiled from: InputMethodHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7381k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final cdj<C7381k> f92230toq = new k();

    /* JADX INFO: renamed from: k */
    private InputMethodManager f42270k;

    /* JADX INFO: renamed from: miuix.view.inputmethod.k$k */
    /* JADX INFO: compiled from: InputMethodHelper.java */
    class k extends cdj<C7381k> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // miuix.core.util.cdj
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public C7381k toq(Object obj) {
            return new C7381k((Context) obj, null);
        }
    }

    /* synthetic */ C7381k(Context context, k kVar) {
        this(context);
    }

    /* JADX INFO: renamed from: k */
    public static C7381k m26780k(Context context) {
        return f92230toq.m25525q(context);
    }

    /* JADX INFO: renamed from: q */
    public void m26781q(EditText editText) {
        editText.requestFocus();
        this.f42270k.viewClicked(editText);
        this.f42270k.showSoftInput(editText, 0);
    }

    public InputMethodManager toq() {
        return this.f42270k;
    }

    public void zy(EditText editText) {
        this.f42270k.hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
    }

    private C7381k(Context context) {
        this.f42270k = (InputMethodManager) context.getApplicationContext().getSystemService("input_method");
    }
}
