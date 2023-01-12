package com.example.googletasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter: RecyclerView.Adapter<TaskAdapter.TaskHolder>() {

    private var list = mutableListOf<Task>()

    class TaskHolder(item: View): RecyclerView.ViewHolder(item) {



        fun bind(Task: Task){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_sample, parent, false)
        return TaskHolder(view)

    }

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}