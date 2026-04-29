package miuix.stretchablewidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.stretchablewidget.toq;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class StretchableWidget extends LinearLayout {

    /* JADX INFO: renamed from: m */
    private static final String f41908m = "end";

    /* JADX INFO: renamed from: o */
    private static final String f41909o = "start";

    /* JADX INFO: renamed from: c */
    private String f41910c;

    /* JADX INFO: renamed from: e */
    private zy f41911e;

    /* JADX INFO: renamed from: f */
    private View f41912f;

    /* JADX INFO: renamed from: g */
    private ImageView f41913g;

    /* JADX INFO: renamed from: h */
    private View f41914h;

    /* JADX INFO: renamed from: i */
    private boolean f41915i;

    /* JADX INFO: renamed from: j */
    protected int f41916j;

    /* JADX INFO: renamed from: k */
    private RelativeLayout f41917k;

    /* JADX INFO: renamed from: l */
    private int f41918l;

    /* JADX INFO: renamed from: n */
    protected TextView f41919n;

    /* JADX INFO: renamed from: p */
    private View f41920p;

    /* JADX INFO: renamed from: q */
    private TextView f41921q;

    /* JADX INFO: renamed from: r */
    private int f41922r;

    /* JADX INFO: renamed from: s */
    private WidgetContainer f41923s;

    /* JADX INFO: renamed from: t */
    private String f41924t;

    /* JADX INFO: renamed from: y */
    private ImageView f41925y;

    /* JADX INFO: renamed from: z */
    private Context f41926z;

    /* JADX INFO: renamed from: miuix.stretchablewidget.StretchableWidget$k */
    class ViewOnClickListenerC7361k implements View.OnClickListener {
        ViewOnClickListenerC7361k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StretchableWidget.this.f7l8();
        }
    }

    class toq implements miuix.stretchablewidget.zy {
        toq() {
        }

        @Override // miuix.stretchablewidget.zy
        /* JADX INFO: renamed from: k */
        public void mo26749k(String str) {
            StretchableWidget.this.setDetailMessage(str);
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void m26750k(boolean z2);
    }

    public StretchableWidget(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        this.f41915i = !this.f41915i;
        AnimSpecialConfig animSpecialConfig = (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f);
        if (this.f41915i) {
            Folme.useValue(this.f41923s).to("start", new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, animSpecialConfig));
            this.f41925y.setBackgroundResource(toq.C7371y.f91945sc);
            this.f41914h.setVisibility(0);
            this.f41920p.setVisibility(0);
        } else {
            Folme.useValue(this.f41923s).to("end", new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, animSpecialConfig));
            this.f41925y.setBackgroundResource(toq.C7371y.f92001zuf);
            this.f41914h.setVisibility(8);
            this.f41920p.setVisibility(8);
        }
        zy zyVar = this.f41911e;
        if (zyVar != null) {
            zyVar.m26750k(this.f41915i);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m26747q(Context context, AttributeSet attributeSet, int i2) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(toq.x2.f91780gvn7, (ViewGroup) this, true);
        this.f41917k = (RelativeLayout) viewInflate.findViewById(toq.C7370s.f91728tww7);
        this.f41913g = (ImageView) viewInflate.findViewById(toq.C7370s.f91738vq);
        this.f41921q = (TextView) viewInflate.findViewById(toq.C7370s.f91638ew);
        this.f41925y = (ImageView) viewInflate.findViewById(toq.C7370s.f91663ix);
        this.f41919n = (TextView) viewInflate.findViewById(toq.C7370s.f91612bo);
        this.f41923s = (WidgetContainer) viewInflate.findViewById(toq.C7370s.f91620ch);
        this.f41920p = viewInflate.findViewById(toq.C7370s.f91753y9n);
        this.f41914h = viewInflate.findViewById(toq.C7370s.f91639f1bi);
        setTitle(this.f41924t);
        mo26744n(this.f41926z, attributeSet, i2);
        m26748g(this.f41918l);
        setIcon(this.f41922r);
        setDetailMessage(this.f41910c);
        setState(this.f41915i);
        this.f41917k.setOnClickListener(new ViewOnClickListenerC7361k());
    }

    private void setContainerAmin(boolean z2) {
        IStateStyle iStateStyleAdd = Folme.useValue(this.f41923s).setup("start").add("widgetHeight", this.f41916j);
        ViewProperty viewProperty = ViewProperty.ALPHA;
        iStateStyleAdd.add((FloatProperty) viewProperty, 1.0f).setup("end").add("widgetHeight", 0).add((FloatProperty) viewProperty, 0.0f);
        Folme.useValue(this.f41923s).setTo(z2 ? "start" : "end");
    }

    private View zy(int i2) {
        if (i2 == 0) {
            return null;
        }
        return ((LayoutInflater) this.f41926z.getSystemService("layout_inflater")).inflate(i2, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: g */
    public View m26748g(int i2) {
        if (i2 == 0) {
            return null;
        }
        View viewZy = zy(i2);
        setView(viewZy);
        return viewZy;
    }

    public View getLayout() {
        return this.f41912f;
    }

    /* JADX INFO: renamed from: n */
    protected void mo26744n(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setDetailMessage(CharSequence charSequence) {
        if (charSequence != null) {
            this.f41919n.setText(charSequence);
        }
    }

    public void setIcon(int i2) {
        if (i2 == 0) {
            return;
        }
        this.f41913g.setBackgroundResource(i2);
    }

    public void setLayout(View view) {
        setView(view);
    }

    public void setState(boolean z2) {
        if (z2) {
            this.f41925y.setBackgroundResource(toq.C7371y.f91945sc);
            this.f41914h.setVisibility(0);
            this.f41920p.setVisibility(0);
        } else {
            this.f41925y.setBackgroundResource(toq.C7371y.f92001zuf);
            this.f41914h.setVisibility(8);
            this.f41920p.setVisibility(8);
        }
        setContainerAmin(z2);
    }

    public void setStateChangedListener(zy zyVar) {
        this.f41911e = zyVar;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f41921q.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    public void setView(View view) {
        if (view == 0) {
            return;
        }
        this.f41912f = view;
        if (view instanceof InterfaceC7363q) {
            ((InterfaceC7363q) view).m26751k(new toq());
        }
        if (this.f41923s.getChildCount() == 0) {
            this.f41923s.addView(view);
        } else {
            this.f41923s.removeAllViews();
            this.f41923s.addView(view);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f41916j = view.getMeasuredHeight();
        toq();
        setContainerAmin(this.f41915i);
    }

    protected void toq() {
    }

    public StretchableWidget(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7369q.verb);
    }

    public StretchableWidget(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41916j = 0;
        setOrientation(1);
        this.f41926z = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.cdj.xrg, i2, 0);
        this.f41924t = typedArrayObtainStyledAttributes.getString(toq.cdj.a46k);
        this.f41922r = typedArrayObtainStyledAttributes.getResourceId(toq.cdj.zlf, 0);
        this.f41918l = typedArrayObtainStyledAttributes.getResourceId(toq.cdj.f4f, 0);
        this.f41910c = typedArrayObtainStyledAttributes.getString(toq.cdj.sa);
        this.f41915i = typedArrayObtainStyledAttributes.getBoolean(toq.cdj.xzk6, false);
        m26747q(context, attributeSet, i2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
