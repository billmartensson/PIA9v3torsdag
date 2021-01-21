package se.magictechnology.pia9v3torsdag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter() : RecyclerView.Adapter<MainViewHolder>() {

    var computernames = mutableListOf<String>("Apple", "Atari", "Commodore")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val vh = MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return computernames.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        holder.maintv.text = computernames[position]

        holder.itemView.setOnClickListener {
            computernames.add("DELL")

            notifyDataSetChanged()
        }

    }

}

class MainViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var maintv = view.findViewById<TextView>(R.id.mainTextView)

}