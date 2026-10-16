# AnimeCut Studio — Android starter project

An original Android video-editing starter app for learning and prototyping. It does not modify CapCut or unlock any paid CapCut features.

## Included
- Android video picker using the system document picker
- Video playback using AndroidX Media3 ExoPlayer
- Playback speed control (0.2x–3.1x)
- Adjustable shake preview (intensity and shake speed)
- Dark editor-style UI
- Reset controls

## Important limitations
This is a working starter project, not a full production editor. The shake is a live preview-only effect applied to the preview container. It is **not baked into an exported video**. This first version does not yet include timeline trimming, transitions, keyframe editing, filters, text overlays, or video export.

## Build in Android Studio
1. Install Android Studio and a compatible Android SDK (API 35).
2. Extract this ZIP.
3. In Android Studio choose **Open** and select the `AnimeCutStudio` folder.
4. Allow Gradle to sync and download dependencies.
5. Connect your Android phone with USB debugging enabled, or use an emulator.
6. Press **Run**.

The project uses Gradle Kotlin DSL and AndroidX Media3. If Android Studio prompts you to update plugin versions, use versions compatible with your installed Android Studio/Gradle setup.

## Package
`com.example.animecutstudio`

## Cloud build option (phone-only, no computer)
This project includes `.github/workflows/build-apk.yml` for building a debug APK on GitHub Actions. To use it, you must upload the project source to a GitHub repository using GitHub's website, then open the repository's **Actions** tab and run **Build AnimeCut Studio APK**. When the workflow finishes, open the run and download the `AnimeCut-Studio-debug-apk` artifact. GitHub account and internet access are required; I cannot upload it to your account or run the workflow for you from this chat.
