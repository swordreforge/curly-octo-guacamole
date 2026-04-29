package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.lrht;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class fn3e {

    /* JADX INFO: renamed from: n */
    private static final Pattern f19815n = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: q */
    private static final String f19816q = "iTunSMPB";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f63757zy = "com.apple.iTunes";

    /* JADX INFO: renamed from: k */
    public int f19817k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f63758toq = -1;

    private boolean toq(String str) {
        Matcher matcher = f19815n.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i2 = Integer.parseInt((String) lrht.ld6(matcher.group(1)), 16);
            int i3 = Integer.parseInt((String) lrht.ld6(matcher.group(2)), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f19817k = i2;
            this.f63758toq = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m11724k() {
        return (this.f19817k == -1 || this.f63758toq == -1) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m11725q(int i2) {
        int i3 = i2 >> 12;
        int i4 = i2 & 4095;
        if (i3 <= 0 && i4 <= 0) {
            return false;
        }
        this.f19817k = i3;
        this.f63758toq = i4;
        return true;
    }

    public boolean zy(Metadata metadata) {
        for (int i2 = 0; i2 < metadata.m12282g(); i2++) {
            Metadata.Entry entryZy = metadata.zy(i2);
            if (entryZy instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryZy;
                if (f19816q.equals(commentFrame.f20797n) && toq(commentFrame.f20796g)) {
                    return true;
                }
            } else if (entryZy instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryZy;
                if (f63757zy.equals(internalFrame.f20808q) && f19816q.equals(internalFrame.f20807n) && toq(internalFrame.f20806g)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
