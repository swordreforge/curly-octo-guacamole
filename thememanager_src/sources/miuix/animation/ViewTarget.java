package miuix.animation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fu4;
import androidx.lifecycle.gvn7;
import androidx.lifecycle.kja0;
import java.lang.ref.WeakReference;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ViewTarget extends IAnimTarget<View> {
    public static final ITargetCreator<View> sCreator = new ITargetCreator<View>() { // from class: miuix.animation.ViewTarget.1
        @Override // miuix.animation.ITargetCreator
        public IAnimTarget createTarget(View view) {
            return new ViewTarget(view);
        }
    };
    private WeakReference<Context> mContextRef;
    private LifecycleCallbacks mLifecycleCallbacks;
    private ViewLifecyclerObserver mViewLifecyclerObserver;
    private WeakReference<View> mViewRef;

    protected class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        protected LifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@lvui Activity activity, @dd Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@lvui Activity activity) {
            ViewTarget.this.cleanViewTarget();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@lvui Activity activity, @lvui Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@lvui Activity activity) {
        }
    }

    protected class ViewLifecyclerObserver implements fu4 {
        protected ViewLifecyclerObserver() {
        }

        @gvn7(kja0.toq.ON_DESTROY)
        void onDestroy() {
            ViewTarget.this.cleanViewTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanViewTarget() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            unRegisterLifecycle(weakReference.get());
        }
        setCorner(0.0f);
        Folme.clean(this);
    }

    private void executeTask(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e2) {
            Log.w(CommonUtils.TAG, "ViewTarget.executeTask failed, " + getTargetObject(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initLayout(View view, Runnable runnable) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            int i2 = C6839R.id.miuix_animation_tag_init_layout;
            view.setTag(i2, Boolean.TRUE);
            ViewGroup viewGroup = (ViewGroup) parent;
            int left = viewGroup.getLeft();
            int top = viewGroup.getTop();
            int visibility = view.getVisibility();
            if (visibility == 8) {
                view.setVisibility(4);
            }
            viewGroup.measure(viewGroup.getWidth(), viewGroup.getHeight());
            viewGroup.layout(left, top, viewGroup.getWidth() + left, viewGroup.getHeight() + top);
            view.setVisibility(visibility);
            runnable.run();
            view.setTag(i2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v9 */
    private boolean registerLifecycle(Context context) {
        while (context != 0) {
            if (context instanceof InterfaceC0954z) {
                this.mContextRef = new WeakReference<>(context);
                if (this.mViewLifecyclerObserver == null) {
                    this.mViewLifecyclerObserver = new ViewLifecyclerObserver();
                }
                ((InterfaceC0954z) context).getLifecycle().mo4451k(this.mViewLifecyclerObserver);
                return true;
            }
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                this.mContextRef = new WeakReference<>(context);
                if (this.mLifecycleCallbacks == null) {
                    this.mLifecycleCallbacks = new LifecycleCallbacks();
                }
                ((Activity) context).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
                return true;
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : 0;
        }
        return false;
    }

    private void setCorner(float f2) {
        View view = this.mViewRef.get();
        if (view != null) {
            view.setTag(C6839R.id.miuix_animation_tag_view_hover_corners, Float.valueOf(f2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean unRegisterLifecycle(Context context) {
        LifecycleCallbacks lifecycleCallbacks;
        if (context == 0) {
            return false;
        }
        if (context instanceof InterfaceC0954z) {
            if (this.mViewLifecyclerObserver != null) {
                ((InterfaceC0954z) context).getLifecycle().zy(this.mViewLifecyclerObserver);
            }
            this.mViewLifecyclerObserver = null;
            return true;
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity) || (lifecycleCallbacks = this.mLifecycleCallbacks) == null) {
            return false;
        }
        ((Activity) context).unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
        this.mLifecycleCallbacks = null;
        return true;
    }

    @Override // miuix.animation.IAnimTarget
    public boolean allowAnimRun() {
        View targetObject = getTargetObject();
        return (targetObject == null || Folme.isInDraggingState(targetObject)) ? false : true;
    }

    @Override // miuix.animation.IAnimTarget
    public void clean() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            unRegisterLifecycle(weakReference.get());
        }
    }

    @Override // miuix.animation.IAnimTarget
    public void executeOnInitialized(final Runnable runnable) {
        final View view = this.mViewRef.get();
        if (view != null) {
            if (view.getVisibility() == 8 && !view.isLaidOut() && (view.getWidth() == 0 || view.getHeight() == 0)) {
                post(new Runnable() { // from class: miuix.animation.ViewTarget.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewTarget.this.initLayout(view, runnable);
                    }
                });
            } else {
                post(runnable);
            }
        }
    }

    @Override // miuix.animation.IAnimTarget
    public void getLocationOnScreen(int[] iArr) {
        View view = this.mViewRef.get();
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = Integer.MAX_VALUE;
            iArr[0] = Integer.MAX_VALUE;
        }
    }

    @Override // miuix.animation.IAnimTarget
    public boolean isValid() {
        return this.mViewRef.get() != null;
    }

    @Override // miuix.animation.IAnimTarget
    public void onFrameEnd(boolean z2) {
        View view = this.mViewRef.get();
        if (!z2 || view == null) {
            return;
        }
        view.setTag(C6839R.id.miuix_animation_tag_set_height, null);
        view.setTag(C6839R.id.miuix_animation_tag_set_width, null);
        view.setTag(C6839R.id.miuix_animation_tag_view_hover_corners, Float.valueOf(0.0f));
    }

    @Override // miuix.animation.IAnimTarget
    public void post(Runnable runnable) {
        View targetObject = getTargetObject();
        if (targetObject == null) {
            return;
        }
        if (this.handler.isInTargetThread() || !targetObject.isAttachedToWindow()) {
            executeTask(runnable);
        } else {
            targetObject.post(runnable);
        }
    }

    @Override // miuix.animation.IAnimTarget
    public boolean shouldUseIntValue(FloatProperty floatProperty) {
        if (floatProperty == ViewProperty.WIDTH || floatProperty == ViewProperty.HEIGHT || floatProperty == ViewProperty.SCROLL_X || floatProperty == ViewProperty.SCROLL_Y) {
            return true;
        }
        return super.shouldUseIntValue(floatProperty);
    }

    private ViewTarget(View view) {
        this.mViewRef = new WeakReference<>(view);
        registerLifecycle(view.getContext());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // miuix.animation.IAnimTarget
    public View getTargetObject() {
        return this.mViewRef.get();
    }
}
