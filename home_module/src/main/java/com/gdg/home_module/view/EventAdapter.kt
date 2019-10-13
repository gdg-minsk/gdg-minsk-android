package com.gdg.home_module.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gdg.domain.dto.Event
import com.gdg.home_module.BindableAdapter
import kotlinx.android.synthetic.main.upcoming_event_list_item.view.*
import java.util.Collections.emptyList


class EventAdapter(val elementLayout:Int):RecyclerView.Adapter<EventAdapter.EventHolder>() , BindableAdapter<Event> {

    override fun setData(items: List<Event>) {
        events = items
        notifyDataSetChanged()
    }


    override fun changedPositions(positions: Set<Int>) {
        positions.forEach(this::notifyItemChanged)
    }

    var events = emptyList<Event>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHolder {
        val inflater = LayoutInflater.from(parent.context)
        return EventHolder(
            inflater.inflate(
                elementLayout,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: EventHolder, position: Int) {
        holder.bind(events[position])
    }

     class EventHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(event: Event) {
            with(itemView) {
                event_title.text = event.title
                event_date.text=event.getDateInFormat()

                val labelsAdapter = LabelAdapter(event.labels)
                event_labels.setAdapter(labelsAdapter)
            }
        }
    }
}