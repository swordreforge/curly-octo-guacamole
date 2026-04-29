package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qkj8 extends IOException {
    public qkj8(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    static qkj8 m21389a() {
        return new qkj8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    static qkj8 m21390b() {
        return new qkj8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    static qkj8 m21391c() {
        return new qkj8("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    static qkj8 m21392d() {
        return new qkj8("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: e */
    static qkj8 m21393e() {
        return new qkj8("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: f */
    static qkj8 m21394f() {
        return new qkj8("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: g */
    static qkj8 m21395g() {
        return new qkj8("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: h */
    static qkj8 m21396h() {
        return new qkj8("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
