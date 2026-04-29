package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import i1.C6077k;
import java.util.HashMap;
import java.util.Map;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.ki;
import yz.C7794k;

/* JADX INFO: compiled from: PrivacyWarningFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class ebn extends com.android.thememanager.basemodule.base.toq implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: a */
    private View f9010a;

    /* JADX INFO: renamed from: b */
    private Button f9011b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private LinearLayout f57302bo;

    /* JADX INFO: renamed from: c */
    private TextView f9012c;

    /* JADX INFO: renamed from: d */
    private miuix.appcompat.app.ki f9013d;

    /* JADX INFO: renamed from: e */
    private TextView f9014e;

    /* JADX INFO: renamed from: f */
    private TextView f9015f;

    /* JADX INFO: renamed from: j */
    private CheckBox f9016j;

    /* JADX INFO: renamed from: l */
    private TextView f9017l;

    /* JADX INFO: renamed from: m */
    private Button f9018m;

    /* JADX INFO: renamed from: o */
    private TextView f9019o;

    /* JADX INFO: renamed from: r */
    private TextView f9020r;

    /* JADX INFO: renamed from: t */
    private String f9021t;

    /* JADX INFO: renamed from: u */
    private miuix.appcompat.app.dd f9022u;

    /* JADX INFO: renamed from: v */
    private miuix.appcompat.app.ki f9023v;

    /* JADX INFO: renamed from: x */
    private com.android.thememanager.presenter.zy f9024x;

    /* JADX INFO: renamed from: com.android.thememanager.activity.ebn$k */
    /* JADX INFO: compiled from: PrivacyWarningFragment.java */
    class DialogInterfaceOnClickListenerC1577k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1577k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    private void bqie() {
        View view;
        if (C1807g.lvui() || (view = this.f9010a) == null || this.f57302bo == null || view.getBottom() <= this.f57302bo.getTop()) {
            return;
        }
        this.f9010a.setBottom(this.f57302bo.getTop() - 10);
        Log.d("PrivacyWarning", "updateContentHeight because of UI error.");
    }

    private Map cyoe() {
        HashMap map = new HashMap(1);
        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void el(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.m0c6, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        r6ty().dxef(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0ad(View view) {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.iroj));
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void imd(View view) {
        if (!com.android.thememanager.basemodule.utils.mcp.m7139n()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.privacy_network_exception, 0);
            return;
        }
        if (!this.f9016j.isChecked()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.privacy_read_statement, 0);
        } else if (Build.VERSION.SDK_INT < 30 && !com.android.thememanager.basemodule.utils.lvui.m7134z()) {
            yw();
        } else {
            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.sr0i, cyoe());
            r6ty().dxef(getActivity());
        }
    }

    private void l05() {
        this.f9022u = new miuix.appcompat.app.dd(getActivity());
        if (TextUtils.equals(this.f9021t, PrivacyThemeBaseActivity.f8813f)) {
            this.f9022u.n5r1(getActivity().getResources().getString(R.string.privacy_revoking_warning));
        } else {
            this.f9022u.n5r1(getActivity().getResources().getString(R.string.privacy_loging_off_warning));
        }
        this.f9022u.y2(0);
        this.f9022u.setCancelable(false);
    }

    private com.android.thememanager.presenter.zy r6ty() {
        return this.f9024x;
    }

    private void rp(int error) {
        if (this.f9023v == null) {
            this.f9023v = new ki.C6947k(getActivity()).lrht(R.string.privacy_action_failed_title).dd(R.string.i_know, new DialogInterfaceOnClickListenerC1577k()).m25037g();
        }
        if (error == -1) {
            this.f9023v.n5r1(getString(R.string.privacy_action_failed_net_content));
        } else {
            this.f9023v.n5r1(getString(R.string.privacy_action_failed_server_content));
        }
        if (this.f9023v.isShowing()) {
            return;
        }
        this.f9023v.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wt(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.m0c6, null, com.android.thememanager.basemodule.analysis.toq.a46k));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yp31(int status) {
        if (status == -2 || status == -1) {
            miuix.appcompat.app.dd ddVar = this.f9022u;
            if (ddVar != null) {
                ddVar.dismiss();
            }
            rp(status);
            return;
        }
        if (status == 1) {
            if (this.f9022u == null) {
                l05();
                return;
            }
            return;
        }
        if (status == 2) {
            if (this.f9022u == null) {
                l05();
            }
            if (this.f9022u.isShowing()) {
                return;
            }
            this.f9022u.show();
            return;
        }
        if (status != 3) {
            miuix.appcompat.app.dd ddVar2 = this.f9022u;
            if (ddVar2 != null) {
                ddVar2.dismiss();
                return;
            }
            return;
        }
        if (this.f9022u == null) {
            l05();
        }
        this.f9022u.ch(null);
        if (TextUtils.equals(this.f9021t, PrivacyThemeBaseActivity.f8813f)) {
            this.f9022u.n5r1(getContext().getResources().getString(R.string.privacy_revoke_succeed));
        } else {
            this.f9022u.n5r1(getContext().getResources().getString(R.string.privacy_log_off_succeed));
        }
        if (this.f9022u.isShowing()) {
            return;
        }
        this.f9022u.show();
    }

    private void yw() {
        if (this.f9013d == null) {
            this.f9013d = new ki.C6947k(getActivity()).lrht(R.string.privacy_remind_user_mode_title).fu4(R.string.prvicay_permission_not_allow_desc).dd(R.string.resource_continue, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.uc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9341k.el(dialogInterface, i2);
                }
            }).mcp(R.string.miuix_compat_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.wx16
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ebn.wt(dialogInterface, i2);
                }
            }).m25037g();
        }
        if (this.f9013d.isShowing()) {
            return;
        }
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.m0c6, null, ""));
        this.f9013d.show();
    }

    private void zff0(View rootView) {
        this.f9020r = (TextView) rootView.findViewById(R.id.title);
        this.f9017l = (TextView) rootView.findViewById(R.id.warning_prompt);
        this.f9015f = (TextView) rootView.findViewById(R.id.warning_content_1);
        this.f9012c = (TextView) rootView.findViewById(R.id.warning_content_2);
        this.f9014e = (TextView) rootView.findViewById(R.id.warning_content_3);
        this.f9016j = (CheckBox) rootView.findViewById(R.id.have_read);
        this.f9019o = (TextView) rootView.findViewById(R.id.have_read_content);
        this.f9018m = (Button) rootView.findViewById(R.id.give_up_retraction);
        this.f9011b = (Button) rootView.findViewById(R.id.retraction_and_exit);
        this.f9010a = rootView.findViewById(R.id.privacy_warning_content_scroll);
        this.f57302bo = (LinearLayout) rootView.findViewById(R.id.check_layout);
        C6077k.cdj(this.f9018m);
        C6077k.cdj(this.f9011b);
        this.f9018m.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.do
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8983k.g0ad(view);
            }
        });
        this.f9011b.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.ukdy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9343k.imd(view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9010a.getLayoutParams();
        if (TextUtils.equals(this.f9021t, PrivacyThemeBaseActivity.f8813f)) {
            this.f9020r.setText(R.string.privacy_phone_revoke_agree_detail_title);
            this.f9017l.setText(R.string.privacy_phone_revoke_agree_detail_prompt);
            this.f9015f.setText(R.string.privacy_phone_revoke_agree_detail_content_1);
            this.f9012c.setText(R.string.privacy_phone_revoke_agree_detail_content_2);
            this.f9014e.setText(R.string.privacy_phone_revoke_agree_detail_content_3);
            this.f9019o.setText(com.android.thememanager.basemodule.utils.hyr.m7091k(getActivity(), R.string.privacy_phone_read_theme_privacy_policy, getContext().getResources().getColor(R.color.policy_warning_fragment_checkbox_text), ""));
            this.f9018m.setText(R.string.privacy_give_up_revoke_btn);
            this.f9011b.setText(R.string.privacy_confirm_revoke_and_exit_btn);
            marginLayoutParams.topMargin = (int) getActivity().getResources().getDimension(R.dimen.privacy_warning_state);
            return;
        }
        if (TextUtils.equals(this.f9021t, PrivacyThemeBaseActivity.f8815l)) {
            this.f9020r.setText(R.string.privacy_phone_logoff_theme_service_detail_title);
            this.f9017l.setText(R.string.privacy_phone_logoff_theme_service_detail_prompt);
            this.f9015f.setText(R.string.privacy_phone_logoff_theme_service_detail_content_1);
            this.f9012c.setText(R.string.privacy_phone_logoff_theme_service_detail_content_2);
            this.f9014e.setText(R.string.privacy_phone_logoff_theme_service_detail_content_3);
            this.f9019o.setText(com.android.thememanager.basemodule.utils.hyr.m7091k(getActivity(), R.string.privacy_phone_read_theme_logoff_privacy_policy, getContext().getResources().getColor(R.color.policy_warning_fragment_checkbox_text), ""));
            this.f9018m.setText(R.string.privacy_give_up_logoff);
            this.f9011b.setText(R.string.privacy_confirm_logoff_and_exit);
            marginLayoutParams.topMargin = (int) getActivity().getResources().getDimension(R.dimen.privacy_warning_content_margin_top);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@zy.dd Bundle savedInstanceState) {
        AbstractC6946k abstractC6946kM6709b;
        super.onActivityCreated(savedInstanceState);
        if (!(getActivity() instanceof PrivacyThemeBaseActivity) || (abstractC6946kM6709b = ((PrivacyThemeBaseActivity) getActivity()).m6709b()) == null) {
            return;
        }
        abstractC6946kM6709b.mcp();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f9021t = getArguments().getString(PrivacyThemeBaseActivity.f8816r);
        this.f9024x = (com.android.thememanager.presenter.zy) new C0924e(this).m4420k(com.android.thememanager.presenter.zy.class);
        Resource resourceLd6 = new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10536k()).m7690k().ld6();
        if (resourceLd6 != null) {
            this.f9024x.kcsr(resourceLd6, "theme");
        } else {
            C7794k.f7l8("default resource null?");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(@zy.lvui LayoutInflater inflater, @zy.dd ViewGroup container, @zy.dd Bundle savedInstanceState) {
        return inflater.inflate(R.layout.privacy_warning, (ViewGroup) null);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        miuix.appcompat.app.dd ddVar = this.f9022u;
        if (ddVar != null) {
            ddVar.dismiss();
        }
        miuix.appcompat.app.ki kiVar = this.f9023v;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        miuix.appcompat.app.ki kiVar2 = this.f9013d;
        if (kiVar2 != null) {
            kiVar2.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        miuix.appcompat.app.ki kiVar = this.f9023v;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        miuix.appcompat.app.dd ddVar = this.f9022u;
        if (ddVar != null) {
            ddVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        if (this.f9024x.oki().m4388g() != null && this.f9024x.oki().m4388g().intValue() > 0) {
            yp31(this.f9024x.oki().m4388g().intValue());
        }
        this.f9024x.oki().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.ixz
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9102k.yp31(((Integer) obj).intValue());
            }
        });
        zff0(view);
    }
}
