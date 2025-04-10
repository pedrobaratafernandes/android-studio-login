# Login App
Overview
This is a simple Login App built using Jetpack Compose in Kotlin. The app demonstrates basic navigation between screens and includes a login functionality. Users can enter their credentials on the login screen, and upon successful login, they are navigated to the home screen.  
## Features
* Login Screen: Allows users to input their email and password.
* Home Screen: Displays a welcome message after successful login.
* Navigation: Uses Jetpack Navigation Compose for screen transitions.
* Validation: Basic credential validation (hardcoded for demonstration purposes).

## Files Created
### 1. MainActivity.kt
Purpose: The entry point of the app. Sets up the navigation graph and initializes the app's UI.
Key Functionality:
Configures the NavHost with two destinations: login and home.
Uses rememberNavController to manage navigation.

### 2. LoginScreen.kt
Purpose: Displays the login screen where users can input their credentials.
Key Functionality:
Contains input fields for email and password.
Validates credentials (hardcoded: email = "admin", password = "password").
Navigates to the home screen on successful login.
Shows a toast message for invalid credentials.

### 3. HomeScreen.kt
Purpose: Displays a simple welcome message after successful login.
Key Functionality:
A static screen with a "Welcome to the Home Screen!" message.
