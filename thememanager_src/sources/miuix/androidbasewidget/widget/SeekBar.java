package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.lang.ref.WeakReference;
import java.util.Collection;
import kbj.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.view.C7380g;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import zy.InterfaceC7831j;

/* JADX INFO: loaded from: classes3.dex */
public class SeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: d */
    private static final String f38663d = "SeekBar";

    /* JADX INFO: renamed from: v */
    private static final int f38664v = 255;

    /* JADX INFO: renamed from: w */
    private static final String f38665w = "progress";

    /* JADX INFO: renamed from: a */
    private int f38666a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f38667b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f86717bo;

    /* JADX INFO: renamed from: c */
    private int f38668c;

    /* JADX INFO: renamed from: e */
    private int f38669e;

    /* JADX INFO: renamed from: f */
    private int f38670f;

    /* JADX INFO: renamed from: g */
    private float f38671g;

    /* JADX INFO: renamed from: h */
    private float f38672h;

    /* JADX INFO: renamed from: i */
    private float f38673i;

    /* JADX INFO: renamed from: j */
    private int f38674j;

    /* JADX INFO: renamed from: l */
    private int f38675l;

    /* JADX INFO: renamed from: m */
    private SeekBar.OnSeekBarChangeListener f38676m;

    /* JADX INFO: renamed from: n */
    private float f38677n;

    /* JADX INFO: renamed from: o */
    private IStateStyle f38678o;

    /* JADX INFO: renamed from: p */
    private boolean f38679p;

    /* JADX INFO: renamed from: q */
    private float f38680q;

    /* JADX INFO: renamed from: r */
    private int f38681r;

    /* JADX INFO: renamed from: s */
    private boolean f38682s;

    /* JADX INFO: renamed from: t */
    private int f38683t;

    /* JADX INFO: renamed from: u */
    private boolean f38684u;

    /* JADX INFO: renamed from: x */
    private float f38685x;

    /* JADX INFO: renamed from: y */
    private boolean f38686y;

    /* JADX INFO: renamed from: z */
    private int f38687z;

    /* JADX INFO: renamed from: miuix.androidbasewidget.widget.SeekBar$k */
    class C6832k implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: k */
        private miuix.util.toq f38688k;

        /* JADX INFO: renamed from: miuix.androidbasewidget.widget.SeekBar$k$k */
        class k extends TransitionListener {
            k() {
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, "progress");
                if (updateInfoFindByName != null) {
                    SeekBar.this.setProgress(updateInfoFindByName.getIntValue());
                }
            }
        }

        C6832k() {
        }

        /* JADX INFO: renamed from: k */
        private miuix.util.toq m24796k() {
            if (this.f38688k == null) {
                this.f38688k = new miuix.util.toq(SeekBar.this.getContext());
            }
            return this.f38688k;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i2, boolean z2) {
            boolean z3 = true;
            if (SeekBar.this.f38682s && z2) {
                int max = SeekBar.this.getMax() - SeekBar.this.getMinWrapper();
                float f2 = max;
                int iRound = Math.round(0.5f * f2);
                float minWrapper = max > 0 ? (i2 - SeekBar.this.getMinWrapper()) / f2 : 0.0f;
                if (minWrapper <= SeekBar.this.f38677n || minWrapper >= SeekBar.this.f38671g) {
                    SeekBar.this.f38670f = Math.round(i2);
                    SeekBar.this.f38678o.setTo("progress", Integer.valueOf(SeekBar.this.f38670f));
                } else {
                    SeekBar.this.f38670f = iRound;
                }
                if (SeekBar.this.getProgress() != SeekBar.this.f38670f) {
                    SeekBar.this.f38678o.to("progress", Integer.valueOf(SeekBar.this.f38670f), new AnimConfig().setEase(0, 350.0f, 0.9f, 0.15f).addListeners(new k()));
                }
            }
            SeekBar seekBar2 = SeekBar.this;
            int iKja0 = seekBar2.kja0(seekBar2.f38672h);
            SeekBar seekBar3 = SeekBar.this;
            int iKja02 = seekBar3.kja0(seekBar3.f38673i);
            if (i2 < iKja0) {
                SeekBar.this.setProgress(iKja0);
                i2 = iKja0;
            } else if (i2 > iKja02) {
                SeekBar.this.setProgress(iKja02);
                i2 = iKja02;
            }
            if (i2 != iKja0 && i2 != iKja02) {
                z3 = false;
            }
            if (z2) {
                if (!z3 || SeekBar.this.f38679p) {
                    if (!SeekBar.this.f38679p && HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                        HapticCompat.performHapticFeedback(seekBar, C7385p.f92240gvn7);
                    }
                } else if (!HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                    HapticCompat.performHapticFeedback(seekBar, C7385p.f92251qrj);
                } else if (i2 == iKja02) {
                    m24796k().zy(203);
                } else {
                    m24796k().zy(202);
                }
            }
            SeekBar.this.f38679p = z3;
            if (SeekBar.this.f38676m != null) {
                SeekBar.this.f38676m.onProgressChanged(seekBar, i2, z2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.f38676m != null) {
                SeekBar.this.f38676m.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            if (SeekBar.this.f38676m != null) {
                SeekBar.this.f38676m.onStopTrackingTouch(seekBar);
            }
        }
    }

    private static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<SeekBar> f38690k;

        public toq(SeekBar seekBar) {
            this.f38690k = new WeakReference<>(seekBar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<SeekBar> weakReference = this.f38690k;
            SeekBar seekBar = weakReference == null ? null : weakReference.get();
            if (seekBar != null) {
                seekBar.ki();
            }
        }
    }

    public SeekBar(Context context) {
        this(context, null);
    }

    private boolean cdj(int i2, int i3) {
        float minWrapper = i2 > 0 ? (i3 - getMinWrapper()) / i2 : 0.0f;
        return minWrapper > this.f38677n && minWrapper < this.f38671g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getMinWrapper() {
        return super.getMin();
    }

    private synchronized int getRange() {
        return getMax() - getMinWrapper();
    }

    /* JADX INFO: renamed from: h */
    private float m24789h(TypedArray typedArray, @InterfaceC7831j int i2, float f2) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        return (typedValuePeekValue == null || typedValuePeekValue.type != 6) ? f2 : typedValuePeekValue.getFraction(1.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                Drawable drawable = ((ClipDrawable) drawableFindDrawableByLayerId).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    ColorStateList color = gradientDrawable.getColor();
                    if (this.f38667b == null && color != null) {
                        this.f38667b = color;
                    }
                    ColorStateList colorStateList = this.f38667b;
                    if (colorStateList != null && (colorStateList.getColorForState(new int[]{-16842910}, this.f38669e) != this.f38683t || this.f38667b.getColorForState(android.widget.SeekBar.ENABLED_STATE_SET, this.f38668c) != this.f38687z)) {
                        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
                        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{this.f38683t, this.f38687z});
                        this.f38667b = colorStateList2;
                        gradientDrawable2.setColor(colorStateList2);
                    }
                }
            }
            Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.icon);
            if (drawableFindDrawableByLayerId2 instanceof GradientDrawable) {
                drawableFindDrawableByLayerId2.setColorFilter(this.f38682s ? this.f38675l : this.f38681r, PorterDuff.Mode.SRC);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int kja0(float f2) {
        return ((int) (f2 * getRange())) + getMinWrapper();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ki();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : (int) (this.f38680q * 255.0f));
        }
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMaxPercentProgress() {
        return this.f38673i;
    }

    @ViewDebug.ExportedProperty(category = "draggableProgress")
    public synchronized float getDraggableMinPercentProgress() {
        return this.f38672h;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.onTouchEvent(r6)
            int r1 = r6.getAction()
            r2 = 0
            if (r1 == 0) goto L3e
            r3 = 1
            if (r1 == r3) goto L3b
            r4 = 2
            if (r1 == r4) goto L15
            r6 = 3
            if (r1 == r6) goto L3b
            goto L46
        L15:
            boolean r1 = r5.f38684u
            if (r1 != 0) goto L46
            float r6 = r6.getX()
            float r1 = r5.f38685x
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            int r1 = r5.f38666a
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L46
            r5.f38684u = r3
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L46
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            goto L46
        L3b:
            r5.f38684u = r2
            goto L46
        L3e:
            r5.f38684u = r2
            float r6 = r6.getX()
            r5.f38685x = r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.androidbasewidget.widget.SeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:5:0x000a, B:12:0x0022, B:14:0x0028, B:16:0x0031, B:18:0x003d, B:11:0x001a), top: B:23:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:5:0x000a, B:12:0x0022, B:14:0x0028, B:16:0x0031, B:18:0x003d, B:11:0x001a), top: B:23:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setDraggableMaxPercentProcess(float r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            double r0 = (double) r5
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L15
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be higher than the max value, reset to 1.0"
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L13
        L11:
            r5 = r1
            goto L22
        L13:
            r5 = move-exception
            goto L42
        L15:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L22
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be lower than the min value, reset to 1.0"
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L13
            goto L11
        L22:
            float r0 = r4.f38672h     // Catch: java.lang.Throwable -> L13
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
            java.lang.String r5 = "SeekBar"
            java.lang.String r0 = "The draggableMaxPercentProcess value should not be lower than draggableMinPercentProcess value, reset to 1.0"
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L13
            goto L31
        L30:
            r1 = r5
        L31:
            r4.f38673i = r1     // Catch: java.lang.Throwable -> L13
            int r5 = r4.kja0(r1)     // Catch: java.lang.Throwable -> L13
            int r0 = r4.getProgress()     // Catch: java.lang.Throwable -> L13
            if (r0 <= r5) goto L40
            r4.setProgress(r5)     // Catch: java.lang.Throwable -> L13
        L40:
            monitor-exit(r4)
            return
        L42:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.androidbasewidget.widget.SeekBar.setDraggableMaxPercentProcess(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x0009, B:12:0x0022, B:14:0x0028, B:16:0x0031, B:18:0x003d, B:11:0x001a), top: B:23:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x0009, B:12:0x0022, B:14:0x0028, B:16:0x0031, B:18:0x003d, B:11:0x001a), top: B:23:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setDraggableMinPercentProgress(float r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            double r0 = (double) r7
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 <= 0) goto L14
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be higher than 1.0, reset to 0.0"
            android.util.Log.e(r7, r0)     // Catch: java.lang.Throwable -> L12
        L10:
            r7 = r3
            goto L22
        L12:
            r7 = move-exception
            goto L42
        L14:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L22
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be lower than 0.0, reset to 0.0"
            android.util.Log.e(r7, r0)     // Catch: java.lang.Throwable -> L12
            goto L10
        L22:
            float r0 = r6.f38673i     // Catch: java.lang.Throwable -> L12
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            java.lang.String r7 = "SeekBar"
            java.lang.String r0 = "The draggableMinPercentProgress value should not be higher than draggableMaxPercentProcess value, reset to 0.0"
            android.util.Log.e(r7, r0)     // Catch: java.lang.Throwable -> L12
            goto L31
        L30:
            r3 = r7
        L31:
            r6.f38672h = r3     // Catch: java.lang.Throwable -> L12
            int r7 = r6.kja0(r3)     // Catch: java.lang.Throwable -> L12
            int r0 = r6.getProgress()     // Catch: java.lang.Throwable -> L12
            if (r0 >= r7) goto L40
            r6.setProgress(r7)     // Catch: java.lang.Throwable -> L12
        L40:
            monitor-exit(r6)
            return
        L42:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.androidbasewidget.widget.SeekBar.setDraggableMinPercentProgress(float):void");
    }

    public void setForegroundPrimaryColor(int i2, int i3) {
        this.f38687z = i2;
        this.f38683t = i3;
        ki();
    }

    public void setIconPrimaryColor(int i2) {
        this.f38675l = i2;
        ki();
    }

    public void setMiddleEnabled(boolean z2) {
        if (z2 != this.f38682s) {
            this.f38682s = z2;
            ki();
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.f86717bo;
        if (onSeekBarChangeListener == onSeekBarChangeListener2) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        } else {
            this.f38676m = onSeekBarChangeListener;
        }
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.qla);
    }

    public SeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C6832k c6832k = new C6832k();
        this.f86717bo = c6832k;
        C7380g.toq(this, false);
        this.f38666a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.mwo2, i2, toq.qrj.bao0);
        this.f38668c = context.getResources().getColor(toq.C6110n.f80846gbni);
        this.f38669e = context.getResources().getColor(toq.C6110n.f80962wo);
        this.f38674j = context.getResources().getColor(toq.C6110n.f80839fnq8);
        this.f38682s = typedArrayObtainStyledAttributes.getBoolean(toq.n7h.hk, false);
        this.f38687z = typedArrayObtainStyledAttributes.getColor(toq.n7h.fv, this.f38668c);
        this.f38683t = typedArrayObtainStyledAttributes.getColor(toq.n7h.c3sl, this.f38669e);
        this.f38675l = typedArrayObtainStyledAttributes.getColor(toq.n7h.s9, this.f38674j);
        this.f38680q = typedArrayObtainStyledAttributes.getFloat(toq.n7h.o2, 0.5f);
        this.f38677n = typedArrayObtainStyledAttributes.getFloat(toq.n7h.gk, 0.46f);
        this.f38671g = typedArrayObtainStyledAttributes.getFloat(toq.n7h.n2mu, 0.54f);
        this.f38672h = m24789h(typedArrayObtainStyledAttributes, toq.n7h.id, 0.0f);
        this.f38673i = m24789h(typedArrayObtainStyledAttributes, toq.n7h.vibj, 1.0f);
        setDraggableMinPercentProgress(this.f38672h);
        setDraggableMaxPercentProcess(this.f38673i);
        typedArrayObtainStyledAttributes.recycle();
        this.f38681r = context.getResources().getColor(toq.C6110n.f80830etdu);
        float f2 = this.f38677n;
        if (f2 > 0.5f || f2 < 0.0f) {
            this.f38677n = 0.46f;
        }
        float f3 = this.f38671g;
        if (f3 < 0.5f || f3 > 1.0f) {
            this.f38671g = 0.54f;
        }
        int max = getMax() - getMinWrapper();
        this.f38686y = cdj(max, getProgress());
        this.f38670f = getProgress();
        if (this.f38686y) {
            int iRound = Math.round(max * 0.5f);
            this.f38670f = iRound;
            setProgress(iRound);
        }
        IStateStyle iStateStyleUseValue = Folme.useValue(Integer.valueOf(this.f38670f));
        this.f38678o = iStateStyleUseValue;
        iStateStyleUseValue.setTo("progress", Integer.valueOf(this.f38670f));
        setOnSeekBarChangeListener(c6832k);
        post(new toq(this));
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
