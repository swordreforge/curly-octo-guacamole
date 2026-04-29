package com.android.thememanager.settings.subsettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.WallpaperMiuiTabActivity;
import com.android.thememanager.view.ThemePreferenceView;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mbx.C6812k;
import miuix.appcompat.app.ki;
import miuix.appcompat.app.t8r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.g */
/* JADX INFO: compiled from: WallpaperHeaderAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nWallpaperHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallpaperHeaderAdapter.kt\ncom/android/thememanager/settings/subsettings/TitleVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class ViewOnClickListenerC2614g extends RecyclerView.fti implements View.OnClickListener {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ThemePreferenceView f15457k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final TextView f15458q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.g$k */
    /* JADX INFO: compiled from: WallpaperHeaderAdapter.kt */
    public static final class k implements p000a.zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1717k f60867toq;

        k(AbstractActivityC1717k abstractActivityC1717k) {
            this.f60867toq = abstractActivityC1717k;
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            C2687z.kja0();
            ViewOnClickListenerC2614g.this.m9176z();
        }

        @Override // p000a.zy
        public void toq(boolean z2) {
            if (z2) {
                lvui.ki(this.f60867toq, false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2614g(@InterfaceC7396q ThemePreferenceView view) {
        super(view);
        d2ok.m23075h(view, "view");
        this.f15457k = view;
        this.f15458q = view.getTitleView();
    }

    private final void fn3e() {
        Context context = this.itemView.getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type com.android.thememanager.basemodule.base.AbstractBaseActivity");
        AbstractActivityC1717k abstractActivityC1717k = (AbstractActivityC1717k) context;
        TextView textView = this.f15458q;
        String strValueOf = String.valueOf(textView != null ? textView.getText() : null);
        f7l8 f7l8Var = new f7l8(1, 10);
        f7l8Var.f15454q = strValueOf;
        Intent intentM24743n = C1807g.m7081r() ? C6812k.m24743n(abstractActivityC1717k) : new Intent(abstractActivityC1717k, (Class<?>) WallpaperMiuiTabActivity.class);
        if (intentM24743n == null) {
            return;
        }
        List<PageGroup> listM9185k = new x2().m9185k(abstractActivityC1717k);
        Intent intent = abstractActivityC1717k.getIntent();
        intentM24743n.putExtra(com.android.thememanager.f7l8.f58072zy, intent != null ? Boolean.valueOf(intent.getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)) : null);
        Intent intent2 = abstractActivityC1717k.getIntent();
        intentM24743n.putExtra(com.android.thememanager.f7l8.f11607n, intent2 != null ? Integer.valueOf(intent2.getIntExtra(com.android.thememanager.f7l8.f11607n, -1)) : null);
        intentM24743n.putExtra(InterfaceC1357q.f53943tfm, false);
        intentM24743n.putExtra(InterfaceC1357q.f53866eqxt, strValueOf);
        d2ok.n7h(listM9185k, "null cannot be cast to non-null type java.io.Serializable");
        intentM24743n.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) listM9185k);
        intentM24743n.putExtra(InterfaceC1357q.f53949uv6, 10);
        intentM24743n.putExtra("category_type", f7l8Var.f15451k);
        Intent intent3 = abstractActivityC1717k.getIntent();
        intentM24743n.putExtra(com.android.thememanager.f7l8.f11609q, intent3 != null ? Boolean.valueOf(intent3.getBooleanExtra(com.android.thememanager.f7l8.f11609q, false)) : null);
        abstractActivityC1717k.startActivityForResult(intentM24743n, 113);
        String strYz = abstractActivityC1717k.yz();
        com.android.thememanager.basemodule.analysis.kja0.f7l8(strYz, com.android.thememanager.basemodule.analysis.toq.pf98 + f7l8Var.zy(), "");
        C1708s.f7l8().ld6().ni7(C1706p.kja0(strYz, com.android.thememanager.basemodule.analysis.toq.pf98 + f7l8Var.zy(), ""));
    }

    @InterfaceC7396q
    public final ThemePreferenceView fu4() {
        return this.f15457k;
    }

    public final void ki(int i2, int i3) {
        this.itemView.setOnClickListener(this);
        this.itemView.setTag(Integer.valueOf(i2));
        TextView textView = this.f15458q;
        if (textView != null) {
            textView.setText(i3);
        }
    }

    @InterfaceC7395n
    public final TextView ni7() {
        return this.f15458q;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC7396q View v2) {
        d2ok.m23075h(v2, "v");
        Integer num = (Integer) v2.getTag();
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue < 0) {
            return;
        }
        if (iIntValue == 0) {
            fn3e();
            return;
        }
        if (iIntValue != 1) {
            return;
        }
        Context context = v2.getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type com.android.thememanager.basemodule.base.AbstractBaseActivity");
        AbstractActivityC1717k abstractActivityC1717k = (AbstractActivityC1717k) context;
        if (lvui.qrj(abstractActivityC1717k, new k(abstractActivityC1717k))) {
            return;
        }
        m9176z();
    }

    /* JADX INFO: renamed from: z */
    public void m9176z() {
        Context context = this.f15457k.getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (activity instanceof AbstractActivityC1717k) {
            String strYz = ((AbstractActivityC1717k) activity).yz();
            Intent intent = activity.getIntent();
            if (!C1803e.qrj(activity, intent != null ? intent.getBooleanExtra(com.android.thememanager.f7l8.f11609q, false) : false)) {
                ki kiVarX2 = C1819o.x2((t8r) activity);
                d2ok.qrj(kiVarX2);
                kiVarX2.show();
                C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.n9, ((AbstractActivityC1717k) activity).mo6345a(), ""));
            }
            com.android.thememanager.basemodule.analysis.kja0.f7l8(strYz, com.android.thememanager.basemodule.analysis.toq.tpq8, "");
            C1708s.f7l8().ld6().ni7(C1706p.kja0(strYz, com.android.thememanager.basemodule.analysis.toq.tpq8, ""));
        }
    }
}
