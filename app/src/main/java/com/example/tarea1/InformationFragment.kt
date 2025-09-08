package com.example.tarea1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tarea1.databinding.FragmentInformationBinding

class InformationFragment : Fragment() {

    private var _binding: FragmentInformationBinding? = null
    private val binding get() = _binding!!

    private val handler = Handler(Looper.getMainLooper())
    private var progressStatus = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Simular una tarea para la barra de progreso
        binding.btnStartProgress.setOnClickListener {
            progressStatus = 0
            binding.progressBar.progress = 0
            binding.progressBar.visibility = View.VISIBLE
            binding.btnStartProgress.isEnabled = false
            Thread {
                while (progressStatus < 100) {
                    progressStatus += 1
                    // Actualizar la UI en el hilo principal
                    handler.post {
                        binding.progressBar.progress = progressStatus
                        binding.tvProgressStatus.text = "Cargando... $progressStatus%"
                    }
                    try {
                        Thread.sleep(50)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                handler.post {
                    binding.progressBar.visibility = View.GONE
                    binding.btnStartProgress.isEnabled = true
                    binding.tvProgressStatus.text = "¡Carga completa!"
                }
            }.start()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}