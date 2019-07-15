package com.gdg.home_module.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gdg.domain.Event
import com.gdg.home_module.BindableAdapter
import com.gdg.home_module.R
import kotlinx.android.synthetic.main.event_list_item.view.*
import java.util.Collections.emptyList


class EventAdapter:RecyclerView.Adapter<EventAdapter.UserHolder>() , BindableAdapter<Event> {

    override fun setData(items: List<Event>) {
        events = items
        notifyDataSetChanged()
    }


    override fun changedPositions(positions: Set<Int>) {
        positions.forEach(this::notifyItemChanged)
    }

    var events = emptyList<Event>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserHolder(
            inflater.inflate(
                R.layout.event_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(events[position])
    }

     class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(event: Event) {
            with(itemView) {
                event_title.text = event.title
                event_date.text=event.getDateInFormat()
            }
        }
    }
}