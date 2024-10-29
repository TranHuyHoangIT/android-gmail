package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.sender)
        val subject: TextView = itemView.findViewById(R.id.subject)
        val preview: TextView = itemView.findViewById(R.id.preview)
        val time: TextView = itemView.findViewById(R.id.time)
        val icon: CircleTextImageView = itemView.findViewById(R.id.icon)
        val starIcon: ImageView = itemView.findViewById(R.id.starIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val currentItem = emailList[position]
        holder.sender.text = currentItem.sender
        holder.subject.text = currentItem.subject
        holder.preview.text = currentItem.preview
        holder.time.text = currentItem.time
        holder.icon.setText(currentItem.sender.first())

        holder.starIcon.setImageResource(if (currentItem.isStarred) R.drawable.ic_star_filled else R.drawable.ic_star_outline)

        holder.starIcon.setOnClickListener {
            currentItem.isStarred = !currentItem.isStarred
            holder.starIcon.setImageResource(if (currentItem.isStarred) R.drawable.ic_star_filled else R.drawable.ic_star_outline)
        }
    }

    override fun getItemCount() = emailList.size
}


