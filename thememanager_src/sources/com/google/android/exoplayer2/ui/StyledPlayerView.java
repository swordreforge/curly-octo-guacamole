package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0498q;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.was;
import com.google.android.exoplayer2.yqrt;
import com.google.common.collect.se;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class StyledPlayerView extends FrameLayout implements com.google.android.exoplayer2.ui.toq {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f66079ab = 0;
    private static final int an = 1;
    private static final int as = 3;
    public static final int bb = 1;
    private static final int bg = -1;
    private static final int bl = 4;
    public static final int bp = 2;
    private static final int bv = 0;
    private static final int id = 2;
    private static final int in = 3;

    /* JADX INFO: renamed from: a */
    @zy.dd
    private CharSequence f22501a;

    /* JADX INFO: renamed from: b */
    @zy.dd
    private com.google.android.exoplayer2.util.qrj<? super yqrt> f22502b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f66080bo;

    /* JADX INFO: renamed from: c */
    @zy.dd
    private StyledPlayerControlView.qrj f22503c;

    /* JADX INFO: renamed from: d */
    private int f22504d;

    /* JADX INFO: renamed from: e */
    private boolean f22505e;

    /* JADX INFO: renamed from: f */
    private boolean f22506f;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final View f22507g;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private final View f22508h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private final TextView f22509i;

    /* JADX INFO: renamed from: j */
    @zy.dd
    private Drawable f22510j;

    /* JADX INFO: renamed from: k */
    private final ViewOnLayoutChangeListenerC3732k f22511k;

    /* JADX INFO: renamed from: l */
    @zy.dd
    private gc3c f22512l;

    /* JADX INFO: renamed from: m */
    private boolean f22513m;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final View f22514n;

    /* JADX INFO: renamed from: o */
    private int f22515o;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final SubtitleView f22516p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private final AspectRatioFrameLayout f22517q;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private final FrameLayout f22518r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final ImageView f22519s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private final FrameLayout f22520t;

    /* JADX INFO: renamed from: u */
    private boolean f22521u;

    /* JADX INFO: renamed from: v */
    private boolean f22522v;

    /* JADX INFO: renamed from: w */
    private boolean f22523w;

    /* JADX INFO: renamed from: x */
    private int f22524x;

    /* JADX INFO: renamed from: y */
    private final boolean f22525y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private final StyledPlayerControlView f22526z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$k */
    private final class ViewOnLayoutChangeListenerC3732k implements gc3c.InterfaceC3440y, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.qrj {

        /* JADX INFO: renamed from: k */
        private final pc.toq f22527k = new pc.toq();

        /* JADX INFO: renamed from: q */
        @zy.dd
        private Object f22529q;

        public ViewOnLayoutChangeListenerC3732k() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void cdj(com.google.android.exoplayer2.video.wvg wvgVar) {
            StyledPlayerView.this.eqxt();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: h */
        public void mo12098h(List<com.google.android.exoplayer2.text.toq> list) {
            if (StyledPlayerView.this.f22516p != null) {
                StyledPlayerView.this.f22516p.setCues(list);
            }
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ld6(int i2) {
            StyledPlayerView.this.d2ok();
            StyledPlayerView.this.dd();
            StyledPlayerView.this.m13243r();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: n */
        public void mo11370n(gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
            if (StyledPlayerView.this.fu4() && StyledPlayerView.this.f66080bo) {
                StyledPlayerView.this.fn3e();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.oc();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            StyledPlayerView.kja0((TextureView) view, StyledPlayerView.this.f22504d);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: r */
        public void mo6501r() {
            if (StyledPlayerView.this.f22514n != null) {
                StyledPlayerView.this.f22514n.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.qrj
        public void toq(int i2) {
            StyledPlayerView.this.lvui();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void wvg(boolean z2, int i2) {
            StyledPlayerView.this.d2ok();
            StyledPlayerView.this.m13243r();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: y */
        public void mo11377y(pjz9 pjz9Var) {
            gc3c gc3cVar = (gc3c) C3844k.f7l8(StyledPlayerView.this.f22512l);
            pc pcVarD8wk = gc3cVar.d8wk();
            if (pcVarD8wk.ni7()) {
                this.f22529q = null;
            } else if (gc3cVar.tfm().toq().isEmpty()) {
                Object obj = this.f22529q;
                if (obj != null) {
                    int iMo12147g = pcVarD8wk.mo12147g(obj);
                    if (iMo12147g != -1) {
                        if (gc3cVar.lw() == pcVarD8wk.m12485p(iMo12147g, this.f22527k).f21151n) {
                            return;
                        }
                    }
                    this.f22529q = null;
                }
            } else {
                this.f22529q = pcVarD8wk.ld6(gc3cVar.ktq(), this.f22527k, true).f21153q;
            }
            StyledPlayerView.this.x9kr(false);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    private static void a9(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    private static void cdj(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C3748h.n.f66302kja0));
        imageView.setBackgroundColor(resources.getColor(C3748h.zy.f22777g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d2ok() {
        int i2;
        if (this.f22508h != null) {
            gc3c gc3cVar = this.f22512l;
            boolean z2 = true;
            if (gc3cVar == null || gc3cVar.getPlaybackState() != 2 || ((i2 = this.f22515o) != 2 && (i2 != 1 || !this.f22512l.yqrt()))) {
                z2 = false;
            }
            this.f22508h.setVisibility(z2 ? 0 : 8);
        }
    }

    public static void d3(gc3c gc3cVar, @zy.dd StyledPlayerView styledPlayerView, @zy.dd StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(gc3cVar);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dd() {
        com.google.android.exoplayer2.util.qrj<? super yqrt> qrjVar;
        TextView textView = this.f22509i;
        if (textView != null) {
            CharSequence charSequence = this.f22501a;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22509i.setVisibility(0);
                return;
            }
            gc3c gc3cVar = this.f22512l;
            yqrt yqrtVarMo12087n = gc3cVar != null ? gc3cVar.mo12087n() : null;
            if (yqrtVarMo12087n == null || (qrjVar = this.f22502b) == null) {
                this.f22509i.setVisibility(8);
            } else {
                this.f22509i.setText((CharSequence) qrjVar.m13723k(yqrtVarMo12087n).second);
                this.f22509i.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt() {
        gc3c gc3cVar = this.f22512l;
        com.google.android.exoplayer2.video.wvg wvgVarFti = gc3cVar != null ? gc3cVar.fti() : com.google.android.exoplayer2.video.wvg.f23568i;
        int i2 = wvgVarFti.f23577k;
        int i3 = wvgVarFti.f23579q;
        int i4 = wvgVarFti.f23578n;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * wvgVarFti.f23576g) / i3;
        View view = this.f22507g;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.f22504d != 0) {
                view.removeOnLayoutChangeListener(this.f22511k);
            }
            this.f22504d = i4;
            if (i4 != 0) {
                this.f22507g.addOnLayoutChangeListener(this.f22511k);
            }
            kja0((TextureView) this.f22507g, this.f22504d);
        }
        o1t(this.f22517q, this.f22525y ? 0.0f : f2);
    }

    private boolean fti() {
        gc3c gc3cVar = this.f22512l;
        if (gc3cVar == null) {
            return true;
        }
        int playbackState = gc3cVar.getPlaybackState();
        return this.f22521u && !this.f22512l.d8wk().ni7() && (playbackState == 1 || playbackState == 4 || !((gc3c) C3844k.f7l8(this.f22512l)).yqrt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fu4() {
        gc3c gc3cVar = this.f22512l;
        return gc3cVar != null && gc3cVar.mo12088r() && this.f22512l.yqrt();
    }

    private void gvn7(boolean z2) {
        if (m13239l()) {
            this.f22526z.setShowTimeoutMs(z2 ? 0 : this.f22524x);
            this.f22526z.t8iq();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m13236h() {
        View view = this.f22514n;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m13237i() {
        ImageView imageView = this.f22519s;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f22519s.setVisibility(4);
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean jk(@zy.dd Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                o1t(this.f22517q, intrinsicWidth / intrinsicHeight);
                this.f22519s.setImageDrawable(drawable);
                this.f22519s.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @zy.hyr(23)
    private static void ki(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C3748h.n.f66302kja0, null));
        imageView.setBackgroundColor(resources.getColor(C3748h.zy.f22777g, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kja0(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: l */
    private boolean m13239l() {
        if (!this.f22506f) {
            return false;
        }
        C3844k.ld6(this.f22526z);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui() {
        StyledPlayerControlView styledPlayerControlView = this.f22526z;
        if (styledPlayerControlView == null || !this.f22506f) {
            setContentDescription(null);
        } else if (styledPlayerControlView.yz()) {
            setContentDescription(this.f22522v ? getResources().getString(C3748h.ld6.f66241f7l8) : null);
        } else {
            setContentDescription(getResources().getString(C3748h.ld6.f66271zurt));
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean mcp(was wasVar) {
        byte[] bArr = wasVar.f23619t;
        if (bArr == null) {
            return false;
        }
        return jk(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean ncyb() {
        if (!this.f22505e) {
            return false;
        }
        C3844k.ld6(this.f22519s);
        return true;
    }

    @SuppressLint({"InlinedApi"})
    private boolean ni7(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oc() {
        if (m13239l() && this.f22512l != null) {
            if (!this.f22526z.yz()) {
                m13246z(true);
                return true;
            }
            if (this.f22522v) {
                this.f22526z.hb();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m13243r() {
        if (fu4() && this.f66080bo) {
            fn3e();
        } else {
            m13246z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9kr(boolean z2) {
        gc3c gc3cVar = this.f22512l;
        if (gc3cVar == null || gc3cVar.tfm().toq().isEmpty()) {
            if (this.f22513m) {
                return;
            }
            m13237i();
            m13236h();
            return;
        }
        if (z2 && !this.f22513m) {
            m13236h();
        }
        if (gc3cVar.tfm().zy(2)) {
            m13237i();
            return;
        }
        m13236h();
        if (ncyb() && (mcp(gc3cVar.ra()) || jk(this.f22510j))) {
            return;
        }
        m13237i();
    }

    /* JADX INFO: renamed from: z */
    private void m13246z(boolean z2) {
        if (!(fu4() && this.f66080bo) && m13239l()) {
            boolean z3 = this.f22526z.yz() && this.f22526z.getShowTimeoutMs() <= 0;
            boolean zFti = fti();
            if (z2 || z3 || zFti) {
                gvn7(zFti);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gc3c gc3cVar = this.f22512l;
        if (gc3cVar != null && gc3cVar.mo12088r()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zNi7 = ni7(keyEvent.getKeyCode());
        if ((zNi7 && m13239l() && !this.f22526z.yz()) || t8r(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m13246z(true);
            return true;
        }
        if (!zNi7 || !m13239l()) {
            return false;
        }
        m13246z(true);
        return false;
    }

    public void fn3e() {
        StyledPlayerControlView styledPlayerControlView = this.f22526z;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.hb();
        }
    }

    @Override // com.google.android.exoplayer2.ui.toq
    public List<C3751k> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22518r;
        if (frameLayout != null) {
            arrayList.add(new C3751k(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.f22526z;
        if (styledPlayerControlView != null) {
            arrayList.add(new C3751k(styledPlayerControlView, 0));
        }
        return se.copyOf((Collection) arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.toq
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C3844k.x2(this.f22520t, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f22521u;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22522v;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22524x;
    }

    @zy.dd
    public Drawable getDefaultArtwork() {
        return this.f22510j;
    }

    @zy.dd
    public FrameLayout getOverlayFrameLayout() {
        return this.f22518r;
    }

    @zy.dd
    public gc3c getPlayer() {
        return this.f22512l;
    }

    public int getResizeMode() {
        C3844k.ld6(this.f22517q);
        return this.f22517q.getResizeMode();
    }

    @zy.dd
    public SubtitleView getSubtitleView() {
        return this.f22516p;
    }

    public boolean getUseArtwork() {
        return this.f22505e;
    }

    public boolean getUseController() {
        return this.f22506f;
    }

    @zy.dd
    public View getVideoSurfaceView() {
        return this.f22507g;
    }

    public void jp0y() {
        gvn7(fti());
    }

    protected void o1t(@zy.dd AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m13239l() || this.f22512l == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22523w = true;
            return true;
        }
        if (action != 1 || !this.f22523w) {
            return false;
        }
        this.f22523w = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m13239l() || this.f22512l == null) {
            return false;
        }
        m13246z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return oc();
    }

    public void setAspectRatioListener(@zy.dd AspectRatioFrameLayout.toq toqVar) {
        C3844k.ld6(this.f22517q);
        this.f22517q.setAspectRatioListener(toqVar);
    }

    public void setControllerAutoShow(boolean z2) {
        this.f22521u = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.f66080bo = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22522v = z2;
        lvui();
    }

    public void setControllerOnFullScreenModeChangedListener(@zy.dd StyledPlayerControlView.InterfaceC3729q interfaceC3729q) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setOnFullScreenModeChangedListener(interfaceC3729q);
    }

    public void setControllerShowTimeoutMs(int i2) {
        C3844k.ld6(this.f22526z);
        this.f22524x = i2;
        if (this.f22526z.yz()) {
            jp0y();
        }
    }

    public void setControllerVisibilityListener(@zy.dd StyledPlayerControlView.qrj qrjVar) {
        C3844k.ld6(this.f22526z);
        StyledPlayerControlView.qrj qrjVar2 = this.f22503c;
        if (qrjVar2 == qrjVar) {
            return;
        }
        if (qrjVar2 != null) {
            this.f22526z.zp(qrjVar2);
        }
        this.f22503c = qrjVar;
        if (qrjVar != null) {
            this.f22526z.n5r1(qrjVar);
        }
    }

    public void setCustomErrorMessage(@zy.dd CharSequence charSequence) {
        C3844k.m13633s(this.f22509i != null);
        this.f22501a = charSequence;
        dd();
    }

    public void setDefaultArtwork(@zy.dd Drawable drawable) {
        if (this.f22510j != drawable) {
            this.f22510j = drawable;
            x9kr(false);
        }
    }

    public void setErrorMessageProvider(@zy.dd com.google.android.exoplayer2.util.qrj<? super yqrt> qrjVar) {
        if (this.f22502b != qrjVar) {
            this.f22502b = qrjVar;
            dd();
        }
    }

    public void setExtraAdGroupMarkers(@zy.dd long[] jArr, @zy.dd boolean[] zArr) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.f22513m != z2) {
            this.f22513m = z2;
            x9kr(false);
        }
    }

    public void setPlayer(@zy.dd gc3c gc3cVar) {
        C3844k.m13633s(Looper.myLooper() == Looper.getMainLooper());
        C3844k.m13629k(gc3cVar == null || gc3cVar.g1() == Looper.getMainLooper());
        gc3c gc3cVar2 = this.f22512l;
        if (gc3cVar2 == gc3cVar) {
            return;
        }
        if (gc3cVar2 != null) {
            gc3cVar2.mo12081e(this.f22511k);
            View view = this.f22507g;
            if (view instanceof TextureView) {
                gc3cVar2.a9((TextureView) view);
            } else if (view instanceof SurfaceView) {
                gc3cVar2.oc((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f22516p;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22512l = gc3cVar;
        if (m13239l()) {
            this.f22526z.setPlayer(gc3cVar);
        }
        d2ok();
        dd();
        x9kr(true);
        if (gc3cVar == null) {
            fn3e();
            return;
        }
        if (gc3cVar.mo12080d(27)) {
            View view2 = this.f22507g;
            if (view2 instanceof TextureView) {
                gc3cVar.ni7((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                gc3cVar.mo12082h((SurfaceView) view2);
            }
            eqxt();
        }
        if (this.f22516p != null && gc3cVar.mo12080d(28)) {
            this.f22516p.setCues(gc3cVar.ki());
        }
        gc3cVar.ngy(this.f22511k);
        m13246z(false);
    }

    public void setRepeatToggleModes(int i2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        C3844k.ld6(this.f22517q);
        this.f22517q.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.f22515o != i2) {
            this.f22515o = i2;
            d2ok();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowShuffleButton(z2);
    }

    public void setShowSubtitleButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowSubtitleButton(z2);
    }

    public void setShowVrButton(boolean z2) {
        C3844k.ld6(this.f22526z);
        this.f22526z.setShowVrButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f22514n;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z2) {
        C3844k.m13633s((z2 && this.f22519s == null) ? false : true);
        if (this.f22505e != z2) {
            this.f22505e = z2;
            x9kr(false);
        }
    }

    public void setUseController(boolean z2) {
        C3844k.m13633s((z2 && this.f22526z == null) ? false : true);
        if (this.f22506f == z2) {
            return;
        }
        this.f22506f = z2;
        if (m13239l()) {
            this.f22526z.setPlayer(this.f22512l);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.f22526z;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.hb();
                this.f22526z.setPlayer(null);
            }
        }
        lvui();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f22507g;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m13247t() {
        View view = this.f22507g;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public boolean t8r(KeyEvent keyEvent) {
        return m13239l() && this.f22526z.m13223f(keyEvent);
    }

    public void wvg() {
        View view = this.f22507g;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public boolean zurt() {
        StyledPlayerControlView styledPlayerControlView = this.f22526z;
        return styledPlayerControlView != null && styledPlayerControlView.yz();
    }

    public StyledPlayerView(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @zy.dd AttributeSet attributeSet, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int integer;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        boolean z11;
        super(context, attributeSet, i2);
        ViewOnLayoutChangeListenerC3732k viewOnLayoutChangeListenerC3732k = new ViewOnLayoutChangeListenerC3732k();
        this.f22511k = viewOnLayoutChangeListenerC3732k;
        if (isInEditMode()) {
            this.f22517q = null;
            this.f22514n = null;
            this.f22507g = null;
            this.f22525y = false;
            this.f22519s = null;
            this.f22516p = null;
            this.f22508h = null;
            this.f22509i = null;
            this.f22526z = null;
            this.f22520t = null;
            this.f22518r = null;
            ImageView imageView = new ImageView(context);
            if (com.google.android.exoplayer2.util.lrht.f23230k >= 23) {
                ki(getResources(), imageView);
            } else {
                cdj(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = C3748h.s.f22739y;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3748h.qrj.f66456kx3, i2, 0);
            try {
                int i10 = C3748h.qrj.f66486ob;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
                int color = typedArrayObtainStyledAttributes.getColor(i10, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66500rp, i9);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66529xm, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66452kiv, 0);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66470mj, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66449kbj, 1);
                int i12 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66404cyoe, 0);
                int i13 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66419f1bi, 5000);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66392bih, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66491ps, true);
                integer = typedArrayObtainStyledAttributes.getInteger(C3748h.qrj.f66425g0ad, 0);
                this.f22513m = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66413ec, this.f22513m);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66539z4t, true);
                typedArrayObtainStyledAttributes.recycle();
                z5 = z14;
                z2 = z15;
                i4 = i12;
                z8 = z13;
                i7 = resourceId2;
                z7 = z12;
                z6 = zHasValue;
                i6 = color;
                i5 = i11;
                i9 = resourceId;
                i3 = i13;
                z3 = z16;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i3 = 5000;
            z2 = true;
            i4 = 0;
            z3 = true;
            integer = 0;
            z5 = true;
            i5 = 1;
            i6 = 0;
            z6 = false;
            z7 = true;
            i7 = 0;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C3748h.f7l8.f22627m);
        this.f22517q = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a9(aspectRatioFrameLayout, i4);
        }
        View viewFindViewById = findViewById(C3748h.f7l8.f66144g1);
        this.f22514n = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout != null && i5 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                z9 = true;
                this.f22507g = new TextureView(context);
            } else if (i5 != 3) {
                if (i5 != 4) {
                    this.f22507g = new SurfaceView(context);
                } else {
                    try {
                        this.f22507g = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                z9 = true;
            } else {
                try {
                    z9 = true;
                    this.f22507g = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z11 = true;
                    this.f22507g.setLayoutParams(layoutParams);
                    this.f22507g.setOnClickListener(viewOnLayoutChangeListenerC3732k);
                    this.f22507g.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f22507g, 0);
                    z10 = z11;
                } catch (Exception e3) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z11 = false;
            this.f22507g.setLayoutParams(layoutParams);
            this.f22507g.setOnClickListener(viewOnLayoutChangeListenerC3732k);
            this.f22507g.setClickable(false);
            aspectRatioFrameLayout.addView(this.f22507g, 0);
            z10 = z11;
        } else {
            z9 = true;
            this.f22507g = null;
            z10 = false;
        }
        this.f22525y = z10;
        this.f22520t = (FrameLayout) findViewById(C3748h.f7l8.f66170lrht);
        this.f22518r = (FrameLayout) findViewById(C3748h.f7l8.f66123c8jq);
        ImageView imageView2 = (ImageView) findViewById(C3748h.f7l8.f66207uv6);
        this.f22519s = imageView2;
        this.f22505e = (!z7 || imageView2 == null) ? false : z9;
        if (i7 != 0) {
            this.f22510j = C0498q.m2259s(getContext(), i7);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C3748h.f7l8.f66230zsr0);
        this.f22516p = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(C3748h.f7l8.f66153hb);
        this.f22508h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f22515o = integer;
        TextView textView = (TextView) findViewById(C3748h.f7l8.f66119bf2);
        this.f22509i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i14 = C3748h.f7l8.f66136ek5k;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i14);
        View viewFindViewById3 = findViewById(C3748h.f7l8.f66226yz);
        if (styledPlayerControlView != null) {
            this.f22526z = styledPlayerControlView;
            i8 = 0;
        } else if (viewFindViewById3 != null) {
            i8 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f22526z = styledPlayerControlView2;
            styledPlayerControlView2.setId(i14);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i8 = 0;
            this.f22526z = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f22526z;
        this.f22524x = styledPlayerControlView3 != null ? i3 : i8;
        this.f22522v = z5;
        this.f22521u = z2;
        this.f66080bo = z3;
        this.f22506f = (!z8 || styledPlayerControlView3 == null) ? i8 : z9;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.m13224j();
            this.f22526z.n5r1(viewOnLayoutChangeListenerC3732k);
        }
        lvui();
    }
}
