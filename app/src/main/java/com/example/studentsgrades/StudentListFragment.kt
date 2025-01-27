package com.example.studentsgrades

import com.example.studentsgrades.databinding.FragmentStudentListBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class StudentListFragment : Fragment() {

    private val viewModel: StudentListViewModel by activityViewModels()

    private var _binding: FragmentStudentListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStudentListBinding.inflate(inflater, container, false)

        val recyclerView: RecyclerView = binding.studentList

        recyclerView.layoutManager = LinearLayoutManager(context)
        viewModel.students.observe(viewLifecycleOwner){ students ->
            recyclerView.adapter = StudentAdapter(students) { selectedStudent ->
                findNavController().navigate(
                    R.id.action_studentListFragment_to_studentDetailFragment,
                    Bundle().apply {
                        putString("indexNumber", selectedStudent.indexNumber)
                        putString("firstName", selectedStudent.firstName)
                        putString("lastName", selectedStudent.lastName)
                        putDouble("averageGrade", selectedStudent.averageGrade)
                        putInt("yearOfStudy", selectedStudent.yearOfStudy)
                    }
                )
            }
        }

        return binding.root
    }

}