package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(24)
final class kja0 implements n7h {

    /* JADX INFO: renamed from: k */
    private final LocaleList f3705k;

    kja0(Object obj) {
        this.f3705k = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f3705k.equals(((n7h) obj).zy());
    }

    @Override // androidx.core.os.n7h
    public Locale get(int i2) {
        return this.f3705k.get(i2);
    }

    public int hashCode() {
        return this.f3705k.hashCode();
    }

    @Override // androidx.core.os.n7h
    public boolean isEmpty() {
        return this.f3705k.isEmpty();
    }

    @Override // androidx.core.os.n7h
    /* JADX INFO: renamed from: k */
    public int mo2733k(Locale locale) {
        return this.f3705k.indexOf(locale);
    }

    @Override // androidx.core.os.n7h
    @dd
    /* JADX INFO: renamed from: q */
    public Locale mo2734q(@lvui String[] strArr) {
        return this.f3705k.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.n7h
    public int size() {
        return this.f3705k.size();
    }

    public String toString() {
        return this.f3705k.toString();
    }

    @Override // androidx.core.os.n7h
    public String toq() {
        return this.f3705k.toLanguageTags();
    }

    @Override // androidx.core.os.n7h
    public Object zy() {
        return this.f3705k;
    }
}
