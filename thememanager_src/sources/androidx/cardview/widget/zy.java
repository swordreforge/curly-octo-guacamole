package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.f7l8;
import zy.dd;

/* JADX INFO: compiled from: CardViewBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
class zy implements InterfaceC0243n {

    /* JADX INFO: renamed from: k */
    final RectF f1315k = new RectF();

    /* JADX INFO: renamed from: androidx.cardview.widget.zy$k */
    /* JADX INFO: compiled from: CardViewBaseImpl.java */
    class C0245k implements f7l8.InterfaceC0240k {
        C0245k() {
        }

        @Override // androidx.cardview.widget.f7l8.InterfaceC0240k
        /* JADX INFO: renamed from: k */
        public void mo797k(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float fWidth = (rectF.width() - f3) - 1.0f;
            float fHeight = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                zy.this.f1315k.set(f5, f5, f4, f4);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(zy.this.f1315k, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(zy.this.f1315k, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(zy.this.f1315k, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(zy.this.f1315k, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f6 = (rectF.left + f4) - 1.0f;
                float f7 = rectF.top;
                canvas.drawRect(f6, f7, (rectF.right - f4) + 1.0f, f7 + f4, paint);
                float f8 = (rectF.left + f4) - 1.0f;
                float f9 = rectF.bottom;
                canvas.drawRect(f8, f9 - f4, (rectF.right - f4) + 1.0f, f9, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    zy() {
    }

    private f7l8 cdj(InterfaceC0244q interfaceC0244q) {
        return (f7l8) interfaceC0244q.mo787q();
    }

    /* JADX INFO: renamed from: h */
    private f7l8 m812h(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new f7l8(context.getResources(), colorStateList, f2, f3, f4);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void f7l8(InterfaceC0244q interfaceC0244q) {
        cdj(interfaceC0244q).qrj(interfaceC0244q.mo784g());
        ld6(interfaceC0244q);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: g */
    public float mo804g(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).m794p();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: k */
    public void mo805k(InterfaceC0244q interfaceC0244q, float f2) {
        cdj(interfaceC0244q).m793h(f2);
        ld6(interfaceC0244q);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void kja0(InterfaceC0244q interfaceC0244q, float f2) {
        cdj(interfaceC0244q).cdj(f2);
        ld6(interfaceC0244q);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void ld6(InterfaceC0244q interfaceC0244q) {
        Rect rect = new Rect();
        cdj(interfaceC0244q).m796y(rect);
        interfaceC0244q.mo786n((int) Math.ceil(qrj(interfaceC0244q)), (int) Math.ceil(mo804g(interfaceC0244q)));
        interfaceC0244q.mo785k(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: n */
    public ColorStateList mo806n(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).m792g();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void n7h(InterfaceC0244q interfaceC0244q, @dd ColorStateList colorStateList) {
        cdj(interfaceC0244q).kja0(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: p */
    public void mo807p(InterfaceC0244q interfaceC0244q) {
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: q */
    public float mo808q(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).m795s();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public float qrj(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).ld6();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: s */
    public float mo809s(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).x2();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public float toq(InterfaceC0244q interfaceC0244q) {
        return cdj(interfaceC0244q).f7l8();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void x2() {
        f7l8.f47016t8r = new C0245k();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: y */
    public void mo810y(InterfaceC0244q interfaceC0244q, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        f7l8 f7l8VarM812h = m812h(context, colorStateList, f2, f3, f4);
        f7l8VarM812h.qrj(interfaceC0244q.mo784g());
        interfaceC0244q.toq(f7l8VarM812h);
        ld6(interfaceC0244q);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void zy(InterfaceC0244q interfaceC0244q, float f2) {
        cdj(interfaceC0244q).ki(f2);
    }
}
