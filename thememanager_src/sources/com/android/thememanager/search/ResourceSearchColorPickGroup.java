package com.android.thememanager.search;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.y9n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceSearchColorPickGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private int f14624k;

    /* JADX INFO: renamed from: n */
    private toq f14625n;

    /* JADX INFO: renamed from: q */
    private List<View> f14626q;

    /* JADX INFO: renamed from: com.android.thememanager.search.ResourceSearchColorPickGroup$k */
    class ViewOnClickListenerC2476k implements View.OnClickListener {
        ViewOnClickListenerC2476k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            int i2 = 0;
            while (true) {
                if (i2 >= ResourceSearchColorPickGroup.this.f14626q.size()) {
                    i2 = -1;
                    break;
                } else if (((View) ResourceSearchColorPickGroup.this.f14626q.get(i2)) == v2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != ResourceSearchColorPickGroup.this.f14624k) {
                ((View) ResourceSearchColorPickGroup.this.f14626q.get(ResourceSearchColorPickGroup.this.f14624k)).setSelected(false);
                ResourceSearchColorPickGroup.this.f14624k = i2;
                ((View) ResourceSearchColorPickGroup.this.f14626q.get(ResourceSearchColorPickGroup.this.f14624k)).setSelected(true);
                if (ResourceSearchColorPickGroup.this.f14625n != null) {
                    ResourceSearchColorPickGroup.this.f14625n.mo8855k((String) v2.getTag());
                }
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo8855k(String color);
    }

    public ResourceSearchColorPickGroup(Context context) {
        super(context);
        this.f14624k = -1;
        this.f14626q = new ArrayList();
    }

    /* JADX INFO: renamed from: n */
    public void m8854n(List<String> colors) {
        colors.add(0, C2478g.f14642k);
        ViewOnClickListenerC2476k viewOnClickListenerC2476k = new ViewOnClickListenerC2476k();
        for (String str : colors) {
            ImageView imageView = new ImageView(getContext());
            imageView.setTag(str);
            imageView.setBackgroundResource(R.drawable.resource_search_color_pick_mask);
            imageView.setImageResource(C2478g.toq(str));
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(viewOnClickListenerC2476k);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.addView(imageView);
            this.f14626q.add(imageView);
            addView(linearLayout);
        }
        this.f14624k = 0;
        this.f14626q.get(0).setSelected(true);
    }

    public void setOnColorPickListener(toq listener) {
        this.f14625n = listener;
    }

    public void setSelectedColor(String color) {
        boolean z2;
        y9n.m7255s();
        int i2 = 0;
        while (true) {
            if (i2 >= this.f14626q.size()) {
                z2 = false;
                break;
            }
            if (TextUtils.equals(color, (String) this.f14626q.get(i2).getTag())) {
                int i3 = this.f14624k;
                if (i3 != i2) {
                    this.f14626q.get(i3).setSelected(false);
                    this.f14624k = i2;
                    this.f14626q.get(i2).setSelected(true);
                }
                z2 = true;
            } else {
                i2++;
            }
        }
        if (z2) {
            return;
        }
        this.f14626q.get(this.f14624k).setSelected(false);
        this.f14624k = 0;
        this.f14626q.get(0).setSelected(true);
    }

    public ResourceSearchColorPickGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f14624k = -1;
        this.f14626q = new ArrayList();
    }

    public ResourceSearchColorPickGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f14624k = -1;
        this.f14626q = new ArrayList();
    }
}
