package com.miui.maml.elements.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.ld6;
import com.airbnb.lottie.ni7;
import com.airbnb.lottie.x9kr;
import com.android.thememanager.util.hb;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.elements.AnimatedScreenElement;
import com.miui.maml.util.Utils;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class LottieScreenElement extends AnimatedScreenElement {
    public static final String LOG_TAG = "LottieScreenElement";
    public static final String TAG_NAME = "Lottie";
    private boolean mAutoPlay;
    private C1504r mDrawable;
    private IndexedVariable mDurationProperty;
    private int mLoop;
    private String mLottiePath;
    private IndexedVariable mProgressProperty;

    public LottieScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mLottiePath = element.getAttribute("src");
        this.mLoop = Utils.getAttrAsInt(element, "loop", -1);
        this.mAutoPlay = "true".equals(element.getAttribute("autoplay"));
        load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(ld6 ld6Var) {
        this.mDrawable.v0af(ld6Var);
        int i2 = this.mLoop;
        if (i2 < 0) {
            this.mDrawable.mbx(-1);
        } else {
            this.mDrawable.mbx(i2);
        }
        IndexedVariable indexedVariable = this.mDurationProperty;
        if (indexedVariable != null) {
            indexedVariable.set((int) (this.mDrawable.vyq() - this.mDrawable.m6228e()));
        }
        if (this.mAutoPlay) {
            this.mDrawable.qo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$1(ValueAnimator valueAnimator) {
        IndexedVariable indexedVariable = this.mProgressProperty;
        if (indexedVariable != null) {
            indexedVariable.set(this.mDrawable.hb());
        }
        performAction(hb.f61276lvui);
    }

    private void load() {
        if (!TextUtils.isEmpty(this.mName)) {
            this.mProgressProperty = new IndexedVariable(this.mName + ".progress", getVariables(), true);
            this.mDurationProperty = new IndexedVariable(this.mName + ".duration", getVariables(), true);
        }
        if (this.mLottiePath != null) {
            this.mDrawable = new C1504r();
            ni7.m6127i(getRoot().getContext().mResourceManager.getInputStream(this.mLottiePath), "maml").m5952q(new x9kr() { // from class: com.miui.maml.elements.lottie.k
                @Override // com.airbnb.lottie.x9kr
                public final void onResult(Object obj) {
                    this.f29471k.lambda$load$0((ld6) obj);
                }
            });
            this.mDrawable.zurt(new ValueAnimator.AnimatorUpdateListener() { // from class: com.miui.maml.elements.lottie.toq
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f29472k.lambda$load$1(valueAnimator);
                }
            });
            this.mDrawable.m6229i(new Animator.AnimatorListener() { // from class: com.miui.maml.elements.lottie.LottieScreenElement.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (LottieScreenElement.this.mProgressProperty != null) {
                        LottieScreenElement.this.mProgressProperty.set(1.0d);
                    }
                    LottieScreenElement.this.performAction("complete");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    if (LottieScreenElement.this.mProgressProperty != null) {
                        LottieScreenElement.this.mProgressProperty.set(1.0d);
                    }
                    LottieScreenElement.this.performAction("loopComplete");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        if (this.mDrawable != null) {
            float x3 = getX();
            float y3 = getY();
            float width = getWidth();
            float height = getHeight();
            float left = getLeft(0.0f, width);
            float top = getTop(0.0f, height);
            float f2 = left <= 0.0f ? x3 + left : left;
            float f3 = top <= 0.0f ? y3 + top : top;
            if (width <= 0.0f) {
                width = 0.0f;
            }
            float f4 = width + f2;
            if (height <= 0.0f) {
                height = 0.0f;
            }
            canvas.translate(left, top);
            this.mDrawable.setBounds((int) f2, (int) f3, (int) f4, (int) (height + f3));
            this.mDrawable.draw(canvas);
        }
    }

    public void goToAndPlay(int i2) {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.sok(i2);
            if (this.mDrawable.a98o()) {
                return;
            }
            playAnimation();
        }
    }

    public void goToAndStop(int i2) {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.sok(i2);
            if (this.mDrawable.a98o()) {
                stopAnimation();
            }
        }
    }

    public void pauseAnimation() {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.fnq8();
        }
    }

    public void playAnimation() {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.qo();
        }
    }

    public void playSegments(int i2, int i3) {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.gc3c(i2, i3);
            IndexedVariable indexedVariable = this.mDurationProperty;
            if (indexedVariable != null) {
                indexedVariable.set((int) (this.mDrawable.vyq() - this.mDrawable.m6228e()));
            }
        }
    }

    public void resumeAnimation() {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.py();
        }
    }

    public void setLoopCount(int i2) {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.mbx(i2);
        }
    }

    public void setSpeed(float f2) {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.uc(f2);
        }
    }

    public void stopAnimation() {
        C1504r c1504r = this.mDrawable;
        if (c1504r != null) {
            c1504r.stop();
        }
    }
}
