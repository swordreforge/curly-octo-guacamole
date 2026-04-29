package miuix.appcompat.app.strategy;

import btvn.C1380k;
import btvn.toq;
import btvn.zy;
import miuix.appcompat.app.AbstractC6946k;
import miuix.core.util.C7079h;

/* JADX INFO: loaded from: classes3.dex */
public class CommonActionBarStrategy implements zy {
    @Override // btvn.zy
    public C1380k config(AbstractC6946k abstractC6946k, toq toqVar) {
        if (abstractC6946k == null || toqVar == null) {
            return null;
        }
        C1380k c1380k = new C1380k();
        int i2 = toqVar.f7300s;
        if (i2 >= 960) {
            c1380k.f54025toq = 0;
            c1380k.f54026zy = false;
            c1380k.f7293n = 3;
            return c1380k;
        }
        float f2 = i2;
        int i3 = toqVar.f7299q;
        if (f2 < i3 * 0.8f) {
            if ((toqVar.f7296k != 2 || i3 <= 640) && i2 <= 410) {
                c1380k.f54026zy = true;
                c1380k.f7293n = 2;
                return c1380k;
            }
            c1380k.f54025toq = 0;
            c1380k.f54026zy = false;
            if (i2 < 410) {
                c1380k.f7293n = 2;
                return c1380k;
            }
            c1380k.f7293n = 3;
            return c1380k;
        }
        int i4 = toqVar.f7296k;
        if ((i4 == 2 && i3 > 640) || ((i4 == 1 && i3 > toqVar.f7295g) || (i4 == 3 && Math.min(i3, toqVar.f7295g) <= 550 && toqVar.f7299q > toqVar.f7295g))) {
            c1380k.f54025toq = 0;
            c1380k.f54026zy = false;
        } else if (!C7079h.m25549n(toqVar.f54032toq) || toqVar.f7296k == 2) {
            c1380k.f54026zy = true;
        } else if (toqVar.f7295g / toqVar.f7299q < 1.7f) {
            c1380k.f54025toq = 0;
            c1380k.f54026zy = false;
        }
        c1380k.f7293n = 3;
        return c1380k;
    }
}
