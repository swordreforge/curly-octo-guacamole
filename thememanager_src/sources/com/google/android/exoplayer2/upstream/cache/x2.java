package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.database.C3288y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.collect.ab;
import com.google.common.collect.vep5;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import zy.dd;
import zy.y9n;
import zy.yz;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes2.dex */
class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final String f66792f7l8 = "cached_content_index.exi";

    /* JADX INFO: renamed from: y */
    private static final int f22947y = 10485760;

    /* JADX INFO: renamed from: g */
    @dd
    private zy f22948g;

    /* JADX INFO: renamed from: k */
    private final HashMap<String, ld6> f22949k;

    /* JADX INFO: renamed from: n */
    private zy f22950n;

    /* JADX INFO: renamed from: q */
    private final SparseBooleanArray f22951q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SparseArray<String> f66793toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final SparseBooleanArray f66794zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.x2$k */
    /* JADX INFO: compiled from: CachedContentIndex.java */
    private static final class C3782k implements zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f66795f7l8 = "id";

        /* JADX INFO: renamed from: g */
        private static final int f22952g = 1;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final String f66796kja0 = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f66797ld6 = 1;

        /* JADX INFO: renamed from: n */
        private static final String f22953n = "ExoPlayerCacheIndex";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final String[] f66798n7h = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: p */
        private static final int f22954p = 0;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final String f66799qrj = "id = ?";

        /* JADX INFO: renamed from: s */
        private static final String f22955s = "metadata";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f66800x2 = 2;

        /* JADX INFO: renamed from: y */
        private static final String f22956y = "key";

        /* JADX INFO: renamed from: k */
        private final com.google.android.exoplayer2.database.zy f22957k;

        /* JADX INFO: renamed from: q */
        private String f22958q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final SparseArray<ld6> f66801toq = new SparseArray<>();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f66802zy;

        public C3782k(com.google.android.exoplayer2.database.zy zyVar) {
            this.f22957k = zyVar;
        }

        private void kja0(SQLiteDatabase sQLiteDatabase) throws com.google.android.exoplayer2.database.toq {
            C3288y.m11561q(sQLiteDatabase, 1, (String) C3844k.f7l8(this.f66802zy), 1);
            x2(sQLiteDatabase, (String) C3844k.f7l8(this.f22958q));
            String str = this.f22958q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" ");
            sb.append(f66796kja0);
            sQLiteDatabase.execSQL(sb.toString());
        }

        private void ld6(SQLiteDatabase sQLiteDatabase, int i2) {
            sQLiteDatabase.delete((String) C3844k.f7l8(this.f22958q), f66799qrj, new String[]{Integer.toString(i2)});
        }

        private static String n7h(String str) {
            String strValueOf = String.valueOf(str);
            return strValueOf.length() != 0 ? f22953n.concat(strValueOf) : new String(f22953n);
        }

        /* JADX INFO: renamed from: p */
        private static void m13428p(com.google.android.exoplayer2.database.zy zyVar, String str) throws com.google.android.exoplayer2.database.toq {
            try {
                String strN7h = n7h(str);
                SQLiteDatabase writableDatabase = zyVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C3288y.zy(writableDatabase, 1, str);
                    x2(writableDatabase, strN7h);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new com.google.android.exoplayer2.database.toq(e2);
            }
        }

        private Cursor qrj() {
            return this.f22957k.getReadableDatabase().query((String) C3844k.f7l8(this.f22958q), f66798n7h, null, null, null, null, null);
        }

        /* JADX INFO: renamed from: s */
        public static void m13429s(com.google.android.exoplayer2.database.zy zyVar, long j2) throws com.google.android.exoplayer2.database.toq {
            m13428p(zyVar, Long.toHexString(j2));
        }

        private static void x2(SQLiteDatabase sQLiteDatabase, String str) {
            String strValueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
        }

        /* JADX INFO: renamed from: y */
        private void m13430y(SQLiteDatabase sQLiteDatabase, ld6 ld6Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            x2.zurt(ld6Var.m13399q(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(ld6Var.f22918k));
            contentValues.put("key", ld6Var.f66772toq);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C3844k.f7l8(this.f22958q), null, contentValues);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public boolean exists() throws com.google.android.exoplayer2.database.toq {
            return C3288y.toq(this.f22957k.getReadableDatabase(), 1, (String) C3844k.f7l8(this.f66802zy)) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void f7l8() throws com.google.android.exoplayer2.database.toq {
            m13428p(this.f22957k, (String) C3844k.f7l8(this.f66802zy));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: g */
        public void mo13431g(HashMap<String, ld6> map, SparseArray<String> sparseArray) throws IOException {
            C3844k.m13633s(this.f66801toq.size() == 0);
            try {
                if (C3288y.toq(this.f22957k.getReadableDatabase(), 1, (String) C3844k.f7l8(this.f66802zy)) != 1) {
                    SQLiteDatabase writableDatabase = this.f22957k.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        kja0(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorQrj = qrj();
                while (cursorQrj.moveToNext()) {
                    try {
                        ld6 ld6Var = new ld6(cursorQrj.getInt(0), (String) C3844k.f7l8(cursorQrj.getString(1)), x2.t8r(new DataInputStream(new ByteArrayInputStream(cursorQrj.getBlob(2)))));
                        map.put(ld6Var.f66772toq, ld6Var);
                        sparseArray.put(ld6Var.f22918k, ld6Var.f66772toq);
                    } finally {
                    }
                }
                cursorQrj.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new com.google.android.exoplayer2.database.toq(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: k */
        public void mo13432k(ld6 ld6Var, boolean z2) {
            if (z2) {
                this.f66801toq.delete(ld6Var.f22918k);
            } else {
                this.f66801toq.put(ld6Var.f22918k, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: n */
        public void mo13433n(ld6 ld6Var) {
            this.f66801toq.put(ld6Var.f22918k, ld6Var);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: q */
        public void mo13434q(HashMap<String, ld6> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f22957k.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kja0(writableDatabase);
                    Iterator<ld6> it = map.values().iterator();
                    while (it.hasNext()) {
                        m13430y(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f66801toq.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new com.google.android.exoplayer2.database.toq(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void toq(HashMap<String, ld6> map) throws IOException {
            if (this.f66801toq.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f22957k.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.f66801toq.size(); i2++) {
                    try {
                        ld6 ld6VarValueAt = this.f66801toq.valueAt(i2);
                        if (ld6VarValueAt == null) {
                            ld6(writableDatabase, this.f66801toq.keyAt(i2));
                        } else {
                            m13430y(writableDatabase, ld6VarValueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f66801toq.clear();
            } catch (SQLException e2) {
                throw new com.google.android.exoplayer2.database.toq(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void zy(long j2) {
            String hexString = Long.toHexString(j2);
            this.f66802zy = hexString;
            this.f22958q = n7h(hexString);
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    private static class toq implements zy {

        /* JADX INFO: renamed from: p */
        private static final int f22959p = 1;

        /* JADX INFO: renamed from: s */
        private static final int f22960s = 2;

        /* JADX INFO: renamed from: y */
        private static final int f22961y = 2;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @dd
        private t8r f66803f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f22962g;

        /* JADX INFO: renamed from: k */
        private final boolean f22963k;

        /* JADX INFO: renamed from: n */
        private final com.google.android.exoplayer2.util.toq f22964n;

        /* JADX INFO: renamed from: q */
        @dd
        private final SecureRandom f22965q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private final Cipher f66804toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private final SecretKeySpec f66805zy;

        public toq(File file, @dd byte[] bArr, boolean z2) {
            Cipher cipherM13420p;
            SecretKeySpec secretKeySpec;
            C3844k.m13633s((bArr == null && z2) ? false : true);
            if (bArr != null) {
                C3844k.m13629k(bArr.length == 16);
                try {
                    cipherM13420p = x2.m13420p();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                C3844k.m13629k(!z2);
                cipherM13420p = null;
                secretKeySpec = null;
            }
            this.f22963k = z2;
            this.f66804toq = cipherM13420p;
            this.f66805zy = secretKeySpec;
            this.f22965q = z2 ? new SecureRandom() : null;
            this.f22964n = new com.google.android.exoplayer2.util.toq(file);
        }

        private void ld6(ld6 ld6Var, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(ld6Var.f22918k);
            dataOutputStream.writeUTF(ld6Var.f66772toq);
            x2.zurt(ld6Var.m13399q(), dataOutputStream);
        }

        /* JADX INFO: renamed from: p */
        private boolean m13435p(HashMap<String, ld6> map, SparseArray<String> sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f22964n.zy()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f22964n.m13737q());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i2 = dataInputStream.readInt();
                if (i2 >= 0 && i2 <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f66804toq == null) {
                            lrht.m13659h(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.f66804toq.init(2, (Key) lrht.ld6(this.f66805zy), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f66804toq));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f22963k) {
                        this.f22962g = true;
                    }
                    int i3 = dataInputStream.readInt();
                    int iM13437y = 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ld6 ld6VarM13436s = m13436s(i2, dataInputStream);
                        map.put(ld6VarM13436s.f66772toq, ld6VarM13436s);
                        sparseArray.put(ld6VarM13436s.f22918k, ld6VarM13436s.f66772toq);
                        iM13437y += m13437y(ld6VarM13436s, i2);
                    }
                    int i5 = dataInputStream.readInt();
                    boolean z2 = dataInputStream.read() == -1;
                    if (i5 == iM13437y && z2) {
                        lrht.m13659h(dataInputStream);
                        return true;
                    }
                    lrht.m13659h(dataInputStream);
                    return false;
                }
                lrht.m13659h(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    lrht.m13659h(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    lrht.m13659h(dataInputStream2);
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: s */
        private ld6 m13436s(int i2, DataInputStream dataInputStream) throws IOException {
            kja0 kja0VarT8r;
            int i3 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i2 < 2) {
                long j2 = dataInputStream.readLong();
                n7h n7hVar = new n7h();
                n7h.m13405y(n7hVar, j2);
                kja0VarT8r = kja0.f22914g.m13394y(n7hVar);
            } else {
                kja0VarT8r = x2.t8r(dataInputStream);
            }
            return new ld6(i3, utf, kja0VarT8r);
        }

        private void x2(HashMap<String, ld6> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamM13735g = this.f22964n.m13735g();
                t8r t8rVar = this.f66803f7l8;
                if (t8rVar == null) {
                    this.f66803f7l8 = new t8r(outputStreamM13735g);
                } else {
                    t8rVar.m13415k(outputStreamM13735g);
                }
                t8r t8rVar2 = this.f66803f7l8;
                DataOutputStream dataOutputStream2 = new DataOutputStream(t8rVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iM13437y = 0;
                    dataOutputStream2.writeInt(this.f22963k ? 1 : 0);
                    if (this.f22963k) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) lrht.ld6(this.f22965q)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) lrht.ld6(this.f66804toq)).init(1, (Key) lrht.ld6(this.f66805zy), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(t8rVar2, this.f66804toq));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (ld6 ld6Var : map.values()) {
                        ld6(ld6Var, dataOutputStream2);
                        iM13437y += m13437y(ld6Var, 2);
                    }
                    dataOutputStream2.writeInt(iM13437y);
                    this.f22964n.toq(dataOutputStream2);
                    lrht.m13659h(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    lrht.m13659h(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: y */
        private int m13437y(ld6 ld6Var, int i2) {
            int i3;
            int iHashCode;
            int iHashCode2 = (ld6Var.f22918k * 31) + ld6Var.f66772toq.hashCode();
            if (i2 < 2) {
                long jM13413n = qrj.m13413n(ld6Var.m13399q());
                i3 = iHashCode2 * 31;
                iHashCode = (int) (jM13413n ^ (jM13413n >>> 32));
            } else {
                i3 = iHashCode2 * 31;
                iHashCode = ld6Var.m13399q().hashCode();
            }
            return i3 + iHashCode;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public boolean exists() {
            return this.f22964n.zy();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void f7l8() {
            this.f22964n.m13736k();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: g */
        public void mo13431g(HashMap<String, ld6> map, SparseArray<String> sparseArray) {
            C3844k.m13633s(!this.f22962g);
            if (m13435p(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f22964n.m13736k();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: k */
        public void mo13432k(ld6 ld6Var, boolean z2) {
            this.f22962g = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: n */
        public void mo13433n(ld6 ld6Var) {
            this.f22962g = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        /* JADX INFO: renamed from: q */
        public void mo13434q(HashMap<String, ld6> map) throws Throwable {
            x2(map);
            this.f22962g = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void toq(HashMap<String, ld6> map) throws Throwable {
            if (this.f22962g) {
                mo13434q(map);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.x2.zy
        public void zy(long j2) {
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    private interface zy {
        boolean exists() throws IOException;

        void f7l8() throws IOException;

        /* JADX INFO: renamed from: g */
        void mo13431g(HashMap<String, ld6> map, SparseArray<String> sparseArray) throws IOException;

        /* JADX INFO: renamed from: k */
        void mo13432k(ld6 ld6Var, boolean z2);

        /* JADX INFO: renamed from: n */
        void mo13433n(ld6 ld6Var);

        /* JADX INFO: renamed from: q */
        void mo13434q(HashMap<String, ld6> map) throws IOException;

        void toq(HashMap<String, ld6> map) throws IOException;

        void zy(long j2);
    }

    public x2(com.google.android.exoplayer2.database.zy zyVar) {
        this(zyVar, null, null, false, false);
    }

    public static boolean cdj(String str) {
        return str.startsWith(f66792f7l8);
    }

    @y9n
    public static void f7l8(com.google.android.exoplayer2.database.zy zyVar, long j2) throws com.google.android.exoplayer2.database.toq {
        C3782k.m13429s(zyVar, j2);
    }

    @yz
    static int n7h(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i2 < size && i2 == sparseArray.keyAt(i2)) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"GetInstance"})
    /* JADX INFO: renamed from: p */
    public static Cipher m13420p() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (lrht.f23230k == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* JADX INFO: renamed from: q */
    private ld6 m13421q(String str) {
        int iN7h = n7h(this.f66793toq);
        ld6 ld6Var = new ld6(iN7h, str);
        this.f22949k.put(str, ld6Var);
        this.f66793toq.put(iN7h, str);
        this.f22951q.put(iN7h, true);
        this.f22950n.mo13433n(ld6Var);
        return ld6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kja0 t8r(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i4 = dataInputStream.readInt();
            if (i4 < 0) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid value size: ");
                sb.append(i4);
                throw new IOException(sb.toString());
            }
            int iMin = Math.min(i4, f22947y);
            byte[] bArrCopyOf = lrht.f23228g;
            int i5 = 0;
            while (i5 != i4) {
                int i6 = i5 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                dataInputStream.readFully(bArrCopyOf, i5, iMin);
                iMin = Math.min(i4 - i6, f22947y);
                i5 = i6;
            }
            map.put(utf, bArrCopyOf);
        }
        return new kja0(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zurt(kja0 kja0Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setM13393s = kja0Var.m13393s();
        dataOutputStream.writeInt(setM13393s.size());
        for (Map.Entry<String, byte[]> entry : setM13393s) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @y9n
    public void fn3e() throws IOException {
        this.f22950n.toq(this.f22949k);
        int size = this.f66794zy.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f66793toq.remove(this.f66794zy.keyAt(i2));
        }
        this.f66794zy.clear();
        this.f22951q.clear();
    }

    /* JADX INFO: renamed from: g */
    public int m13422g(String str) {
        return kja0(str).f22918k;
    }

    @y9n
    /* JADX INFO: renamed from: h */
    public void m13423h(long j2) throws IOException {
        zy zyVar;
        this.f22950n.zy(j2);
        zy zyVar2 = this.f22948g;
        if (zyVar2 != null) {
            zyVar2.zy(j2);
        }
        if (this.f22950n.exists() || (zyVar = this.f22948g) == null || !zyVar.exists()) {
            this.f22950n.mo13431g(this.f22949k, this.f66793toq);
        } else {
            this.f22948g.mo13431g(this.f22949k, this.f66793toq);
            this.f22950n.mo13434q(this.f22949k);
        }
        zy zyVar3 = this.f22948g;
        if (zyVar3 != null) {
            zyVar3.f7l8();
            this.f22948g = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m13424i() {
        ab it = vep5.copyOf((Collection) this.f22949k.keySet()).iterator();
        while (it.hasNext()) {
            ki((String) it.next());
        }
    }

    public void ki(String str) {
        ld6 ld6Var = this.f22949k.get(str);
        if (ld6Var != null && ld6Var.f7l8() && ld6Var.m13400s()) {
            this.f22949k.remove(str);
            int i2 = ld6Var.f22918k;
            boolean z2 = this.f22951q.get(i2);
            this.f22950n.mo13432k(ld6Var, z2);
            if (z2) {
                this.f66793toq.remove(i2);
                this.f22951q.delete(i2);
            } else {
                this.f66793toq.put(i2, null);
                this.f66794zy.put(i2, true);
            }
        }
    }

    public ld6 kja0(String str) {
        ld6 ld6Var = this.f22949k.get(str);
        return ld6Var == null ? m13421q(str) : ld6Var;
    }

    public qrj ld6(String str) {
        ld6 ld6VarM13427y = m13427y(str);
        return ld6VarM13427y != null ? ld6VarM13427y.m13399q() : kja0.f22914g;
    }

    /* JADX INFO: renamed from: n */
    public void m13425n(String str, n7h n7hVar) {
        ld6 ld6VarKja0 = kja0(str);
        if (ld6VarKja0.toq(n7hVar)) {
            this.f22950n.mo13433n(ld6VarKja0);
        }
    }

    public Set<String> qrj() {
        return this.f22949k.keySet();
    }

    /* JADX INFO: renamed from: s */
    public Collection<ld6> m13426s() {
        return Collections.unmodifiableCollection(this.f22949k.values());
    }

    @dd
    public String x2(int i2) {
        return this.f66793toq.get(i2);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public ld6 m13427y(String str) {
        return this.f22949k.get(str);
    }

    public x2(@dd com.google.android.exoplayer2.database.zy zyVar, @dd File file, @dd byte[] bArr, boolean z2, boolean z3) {
        C3844k.m13633s((zyVar == null && file == null) ? false : true);
        this.f22949k = new HashMap<>();
        this.f66793toq = new SparseArray<>();
        this.f66794zy = new SparseBooleanArray();
        this.f22951q = new SparseBooleanArray();
        C3782k c3782k = zyVar != null ? new C3782k(zyVar) : null;
        toq toqVar = file != null ? new toq(new File(file, f66792f7l8), bArr, z2) : null;
        if (c3782k == null || (toqVar != null && z3)) {
            this.f22950n = (zy) lrht.ld6(toqVar);
            this.f22948g = c3782k;
        } else {
            this.f22950n = c3782k;
            this.f22948g = toqVar;
        }
    }
}
