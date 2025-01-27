package com.example.studentsgrades

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class StudentListViewModel : ViewModel() {
    private val _students = MutableLiveData(StudentData.students)
    val students: LiveData<List<Student>> get() = _students

}