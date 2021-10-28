package com.arajshow.affirmation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arajshow.affirmation.adaptor.ItemAdapter
import com.arajshow.affirmation.data.Datasource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize myDataset(data) objject from Datasource class from data package.
        val myDataset = Datasource().loadAffirmations()

//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recycler_view.setHasFixedSize(true)
    }
}