plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
}

android {
    namespace = "com.merak"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.merak"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        
        buildConfigField("long", "BUILD_TIMESTAMP", "${System.currentTimeMillis()}L")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            isDebuggable = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            
            // 优化选项
            ndk {
                debugSymbolLevel = "NONE"
            }
        }
        debug {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
    
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "/META-INF/versions/**"
            excludes += "/META-INF/*.version"
            excludes += "/META-INF/*.properties"
            excludes += "/META-INF/LICENSE*"
            excludes += "/META-INF/NOTICE*"
            excludes += "/*.txt"
            excludes += "/*.bin"
            excludes += "/kotlin/**/*.kotlin_builtins"
            excludes += "/okhttp3/**/publicsuffix.gz"
        }
        jniLibs {
            // 只保留 arm64-v8a 架构（现代设备）
            pickFirsts += "**/*.so"
        }
    }
    
    bundle {
        language {
            enableSplit = false
        }
        density {
            enableSplit = true
        }
        abi {
            enableSplit = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "2.0.20"
    }
}

dependencies {
    // Compose 核心依赖（精简版）
    val composeBom = platform("androidx.compose:compose-bom:2024.11.00")
    implementation(composeBom)
    
    // 只引入必要的 Compose 模块
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.navigation:navigation-compose:2.8.5")
    
    // Miuix UI 组件
    implementation("top.yukonga.miuix.kmp:miuix-android:0.5.2")
    
    // 图片加载
    implementation("io.coil-kt:coil-compose:2.5.0")
    
    // Debug 工具
    debugImplementation("androidx.compose.ui:ui-tooling")
    
    // 基础依赖（保留 Material 主题支持）
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    
    // 测试依赖
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}