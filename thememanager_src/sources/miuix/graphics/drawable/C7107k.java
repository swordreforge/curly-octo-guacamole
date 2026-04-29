package miuix.graphics.drawable;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import miuix.graphics.gif.toq;
import miuix.graphics.gif.zy;
import miuix.io.C7184k;

/* JADX INFO: renamed from: miuix.graphics.drawable.k */
/* JADX INFO: compiled from: GifAnimationDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7107k extends AnimationDrawable {

    /* JADX INFO: renamed from: n */
    private DrawableContainer.DrawableContainerState f40002n;

    /* JADX INFO: renamed from: q */
    private Resources f40003q;

    /* JADX INFO: renamed from: s */
    private int f40004s;

    /* JADX INFO: renamed from: k */
    private final toq f40001k = new toq();

    /* JADX INFO: renamed from: g */
    private ArrayList<Integer> f40000g = new ArrayList<>();

    /* JADX INFO: renamed from: y */
    private ArrayList<Integer> f40005y = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    private boolean m25717k(toq.C8104toq c8104toq) {
        zy zyVar = c8104toq.f40017k;
        if (zyVar == null || !c8104toq.f87468toq) {
            return false;
        }
        this.f40001k.f40013n = zyVar.x2();
        int iM25731g = zyVar.m25731g();
        if (iM25731g <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < iM25731g; i2++) {
            if (this.f40001k.f40013n) {
                addFrame(new BitmapDrawable(this.f40003q, zyVar.m25735n(i2)), zyVar.m25737q(i2));
            } else {
                this.f40001k.f87466toq.add(new toq.zy(zyVar.m25735n(i2), zyVar.m25737q(i2), i2));
            }
        }
        toq toqVar = this.f40001k;
        if (!toqVar.f40013n) {
            toqVar.f7l8();
            toq.zy zyVar2 = this.f40001k.f87466toq.get(0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f40003q, zyVar2.f40018k);
            addFrame(bitmapDrawable, zyVar2.f87469toq);
            addFrame(bitmapDrawable, zyVar2.f87469toq);
        }
        setOneShot(false);
        super.selectDrawable(0);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private boolean m25718q(Resources resources, C7184k c7184k) {
        this.f40003q = resources;
        toq toqVar = this.f40001k;
        toqVar.f87465f7l8 = c7184k;
        return m25717k(toqVar.m25729q(0));
    }

    /* JADX INFO: renamed from: y */
    private void m25719y(int i2) {
        if (this.f40001k.f87466toq.isEmpty()) {
            return;
        }
        toq.zy zyVar = this.f40001k.f87466toq.get(0);
        if (this.f40001k.f87466toq.size() > 1) {
            this.f40001k.f87466toq.remove(0);
        }
        this.f40001k.m25728n();
        this.f40002n.getChildren()[i2] = new BitmapDrawable(this.f40003q, zyVar.f40018k);
        this.f40000g.add(i2, Integer.valueOf(zyVar.f87469toq));
    }

    @Override // android.graphics.drawable.AnimationDrawable
    public final void addFrame(Drawable drawable, int i2) {
        super.addFrame(drawable, i2);
        this.f40000g.add(Integer.valueOf(i2));
        this.f40005y.add(Integer.valueOf(i2));
    }

    public boolean f7l8(Context context, String str) {
        return m25718q(context.getResources(), new C7184k(str));
    }

    /* JADX INFO: renamed from: g */
    public boolean m25720g(Context context, Uri uri) {
        return m25718q(context.getResources(), new C7184k(context, uri));
    }

    @Override // android.graphics.drawable.AnimationDrawable
    public final int getDuration(int i2) {
        return this.f40000g.get(i2).intValue();
    }

    /* JADX INFO: renamed from: n */
    public boolean m25721n(Context context, AssetManager assetManager, String str) {
        return m25718q(context.getResources(), new C7184k(assetManager, str));
    }

    /* JADX INFO: renamed from: s */
    public final void m25722s(long j2) {
        this.f40001k.f40012k = j2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        if (j2 == SystemClock.uptimeMillis() + ((long) this.f40005y.get(this.f40004s).intValue())) {
            j2 = SystemClock.uptimeMillis() + ((long) this.f40000g.get(this.f40004s).intValue());
        }
        super.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.DrawableContainer
    public final boolean selectDrawable(int i2) {
        m25719y(i2);
        this.f40004s = i2;
        return super.selectDrawable(i2);
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.DrawableContainer
    protected final void setConstantState(DrawableContainer.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        this.f40002n = drawableContainerState;
    }
}
