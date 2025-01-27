package com.example.studentsgrades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.studentsgrades.databinding.FragmentStudentDetailBinding




class StudentDetailFragment : Fragment() {

    private val viewModel: StudentDetailViewModel by activityViewModels()

    private var _binding: FragmentStudentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStudentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val indexNumber = requireArguments().getString("indexNumber")
        val firstName = requireArguments().getString("firstName")
        val lastName = requireArguments().getString("lastName")
        val averageGrade = requireArguments().getDouble("averageGrade")
        val yearOfStudy = requireArguments().getInt("yearOfStudy")


        viewModel.setStudentData(indexNumber, firstName, lastName, averageGrade, yearOfStudy)

        viewModel.SelectedStudent.observe(viewLifecycleOwner) { student ->
            binding.indexTextView.text = student.indexNumber
            binding.nameTextView.text = "${student.firstName} ${student.lastName}"
            binding.averageGradeTextView.text = student.averageGrade.toString()
            binding.yearOfStudyTextView.text = student.yearOfStudy.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}