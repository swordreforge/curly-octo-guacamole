package android.view.inspector;

import android.annotation.NonNull;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ interface PropertyMapper {
    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ int mapBoolean(@NonNull String str, int i2);

    /* synthetic */ int mapFloat(@NonNull String str, int i2);

    /* synthetic */ int mapGravity(@NonNull String str, int i2);

    /* synthetic */ int mapInt(@NonNull String str, int i2);

    /* synthetic */ int mapIntEnum(@NonNull String str, int i2, @NonNull IntFunction<String> intFunction);

    /* synthetic */ int mapIntFlag(@NonNull String str, int i2, @NonNull IntFunction<Set<String>> intFunction);

    /* synthetic */ int mapObject(@NonNull String str, int i2);

    /* synthetic */ int mapResourceId(@NonNull String str, int i2);
}
