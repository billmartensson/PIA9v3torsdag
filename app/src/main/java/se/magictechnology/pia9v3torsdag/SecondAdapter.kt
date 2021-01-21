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

        /*
        Bild från namn på bild.
        1. Hitta context. Tar här från radens vy. Sammanhang.
        2. Ur den, ta resources
        3. Få ut identifier för en resource
        4. Namn på resource
        5. Vilken typ av resource
        6. Vilket paket dvs vår att app

          1            2         3           4         5                 6
        theContext.resources.getIdentifier("frog", "drawable", theContext.packageName)

        Ger tillbaka resource id int samma som R.id.frog

        Använd det i setImageResource
         */

        var theContext = holder.itemView.context

        if(position == 0)
        {
            var frogImage = theContext.resources.getIdentifier("frog", "drawable", theContext.packageName)

            holder.secondimage.setImageResource(frogImage)

        } else {
            var birdImage = theContext.resources.getIdentifier("bird", "drawable", theContext.packageName)

            holder.secondimage.setImageResource(birdImage)

        }


        holder.itemView.setOnClickListener {

        }

    }

}

class SecondViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var secondtv = view.findViewById<TextView>(R.id.secondTextView)

    var secondimage = view.findViewById<ImageView>(R.id.secondImageView)
}