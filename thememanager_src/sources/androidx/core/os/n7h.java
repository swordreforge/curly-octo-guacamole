package androidx.core.os;

import java.util.Locale;
import zy.a9;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: LocaleListInterface.java */
/* JADX INFO: loaded from: classes.dex */
interface n7h {
    Locale get(int i2);

    boolean isEmpty();

    @a9(from = -1)
    /* JADX INFO: renamed from: k */
    int mo2733k(Locale locale);

    @dd
    /* JADX INFO: renamed from: q */
    Locale mo2734q(@lvui String[] strArr);

    @a9(from = 0)
    int size();

    String toq();

    Object zy();
}
