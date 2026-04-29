package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.InterfaceC0704l;
import androidx.core.widget.InterfaceC0763t;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0704l, InterfaceC0763t {

    /* JADX INFO: renamed from: k */
    private final C0206n f740k;

    /* JADX INFO: renamed from: n */
    private boolean f741n;

    /* JADX INFO: renamed from: q */
    private final cdj f742q;

    public AppCompatImageView(@zy.lvui Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            c0206n.toq();
        }
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.zy();
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            return cdjVar.m567q();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            return cdjVar.m565n();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f742q.m564g() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.zy();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@zy.dd Drawable drawable) {
        cdj cdjVar = this.f742q;
        if (cdjVar != null && drawable != null && !this.f741n) {
            cdjVar.m569y(drawable);
        }
        super.setImageDrawable(drawable);
        cdj cdjVar2 = this.f742q;
        if (cdjVar2 != null) {
            cdjVar2.zy();
            if (this.f741n) {
                return;
            }
            this.f742q.toq();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f741n = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@zy.fn3e int i2) {
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.m568s(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@zy.dd Uri uri) {
        super.setImageURI(uri);
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.zy();
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f740k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@zy.dd ColorStateList colorStateList) {
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.ld6(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0763t
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@zy.dd PorterDuff.Mode mode) {
        cdj cdjVar = this.f742q;
        if (cdjVar != null) {
            cdjVar.x2(mode);
        }
    }

    public AppCompatImageView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        this.f741n = false;
        C0214o.m692k(this, getContext());
        C0206n c0206n = new C0206n(this);
        this.f740k = c0206n;
        c0206n.m659n(attributeSet, i2);
        cdj cdjVar = new cdj(this);
        this.f742q = cdjVar;
        cdjVar.f7l8(attributeSet, i2);
    }
}
