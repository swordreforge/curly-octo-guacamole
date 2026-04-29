package com.android.thememanager.settings.personalize.holder;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.personalize.ld6;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FontCardHolder extends BottomViewHolder {

    /* JADX INFO: renamed from: i */
    private static final String f15236i = "FontCardHolder";

    /* JADX INFO: renamed from: h */
    private TextView f15237h;

    /* JADX INFO: renamed from: p */
    private LinearLayout f15238p;

    public FontCardHolder(final Activity activity, View itemView) {
        super(activity, itemView);
        this.f15238p = (LinearLayout) itemView.findViewById(R.id.card_container);
        this.f15237h = (TextView) itemView.findViewById(R.id.font_title);
        m9060t();
        C6077k.o1t(this.f15238p);
        this.f15238p.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.holder.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontCardHolder.mcp(activity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void mcp(Activity activity, View view) {
        if (C1819o.dd((Activity) view.getContext())) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
            return;
        }
        if (o1t.fu4()) {
            nn86.m7150k(R.string.personalize_second_space_not_support_set_font, 0);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", ld6.f15259n);
        try {
            activity.startActivity(intent);
        } catch (Exception e2) {
            Log.e(f15236i, e2.getMessage());
        }
        C1708s.f7l8().ld6().ni7(C1706p.kja0("personalize", "personalize_font_card", ""));
    }

    /* JADX INFO: renamed from: t */
    private void m9060t() {
        if (p001b.toq.t8r("fonts").equals(C1792n.toq(this.f15230k, "fonts"))) {
            this.f15237h.setText(R.string.personalize_default_font);
            this.f15238p.setContentDescription(this.f15230k.getString(R.string.personalize_default_font));
        } else {
            this.f15237h.setText(R.string.personalize_third_font);
            this.f15238p.setContentDescription(this.f15230k.getResources().getString(R.string.personalize_third_font));
        }
    }

    @Override // com.android.thememanager.settings.personalize.holder.BottomViewHolder
    public String o1t() {
        return "personalize_font_card";
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        m9060t();
    }
}
