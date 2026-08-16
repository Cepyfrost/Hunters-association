# Hunter's Association — Prototype A

This package contains two ways to use the current prototype.

## 1. PWA
Files:
- hunters_association_prototype.html
- manifest.webmanifest
- sw.js

Host these files on any HTTPS static host. Open the page in Android Chrome and use
"Add to Home screen" / "Install app".

## 2. Android WebView project
Open the `Hunters_Association_Android` folder in Android Studio, let Gradle sync,
then build the debug APK with:
`./gradlew assembleDebug`

The APK will be:
`app/build/outputs/apk/debug/app-debug.apk`

The project includes Android VIBRATE permission and the web prototype.
