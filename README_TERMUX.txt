JBChatApp Termux Build

1. pkg update && pkg upgrade
2. pkg install openjdk-17 wget unzip git
3. Install Android SDK/Build tools separately in Termux.
4. Unzip project:
   unzip JBChatApp.zip
   cd JBChatApp
5. If using Gradle wrapper add wrapper files, or install gradle package:
   pkg install gradle
6. Build:
   gradle assembleDebug
7. APK output:
   app/build/outputs/apk/debug/
NOTE: To use Firebase, add app/google-services.json
