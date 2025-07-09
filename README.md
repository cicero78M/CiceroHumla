# CiceroHumla

Contoh struktur aplikasi Android yang menyerupai aplikasi Mumla dan menggunakan library **Humla**.

## Struktur
- `settings.gradle` dan `build.gradle` untuk konfigurasi Gradle.
- Modul `app` berisi kode aplikasi.

```
CiceroHumla/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/cicerohumla/MainActivity.kt
│       └── res/
│           ├── layout/activity_main.xml
│           └── values/strings.xml
├── build.gradle
└── settings.gradle
```

Library Humla diasumsikan tersedia melalui Maven dengan koordinat `com.humla:humla:1.0.0`.
