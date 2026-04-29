package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.metadata.AbstractC3483g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.zy;
import com.google.common.base.C4258g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.icy.k */
/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3486k extends AbstractC3483g {

    /* JADX INFO: renamed from: n */
    private static final String f20773n = "streamurl";

    /* JADX INFO: renamed from: q */
    private static final String f20774q = "streamtitle";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Pattern f64978zy = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: k */
    private final CharsetDecoder f20775k = C4258g.f68103zy.newDecoder();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final CharsetDecoder f64979toq = C4258g.f68102toq.newDecoder();

    @dd
    private String zy(ByteBuffer byteBuffer) {
        try {
            return this.f20775k.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f64979toq.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f64979toq.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f20775k.reset();
            byteBuffer.rewind();
        }
    }

    @Override // com.google.android.exoplayer2.metadata.AbstractC3483g
    protected Metadata toq(zy zyVar, ByteBuffer byteBuffer) {
        String strZy = zy(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strZy == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f64978zy.matcher(strZy);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strF7l8 = com.google.common.base.zy.f7l8(strGroup);
                strF7l8.hashCode();
                if (strF7l8.equals(f20773n)) {
                    str2 = strGroup2;
                } else if (strF7l8.equals(f20774q)) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
