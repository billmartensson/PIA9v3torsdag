package se.magictechnology.pia9v3torsdag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SecondAdapter() : RecyclerView.Adapter<SecondViewHolder>() {

    var fruitnames = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val vh = SecondViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.second_item, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return fruitnames.size
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {

        holder.secondtv.text = fruitnames[position]

        holder.secondimage.setImageResource(R.drawable.frog)

        holder.itemView.setOnClickListener {

        }

    }

}

class SecondViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var secondtv = view.findViewById<TextView>(R.id.secondTextView)

    var secondimage = view.findViewById<ImageView>(R.id.secondImageView)
}