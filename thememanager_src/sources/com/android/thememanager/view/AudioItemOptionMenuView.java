package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class AudioItemOptionMenuView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private Button f17214g;

    /* JADX INFO: renamed from: k */
    private zy f17215k;

    /* JADX INFO: renamed from: n */
    private TextView f17216n;

    /* JADX INFO: renamed from: p */
    private Animation f17217p;

    /* JADX INFO: renamed from: q */
    private InterfaceC2880q f17218q;

    /* JADX INFO: renamed from: s */
    private Animation f17219s;

    /* JADX INFO: renamed from: y */
    private Button f17220y;

    /* JADX INFO: renamed from: com.android.thememanager.view.AudioItemOptionMenuView$k */
    class ViewOnClickListenerC2879k implements View.OnClickListener {
        ViewOnClickListenerC2879k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AudioItemOptionMenuView.this.f17215k.m10223k();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.AudioItemOptionMenuView$q */
    public interface InterfaceC2880q {
        /* JADX INFO: renamed from: k */
        void m10222k(int visibility);
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AudioItemOptionMenuView.this.f17215k.toq();
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void m10223k();

        void toq();
    }

    public AudioItemOptionMenuView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        toq();
    }

    private void toq() {
        View viewInflate = View.inflate(getContext(), R.layout.resource_list_item_select_menu, null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(viewInflate);
        TextView textView = (TextView) findViewById(R.id.list_item_select_menu_title);
        this.f17216n = textView;
        textView.setText(R.string.resource_select_ringtone_audio_confirm);
        Button button = (Button) findViewById(R.id.list_item_select_menu_left_button);
        this.f17214g = button;
        button.setText(android.R.string.cancel);
        this.f17214g.setOnClickListener(new ViewOnClickListenerC2879k());
        Button button2 = (Button) findViewById(R.id.list_item_select_menu_right_button);
        this.f17220y = button2;
        button2.setText(android.R.string.ok);
        this.f17220y.setOnClickListener(new toq());
        this.f17219s = AnimationUtils.loadAnimation(getContext(), R.anim.option_menu_enter);
        this.f17217p = AnimationUtils.loadAnimation(getContext(), R.anim.option_menu_exit);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public void setAudioItemOptionMenuListener(zy listener) {
        this.f17215k = listener;
    }

    public void setTitle(String title) {
        this.f17216n.setText(title);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (getVisibility() != visibility) {
            InterfaceC2880q interfaceC2880q = this.f17218q;
            if (interfaceC2880q != null) {
                interfaceC2880q.m10222k(visibility);
            }
            if (visibility == 0) {
                startAnimation(this.f17219s);
            } else {
                startAnimation(this.f17217p);
            }
        }
        super.setVisibility(visibility);
    }

    public void setVisibilityChangelistener(InterfaceC2880q listener) {
        this.f17218q = listener;
    }

    public AudioItemOptionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        toq();
    }

    public AudioItemOptionMenuView(Context context) {
        super(context);
        toq();
    }
}
