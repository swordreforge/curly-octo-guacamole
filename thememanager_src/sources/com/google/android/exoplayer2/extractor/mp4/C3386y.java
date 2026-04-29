package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.fn3e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import zy.dd;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.y */
/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3386y {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f64304a9 = 3;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64305cdj = 1953655662;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64306f7l8 = 7630703;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64307fn3e = 1936682605;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    @yz
    static final String[] f64308fti = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", com.google.common.net.zy.f68519ikck, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f64309fu4 = 1936679265;

    /* JADX INFO: renamed from: g */
    private static final int f20085g = 4280916;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f64310gvn7 = 253;

    /* JADX INFO: renamed from: h */
    private static final int f20086h = 1684632427;

    /* JADX INFO: renamed from: i */
    private static final int f20087i = 1631670868;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f64311jk = 757935405;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f64312jp0y = 169;

    /* JADX INFO: renamed from: k */
    private static final String f20088k = "MetadataUtil";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64313ki = 1953329263;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64314kja0 = 6779504;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64315ld6 = 7108978;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f64316mcp = 1953919848;

    /* JADX INFO: renamed from: n */
    private static final int f20089n = 6578553;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64317n7h = 1735291493;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f64318ni7 = 1936679282;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f64319o1t = 1920233063;

    /* JADX INFO: renamed from: p */
    private static final int f20090p = 7828084;

    /* JADX INFO: renamed from: q */
    private static final int f20091q = 6516084;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64320qrj = 1668249202;

    /* JADX INFO: renamed from: s */
    private static final int f20092s = 6516589;

    /* JADX INFO: renamed from: t */
    private static final int f20093t = 1936683886;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64321t8r = 1668311404;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f64322toq = 7233901;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f64323wvg = 1885823344;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64324x2 = 6776174;

    /* JADX INFO: renamed from: y */
    private static final int f20094y = 6384738;

    /* JADX INFO: renamed from: z */
    private static final int f20095z = 1936679791;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f64325zurt = 1936679276;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f64326zy = 7631467;

    private C3386y() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame f7l8(com.google.android.exoplayer2.util.gvn7 r3) {
        /*
            int r3 = m11891p(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.google.android.exoplayer2.extractor.mp4.C3386y.f64308fti
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.exoplayer2.util.ni7.qrj(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.C3386y.f7l8(com.google.android.exoplayer2.util.gvn7):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static MdtaMetadataEntry m11888g(gvn7 gvn7Var, int i2, String str) {
        while (true) {
            int iM13596n = gvn7Var.m13596n();
            if (iM13596n >= i2) {
                return null;
            }
            int iKja0 = gvn7Var.kja0();
            if (gvn7Var.kja0() == 1684108385) {
                int iKja02 = gvn7Var.kja0();
                int iKja03 = gvn7Var.kja0();
                int i3 = iKja0 - 16;
                byte[] bArr = new byte[i3];
                gvn7Var.ld6(bArr, 0, i3);
                return new MdtaMetadataEntry(str, bArr, iKja03, iKja02);
            }
            gvn7Var.n5r1(iM13596n + iKja0);
        }
    }

    @dd
    /* JADX INFO: renamed from: k */
    private static CommentFrame m11889k(int i2, gvn7 gvn7Var) {
        int iKja0 = gvn7Var.kja0();
        if (gvn7Var.kja0() == 1684108385) {
            gvn7Var.hyr(8);
            String strM13601t = gvn7Var.m13601t(iKja0 - 16);
            return new CommentFrame(C3548p.f65138bwp, strM13601t, strM13601t);
        }
        String strValueOf = String.valueOf(AbstractC3373k.m11849k(i2));
        ni7.qrj(f20088k, strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static void ld6(int i2, fn3e fn3eVar, xwq3.toq toqVar) {
        if (i2 == 1 && fn3eVar.m11724k()) {
            toqVar.m13947r(fn3eVar.f19817k).dd(fn3eVar.f63758toq);
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static Id3Frame m11890n(gvn7 gvn7Var, int i2) {
        int i3 = -1;
        int i4 = -1;
        String strM13601t = null;
        String strM13601t2 = null;
        while (gvn7Var.m13596n() < i2) {
            int iM13596n = gvn7Var.m13596n();
            int iKja0 = gvn7Var.kja0();
            int iKja02 = gvn7Var.kja0();
            gvn7Var.hyr(4);
            if (iKja02 == 1835360622) {
                strM13601t = gvn7Var.m13601t(iKja0 - 12);
            } else if (iKja02 == 1851878757) {
                strM13601t2 = gvn7Var.m13601t(iKja0 - 12);
            } else {
                if (iKja02 == 1684108385) {
                    i3 = iM13596n;
                    i4 = iKja0;
                }
                gvn7Var.hyr(iKja0 - 12);
            }
        }
        if (strM13601t == null || strM13601t2 == null || i3 == -1) {
            return null;
        }
        gvn7Var.n5r1(i3);
        gvn7Var.hyr(16);
        return new InternalFrame(strM13601t, strM13601t2, gvn7Var.m13601t(i4 - 16));
    }

    /* JADX INFO: renamed from: p */
    private static int m11891p(gvn7 gvn7Var) {
        gvn7Var.hyr(4);
        if (gvn7Var.kja0() == 1684108385) {
            gvn7Var.hyr(8);
            return gvn7Var.jp0y();
        }
        ni7.qrj(f20088k, "Failed to parse uint8 attribute value");
        return -1;
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static TextInformationFrame m11892q(int i2, String str, gvn7 gvn7Var) {
        int iKja0 = gvn7Var.kja0();
        if (gvn7Var.kja0() == 1684108385 && iKja0 >= 22) {
            gvn7Var.hyr(10);
            int iLvui = gvn7Var.lvui();
            if (iLvui > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iLvui);
                String string = sb.toString();
                int iLvui2 = gvn7Var.lvui();
                if (iLvui2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iLvui2);
                    string = sb2.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(AbstractC3373k.m11849k(i2));
        ni7.qrj(f20088k, strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @dd
    /* JADX INFO: renamed from: s */
    private static Id3Frame m11893s(int i2, String str, gvn7 gvn7Var, boolean z2, boolean z3) {
        int iM11891p = m11891p(gvn7Var);
        if (z3) {
            iM11891p = Math.min(1, iM11891p);
        }
        if (iM11891p >= 0) {
            return z2 ? new TextInformationFrame(str, null, Integer.toString(iM11891p)) : new CommentFrame(C3548p.f65138bwp, str, Integer.toString(iM11891p));
        }
        String strValueOf = String.valueOf(AbstractC3373k.m11849k(i2));
        ni7.qrj(f20088k, strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    @dd
    private static ApicFrame toq(gvn7 gvn7Var) {
        int iKja0 = gvn7Var.kja0();
        if (gvn7Var.kja0() != 1684108385) {
            ni7.qrj(f20088k, "Failed to parse cover art attribute");
            return null;
        }
        int qVar = AbstractC3373k.toq(gvn7Var.kja0());
        String str = qVar == 13 ? wvg.f67136tfm : qVar == 14 ? "image/png" : null;
        if (str == null) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unrecognized cover art flags: ");
            sb.append(qVar);
            ni7.qrj(f20088k, sb.toString());
            return null;
        }
        gvn7Var.hyr(4);
        int i2 = iKja0 - 16;
        byte[] bArr = new byte[i2];
        gvn7Var.ld6(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void x2(int r5, @zy.dd com.google.android.exoplayer2.metadata.Metadata r6, @zy.dd com.google.android.exoplayer2.metadata.Metadata r7, com.google.android.exoplayer2.xwq3.toq r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
        /*
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.m12282g()
            if (r5 >= r6) goto L3c
            com.google.android.exoplayer2.metadata.Metadata$Entry r6 = r7.zy(r5)
            boolean r3 = r6 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r6 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.f20833k
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.toq(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.m12282g()
            if (r5 <= 0) goto L52
            r8.uv6(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.C3386y.x2(int, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.xwq3$toq, com.google.android.exoplayer2.metadata.Metadata[]):void");
    }

    @dd
    /* JADX INFO: renamed from: y */
    private static TextInformationFrame m11894y(int i2, String str, gvn7 gvn7Var) {
        int iKja0 = gvn7Var.kja0();
        if (gvn7Var.kja0() == 1684108385) {
            gvn7Var.hyr(8);
            return new TextInformationFrame(str, null, gvn7Var.m13601t(iKja0 - 16));
        }
        String strValueOf = String.valueOf(AbstractC3373k.m11849k(i2));
        ni7.qrj(f20088k, strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    @dd
    public static Metadata.Entry zy(gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n() + gvn7Var.kja0();
        int iKja0 = gvn7Var.kja0();
        int i2 = (iKja0 >> 24) & 255;
        try {
            if (i2 == f64312jp0y || i2 == f64310gvn7) {
                int i3 = 16777215 & iKja0;
                if (i3 == f20091q) {
                    return m11889k(iKja0, gvn7Var);
                }
                if (i3 == f64322toq || i3 == f64326zy) {
                    return m11894y(iKja0, "TIT2", gvn7Var);
                }
                if (i3 == f20092s || i3 == f20090p) {
                    return m11894y(iKja0, "TCOM", gvn7Var);
                }
                if (i3 == f20089n) {
                    return m11894y(iKja0, "TDRC", gvn7Var);
                }
                if (i3 == f20085g) {
                    return m11894y(iKja0, "TPE1", gvn7Var);
                }
                if (i3 == f64306f7l8) {
                    return m11894y(iKja0, "TSSE", gvn7Var);
                }
                if (i3 == f20094y) {
                    return m11894y(iKja0, "TALB", gvn7Var);
                }
                if (i3 == f64315ld6) {
                    return m11894y(iKja0, "USLT", gvn7Var);
                }
                if (i3 == f64324x2) {
                    return m11894y(iKja0, "TCON", gvn7Var);
                }
                if (i3 == f64314kja0) {
                    return m11894y(iKja0, "TIT1", gvn7Var);
                }
            } else {
                if (iKja0 == f64317n7h) {
                    return f7l8(gvn7Var);
                }
                if (iKja0 == f20086h) {
                    return m11892q(iKja0, "TPOS", gvn7Var);
                }
                if (iKja0 == f64305cdj) {
                    return m11892q(iKja0, "TRCK", gvn7Var);
                }
                if (iKja0 == f64313ki) {
                    return m11893s(iKja0, "TBPM", gvn7Var, true, false);
                }
                if (iKja0 == f64321t8r) {
                    return m11893s(iKja0, "TCMP", gvn7Var, true, true);
                }
                if (iKja0 == f64320qrj) {
                    return toq(gvn7Var);
                }
                if (iKja0 == f20087i) {
                    return m11894y(iKja0, "TPE2", gvn7Var);
                }
                if (iKja0 == f64307fn3e) {
                    return m11894y(iKja0, "TSOT", gvn7Var);
                }
                if (iKja0 == f64325zurt) {
                    return m11894y(iKja0, "TSO2", gvn7Var);
                }
                if (iKja0 == f64318ni7) {
                    return m11894y(iKja0, "TSOA", gvn7Var);
                }
                if (iKja0 == f64309fu4) {
                    return m11894y(iKja0, "TSOP", gvn7Var);
                }
                if (iKja0 == f20095z) {
                    return m11894y(iKja0, "TSOC", gvn7Var);
                }
                if (iKja0 == f64319o1t) {
                    return m11893s(iKja0, "ITUNESADVISORY", gvn7Var, false, false);
                }
                if (iKja0 == f64323wvg) {
                    return m11893s(iKja0, "ITUNESGAPLESS", gvn7Var, false, true);
                }
                if (iKja0 == f20093t) {
                    return m11894y(iKja0, "TVSHOWSORT", gvn7Var);
                }
                if (iKja0 == f64316mcp) {
                    return m11894y(iKja0, "TVSHOW", gvn7Var);
                }
                if (iKja0 == f64311jk) {
                    return m11890n(gvn7Var, iM13596n);
                }
            }
            String strValueOf = String.valueOf(AbstractC3373k.m11849k(iKja0));
            ni7.toq(f20088k, strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            gvn7Var.n5r1(iM13596n);
        }
    }
}
