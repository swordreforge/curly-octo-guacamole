# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# 保留行号信息以便调试
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# 保留注解
-keepattributes *Annotation*

# ===== Jetpack Compose 规则（优化版）=====
# 只保留必要的 Compose 类，允许混淆其他部分
-keep,allowobfuscation @androidx.compose.runtime.Composable class * { *; }
-keep,allowobfuscation @androidx.compose.runtime.Composable interface * { *; }

# 保留 Compose 运行时关键类
-keep class androidx.compose.runtime.** { *; }
-keep class androidx.compose.ui.platform.** { *; }

# 允许优化和混淆其他 Compose 类
-dontwarn androidx.compose.**

# ===== Kotlin 规则（优化版）=====
# 只保留元数据，允许其他部分混淆
-keep class kotlin.Metadata { *; }
-keep class kotlin.reflect.** { *; }

# 保留协程关键类
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembers class kotlinx.coroutines.** {
    volatile <fields>;
}

# 允许优化 Kotlin 标准库
-dontwarn kotlin.**

# ===== Miuix 规则（优化版）=====
-keep,allowobfuscation class top.yukonga.miuix.** { *; }
-dontwarn top.yukonga.miuix.**

# ===== Coil 图片加载规则（优化版）=====
-keep,allowobfuscation class coil.** { *; }
-dontwarn coil.**

# ===== 序列化规则 =====
-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# 保留泛型
-keepattributes Signature

# ===== 反射规则 =====
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# 保留枚举
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# 保留 Parcelable
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# 保留 Serializable
-keepnames class * implements java.io.Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# ===== 项目特定规则（优化版）=====
# 允许混淆项目代码，但保留关键类
-keep,allowobfuscation class com.merak.** { *; }
-keep,allowobfuscation interface com.merak.** { *; }

# 保留 BuildConfig（不混淆）
-keep class com.merak.BuildConfig { *; }

# 保留 R 类（不混淆）
-keep class **.R
-keep class **.R$* {
    public static <fields>;
}

# ===== 优化规则 =====
# 移除 Log 调用（Release 版本）
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}

# 移除不必要的空检查
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
    public static void checkNotNull(...);
    public static void checkExpressionValueIsNotNull(...);
    public static void checkNotNullExpressionValue(...);
    public static void checkParameterIsNotNull(...);
    public static void checkNotNullParameter(...);
    public static void checkReturnedValueIsNotNull(...);
    public static void checkFieldIsNotNull(...);
}

# ===== Android 系统组件规则 =====
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.view.View

# 保留无障碍服务
-keep class * extends android.accessibilityservice.AccessibilityService {
    public <init>(...);
    public <methods>;
}

# ===== 警告抑制 =====
-dontwarn org.jetbrains.annotations.**
-dontwarn javax.annotation.**
-dontwarn java.lang.instrument.ClassFileTransformer
