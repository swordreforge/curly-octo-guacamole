package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ForeignKey.java */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.CLASS)
public @interface ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f52371cdj = 4;

    /* JADX INFO: renamed from: h */
    public static final int f6194h = 3;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f52372ki = 5;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f52373kja0 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f52374n7h = 1;

    /* JADX INFO: renamed from: androidx.room.ld6$k */
    /* JADX INFO: compiled from: ForeignKey.java */
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC1132k {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @InterfaceC1132k
    int onDelete() default 1;

    @InterfaceC1132k
    int onUpdate() default 1;

    String[] parentColumns();
}
