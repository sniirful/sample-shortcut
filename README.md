# How to use
A few simple steps to follow to set up the shortcut the way you want it:
1. clone the project on your machine;
2. edit the `rootProject.name` in the `settings.gradle` file;
3. edit the `applicationId` in the `build.gradle (:app)` file;
4. edit the `app_name` in the `strings.xml` file;
5. edit the content of the initializer of `ComponentName` in `MainActivity`;
6. add your own icon*;
	1. if you want to use the monochrome version, you can just import a custom svg inside the `drawables` folder and call it `ic_launcher_monochrome.xml`.

# \*How to add your own icon
- Make sure to open the `Project` tab;
- make sure to select `Android` in the dropdown;
- right click `app`;
- `New` -> `Image Asset`;
- follow the guided configuration.
