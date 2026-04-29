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
import com.google.android.exoplayer2.ui.PlayerControlView;
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
public class PlayerView extends FrameLayout implements com.google.android.exoplayer2.ui.toq {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f66073ab = 0;
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
    private CharSequence f22426a;

    /* JADX INFO: renamed from: b */
    @zy.dd
    private com.google.android.exoplayer2.util.qrj<? super yqrt> f22427b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f66074bo;

    /* JADX INFO: renamed from: c */
    @zy.dd
    private PlayerControlView.InterfaceC3722n f22428c;

    /* JADX INFO: renamed from: d */
    private int f22429d;

    /* JADX INFO: renamed from: e */
    private boolean f22430e;

    /* JADX INFO: renamed from: f */
    private boolean f22431f;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final View f22432g;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private final View f22433h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private final TextView f22434i;

    /* JADX INFO: renamed from: j */
    @zy.dd
    private Drawable f22435j;

    /* JADX INFO: renamed from: k */
    private final ViewOnLayoutChangeListenerC3724k f22436k;

    /* JADX INFO: renamed from: l */
    @zy.dd
    private gc3c f22437l;

    /* JADX INFO: renamed from: m */
    private boolean f22438m;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final View f22439n;

    /* JADX INFO: renamed from: o */
    private int f22440o;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final SubtitleView f22441p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private final AspectRatioFrameLayout f22442q;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private final FrameLayout f22443r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final ImageView f22444s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private final FrameLayout f22445t;

    /* JADX INFO: renamed from: u */
    private boolean f22446u;

    /* JADX INFO: renamed from: v */
    private boolean f22447v;

    /* JADX INFO: renamed from: w */
    private boolean f22448w;

    /* JADX INFO: renamed from: x */
    private int f22449x;

    /* JADX INFO: renamed from: y */
    private final boolean f22450y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private final PlayerControlView f22451z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerView$k */
    private final class ViewOnLayoutChangeListenerC3724k implements gc3c.InterfaceC3440y, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.InterfaceC3722n {

        /* JADX INFO: renamed from: k */
        private final pc.toq f22452k = new pc.toq();

        /* JADX INFO: renamed from: q */
        @zy.dd
        private Object f22454q;

        public ViewOnLayoutChangeListenerC3724k() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void cdj(com.google.android.exoplayer2.video.wvg wvgVar) {
            PlayerView.this.eqxt();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: h */
        public void mo12098h(List<com.google.android.exoplayer2.text.toq> list) {
            if (PlayerView.this.f22441p != null) {
                PlayerView.this.f22441p.setCues(list);
            }
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ld6(int i2) {
            PlayerView.this.d2ok();
            PlayerView.this.dd();
            PlayerView.this.m13197r();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: n */
        public void mo11370n(gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
            if (PlayerView.this.fu4() && PlayerView.this.f66074bo) {
                PlayerView.this.fn3e();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.oc();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            PlayerView.kja0((TextureView) view, PlayerView.this.f22429d);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: r */
        public void mo6501r() {
            if (PlayerView.this.f22439n != null) {
                PlayerView.this.f22439n.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.InterfaceC3722n
        public void toq(int i2) {
            PlayerView.this.lvui();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void wvg(boolean z2, int i2) {
            PlayerView.this.d2ok();
            PlayerView.this.m13197r();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: y */
        public void mo11377y(pjz9 pjz9Var) {
            gc3c gc3cVar = (gc3c) C3844k.f7l8(PlayerView.this.f22437l);
            pc pcVarD8wk = gc3cVar.d8wk();
            if (pcVarD8wk.ni7()) {
                this.f22454q = null;
            } else if (gc3cVar.tfm().toq().isEmpty()) {
                Object obj = this.f22454q;
                if (obj != null) {
                    int iMo12147g = pcVarD8wk.mo12147g(obj);
                    if (iMo12147g != -1) {
                        if (gc3cVar.lw() == pcVarD8wk.m12485p(iMo12147g, this.f22452k).f21151n) {
                            return;
                        }
                    }
                    this.f22454q = null;
                }
            } else {
                this.f22454q = pcVarD8wk.ld6(gc3cVar.ktq(), this.f22452k, true).f21153q;
            }
            PlayerView.this.x9kr(false);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public PlayerView(Context context) {
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
        if (this.f22433h != null) {
            gc3c gc3cVar = this.f22437l;
            boolean z2 = true;
            if (gc3cVar == null || gc3cVar.getPlaybackState() != 2 || ((i2 = this.f22440o) != 2 && (i2 != 1 || !this.f22437l.yqrt()))) {
                z2 = false;
            }
            this.f22433h.setVisibility(z2 ? 0 : 8);
        }
    }

    public static void d3(gc3c gc3cVar, @zy.dd PlayerView playerView, @zy.dd PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(gc3cVar);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dd() {
        com.google.android.exoplayer2.util.qrj<? super yqrt> qrjVar;
        TextView textView = this.f22434i;
        if (textView != null) {
            CharSequence charSequence = this.f22426a;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22434i.setVisibility(0);
                return;
            }
            gc3c gc3cVar = this.f22437l;
            yqrt yqrtVarMo12087n = gc3cVar != null ? gc3cVar.mo12087n() : null;
            if (yqrtVarMo12087n == null || (qrjVar = this.f22427b) == null) {
                this.f22434i.setVisibility(8);
            } else {
                this.f22434i.setText((CharSequence) qrjVar.m13723k(yqrtVarMo12087n).second);
                this.f22434i.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt() {
        gc3c gc3cVar = this.f22437l;
        com.google.android.exoplayer2.video.wvg wvgVarFti = gc3cVar != null ? gc3cVar.fti() : com.google.android.exoplayer2.video.wvg.f23568i;
        int i2 = wvgVarFti.f23577k;
        int i3 = wvgVarFti.f23579q;
        int i4 = wvgVarFti.f23578n;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * wvgVarFti.f23576g) / i3;
        View view = this.f22432g;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.f22429d != 0) {
                view.removeOnLayoutChangeListener(this.f22436k);
            }
            this.f22429d = i4;
            if (i4 != 0) {
                this.f22432g.addOnLayoutChangeListener(this.f22436k);
            }
            kja0((TextureView) this.f22432g, this.f22429d);
        }
        o1t(this.f22442q, this.f22450y ? 0.0f : f2);
    }

    private boolean fti() {
        gc3c gc3cVar = this.f22437l;
        if (gc3cVar == null) {
            return true;
        }
        int playbackState = gc3cVar.getPlaybackState();
        return this.f22446u && (playbackState == 1 || playbackState == 4 || !this.f22437l.yqrt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fu4() {
        gc3c gc3cVar = this.f22437l;
        return gc3cVar != null && gc3cVar.mo12088r() && this.f22437l.yqrt();
    }

    private void gvn7(boolean z2) {
        if (m13193l()) {
            this.f22451z.setShowTimeoutMs(z2 ? 0 : this.f22449x);
            this.f22451z.x9kr();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m13190h() {
        View view = this.f22439n;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m13191i() {
        ImageView imageView = this.f22444s;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f22444s.setVisibility(4);
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean jk(@zy.dd Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                o1t(this.f22442q, intrinsicWidth / intrinsicHeight);
                this.f22444s.setImageDrawable(drawable);
                this.f22444s.setVisibility(0);
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
    private boolean m13193l() {
        if (!this.f22431f) {
            return false;
        }
        C3844k.ld6(this.f22451z);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui() {
        PlayerControlView playerControlView = this.f22451z;
        if (playerControlView == null || !this.f22431f) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f22447v ? getResources().getString(C3748h.ld6.f66241f7l8) : null);
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
        if (!this.f22430e) {
            return false;
        }
        C3844k.ld6(this.f22444s);
        return true;
    }

    @SuppressLint({"InlinedApi"})
    private boolean ni7(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oc() {
        if (!m13193l() || this.f22437l == null) {
            return false;
        }
        if (!this.f22451z.d3()) {
            m13200z(true);
        } else if (this.f22447v) {
            this.f22451z.fti();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m13197r() {
        if (fu4() && this.f66074bo) {
            fn3e();
        } else {
            m13200z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9kr(boolean z2) {
        gc3c gc3cVar = this.f22437l;
        if (gc3cVar == null || !gc3cVar.mo12080d(30) || gc3cVar.tfm().toq().isEmpty()) {
            if (this.f22438m) {
                return;
            }
            m13191i();
            m13190h();
            return;
        }
        if (z2 && !this.f22438m) {
            m13190h();
        }
        if (gc3cVar.tfm().zy(2)) {
            m13191i();
            return;
        }
        m13190h();
        if (ncyb() && (mcp(gc3cVar.ra()) || jk(this.f22435j))) {
            return;
        }
        m13191i();
    }

    /* JADX INFO: renamed from: z */
    private void m13200z(boolean z2) {
        if (!(fu4() && this.f66074bo) && m13193l()) {
            boolean z3 = this.f22451z.d3() && this.f22451z.getShowTimeoutMs() <= 0;
            boolean zFti = fti();
            if (z2 || z3 || zFti) {
                gvn7(zFti);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gc3c gc3cVar = this.f22437l;
        if (gc3cVar != null && gc3cVar.mo12088r()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zNi7 = ni7(keyEvent.getKeyCode());
        if ((zNi7 && m13193l() && !this.f22451z.d3()) || t8r(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m13200z(true);
            return true;
        }
        if (!zNi7 || !m13193l()) {
            return false;
        }
        m13200z(true);
        return false;
    }

    public void fn3e() {
        PlayerControlView playerControlView = this.f22451z;
        if (playerControlView != null) {
            playerControlView.fti();
        }
    }

    @Override // com.google.android.exoplayer2.ui.toq
    public List<C3751k> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22443r;
        if (frameLayout != null) {
            arrayList.add(new C3751k(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f22451z;
        if (playerControlView != null) {
            arrayList.add(new C3751k(playerControlView, 0));
        }
        return se.copyOf((Collection) arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.toq
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C3844k.x2(this.f22445t, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f22446u;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22447v;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22449x;
    }

    @zy.dd
    public Drawable getDefaultArtwork() {
        return this.f22435j;
    }

    @zy.dd
    public FrameLayout getOverlayFrameLayout() {
        return this.f22443r;
    }

    @zy.dd
    public gc3c getPlayer() {
        return this.f22437l;
    }

    public int getResizeMode() {
        C3844k.ld6(this.f22442q);
        return this.f22442q.getResizeMode();
    }

    @zy.dd
    public SubtitleView getSubtitleView() {
        return this.f22441p;
    }

    public boolean getUseArtwork() {
        return this.f22430e;
    }

    public boolean getUseController() {
        return this.f22431f;
    }

    @zy.dd
    public View getVideoSurfaceView() {
        return this.f22432g;
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
        if (!m13193l() || this.f22437l == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22448w = true;
            return true;
        }
        if (action != 1 || !this.f22448w) {
            return false;
        }
        this.f22448w = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m13193l() || this.f22437l == null) {
            return false;
        }
        m13200z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return oc();
    }

    public void setAspectRatioListener(@zy.dd AspectRatioFrameLayout.toq toqVar) {
        C3844k.ld6(this.f22442q);
        this.f22442q.setAspectRatioListener(toqVar);
    }

    public void setControllerAutoShow(boolean z2) {
        this.f22446u = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.f66074bo = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22447v = z2;
        lvui();
    }

    public void setControllerShowTimeoutMs(int i2) {
        C3844k.ld6(this.f22451z);
        this.f22449x = i2;
        if (this.f22451z.d3()) {
            jp0y();
        }
    }

    public void setControllerVisibilityListener(@zy.dd PlayerControlView.InterfaceC3722n interfaceC3722n) {
        C3844k.ld6(this.f22451z);
        PlayerControlView.InterfaceC3722n interfaceC3722n2 = this.f22428c;
        if (interfaceC3722n2 == interfaceC3722n) {
            return;
        }
        if (interfaceC3722n2 != null) {
            this.f22451z.oc(interfaceC3722n2);
        }
        this.f22428c = interfaceC3722n;
        if (interfaceC3722n != null) {
            this.f22451z.m13186z(interfaceC3722n);
        }
    }

    public void setCustomErrorMessage(@zy.dd CharSequence charSequence) {
        C3844k.m13633s(this.f22434i != null);
        this.f22426a = charSequence;
        dd();
    }

    public void setDefaultArtwork(@zy.dd Drawable drawable) {
        if (this.f22435j != drawable) {
            this.f22435j = drawable;
            x9kr(false);
        }
    }

    public void setErrorMessageProvider(@zy.dd com.google.android.exoplayer2.util.qrj<? super yqrt> qrjVar) {
        if (this.f22427b != qrjVar) {
            this.f22427b = qrjVar;
            dd();
        }
    }

    public void setExtraAdGroupMarkers(@zy.dd long[] jArr, @zy.dd boolean[] zArr) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.f22438m != z2) {
            this.f22438m = z2;
            x9kr(false);
        }
    }

    public void setPlayer(@zy.dd gc3c gc3cVar) {
        C3844k.m13633s(Looper.myLooper() == Looper.getMainLooper());
        C3844k.m13629k(gc3cVar == null || gc3cVar.g1() == Looper.getMainLooper());
        gc3c gc3cVar2 = this.f22437l;
        if (gc3cVar2 == gc3cVar) {
            return;
        }
        if (gc3cVar2 != null) {
            gc3cVar2.mo12081e(this.f22436k);
            if (gc3cVar2.mo12080d(27)) {
                View view = this.f22432g;
                if (view instanceof TextureView) {
                    gc3cVar2.a9((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    gc3cVar2.oc((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f22441p;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22437l = gc3cVar;
        if (m13193l()) {
            this.f22451z.setPlayer(gc3cVar);
        }
        d2ok();
        dd();
        x9kr(true);
        if (gc3cVar == null) {
            fn3e();
            return;
        }
        if (gc3cVar.mo12080d(27)) {
            View view2 = this.f22432g;
            if (view2 instanceof TextureView) {
                gc3cVar.ni7((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                gc3cVar.mo12082h((SurfaceView) view2);
            }
            eqxt();
        }
        if (this.f22441p != null && gc3cVar.mo12080d(28)) {
            this.f22441p.setCues(gc3cVar.ki());
        }
        gc3cVar.ngy(this.f22436k);
        m13200z(false);
    }

    public void setRepeatToggleModes(int i2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        C3844k.ld6(this.f22442q);
        this.f22442q.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.f22440o != i2) {
            this.f22440o = i2;
            d2ok();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        C3844k.ld6(this.f22451z);
        this.f22451z.setShowShuffleButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f22439n;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z2) {
        C3844k.m13633s((z2 && this.f22444s == null) ? false : true);
        if (this.f22430e != z2) {
            this.f22430e = z2;
            x9kr(false);
        }
    }

    public void setUseController(boolean z2) {
        C3844k.m13633s((z2 && this.f22451z == null) ? false : true);
        if (this.f22431f == z2) {
            return;
        }
        this.f22431f = z2;
        if (m13193l()) {
            this.f22451z.setPlayer(this.f22437l);
        } else {
            PlayerControlView playerControlView = this.f22451z;
            if (playerControlView != null) {
                playerControlView.fti();
                this.f22451z.setPlayer(null);
            }
        }
        lvui();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f22432g;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m13201t() {
        View view = this.f22432g;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public boolean t8r(KeyEvent keyEvent) {
        return m13193l() && this.f22451z.wvg(keyEvent);
    }

    public void wvg() {
        View view = this.f22432g;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public boolean zurt() {
        PlayerControlView playerControlView = this.f22451z;
        return playerControlView != null && playerControlView.d3();
    }

    public PlayerView(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @zy.dd AttributeSet attributeSet, int i2) {
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
        ViewOnLayoutChangeListenerC3724k viewOnLayoutChangeListenerC3724k = new ViewOnLayoutChangeListenerC3724k();
        this.f22436k = viewOnLayoutChangeListenerC3724k;
        if (isInEditMode()) {
            this.f22442q = null;
            this.f22439n = null;
            this.f22432g = null;
            this.f22450y = false;
            this.f22444s = null;
            this.f22441p = null;
            this.f22433h = null;
            this.f22434i = null;
            this.f22451z = null;
            this.f22445t = null;
            this.f22443r = null;
            ImageView imageView = new ImageView(context);
            if (com.google.android.exoplayer2.util.lrht.f23230k >= 23) {
                ki(getResources(), imageView);
            } else {
                cdj(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = C3748h.s.f22737q;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3748h.qrj.f66494qo, i2, 0);
            try {
                int i10 = C3748h.qrj.f66541zkd;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
                int color = typedArrayObtainStyledAttributes.getColor(i10, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66514v0af, i9);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66386b3e, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66543zsr0, 0);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66390bek6, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66397bz2, 1);
                int i12 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66502sok, 0);
                int i13 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66430gc3c, 5000);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66439i9jn, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66407d8wk, true);
                integer = typedArrayObtainStyledAttributes.getInteger(C3748h.qrj.f66396bwp, 0);
                this.f22438m = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66461ltg8, this.f22438m);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66492py, true);
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
        this.f22442q = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a9(aspectRatioFrameLayout, i4);
        }
        View viewFindViewById = findViewById(C3748h.f7l8.f66144g1);
        this.f22439n = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout != null && i5 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                z9 = true;
                this.f22432g = new TextureView(context);
            } else if (i5 != 3) {
                if (i5 != 4) {
                    this.f22432g = new SurfaceView(context);
                } else {
                    try {
                        this.f22432g = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                z9 = true;
            } else {
                try {
                    z9 = true;
                    this.f22432g = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z11 = true;
                    this.f22432g.setLayoutParams(layoutParams);
                    this.f22432g.setOnClickListener(viewOnLayoutChangeListenerC3724k);
                    this.f22432g.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f22432g, 0);
                    z10 = z11;
                } catch (Exception e3) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z11 = false;
            this.f22432g.setLayoutParams(layoutParams);
            this.f22432g.setOnClickListener(viewOnLayoutChangeListenerC3724k);
            this.f22432g.setClickable(false);
            aspectRatioFrameLayout.addView(this.f22432g, 0);
            z10 = z11;
        } else {
            z9 = true;
            this.f22432g = null;
            z10 = false;
        }
        this.f22450y = z10;
        this.f22445t = (FrameLayout) findViewById(C3748h.f7l8.f66170lrht);
        this.f22443r = (FrameLayout) findViewById(C3748h.f7l8.f66123c8jq);
        ImageView imageView2 = (ImageView) findViewById(C3748h.f7l8.f66207uv6);
        this.f22444s = imageView2;
        this.f22430e = (!z7 || imageView2 == null) ? false : z9;
        if (i7 != 0) {
            this.f22435j = C0498q.m2259s(getContext(), i7);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C3748h.f7l8.f66230zsr0);
        this.f22441p = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(C3748h.f7l8.f66153hb);
        this.f22433h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f22440o = integer;
        TextView textView = (TextView) findViewById(C3748h.f7l8.f66119bf2);
        this.f22434i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i14 = C3748h.f7l8.f66136ek5k;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i14);
        View viewFindViewById3 = findViewById(C3748h.f7l8.f66226yz);
        if (playerControlView != null) {
            this.f22451z = playerControlView;
            i8 = 0;
        } else if (viewFindViewById3 != null) {
            i8 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f22451z = playerControlView2;
            playerControlView2.setId(i14);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i8 = 0;
            this.f22451z = null;
        }
        PlayerControlView playerControlView3 = this.f22451z;
        this.f22449x = playerControlView3 != null ? i3 : i8;
        this.f22447v = z5;
        this.f22446u = z2;
        this.f66074bo = z3;
        this.f22431f = (!z8 || playerControlView3 == null) ? i8 : z9;
        fn3e();
        lvui();
        PlayerControlView playerControlView4 = this.f22451z;
        if (playerControlView4 != null) {
            playerControlView4.m13186z(viewOnLayoutChangeListenerC3724k);
        }
    }
}
