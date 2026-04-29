package com.android.thememanager.view;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;

/* JADX INFO: loaded from: classes2.dex */
public class MixItemView extends LinearLayout implements CompoundButton.OnCheckedChangeListener, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    public static final String f17312g = "lockscreen";

    /* JADX INFO: renamed from: h */
    public static final String f17313h = "aod";

    /* JADX INFO: renamed from: p */
    public static final String f17314p = "icon";

    /* JADX INFO: renamed from: s */
    public static final String f17315s = "global";

    /* JADX INFO: renamed from: y */
    public static final String f17316y = "home";

    /* JADX INFO: renamed from: k */
    private CheckBox f17317k;

    /* JADX INFO: renamed from: n */
    private toq f17318n;

    /* JADX INFO: renamed from: q */
    private String f17319q;

    /* JADX INFO: renamed from: com.android.thememanager.view.MixItemView$k */
    class ViewOnClickListenerC2888k implements View.OnClickListener {
        ViewOnClickListenerC2888k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.yw7);
            arrayMapZy.put(com.android.thememanager.basemodule.analysis.toq.u0z, Boolean.valueOf(MixItemView.this.f17317k.isChecked()));
            arrayMapZy.put("contentType", MixItemView.this.f17319q);
            C1708s.f7l8().ld6().ni7(arrayMapZy);
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m10257k(boolean isChecked);
    }

    public MixItemView(Context context) {
        super(context);
        zy(context);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        toq toqVar = this.f17318n;
        if (toqVar != null) {
            toqVar.m10257k(isChecked);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m10256q() {
        return this.f17317k.isChecked();
    }

    public void setChecked(boolean checked) {
        this.f17317k.setChecked(checked);
    }

    public void setOnCheckedChangeListener(toq onCheckedChangeListener) {
        this.f17318n = onCheckedChangeListener;
    }

    public void setTextAndType(int id, String type) {
        this.f17317k.setText(id);
        this.f17319q = type;
    }

    public void zy(Context context) {
        View.inflate(context, R.layout.mix_item_layout, this);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
        this.f17317k = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        this.f17317k.setOnClickListener(new ViewOnClickListenerC2888k());
    }

    public MixItemView(Context context, @zy.dd AttributeSet attrs) {
        super(context, attrs);
        zy(context);
    }

    public MixItemView(Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        zy(context);
    }

    public MixItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        zy(context);
    }
}
