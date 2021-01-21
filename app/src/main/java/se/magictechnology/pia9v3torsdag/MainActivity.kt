package se.magictechnology.pia9v3torsdag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var mainadapter = MainAdapter()
    var secondadapter = SecondAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainrv = findViewById<RecyclerView>(R.id.mainRV)

        mainrv.layoutManager = LinearLayoutManager(this)
        mainrv.adapter = mainadapter


        var mylist = mutableListOf<String>()
        mylist.add("Banan")
        mylist.add("Apelsin")
        mylist.add("Kiwi")

        secondadapter.fruitnames = mylist

        var secondrv = findViewById<RecyclerView>(R.id.secondRV)

        secondrv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        secondrv.adapter = secondadapter


    }
}