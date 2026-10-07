# StudentsGrades

An Android app with a list/detail layout: it shows a list of students and, after tapping one, their details (index number, full name, average grade and year of study).

## Features

- List of students in a `RecyclerView`
- Detail screen for the selected student
- Data passed between screens with the Navigation Component
- Separate `ViewModel` for the list and the detail screen

## Tech stack

- **Kotlin**
- **ViewModel** + **LiveData**
- **Navigation Component** with Safe Args
- **RecyclerView** and View Binding
- Min SDK 28, target SDK 35

## Project structure

```
app/src/main/java/com/example/studentsgrades/
├── MainActivity.kt
├── Student.kt                 # Student model and sample data
├── StudentListFragment.kt     # List of students
├── StudentListViewModel.kt
├── StudentAdapter.kt          # RecyclerView adapter
├── StudentDetailFragment.kt   # Student details
└── StudentDetailViewModel.kt
```

## Getting started

1. Clone the repository:
   ```bash
   git clone https://github.com/ViktorUw/StudentsGrades.git
   ```
2. Open the project in **Android Studio** and let Gradle sync.
3. Run the app on an emulator or a device with Android 9.0 (API 28) or newer.

> The interface is in Polish.
