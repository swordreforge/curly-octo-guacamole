package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import zy.uv6;

/* JADX INFO: compiled from: Lifecycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class kja0 {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    AtomicReference<Object> f5093k = new AtomicReference<>();

    /* JADX INFO: renamed from: androidx.lifecycle.kja0$k */
    /* JADX INFO: compiled from: Lifecycle.java */
    static /* synthetic */ class C0935k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f5094k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f51588toq;

        static {
            int[] iArr = new int[toq.values().length];
            f51588toq = iArr;
            try {
                iArr[toq.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51588toq[toq.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51588toq[toq.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51588toq[toq.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51588toq[toq.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51588toq[toq.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51588toq[toq.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[zy.values().length];
            f5094k = iArr2;
            try {
                iArr2[zy.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5094k[zy.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5094k[zy.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5094k[zy.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5094k[zy.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.java */
    public enum toq {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @zy.dd
        public static toq downFrom(@zy.lvui zy zyVar) {
            int i2 = C0935k.f5094k[zyVar.ordinal()];
            if (i2 == 1) {
                return ON_DESTROY;
            }
            if (i2 == 2) {
                return ON_STOP;
            }
            if (i2 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        @zy.dd
        public static toq downTo(@zy.lvui zy zyVar) {
            int i2 = C0935k.f5094k[zyVar.ordinal()];
            if (i2 == 1) {
                return ON_STOP;
            }
            if (i2 == 2) {
                return ON_PAUSE;
            }
            if (i2 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        @zy.dd
        public static toq upFrom(@zy.lvui zy zyVar) {
            int i2 = C0935k.f5094k[zyVar.ordinal()];
            if (i2 == 1) {
                return ON_START;
            }
            if (i2 == 2) {
                return ON_RESUME;
            }
            if (i2 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        @zy.dd
        public static toq upTo(@zy.lvui zy zyVar) {
            int i2 = C0935k.f5094k[zyVar.ordinal()];
            if (i2 == 1) {
                return ON_CREATE;
            }
            if (i2 == 2) {
                return ON_START;
            }
            if (i2 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        @zy.lvui
        public zy getTargetState() {
            switch (C0935k.f51588toq[ordinal()]) {
                case 1:
                case 2:
                    return zy.CREATED;
                case 3:
                case 4:
                    return zy.STARTED;
                case 5:
                    return zy.RESUMED;
                case 6:
                    return zy.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.java */
    public enum zy {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(@zy.lvui zy zyVar) {
            return compareTo(zyVar) >= 0;
        }
    }

    @zy.oc
    /* JADX INFO: renamed from: k */
    public abstract void mo4451k(@zy.lvui fu4 fu4Var);

    @zy.lvui
    @zy.oc
    public abstract zy toq();

    @zy.oc
    public abstract void zy(@zy.lvui fu4 fu4Var);
}
