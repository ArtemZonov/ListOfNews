package com.jkdajac.listofnews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_user.view.*



 class ProfilesAdapter(
     val profiles: ArrayList<Profile>,
     val context: Context,

 ): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_user, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatar.setImageBitmap(profiles[position].avatar)
        holder.name.text = profiles[position].name
        holder.description.text = profiles[position].description
        holder.countLikes.text = profiles[position].like.toString()
        holder.like.setOnClickListener {
            holder.like.setImageBitmap(R.drawable.heartlike)
var count = 0
            count++
            holder.countLikes.text = count.toString()
        }

    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val avatar = itemView.ivAvatar
    val name = itemView.tvName
    val description = itemView.tvDescription
    val like = itemView.ivHeartWhite
    var countLikes = itemView.tvAllLikesCount

}

