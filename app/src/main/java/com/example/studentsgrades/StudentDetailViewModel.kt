package com.example.studentsgrades

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentDetailViewModel : ViewModel() {
    private val _selectedStudent = MutableLiveData<Student>()
    val SelectedStudent: LiveData<Student> get() = _selectedStudent

    fun setStudentData(
        indexNumber: String?,
        firstName: String?,
        lastName: String?,
        averageGrade: Double?,
        yearOfStudy: Int?
    ) {
        if (indexNumber != null && firstName != null && lastName != null && averageGrade != null && yearOfStudy != null) {
            _selectedStudent.value = Student(
                indexNumber = indexNumber,
                firstName = firstName,
                lastName = lastName,
                averageGrade = averageGrade,
                yearOfStudy = yearOfStudy
            )
        }
    }
}