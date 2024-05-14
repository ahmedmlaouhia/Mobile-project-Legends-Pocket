plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.legendspocket"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.legendspocket"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.firebase:firebase-auth:21.0.1") // Updated to latest version
    implementation("com.google.firebase:firebase-database:23.0.0") // Updated to latest version
    implementation("com.google.firebase:firebase-firestore:24.0.0") // Updated to latest version
    testImplementation("junit:junit:4.13.2") // Updated to latest version
    androidTestImplementation("androidx.test.ext:junit:1.1.3") // Already up-to-date
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") // Already up-to-date
    implementation("com.google.android.material:material:1.6.0-alpha03") // Updated to latest version
    implementation("com.makeramen:roundedimageview:2.3.0") // Already up-to-date
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.0-alpha10") // Updated to latest version
    implementation("androidx.navigation:navigation-ui-ktx:2.4.0-alpha10") // Updated to latest version
    implementation("androidx.recyclerview:recyclerview:1.2.1") // Already up-to-date
    implementation("it.xabaras.android:recyclerview-swipedecorator:1.2.1") // Already up-to-date
    implementation(platform("com.google.firebase:firebase-bom:31.0.0")) // Updated to latest version
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-storage")
    implementation("com.firebaseui:firebase-ui-database:8.0.0") // Already up-to-date
    implementation("de.hdodenhof:circleimageview:3.1.0") // Already up-to-date
    implementation("com.squareup.picasso:picasso:2.8.0") // Updated to latest version
    implementation("com.ms-square:expandableTextView:0.1.4") // Already up-to-date


}