# Kotlin Full-Stack Development with Kotlin/JS and Kotlin-React Wrappers

## Description:

This repository provides a minimal example of full-stack development using Kotlin for both the backend and frontend. It showcases the use of Kotlin/JS for running Kotlin code in the browser and Kotlin-React wrappers for a seamless integration with React components.

### Backend
Backend code is in `src/jvmMain` and relies on `src/commonMain` for shared code between frontend and backend.
* Kotlin - Programming language.
* ktor - for backend server.
### Frontend
Frontend code is located in `src/jsMain` and relies on `src/commonMain` for shared code between frontend and backend
* KotlinJs - Kotlin compiled in Js.
* Kotlin-React - Kotlin wrapper for the React library.
## Installation
1. Clone the repository
    ```bash
    git clone https://github.com/ankitiit84/kotlin-fullstack-demo.git
    ```
2. Start server
    ```bash
    ./gradlew run
    ```