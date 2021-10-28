package com.arajshow.affirmation.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arajshow.affirmation.R
import com.arajshow.affirmation.modal.Affirmation
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter (private val context: Context,
                   private val dataset: List<Affirmation>
                   ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
//    these comments help us to understand if further we use it
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.item_title
        val imageView: ImageView = view.img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }
    /**
     * need to work on this , still not clear how this work
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
    /**
     * getItemCount use to Return the size of your dataset (dataset is parameter of our adaptor
     * which contains data of our project)
     */
    override fun getItemCount() = dataset.size
}