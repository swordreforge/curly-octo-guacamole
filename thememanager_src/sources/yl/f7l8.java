package yl;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.utils.y9n;
import java.util.Collection;
import kotlin.jvm.internal.d2ok;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import mub.InterfaceC7396q;
import yl.AbstractC7785k;

/* JADX INFO: compiled from: PickerAnimHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 extends TransitionListener {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final LiveData<C7789s> f45941n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final fti<C7789s> f45942q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f100613toq;

    /* JADX INFO: renamed from: k */
    private boolean f45940k = true;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C7789s f100614zy = new C7789s(true, AbstractC7785k.zy.f45954k, 0.0f);

    public f7l8() {
        fti<C7789s> ftiVar = new fti<>();
        this.f45942q = ftiVar;
        this.f45941n = ftiVar;
    }

    private final float toq(Collection<? extends UpdateInfo> collection) {
        float f2;
        float fZy = zy(collection);
        int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (this.f45940k) {
            f2 = i2;
            fZy = f2 - fZy;
        } else {
            f2 = i2;
        }
        return Math.min(1.0f, Math.max(0.0f, fZy / f2));
    }

    private final int zy(Collection<? extends UpdateInfo> collection) {
        if (collection == null || collection.isEmpty()) {
            return 0;
        }
        return collection.iterator().next().getIntValue();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final LiveData<C7789s> m28166k() {
        return this.f45941n;
    }

    /* JADX INFO: renamed from: n */
    public final void m28167n(@InterfaceC7396q View target) {
        d2ok.m23075h(target, "target");
        this.f45940k = false;
        Folme.clean(target);
        AnimState animStateAdd = new AnimState().add(ViewProperty.TRANSLATION_Y, y9n.fn3e().y, new long[0]);
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.95f, 0.4f));
        ease.addListeners(this);
        Folme.useAt(target).state().to(animStateAdd, ease);
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onBegin(@InterfaceC7396q Object toTag) {
        d2ok.m23075h(toTag, "toTag");
        Log.d("PickerAnimHelper", "onBegin");
        this.f100613toq = true;
        this.f100614zy.m28179p(this.f45940k);
        this.f100614zy.m28181s(AbstractC7785k.q.f45952k);
        this.f100614zy.ld6(0.0f);
        this.f45942q.cdj(this.f100614zy);
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onCancel(@InterfaceC7396q Object toTag) {
        d2ok.m23075h(toTag, "toTag");
        Log.d("PickerAnimHelper", "onCancel");
        this.f100613toq = false;
        this.f100614zy.m28179p(this.f45940k);
        this.f100614zy.m28181s(AbstractC7785k.k.f45950k);
        this.f45942q.cdj(this.f100614zy);
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onComplete(@InterfaceC7396q Object toTag) {
        d2ok.m23075h(toTag, "toTag");
        Log.d("PickerAnimHelper", "onComplete");
        this.f100613toq = false;
        this.f100614zy.m28179p(this.f45940k);
        this.f100614zy.m28181s(AbstractC7785k.toq.f45953k);
        this.f100614zy.ld6(1.0f);
        this.f45942q.cdj(this.f100614zy);
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onUpdate(@InterfaceC7396q Object toTag, @InterfaceC7396q Collection<UpdateInfo> updateList) {
        d2ok.m23075h(toTag, "toTag");
        d2ok.m23075h(updateList, "updateList");
        if (this.f100613toq && (!updateList.isEmpty()) && d2ok.f7l8(updateList.iterator().next().property.getName(), ViewProperty.TRANSLATION_Y.getName())) {
            this.f100614zy.m28179p(this.f45940k);
            this.f100614zy.m28181s(AbstractC7785k.n.f45951k);
            this.f100614zy.ld6(toq(updateList));
            this.f45942q.cdj(this.f100614zy);
            Log.d("PickerAnimHelper", "onUpdate progress = " + this.f100614zy.f7l8());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m28168q(@InterfaceC7396q View targetView, @InterfaceC7396q TransitionListener listener) {
        d2ok.m23075h(targetView, "targetView");
        d2ok.m23075h(listener, "listener");
        this.f45940k = true;
        Folme.clean(targetView);
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
        AnimState animStateAdd = animState.add(viewProperty, y9n.fn3e().y, new long[0]);
        AnimState animStateAdd2 = new AnimState().add(viewProperty, 0, new long[0]);
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.95f, 0.4f));
        ease.addListeners(this);
        ease.addListeners(listener);
        Folme.useAt(targetView).state().fromTo(animStateAdd, animStateAdd2, ease);
    }
}
