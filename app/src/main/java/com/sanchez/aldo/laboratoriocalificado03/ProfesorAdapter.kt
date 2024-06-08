package com.sanchez.aldo.laboratoriocalificado03

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sanchez.aldo.laboratoriocalificado03.databinding.ProfesoresBinding

class ProfesorAdapter(
    private val context: Context,
    private val teachers: List<Teacher>,
    private val onItemClick: (Teacher) -> Unit,
    private val onItemLongClick: (Teacher) -> Unit
) : RecyclerView.Adapter<ProfesorAdapter.TeacherViewHolder>() {

    inner class TeacherViewHolder(private val binding: ProfesoresBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(teacher: Teacher) {
            binding.nombre.text = teacher.name
            binding.apellido.text = teacher.last_name
            Glide.with(binding.foto.context)
                .load(teacher.image_url)
                .into(binding.foto)

            binding.root.setOnClickListener {
                onItemClick(teacher)
            }

            binding.root.setOnLongClickListener {
                onItemLongClick(teacher)
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val binding = ProfesoresBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeacherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        holder.bind(teachers[position])
    }

    override fun getItemCount(): Int = teachers.size
}