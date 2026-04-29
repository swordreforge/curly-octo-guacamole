package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.core.view.n7h;
import androidx.exifinterface.media.toq;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.wvg;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.exifinterface.media.k */
/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes.dex */
public class C0846k {

    /* JADX INFO: renamed from: a */
    public static final String f4600a = "DateTimeOriginal";
    public static final short a3dw = 0;

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    public static final String f51205a5id = "GPSImgDirectionRef";
    static final byte a5rs = -1;
    public static final int a7zh = 0;
    public static final short a8p6 = 16;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f51206a9 = "PlanarConfiguration";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final String f51207a98o = "RelatedSoundFile";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final short f51208ab = 1;
    public static final String ae4 = "W";
    public static final int ahb = 0;
    public static final short alcv = 0;
    private static final Pattern an;
    public static final short anhx = 2;
    public static final short anw = 8;
    public static final short ap23 = 2;
    private static final int aq2a = 8;

    /* JADX INFO: renamed from: b */
    public static final String f4601b = "CompressedBitsPerPixel";
    public static final short b2 = 10;

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    public static final String f51209b3e = "Contrast";
    public static final short b6 = 2;

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final short f51210b7 = 2;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    public static final String f51211b8 = "GPSDestBearing";
    private static final int b972 = 3;

    /* JADX INFO: renamed from: b9ub, reason: collision with root package name */
    public static final String f51212b9ub = "GPSDestBearingRef";
    private static final int bao0 = 4;

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    public static final String f51213bap7 = "GPSStatus";
    public static final int bb = 1;
    private static final byte bbg = -54;

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    public static final String f51214bek6 = "Saturation";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final String f51215bf2 = "MakerNote";
    public static final short bf5 = 1;

    /* JADX INFO: renamed from: bih, reason: collision with root package name */
    public static final String f51216bih = "PreviewImageLength";
    public static final short bmt3 = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f51217bo = "ExposureTime";

    /* JADX INFO: renamed from: bqie, reason: collision with root package name */
    private static final String f51218bqie = "SubIFDPointer";
    public static final short brv = 3;

    /* JADX INFO: renamed from: btvn, reason: collision with root package name */
    public static final int f51219btvn = 2;
    private static final g[] bv;

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    public static final String f51220bwp = "CFAPattern";

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    public static final String f51221bz2 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: c */
    public static final String f4602c = "ImageDescription";
    public static final String c2 = "N";

    /* JADX INFO: renamed from: c25, reason: collision with root package name */
    public static final short f51222c25 = 2;
    private static final byte c4 = -63;
    private static final int c7g = 6;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final String f51223c8jq = "ExposureProgram";
    public static final String cb = "S";
    private static final int cc1 = 11;

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    public static final String f51224cfr = "SubjectLocation";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final String f51225ch = "OffsetTimeOriginal";

    @Deprecated
    public static final int cjaj = 1;

    /* JADX INFO: renamed from: cn02, reason: collision with root package name */
    public static final int f51226cn02 = 6;

    /* JADX INFO: renamed from: cnbm, reason: collision with root package name */
    public static final String f51227cnbm = "GPSDestLongitude";
    public static final String cp = "K";
    public static final short cr3 = 0;
    private static final HashMap<Integer, Integer> crha;
    private static final byte cun = -58;

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    public static final String f51228cv06 = "Sharpness";
    public static final int cyg = 0;

    /* JADX INFO: renamed from: cyoe, reason: collision with root package name */
    public static final String f51229cyoe = "ISO";

    /* JADX INFO: renamed from: d */
    public static final String f4603d = "StandardOutputSensitivity";

    /* JADX INFO: renamed from: d1ts, reason: collision with root package name */
    public static final short f51230d1ts = 2;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f51231d2ok = "RowsPerStrip";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f51232d3 = "YResolution";
    public static final short d6c = 4;
    public static final short d6od = 1;

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    public static final String f51233d8wk = "ExposureBiasValue";
    public static final String d9i = "E";
    public static final short dbf = 1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f51234dd = "JPEGInterchangeFormatLength";
    private static final HashMap<String, g>[] dhzo;
    private static SimpleDateFormat dmw0 = null;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final String f46168do = "LensModel";

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    @Deprecated
    public static final String f51235dr = "ISOSpeedRatings";
    public static final int drpy = 32773;
    static final int dwra = 2;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    public static final String f51236dxef = "GPSTrackRef";

    /* JADX INFO: renamed from: e */
    public static final String f4604e = "Artist";
    public static final short e4e = 23;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final String f51237e5 = "GPSSpeed";
    static final int e9 = 5;
    private static final int ebaq = 6;

    /* JADX INFO: renamed from: ebn, reason: collision with root package name */
    public static final String f51238ebn = "GPSVersionID";

    /* JADX INFO: renamed from: ec, reason: collision with root package name */
    public static final String f51239ec = "AspectFrame";
    static final int eh = 10;
    static final int ek = 8;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f51240ek5k = "PixelXDimension";
    public static final short eklw = 7;

    /* JADX INFO: renamed from: el, reason: collision with root package name */
    public static final String f51241el = "SubfileType";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f51242eqxt = "StripOffsets";
    public static final short erbd = 21;
    public static final short es7 = 0;

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    public static final String f51243etdu = "FocalPlaneYResolution";
    public static final short eu = 0;

    /* JADX INFO: renamed from: ew, reason: collision with root package name */
    public static final String f51244ew = "GPSProcessingMethod";
    private static final int ex76 = 13;

    /* JADX INFO: renamed from: exv8, reason: collision with root package name */
    public static final int f51245exv8 = 8;

    /* JADX INFO: renamed from: f */
    public static final String f4605f = "DateTime";
    private static final HashSet<String> f1;

    /* JADX INFO: renamed from: f1bi, reason: collision with root package name */
    private static final String f51246f1bi = "CameraSettingsIFDPointer";
    public static final short f26p = 0;

    /* JADX INFO: renamed from: f3f, reason: collision with root package name */
    public static final short f51247f3f = 4;

    /* JADX INFO: renamed from: f7z0, reason: collision with root package name */
    public static final short f51248f7z0 = 255;
    static final Charset fai;
    public static final short ff = 4;
    static final short ff8y = 18761;
    private static final int ffy = 9;

    /* JADX INFO: renamed from: fh, reason: collision with root package name */
    public static final short f51249fh = 0;
    static final g[][] fjcj;
    private static final int fm = 2;
    static final int fn9 = 13;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    public static final String f51250fnq8 = "ISOSpeedLatitudezzz";
    private static final int fpn = 7;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f51251fti = "YCbCrSubSampling";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f51252fu4 = "ImageWidth";
    public static final int fupf = 1;
    private static final Pattern fvqg;

    /* JADX INFO: renamed from: g0ad, reason: collision with root package name */
    private static final String f51253g0ad = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f51254g1 = "MaxApertureValue";
    private static final short g41 = 85;
    static final byte g6i = -39;
    private static final g[] g8;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    public static final String f51255ga = "GPSSpeedRef";

    /* JADX INFO: renamed from: gb, reason: collision with root package name */
    public static final int f51256gb = 1;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    public static final String f51257gbni = "MeteringMode";

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    public static final String f51258gc3c = "ExposureMode";

    /* JADX INFO: renamed from: gcp, reason: collision with root package name */
    public static final String f51259gcp = "GPSMapDatum";
    public static final short ge = 4;
    private static SimpleDateFormat gg7 = null;
    static final int gl8t = 0;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f51260gvn7 = "XResolution";
    public static final short gw = 1;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final String f51261gyi = "SpectralSensitivity";

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    public static final String f51262h4b = "GPSMeasureMode";
    static final int h4g = 6;

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    public static final String f51263h7am = "DeviceSettingDescription";
    private static final Pattern h8k;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f51264hb = "ExifVersion";
    private static final int hczd = 8192;
    static final int hfwa = 1;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f51266hyr = "ReferenceBlackWhite";
    static final byte hzl = -31;
    private static final int i0 = 9;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f51267i1 = "UserComment";

    /* JADX INFO: renamed from: i1an, reason: collision with root package name */
    public static final short f51268i1an = 3;

    /* JADX INFO: renamed from: i3x9, reason: collision with root package name */
    public static final short f51269i3x9 = 5;
    private static final int i8 = 8;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    public static final String f51270i9jn = "SubjectArea";
    public static final short ie = 0;

    /* JADX INFO: renamed from: ij, reason: collision with root package name */
    public static final String f51271ij = "GPSLatitude";

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final String f51272ikck = "SensitivityType";

    /* JADX INFO: renamed from: imd, reason: collision with root package name */
    private static final String f51273imd = "InteroperabilityIFDPointer";
    public static final short ip = 3;
    private static final byte irh = -51;
    static final int ivs = 9;
    public static final int iw = 2;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    public static final String f51274ix = "GPSAreaInformation";

    /* JADX INFO: renamed from: ixz, reason: collision with root package name */
    public static final String f51275ixz = "LensMake";
    public static final short iz = 6;
    public static final short izu = 1;

    /* JADX INFO: renamed from: j */
    public static final String f4606j = "FlashpixVersion";
    private static final int j1s = 4;
    public static final short j3y2 = 3;
    public static final short jb9 = 2;

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    @Deprecated
    public static final String f51276jbh = "CameraOwnerName";
    public static final int je1q = 34892;
    private static final Pattern jerf;
    public static final String jglj = "K";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f51277jk = "SamplesPerPixel";
    public static final short jog = 1;
    private static final int jp = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f51278jp0y = "YCbCrPositioning";
    public static final int jre = 7;
    private static final byte jut = -53;
    public static final short jyr = 2;

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    public static final String f51279jz5 = "SceneCaptureType";
    private static final int k2b8 = 12;
    public static final short k4jz = 18;

    /* JADX INFO: renamed from: kbj, reason: collision with root package name */
    public static final int f51280kbj = 0;

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    public static final String f51281kcsr = "SceneType";
    private static final int kho = 5;

    /* JADX INFO: renamed from: kiv, reason: collision with root package name */
    public static final String f51282kiv = "ThumbnailImage";
    public static final short kjd = 16;

    /* JADX INFO: renamed from: kl7m, reason: collision with root package name */
    public static final short f51283kl7m = 3;
    private static final byte km9o = 47;
    public static final short koj = 0;
    public static final short kq = 1;

    /* JADX INFO: renamed from: kq2f, reason: collision with root package name */
    public static final int f51284kq2f = 3;

    /* JADX INFO: renamed from: kt06, reason: collision with root package name */
    public static final short f51285kt06 = 1;

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    public static final String f51286ktq = "GainControl";

    /* JADX INFO: renamed from: kx3, reason: collision with root package name */
    public static final String f51287kx3 = "GPSDateStamp";

    /* JADX INFO: renamed from: kz28, reason: collision with root package name */
    public static final short f51288kz28 = 0;

    /* JADX INFO: renamed from: l */
    public static final String f4607l = "PrimaryChromaticities";
    public static final String l0 = "A";

    /* JADX INFO: renamed from: l05, reason: collision with root package name */
    public static final String f51289l05 = "SensorTopBorder";
    private static final int l0u = 3;
    public static final short l7o = 2;
    private static final int l92 = 5000;

    /* JADX INFO: renamed from: le7, reason: collision with root package name */
    public static final short f51290le7 = 5;
    public static final short lg4k = 2;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String f51291lh = "GPSSatellites";

    /* JADX INFO: renamed from: lk, reason: collision with root package name */
    public static final short f51292lk = 3;
    private static final int lm = 6;
    private static final g[] lm5;
    public static final short ln = 3;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f51293lrht = "Make";

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    public static final String f51294ltg8 = "FocalLength";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final String f51295lv5 = "SubSecTime";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f51296lvui = "StripByteCounts";

    /* JADX INFO: renamed from: lw, reason: collision with root package name */
    public static final String f51297lw = "GPSImgDirection";
    private static final byte lz = -57;

    /* JADX INFO: renamed from: m */
    public static final String f4608m = "Gamma";
    public static final short m28 = 17;

    /* JADX INFO: renamed from: m2t, reason: collision with root package name */
    public static final String f51298m2t = "GPSHPositioningError";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final String f51299m4 = "SpatialFrequencyResponse";
    private static final g[] m4ll;

    /* JADX INFO: renamed from: m58i, reason: collision with root package name */
    public static final String f51300m58i = "GPSDestLongitudeRef";

    /* JADX INFO: renamed from: m8, reason: collision with root package name */
    public static final short f51301m8 = 5;
    public static final int ma8k = 1;

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    public static final String f51302mbx = "ImageUniqueID";
    private static final int mc = 1;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f51303mcp = "Orientation";
    public static final short mete = 14;

    /* JADX INFO: renamed from: mi1u, reason: collision with root package name */
    public static final short f51304mi1u = 2;

    /* JADX INFO: renamed from: mj, reason: collision with root package name */
    public static final int f51305mj = 5;
    public static final String mkmm = "M";
    public static final short mla = 3;
    private static final byte mn = -62;
    public static final short mq = 1;
    private static final byte mqs = -64;
    private static final byte mru = -2;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    public static final String f51306mu = "RecommendedExposureIndex";

    /* JADX INFO: renamed from: mub, reason: collision with root package name */
    public static final short f51307mub = 6;
    static final int mv = 3;
    private static final int mxh = 84;

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    public static final String f51308n2t = "GPSAltitudeRef";
    private static final byte[] n358;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f51309n5r1 = "YCbCrCoefficients";
    public static final short nc = 20;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f51310ncyb = "WhitePoint";
    static final int ngvg = 7;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    public static final String f51311ngy = "GPSTimeStamp";
    private static final byte nm = -38;

    /* JADX INFO: renamed from: nme, reason: collision with root package name */
    public static final String f51313nme = "GPSDestDistanceRef";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final String f51314nmn5 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f51315nn86 = "Copyright";

    /* JADX INFO: renamed from: nnh, reason: collision with root package name */
    public static final String f51316nnh = "DNGVersion";
    public static final short nod = 24;
    static final int nrcs = 14;

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    public static final String f51317nsb = "GPSLongitudeRef";

    /* JADX INFO: renamed from: nyj, reason: collision with root package name */
    public static final short f51318nyj = 6;

    /* JADX INFO: renamed from: o */
    public static final String f4609o = "ColorSpace";

    /* JADX INFO: renamed from: o05, reason: collision with root package name */
    public static final String f51319o05 = "GPSDestLatitude";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f51320o1t = "BitsPerSample";

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final String f51321o5 = "SensorBottomBorder";
    public static final short oaex = 64;

    /* JADX INFO: renamed from: ob, reason: collision with root package name */
    private static final int f51322ob = 512;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f51323oc = "ResolutionUnit";
    public static final short oei = 1;

    /* JADX INFO: renamed from: oki, reason: collision with root package name */
    public static final String f51324oki = "GPSDestLatitudeRef";
    private static final int olj = 8;

    /* JADX INFO: renamed from: oph, reason: collision with root package name */
    public static final short f51325oph = 4;

    /* JADX INFO: renamed from: ovdh, reason: collision with root package name */
    public static final int f51326ovdh = 7;

    @Deprecated
    public static final int owi = 0;
    private static final byte p1t5 = -61;
    static final int p68f = 4;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    public static final String f51327pc = "GPSLatitudeRef";

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    public static final String f51328pjz9 = "GPSAltitude";

    /* JADX INFO: renamed from: pnt2, reason: collision with root package name */
    public static final short f51329pnt2 = 2;

    /* JADX INFO: renamed from: ps, reason: collision with root package name */
    public static final String f51330ps = "ThumbnailImageLength";

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    public static final String f51331py = "Flash";
    public static final int py7 = 8;
    public static final String qexj = "N";

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    public static final String f51333qkj8 = "ISOSpeedLatitudeyyy";
    public static final short qla = 32;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final String f51334qo = "ShutterSpeedValue";
    public static final short qppo = 0;
    static final int qspg = 12;
    private static final int qyk = 1;

    /* JADX INFO: renamed from: r */
    public static final String f4610r = "JPEGInterchangeFormat";

    /* JADX INFO: renamed from: r25n, reason: collision with root package name */
    public static final String f51335r25n = "GPSDestDistance";

    /* JADX INFO: renamed from: r6ty, reason: collision with root package name */
    public static final String f51336r6ty = "JpgFromRaw";
    private static final int r8k = 19;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    public static final String f51337r8s8 = "FlashEnergy";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String f51338ra = "ThumbnailOrientation";
    public static final short rf = 255;
    public static final String rig = "V";
    private static final short rlj = 21330;

    /* JADX INFO: renamed from: rp, reason: collision with root package name */
    public static final String f51339rp = "SensorRightBorder";
    private static final int rq = 10;
    public static final short s31 = 2;
    private static final int s9de = 4;
    public static final short sb = 5;
    public static final short sb1e = 13;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    public static final short f51340sc = 1;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    public static final String f51341se = "CustomRendered";
    public static final short sj = 1;
    public static final String sm = "3";

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    public static final String f51342sok = "FocalPlaneResolutionUnit";

    /* JADX INFO: renamed from: t */
    public static final String f4611t = "PhotometricInterpretation";
    private static final byte t57j = -59;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final String f51343t8iq = "SubSecTimeOriginal";
    private static final g[] td;
    static final short te = 19789;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    public static final String f51344tfm = "ApertureValue";
    private static final byte thtw = -49;

    /* JADX INFO: renamed from: tjz5, reason: collision with root package name */
    public static final short f51345tjz5 = 3;

    /* JADX INFO: renamed from: tww7, reason: collision with root package name */
    private static final String f51346tww7 = "ImageProcessingIFDPointer";

    /* JADX INFO: renamed from: u */
    public static final String f4612u = "SubSecTimeDigitized";
    private static final String u0z = "PENTAX";

    /* JADX INFO: renamed from: u38j, reason: collision with root package name */
    public static final String f51347u38j = "InteroperabilityIndex";
    static final int u3gu = 11;
    static final int u4 = 0;

    /* JADX INFO: renamed from: uc, reason: collision with root package name */
    public static final String f51348uc = "BodySerialNumber";
    private static final HashMap<Integer, g>[] ue;
    private static final int uew = 10;

    /* JADX INFO: renamed from: uf, reason: collision with root package name */
    public static final String f51349uf = "DefaultCropSize";

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    public static final String f51350uj2j = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: ukdy, reason: collision with root package name */
    public static final String f51351ukdy = "LensSerialNumber";

    /* JADX INFO: renamed from: ula6, reason: collision with root package name */
    public static final short f51352ula6 = 6;

    /* JADX INFO: renamed from: uo, reason: collision with root package name */
    public static final short f51353uo = 4;
    public static final short uv = 24;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f51354uv6 = "Model";

    /* JADX INFO: renamed from: v */
    public static final String f4613v = "OECF";

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    public static final String f51355v0af = "FocalPlaneXResolution";

    /* JADX INFO: renamed from: v5yj, reason: collision with root package name */
    public static final String f51356v5yj = "ThumbnailImageWidth";
    public static final short vahq = 8;
    public static final short vc = 0;
    private static final byte vd = -50;
    public static final short vddr = 3;

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    public static final String f51357vep5 = "SubjectDistanceRange";
    public static final short verb = 2;
    private static final g vf;
    public static final short vg = 19;
    public static final short vh = 1;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    public static final String f51358vq = "ISOSpeed";

    /* JADX INFO: renamed from: vss1, reason: collision with root package name */
    public static final short f51359vss1 = 7;

    /* JADX INFO: renamed from: vwb, reason: collision with root package name */
    public static final short f51360vwb = 2;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    public static final String f51361vy = "GPSTrack";
    public static final int vymi = 6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f51362vyq = "Software";

    /* JADX INFO: renamed from: w */
    public static final String f4614w = "GPSDifferential";
    private static final g[] w0;
    private static final g[] w2bz;
    static final int w6w4 = 5;

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    public static final String f51363w831 = "ExposureIndex";

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    public static final String f51364was = "SubjectDistance";
    private static final String wen = "FUJIFILMCCD-RAW";
    public static final int wh = 2;
    public static final int wkrb = 6;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    public static final String f51365wlev = "GPSDOP";

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    public static final String f51366wo = "BrightnessValue";
    private static final g[] wqg;
    public static final String wqp = "M";

    /* JADX INFO: renamed from: wt, reason: collision with root package name */
    private static final String f51367wt = "ExifIFDPointer";
    private static final int wtm = 12;

    /* JADX INFO: renamed from: wtop, reason: collision with root package name */
    public static final short f51368wtop = 0;
    public static final short wu = 4;
    private static final byte wutb = -55;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f51369wvg = "Compression";

    /* JADX INFO: renamed from: wwp, reason: collision with root package name */
    public static final short f51370wwp = 7;

    /* JADX INFO: renamed from: wx16, reason: collision with root package name */
    public static final String f51371wx16 = "LensSpecification";

    /* JADX INFO: renamed from: x */
    public static final String f4615x = "OffsetTime";
    public static final short x3b = 0;
    public static final short x7o = 11;
    private static final int x8 = 4;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f51372x9kr = "TransferFunction";

    /* JADX INFO: renamed from: xblq, reason: collision with root package name */
    public static final short f51373xblq = 1;
    private static final short xh = 20306;

    /* JADX INFO: renamed from: xm, reason: collision with root package name */
    public static final int f51374xm = 4;
    public static final int xnu = 1;
    public static final String xo = "N";
    public static final short xouc = 1;

    /* JADX INFO: renamed from: xtb7, reason: collision with root package name */
    public static final short f51375xtb7 = 1;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final String f51376xwq3 = "PhotographicSensitivity";
    private static final g[] xx;

    /* JADX INFO: renamed from: xzl, reason: collision with root package name */
    public static final int f51377xzl = 65535;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f51378y2 = "FNumber";
    public static final short y3 = 0;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f51379y9n = "ComponentsConfiguration";
    public static final String ybb = "M";
    public static final short ydj3 = 0;
    private static final g[] yh8z;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    public static final String f51380yl = "CameraOwnerName";
    private static final int ym = 8;
    static final byte[] ym8;

    /* JADX INFO: renamed from: yp31, reason: collision with root package name */
    public static final String f51381yp31 = "Xmp";

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    public static final String f51382yqrt = "FileSource";
    private static final int yvs = 4;

    /* JADX INFO: renamed from: yw, reason: collision with root package name */
    public static final String f51383yw = "SensorLeftBorder";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f51384yz = "PixelYDimension";

    /* JADX INFO: renamed from: z */
    public static final String f4616z = "ImageLength";
    public static final short z1r = 1;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final String f51385z4 = "SensingMethod";

    /* JADX INFO: renamed from: z4j7, reason: collision with root package name */
    public static final short f51386z4j7 = 8;

    /* JADX INFO: renamed from: z4t, reason: collision with root package name */
    public static final String f51387z4t = "PreviewImageStart";
    public static final short z5 = 9;

    /* JADX INFO: renamed from: z617, reason: collision with root package name */
    public static final int f51388z617 = 1;
    public static final short z8 = 12;
    public static final short zah1 = 1;
    private static final int zalf = 7;
    public static final String zaso = "T";
    static final int zc = 4;

    /* JADX INFO: renamed from: zff0, reason: collision with root package name */
    public static final String f51389zff0 = "NewSubfileType";
    public static final String zi4o = "2";
    private static final int zidq = 4;

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    public static final String f51390zkd = "WhiteBalance";
    public static final short zma = 15;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final String f51391zp = "DateTimeDigitized";

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    public static final String f51392zsr0 = "LightSource";
    public static final short zt = 1;

    /* JADX INFO: renamed from: zuf, reason: collision with root package name */
    public static final short f51393zuf = 0;

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    public static final String f51395zwy = "GPSLongitude";
    public static final short zxq = 22;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f51396cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Set<Integer> f51397f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f51398fn3e;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, q>[] f4617g;

    /* JADX INFO: renamed from: h */
    private int f4618h;

    /* JADX INFO: renamed from: i */
    private boolean f4619i;

    /* JADX INFO: renamed from: k */
    private String f4620k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f51399ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f51400kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f51401ld6;

    /* JADX INFO: renamed from: n */
    private boolean f4621n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private byte[] f51402n7h;

    /* JADX INFO: renamed from: p */
    private boolean f4622p;

    /* JADX INFO: renamed from: q */
    private int f4623q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f51403qrj;

    /* JADX INFO: renamed from: s */
    private boolean f4624s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f51404t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private FileDescriptor f51405toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f51406x2;

    /* JADX INFO: renamed from: y */
    private ByteOrder f4625y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private AssetManager.AssetInputStream f51407zy;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f51394zurt = "ExifInterface";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final boolean f51312ni7 = Log.isLoggable(f51394zurt, 3);

    /* JADX INFO: renamed from: qh4d, reason: collision with root package name */
    private static final List<Integer> f51332qh4d = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: hyow, reason: collision with root package name */
    private static final List<Integer> f51265hyow = Arrays.asList(2, 7, 4, 5);
    public static final int[] zxa9 = {8, 8, 8};
    public static final int[] p6 = {4};
    public static final int[] b3fl = {8};
    private static final byte rb7 = -40;
    static final byte[] pi = {-1, rb7, -1};
    private static final byte[] p996 = {102, 116, 121, 112};
    private static final byte[] is = {109, 105, 102, 49};
    private static final byte[] e9s = {104, 101, 105, 99};
    private static final byte[] fbr = {79, 76, 89, 77, 80, 0};
    private static final byte[] j3px = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] wr = {-119, 80, 78, 71, com.google.common.base.zy.f68124kja0, 10, com.google.common.base.zy.f68121jk, 10};
    private static final byte[] le9 = {101, 88, 73, 102};
    private static final byte[] krto = {73, 72, 68, 82};
    private static final byte[] xzk4 = {73, 69, 78, 68};
    private static final byte[] t8fp = {82, 73, 70, 70};
    private static final byte[] dm = {87, 69, 66, 80};
    private static final byte[] tvn8 = {69, 88, 73, 70};
    static final byte t8o = 42;
    private static final byte[] ze = {-99, 1, t8o};
    private static final byte[] li5y = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] a4ph = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] xknm = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] b6i9 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] bp = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] twzk = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] y84 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] fq = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$f7l8 */
    /* JADX INFO: compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$k */
    /* JADX INFO: compiled from: ExifInterface.java */
    class k extends MediaDataSource {

        /* JADX INFO: renamed from: k */
        long f4628k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ s f4630q;

        k(s sVar) {
            this.f4630q = sVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
            if (i3 == 0) {
                return 0;
            }
            if (j2 < 0) {
                return -1;
            }
            try {
                long j3 = this.f4628k;
                if (j3 != j2) {
                    if (j3 >= 0 && j2 >= j3 + ((long) this.f4630q.available())) {
                        return -1;
                    }
                    this.f4630q.zy(j2);
                    this.f4628k = j2;
                }
                if (i3 > this.f4630q.available()) {
                    i3 = this.f4630q.available();
                }
                int i4 = this.f4630q.read(bArr, i2, i3);
                if (i4 >= 0) {
                    this.f4628k += (long) i4;
                    return i4;
                }
            } catch (IOException unused) {
            }
            this.f4628k = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$n */
    /* JADX INFO: compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface n {
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$q */
    /* JADX INFO: compiled from: ExifInterface.java */
    private static class q {

        /* JADX INFO: renamed from: n */
        public static final long f4631n = -1;

        /* JADX INFO: renamed from: k */
        public final int f4632k;

        /* JADX INFO: renamed from: q */
        public final byte[] f4633q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f51410toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f51411zy;

        q(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1L, bArr);
        }

        public static q f7l8(y[] yVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[10] * yVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (y yVar : yVarArr) {
                byteBufferWrap.putInt((int) yVar.f4640k);
                byteBufferWrap.putInt((int) yVar.f51412toq);
            }
            return new q(10, yVarArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: g */
        public static q m4151g(y yVar, ByteOrder byteOrder) {
            return f7l8(new y[]{yVar}, byteOrder);
        }

        /* JADX INFO: renamed from: k */
        public static q m4152k(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new q(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C0846k.fai);
            return new q(1, bytes.length, bytes);
        }

        public static q ld6(y yVar, ByteOrder byteOrder) {
            return x2(new y[]{yVar}, byteOrder);
        }

        /* JADX INFO: renamed from: n */
        public static q m4153n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i2 : iArr) {
                byteBufferWrap.putInt(i2);
            }
            return new q(9, iArr.length, byteBufferWrap.array());
        }

        public static q n7h(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i2 : iArr) {
                byteBufferWrap.putShort((short) i2);
            }
            return new q(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: p */
        public static q m4154p(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j2 : jArr) {
                byteBufferWrap.putInt((int) j2);
            }
            return new q(4, jArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: q */
        public static q m4155q(int i2, ByteOrder byteOrder) {
            return m4153n(new int[]{i2}, byteOrder);
        }

        public static q qrj(int i2, ByteOrder byteOrder) {
            return n7h(new int[]{i2}, byteOrder);
        }

        /* JADX INFO: renamed from: s */
        public static q m4156s(long j2, ByteOrder byteOrder) {
            return m4154p(new long[]{j2}, byteOrder);
        }

        public static q toq(double d2, ByteOrder byteOrder) {
            return zy(new double[]{d2}, byteOrder);
        }

        public static q x2(y[] yVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[5] * yVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (y yVar : yVarArr) {
                byteBufferWrap.putInt((int) yVar.f4640k);
                byteBufferWrap.putInt((int) yVar.f51412toq);
            }
            return new q(5, yVarArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: y */
        public static q m4157y(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C0846k.fai);
            return new q(2, bytes.length, bytes);
        }

        public static q zy(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0846k.y84[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d2 : dArr) {
                byteBufferWrap.putDouble(d2);
            }
            return new q(12, dArr.length, byteBufferWrap.array());
        }

        public String cdj(ByteOrder byteOrder) throws Throwable {
            Object objKi = ki(byteOrder);
            if (objKi == null) {
                return null;
            }
            if (objKi instanceof String) {
                return (String) objKi;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (objKi instanceof long[]) {
                long[] jArr = (long[]) objKi;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objKi instanceof int[]) {
                int[] iArr = (int[]) objKi;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objKi instanceof double[]) {
                double[] dArr = (double[]) objKi;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objKi instanceof y[])) {
                return null;
            }
            y[] yVarArr = (y[]) objKi;
            while (i2 < yVarArr.length) {
                sb.append(yVarArr[i2].f4640k);
                sb.append('/');
                sb.append(yVarArr[i2].f51412toq);
                i2++;
                if (i2 != yVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: h */
        public int m4158h(ByteOrder byteOrder) throws Throwable {
            Object objKi = ki(byteOrder);
            if (objKi == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objKi instanceof String) {
                return Integer.parseInt((String) objKi);
            }
            if (objKi instanceof long[]) {
                long[] jArr = (long[]) objKi;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objKi instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objKi;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:409), block:B:151:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object ki(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.q.ki(java.nio.ByteOrder):java.lang.Object");
        }

        public double kja0(ByteOrder byteOrder) throws Throwable {
            Object objKi = ki(byteOrder);
            if (objKi == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objKi instanceof String) {
                return Double.parseDouble((String) objKi);
            }
            if (objKi instanceof long[]) {
                if (((long[]) objKi).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objKi instanceof int[]) {
                if (((int[]) objKi).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objKi instanceof double[]) {
                double[] dArr = (double[]) objKi;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objKi instanceof y[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            y[] yVarArr = (y[]) objKi;
            if (yVarArr.length == 1) {
                return yVarArr[0].m4162k();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int t8r() {
            return C0846k.y84[this.f4632k] * this.f51410toq;
        }

        public String toString() {
            return "(" + C0846k.twzk[this.f4632k] + ", data length:" + this.f4633q.length + ")";
        }

        q(int i2, int i3, long j2, byte[] bArr) {
            this.f4632k = i2;
            this.f51410toq = i3;
            this.f51411zy = j2;
            this.f4633q = bArr;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$toq */
    /* JADX INFO: compiled from: ExifInterface.java */
    private static class toq extends InputStream implements DataInput {

        /* JADX INFO: renamed from: g */
        private byte[] f4636g;

        /* JADX INFO: renamed from: k */
        final DataInputStream f4637k;

        /* JADX INFO: renamed from: n */
        int f4638n;

        /* JADX INFO: renamed from: q */
        private ByteOrder f4639q;

        /* JADX INFO: renamed from: y */
        private static final ByteOrder f4635y = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: s */
        private static final ByteOrder f4634s = ByteOrder.BIG_ENDIAN;

        toq(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f4637k.available();
        }

        public void ld6(int i2) throws IOException {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int iSkip = (int) this.f4637k.skip(i4);
                if (iSkip <= 0) {
                    if (this.f4636g == null) {
                        this.f4636g = new byte[8192];
                    }
                    iSkip = this.f4637k.read(this.f4636g, 0, Math.min(8192, i4));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                    }
                }
                i3 += iSkip;
            }
            this.f4638n += i3;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* JADX INFO: renamed from: p */
        public void m4159p(ByteOrder byteOrder) {
            this.f4639q = byteOrder;
        }

        /* JADX INFO: renamed from: q */
        public int m4160q() {
            return this.f4638n;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f4638n++;
            return this.f4637k.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f4638n++;
            return this.f4637k.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f4638n++;
            int i2 = this.f4637k.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f4638n += 2;
            return this.f4637k.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.f4638n += i3;
            this.f4637k.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f4638n += 4;
            int i2 = this.f4637k.read();
            int i3 = this.f4637k.read();
            int i4 = this.f4637k.read();
            int i5 = this.f4637k.read();
            if ((i2 | i3 | i4 | i5) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4639q;
            if (byteOrder == f4635y) {
                return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == f4634s) {
                return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
            }
            throw new IOException("Invalid byte order: " + this.f4639q);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(C0846k.f51394zurt, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f4638n += 8;
            int i2 = this.f4637k.read();
            int i3 = this.f4637k.read();
            int i4 = this.f4637k.read();
            int i5 = this.f4637k.read();
            int i6 = this.f4637k.read();
            int i7 = this.f4637k.read();
            int i8 = this.f4637k.read();
            int i9 = this.f4637k.read();
            if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4639q;
            if (byteOrder == f4635y) {
                return (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8) + ((long) i2);
            }
            if (byteOrder == f4634s) {
                return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8) + ((long) i9);
            }
            throw new IOException("Invalid byte order: " + this.f4639q);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f4638n += 2;
            int i2 = this.f4637k.read();
            int i3 = this.f4637k.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4639q;
            if (byteOrder == f4635y) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == f4634s) {
                return (short) ((i2 << 8) + i3);
            }
            throw new IOException("Invalid byte order: " + this.f4639q);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f4638n += 2;
            return this.f4637k.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f4638n++;
            return this.f4637k.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f4638n += 2;
            int i2 = this.f4637k.read();
            int i3 = this.f4637k.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4639q;
            if (byteOrder == f4635y) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == f4634s) {
                return (i2 << 8) + i3;
            }
            throw new IOException("Invalid byte order: " + this.f4639q);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX INFO: renamed from: y */
        public long m4161y() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        toq(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        toq(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f4639q = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4637k = dataInputStream;
            dataInputStream.mark(0);
            this.f4638n = 0;
            this.f4639q = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f4637k.read(bArr, i2, i3);
            this.f4638n += i4;
            return i4;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f4638n += bArr.length;
            this.f4637k.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$y */
    /* JADX INFO: compiled from: ExifInterface.java */
    private static class y {

        /* JADX INFO: renamed from: k */
        public final long f4640k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f51412toq;

        y(double d2) {
            this((long) (d2 * 10000.0d), 10000L);
        }

        /* JADX INFO: renamed from: k */
        public double m4162k() {
            return this.f4640k / this.f51412toq;
        }

        public String toString() {
            return this.f4640k + "/" + this.f51412toq;
        }

        y(long j2, long j3) {
            if (j3 == 0) {
                this.f4640k = 0L;
                this.f51412toq = 1L;
            } else {
                this.f4640k = j2;
                this.f51412toq = j3;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$zy */
    /* JADX INFO: compiled from: ExifInterface.java */
    private static class zy extends FilterOutputStream {

        /* JADX INFO: renamed from: k */
        final OutputStream f4641k;

        /* JADX INFO: renamed from: q */
        private ByteOrder f4642q;

        public zy(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4641k = outputStream;
            this.f4642q = byteOrder;
        }

        /* JADX INFO: renamed from: k */
        public void m4163k(ByteOrder byteOrder) {
            this.f4642q = byteOrder;
        }

        public void ld6(int i2) throws IOException {
            m4166y((short) i2);
        }

        /* JADX INFO: renamed from: p */
        public void m4164p(long j2) throws IOException {
            m4165q((int) j2);
        }

        /* JADX INFO: renamed from: q */
        public void m4165q(int i2) throws IOException {
            ByteOrder byteOrder = this.f4642q;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4641k.write((i2 >>> 0) & 255);
                this.f4641k.write((i2 >>> 8) & 255);
                this.f4641k.write((i2 >>> 16) & 255);
                this.f4641k.write((i2 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4641k.write((i2 >>> 24) & 255);
                this.f4641k.write((i2 >>> 16) & 255);
                this.f4641k.write((i2 >>> 8) & 255);
                this.f4641k.write((i2 >>> 0) & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f4641k.write(bArr);
        }

        /* JADX INFO: renamed from: y */
        public void m4166y(short s2) throws IOException {
            ByteOrder byteOrder = this.f4642q;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4641k.write((s2 >>> 0) & 255);
                this.f4641k.write((s2 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4641k.write((s2 >>> 8) & 255);
                this.f4641k.write((s2 >>> 0) & 255);
            }
        }

        public void zy(int i2) throws IOException {
            this.f4641k.write(i2);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f4641k.write(bArr, i2, i3);
        }
    }

    static {
        g[] gVarArr = {new g(f51389zff0, 254, 4), new g(f51241el, 255, 4), new g(f51252fu4, 256, 3, 4), new g(f4616z, 257, 3, 4), new g(f51320o1t, 258, 3), new g(f51369wvg, 259, 3), new g(f4611t, 262, 3), new g(f4602c, 270, 2), new g(f51293lrht, 271, 2), new g(f51354uv6, 272, 2), new g(f51242eqxt, 273, 3, 4), new g(f51303mcp, 274, 3), new g(f51277jk, 277, 3), new g(f51231d2ok, 278, 3, 4), new g(f51296lvui, 279, 3, 4), new g(f51260gvn7, 282, 5), new g(f51232d3, 283, 5), new g(f51206a9, 284, 3), new g(f51323oc, 296, 3), new g(f51372x9kr, 301, 3), new g(f51362vyq, 305, 2), new g("DateTime", 306, 2), new g(f4604e, 315, 2), new g(f51310ncyb, zurt.InterfaceC0290k.f47423t8r, 5), new g(f4607l, 319, 5), new g(f51218bqie, 330, 4), new g(f4610r, n7h.f4072p, 4), new g(f51234dd, 514, 4), new g(f51309n5r1, 529, 5), new g(f51251fti, 530, 3), new g(f51278jp0y, 531, 3), new g(f51266hyr, 532, 5), new g(f51315nn86, 33432, 2), new g(f51367wt, 34665, 4), new g(f51253g0ad, 34853, 4), new g(f51289l05, 4, 4), new g(f51383yw, 5, 4), new g(f51321o5, 6, 4), new g(f51339rp, 7, 4), new g(f51229cyoe, 23, 3), new g(f51336r6ty, 46, 7), new g(f51381yp31, zurt.InterfaceC0294y.f1767p, 1)};
        yh8z = gVarArr;
        g[] gVarArr2 = {new g(f51217bo, 33434, 5), new g(f51378y2, 33437, 5), new g(f51223c8jq, 34850, 3), new g(f51261gyi, 34852, 2), new g(f51376xwq3, 34855, 3), new g(f4613v, 34856, 7), new g(f51272ikck, 34864, 3), new g(f4603d, 34865, 4), new g(f51306mu, 34866, 4), new g(f51358vq, 34867, 4), new g(f51333qkj8, 34868, 4), new g(f51250fnq8, 34869, 4), new g(f51264hb, 36864, 2), new g(f4600a, 36867, 2), new g(f51391zp, 36868, 2), new g(f4615x, 36880, 2), new g(f51225ch, 36881, 2), new g(f51314nmn5, 36882, 2), new g(f51379y9n, 37121, 7), new g(f4601b, 37122, 5), new g(f51334qo, 37377, 10), new g(f51344tfm, 37378, 5), new g(f51366wo, 37379, 10), new g(f51233d8wk, 37380, 10), new g(f51254g1, 37381, 5), new g(f51364was, 37382, 5), new g(f51257gbni, 37383, 3), new g(f51392zsr0, 37384, 3), new g(f51331py, 37385, 3), new g(f51294ltg8, 37386, 5), new g(f51270i9jn, 37396, 3), new g(f51215bf2, 37500, 7), new g(f51267i1, 37510, 7), new g(f51295lv5, 37520, 2), new g(f51343t8iq, 37521, 2), new g(f4612u, 37522, 2), new g(f4606j, 40960, 7), new g(f4609o, 40961, 3), new g(f51240ek5k, 40962, 3, 4), new g(f51384yz, 40963, 3, 4), new g(f51207a98o, 40964, 2), new g(f51273imd, 40965, 4), new g(f51337r8s8, 41483, 5), new g(f51299m4, 41484, 7), new g(f51355v0af, 41486, 5), new g(f51243etdu, 41487, 5), new g(f51342sok, 41488, 3), new g(f51224cfr, 41492, 3), new g(f51363w831, 41493, 5), new g(f51385z4, 41495, 3), new g(f51382yqrt, 41728, 7), new g(f51281kcsr, 41729, 7), new g(f51220bwp, 41730, 7), new g(f51341se, 41985, 3), new g(f51258gc3c, 41986, 3), new g(f51390zkd, 41987, 3), new g(f51221bz2, 41988, 5), new g(f51350uj2j, 41989, 3), new g(f51279jz5, 41990, 3), new g(f51286ktq, 41991, 3), new g(f51209b3e, 41992, 3), new g(f51214bek6, 41993, 3), new g(f51228cv06, 41994, 3), new g(f51263h7am, 41995, 7), new g(f51357vep5, 41996, 3), new g(f51302mbx, 42016, 2), new g("CameraOwnerName", 42032, 2), new g(f51348uc, 42033, 2), new g(f51371wx16, 42034, 5), new g(f51275ixz, 42035, 2), new g(f46168do, 42036, 2), new g(f4608m, 42240, 5), new g(f51316nnh, 50706, 1), new g(f51349uf, 50720, 3, 4)};
        lm5 = gVarArr2;
        g[] gVarArr3 = {new g(f51238ebn, 0, 1), new g(f51327pc, 1, 2), new g(f51271ij, 2, 5, 10), new g(f51317nsb, 3, 2), new g(f51395zwy, 4, 5, 10), new g(f51308n2t, 5, 1), new g(f51328pjz9, 6, 5), new g(f51311ngy, 7, 5), new g(f51291lh, 8, 2), new g(f51213bap7, 9, 2), new g(f51262h4b, 10, 2), new g(f51365wlev, 11, 5), new g(f51255ga, 12, 2), new g(f51237e5, 13, 5), new g(f51236dxef, 14, 2), new g(f51361vy, 15, 5), new g(f51205a5id, 16, 2), new g(f51297lw, 17, 5), new g(f51259gcp, 18, 2), new g(f51324oki, 19, 2), new g(f51319o05, 20, 5), new g(f51300m58i, 21, 2), new g(f51227cnbm, 22, 5), new g(f51212b9ub, 23, 2), new g(f51211b8, 24, 5), new g(f51313nme, 25, 2), new g(f51335r25n, 26, 5), new g(f51244ew, 27, 7), new g(f51274ix, 28, 7), new g(f51287kx3, 29, 2), new g(f4614w, 30, 3), new g(f51298m2t, 31, 5)};
        g8 = gVarArr3;
        g[] gVarArr4 = {new g(f51347u38j, 1, 2)};
        wqg = gVarArr4;
        g[] gVarArr5 = {new g(f51389zff0, 254, 4), new g(f51241el, 255, 4), new g(f51356v5yj, 256, 3, 4), new g(f51330ps, 257, 3, 4), new g(f51320o1t, 258, 3), new g(f51369wvg, 259, 3), new g(f4611t, 262, 3), new g(f4602c, 270, 2), new g(f51293lrht, 271, 2), new g(f51354uv6, 272, 2), new g(f51242eqxt, 273, 3, 4), new g(f51338ra, 274, 3), new g(f51277jk, 277, 3), new g(f51231d2ok, 278, 3, 4), new g(f51296lvui, 279, 3, 4), new g(f51260gvn7, 282, 5), new g(f51232d3, 283, 5), new g(f51206a9, 284, 3), new g(f51323oc, 296, 3), new g(f51372x9kr, 301, 3), new g(f51362vyq, 305, 2), new g("DateTime", 306, 2), new g(f4604e, 315, 2), new g(f51310ncyb, zurt.InterfaceC0290k.f47423t8r, 5), new g(f4607l, 319, 5), new g(f51218bqie, 330, 4), new g(f4610r, n7h.f4072p, 4), new g(f51234dd, 514, 4), new g(f51309n5r1, 529, 5), new g(f51251fti, 530, 3), new g(f51278jp0y, 531, 3), new g(f51266hyr, 532, 5), new g(f51315nn86, 33432, 2), new g(f51367wt, 34665, 4), new g(f51253g0ad, 34853, 4), new g(f51316nnh, 50706, 1), new g(f51349uf, 50720, 3, 4)};
        bv = gVarArr5;
        vf = new g(f51242eqxt, 273, 3);
        g[] gVarArr6 = {new g(f51282kiv, 256, 7), new g(f51246f1bi, 8224, 4), new g(f51346tww7, 8256, 4)};
        xx = gVarArr6;
        g[] gVarArr7 = {new g(f51387z4t, 257, 4), new g(f51216bih, 258, 4)};
        w0 = gVarArr7;
        g[] gVarArr8 = {new g(f51239ec, 4371, 3)};
        td = gVarArr8;
        g[] gVarArr9 = {new g(f4609o, 55, 3)};
        w2bz = gVarArr9;
        g[][] gVarArr10 = {gVarArr, gVarArr2, gVarArr3, gVarArr4, gVarArr5, gVarArr, gVarArr6, gVarArr7, gVarArr8, gVarArr9};
        fjcj = gVarArr10;
        m4ll = new g[]{new g(f51218bqie, 330, 4), new g(f51367wt, 34665, 4), new g(f51253g0ad, 34853, 4), new g(f51273imd, 40965, 4), new g(f51246f1bi, 8224, 1), new g(f51346tww7, 8256, 1)};
        ue = new HashMap[gVarArr10.length];
        dhzo = new HashMap[gVarArr10.length];
        f1 = new HashSet<>(Arrays.asList(f51378y2, f51221bz2, f51217bo, f51364was, f51311ngy));
        crha = new HashMap<>();
        Charset charsetForName = Charset.forName(C3548p.f65246qrj);
        fai = charsetForName;
        ym8 = "Exif\u0000\u0000".getBytes(charsetForName);
        n358 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        dmw0 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        gg7 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            g[][] gVarArr11 = fjcj;
            if (i2 >= gVarArr11.length) {
                HashMap<Integer, Integer> map = crha;
                g[] gVarArr12 = m4ll;
                map.put(Integer.valueOf(gVarArr12[0].f4626k), 5);
                map.put(Integer.valueOf(gVarArr12[1].f4626k), 1);
                map.put(Integer.valueOf(gVarArr12[2].f4626k), 2);
                map.put(Integer.valueOf(gVarArr12[3].f4626k), 3);
                map.put(Integer.valueOf(gVarArr12[4].f4626k), 7);
                map.put(Integer.valueOf(gVarArr12[5].f4626k), 8);
                an = Pattern.compile(".*[1-9].*");
                fvqg = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                h8k = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                jerf = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            ue[i2] = new HashMap<>();
            dhzo[i2] = new HashMap<>();
            for (g gVar : gVarArr11[i2]) {
                ue[i2].put(Integer.valueOf(gVar.f4626k), gVar);
                dhzo[i2].put(gVar.f51408toq, gVar);
            }
            i2++;
        }
    }

    public C0846k(@lvui File file) throws Throwable {
        g[][] gVarArr = fjcj;
        this.f4617g = new HashMap[gVarArr.length];
        this.f51397f7l8 = new HashSet(gVarArr.length);
        this.f4625y = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        dd(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: a */
    private void m4125a(int i2, String str, String str2) {
        if (this.f4617g[i2].isEmpty() || this.f4617g[i2].get(str) == null) {
            return;
        }
        HashMap<String, q> map = this.f4617g[i2];
        map.put(str2, map.get(str));
        this.f4617g[i2].remove(str);
    }

    private void a98o(String str) {
        for (int i2 = 0; i2 < fjcj.length; i2++) {
            this.f4617g[i2].remove(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private ByteOrder m4126b(toq toqVar) throws IOException {
        short s2 = toqVar.readShort();
        if (s2 == 18761) {
            if (f51312ni7) {
                Log.d(f51394zurt, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            if (f51312ni7) {
                Log.d(f51394zurt, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    private void bf2(byte[] bArr, int i2) throws IOException {
        s sVar = new s(bArr);
        yz(sVar);
        i1(sVar, i2);
    }

    /* JADX INFO: renamed from: c */
    private boolean m4127c(byte[] bArr) throws IOException {
        byte[] bytes = wen.getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    @dd
    private q cdj(@lvui String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f51235dr.equals(str)) {
            if (f51312ni7) {
                Log.d(f51394zurt, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f51376xwq3;
        }
        for (int i2 = 0; i2 < fjcj.length; i2++) {
            q qVar = this.f4617g[i2].get(str);
            if (qVar != null) {
                return qVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m4128d(s sVar, int i2) throws Throwable {
        q qVarQrj;
        q qVarQrj2;
        q qVar = this.f4617g[i2].get(f51349uf);
        q qVar2 = this.f4617g[i2].get(f51289l05);
        q qVar3 = this.f4617g[i2].get(f51383yw);
        q qVar4 = this.f4617g[i2].get(f51321o5);
        q qVar5 = this.f4617g[i2].get(f51339rp);
        if (qVar == null) {
            if (qVar2 == null || qVar3 == null || qVar4 == null || qVar5 == null) {
                m4140x(sVar, i2);
                return;
            }
            int iM4158h = qVar2.m4158h(this.f4625y);
            int iM4158h2 = qVar4.m4158h(this.f4625y);
            int iM4158h3 = qVar5.m4158h(this.f4625y);
            int iM4158h4 = qVar3.m4158h(this.f4625y);
            if (iM4158h2 <= iM4158h || iM4158h3 <= iM4158h4) {
                return;
            }
            q qVarQrj3 = q.qrj(iM4158h2 - iM4158h, this.f4625y);
            q qVarQrj4 = q.qrj(iM4158h3 - iM4158h4, this.f4625y);
            this.f4617g[i2].put(f4616z, qVarQrj3);
            this.f4617g[i2].put(f51252fu4, qVarQrj4);
            return;
        }
        if (qVar.f4632k == 5) {
            y[] yVarArr = (y[]) qVar.ki(this.f4625y);
            if (yVarArr == null || yVarArr.length != 2) {
                Log.w(f51394zurt, "Invalid crop size values. cropSize=" + Arrays.toString(yVarArr));
                return;
            }
            qVarQrj = q.ld6(yVarArr[0], this.f4625y);
            qVarQrj2 = q.ld6(yVarArr[1], this.f4625y);
        } else {
            int[] iArr = (int[]) qVar.ki(this.f4625y);
            if (iArr == null || iArr.length != 2) {
                Log.w(f51394zurt, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            qVarQrj = q.qrj(iArr[0], this.f4625y);
            qVarQrj2 = q.qrj(iArr[1], this.f4625y);
        }
        this.f4617g[i2].put(f51252fu4, qVarQrj);
        this.f4617g[i2].put(f4616z, qVarQrj2);
    }

    private void d2ok(toq toqVar, HashMap map) throws IOException {
        q qVar = (q) map.get(f51242eqxt);
        q qVar2 = (q) map.get(f51296lvui);
        if (qVar == null || qVar2 == null) {
            return;
        }
        long[] jArrM4170q = androidx.exifinterface.media.toq.m4170q(qVar.ki(this.f4625y));
        long[] jArrM4170q2 = androidx.exifinterface.media.toq.m4170q(qVar2.ki(this.f4625y));
        if (jArrM4170q == null || jArrM4170q.length == 0) {
            Log.w(f51394zurt, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM4170q2 == null || jArrM4170q2.length == 0) {
            Log.w(f51394zurt, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrM4170q.length != jArrM4170q2.length) {
            Log.w(f51394zurt, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrM4170q2) {
            j2 += j3;
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        this.f51401ld6 = true;
        this.f4622p = true;
        this.f4624s = true;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < jArrM4170q.length; i5++) {
            int i6 = (int) jArrM4170q[i5];
            int i7 = (int) jArrM4170q2[i5];
            if (i5 < jArrM4170q.length - 1 && i6 + i7 != jArrM4170q[i5 + 1]) {
                this.f51401ld6 = false;
            }
            int i9 = i6 - i3;
            if (i9 < 0) {
                Log.d(f51394zurt, "Invalid strip offset value");
                return;
            }
            long j4 = i9;
            if (toqVar.skip(j4) != j4) {
                Log.d(f51394zurt, "Failed to skip " + i9 + " bytes.");
                return;
            }
            int i10 = i3 + i9;
            byte[] bArr2 = new byte[i7];
            if (toqVar.read(bArr2) != i7) {
                Log.d(f51394zurt, "Failed to read " + i7 + " bytes.");
                return;
            }
            i3 = i10 + i7;
            System.arraycopy(bArr2, 0, bArr, i4, i7);
            i4 += i7;
        }
        this.f51402n7h = bArr;
        if (this.f51401ld6) {
            this.f51406x2 = (int) jArrM4170q[0];
            this.f51403qrj = i2;
        }
    }

    private void d3(toq toqVar) throws Throwable {
        if (f51312ni7) {
            Log.d(f51394zurt, "getWebpAttributes starting with: " + toqVar);
        }
        toqVar.m4159p(ByteOrder.LITTLE_ENDIAN);
        toqVar.ld6(t8fp.length);
        int i2 = toqVar.readInt() + 8;
        byte[] bArr = dm;
        toqVar.ld6(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (toqVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i3 = toqVar.readInt();
                int i4 = length + 4 + 4;
                if (Arrays.equals(tvn8, bArr2)) {
                    byte[] bArr3 = new byte[i3];
                    if (toqVar.read(bArr3) == i3) {
                        this.f4618h = i4;
                        bf2(bArr3, 0);
                        xwq3(new toq(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.toq.m4168k(bArr2));
                    }
                }
                if (i3 % 2 == 1) {
                    i3++;
                }
                length = i4 + i3;
                if (length == i2) {
                    return;
                }
                if (length > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                toqVar.ld6(i3);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void dd(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f51407zy = null;
        this.f4620k = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (uv6(fileInputStream2.getFD())) {
                    this.f51405toq = fileInputStream2.getFD();
                } else {
                    this.f51405toq = null;
                }
                m4134m(fileInputStream2);
                androidx.exifinterface.media.toq.zy(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.toq.zy(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m4129e(int i2) {
        return i2 == 4 || i2 == 13 || i2 == 14;
    }

    private static Long ek5k(@dd String str, @dd String str2, @dd String str3) {
        if (str != null && an.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = dmw0.parse(str, parsePosition);
                if (date == null && (date = gg7.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i2 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i3 = Integer.parseInt(str3.substring(1, 3));
                    int i4 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || C5658n.f73185t8r.equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i3 <= 14) {
                        int i5 = ((i3 * 60) + i4) * 60 * 1000;
                        if (!C5658n.f73185t8r.equals(strSubstring)) {
                            i2 = -1;
                        }
                        time += (long) (i5 * i2);
                    }
                }
                if (str2 != null) {
                    time += androidx.exifinterface.media.toq.f7l8(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void eqxt(toq toqVar, HashMap map) throws Throwable {
        q qVar = (q) map.get(f4610r);
        q qVar2 = (q) map.get(f51234dd);
        if (qVar == null || qVar2 == null) {
            return;
        }
        int iM4158h = qVar.m4158h(this.f4625y);
        int iM4158h2 = qVar2.m4158h(this.f4625y);
        if (this.f4623q == 7) {
            iM4158h += this.f51396cdj;
        }
        if (iM4158h > 0 && iM4158h2 > 0) {
            this.f4624s = true;
            if (this.f4620k == null && this.f51407zy == null && this.f51405toq == null) {
                byte[] bArr = new byte[iM4158h2];
                toqVar.skip(iM4158h);
                toqVar.read(bArr);
                this.f51402n7h = bArr;
            }
            this.f51406x2 = iM4158h;
            this.f51403qrj = iM4158h2;
        }
        if (f51312ni7) {
            Log.d(f51394zurt, "Setting thumbnail attributes with offset: " + iM4158h + ", length: " + iM4158h2);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m4130f(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = wr;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private void fu4(s sVar) throws Throwable {
        int i2;
        int i3;
        wvg(sVar);
        q qVar = this.f4617g[1].get(f51215bf2);
        if (qVar != null) {
            s sVar2 = new s(qVar.f4633q);
            sVar2.m4159p(this.f4625y);
            byte[] bArr = fbr;
            byte[] bArr2 = new byte[bArr.length];
            sVar2.readFully(bArr2);
            sVar2.zy(0L);
            byte[] bArr3 = j3px;
            byte[] bArr4 = new byte[bArr3.length];
            sVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                sVar2.zy(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                sVar2.zy(12L);
            }
            i1(sVar2, 6);
            q qVar2 = this.f4617g[7].get(f51387z4t);
            q qVar3 = this.f4617g[7].get(f51216bih);
            if (qVar2 != null && qVar3 != null) {
                this.f4617g[5].put(f4610r, qVar2);
                this.f4617g[5].put(f51234dd, qVar3);
            }
            q qVar4 = this.f4617g[8].get(f51239ec);
            if (qVar4 != null) {
                int[] iArr = (int[]) qVar4.ki(this.f4625y);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f51394zurt, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 <= i5 || (i2 = iArr[3]) <= (i3 = iArr[1])) {
                    return;
                }
                int i6 = (i4 - i5) + 1;
                int i7 = (i2 - i3) + 1;
                if (i6 < i7) {
                    int i9 = i6 + i7;
                    i7 = i9 - i7;
                    i6 = i9 - i7;
                }
                q qVarQrj = q.qrj(i6, this.f4625y);
                q qVarQrj2 = q.qrj(i7, this.f4625y);
                this.f4617g[0].put(f51252fu4, qVarQrj);
                this.f4617g[0].put(f4616z, qVarQrj2);
            }
        }
    }

    private boolean hb(HashMap map) throws IOException {
        q qVar = (q) map.get(f4616z);
        q qVar2 = (q) map.get(f51252fu4);
        if (qVar == null || qVar2 == null) {
            return false;
        }
        return qVar.m4158h(this.f4625y) <= 512 && qVar2.m4158h(this.f4625y) <= 512;
    }

    private boolean hyr(byte[] bArr) throws Throwable {
        toq toqVar = null;
        try {
            toq toqVar2 = new toq(bArr);
            try {
                ByteOrder byteOrderM4126b = m4126b(toqVar2);
                this.f4625y = byteOrderM4126b;
                toqVar2.m4159p(byteOrderM4126b);
                short s2 = toqVar2.readShort();
                boolean z2 = s2 == 20306 || s2 == 21330;
                toqVar2.close();
                return z2;
            } catch (Exception unused) {
                toqVar = toqVar2;
                if (toqVar != null) {
                    toqVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                toqVar = toqVar2;
                if (toqVar != null) {
                    toqVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4131i(androidx.exifinterface.media.C0846k.toq r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.m4131i(androidx.exifinterface.media.k$toq, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i1(androidx.exifinterface.media.C0846k.s r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.i1(androidx.exifinterface.media.k$s, int):void");
    }

    private void ikck(int i2, int i3) throws Throwable {
        if (this.f4617g[i2].isEmpty() || this.f4617g[i3].isEmpty()) {
            if (f51312ni7) {
                Log.d(f51394zurt, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        q qVar = this.f4617g[i2].get(f4616z);
        q qVar2 = this.f4617g[i2].get(f51252fu4);
        q qVar3 = this.f4617g[i3].get(f4616z);
        q qVar4 = this.f4617g[i3].get(f51252fu4);
        if (qVar == null || qVar2 == null) {
            if (f51312ni7) {
                Log.d(f51394zurt, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (qVar3 == null || qVar4 == null) {
            if (f51312ni7) {
                Log.d(f51394zurt, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM4158h = qVar.m4158h(this.f4625y);
        int iM4158h2 = qVar2.m4158h(this.f4625y);
        int iM4158h3 = qVar3.m4158h(this.f4625y);
        int iM4158h4 = qVar4.m4158h(this.f4625y);
        if (iM4158h >= iM4158h3 || iM4158h2 >= iM4158h4) {
            return;
        }
        HashMap<String, q>[] mapArr = this.f4617g;
        HashMap<String, q> map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private void jk(s sVar) throws IOException {
        byte[] bArr = ym8;
        sVar.ld6(bArr.length);
        byte[] bArr2 = new byte[sVar.available()];
        sVar.readFully(bArr2);
        this.f4618h = bArr.length;
        bf2(bArr2, 0);
    }

    /* JADX INFO: renamed from: k */
    private void m4132k() {
        String strM4147s = m4147s(f4600a);
        if (strM4147s != null && m4147s("DateTime") == null) {
            this.f4617g[0].put("DateTime", q.m4157y(strM4147s));
        }
        if (m4147s(f51252fu4) == null) {
            this.f4617g[0].put(f51252fu4, q.m4156s(0L, this.f4625y));
        }
        if (m4147s(f4616z) == null) {
            this.f4617g[0].put(f4616z, q.m4156s(0L, this.f4625y));
        }
        if (m4147s(f51303mcp) == null) {
            this.f4617g[0].put(f51303mcp, q.m4156s(0L, this.f4625y));
        }
        if (m4147s(f51392zsr0) == null) {
            this.f4617g[1].put(f51392zsr0, q.m4156s(0L, this.f4625y));
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m4133l(byte[] bArr) throws Throwable {
        toq toqVar;
        toq toqVar2 = null;
        try {
            try {
                toqVar = new toq(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = toqVar.readInt();
            byte[] bArr2 = new byte[4];
            toqVar.read(bArr2);
            if (!Arrays.equals(bArr2, p996)) {
                toqVar.close();
                return false;
            }
            long j2 = 16;
            if (length == 1) {
                length = toqVar.readLong();
                if (length < 16) {
                    toqVar.close();
                    return false;
                }
            } else {
                j2 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j3 = length - j2;
            if (j3 < 8) {
                toqVar.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z2 = false;
            boolean z3 = false;
            for (long j4 = 0; j4 < j3 / 4; j4++) {
                if (toqVar.read(bArr3) != 4) {
                    toqVar.close();
                    return false;
                }
                if (j4 != 1) {
                    if (Arrays.equals(bArr3, is)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, e9s)) {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        toqVar.close();
                        return true;
                    }
                }
            }
            toqVar.close();
        } catch (Exception e3) {
            e = e3;
            toqVar2 = toqVar;
            if (f51312ni7) {
                Log.d(f51394zurt, "Exception parsing HEIF file type box.", e);
            }
            if (toqVar2 != null) {
                toqVar2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            toqVar2 = toqVar;
            if (toqVar2 != null) {
                toqVar2.close();
            }
            throw th;
        }
        return false;
    }

    private boolean lrht(byte[] bArr) throws Throwable {
        toq toqVar = null;
        try {
            toq toqVar2 = new toq(bArr);
            try {
                ByteOrder byteOrderM4126b = m4126b(toqVar2);
                this.f4625y = byteOrderM4126b;
                toqVar2.m4159p(byteOrderM4126b);
                boolean z2 = toqVar2.readShort() == 85;
                toqVar2.close();
                return z2;
            } catch (Exception unused) {
                toqVar = toqVar2;
                if (toqVar != null) {
                    toqVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                toqVar = toqVar2;
                if (toqVar != null) {
                    toqVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void lv5(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f51312ni7) {
            Log.d(f51394zurt, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        toq toqVar = new toq(inputStream);
        zy zyVar = new zy(outputStream, ByteOrder.BIG_ENDIAN);
        if (toqVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        zyVar.zy(-1);
        if (toqVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        zyVar.zy(-40);
        q qVarRemove = null;
        if (m4147s(f51381yp31) != null && this.f51398fn3e) {
            qVarRemove = this.f4617g[0].remove(f51381yp31);
        }
        zyVar.zy(-1);
        zyVar.zy(-31);
        vq(zyVar);
        if (qVarRemove != null) {
            this.f4617g[0].put(f51381yp31, qVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (toqVar.readByte() == -1) {
            byte b3 = toqVar.readByte();
            if (b3 == -39 || b3 == -38) {
                zyVar.zy(-1);
                zyVar.zy(b3);
                androidx.exifinterface.media.toq.m4169n(toqVar, zyVar);
                return;
            }
            if (b3 != -31) {
                zyVar.zy(-1);
                zyVar.zy(b3);
                int unsignedShort = toqVar.readUnsignedShort();
                zyVar.ld6(unsignedShort);
                int i2 = unsignedShort - 2;
                if (i2 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i2 > 0) {
                    int i3 = toqVar.read(bArr, 0, Math.min(i2, 4096));
                    if (i3 >= 0) {
                        zyVar.write(bArr, 0, i3);
                        i2 -= i3;
                    }
                }
            } else {
                int unsignedShort2 = toqVar.readUnsignedShort() - 2;
                if (unsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (unsignedShort2 >= 6) {
                    if (toqVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, ym8)) {
                        toqVar.ld6(unsignedShort2 - 6);
                    }
                }
                zyVar.zy(-1);
                zyVar.zy(b3);
                zyVar.ld6(unsignedShort2 + 2);
                if (unsignedShort2 >= 6) {
                    unsignedShort2 -= 6;
                    zyVar.write(bArr2);
                }
                while (unsignedShort2 > 0) {
                    int i4 = toqVar.read(bArr, 0, Math.min(unsignedShort2, 4096));
                    if (i4 >= 0) {
                        zyVar.write(bArr, 0, i4);
                        unsignedShort2 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX INFO: renamed from: m */
    private void m4134m(@lvui InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i2 = 0; i2 < fjcj.length; i2++) {
            try {
                try {
                    this.f4617g[i2] = new HashMap<>();
                } finally {
                    m4132k();
                    if (f51312ni7) {
                        y9n();
                    }
                }
            } catch (IOException | UnsupportedOperationException e2) {
                boolean z2 = f51312ni7;
                if (z2) {
                    Log.w(f51394zurt, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                m4132k();
                if (!z2) {
                    return;
                }
            }
        }
        if (!this.f4621n) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f4623q = ni7(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m4139v(this.f4623q)) {
            s sVar = new s(inputStream);
            if (this.f4621n) {
                jk(sVar);
            } else {
                int i3 = this.f4623q;
                if (i3 == 12) {
                    t8r(sVar);
                } else if (i3 == 7) {
                    fu4(sVar);
                } else if (i3 == 10) {
                    mcp(sVar);
                } else {
                    wvg(sVar);
                }
            }
            sVar.zy(this.f4618h);
            xwq3(sVar);
        } else {
            toq toqVar = new toq(inputStream);
            int i4 = this.f4623q;
            if (i4 == 4) {
                m4131i(toqVar, 0, 0);
            } else if (i4 == 13) {
                m4141z(toqVar);
            } else if (i4 == 9) {
                o1t(toqVar);
            } else if (i4 == 14) {
                d3(toqVar);
            }
        }
    }

    private void mcp(s sVar) throws Throwable {
        if (f51312ni7) {
            Log.d(f51394zurt, "getRw2Attributes starting with: " + sVar);
        }
        wvg(sVar);
        q qVar = this.f4617g[0].get(f51336r6ty);
        if (qVar != null) {
            m4131i(new toq(qVar.f4633q), (int) qVar.f51411zy, 5);
        }
        q qVar2 = this.f4617g[0].get(f51229cyoe);
        q qVar3 = this.f4617g[1].get(f51376xwq3);
        if (qVar2 == null || qVar3 != null) {
            return;
        }
        this.f4617g[1].put(f51376xwq3, qVar2);
    }

    private void mu() throws Throwable {
        ikck(0, 5);
        ikck(0, 4);
        ikck(5, 4);
        q qVar = this.f4617g[1].get(f51240ek5k);
        q qVar2 = this.f4617g[1].get(f51384yz);
        if (qVar != null && qVar2 != null) {
            this.f4617g[0].put(f51252fu4, qVar);
            this.f4617g[0].put(f4616z, qVar2);
        }
        if (this.f4617g[4].isEmpty() && hb(this.f4617g[5])) {
            HashMap<String, q>[] mapArr = this.f4617g;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!hb(this.f4617g[4])) {
            Log.d(f51394zurt, "No image meets the size requirements of a thumbnail image.");
        }
        m4125a(0, f51338ra, f51303mcp);
        m4125a(0, f51330ps, f4616z);
        m4125a(0, f51356v5yj, f51252fu4);
        m4125a(5, f51338ra, f51303mcp);
        m4125a(5, f51330ps, f4616z);
        m4125a(5, f51356v5yj, f51252fu4);
        m4125a(4, f51303mcp, f51338ra);
        m4125a(4, f4616z, f51330ps);
        m4125a(4, f51252fu4, f51356v5yj);
    }

    /* JADX INFO: renamed from: n */
    private void m4135n(toq toqVar, zy zyVar, byte[] bArr) throws IOException {
        int i2 = toqVar.readInt();
        zyVar.write(bArr);
        zyVar.m4165q(i2);
        if (i2 % 2 == 1) {
            i2++;
        }
        androidx.exifinterface.media.toq.m4167g(toqVar, zyVar, i2);
    }

    private static boolean n5r1(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = pi;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private int ni7(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (n5r1(bArr)) {
            return 4;
        }
        if (m4127c(bArr)) {
            return 9;
        }
        if (m4133l(bArr)) {
            return 12;
        }
        if (hyr(bArr)) {
            return 7;
        }
        if (lrht(bArr)) {
            return 10;
        }
        if (m4130f(bArr)) {
            return 13;
        }
        return m4136o(bArr) ? 14 : 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean nn86(@lvui String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        byte b3 = -1;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b3 = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b3 = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b3 = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b3 = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b3 = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals(wvg.f67136tfm)) {
                    b3 = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b3 = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b3 = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b3 = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    b3 = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b3 = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b3 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b3 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b3 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b3 = com.google.common.base.zy.f25751h;
                }
                break;
        }
        switch (b3) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    private boolean m4136o(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = t8fp;
            if (i2 >= bArr2.length) {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = dm;
                    if (i3 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[t8fp.length + i3 + 4] != bArr3[i3]) {
                        return false;
                    }
                    i3++;
                }
            } else {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
    }

    private void o1t(toq toqVar) throws Throwable {
        boolean z2 = f51312ni7;
        if (z2) {
            Log.d(f51394zurt, "getRafAttributes starting with: " + toqVar);
        }
        toqVar.ld6(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        toqVar.read(bArr);
        toqVar.read(bArr2);
        toqVar.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        toqVar.ld6(i2 - toqVar.m4160q());
        toqVar.read(bArr4);
        m4131i(new toq(bArr4), i2, 5);
        toqVar.ld6(i4 - toqVar.m4160q());
        toqVar.m4159p(ByteOrder.BIG_ENDIAN);
        int i5 = toqVar.readInt();
        if (z2) {
            Log.d(f51394zurt, "numberOfDirectoryEntry: " + i5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int unsignedShort = toqVar.readUnsignedShort();
            int unsignedShort2 = toqVar.readUnsignedShort();
            if (unsignedShort == vf.f4626k) {
                short s2 = toqVar.readShort();
                short s3 = toqVar.readShort();
                q qVarQrj = q.qrj(s2, this.f4625y);
                q qVarQrj2 = q.qrj(s3, this.f4625y);
                this.f4617g[0].put(f4616z, qVarQrj);
                this.f4617g[0].put(f51252fu4, qVarQrj2);
                if (f51312ni7) {
                    Log.d(f51394zurt, "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            toqVar.ld6(unsignedShort2);
        }
    }

    private static Pair<Integer, Integer> oc(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairOc = oc(strArrSplit[0]);
            if (((Integer) pairOc.first).intValue() == 2) {
                return pairOc;
            }
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                Pair<Integer, Integer> pairOc2 = oc(strArrSplit[i2]);
                int iIntValue = (((Integer) pairOc2.first).equals(pairOc.first) || ((Integer) pairOc2.second).equals(pairOc.first)) ? ((Integer) pairOc.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairOc.second).intValue() == -1 || !(((Integer) pairOc2.first).equals(pairOc.second) || ((Integer) pairOc2.second).equals(pairOc.second))) ? -1 : ((Integer) pairOc.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairOc = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairOc = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairOc;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    return (lValueOf.longValue() < 0 || lValueOf.longValue() > okhttp3.internal.ws.f7l8.f43390i) ? lValueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    /* JADX INFO: renamed from: q */
    private void m4137q(toq toqVar, zy zyVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (toqVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = fai;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            m4135n(toqVar, zyVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void t8iq(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f51312ni7) {
            Log.d(f51394zurt, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        toq toqVar = new toq(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        zy zyVar = new zy(outputStream, byteOrder);
        byte[] bArr = wr;
        androidx.exifinterface.media.toq.m4167g(toqVar, zyVar, bArr.length);
        int i2 = this.f4618h;
        if (i2 == 0) {
            int i3 = toqVar.readInt();
            zyVar.m4165q(i3);
            androidx.exifinterface.media.toq.m4167g(toqVar, zyVar, i3 + 4 + 4);
        } else {
            androidx.exifinterface.media.toq.m4167g(toqVar, zyVar, ((i2 - bArr.length) - 4) - 4);
            toqVar.ld6(toqVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            zy zyVar2 = new zy(byteArrayOutputStream, byteOrder);
            vq(zyVar2);
            byte[] byteArray = ((ByteArrayOutputStream) zyVar2.f4641k).toByteArray();
            zyVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            zyVar.m4165q((int) crc32.getValue());
            androidx.exifinterface.media.toq.zy(byteArrayOutputStream);
            androidx.exifinterface.media.toq.m4169n(toqVar, zyVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.toq.zy(byteArrayOutputStream2);
            throw th;
        }
    }

    private void t8r(s sVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                toq.C7879toq.m4173k(mediaMetadataRetriever, new k(sVar));
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
                String strExtractMetadata7 = null;
                if ("yes".equals(strExtractMetadata5)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                }
                if (strExtractMetadata7 != null) {
                    this.f4617g[0].put(f51252fu4, q.qrj(Integer.parseInt(strExtractMetadata7), this.f4625y));
                }
                if (strExtractMetadata != null) {
                    this.f4617g[0].put(f4616z, q.qrj(Integer.parseInt(strExtractMetadata), this.f4625y));
                }
                if (strExtractMetadata2 != null) {
                    int i2 = 1;
                    int i3 = Integer.parseInt(strExtractMetadata2);
                    if (i3 == 90) {
                        i2 = 6;
                    } else if (i3 == 180) {
                        i2 = 3;
                    } else if (i3 == 270) {
                        i2 = 8;
                    }
                    this.f4617g[0].put(f51303mcp, q.qrj(i2, this.f4625y));
                }
                if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata3);
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    sVar.zy(i4);
                    byte[] bArr = new byte[6];
                    if (sVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i6 = i4 + 6;
                    int i7 = i5 - 6;
                    if (!Arrays.equals(bArr, ym8)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    if (sVar.read(bArr2) != i7) {
                        throw new IOException("Can't read exif");
                    }
                    this.f4618h = i6;
                    bf2(bArr2, 0);
                }
                if (f51312ni7) {
                    Log.d(f51394zurt, "Heif meta: " + strExtractMetadata7 + AnimatedProperty.PROPERTY_NAME_X + strExtractMetadata + ", rotation " + strExtractMetadata2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private String toq(double d2) {
        long j2 = (long) d2;
        double d4 = d2 - j2;
        long j3 = (long) (d4 * 60.0d);
        return j2 + "/1," + j3 + "/1," + Math.round((d4 - (j3 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX INFO: renamed from: u */
    private void m4138u(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        int i3;
        int i4;
        if (f51312ni7) {
            Log.d(f51394zurt, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        toq toqVar = new toq(inputStream, byteOrder);
        zy zyVar = new zy(outputStream, byteOrder);
        byte[] bArr = t8fp;
        androidx.exifinterface.media.toq.m4167g(toqVar, zyVar, bArr.length);
        byte[] bArr2 = dm;
        toqVar.ld6(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            zy zyVar2 = new zy(byteArrayOutputStream, byteOrder);
            int i5 = this.f4618h;
            if (i5 != 0) {
                androidx.exifinterface.media.toq.m4167g(toqVar, zyVar2, ((i5 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                toqVar.ld6(4);
                int i6 = toqVar.readInt();
                if (i6 % 2 != 0) {
                    i6++;
                }
                toqVar.ld6(i6);
                vq(zyVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (toqVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = li5y;
                boolean z2 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int i7 = toqVar.readInt();
                    byte[] bArr5 = new byte[i7 % 2 == 1 ? i7 + 1 : i7];
                    toqVar.read(bArr5);
                    byte b3 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b3;
                    boolean z3 = ((b3 >> 1) & 1) == 1;
                    zyVar2.write(bArr4);
                    zyVar2.m4165q(i7);
                    zyVar2.write(bArr5);
                    if (z3) {
                        m4137q(toqVar, zyVar2, b6i9, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, bp)) {
                                break;
                            } else {
                                m4135n(toqVar, zyVar2, bArr6);
                            }
                        }
                        vq(zyVar2);
                    } else {
                        m4137q(toqVar, zyVar2, xknm, a4ph);
                        vq(zyVar2);
                    }
                } else {
                    byte[] bArr7 = xknm;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, a4ph)) {
                        int i9 = toqVar.readInt();
                        int i10 = i9 % 2 == 1 ? i9 + 1 : i9;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            toqVar.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (toqVar.read(bArr9) != 3 || !Arrays.equals(ze, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i2 = toqVar.readInt();
                            i10 -= 10;
                            i4 = (i2 << 2) >> 18;
                            i3 = (i2 << 18) >> 18;
                            z2 = false;
                        } else if (!Arrays.equals(bArr3, a4ph)) {
                            i2 = 0;
                            z2 = false;
                            i3 = 0;
                            i4 = 0;
                        } else {
                            if (toqVar.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i2 = toqVar.readInt();
                            i3 = ((i2 << 18) >> 18) + 1;
                            i4 = ((i2 << 4) >> 18) + 1;
                            if ((i2 & 8) == 0) {
                                z2 = false;
                            }
                            i10 -= 5;
                        }
                        zyVar2.write(bArr4);
                        zyVar2.m4165q(10);
                        byte[] bArr10 = new byte[10];
                        if (z2) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i11 = i3 - 1;
                        int i12 = i4 - 1;
                        bArr10[4] = (byte) i11;
                        bArr10[5] = (byte) (i11 >> 8);
                        bArr10[6] = (byte) (i11 >> 16);
                        bArr10[7] = (byte) i12;
                        bArr10[8] = (byte) (i12 >> 8);
                        bArr10[9] = (byte) (i12 >> 16);
                        zyVar2.write(bArr10);
                        zyVar2.write(bArr3);
                        zyVar2.m4165q(i9);
                        if (Arrays.equals(bArr3, bArr7)) {
                            zyVar2.write(bArr8);
                            zyVar2.write(ze);
                            zyVar2.m4165q(i2);
                        } else if (Arrays.equals(bArr3, a4ph)) {
                            zyVar2.write(47);
                            zyVar2.m4165q(i2);
                        }
                        androidx.exifinterface.media.toq.m4167g(toqVar, zyVar2, i10);
                        vq(zyVar2);
                    }
                }
            }
            androidx.exifinterface.media.toq.m4169n(toqVar, zyVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = dm;
            zyVar.m4165q(size + bArr11.length);
            zyVar.write(bArr11);
            byteArrayOutputStream.writeTo(zyVar);
            androidx.exifinterface.media.toq.zy(byteArrayOutputStream);
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.toq.zy(byteArrayOutputStream2);
            throw th;
        }
    }

    private static boolean uv6(FileDescriptor fileDescriptor) {
        try {
            toq.C0847k.zy(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f51312ni7) {
                return false;
            }
            Log.d(f51394zurt, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* JADX INFO: renamed from: v */
    private static boolean m4139v(int i2) {
        return (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) ? false : true;
    }

    private int vq(zy zyVar) throws IOException {
        g[][] gVarArr = fjcj;
        int[] iArr = new int[gVarArr.length];
        int[] iArr2 = new int[gVarArr.length];
        for (g gVar : m4ll) {
            a98o(gVar.f51408toq);
        }
        if (this.f4624s) {
            if (this.f4622p) {
                a98o(f51242eqxt);
                a98o(f51296lvui);
            } else {
                a98o(f4610r);
                a98o(f51234dd);
            }
        }
        for (int i2 = 0; i2 < fjcj.length; i2++) {
            for (Object obj : this.f4617g[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f4617g[i2].remove(entry.getKey());
                }
            }
        }
        if (!this.f4617g[1].isEmpty()) {
            this.f4617g[0].put(m4ll[1].f51408toq, q.m4156s(0L, this.f4625y));
        }
        if (!this.f4617g[2].isEmpty()) {
            this.f4617g[0].put(m4ll[2].f51408toq, q.m4156s(0L, this.f4625y));
        }
        if (!this.f4617g[3].isEmpty()) {
            this.f4617g[1].put(m4ll[3].f51408toq, q.m4156s(0L, this.f4625y));
        }
        if (this.f4624s) {
            if (this.f4622p) {
                this.f4617g[4].put(f51242eqxt, q.qrj(0, this.f4625y));
                this.f4617g[4].put(f51296lvui, q.qrj(this.f51403qrj, this.f4625y));
            } else {
                this.f4617g[4].put(f4610r, q.m4156s(0L, this.f4625y));
                this.f4617g[4].put(f51234dd, q.m4156s(this.f51403qrj, this.f4625y));
            }
        }
        for (int i3 = 0; i3 < fjcj.length; i3++) {
            Iterator<Map.Entry<String, q>> it = this.f4617g[i3].entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int iT8r = it.next().getValue().t8r();
                if (iT8r > 4) {
                    i4 += iT8r;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int size = 8;
        for (int i5 = 0; i5 < fjcj.length; i5++) {
            if (!this.f4617g[i5].isEmpty()) {
                iArr[i5] = size;
                size += (this.f4617g[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f4624s) {
            if (this.f4622p) {
                this.f4617g[4].put(f51242eqxt, q.qrj(size, this.f4625y));
            } else {
                this.f4617g[4].put(f4610r, q.m4156s(size, this.f4625y));
            }
            this.f51406x2 = size;
            size += this.f51403qrj;
        }
        if (this.f4623q == 4) {
            size += 8;
        }
        if (f51312ni7) {
            for (int i6 = 0; i6 < fjcj.length; i6++) {
                Log.d(f51394zurt, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f4617g[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(size)));
            }
        }
        if (!this.f4617g[1].isEmpty()) {
            this.f4617g[0].put(m4ll[1].f51408toq, q.m4156s(iArr[1], this.f4625y));
        }
        if (!this.f4617g[2].isEmpty()) {
            this.f4617g[0].put(m4ll[2].f51408toq, q.m4156s(iArr[2], this.f4625y));
        }
        if (!this.f4617g[3].isEmpty()) {
            this.f4617g[1].put(m4ll[3].f51408toq, q.m4156s(iArr[3], this.f4625y));
        }
        int i7 = this.f4623q;
        if (i7 == 4) {
            zyVar.ld6(size);
            zyVar.write(ym8);
        } else if (i7 == 13) {
            zyVar.m4165q(size);
            zyVar.write(le9);
        } else if (i7 == 14) {
            zyVar.write(tvn8);
            zyVar.m4165q(size);
        }
        zyVar.m4166y(this.f4625y == ByteOrder.BIG_ENDIAN ? te : ff8y);
        zyVar.m4163k(this.f4625y);
        zyVar.ld6(42);
        zyVar.m4164p(8L);
        for (int i9 = 0; i9 < fjcj.length; i9++) {
            if (!this.f4617g[i9].isEmpty()) {
                zyVar.ld6(this.f4617g[i9].size());
                int size2 = iArr[i9] + 2 + (this.f4617g[i9].size() * 12) + 4;
                for (Map.Entry<String, q> entry2 : this.f4617g[i9].entrySet()) {
                    int i10 = dhzo[i9].get(entry2.getKey()).f4626k;
                    q value = entry2.getValue();
                    int iT8r2 = value.t8r();
                    zyVar.ld6(i10);
                    zyVar.ld6(value.f4632k);
                    zyVar.m4165q(value.f51410toq);
                    if (iT8r2 > 4) {
                        zyVar.m4164p(size2);
                        size2 += iT8r2;
                    } else {
                        zyVar.write(value.f4633q);
                        if (iT8r2 < 4) {
                            while (iT8r2 < 4) {
                                zyVar.zy(0);
                                iT8r2++;
                            }
                        }
                    }
                }
                if (i9 != 0 || this.f4617g[4].isEmpty()) {
                    zyVar.m4164p(0L);
                } else {
                    zyVar.m4164p(iArr[4]);
                }
                Iterator<Map.Entry<String, q>> it2 = this.f4617g[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f4633q;
                    if (bArr.length > 4) {
                        zyVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f4624s) {
            zyVar.write(jp0y());
        }
        if (this.f4623q == 14 && size % 2 == 1) {
            zyVar.zy(0);
        }
        zyVar.m4163k(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private boolean vyq(HashMap map) throws IOException {
        q qVar;
        int iM4158h;
        q qVar2 = (q) map.get(f51320o1t);
        if (qVar2 != null) {
            int[] iArr = (int[]) qVar2.ki(this.f4625y);
            int[] iArr2 = zxa9;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4623q == 3 && (qVar = (q) map.get(f4611t)) != null && (((iM4158h = qVar.m4158h(this.f4625y)) == 1 && Arrays.equals(iArr, b3fl)) || (iM4158h == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f51312ni7) {
            return false;
        }
        Log.d(f51394zurt, "Unsupported data type value");
        return false;
    }

    private void wvg(s sVar) throws Throwable {
        q qVar;
        yz(sVar);
        i1(sVar, 0);
        m4128d(sVar, 0);
        m4128d(sVar, 5);
        m4128d(sVar, 4);
        mu();
        if (this.f4623q != 8 || (qVar = this.f4617g[1].get(f51215bf2)) == null) {
            return;
        }
        s sVar2 = new s(qVar.f4633q);
        sVar2.m4159p(this.f4625y);
        sVar2.ld6(6);
        i1(sVar2, 9);
        q qVar2 = this.f4617g[9].get(f4609o);
        if (qVar2 != null) {
            this.f4617g[1].put(f4609o, qVar2);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m4140x(s sVar, int i2) throws Throwable {
        q qVar = this.f4617g[i2].get(f4616z);
        q qVar2 = this.f4617g[i2].get(f51252fu4);
        if (qVar == null || qVar2 == null) {
            q qVar3 = this.f4617g[i2].get(f4610r);
            q qVar4 = this.f4617g[i2].get(f51234dd);
            if (qVar3 == null || qVar4 == null) {
                return;
            }
            int iM4158h = qVar3.m4158h(this.f4625y);
            int iM4158h2 = qVar3.m4158h(this.f4625y);
            sVar.zy(iM4158h);
            byte[] bArr = new byte[iM4158h2];
            sVar.read(bArr);
            m4131i(new toq(bArr), iM4158h, i2);
        }
    }

    private static boolean x9kr(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = ym8;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr3 = ym8;
            if (i2 >= bArr3.length) {
                return true;
            }
            if (bArr2[i2] != bArr3[i2]) {
                return false;
            }
            i2++;
        }
    }

    private void xwq3(toq toqVar) throws Throwable {
        HashMap<String, q> map = this.f4617g[4];
        q qVar = map.get(f51369wvg);
        if (qVar == null) {
            this.f51400kja0 = 6;
            eqxt(toqVar, map);
            return;
        }
        int iM4158h = qVar.m4158h(this.f4625y);
        this.f51400kja0 = iM4158h;
        if (iM4158h != 1) {
            if (iM4158h == 6) {
                eqxt(toqVar, map);
                return;
            } else if (iM4158h != 7) {
                return;
            }
        }
        if (vyq(map)) {
            d2ok(toqVar, map);
        }
    }

    private void y9n() {
        for (int i2 = 0; i2 < this.f4617g.length; i2++) {
            Log.d(f51394zurt, "The size of tag group[" + i2 + "]: " + this.f4617g[i2].size());
            for (Map.Entry<String, q> entry : this.f4617g[i2].entrySet()) {
                q value = entry.getValue();
                Log.d(f51394zurt, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.cdj(this.f4625y) + "'");
            }
        }
    }

    private void yz(toq toqVar) throws IOException {
        ByteOrder byteOrderM4126b = m4126b(toqVar);
        this.f4625y = byteOrderM4126b;
        toqVar.m4159p(byteOrderM4126b);
        int unsignedShort = toqVar.readUnsignedShort();
        int i2 = this.f4623q;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = toqVar.readInt();
        if (i3 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i3);
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            toqVar.ld6(i4);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m4141z(toq toqVar) throws Throwable {
        if (f51312ni7) {
            Log.d(f51394zurt, "getPngAttributes starting with: " + toqVar);
        }
        toqVar.m4159p(ByteOrder.BIG_ENDIAN);
        byte[] bArr = wr;
        toqVar.ld6(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i2 = toqVar.readInt();
                int i3 = length + 4;
                byte[] bArr2 = new byte[4];
                if (toqVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = i3 + 4;
                if (i4 == 16 && !Arrays.equals(bArr2, krto)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, xzk4)) {
                    return;
                }
                if (Arrays.equals(bArr2, le9)) {
                    byte[] bArr3 = new byte[i2];
                    if (toqVar.read(bArr3) != i2) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.toq.m4168k(bArr2));
                    }
                    int i5 = toqVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i5) {
                        this.f4618h = i4;
                        bf2(bArr3, 0);
                        mu();
                        xwq3(new toq(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                }
                int i6 = i2 + 4;
                toqVar.ld6(i6);
                length = i4 + i6;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private static double zy(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d4 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d5 = d2 + (d4 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals(ae4)) {
                if (!str2.equals("N") && !str2.equals(d9i)) {
                    throw new IllegalArgumentException();
                }
                return d5;
            }
            return -d5;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    @dd
    public byte[] a9() {
        int i2 = this.f51400kja0;
        if (i2 == 6 || i2 == 7) {
            return jp0y();
        }
        return null;
    }

    public void bo(double d2) {
        String str = d2 >= 0.0d ? "0" : "1";
        y2(f51328pjz9, new y(Math.abs(d2)).toString());
        y2(f51308n2t, str);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public void c8jq(@lvui Long l2) {
        if (l2 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l2.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l2.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0" + string;
        }
        y2("DateTime", dmw0.format(new Date(l2.longValue())));
        y2(f51295lv5, string);
    }

    public void ch(int i2) {
        if (i2 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iX2 = x2(f51303mcp, 1);
        List<Integer> list = f51332qh4d;
        if (list.contains(Integer.valueOf(iX2))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(iX2)) + (i2 / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = f51265hyow;
            if (list2.contains(Integer.valueOf(iX2))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(iX2)) + (i2 / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        y2(f51303mcp, Integer.toString(iIntValue));
    }

    public void dr(double d2, double d4) {
        if (d2 < -90.0d || d2 > 90.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Latitude value " + d2 + " is not valid.");
        }
        if (d4 < -180.0d || d4 > 180.0d || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Longitude value " + d4 + " is not valid.");
        }
        y2(f51327pc, d2 >= 0.0d ? "N" : "S");
        y2(f51271ij, toq(Math.abs(d2)));
        y2(f51317nsb, d4 >= 0.0d ? d9i : ae4);
        y2(f51395zwy, toq(Math.abs(d4)));
    }

    public void f7l8() {
        int i2 = 1;
        switch (x2(f51303mcp, 1)) {
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                break;
            case 5:
                i2 = 8;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        y2(f51303mcp, Integer.toString(i2));
    }

    @Deprecated
    public boolean fn3e(float[] fArr) {
        double[] dArrZurt = zurt();
        if (dArrZurt == null) {
            return false;
        }
        fArr[0] = (float) dArrZurt[0];
        fArr[1] = (float) dArrZurt[1];
        return true;
    }

    @dd
    public Bitmap fti() throws Throwable {
        if (!this.f4624s) {
            return null;
        }
        if (this.f51402n7h == null) {
            this.f51402n7h = jp0y();
        }
        int i2 = this.f51400kja0;
        if (i2 == 6 || i2 == 7) {
            return BitmapFactory.decodeByteArray(this.f51402n7h, 0, this.f51403qrj);
        }
        if (i2 == 1) {
            int length = this.f51402n7h.length / 3;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                byte[] bArr = this.f51402n7h;
                int i4 = i3 * 3;
                iArr[i3] = (bArr[i4] << 16) + 0 + (bArr[i4 + 1] << 8) + bArr[i4 + 2];
            }
            q qVar = this.f4617g[4].get(f51330ps);
            q qVar2 = this.f4617g[4].get(f51356v5yj);
            if (qVar != null && qVar2 != null) {
                return Bitmap.createBitmap(iArr, qVar2.m4158h(this.f4625y), qVar.m4158h(this.f4625y), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m4142g() {
        int i2 = 1;
        switch (x2(f51303mcp, 1)) {
            case 1:
                i2 = 2;
                break;
            case 2:
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
        }
        y2(f51303mcp, Integer.toString(i2));
    }

    @dd
    public long[] gvn7() {
        if (this.f4619i) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f4624s) {
            return null;
        }
        if (!this.f4622p || this.f51401ld6) {
            return new long[]{this.f51406x2 + this.f4618h, this.f51403qrj};
        }
        return null;
    }

    public void gyi(Location location) {
        if (location == null) {
            return;
        }
        y2(f51244ew, location.getProvider());
        dr(location.getLatitude(), location.getLongitude());
        bo(location.getAltitude());
        y2(f51255ga, "K");
        y2(f51237e5, new y((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = dmw0.format(new Date(location.getTime())).split("\\s+", -1);
        y2(f51287kx3, strArrSplit[0]);
        y2(f51311ngy, strArrSplit[1]);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: h */
    public Long m4143h() {
        return ek5k(m4147s(f4600a), m4147s(f51343t8iq), m4147s(f51225ch));
    }

    /* JADX INFO: renamed from: j */
    public boolean m4144j() {
        if (!this.f4624s) {
            return false;
        }
        int i2 = this.f51400kja0;
        return i2 == 6 || i2 == 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] jp0y() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f4624s
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r9.f51402n7h
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f51407zy     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L4f
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            androidx.exifinterface.media.toq.zy(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto La8
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L99
        L2e:
            java.lang.String r1 = r9.f4620k     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r3 = r9.f4620k     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r9.f51405toq     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.io.FileDescriptor r1 = androidx.exifinterface.media.toq.C0847k.toq(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            androidx.exifinterface.media.toq.C0847k.zy(r1, r3, r5)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r8 = r3
            r3 = r1
            r1 = r8
        L4f:
            int r4 = r9.f51406x2     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r9.f4618h     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r9.f51406x2     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f4618h     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L82
            int r4 = r9.f51403qrj     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r1.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f51403qrj     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            if (r6 != r7) goto L7c
            r9.f51402n7h = r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            androidx.exifinterface.media.toq.zy(r1)
            if (r3 == 0) goto L7b
            androidx.exifinterface.media.toq.toq(r3)
        L7b:
            return r4
        L7c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r5)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L82:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r5)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L88:
            r4 = move-exception
            goto L99
        L8a:
            r0 = move-exception
            r3 = r1
            goto La9
        L8d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L99
        L92:
            r0 = move-exception
            r3 = r2
            goto La9
        L95:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L99:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> La7
            androidx.exifinterface.media.toq.zy(r1)
            if (r3 == 0) goto La6
            androidx.exifinterface.media.toq.toq(r3)
        La6:
            return r2
        La7:
            r0 = move-exception
        La8:
            r2 = r1
        La9:
            androidx.exifinterface.media.toq.zy(r2)
            if (r3 == 0) goto Lb1
            androidx.exifinterface.media.toq.toq(r3)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.jp0y():byte[]");
    }

    @SuppressLint({"AutoBoxing"})
    @dd
    public Long ki() {
        String strM4147s = m4147s(f51287kx3);
        String strM4147s2 = m4147s(f51311ngy);
        if (strM4147s != null && strM4147s2 != null) {
            Pattern pattern = an;
            if (pattern.matcher(strM4147s).matches() || pattern.matcher(strM4147s2).matches()) {
                String str = strM4147s + ' ' + strM4147s2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = dmw0.parse(str, parsePosition);
                    if (date == null && (date = gg7.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public Long kja0() {
        return ek5k(m4147s(f51391zp), m4147s(f4612u), m4147s(f51314nmn5));
    }

    public double ld6(@lvui String str, double d2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        q qVarCdj = cdj(str);
        if (qVarCdj == null) {
            return d2;
        }
        try {
            return qVarCdj.kja0(this.f4625y);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public boolean lvui(@lvui String str) {
        return cdj(str) != null;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public Long n7h() {
        return ek5k(m4147s("DateTime"), m4147s(f51295lv5), m4147s(f4615x));
    }

    public boolean ncyb() {
        int iX2 = x2(f51303mcp, 1);
        return iX2 == 2 || iX2 == 7 || iX2 == 4 || iX2 == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void nmn5() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.nmn5():void");
    }

    @dd
    /* JADX INFO: renamed from: p */
    public byte[] m4145p(@lvui String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        q qVarCdj = cdj(str);
        if (qVarCdj != null) {
            return qVarCdj.f4633q;
        }
        return null;
    }

    @dd
    public long[] qrj(@lvui String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f4619i) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        q qVarCdj = cdj(str);
        if (qVarCdj != null) {
            return new long[]{qVarCdj.f51411zy, qVarCdj.f4633q.length};
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m4146r() {
        return this.f4624s;
    }

    @dd
    /* JADX INFO: renamed from: s */
    public String m4147s(@lvui String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        q qVarCdj = cdj(str);
        if (qVarCdj != null) {
            if (!f1.contains(str)) {
                return qVarCdj.cdj(this.f4625y);
            }
            if (str.equals(f51311ngy)) {
                int i2 = qVarCdj.f4632k;
                if (i2 != 5 && i2 != 10) {
                    Log.w(f51394zurt, "GPS Timestamp format is not rational. format=" + qVarCdj.f4632k);
                    return null;
                }
                y[] yVarArr = (y[]) qVarCdj.ki(this.f4625y);
                if (yVarArr != null && yVarArr.length == 3) {
                    y yVar = yVarArr[0];
                    y yVar2 = yVarArr[1];
                    y yVar3 = yVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (yVar.f4640k / yVar.f51412toq)), Integer.valueOf((int) (yVar2.f4640k / yVar2.f51412toq)), Integer.valueOf((int) (yVar3.f4640k / yVar3.f51412toq)));
                }
                Log.w(f51394zurt, "Invalid GPS Timestamp array. array=" + Arrays.toString(yVarArr));
                return null;
            }
            try {
                return Double.toString(qVarCdj.kja0(this.f4625y));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public int m4148t() {
        switch (x2(f51303mcp, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public int x2(@lvui String str, int i2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        q qVarCdj = cdj(str);
        if (qVarCdj == null) {
            return i2;
        }
        try {
            return qVarCdj.m4158h(this.f4625y);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX INFO: renamed from: y */
    public double m4149y(double d2) {
        double dLd6 = ld6(f51328pjz9, -1.0d);
        int iX2 = x2(f51308n2t, -1);
        if (dLd6 < 0.0d || iX2 < 0) {
            return d2;
        }
        return dLd6 * ((double) (iX2 != 1 ? 1 : -1));
    }

    public void y2(@lvui String str, @dd String str2) {
        g gVar;
        int i2;
        int i3;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || f4600a.equals(str3) || f51391zp.equals(str3)) && strReplaceAll != null) {
            boolean zFind = h8k.matcher(strReplaceAll).find();
            boolean zFind2 = jerf.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f51394zurt, "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(C5658n.f73185t8r, ":");
            }
        }
        if (f51235dr.equals(str3)) {
            if (f51312ni7) {
                Log.d(f51394zurt, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = f51376xwq3;
        }
        int i4 = 2;
        int i5 = 1;
        if (strReplaceAll != null && f1.contains(str3)) {
            if (str3.equals(f51311ngy)) {
                Matcher matcher = fvqg.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f51394zurt, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new y(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f51394zurt, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i6 = 0;
        int i7 = 0;
        while (i7 < fjcj.length) {
            if ((i7 != 4 || this.f4624s) && (gVar = dhzo[i7].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairOc = oc(strReplaceAll);
                    int i9 = -1;
                    if (gVar.f51409zy == ((Integer) pairOc.first).intValue() || gVar.f51409zy == ((Integer) pairOc.second).intValue()) {
                        i2 = gVar.f51409zy;
                    } else {
                        int i10 = gVar.f4627q;
                        if (i10 == -1 || !(i10 == ((Integer) pairOc.first).intValue() || gVar.f4627q == ((Integer) pairOc.second).intValue())) {
                            int i11 = gVar.f51409zy;
                            if (i11 == i5 || i11 == 7 || i11 == i4) {
                                i2 = i11;
                            } else if (f51312ni7) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = twzk;
                                sb2.append(strArr[gVar.f51409zy]);
                                sb2.append(gVar.f4627q == -1 ? "" : ", " + strArr[gVar.f4627q]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairOc.first).intValue()]);
                                sb2.append(((Integer) pairOc.second).intValue() != -1 ? ", " + strArr[((Integer) pairOc.second).intValue()] : "");
                                sb2.append(")");
                                Log.d(f51394zurt, sb2.toString());
                            }
                        } else {
                            i2 = gVar.f4627q;
                        }
                    }
                    switch (i2) {
                        case 1:
                            i3 = i5;
                            this.f4617g[i7].put(str3, q.m4152k(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i3 = i5;
                            this.f4617g[i7].put(str3, q.m4157y(strReplaceAll));
                            break;
                        case 3:
                            i3 = i5;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                                iArr[i12] = Integer.parseInt(strArrSplit[i12]);
                            }
                            this.f4617g[i7].put(str3, q.n7h(iArr, this.f4625y));
                            break;
                        case 4:
                            i3 = i5;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i13 = 0; i13 < strArrSplit2.length; i13++) {
                                jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                            }
                            this.f4617g[i7].put(str3, q.m4154p(jArr, this.f4625y));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            y[] yVarArr = new y[strArrSplit3.length];
                            int i14 = 0;
                            while (i14 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i14].split("/", i9);
                                yVarArr[i14] = new y((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i14++;
                                i9 = -1;
                            }
                            i3 = 1;
                            this.f4617g[i7].put(str3, q.x2(yVarArr, this.f4625y));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i3 = i5;
                            if (f51312ni7) {
                                Log.d(f51394zurt, "Data format isn't one of expected formats: " + i2);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i15 = 0; i15 < strArrSplit5.length; i15++) {
                                iArr2[i15] = Integer.parseInt(strArrSplit5[i15]);
                            }
                            this.f4617g[i7].put(str3, q.m4153n(iArr2, this.f4625y));
                            i3 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            y[] yVarArr2 = new y[strArrSplit6.length];
                            int i16 = i6;
                            while (i16 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i16].split("/", -1);
                                yVarArr2[i16] = new y((long) Double.parseDouble(strArrSplit7[i6]), (long) Double.parseDouble(strArrSplit7[i5]));
                                i16++;
                                strArrSplit6 = strArrSplit6;
                                i6 = 0;
                                i5 = 1;
                            }
                            this.f4617g[i7].put(str3, q.f7l8(yVarArr2, this.f4625y));
                            i3 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i17 = i6; i17 < strArrSplit8.length; i17++) {
                                dArr[i17] = Double.parseDouble(strArrSplit8[i17]);
                            }
                            this.f4617g[i7].put(str3, q.zy(dArr, this.f4625y));
                            break;
                    }
                } else {
                    this.f4617g[i7].remove(str3);
                }
                i3 = i5;
            } else {
                i3 = i5;
            }
            i7++;
            i5 = i3;
            i4 = 2;
            i6 = 0;
        }
    }

    public void zp() {
        y2(f51303mcp, Integer.toString(1));
    }

    @dd
    public double[] zurt() {
        String strM4147s = m4147s(f51271ij);
        String strM4147s2 = m4147s(f51327pc);
        String strM4147s3 = m4147s(f51395zwy);
        String strM4147s4 = m4147s(f51317nsb);
        if (strM4147s == null || strM4147s2 == null || strM4147s3 == null || strM4147s4 == null) {
            return null;
        }
        try {
            return new double[]{zy(strM4147s, strM4147s2), zy(strM4147s3, strM4147s4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f51394zurt, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM4147s, strM4147s2, strM4147s3, strM4147s4));
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$s */
    /* JADX INFO: compiled from: ExifInterface.java */
    private static class s extends toq {
        s(byte[] bArr) throws IOException {
            super(bArr);
            this.f4637k.mark(Integer.MAX_VALUE);
        }

        public void zy(long j2) throws IOException {
            int i2 = this.f4638n;
            if (i2 > j2) {
                this.f4638n = 0;
                this.f4637k.reset();
            } else {
                j2 -= (long) i2;
            }
            ld6((int) j2);
        }

        s(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f4637k.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.k$g */
    /* JADX INFO: compiled from: ExifInterface.java */
    static class g {

        /* JADX INFO: renamed from: k */
        public final int f4626k;

        /* JADX INFO: renamed from: q */
        public final int f4627q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String f51408toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f51409zy;

        g(String str, int i2, int i3) {
            this.f51408toq = str;
            this.f4626k = i2;
            this.f51409zy = i3;
            this.f4627q = -1;
        }

        /* JADX INFO: renamed from: k */
        boolean m4150k(int i2) {
            int i3;
            int i4 = this.f51409zy;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.f4627q) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i4 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i4 == 12 || i3 == 12) && i2 == 11;
        }

        g(String str, int i2, int i3, int i4) {
            this.f51408toq = str;
            this.f4626k = i2;
            this.f51409zy = i3;
            this.f4627q = i4;
        }
    }

    public C0846k(@lvui String str) throws Throwable {
        g[][] gVarArr = fjcj;
        this.f4617g = new HashMap[gVarArr.length];
        this.f51397f7l8 = new HashSet(gVarArr.length);
        this.f4625y = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            dd(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C0846k(@lvui FileDescriptor fileDescriptor) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        g[][] gVarArr = fjcj;
        this.f4617g = new HashMap[gVarArr.length];
        this.f51397f7l8 = new HashSet(gVarArr.length);
        this.f4625y = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f51407zy = null;
            this.f4620k = null;
            boolean z2 = false;
            if (uv6(fileDescriptor)) {
                this.f51405toq = fileDescriptor;
                try {
                    fileDescriptor = toq.C0847k.toq(fileDescriptor);
                    z2 = true;
                } catch (Exception e2) {
                    throw new IOException("Failed to duplicate file descriptor", e2);
                }
            } else {
                this.f51405toq = null;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    m4134m(fileInputStream);
                    androidx.exifinterface.media.toq.zy(fileInputStream);
                    if (z2) {
                        androidx.exifinterface.media.toq.toq(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    androidx.exifinterface.media.toq.zy(fileInputStream);
                    if (z2) {
                        androidx.exifinterface.media.toq.toq(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public C0846k(@lvui InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0846k(@zy.lvui java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.k$g[][] r0 = androidx.exifinterface.media.C0846k.fjcj
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f4617g = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f51397f7l8 = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f4625y = r0
            if (r4 == 0) goto L6f
            r0 = 0
            r3.f4620k = r0
            r1 = 1
            if (r5 != r1) goto L20
            r5 = r1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L41
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.C0846k.ym8
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = x9kr(r5)
            if (r4 != 0) goto L39
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L39:
            r3.f4621n = r1
            r3.f51407zy = r0
            r3.f51405toq = r0
            r4 = r5
            goto L6b
        L41:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L4d
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f51407zy = r5
            r3.f51405toq = r0
            goto L6b
        L4d:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L67
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = uv6(r1)
            if (r1 == 0) goto L67
            r3.f51407zy = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f51405toq = r5
            goto L6b
        L67:
            r3.f51407zy = r0
            r3.f51405toq = r0
        L6b:
            r3.m4134m(r4)
            return
        L6f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0846k.<init>(java.io.InputStream, int):void");
    }
}
