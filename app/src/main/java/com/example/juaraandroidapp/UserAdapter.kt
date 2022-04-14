package com.example.juaraandroidapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var user = arrayListOf<User>()

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_user, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView
    }

    override fun getItem(i: Int): Any = user[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = user.size

    private inner class ViewHolder internal constructor(view: View) {
        private val txtName: TextView = view.findViewById(R.id.txt_name)
        private val txtFollower: TextView = view.findViewById(R.id.txt_follower)
        private val imgPhoto: ImageView = view.findViewById(R.id.img_photo)
        private val txtLocation: TextView = view.findViewById(R.id.txt_location)
        internal fun bind(user: User) {
            txtName.text = user.name
            txtFollower.text = "Follower : ${user.followers}"
            txtLocation.text = "Location : ${user.location}"
//            user.avatar?.let { imgPhoto.setImageResource(it) }
        }
    }
}