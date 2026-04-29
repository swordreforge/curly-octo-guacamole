package com.android.thememanager.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import i1.C6077k;

/* JADX INFO: compiled from: PrivacyNotifyFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class jbh extends com.android.thememanager.basemodule.base.toq implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: c */
    private TextView f9104c;

    /* JADX INFO: renamed from: e */
    private TextView f9105e;

    /* JADX INFO: renamed from: f */
    private TextView f9106f;

    /* JADX INFO: renamed from: j */
    private TextView f9107j;

    /* JADX INFO: renamed from: l */
    private TextView f9108l;

    /* JADX INFO: renamed from: m */
    private Button f9109m;

    /* JADX INFO: renamed from: o */
    private TextView f9110o;

    /* JADX INFO: renamed from: r */
    private TextView f9111r;

    /* JADX INFO: renamed from: t */
    private String f9112t;

    /* JADX INFO: renamed from: com.android.thememanager.activity.jbh$k */
    /* JADX INFO: compiled from: PrivacyNotifyFragment.java */
    class ViewOnClickListenerC1592k implements View.OnClickListener {
        ViewOnClickListenerC1592k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            jbh.this.bih();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bih() {
        if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            com.android.thememanager.basemodule.privacy.x2.m6916q(getActivity(), new p000a.toq() { // from class: com.android.thememanager.activity.mbx
                @Override // p000a.toq
                public final void onSuccess() {
                    this.f9240k.bih();
                }
            });
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) PrivacyThemeBaseActivity.class);
        intent.putExtra(PrivacyThemeBaseActivity.f8811c, PrivacyThemeBaseActivity.f8814j);
        intent.putExtra(PrivacyThemeBaseActivity.f8816r, this.f9112t);
        startActivity(intent);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ceo));
        if (com.android.thememanager.util.gc3c.cdj(getActivity())) {
            getActivity().finish();
        }
    }

    public void ec(View rootView) {
        this.f9111r = (TextView) rootView.findViewById(R.id.introduce);
        this.f9108l = (TextView) rootView.findViewById(R.id.warning);
        this.f9106f = (TextView) rootView.findViewById(R.id.warning_content_1);
        this.f9104c = (TextView) rootView.findViewById(R.id.warning_content_2);
        this.f9105e = (TextView) rootView.findViewById(R.id.warning_content_3);
        this.f9107j = (TextView) rootView.findViewById(R.id.warning_content_4);
        this.f9110o = (TextView) rootView.findViewById(R.id.warning_content_5);
        Button button = (Button) rootView.findViewById(R.id.i_know_btn);
        this.f9109m = button;
        C6077k.cdj(button);
        this.f9109m.setOnClickListener(new ViewOnClickListenerC1592k());
        if (TextUtils.equals(this.f9112t, PrivacyThemeBaseActivity.f8813f)) {
            this.f9111r.setText(R.string.privacy_phone_revoke_agree_introduce);
            this.f9108l.setText(R.string.privacy_revoke_agree_data_warning);
            this.f9106f.setText(R.string.privacy_revoke_agree_content_1);
            this.f9104c.setText(R.string.privacy_revoke_agree_content_2);
            this.f9105e.setText(R.string.privacy_phone_revoke_agree_content_3);
            this.f9107j.setText(R.string.privacy_phone_revoke_agree_content_4);
            this.f9110o.setText(R.string.privacy_revoke_agree_content_5);
            return;
        }
        if (TextUtils.equals(this.f9112t, PrivacyThemeBaseActivity.f8815l)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9108l.getLayoutParams();
            this.f9111r.setTypeface(Typeface.defaultFromStyle(1));
            this.f9111r.setText(R.string.privacy_phone_logoff_theme_service_introduce);
            this.f9108l.setText(R.string.privacy_logoff_theme_service_warning);
            this.f9106f.setText(R.string.privacy_logoff_theme_content_1);
            this.f9104c.setText(R.string.privacy_logoff_theme_content_2);
            this.f9105e.setText(R.string.privacy_phone_logoff_theme_content_3);
            this.f9107j.setText(R.string.privacy_phone_logoff_theme_content_4);
            this.f9110o.setText(R.string.privacy_logoff_theme_content_5);
            layoutParams.topMargin = (int) getActivity().getResources().getDimension(R.dimen.privacy_revoke_agree_warning_logoff);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f9112t = getArguments().getString(PrivacyThemeBaseActivity.f8816r);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(@zy.lvui LayoutInflater inflater, @zy.dd ViewGroup container, @zy.dd Bundle savedInstanceState) {
        return inflater.inflate(R.layout.privacy_revoke_agreement, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ec(view);
    }
}
