package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p030n.C7397k;
import zy.InterfaceC7828g;
import zy.InterfaceC7837n;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.app.q */
/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0102q extends DialogC0107y implements DialogInterface {

    /* JADX INFO: renamed from: g */
    static final int f314g = 0;

    /* JADX INFO: renamed from: y */
    static final int f315y = 1;

    /* JADX INFO: renamed from: n */
    final AlertController f316n;

    /* JADX INFO: renamed from: androidx.appcompat.app.q$k */
    /* JADX INFO: compiled from: AlertDialog.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private final AlertController.C0073g f317k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f46615toq;

        public k(@lvui Context context) {
            this(context, DialogInterfaceC0102q.m224y(context, 0));
        }

        public k a9(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = charSequenceArr;
            c0073g.f46517fu4 = onClickListener;
            c0073g.f46511d3 = i2;
            c0073g.f46518gvn7 = true;
            return this;
        }

        public k cdj(Drawable drawable) {
            this.f317k.f46531qrj = drawable;
            return this;
        }

        @lvui
        public DialogInterfaceC0102q create() {
            DialogInterfaceC0102q dialogInterfaceC0102q = new DialogInterfaceC0102q(this.f317k.f156k, this.f46615toq);
            this.f317k.m102k(dialogInterfaceC0102q.f316n);
            dialogInterfaceC0102q.setCancelable(this.f317k.f46521ki);
            if (this.f317k.f46521ki) {
                dialogInterfaceC0102q.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0102q.setOnCancelListener(this.f317k.f46532t8r);
            dialogInterfaceC0102q.setOnDismissListener(this.f317k.f155i);
            DialogInterface.OnKeyListener onKeyListener = this.f317k.f46515fn3e;
            if (onKeyListener != null) {
                dialogInterfaceC0102q.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0102q;
        }

        public DialogInterfaceC0102q d3() {
            DialogInterfaceC0102q dialogInterfaceC0102qCreate = create();
            dialogInterfaceC0102qCreate.show();
            return dialogInterfaceC0102qCreate;
        }

        public k f7l8(@InterfaceC7828g int i2) {
            TypedValue typedValue = new TypedValue();
            this.f317k.f156k.getTheme().resolveAttribute(i2, typedValue, true);
            this.f317k.f46538zy = typedValue.resourceId;
            return this;
        }

        public k fn3e(DialogInterface.OnCancelListener onCancelListener) {
            this.f317k.f46532t8r = onCancelListener;
            return this;
        }

        public k fti(@nn86 int i2) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f153g = c0073g.f156k.getText(i2);
            return this;
        }

        public k fu4(DialogInterface.OnKeyListener onKeyListener) {
            this.f317k.f46515fn3e = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public k mo229g(@dd Drawable drawable) {
            this.f317k.f159q = drawable;
            return this;
        }

        @lvui
        public Context getContext() {
            return this.f317k.f156k;
        }

        @Deprecated
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public k gvn7(View view, int i2, int i3, int i4, int i5) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46529o1t = view;
            c0073g.f164z = 0;
            c0073g.f46508a9 = true;
            c0073g.f46534wvg = i2;
            c0073g.f162t = i3;
            c0073g.f46525mcp = i4;
            c0073g.f46519jk = i5;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public k mo230h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46535x2 = charSequence;
            c0073g.f46526n7h = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public k mo231i(Drawable drawable) {
            this.f317k.f154h = drawable;
            return this;
        }

        public k jk(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46528ni7 = listAdapter;
            c0073g.f46517fu4 = onClickListener;
            c0073g.f46511d3 = i2;
            c0073g.f46518gvn7 = true;
            return this;
        }

        public k jp0y(int i2) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46529o1t = null;
            c0073g.f164z = i2;
            c0073g.f46508a9 = false;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public k mo232k(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46528ni7 = listAdapter;
            c0073g.f46517fu4 = onClickListener;
            return this;
        }

        public k ki(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46522kja0 = c0073g.f156k.getText(i2);
            this.f317k.f46509cdj = onClickListener;
            return this;
        }

        public k kja0(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = charSequenceArr;
            c0073g.f46530oc = onMultiChoiceClickListener;
            c0073g.f46516fti = zArr;
            c0073g.f46520jp0y = true;
            return this;
        }

        public k ld6(@nn86 int i2) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f163y = c0073g.f156k.getText(i2);
            return this;
        }

        public k mcp(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46513eqxt = cursor;
            c0073g.f46517fu4 = onClickListener;
            c0073g.f46511d3 = i2;
            c0073g.f46510d2ok = str;
            c0073g.f46518gvn7 = true;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public k mo233n(@fn3e int i2) {
            this.f317k.f46538zy = i2;
            return this;
        }

        public k n7h(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46513eqxt = cursor;
            c0073g.f46530oc = onMultiChoiceClickListener;
            c0073g.f46524lvui = str;
            c0073g.f46510d2ok = str2;
            c0073g.f46520jp0y = true;
            return this;
        }

        public k ni7(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f317k.f46512dd = onItemSelectedListener;
            return this;
        }

        public k o1t(Drawable drawable) {
            this.f317k.f158p = drawable;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public k mo234p(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = charSequenceArr;
            c0073g.f46517fu4 = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public k mo235q(@dd View view) {
            this.f317k.f46514f7l8 = view;
            return this;
        }

        public k qrj(@InterfaceC7837n int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = c0073g.f156k.getResources().getTextArray(i2);
            AlertController.C0073g c0073g2 = this.f317k;
            c0073g2.f46530oc = onMultiChoiceClickListener;
            c0073g2.f46516fti = zArr;
            c0073g2.f46520jp0y = true;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public k mo236s(@InterfaceC7837n int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = c0073g.f156k.getResources().getTextArray(i2);
            this.f317k.f46517fu4 = onClickListener;
            return this;
        }

        public k setNegativeButton(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46535x2 = c0073g.f156k.getText(i2);
            this.f317k.f46526n7h = onClickListener;
            return this;
        }

        public k setPositiveButton(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f161s = c0073g.f156k.getText(i2);
            this.f317k.f46523ld6 = onClickListener;
            return this;
        }

        public k setTitle(@dd CharSequence charSequence) {
            this.f317k.f153g = charSequence;
            return this;
        }

        public k setView(View view) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46529o1t = view;
            c0073g.f164z = 0;
            c0073g.f46508a9 = false;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public k mo237t(@InterfaceC7837n int i2, int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46537zurt = c0073g.f156k.getResources().getTextArray(i2);
            AlertController.C0073g c0073g2 = this.f317k;
            c0073g2.f46517fu4 = onClickListener;
            c0073g2.f46511d3 = i3;
            c0073g2.f46518gvn7 = true;
            return this;
        }

        public k t8r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46522kja0 = charSequence;
            c0073g.f46509cdj = onClickListener;
            return this;
        }

        public k toq(boolean z2) {
            this.f317k.f46521ki = z2;
            return this;
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public k wvg(boolean z2) {
            this.f317k.f46527ncyb = z2;
            return this;
        }

        public k x2(@dd CharSequence charSequence) {
            this.f317k.f163y = charSequence;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public k m238y(boolean z2) {
            this.f317k.f160r = z2;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public k mo239z(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f161s = charSequence;
            c0073g.f46523ld6 = onClickListener;
            return this;
        }

        public k zurt(DialogInterface.OnDismissListener onDismissListener) {
            this.f317k.f155i = onDismissListener;
            return this;
        }

        public k zy(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0073g c0073g = this.f317k;
            c0073g.f46513eqxt = cursor;
            c0073g.f46510d2ok = str;
            c0073g.f46517fu4 = onClickListener;
            return this;
        }

        public k(@lvui Context context, @hb int i2) {
            this.f317k = new AlertController.C0073g(new ContextThemeWrapper(context, DialogInterfaceC0102q.m224y(context, i2)));
            this.f46615toq = i2;
        }
    }

    protected DialogInterfaceC0102q(@lvui Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: y */
    static int m224y(@lvui Context context, @hb int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7397k.toq.f42494r, typedValue, true);
        return typedValue.resourceId;
    }

    public void cdj(CharSequence charSequence) {
        this.f316n.cdj(charSequence);
    }

    public ListView f7l8() {
        return this.f316n.m98n();
    }

    /* JADX INFO: renamed from: g */
    public Button m225g(int i2) {
        return this.f316n.zy(i2);
    }

    /* JADX INFO: renamed from: h */
    public void m226h(int i2) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i2, typedValue, true);
        this.f316n.kja0(typedValue.resourceId);
    }

    public void ki(View view) {
        this.f316n.fn3e(view);
    }

    public void kja0(Drawable drawable) {
        this.f316n.m96h(drawable);
    }

    public void ld6(int i2, CharSequence charSequence, Message message) {
        this.f316n.x2(i2, charSequence, null, message, null);
    }

    public void n7h(int i2) {
        this.f316n.kja0(i2);
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f316n.m95g();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f316n.m101y(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f316n.m100s(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* JADX INFO: renamed from: p */
    public void m227p(int i2, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f316n.x2(i2, charSequence, onClickListener, null, drawable);
    }

    public void qrj(View view) {
        this.f316n.n7h(view);
    }

    /* JADX INFO: renamed from: s */
    public void m228s(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f316n.x2(i2, charSequence, onClickListener, null, null);
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f316n.t8r(charSequence);
    }

    public void t8r(View view, int i2, int i3, int i4, int i5) {
        this.f316n.zurt(view, i2, i3, i4, i5);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void x2(int i2) {
        this.f316n.qrj(i2);
    }

    protected DialogInterfaceC0102q(@lvui Context context, @hb int i2) {
        super(context, m224y(context, i2));
        this.f316n = new AlertController(getContext(), this, getWindow());
    }

    protected DialogInterfaceC0102q(@lvui Context context, boolean z2, @dd DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z2);
        setOnCancelListener(onCancelListener);
    }
}
