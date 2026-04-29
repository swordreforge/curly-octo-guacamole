package zwy;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.appcompat.view.C0136q;
import androidx.core.view.C0683f;
import com.google.android.material.color.kja0;
import com.google.android.material.shape.C4108p;
import h4b.C6070k;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.InterfaceC7837n;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.nn86;

/* JADX INFO: compiled from: MaterialAlertDialogBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends DialogInterfaceC0102q.k {

    /* JADX INFO: renamed from: q */
    @cdj
    @lvui
    private final Rect f46155q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private Drawable f100928zy;

    /* JADX INFO: renamed from: n */
    @InterfaceC7828g
    private static final int f46154n = C6095k.zy.f80158d2ok;

    /* JADX INFO: renamed from: g */
    @hb
    private static final int f46153g = C6095k.n7h.verb;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7828g
    private static final int f100927f7l8 = C6095k.zy.n4kc;

    public toq(@lvui Context context) {
        this(context, 0);
    }

    private static int d2ok(@lvui Context context) {
        TypedValue typedValueM14747k = com.google.android.material.resources.toq.m14747k(context, f100927f7l8);
        if (typedValueM14747k == null) {
            return 0;
        }
        return typedValueM14747k.data;
    }

    private static int lvui(@lvui Context context, int i2) {
        return i2 == 0 ? d2ok(context) : i2;
    }

    private static Context oc(@lvui Context context) {
        int iD2ok = d2ok(context);
        Context contextZy = C6070k.zy(context, null, f46154n, f46153g);
        return iD2ok == 0 ? contextZy : new C0136q(contextZy, iD2ok);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public toq fn3e(@dd DialogInterface.OnCancelListener onCancelListener) {
        return (toq) super.fn3e(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: a98o, reason: merged with bridge method [inline-methods] */
    public toq mo231i(@dd Drawable drawable) {
        return (toq) super.mo231i(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public toq cdj(@dd Drawable drawable) {
        return (toq) super.cdj(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: bf2, reason: merged with bridge method [inline-methods] */
    public toq ki(@nn86 int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.ki(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: bo, reason: merged with bridge method [inline-methods] */
    public toq mcp(@dd Cursor cursor, int i2, @lvui String str, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mcp(cursor, i2, str, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public toq mo235q(@dd View view) {
        return (toq) super.mo235q(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: c8jq, reason: merged with bridge method [inline-methods] */
    public toq a9(@dd CharSequence[] charSequenceArr, int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.a9(charSequenceArr, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: ch, reason: merged with bridge method [inline-methods] */
    public toq fu4(@dd DialogInterface.OnKeyListener onKeyListener) {
        return (toq) super.fu4(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    public DialogInterfaceC0102q create() {
        DialogInterfaceC0102q dialogInterfaceC0102qCreate = super.create();
        Window window = dialogInterfaceC0102qCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f100928zy;
        if (drawable instanceof C4108p) {
            ((C4108p) drawable).zp(C0683f.m3166l(decorView));
        }
        window.setBackgroundDrawable(zy.toq(this.f100928zy, this.f46155q));
        decorView.setOnTouchListener(new ViewOnTouchListenerC7823k(dialogInterfaceC0102qCreate, this.f46155q));
        return dialogInterfaceC0102qCreate;
    }

    @lvui
    public toq dd(@dd Drawable drawable) {
        this.f100928zy = drawable;
        return this;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: dr, reason: merged with bridge method [inline-methods] */
    public toq setTitle(@dd CharSequence charSequence) {
        return (toq) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public toq mo236s(@InterfaceC7837n int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo236s(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public toq kja0(@dd CharSequence[] charSequenceArr, @dd boolean[] zArr, @dd DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (toq) super.kja0(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @dd
    public Drawable eqxt() {
        return this.f100928zy;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public toq zy(@dd Cursor cursor, @dd DialogInterface.OnClickListener onClickListener, @lvui String str) {
        return (toq) super.zy(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: gyi, reason: merged with bridge method [inline-methods] */
    public toq fti(@nn86 int i2) {
        return (toq) super.fti(i2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: hb, reason: merged with bridge method [inline-methods] */
    public toq ld6(@nn86 int i2) {
        return (toq) super.ld6(i2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
    public toq toq(boolean z2) {
        return (toq) super.toq(z2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public toq t8r(@dd CharSequence charSequence, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.t8r(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public toq x2(@dd CharSequence charSequence) {
        return (toq) super.x2(charSequence);
    }

    @lvui
    /* JADX INFO: renamed from: l */
    public toq m28231l(@InterfaceC7833l int i2) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f46155q.right = i2;
        } else {
            this.f46155q.left = i2;
        }
        return this;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: lrht, reason: merged with bridge method [inline-methods] */
    public toq mo233n(@fn3e int i2) {
        return (toq) super.mo233n(i2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: lv5, reason: merged with bridge method [inline-methods] */
    public toq mo239z(@dd CharSequence charSequence, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo239z(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public toq n7h(@dd Cursor cursor, @lvui String str, @lvui String str2, @dd DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (toq) super.n7h(cursor, str, str2, onMultiChoiceClickListener);
    }

    @lvui
    public toq n5r1(@InterfaceC7833l int i2) {
        this.f46155q.top = i2;
        return this;
    }

    @lvui
    public toq ncyb(@InterfaceC7833l int i2) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f46155q.left = i2;
        } else {
            this.f46155q.right = i2;
        }
        return this;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: nmn5, reason: merged with bridge method [inline-methods] */
    public toq setPositiveButton(@nn86 int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.setPositiveButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: nn86, reason: merged with bridge method [inline-methods] */
    public toq mo234p(@dd CharSequence[] charSequenceArr, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo234p(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public toq qrj(@InterfaceC7837n int i2, @dd boolean[] zArr, @dd DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (toq) super.qrj(i2, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public toq mo232k(@dd ListAdapter listAdapter, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo232k(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: t8iq, reason: merged with bridge method [inline-methods] */
    public toq o1t(@dd Drawable drawable) {
        return (toq) super.o1t(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public toq mo237t(@InterfaceC7837n int i2, int i3, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo237t(i2, i3, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: uv6, reason: merged with bridge method [inline-methods] */
    public toq mo229g(@dd Drawable drawable) {
        return (toq) super.mo229g(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public toq setView(@dd View view) {
        return (toq) super.setView(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public toq f7l8(@InterfaceC7828g int i2) {
        return (toq) super.f7l8(i2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public toq ni7(@dd AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (toq) super.ni7(onItemSelectedListener);
    }

    @lvui
    public toq x9kr(@InterfaceC7833l int i2) {
        this.f46155q.bottom = i2;
        return this;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: xwq3, reason: merged with bridge method [inline-methods] */
    public toq jp0y(int i2) {
        return (toq) super.jp0y(i2);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public toq jk(@dd ListAdapter listAdapter, int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.jk(listAdapter, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: y9n, reason: merged with bridge method [inline-methods] */
    public toq mo230h(@dd CharSequence charSequence, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.mo230h(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: yz, reason: merged with bridge method [inline-methods] */
    public toq setNegativeButton(@nn86 int i2, @dd DialogInterface.OnClickListener onClickListener) {
        return (toq) super.setNegativeButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0102q.k
    @lvui
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public toq zurt(@dd DialogInterface.OnDismissListener onDismissListener) {
        return (toq) super.zurt(onDismissListener);
    }

    public toq(@lvui Context context, int i2) {
        super(oc(context), lvui(context, i2));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i3 = f46154n;
        int i4 = f46153g;
        this.f46155q = zy.m28238k(context2, i3, i4);
        int iZy = kja0.zy(context2, C6095k.zy.f80274sc, getClass().getCanonicalName());
        C4108p c4108p = new C4108p(context2, null, i3, i4);
        c4108p.m14856e(context2);
        c4108p.m14867x(ColorStateList.valueOf(iZy));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c4108p.i1(dimension);
            }
        }
        this.f100928zy = c4108p;
    }
}
