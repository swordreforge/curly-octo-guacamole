package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.clientreport.data.C5625q;
import com.xiaomi.push.C5890q;
import com.xiaomi.push.cn02;
import com.xiaomi.push.ek5k;
import com.xiaomi.push.f26p;
import com.xiaomi.push.n5r1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
public class zy implements InterfaceC5634k {

    /* JADX INFO: renamed from: k */
    protected Context f31301k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashMap<String, ArrayList<C5625q>> f73118toq;

    public zy(Context context) {
        m19354y(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        com.xiaomi.channel.commonutils.logger.zy.jk("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> f7l8(java.lang.String r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
        L15:
            int r9 = r5.read(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r4 = -1
            if (r9 != r4) goto L1d
            goto L6e
        L1d:
            java.lang.String r6 = "eventData read from cache file failed because magicNumber error"
            if (r9 == r1) goto L25
            com.xiaomi.channel.commonutils.logger.zy.jk(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L25:
            int r9 = com.xiaomi.push.C5890q.m21388k(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r7 = -573785174(0xffffffffddccbbaa, float:-1.8440715E18)
            if (r9 == r7) goto L32
            com.xiaomi.channel.commonutils.logger.zy.jk(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L32:
            int r9 = r5.read(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r9 != r4) goto L39
            goto L6e
        L39:
            if (r9 == r1) goto L41
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer error"
            com.xiaomi.channel.commonutils.logger.zy.jk(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L41:
            int r9 = com.xiaomi.push.C5890q.m21388k(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r4 = 1
            if (r9 < r4) goto L69
            r4 = 4096(0x1000, float:5.74E-42)
            if (r9 <= r4) goto L4d
            goto L69
        L4d:
            byte[] r4 = new byte[r9]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            int r6 = r5.read(r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r6 == r9) goto L5b
            java.lang.String r9 = "eventData read from cache file failed cause buffer size not equal length"
            com.xiaomi.channel.commonutils.logger.zy.jk(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L6e
        L5b:
            java.lang.String r9 = r8.mo19345q(r4)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            if (r4 != 0) goto L15
            r0.add(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            goto L15
        L69:
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K"
            com.xiaomi.channel.commonutils.logger.zy.jk(r9)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
        L6e:
            com.xiaomi.push.f26p.toq(r5)
            goto L81
        L72:
            r9 = move-exception
            r4 = r5
            goto L82
        L75:
            r9 = move-exception
            r4 = r5
            goto L7b
        L78:
            r9 = move-exception
            goto L82
        L7a:
            r9 = move-exception
        L7b:
            com.xiaomi.channel.commonutils.logger.zy.t8r(r9)     // Catch: java.lang.Throwable -> L78
            com.xiaomi.push.f26p.toq(r4)
        L81:
            return r0
        L82:
            com.xiaomi.push.f26p.toq(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.zy.f7l8(java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: g */
    public static String m19351g(C5625q c5625q) {
        return String.valueOf(c5625q.f31272k);
    }

    private String n7h(C5625q c5625q) {
        File file = new File(this.f31301k.getFilesDir(), "event");
        String str = file.getAbsolutePath() + File.separator + m19351g(c5625q);
        for (int i2 = 0; i2 < 100; i2++) {
            String str2 = str + i2;
            if (ek5k.f7l8(this.f31301k, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private void m19352p(String str, String str2) {
        com.xiaomi.clientreport.data.toq toqVarM19332q = com.xiaomi.clientreport.manager.toq.m19328n(this.f31301k).m19332q(5001, "24:" + str + "," + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(toqVarM19332q.mo19316n());
        ld6(arrayList);
    }

    private C5625q[] qrj(C5625q[] c5625qArr) throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        int i2;
        int i3;
        String strN7h = n7h(c5625qArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(strN7h)) {
            return null;
        }
        try {
            File file = new File(strN7h + ".lock");
            f26p.m20828g(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
            } catch (Exception e2) {
                e = e2;
                fileLockLock = null;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileLockLock = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileLockLock = null;
            randomAccessFile = null;
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileLockLock = null;
            randomAccessFile = null;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(strN7h), true));
            try {
                try {
                    i3 = 0;
                } catch (Exception e4) {
                    e = e4;
                    com.xiaomi.channel.commonutils.logger.zy.cdj("event data write to cache file failed cause exception", e);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream2 = bufferedOutputStream;
                f26p.toq(bufferedOutputStream2);
                m19353s(randomAccessFile, fileLockLock);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            f26p.toq(bufferedOutputStream2);
            m19353s(randomAccessFile, fileLockLock);
            throw th;
        }
        for (C5625q c5625q : c5625qArr) {
            if (c5625q != null) {
                byte[] bArrMo19344n = mo19344n(c5625q.mo19316n());
                if (bArrMo19344n != null && bArrMo19344n.length >= 1 && bArrMo19344n.length <= 4096) {
                    if (!ek5k.f7l8(this.f31301k, strN7h)) {
                        int length = c5625qArr.length - i3;
                        C5625q[] c5625qArr2 = new C5625q[length];
                        System.arraycopy(c5625qArr, i3, c5625qArr2, 0, length);
                        f26p.toq(bufferedOutputStream);
                        m19353s(randomAccessFile, fileLockLock);
                        return c5625qArr2;
                    }
                    bufferedOutputStream.write(C5890q.toq(-573785174));
                    bufferedOutputStream.write(C5890q.toq(bArrMo19344n.length));
                    bufferedOutputStream.write(bArrMo19344n);
                    bufferedOutputStream.flush();
                    i3++;
                    f26p.toq(bufferedOutputStream);
                    m19353s(randomAccessFile, fileLockLock);
                    return null;
                }
                com.xiaomi.channel.commonutils.logger.zy.jk("event data throw a invalid item ");
            }
        }
        f26p.toq(bufferedOutputStream);
        m19353s(randomAccessFile, fileLockLock);
        return null;
    }

    /* JADX INFO: renamed from: s */
    private void m19353s(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }
        f26p.toq(randomAccessFile);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[PHI: r3 r4 r5
      0x0036: PHI (r3v10 java.nio.channels.FileLock) = (r3v3 java.nio.channels.FileLock), (r3v1 java.nio.channels.FileLock), (r3v1 java.nio.channels.FileLock) binds: [B:65:0x0108, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r4v14 java.io.RandomAccessFile) = (r4v3 java.io.RandomAccessFile), (r4v1 java.io.RandomAccessFile), (r4v1 java.io.RandomAccessFile) binds: [B:65:0x0108, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r5v9 java.io.File) = (r5v3 java.io.File), (r5v1 java.io.File), (r5v1 java.io.File) binds: [B:65:0x0108, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.clientreport.processor.InterfaceC5635n
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo19346a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.zy.mo19346a():void");
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5633g
    /* JADX INFO: renamed from: b */
    public void mo19342b() throws Throwable {
        HashMap<String, ArrayList<C5625q>> map = this.f73118toq;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f73118toq.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<C5625q> arrayList = this.f73118toq.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    C5625q[] c5625qArr = new C5625q[arrayList.size()];
                    arrayList.toArray(c5625qArr);
                    x2(c5625qArr);
                }
            }
        }
        this.f73118toq.clear();
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5634k
    /* JADX INFO: renamed from: k */
    public void mo19343k(HashMap<String, ArrayList<C5625q>> map) {
        this.f73118toq = map;
    }

    public void ld6(List<String> list) {
        ek5k.m20775n(this.f31301k, list);
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5634k
    /* JADX INFO: renamed from: n */
    public byte[] mo19344n(String str) {
        byte[] bArrM20778y;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.toq.m19328n(this.f31301k).zy().m19304g()) {
            return n5r1.m21304p(str);
        }
        String qVar = ek5k.toq(this.f31301k);
        byte[] bArrM21304p = n5r1.m21304p(str);
        if (!TextUtils.isEmpty(qVar) && bArrM21304p != null && bArrM21304p.length > 1 && (bArrM20778y = ek5k.m20778y(qVar)) != null) {
            try {
                if (bArrM20778y.length > 1) {
                    return cn02.zy(bArrM20778y, Base64.encode(bArrM21304p, 2));
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5634k
    /* JADX INFO: renamed from: q */
    public String mo19345q(byte[] bArr) {
        byte[] bArrM20778y;
        if (bArr != null && bArr.length >= 1) {
            if (!com.xiaomi.clientreport.manager.toq.m19328n(this.f31301k).zy().m19304g()) {
                return n5r1.x2(bArr);
            }
            String qVar = ek5k.toq(this.f31301k);
            if (!TextUtils.isEmpty(qVar) && (bArrM20778y = ek5k.m20778y(qVar)) != null && bArrM20778y.length > 0) {
                try {
                    return n5r1.x2(Base64.decode(cn02.toq(bArrM20778y, bArr), 2));
                } catch (InvalidAlgorithmParameterException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                } catch (InvalidKeyException e3) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                } catch (NoSuchAlgorithmException e4) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e4);
                } catch (BadPaddingException e6) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e6);
                } catch (IllegalBlockSizeException e7) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e7);
                } catch (NoSuchPaddingException e8) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e8);
                }
            }
        }
        return null;
    }

    public void x2(C5625q[] c5625qArr) throws Throwable {
        if (c5625qArr == null || c5625qArr.length == 0 || c5625qArr[0] == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("event data write to cache file failed because data null");
            return;
        }
        do {
            c5625qArr = qrj(c5625qArr);
            if (c5625qArr == null || c5625qArr.length <= 0) {
                return;
            }
        } while (c5625qArr[0] != null);
    }

    /* JADX INFO: renamed from: y */
    public void m19354y(Context context) {
        this.f31301k = context;
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5633g
    public void zy(C5625q c5625q) {
        if ((c5625q instanceof com.xiaomi.clientreport.data.toq) && this.f73118toq != null) {
            com.xiaomi.clientreport.data.toq toqVar = (com.xiaomi.clientreport.data.toq) c5625q;
            String strM19351g = m19351g(toqVar);
            ArrayList<C5625q> arrayList = this.f73118toq.get(strM19351g);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(toqVar);
            this.f73118toq.put(strM19351g, arrayList);
        }
    }
}
