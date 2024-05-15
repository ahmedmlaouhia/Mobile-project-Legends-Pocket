plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.legendspocket"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.legendspocket"
        minSdk = 26
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
    implementation(platform("com.google.firebase:firebase-bom:32.1.0")) // Use the latest BOM
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-database-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-storage-ktx")
    implementation("com.firebaseui:firebase-ui-database:8.0.0")
    implementation("com.squareup.picasso:picasso:2.71828") // Latest stable version
    implementation("com.google.android.material:material:1.8.0")
    implementation("com.makeramen:roundedimageview:2.3.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3") // Latest stable version
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3") // Latest stable version
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("it.xabaras.android:recyclerview-swipedecorator:1.2.1")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("com.ms-square:expandableTextView:0.1.4")
    implementation("androidx.exifinterface:exifinterface:1.3.5") // Use the androidx version
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

