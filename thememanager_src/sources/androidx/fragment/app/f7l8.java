package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0931j;
import androidx.loader.app.AbstractC0956k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentController.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private final AbstractC0893s<?> f4783k;

    private f7l8(AbstractC0893s<?> abstractC0893s) {
        this.f4783k = abstractC0893s;
    }

    @lvui
    public static f7l8 toq(@lvui AbstractC0893s<?> abstractC0893s) {
        return new f7l8((AbstractC0893s) androidx.core.util.n7h.qrj(abstractC0893s, "callbacks == null"));
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public AbstractC0956k a9() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    @Deprecated
    public void cdj() {
    }

    public void d2ok(@dd Parcelable parcelable) {
        AbstractC0893s<?> abstractC0893s = this.f4783k;
        if (!(abstractC0893s instanceof InterfaceC0931j)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0893s.f4870y.ngy(parcelable);
    }

    @Deprecated
    public void d3(@dd Parcelable parcelable, @dd C0880h c0880h) {
        this.f4783k.f4870y.pjz9(parcelable, c0880h);
    }

    @Deprecated
    @dd
    public List<Fragment> dd() {
        C0880h c0880hLh = this.f4783k.f4870y.lh();
        if (c0880hLh == null || c0880hLh.toq() == null) {
            return null;
        }
        return new ArrayList(c0880hLh.toq());
    }

    @Deprecated
    public void eqxt(@SuppressLint({"UnknownNullness"}) androidx.collection.qrj<String, AbstractC0956k> qrjVar) {
    }

    public boolean f7l8(@lvui Menu menu, @lvui MenuInflater menuInflater) {
        return this.f4783k.f4870y.d3(menu, menuInflater);
    }

    @Deprecated
    public void fn3e() {
    }

    public void fti() {
        this.f4783k.f4870y.uj2j();
    }

    @Deprecated
    public void fu4(boolean z2) {
    }

    /* JADX INFO: renamed from: g */
    public void m4259g() {
        this.f4783k.f4870y.gvn7();
    }

    @Deprecated
    public void gvn7() {
    }

    /* JADX INFO: renamed from: h */
    public boolean m4260h(@lvui Menu menu) {
        return this.f4783k.f4870y.hyr(menu);
    }

    /* JADX INFO: renamed from: i */
    public void m4261i() {
        this.f4783k.f4870y.vyq();
    }

    @lvui
    public FragmentManager jk() {
        return this.f4783k.f4870y;
    }

    @dd
    public View jp0y(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        return this.f4783k.f4870y.tfm().onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: k */
    public void m4262k(@dd Fragment fragment) {
        AbstractC0893s<?> abstractC0893s = this.f4783k;
        abstractC0893s.f4870y.m4199h(abstractC0893s, abstractC0893s, fragment);
    }

    public void ki() {
        this.f4783k.f4870y.m4195c();
    }

    public void kja0(boolean z2) {
        this.f4783k.f4870y.n5r1(z2);
    }

    public void ld6(boolean z2) {
        this.f4783k.f4870y.lvui(z2);
    }

    @Deprecated
    @dd
    public androidx.collection.qrj<String, AbstractC0956k> lvui() {
        return null;
    }

    public int mcp() {
        return this.f4783k.f4870y.c8jq();
    }

    /* JADX INFO: renamed from: n */
    public boolean m4263n(@lvui MenuItem menuItem) {
        return this.f4783k.f4870y.jp0y(menuItem);
    }

    public void n7h() {
        this.f4783k.f4870y.m4202l();
    }

    @Deprecated
    public void ni7() {
    }

    public boolean o1t() {
        return this.f4783k.f4870y.y9n(true);
    }

    @Deprecated
    public void oc(@dd Parcelable parcelable, @dd List<Fragment> list) {
        this.f4783k.f4870y.pjz9(parcelable, new C0880h(list, null, null));
    }

    /* JADX INFO: renamed from: p */
    public void m4264p() {
        this.f4783k.f4870y.d2ok();
    }

    /* JADX INFO: renamed from: q */
    public void m4265q(@lvui Configuration configuration) {
        this.f4783k.f4870y.fti(configuration);
    }

    public void qrj(@lvui Menu menu) {
        this.f4783k.f4870y.x9kr(menu);
    }

    @Deprecated
    @dd
    /* JADX INFO: renamed from: r */
    public C0880h m4266r() {
        return this.f4783k.f4870y.lh();
    }

    /* JADX INFO: renamed from: s */
    public void m4267s() {
        this.f4783k.f4870y.eqxt();
    }

    @lvui
    /* JADX INFO: renamed from: t */
    public List<Fragment> m4268t(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f4783k.f4870y.gyi();
    }

    public void t8r() {
        this.f4783k.f4870y.lrht();
    }

    @dd
    public Fragment wvg(@lvui String str) {
        return this.f4783k.f4870y.lv5(str);
    }

    public boolean x2(@lvui MenuItem menuItem) {
        return this.f4783k.f4870y.dd(menuItem);
    }

    @dd
    public Parcelable x9kr() {
        return this.f4783k.f4870y.h4b();
    }

    /* JADX INFO: renamed from: y */
    public void m4269y() {
        this.f4783k.f4870y.oc();
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public void m4270z(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
    }

    @Deprecated
    public void zurt() {
    }

    public void zy() {
        this.f4783k.f4870y.jk();
    }
}
