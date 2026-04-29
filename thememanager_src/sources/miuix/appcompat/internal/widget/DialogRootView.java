package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class DialogRootView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    private boolean f39619k;

    /* JADX INFO: renamed from: n */
    private zy f39620n;

    /* JADX INFO: renamed from: q */
    private toq f39621q;

    /* JADX INFO: renamed from: miuix.appcompat.internal.widget.DialogRootView$k */
    class RunnableC7044k implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f39622g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f39623k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f39624n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f39626q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f39627s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f39628y;

        RunnableC7044k(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f39623k = i2;
            this.f39626q = i3;
            this.f39624n = i4;
            this.f39622g = i5;
            this.f39628y = i6;
            this.f39627s = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Configuration configuration = DialogRootView.this.getResources().getConfiguration();
            if ((configuration.screenWidthDp == this.f39623k && configuration.screenHeightDp == this.f39626q) || DialogRootView.this.f39621q == null) {
                return;
            }
            DialogRootView.this.f39621q.onConfigurationChanged(DialogRootView.this.getResources().getConfiguration(), this.f39624n, this.f39622g, this.f39628y, this.f39627s);
        }
    }

    public interface toq {
        void onConfigurationChanged(Configuration configuration, int i2, int i3, int i4, int i5);
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void m25407k(int i2, int i3, int i4, int i5);
    }

    public DialogRootView(@lvui Context context) {
        super(context);
        this.f39619k = false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f39619k = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f39619k) {
            this.f39619k = false;
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = configuration.screenHeightDp;
            toq toqVar = this.f39621q;
            if (toqVar != null) {
                toqVar.onConfigurationChanged(getResources().getConfiguration(), i2, i3, i4, i5);
            }
            post(new RunnableC7044k(i6, i7, i2, i3, i4, i5));
        }
    }

    public void setConfigurationChangedCallback(toq toqVar) {
        this.f39621q = toqVar;
    }

    public DialogRootView(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39619k = false;
    }

    public DialogRootView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39619k = false;
    }
}
