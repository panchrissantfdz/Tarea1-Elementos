package com.example.tarea1



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarea1.databinding.FragmentListsBinding
import com.example.tarea1.models.ListItem

class ListsFragment : Fragment() {

    private var _binding: FragmentListsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Crear una lista de datos de ejemplo
        val data = listOf(
            ListItem("Elemento 1", "Descripción del primer elemento de la lista."),
            ListItem("Elemento 2", "Descripción del segundo elemento de la lista."),
            ListItem("Elemento 3", "Descripción del tercer elemento de la lista."),
            ListItem("Elemento 4", "Descripción del cuarto elemento de la lista."),
            ListItem("Elemento 5", "Descripción del quinto elemento de la lista.")
        )

        // Configurar el RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = ListAdapter(data)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}