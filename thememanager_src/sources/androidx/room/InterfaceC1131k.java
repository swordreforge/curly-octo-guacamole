package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.hyr;

/* JADX INFO: renamed from: androidx.room.k */
/* JADX INFO: compiled from: ColumnInfo.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1131k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f52364f7l8 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f6186g = 5;

    /* JADX INFO: renamed from: k */
    public static final String f6187k = "[field-name]";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @hyr(21)
    public static final int f52365ld6 = 5;

    /* JADX INFO: renamed from: n */
    public static final int f6188n = 4;

    /* JADX INFO: renamed from: p */
    public static final int f6189p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f6190q = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f52366qrj = "[value-unspecified]";

    /* JADX INFO: renamed from: s */
    public static final int f6191s = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f52367toq = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @hyr(21)
    public static final int f52368x2 = 6;

    /* JADX INFO: renamed from: y */
    public static final int f6192y = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f52369zy = 2;

    /* JADX INFO: renamed from: androidx.room.k$k */
    /* JADX INFO: compiled from: ColumnInfo.java */
    @Retention(RetentionPolicy.CLASS)
    public @interface k {
    }

    /* JADX INFO: renamed from: androidx.room.k$toq */
    /* JADX INFO: compiled from: ColumnInfo.java */
    @Retention(RetentionPolicy.CLASS)
    public @interface toq {
    }

    @k
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @toq
    int typeAffinity() default 1;
}
