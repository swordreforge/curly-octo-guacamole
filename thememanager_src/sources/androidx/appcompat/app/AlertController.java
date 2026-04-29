package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0683f;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p030n.C7397k;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private TextView f46475a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    Message f46476cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    int f46477d2ok;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    int f46479dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private int f46480eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    ListView f46481f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    Message f46482fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private TextView f46483fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private CharSequence f46484fu4;

    /* JADX INFO: renamed from: g */
    private CharSequence f137g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    ListAdapter f46485gvn7;

    /* JADX INFO: renamed from: h */
    private CharSequence f138h;

    /* JADX INFO: renamed from: i */
    private CharSequence f139i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private ImageView f46486jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private View f46487jp0y;

    /* JADX INFO: renamed from: k */
    private final Context f140k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Drawable f46488ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    Button f46489kja0;

    /* JADX INFO: renamed from: l */
    Handler f141l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f46490ld6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    int f46491lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private Drawable f46492mcp;

    /* JADX INFO: renamed from: n */
    private CharSequence f142n;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    Button f46496ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private Drawable f46497o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f46498oc;

    /* JADX INFO: renamed from: p */
    private int f143p;

    /* JADX INFO: renamed from: q */
    private final int f144q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f46499qrj;

    /* JADX INFO: renamed from: r */
    int f145r;

    /* JADX INFO: renamed from: s */
    private int f146s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    Button f46500t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final DialogC0107y f46501toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    NestedScrollView f46502wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f46503x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private boolean f46504x9kr;

    /* JADX INFO: renamed from: y */
    private View f148y;

    /* JADX INFO: renamed from: z */
    Message f149z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private Drawable f46505zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Window f46506zy;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f46494n7h = false;

    /* JADX INFO: renamed from: t */
    private int f147t = 0;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    int f46478d3 = -1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private int f46495ncyb = 0;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private final View.OnClickListener f46493n5r1 = new ViewOnClickListenerC0074k();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: k */
        private final int f150k;

        /* JADX INFO: renamed from: q */
        private final int f151q;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f150k, getPaddingRight(), z3 ? getPaddingBottom() : this.f151q);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.u0z);
            this.f151q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7397k.qrj.lm, -1);
            this.f150k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7397k.qrj.wr, -1);
        }
    }

    private static final class f7l8 extends Handler {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f46507toq = 1;

        /* JADX INFO: renamed from: k */
        private WeakReference<DialogInterface> f152k;

        public f7l8(DialogInterface dialogInterface) {
            this.f152k = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f152k.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g */
    public static class C0073g {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public DialogInterface.OnClickListener f46509cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public String f46510d2ok;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f46512dd;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        public Cursor f46513eqxt;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public View f46514f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public DialogInterface.OnKeyListener f46515fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public boolean[] f46516fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public DialogInterface.OnClickListener f46517fu4;

        /* JADX INFO: renamed from: g */
        public CharSequence f153g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public boolean f46518gvn7;

        /* JADX INFO: renamed from: h */
        public Drawable f154h;

        /* JADX INFO: renamed from: i */
        public DialogInterface.OnDismissListener f155i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public int f46519jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public boolean f46520jp0y;

        /* JADX INFO: renamed from: k */
        public final Context f156k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public CharSequence f46522kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public DialogInterface.OnClickListener f46523ld6;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public String f46524lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public int f46525mcp;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public DialogInterface.OnClickListener f46526n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public ListAdapter f46528ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public View f46529o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f46530oc;

        /* JADX INFO: renamed from: p */
        public Drawable f158p;

        /* JADX INFO: renamed from: q */
        public Drawable f159q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public Drawable f46531qrj;

        /* JADX INFO: renamed from: r */
        public boolean f160r;

        /* JADX INFO: renamed from: s */
        public CharSequence f161s;

        /* JADX INFO: renamed from: t */
        public int f162t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f46532t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final LayoutInflater f46533toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public int f46534wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public CharSequence f46535x2;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public n f46536x9kr;

        /* JADX INFO: renamed from: y */
        public CharSequence f163y;

        /* JADX INFO: renamed from: z */
        public int f164z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public CharSequence[] f46537zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f46538zy = 0;

        /* JADX INFO: renamed from: n */
        public int f157n = 0;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public boolean f46508a9 = false;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public int f46511d3 = -1;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        public boolean f46527ncyb = true;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public boolean f46521ki = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g$k */
        class k extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ RecycleListView f165k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f165k = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = C0073g.this.f46516fti;
                if (zArr != null && zArr[i2]) {
                    this.f165k.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g$n */
        public interface n {
            void onPrepareListView(ListView listView);
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g$q */
        class q implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ RecycleListView f167k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ AlertController f169q;

            q(RecycleListView recycleListView, AlertController alertController) {
                this.f167k = recycleListView;
                this.f169q = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = C0073g.this.f46516fti;
                if (zArr != null) {
                    zArr[i2] = this.f167k.isItemChecked(i2);
                }
                C0073g.this.f46530oc.onClick(this.f169q.f46501toq, i2, this.f167k.isItemChecked(i2));
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g$toq */
        class toq extends CursorAdapter {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ AlertController f170g;

            /* JADX INFO: renamed from: k */
            private final int f171k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ RecycleListView f172n;

            /* JADX INFO: renamed from: q */
            private final int f173q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            toq(Context context, Cursor cursor, boolean z2, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z2);
                this.f172n = recycleListView;
                this.f170g = alertController;
                Cursor cursor2 = getCursor();
                this.f171k = cursor2.getColumnIndexOrThrow(C0073g.this.f46510d2ok);
                this.f173q = cursor2.getColumnIndexOrThrow(C0073g.this.f46524lvui);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f171k));
                this.f172n.setItemChecked(cursor.getPosition(), cursor.getInt(this.f173q) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0073g.this.f46533toq.inflate(this.f170g.f46491lvui, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$g$zy */
        class zy implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AlertController f175k;

            zy(AlertController alertController) {
                this.f175k = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                C0073g.this.f46517fu4.onClick(this.f175k.f46501toq, i2);
                if (C0073g.this.f46518gvn7) {
                    return;
                }
                this.f175k.f46501toq.dismiss();
            }
        }

        public C0073g(Context context) {
            this.f156k = context;
            this.f46533toq = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void toq(AlertController alertController) {
            ListAdapter c0077y;
            RecycleListView recycleListView = (RecycleListView) this.f46533toq.inflate(alertController.f46477d2ok, (ViewGroup) null);
            if (this.f46520jp0y) {
                c0077y = this.f46513eqxt == null ? new k(this.f156k, alertController.f46491lvui, R.id.text1, this.f46537zurt, recycleListView) : new toq(this.f156k, this.f46513eqxt, false, recycleListView, alertController);
            } else {
                int i2 = this.f46518gvn7 ? alertController.f145r : alertController.f46479dd;
                if (this.f46513eqxt != null) {
                    c0077y = new SimpleCursorAdapter(this.f156k, i2, this.f46513eqxt, new String[]{this.f46510d2ok}, new int[]{R.id.text1});
                } else {
                    c0077y = this.f46528ni7;
                    if (c0077y == null) {
                        c0077y = new C0077y(this.f156k, i2, R.id.text1, this.f46537zurt);
                    }
                }
            }
            n nVar = this.f46536x9kr;
            if (nVar != null) {
                nVar.onPrepareListView(recycleListView);
            }
            alertController.f46485gvn7 = c0077y;
            alertController.f46478d3 = this.f46511d3;
            if (this.f46517fu4 != null) {
                recycleListView.setOnItemClickListener(new zy(alertController));
            } else if (this.f46530oc != null) {
                recycleListView.setOnItemClickListener(new q(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f46512dd;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f46518gvn7) {
                recycleListView.setChoiceMode(1);
            } else if (this.f46520jp0y) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f46481f7l8 = recycleListView;
        }

        /* JADX INFO: renamed from: k */
        public void m102k(AlertController alertController) {
            View view = this.f46514f7l8;
            if (view != null) {
                alertController.n7h(view);
            } else {
                CharSequence charSequence = this.f153g;
                if (charSequence != null) {
                    alertController.t8r(charSequence);
                }
                Drawable drawable = this.f159q;
                if (drawable != null) {
                    alertController.m96h(drawable);
                }
                int i2 = this.f46538zy;
                if (i2 != 0) {
                    alertController.kja0(i2);
                }
                int i3 = this.f157n;
                if (i3 != 0) {
                    alertController.kja0(alertController.m99q(i3));
                }
            }
            CharSequence charSequence2 = this.f163y;
            if (charSequence2 != null) {
                alertController.cdj(charSequence2);
            }
            CharSequence charSequence3 = this.f161s;
            if (charSequence3 != null || this.f158p != null) {
                alertController.x2(-1, charSequence3, this.f46523ld6, null, this.f158p);
            }
            CharSequence charSequence4 = this.f46535x2;
            if (charSequence4 != null || this.f46531qrj != null) {
                alertController.x2(-2, charSequence4, this.f46526n7h, null, this.f46531qrj);
            }
            CharSequence charSequence5 = this.f46522kja0;
            if (charSequence5 != null || this.f154h != null) {
                alertController.x2(-3, charSequence5, this.f46509cdj, null, this.f154h);
            }
            if (this.f46537zurt != null || this.f46513eqxt != null || this.f46528ni7 != null) {
                toq(alertController);
            }
            View view2 = this.f46529o1t;
            if (view2 != null) {
                if (this.f46508a9) {
                    alertController.zurt(view2, this.f46534wvg, this.f162t, this.f46525mcp, this.f46519jk);
                    return;
                } else {
                    alertController.fn3e(view2);
                    return;
                }
            }
            int i4 = this.f164z;
            if (i4 != 0) {
                alertController.m97i(i4);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$k */
    class ViewOnClickListenerC0074k implements View.OnClickListener {
        ViewOnClickListenerC0074k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f46489kja0 || (message3 = alertController.f46476cdj) == null) ? (view != alertController.f46500t8r || (message2 = alertController.f46482fn3e) == null) ? (view != alertController.f46496ni7 || (message = alertController.f149z) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f141l.obtainMessage(1, alertController2.f46501toq).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$n */
    class RunnableC0075n implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f178k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f180q;

        RunnableC0075n(View view, View view2) {
            this.f178k = view;
            this.f180q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f7l8(AlertController.this.f46481f7l8, this.f178k, this.f180q);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$q */
    class C0076q implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f181k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f183q;

        C0076q(View view, View view2) {
            this.f181k = view;
            this.f183q = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.f7l8(absListView, this.f181k, this.f183q);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    class toq implements NestedScrollView.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f184k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ View f46539toq;

        toq(View view, View view2) {
            this.f184k = view;
            this.f46539toq = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.zy
        /* JADX INFO: renamed from: k */
        public void mo103k(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.f7l8(nestedScrollView, this.f184k, this.f46539toq);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$y */
    private static class C0077y extends ArrayAdapter<CharSequence> {
        public C0077y(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f185k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f187q;

        zy(View view, View view2) {
            this.f185k = view;
            this.f187q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f7l8(AlertController.this.f46502wvg, this.f185k, this.f187q);
        }
    }

    public AlertController(Context context, DialogC0107y dialogC0107y, Window window) {
        this.f140k = context;
        this.f46501toq = dialogC0107y;
        this.f46506zy = window;
        this.f141l = new f7l8(dialogC0107y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7397k.qrj.f92753tfm, C7397k.toq.f92908lvui, 0);
        this.f46498oc = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92776wo, 0);
        this.f46480eqxt = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92657g1, 0);
        this.f46477d2ok = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92738py, 0);
        this.f46491lvui = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92673i9jn, 0);
        this.f145r = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92705m4, 0);
        this.f46479dd = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92803zsr0, 0);
        this.f46504x9kr = typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.f92745r8s8, true);
        this.f144q = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.f92634d8wk, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0107y.m253n(1);
    }

    static void f7l8(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private void fu4(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f46506zy.findViewById(C7397k.f7l8.f42320c);
        this.f46502wvg = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f46502wvg.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f46483fti = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f137g;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f46502wvg.removeView(this.f46483fti);
        if (this.f46481f7l8 == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f46502wvg.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f46502wvg);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f46481f7l8, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: k */
    static boolean m91k(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m91k(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void ki(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f46506zy.findViewById(C7397k.f7l8.f42322f);
        View viewFindViewById2 = this.f46506zy.findViewById(C7397k.f7l8.f92322hyr);
        C0683f.rp(view, i2, i3);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private int ld6() {
        int i2 = this.f46480eqxt;
        return i2 == 0 ? this.f46498oc : this.f46495ncyb == 1 ? i2 : this.f46498oc;
    }

    private void ni7(ViewGroup viewGroup) {
        int i2;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f46489kja0 = button;
        button.setOnClickListener(this.f46493n5r1);
        if (TextUtils.isEmpty(this.f138h) && this.f46488ki == null) {
            this.f46489kja0.setVisibility(8);
            i2 = 0;
        } else {
            this.f46489kja0.setText(this.f138h);
            Drawable drawable = this.f46488ki;
            if (drawable != null) {
                int i3 = this.f144q;
                drawable.setBounds(0, 0, i3, i3);
                this.f46489kja0.setCompoundDrawables(this.f46488ki, null, null, null);
            }
            this.f46489kja0.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f46500t8r = button2;
        button2.setOnClickListener(this.f46493n5r1);
        if (TextUtils.isEmpty(this.f139i) && this.f46505zurt == null) {
            this.f46500t8r.setVisibility(8);
        } else {
            this.f46500t8r.setText(this.f139i);
            Drawable drawable2 = this.f46505zurt;
            if (drawable2 != null) {
                int i4 = this.f144q;
                drawable2.setBounds(0, 0, i4, i4);
                this.f46500t8r.setCompoundDrawables(this.f46505zurt, null, null, null);
            }
            this.f46500t8r.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f46496ni7 = button3;
        button3.setOnClickListener(this.f46493n5r1);
        if (TextUtils.isEmpty(this.f46484fu4) && this.f46497o1t == null) {
            this.f46496ni7.setVisibility(8);
        } else {
            this.f46496ni7.setText(this.f46484fu4);
            Drawable drawable3 = this.f46497o1t;
            if (drawable3 != null) {
                int i5 = this.f144q;
                drawable3.setBounds(0, 0, i5, i5);
                this.f46496ni7.setCompoundDrawables(this.f46497o1t, null, null, null);
            }
            this.f46496ni7.setVisibility(0);
            i2 |= 4;
        }
        if (m93t(this.f140k)) {
            if (i2 == 1) {
                toq(this.f46489kja0);
            } else if (i2 == 2) {
                toq(this.f46500t8r);
            } else if (i2 == 4) {
                toq(this.f46496ni7);
            }
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void o1t(ViewGroup viewGroup) {
        if (this.f46487jp0y != null) {
            viewGroup.addView(this.f46487jp0y, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f46506zy.findViewById(C7397k.f7l8.f92305bo).setVisibility(8);
            return;
        }
        this.f46486jk = (ImageView) this.f46506zy.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f142n)) || !this.f46504x9kr) {
            this.f46506zy.findViewById(C7397k.f7l8.f92305bo).setVisibility(8);
            this.f46486jk.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f46506zy.findViewById(C7397k.f7l8.f42324h);
        this.f46475a9 = textView;
        textView.setText(this.f142n);
        int i2 = this.f147t;
        if (i2 != 0) {
            this.f46486jk.setImageResource(i2);
            return;
        }
        Drawable drawable = this.f46492mcp;
        if (drawable != null) {
            this.f46486jk.setImageDrawable(drawable);
        } else {
            this.f46475a9.setPadding(this.f46486jk.getPaddingLeft(), this.f46486jk.getPaddingTop(), this.f46486jk.getPaddingRight(), this.f46486jk.getPaddingBottom());
            this.f46486jk.setVisibility(8);
        }
    }

    @dd
    /* JADX INFO: renamed from: p */
    private ViewGroup m92p(@dd View view, @dd View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: t */
    private static boolean m93t(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7397k.toq.f92838d2ok, typedValue, true);
        return typedValue.data != 0;
    }

    private void toq(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void wvg() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f46506zy.findViewById(C7397k.f7l8.f92311dd);
        int i2 = C7397k.f7l8.f92351y2;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = C7397k.f7l8.f92316fn3e;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i4 = C7397k.f7l8.f92307cdj;
        View viewFindViewById6 = viewFindViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C7397k.f7l8.f92336ni7);
        m94z(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i4);
        ViewGroup viewGroupM92p = m92p(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM92p2 = m92p(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM92p3 = m92p(viewFindViewById9, viewFindViewById6);
        fu4(viewGroupM92p2);
        ni7(viewGroupM92p3);
        o1t(viewGroupM92p);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupM92p == null || viewGroupM92p.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupM92p3 == null || viewGroupM92p3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupM92p2 != null && (viewFindViewById2 = viewGroupM92p2.findViewById(C7397k.f7l8.f92337nmn5)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.f46502wvg;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f137g == null && this.f46481f7l8 == null) ? null : viewGroupM92p.findViewById(C7397k.f7l8.f42337u);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM92p2 != null && (viewFindViewById = viewGroupM92p2.findViewById(C7397k.f7l8.f92330lv5)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f46481f7l8;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z3, z5);
        }
        if (!z2) {
            View view = this.f46481f7l8;
            if (view == null) {
                view = this.f46502wvg;
            }
            if (view != null) {
                ki(viewGroupM92p2, view, z3 | (z5 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f46481f7l8;
        if (listView2 == null || (listAdapter = this.f46485gvn7) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.f46478d3;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m94z(ViewGroup viewGroup) {
        View viewInflate = this.f148y;
        if (viewInflate == null) {
            viewInflate = this.f146s != 0 ? LayoutInflater.from(this.f140k).inflate(this.f146s, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !m91k(viewInflate)) {
            this.f46506zy.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f46506zy.findViewById(C7397k.f7l8.f92355zurt);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f46494n7h) {
            frameLayout.setPadding(this.f143p, this.f46490ld6, this.f46503x2, this.f46499qrj);
        }
        if (this.f46481f7l8 != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.toq) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public void cdj(CharSequence charSequence) {
        this.f137g = charSequence;
        TextView textView = this.f46483fti;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void fn3e(View view) {
        this.f148y = view;
        this.f146s = 0;
        this.f46494n7h = false;
    }

    /* JADX INFO: renamed from: g */
    public void m95g() {
        this.f46501toq.setContentView(ld6());
        wvg();
    }

    /* JADX INFO: renamed from: h */
    public void m96h(Drawable drawable) {
        this.f46492mcp = drawable;
        this.f147t = 0;
        ImageView imageView = this.f46486jk;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f46486jk.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m97i(int i2) {
        this.f148y = null;
        this.f146s = i2;
        this.f46494n7h = false;
    }

    public void kja0(int i2) {
        this.f46492mcp = null;
        this.f147t = i2;
        ImageView imageView = this.f46486jk;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f46486jk.setImageResource(this.f147t);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public ListView m98n() {
        return this.f46481f7l8;
    }

    public void n7h(View view) {
        this.f46487jp0y = view;
    }

    /* JADX INFO: renamed from: q */
    public int m99q(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f140k.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void qrj(int i2) {
        this.f46495ncyb = i2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m100s(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f46502wvg;
        return nestedScrollView != null && nestedScrollView.m3615p(keyEvent);
    }

    public void t8r(CharSequence charSequence) {
        this.f142n = charSequence;
        TextView textView = this.f46475a9;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void x2(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f141l.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f46484fu4 = charSequence;
            this.f149z = message;
            this.f46497o1t = drawable;
        } else if (i2 == -2) {
            this.f139i = charSequence;
            this.f46482fn3e = message;
            this.f46505zurt = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f138h = charSequence;
            this.f46476cdj = message;
            this.f46488ki = drawable;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m101y(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f46502wvg;
        return nestedScrollView != null && nestedScrollView.m3615p(keyEvent);
    }

    public void zurt(View view, int i2, int i3, int i4, int i5) {
        this.f148y = view;
        this.f146s = 0;
        this.f46494n7h = true;
        this.f143p = i2;
        this.f46490ld6 = i3;
        this.f46503x2 = i4;
        this.f46499qrj = i5;
    }

    public Button zy(int i2) {
        if (i2 == -3) {
            return this.f46496ni7;
        }
        if (i2 == -2) {
            return this.f46500t8r;
        }
        if (i2 != -1) {
            return null;
        }
        return this.f46489kja0;
    }
}
