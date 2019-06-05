# androidTV_keyboard_withRestAPI
This project's main purpose is to be able to directly command Android TV devices from Samsung Smartthings platform.

There are 2 components:
1. a modified Android TV keyboard with a REST API which can receive certain commands from network
2. Device handler for Samsung Smartthings platform

Keyboard application is ready (precompiled) in the release-apk folder.
You can also download it directly from Google Play Store at: https://play.google.com/store/apps/details?id=com.aktuna.tv.keyboard
Device handler is available as groovy source code in the device-handler folder.

The keyboard application can be used also for other platforms or directly commanding Android TV from network (http)

This app is also working (90% functions) on Amazon Fire TV.
(See Amazon TV install instructions below.)

Usage for Smartthings:
1. install this keyboard on your Android TV and select it as the active keyboard from settings. (input/keyboard)
2. create a device handler on your Smartthings platform with the groovy code from my github repository.
3. create a device with the new device type (created in step 2)
4. set "Device Network Id" in hex format (example "c0a8fe27:1388" for "192.168.254.39:5000")
5. set IP address of your new device (IP address of Android TV device)
6. set PORT of your new device as 5000
7. save your device and use through Smartthings

Usage for any other environment:
1. install this keyboard on your Android TV and select it as the active keyboard from settings. (input/keyboard)
2. you may call following commands using any HTTP client with this format:
http://IP_ADDRESS_OF_ANDROID_TV:5000/[command]

Supported Commands:
/sleep
/home
/back
/search
/up
/down
/left
/right
/center
/volumeup
/volumedown
/rewind
/ff
/playpause
/previous
/next

Amazon TV apk install instructions:
1. download the apk file from "release-apk" folder
2. enable adb interface on your Amazon TV device
3. connect to Amazon TV via ADB:
"adb connect 192.168.1.134:5555"
4. install apk:
"adb install /path/to/LeanKeyKeyboardPro_v1.0_r.apk"
5. list available keyboards:
"adb shell ime list -a"
6. select and enable my keyboard app:
"adb shell ime enable com.aktuna.tv.keyboard/com.aktuna.leanback.ime.LeanbackImeService"
7. set my keyboard as default keyboard:
"adb shell ime set com.aktuna.tv.keyboard/com.aktuna.leanback.ime.LeanbackImeService"

*. To revert back to original keyboard:
"adb shell ime set com.amazon.tv.ime/.FireTVIME"

