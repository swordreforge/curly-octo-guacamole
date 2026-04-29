package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.onetrack.api.C5693g;
import o1t.C7422k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes.dex */
class x2 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: q */
    private static final String f4949q = "FragmentManager";

    /* JADX INFO: renamed from: k */
    final FragmentManager f4950k;

    /* JADX INFO: renamed from: androidx.fragment.app.x2$k */
    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    class ViewOnAttachStateChangeListenerC0902k implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zurt f4951k;

        ViewOnAttachStateChangeListenerC0902k(zurt zurtVar) {
            this.f4951k = zurtVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentLd6 = this.f4951k.ld6();
            this.f4951k.qrj();
            d3.n7h((ViewGroup) fragmentLd6.mView.getParent(), x2.this.f4950k).m4250p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    x2(FragmentManager fragmentManager) {
        this.f4950k = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @dd
    public View onCreateView(@lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @dd
    public View onCreateView(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        zurt zurtVarWvg;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4950k);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, C5693g.f31802r);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7422k.x2.f93795o1t);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(C7422k.x2.f93800wvg);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7422k.x2.f42905t, -1);
        String string = typedArrayObtainStyledAttributes.getString(C7422k.x2.f93790mcp);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0903y.toq(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentCh = resourceId != -1 ? this.f4950k.ch(resourceId) : null;
        if (fragmentCh == null && string != null) {
            fragmentCh = this.f4950k.nmn5(string);
        }
        if (fragmentCh == null && id != -1) {
            fragmentCh = this.f4950k.ch(id);
        }
        if (fragmentCh == null) {
            fragmentCh = this.f4950k.vq().mo4213k(context.getClassLoader(), attributeValue);
            fragmentCh.mFromLayout = true;
            fragmentCh.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentCh.mContainerId = id;
            fragmentCh.mTag = string;
            fragmentCh.mInLayout = true;
            FragmentManager fragmentManager = this.f4950k;
            fragmentCh.mFragmentManager = fragmentManager;
            fragmentCh.mHost = fragmentManager.qo();
            fragmentCh.onInflate(this.f4950k.qo().m4330g(), attributeSet, fragmentCh.mSavedFragmentState);
            zurtVarWvg = this.f4950k.ld6(fragmentCh);
            if (FragmentManager.m4(2)) {
                Log.v(f4949q, "Fragment " + fragmentCh + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentCh.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentCh.mInLayout = true;
            FragmentManager fragmentManager2 = this.f4950k;
            fragmentCh.mFragmentManager = fragmentManager2;
            fragmentCh.mHost = fragmentManager2.qo();
            fragmentCh.onInflate(this.f4950k.qo().m4330g(), attributeSet, fragmentCh.mSavedFragmentState);
            zurtVarWvg = this.f4950k.wvg(fragmentCh);
            if (FragmentManager.m4(2)) {
                Log.v(f4949q, "Retained Fragment " + fragmentCh + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        fragmentCh.mContainer = (ViewGroup) view;
        zurtVarWvg.qrj();
        zurtVarWvg.m4373p();
        View view2 = fragmentCh.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentCh.mView.getTag() == null) {
            fragmentCh.mView.setTag(string);
        }
        fragmentCh.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0902k(zurtVarWvg));
        return fragmentCh.mView;
    }
}
