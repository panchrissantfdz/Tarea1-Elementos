package com.example.tarea1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tarea1.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private var _binding: FragmentButtonsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSimple.setOnClickListener {
            Toast.makeText(requireContext(), "Botón Simple Presionado", Toast.LENGTH_SHORT).show()
        }

        binding.imageButton.setOnClickListener {
            Toast.makeText(requireContext(), "ImageButton Presionado", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}