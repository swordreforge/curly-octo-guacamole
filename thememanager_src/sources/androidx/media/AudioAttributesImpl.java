package androidx.media;

import androidx.versionedparcelable.InterfaceC1269y;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public interface AudioAttributesImpl extends InterfaceC1269y {

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImpl$k */
    public interface InterfaceC0965k {
        @lvui
        AudioAttributesImpl build();

        @lvui
        /* JADX INFO: renamed from: k */
        InterfaceC0965k mo4553k(int usage);

        @lvui
        InterfaceC0965k setFlags(int flags);

        @lvui
        InterfaceC0965k toq(int streamType);

        @lvui
        InterfaceC0965k zy(int contentType);
    }

    int getContentType();

    int getFlags();

    int ld6();

    /* JADX INFO: renamed from: p */
    int mo4551p();

    int qrj();

    @dd
    /* JADX INFO: renamed from: s */
    Object mo4552s();

    int x2();
}
