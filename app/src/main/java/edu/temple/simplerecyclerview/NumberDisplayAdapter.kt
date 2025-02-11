package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.NumberPicker
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val number: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>(){
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply {
                setPadding(10,10,10,10)
            }
        )
    }
    override fun getItemCount(): Int {
        return number.size
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = number[position].toString()
        holder.textView.textSize = number[position].toFloat()
    }



    // TODO Step 3b: Complete function definitions for adapter
    /* TODO Step 3a: Provide Adapter Parent */



}


