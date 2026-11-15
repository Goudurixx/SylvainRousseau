# SylvainRousseau (Compose Multiplatform starter)

**A Kotlin Multiplatform project, Compose UI shared across Android, iOS and the web. It is a starter from the Compose Multiplatform template and not a finished portfolio yet.**

> Status: **template stage.** The code is the standard Compose Multiplatform project wizard output, with one button ("Click me!") that toggles a greeting and a logo. The portfolio content itself has not been written yet. There is no screenshot, because the app does not show portfolio content yet.

## What is in it

- `composeApp/src/commonMain`: the shared UI (`App.kt`) and a small `Greeting` class. The button toggles an animated "Hello, <platform>!" text with the Compose logo.
- `composeApp/src/androidMain`: Android entry point (`MainActivity`) and launcher icons.
- `composeApp/src/iosMain` and `iosApp/`: an iOS entry point (`MainViewController`) and a SwiftUI host app that embeds the Compose view.
- `composeApp/src/wasmJsMain`: a Kotlin/Wasm web target with an `index.html` and `styles.css`.
- `.github/workflows/main.yml`: a GitHub Pages publish step. **It is not working yet**: the `web_package_name` input is empty.

## Tech stack

Kotlin Multiplatform · Compose Multiplatform · Kotlin/Wasm · SwiftUI (iOS host) · Gradle (Kotlin DSL) · version catalog in `gradle/libs.versions.toml`

## Getting started

The project lives in the `SylvainRousseau/` subfolder.

```bash
git clone https://github.com/Goudurixx/SylvainRousseau.git
cd SylvainRousseau/SylvainRousseau
./gradlew :composeApp:wasmJsBrowserDevelopmentRun   # web, opens a dev server
```

Android: open the folder in Android Studio and run the `composeApp` configuration. iOS: open `iosApp/iosApp.xcodeproj` in Xcode.

## Roadmap

- Replace the starter screen with the portfolio.
- Fix the GitHub Pages workflow (or remove it).
