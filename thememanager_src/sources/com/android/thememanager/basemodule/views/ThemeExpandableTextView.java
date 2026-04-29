package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ThemeExpandableTextView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: p */
    private static final int f10570p = 10;

    /* JADX INFO: renamed from: s */
    private static final int f10571s = 3;

    /* JADX INFO: renamed from: g */
    private TextView f10572g;

    /* JADX INFO: renamed from: k */
    private String f10573k;

    /* JADX INFO: renamed from: n */
    private TextView f10574n;

    /* JADX INFO: renamed from: q */
    private boolean f10575q;

    /* JADX INFO: renamed from: y */
    private Runnable f10576y;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.ThemeExpandableTextView$k */
    class RunnableC1848k implements Runnable {
        RunnableC1848k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!(ThemeExpandableTextView.this.f10574n.getLineCount() > 3)) {
                ThemeExpandableTextView.this.f10575q = true;
                ThemeExpandableTextView.this.f10572g.setVisibility(8);
                return;
            }
            StringBuilder sb = new StringBuilder();
            Layout layout = ThemeExpandableTextView.this.f10574n.getLayout();
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                int lineEnd = layout.getLineEnd(i2);
                String strSubstring = ThemeExpandableTextView.this.f10573k.substring(i3, lineEnd);
                if (i2 == 2 && 10 < strSubstring.length()) {
                    strSubstring = strSubstring.substring(0, 10) + "...";
                }
                sb.append(strSubstring);
                i2++;
                i3 = lineEnd;
            }
            ThemeExpandableTextView.this.f10574n.setText(sb.toString());
            ThemeExpandableTextView.this.f10572g.setVisibility(0);
        }
    }

    public ThemeExpandableTextView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    private String m7326n(String input) {
        if (TextUtils.isEmpty(input)) {
            return "";
        }
        char[] charArray = input.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (c2 == 12288) {
                charArray[i2] = ' ';
            } else if (c2 > 65280 && c2 < 65375) {
                charArray[i2] = (char) (c2 - 65248);
            }
        }
        return new String(charArray);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (this.f10575q) {
            return;
        }
        this.f10575q = true;
        this.f10574n.setText(this.f10573k);
        this.f10574n.setMaxLines(Integer.MAX_VALUE);
        this.f10572g.setVisibility(8);
    }

    public void setText(String text) {
        String strM7326n = m7326n(text);
        if (TextUtils.equals(strM7326n, this.f10573k)) {
            return;
        }
        TextView textView = this.f10574n;
        this.f10573k = strM7326n;
        textView.setText(strM7326n);
        if (this.f10575q) {
            return;
        }
        this.f10574n.post(this.f10576y);
    }

    public ThemeExpandableTextView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeExpandableTextView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f10576y = new RunnableC1848k();
        LayoutInflater.from(context).inflate(R.layout.expand_textview, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.content);
        this.f10574n = textView;
        textView.setMaxLines(3);
        this.f10572g = (TextView) findViewById(R.id.expand);
        setOnClickListener(this);
    }
}
