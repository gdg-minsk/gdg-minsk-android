package com.gdg.home_module.view

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gdg.domain.dto.Label
import com.gdg.home_module.R
import kotlinx.android.synthetic.main.label_list_item.view.*
import java.util.Collections.emptyList


class LabelAdapter(items: List<Label>) : RecyclerView.Adapter<LabelAdapter.LabelHolder>() {

    var labels = emptyList<Label>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LabelHolder {
        val inflater = LayoutInflater.from(parent.context)
        return LabelHolder(
            inflater.inflate(
                R.layout.label_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = labels.size

    override fun onBindViewHolder(holder: LabelHolder, position: Int) {
        holder.bind(labels[position])
    }

    class LabelHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(label: Label) {
            with(itemView) {
                val color = Color.parseColor(label.color)
                label_icon.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
                label_title.text = label.title
            }
        }
    }
}