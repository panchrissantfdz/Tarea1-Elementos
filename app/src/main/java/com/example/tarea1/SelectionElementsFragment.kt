package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tarea1.databinding.FragmentSelectionElementsBinding

class SelectionElementsFragment : Fragment() {

    private var _binding: FragmentSelectionElementsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectionElementsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Demostración de CheckBox
        binding.checkBoxExample.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "CheckBox: ${if (isChecked) "Seleccionado" else "Desmarcado"}", Toast.LENGTH_SHORT).show()
        }

        // Demostración de RadioButton
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val selectedOption = when (checkedId) {
                R.id.radio_option_1 -> "Opción 1"
                R.id.radio_option_2 -> "Opción 2"
                else -> ""
            }
            Toast.makeText(requireContext(), "RadioButton: $selectedOption", Toast.LENGTH_SHORT).show()
        }

        // Demostración de Switch
        binding.switchExample.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "Switch: ${if (isChecked) "Activado" else "Desactivado"}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}