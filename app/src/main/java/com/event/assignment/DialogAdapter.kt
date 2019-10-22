package com.event.assignment

import android.app.AlertDialog
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.event.assignment.DialogAdapter.VerticalRecyclerViewHolder

class DialogAdapter(internal var mainActivity: MainActivity) : RecyclerView.Adapter<VerticalRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalRecyclerViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.dialog, parent, false)

        return VerticalRecyclerViewHolder(view)

    }

    override fun onBindViewHolder(holder: VerticalRecyclerViewHolder, position: Int) {


        if (position == 0) {
            //
            holder.textView.text = "Macbook Air"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_home, mainActivity.applicationContext.theme))
            } else {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_home))
            }


        } else if (position == 1) {


            holder.textView.text = "Fibe TV"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_desktop, mainActivity.applicationContext.theme))
            } else {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_desktop))
            }

        } else if (position == 2) {

            holder.textView.text = "Apple Macintosh Macbook"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_responsive, mainActivity.applicationContext.theme))
            } else {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_responsive))
            }


        } else {

            holder.textView.text = "Macbook"

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_desktop, mainActivity.applicationContext.theme))
            } else {
                holder.image.setImageDrawable(mainActivity.resources.getDrawable(R.drawable.ic_desktop))
            }

        }

    }

    override fun getItemCount(): Int {
        return 4
    }

    inner class VerticalRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        public val textView: TextView
        public val image: ImageView
        public val upload_container: RelativeLayout

        init {

            textView = itemView.findViewById<View>(R.id.category_3_text) as TextView
            image = itemView.findViewById<View>(R.id.upload1) as ImageView
            upload_container = itemView.findViewById<View>(R.id.upload_container) as RelativeLayout

        }
    }
}
