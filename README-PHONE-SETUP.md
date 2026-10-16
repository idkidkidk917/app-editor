# AnimeCut Studio — phone-only setup

## What is in this folder?
This is the Android project folder. Keep the folders and files in their current places. In particular, do not move files out of `app` or `.github`.

## Build an APK using GitHub on your phone
1. Extract this ZIP.
2. Open your GitHub repository in your phone browser.
3. Use **Add file → Upload files** and upload the *contents* of the `AnimeCutStudio` folder (including the `app` and `.github` folders). Do not upload only this ZIP.
4. Commit the uploaded files to the repository's `main` branch.
5. Open the repository's **Actions** tab.
6. Select **Build AnimeCut Studio APK** and tap **Run workflow** if it did not start automatically.
7. Wait for the workflow to finish successfully.
8. Open the completed workflow run and download the `AnimeCut-Studio-debug-apk` artifact.
9. Extract the downloaded artifact ZIP, then tap `app-debug.apk` to install it. Android may ask you to allow installs from that source.

If GitHub's mobile app does not show file-upload options, open the repository in Chrome and choose **Desktop site** from the browser menu.

## Important
The build has not been run or verified from this chat. If the workflow fails, send a screenshot of the error and it can be troubleshot.

This is an early original starter editor, not a full CapCut replacement yet. Current controls include video selection/playback, speed adjustment, and a shake preview. The shake is preview-only; video export, timeline editing, keyframes, transitions, and other advanced editing features are not included yet.
