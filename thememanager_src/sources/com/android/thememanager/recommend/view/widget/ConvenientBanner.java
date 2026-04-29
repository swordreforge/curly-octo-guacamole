package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.f7l8;
import androidx.viewpager.widget.AbstractC1288k;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.fn3e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ConvenientBanner<T> extends RelativeLayout {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f60737ab = 2;

    /* JADX INFO: renamed from: d */
    public static final int f14488d = 0;

    /* JADX INFO: renamed from: v */
    private static final int f14489v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f14490w = 1;

    /* JADX INFO: renamed from: a */
    private boolean f14491a;

    /* JADX INFO: renamed from: b */
    private boolean f14492b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private InterfaceC2456q f60738bo;

    /* JADX INFO: renamed from: c */
    private ViewPager.InterfaceC1284p f14493c;

    /* JADX INFO: renamed from: e */
    private ViewPager.InterfaceC1284p f14494e;

    /* JADX INFO: renamed from: f */
    private InterfaceC2455n f14495f;

    /* JADX INFO: renamed from: g */
    private int f14496g;

    /* JADX INFO: renamed from: h */
    private float f14497h;

    /* JADX INFO: renamed from: i */
    private float f14498i;

    /* JADX INFO: renamed from: j */
    private Handler f14499j;

    /* JADX INFO: renamed from: k */
    private boolean f14500k;

    /* JADX INFO: renamed from: l */
    private List<T> f14501l;

    /* JADX INFO: renamed from: m */
    private int f14502m;

    /* JADX INFO: renamed from: n */
    private int f14503n;

    /* JADX INFO: renamed from: o */
    private ArrayList<Integer> f14504o;

    /* JADX INFO: renamed from: p */
    private float f14505p;

    /* JADX INFO: renamed from: q */
    private boolean f14506q;

    /* JADX INFO: renamed from: r */
    private AbstractC1288k f14507r;

    /* JADX INFO: renamed from: s */
    private float f14508s;

    /* JADX INFO: renamed from: t */
    private LinearLayout f14509t;

    /* JADX INFO: renamed from: u */
    private HashSet<View> f14510u;

    /* JADX INFO: renamed from: x */
    private boolean f14511x;

    /* JADX INFO: renamed from: y */
    private int f14512y;

    /* JADX INFO: renamed from: z */
    private ViewPager f14513z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ConvenientBanner$k */
    class C2454k implements ViewPager.InterfaceC1284p {
        C2454k() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
            if (ConvenientBanner.this.f14494e != null) {
                ConvenientBanner.this.f14494e.mo5550k(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            if (ConvenientBanner.this.f14494e != null) {
                ConvenientBanner.this.f14494e.toq(ConvenientBanner.this.fu4(i2));
            }
            ConvenientBanner.this.qrj(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float v2, int i12) {
            if (ConvenientBanner.this.f14494e != null) {
                ConvenientBanner.this.f14494e.zy(ConvenientBanner.this.fu4(i2), v2, i12);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ConvenientBanner$n */
    public interface InterfaceC2455n<T> {
        /* JADX INFO: renamed from: k */
        View mo8686k(Context context, int position, T object);
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ConvenientBanner$q */
    public interface InterfaceC2456q {
        /* JADX INFO: renamed from: k */
        void m8828k(int position);
    }

    class toq extends Handler {
        toq() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (1 == msg.what && ConvenientBanner.this.f14500k) {
                sendEmptyMessageDelayed(1, ConvenientBanner.this.f14496g);
                if (ConvenientBanner.this.f14506q) {
                    ConvenientBanner.this.f14513z.setCurrentItem(ConvenientBanner.this.f14513z.getCurrentItem() + 1);
                }
            }
        }
    }

    class zy extends AbstractC1288k {

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ConvenientBanner$zy$k */
        class ViewOnClickListenerC2457k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f14517k;

            ViewOnClickListenerC2457k(final int val$position) {
                this.f14517k = val$position;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                if (ConvenientBanner.this.f60738bo != null) {
                    ConvenientBanner.this.f60738bo.m8828k(ConvenientBanner.this.fu4(this.f14517k));
                }
            }
        }

        zy() {
        }

        @Override // androidx.viewpager.widget.AbstractC1288k
        /* JADX INFO: renamed from: g */
        public int mo5572g(Object object) {
            if (((View) object).getTag() != null) {
                return -2;
            }
            return super.mo5572g(object);
        }

        @Override // androidx.viewpager.widget.AbstractC1288k
        public boolean ld6(View view, Object o2) {
            return view == o2;
        }

        @Override // androidx.viewpager.widget.AbstractC1288k
        /* JADX INFO: renamed from: n */
        public int mo5575n() {
            return ConvenientBanner.this.f14501l.size() * (ConvenientBanner.this.f14500k ? f7l8.f6806q : 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.AbstractC1288k
        /* JADX INFO: renamed from: p */
        public Object mo4276p(ViewGroup container, final int position) {
            int iFu4 = ConvenientBanner.this.fu4(position);
            View viewMo8686k = ConvenientBanner.this.f14495f.mo8686k(ConvenientBanner.this.getContext(), iFu4, ConvenientBanner.this.f14501l.get(iFu4));
            container.addView(viewMo8686k);
            viewMo8686k.setOnClickListener(new ViewOnClickListenerC2457k(position));
            ConvenientBanner.this.f14510u.add(viewMo8686k);
            return viewMo8686k;
        }

        @Override // androidx.viewpager.widget.AbstractC1288k
        public void toq(ViewGroup container, int position, Object object) {
            TextView textView;
            Object tag;
            container.removeView((View) object);
            if (object != null && (object instanceof ViewGroup) && (textView = (TextView) ((ViewGroup) object).findViewById(R.id.download_tip)) != null && (tag = textView.getTag()) != null && (tag instanceof com.android.thememanager.ad.download.controller.toq)) {
                textView.setTag(null);
                C1653q.ki((com.android.thememanager.ad.download.controller.toq) tag);
            }
            ConvenientBanner.this.f14510u.remove(object);
        }
    }

    public ConvenientBanner(Context context) {
        super(context);
        this.f14500k = true;
        this.f14506q = false;
        this.f14503n = -1;
        this.f14496g = f7l8.f6806q;
        this.f14512y = 2;
        this.f14508s = 5.0f;
        this.f14505p = 0.0f;
        this.f14497h = 0.0f;
        this.f14498i = 0.0f;
        this.f14501l = new ArrayList();
        this.f14504o = new ArrayList<>();
        this.f14502m = 0;
        this.f14492b = true;
        this.f14510u = new HashSet<>();
        n7h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int fu4(int position) {
        List<T> list = this.f14501l;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return position % this.f14501l.size();
    }

    /* JADX INFO: renamed from: i */
    private void m8819i() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14509t.getLayoutParams();
        int i2 = this.f14512y;
        if (i2 == 0) {
            layoutParams.addRule(20, -1);
            layoutParams.setMarginStart((int) this.f14505p);
        } else if (i2 != 1) {
            layoutParams.addRule(21, -1);
            layoutParams.setMarginEnd((int) this.f14497h);
        } else {
            layoutParams.addRule(14, -1);
        }
        layoutParams.bottomMargin = (int) this.f14498i;
        layoutParams.addRule(12, -1);
        this.f14509t.setLayoutParams(layoutParams);
    }

    private void n7h(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.rc_convenient_banner_layout, (ViewGroup) this, true);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R.id.viewPager);
        this.f14513z = viewPager;
        viewPager.setAccessibilityDelegate(null);
        this.f14509t = (LinearLayout) viewInflate.findViewById(R.id.indicator_layout);
        m8819i();
        C2454k c2454k = new C2454k();
        this.f14493c = c2454k;
        this.f14513z.setOnPageChangeListener(c2454k);
        if (this.f14500k) {
            this.f14499j = new toq();
        }
    }

    private void ni7() {
        if (this.f14504o.isEmpty()) {
            return;
        }
        if (this.f14504o.size() == 1) {
            this.f14502m = 0;
        } else {
            this.f14502m = (this.f14502m + 1) % this.f14504o.size();
        }
        this.f14513z.setCurrentItem(this.f14504o.get(this.f14502m).intValue(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj(int selectedPosition) {
        int iFu4 = fu4(selectedPosition);
        this.f14509t.removeAllViews();
        if (this.f14501l.size() > 1) {
            int i2 = 0;
            while (i2 < this.f14501l.size()) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(this.f14503n);
                imageView.setSelected(iFu4 == i2);
                float f2 = this.f14508s;
                imageView.setPaddingRelative((int) f2, 0, (int) f2, 0);
                this.f14509t.addView(imageView);
                i2++;
            }
        }
    }

    private void t8r(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.am);
        this.f14500k = typedArrayObtainStyledAttributes.getBoolean(7, this.f14500k);
        this.f14503n = typedArrayObtainStyledAttributes.getResourceId(6, this.f14503n);
        this.f14496g = typedArrayObtainStyledAttributes.getInteger(0, this.f14496g);
        this.f14512y = typedArrayObtainStyledAttributes.getInt(4, this.f14512y);
        this.f14508s = typedArrayObtainStyledAttributes.getDimension(5, this.f14508s);
        this.f14505p = typedArrayObtainStyledAttributes.getDimension(3, this.f14505p);
        this.f14497h = typedArrayObtainStyledAttributes.getDimension(2, this.f14497h);
        this.f14498i = typedArrayObtainStyledAttributes.getDimension(1, this.f14498i);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void cdj() {
        this.f14511x = false;
        Handler handler = this.f14499j;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Handler handler;
        if (event.getAction() == 0) {
            Handler handler2 = this.f14499j;
            if (handler2 != null) {
                handler2.removeMessages(1);
            }
        } else if ((event.getAction() == 1 || event.getAction() == 3) && (handler = this.f14499j) != null && !handler.hasMessages(1)) {
            this.f14499j.sendEmptyMessageDelayed(1, this.f14496g);
        }
        return super.dispatchTouchEvent(event);
    }

    public void fn3e() {
        this.f14506q = true;
    }

    public int getCount() {
        List<T> list = this.f14501l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getCurrentItem() {
        return this.f14513z.getCurrentItem();
    }

    public View[] getCurrentView() {
        View[] viewArr = new View[this.f14510u.size()];
        this.f14510u.toArray(viewArr);
        return viewArr;
    }

    /* JADX INFO: renamed from: h */
    public void m8826h() {
        Handler handler = this.f14499j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14499j = null;
        }
    }

    public boolean ki() {
        this.f14511x = true;
        Handler handler = this.f14499j;
        if (handler == null || handler.hasMessages(1)) {
            return false;
        }
        this.f14499j.sendEmptyMessageDelayed(1, this.f14496g);
        return true;
    }

    public boolean kja0() {
        if (this.f14504o.isEmpty()) {
            return false;
        }
        return (this.f14491a || !this.f14511x || this.f14504o.get(this.f14504o.size() == 1 ? 0 : (this.f14502m + 1) % this.f14504o.size()).intValue() == getCurrentItem()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f14499j;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@lvui View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (this.f14499j == null || !this.f14500k) {
            return;
        }
        if (visibility != 0) {
            this.f14491a = false;
            return;
        }
        if (this.f14492b) {
            this.f14492b = false;
            this.f14491a = true;
        } else {
            if (!this.f14491a && this.f14511x) {
                ni7();
            }
            this.f14491a = true;
        }
    }

    public void setBannerData(List data, InterfaceC2455n holder) {
        this.f14501l.clear();
        if (data != null) {
            this.f14501l.addAll(data);
        }
        if (this.f14501l.size() <= 1) {
            this.f14500k = false;
        }
        this.f14495f = holder;
        AbstractC1288k abstractC1288k = this.f14507r;
        if (abstractC1288k == null) {
            zy zyVar = new zy();
            this.f14507r = zyVar;
            this.f14513z.setAdapter(zyVar);
        } else {
            abstractC1288k.x2();
        }
        this.f14513z.setCurrentItem(0);
        this.f14513z.setPageMargin(30);
        ViewPager.InterfaceC1284p interfaceC1284p = this.f14494e;
        if (interfaceC1284p != null) {
            interfaceC1284p.toq(0);
        }
        qrj(0);
    }

    public void setCurrentItem(final int position) {
        if (position < 0) {
            return;
        }
        Handler handler = this.f14499j;
        if (handler != null) {
            handler.removeMessages(1);
            if (!this.f14499j.hasMessages(1)) {
                this.f14499j.sendEmptyMessageDelayed(1, this.f14496g);
            }
        }
        this.f14513z.setCurrentItem(position, false);
    }

    public void setOnItemClickListener(InterfaceC2456q mOnItemClickListener) {
        this.f60738bo = mOnItemClickListener;
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC1284p onPageChangeListener) {
        this.f14494e = onPageChangeListener;
    }

    public void x2(int position) {
        this.f14504o.add(Integer.valueOf(position));
    }

    /* JADX INFO: renamed from: z */
    public void m8827z() {
        AbstractC1288k abstractC1288k = this.f14507r;
        if (abstractC1288k != null) {
            abstractC1288k.x2();
        }
    }

    public void zurt() {
        this.f14506q = false;
    }

    public ConvenientBanner(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f14500k = true;
        this.f14506q = false;
        this.f14503n = -1;
        this.f14496g = f7l8.f6806q;
        this.f14512y = 2;
        this.f14508s = 5.0f;
        this.f14505p = 0.0f;
        this.f14497h = 0.0f;
        this.f14498i = 0.0f;
        this.f14501l = new ArrayList();
        this.f14504o = new ArrayList<>();
        this.f14502m = 0;
        this.f14492b = true;
        this.f14510u = new HashSet<>();
        t8r(context, attrs);
        n7h(context);
    }

    public ConvenientBanner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14500k = true;
        this.f14506q = false;
        this.f14503n = -1;
        this.f14496g = f7l8.f6806q;
        this.f14512y = 2;
        this.f14508s = 5.0f;
        this.f14505p = 0.0f;
        this.f14497h = 0.0f;
        this.f14498i = 0.0f;
        this.f14501l = new ArrayList();
        this.f14504o = new ArrayList<>();
        this.f14502m = 0;
        this.f14492b = true;
        this.f14510u = new HashSet<>();
        t8r(context, attrs);
        n7h(context);
    }
}
