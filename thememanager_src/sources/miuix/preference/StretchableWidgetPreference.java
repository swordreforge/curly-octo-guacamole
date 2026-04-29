package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.preference.kja0;
import miuix.stretchablewidget.StretchableWidget;
import miuix.stretchablewidget.WidgetContainer;
import miuix.stretchablewidget.toq;

/* JADX INFO: loaded from: classes2.dex */
public class StretchableWidgetPreference extends Preference {
    private static final String yl25 = "start";
    private static final String zmmu = "end";
    private RelativeLayout aj;
    private TextView ar;
    private View bc;
    private boolean bd;
    private ImageView be;
    private WidgetContainer bs;
    private View bu;
    private TextView k0;
    private StretchableWidget.zy tgs;
    private String tlhn;
    private int w97r;

    /* JADX INFO: renamed from: miuix.preference.StretchableWidgetPreference$k */
    class ViewOnClickListenerC7286k implements View.OnClickListener {
        ViewOnClickListenerC7286k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StretchableWidgetPreference.this.uc();
        }
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w97r = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.oy, i2, 0);
        this.tlhn = typedArrayObtainStyledAttributes.getString(kja0.ki.fzr);
        this.bd = typedArrayObtainStyledAttributes.getBoolean(kja0.ki.h9w7, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void h7am(boolean z2) {
        IStateStyle iStateStyleAdd = Folme.useValue(this.bs).setup("start").add("widgetHeight", this.w97r);
        ViewProperty viewProperty = ViewProperty.ALPHA;
        iStateStyleAdd.add((FloatProperty) viewProperty, 1.0f).setup("end").add("widgetHeight", 0).add((FloatProperty) viewProperty, 0.0f);
        Folme.useValue(this.bs).setTo(z2 ? "start" : "end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uc() {
        boolean z2 = !this.bd;
        this.bd = z2;
        if (z2) {
            Folme.useValue(this.bs).to("start", new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.be.setBackgroundResource(toq.C7371y.f91945sc);
            this.bc.setVisibility(0);
            this.bu.setVisibility(0);
        } else {
            Folme.useValue(this.bs).to("end", new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.be.setBackgroundResource(toq.C7371y.f92001zuf);
            this.bc.setVisibility(8);
            this.bu.setVisibility(8);
        }
        StretchableWidget.zy zyVar = this.tgs;
        if (zyVar != null) {
            zyVar.m26750k(this.bd);
        }
    }

    public void jbh(StretchableWidget.zy zyVar) {
        this.tgs = zyVar;
    }

    public void mbx(boolean z2) {
        if (z2) {
            this.be.setBackgroundResource(kja0.C7299y.zio);
            this.bc.setVisibility(0);
            this.bu.setVisibility(0);
        } else {
            this.be.setBackgroundResource(kja0.C7299y.sval);
            this.bc.setVisibility(8);
            this.bu.setVisibility(8);
        }
        h7am(z2);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        super.mo4638o(c1016i);
        View view = c1016i.itemView;
        this.aj = (RelativeLayout) view.findViewById(kja0.C7296p.fm);
        WidgetContainer widgetContainer = (WidgetContainer) view.findViewById(R.id.widget_frame);
        this.bs = widgetContainer;
        widgetContainer.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.w97r = this.bs.getMeasuredHeight();
        this.ar = (TextView) view.findViewById(kja0.C7296p.vf);
        this.k0 = (TextView) view.findViewById(kja0.C7296p.f89262ew);
        ImageView imageView = (ImageView) view.findViewById(kja0.C7296p.li5y);
        this.be = imageView;
        imageView.setBackgroundResource(kja0.C7299y.sval);
        this.bc = view.findViewById(kja0.C7296p.f89301kcsr);
        this.bu = view.findViewById(kja0.C7296p.mc);
        vep5(this.tlhn);
        mbx(this.bd);
        this.aj.setOnClickListener(new ViewOnClickListenerC7286k());
    }

    public void vep5(String str) {
        this.k0.setText(str);
    }

    public void yl(String str) {
        this.ar.setText(str);
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.rv);
    }

    public StretchableWidgetPreference(Context context) {
        this(context, null);
    }
}
