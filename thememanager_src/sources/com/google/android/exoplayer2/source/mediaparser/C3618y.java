package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.util.Pair;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.C3430y;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.mediaparser.y */
/* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(30)
@SuppressLint({"Override"})
public final class C3618y implements MediaParser.OutputConsumer {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65434fn3e = "OutputConsumerAdapterV30";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f65435fu4 = "chunk-index-int-sizes";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f65436ni7 = "track-type-string";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f65437o1t = "chunk-index-long-us-durations";

    /* JADX INFO: renamed from: t */
    private static final Pattern f21614t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f65438wvg = "chunk-index-long-us-times";

    /* JADX INFO: renamed from: z */
    private static final String f21615z = "chunk-index-long-offsets";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f65439zurt;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f65440cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f65441f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f21616g;

    /* JADX INFO: renamed from: h */
    private int f21617h;

    /* JADX INFO: renamed from: i */
    private boolean f21618i;

    /* JADX INFO: renamed from: k */
    private final ArrayList<InterfaceC3401t> f21619k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f65442ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private List<xwq3> f65443kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private MediaParser.SeekMap f65444ld6;

    /* JADX INFO: renamed from: n */
    private final toq f21620n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private C3847l f65445n7h;

    /* JADX INFO: renamed from: p */
    @dd
    private MediaParser.SeekMap f21621p;

    /* JADX INFO: renamed from: q */
    private final ArrayList<InterfaceC3401t.k> f21622q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private C3398q f65446qrj;

    /* JADX INFO: renamed from: s */
    private x2 f21623s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f65447t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<xwq3> f65448toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private String f65449x2;

    /* JADX INFO: renamed from: y */
    @dd
    private final xwq3 f21624y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<MediaCodec.CryptoInfo> f65450zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.mediaparser.y$toq */
    /* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
    private static final class toq implements com.google.android.exoplayer2.upstream.x2 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public MediaParser.InputReader f65451toq;

        private toq() {
        }

        @Override // com.google.android.exoplayer2.upstream.x2
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            return ((MediaParser.InputReader) lrht.ld6(this.f65451toq)).read(bArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.mediaparser.y$zy */
    /* JADX INFO: compiled from: OutputConsumerAdapterV30.java */
    private static final class zy implements o1t {

        /* JADX INFO: renamed from: q */
        private final MediaParser.SeekMap f21625q;

        public zy(MediaParser.SeekMap seekMap) {
            this.f21625q = seekMap;
        }

        /* JADX INFO: renamed from: k */
        private static wvg m12789k(MediaParser.SeekPoint seekPoint) {
            return new wvg(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        public boolean f7l8() {
            return this.f21625q.isSeekable();
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: n */
        public o1t.C3388k mo11754n(long j2) {
            Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.f21625q.getSeekPoints(j2);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new o1t.C3388k(m12789k((MediaParser.SeekPoint) obj)) : new o1t.C3388k(m12789k((MediaParser.SeekPoint) obj), m12789k((MediaParser.SeekPoint) seekPoints.second));
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: s */
        public long mo11755s() {
            long durationMicros = this.f21625q.getDurationMicros();
            return durationMicros != -2147483648L ? durationMicros : C3548p.f65257toq;
        }
    }

    static {
        MediaParser.SeekPoint seekPoint = MediaParser.SeekPoint.START;
        f65439zurt = Pair.create(seekPoint, seekPoint);
        f21614t = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public C3618y() {
        this(null, -2, false);
    }

    private static int f7l8(MediaFormat mediaFormat, String str, int i2) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i2;
        }
        return 0;
    }

    @dd
    private static DrmInitData fn3e(@dd String str, @dd android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i2 = 0; i2 < schemeInitDataCount; i2++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i2);
            schemeDataArr[i2] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(str, schemeDataArr);
    }

    @dd
    /* JADX INFO: renamed from: i */
    private InterfaceC3401t.k m12780i(int i2, @dd MediaCodec.CryptoInfo cryptoInfo) {
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.f65450zy.get(i2) == cryptoInfo) {
            return (InterfaceC3401t.k) C3844k.f7l8(this.f21622q.get(i2));
        }
        int i4 = 0;
        try {
            Matcher matcher = f21614t.matcher(cryptoInfo.toString());
            matcher.find();
            int i5 = Integer.parseInt((String) lrht.ld6(matcher.group(1)));
            i3 = Integer.parseInt((String) lrht.ld6(matcher.group(2)));
            i4 = i5;
        } catch (RuntimeException e2) {
            String strValueOf = String.valueOf(cryptoInfo);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
            sb.append("Unexpected error while parsing CryptoInfo: ");
            sb.append(strValueOf);
            ni7.m13700n(f65434fn3e, sb.toString(), e2);
            i3 = 0;
        }
        InterfaceC3401t.k kVar = new InterfaceC3401t.k(cryptoInfo.mode, cryptoInfo.key, i4, i3);
        this.f65450zy.set(i2, cryptoInfo);
        this.f21622q.set(i2, kVar);
        return kVar;
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static com.google.android.exoplayer2.video.zy m12781n(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] bArrZy = byteBuffer != null ? zy(byteBuffer) : null;
        int integer = mediaFormat.getInteger("color-transfer", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-standard", -1);
        if (bArrZy == null && integer == -1 && integer2 == -1 && integer3 == -1) {
            return null;
        }
        return new com.google.android.exoplayer2.video.zy(integer3, integer2, integer, bArrZy);
    }

    private boolean n7h(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(f65435fu4);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) C3844k.f7l8(mediaFormat.getByteBuffer(f21615z))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) C3844k.f7l8(mediaFormat.getByteBuffer(f65437o1t))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) C3844k.f7l8(mediaFormat.getByteBuffer(f65438wvg))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        C3398q c3398q = new C3398q(iArr, jArr, jArr2, jArr3);
        this.f65446qrj = c3398q;
        this.f21623s.cdj(c3398q);
        return true;
    }

    private static int ni7(@dd String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return com.google.android.exoplayer2.util.wvg.x2(str);
        }
    }

    private void qrj() {
        if (!this.f65442ki || this.f65447t8r) {
            return;
        }
        int size = this.f21619k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f21619k.get(i2) == null) {
                return;
            }
        }
        this.f21623s.mo11753i();
        this.f65447t8r = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: s */
    private static String m12782s(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    b2 = 0;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    b2 = 1;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    b2 = 2;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    b2 = 3;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    b2 = 4;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    b2 = 5;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    b2 = 6;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    b2 = 7;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    b2 = 8;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    b2 = 9;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    b2 = 10;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 6:
                return com.google.android.exoplayer2.util.wvg.f23301g;
            case 1:
                return com.google.android.exoplayer2.util.wvg.f23304j;
            case 2:
                return com.google.android.exoplayer2.util.wvg.f67116kja0;
            case 3:
                return com.google.android.exoplayer2.util.wvg.f67142wvg;
            case 4:
                return com.google.android.exoplayer2.util.wvg.f67095d3;
            case 5:
                return com.google.android.exoplayer2.util.wvg.f67115ki;
            case 7:
                return com.google.android.exoplayer2.util.wvg.f67094d2ok;
            case 8:
                return com.google.android.exoplayer2.util.wvg.f67118lrht;
            case 9:
                return com.google.android.exoplayer2.util.wvg.f23299e;
            case 10:
                return com.google.android.exoplayer2.util.wvg.f23318y;
            case 11:
                return com.google.android.exoplayer2.util.wvg.f67097dd;
            case 12:
                return com.google.android.exoplayer2.util.wvg.f67113jk;
            case 13:
                return com.google.android.exoplayer2.util.wvg.f67150zurt;
            default:
                throw new IllegalArgumentException(str.length() != 0 ? "Illegal parser name: ".concat(str) : new String("Illegal parser name: "));
        }
    }

    private void toq(int i2) {
        for (int size = this.f21619k.size(); size <= i2; size++) {
            this.f21619k.add(null);
            this.f65448toq.add(null);
            this.f65450zy.add(null);
            this.f21622q.add(null);
        }
    }

    private static int x2(MediaFormat mediaFormat) {
        return f7l8(mediaFormat, "is-forced-subtitle", 2) | f7l8(mediaFormat, "is-autoselect", 4) | 0 | f7l8(mediaFormat, "is-default", 1);
    }

    /* JADX INFO: renamed from: y */
    private static List<byte[]> m12783y(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(zy(byteBuffer));
            i2 = i3;
        }
    }

    private xwq3 zurt(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i2 = 0;
        xwq3.toq toqVarFti = new xwq3.toq().lvui(fn3e(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).eqxt(this.f65449x2).m13941e(mediaFormat.getInteger("bitrate", -1)).gvn7(mediaFormat.getInteger("channel-count", -1)).oc(m12781n(mediaFormat)).m13945m(string).d3(mediaFormat.getString("codecs-string")).x9kr(mediaFormat.getFloat("frame-rate", -1.0f)).bf2(mediaFormat.getInteger("width", -1)).ncyb(mediaFormat.getInteger(InterfaceC1925p.byf, -1)).hyr(m12783y(mediaFormat)).m13940c(mediaFormat.getString("language")).lrht(mediaFormat.getInteger("max-input-size", -1)).vyq(mediaFormat.getInteger("exo-pcm-encoding", -1)).m13946o(mediaFormat.getInteger("rotation-degrees", 0)).ek5k(mediaFormat.getInteger("sample-rate", -1)).yz(x2(mediaFormat)).m13947r(mediaFormat.getInteger("encoder-delay", 0)).dd(mediaFormat.getInteger("encoder-padding", 0)).nn86(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).m13939b(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).fti(integer);
        while (true) {
            if (i2 >= this.f65443kja0.size()) {
                break;
            }
            xwq3 xwq3Var = this.f65443kja0.get(i2);
            if (lrht.zy(xwq3Var.f23682r, string) && xwq3Var.bp == integer) {
                toqVarFti.m13940c(xwq3Var.f23678n).m13943j(xwq3Var.f23689y).yz(xwq3Var.f23671g).m13942f(xwq3Var.f23681q).uv6(xwq3Var.f23690z);
                break;
            }
            i2++;
        }
        return toqVarFti.a9();
    }

    private static byte[] zy(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public void cdj(long j2) {
        this.f65440cdj = j2;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public MediaParser.SeekMap m12784g() {
        return this.f21621p;
    }

    /* JADX INFO: renamed from: h */
    public void m12785h(List<xwq3> list) {
        this.f65443kja0 = list;
    }

    /* JADX INFO: renamed from: k */
    public void m12786k() {
        this.f21618i = true;
    }

    public void ki(String str) {
        this.f65449x2 = m12782s(str);
    }

    public void kja0(x2 x2Var) {
        this.f21623s = x2Var;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> ld6(long j2) {
        MediaParser.SeekMap seekMap = this.f65444ld6;
        return seekMap != null ? seekMap.getSeekPoints(j2) : f65439zurt;
    }

    public void onSampleCompleted(int i2, long j2, int i3, int i4, int i5, @dd MediaCodec.CryptoInfo cryptoInfo) {
        long j3 = this.f65440cdj;
        if (j3 == C3548p.f65257toq || j2 < j3) {
            C3847l c3847l = this.f65445n7h;
            if (c3847l != null) {
                j2 = c3847l.m13647k(j2);
            }
            ((InterfaceC3401t) C3844k.f7l8(this.f21619k.get(i2))).mo11930n(j2, i3, i4, i5, m12780i(i2, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i2, MediaParser.InputReader inputReader) throws IOException {
        toq(i2);
        this.f21620n.f65451toq = inputReader;
        InterfaceC3401t qVar = this.f21619k.get(i2);
        if (qVar == null) {
            qVar = this.f21623s.toq(i2, -1);
            this.f21619k.set(i2, qVar);
        }
        qVar.toq(this.f21620n, (int) inputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        o1t zyVar;
        if (this.f21616g && this.f21621p == null) {
            this.f21621p = seekMap;
            return;
        }
        this.f65444ld6 = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        x2 x2Var = this.f21623s;
        if (this.f21618i) {
            if (durationMicros == -2147483648L) {
                durationMicros = C3548p.f65257toq;
            }
            zyVar = new o1t.toq(durationMicros);
        } else {
            zyVar = new zy(seekMap);
        }
        x2Var.cdj(zyVar);
    }

    public void onTrackCountFound(int i2) {
        this.f65442ki = true;
        qrj();
    }

    public void onTrackDataFound(int i2, MediaParser.TrackData trackData) {
        if (n7h(trackData.mediaFormat)) {
            return;
        }
        toq(i2);
        InterfaceC3401t interfaceC3401t = this.f21619k.get(i2);
        if (interfaceC3401t == null) {
            String string = trackData.mediaFormat.getString(f65436ni7);
            int iNi7 = ni7(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (iNi7 == this.f65441f7l8) {
                this.f21617h = i2;
            }
            InterfaceC3401t qVar = this.f21623s.toq(i2, iNi7);
            this.f21619k.set(i2, qVar);
            if (string != null) {
                return;
            } else {
                interfaceC3401t = qVar;
            }
        }
        xwq3 xwq3VarZurt = zurt(trackData);
        xwq3 xwq3Var = this.f21624y;
        interfaceC3401t.mo11931q((xwq3Var == null || i2 != this.f21617h) ? xwq3VarZurt : xwq3VarZurt.wvg(xwq3Var));
        this.f65448toq.set(i2, xwq3VarZurt);
        qrj();
    }

    @dd
    /* JADX INFO: renamed from: p */
    public xwq3[] m12787p() {
        if (!this.f65442ki) {
            return null;
        }
        xwq3[] xwq3VarArr = new xwq3[this.f65448toq.size()];
        for (int i2 = 0; i2 < this.f65448toq.size(); i2++) {
            xwq3VarArr[i2] = (xwq3) C3844k.f7l8(this.f65448toq.get(i2));
        }
        return xwq3VarArr;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public C3398q m12788q() {
        return this.f65446qrj;
    }

    public void t8r(C3847l c3847l) {
        this.f65445n7h = c3847l;
    }

    public C3618y(@dd xwq3 xwq3Var, int i2, boolean z2) {
        this.f21616g = z2;
        this.f21624y = xwq3Var;
        this.f65441f7l8 = i2;
        this.f21619k = new ArrayList<>();
        this.f65448toq = new ArrayList<>();
        this.f65450zy = new ArrayList<>();
        this.f21622q = new ArrayList<>();
        this.f21620n = new toq();
        this.f21623s = new C3430y();
        this.f65440cdj = C3548p.f65257toq;
        this.f65443kja0 = se.of();
    }
}
