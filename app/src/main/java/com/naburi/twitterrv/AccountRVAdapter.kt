package com.naburi.twitterrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AccountRVAdapter(var accountList:List<Account>):
    RecyclerView.Adapter<AccountViewHolder>()
   {
       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
           var itemView = LayoutInflater.from(parent.context)
               .inflate(R.layout.account_lists_item,parent,false)
           return AccountViewHolder(itemView)
       }

       override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
           var currentaccount = accountList.get(position)
           holder.tvName.text = currentaccount.name
           holder.tvHandle.text = currentaccount.handler
           holder.tvTweet.text = currentaccount.tweet
           holder.tvNumComment.text = currentaccount.comment
           holder.tvNumRetweet.text = currentaccount.retweet
           holder.tvNumLikes.text = currentaccount.like
           holder.tvNumShare.text = currentaccount.share
       }

       override fun getItemCount(): Int {
           return accountList.size
       }

   }
class AccountViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvNumComment = itemView.findViewById<TextView>(R.id.tvNumComment)
    var tvNumRetweet = itemView.findViewById<TextView>(R.id.tvNumRetweet)
    var tvNumLikes = itemView.findViewById<TextView>(R.id.tvNumLikes)
    var tvNumShare = itemView.findViewById<TextView>(R.id.tvNumShare)
    var ivAvatar = itemView.findViewById<ImageView>(R.id.ivAvatar)
    var ivComment =itemView.findViewById<ImageView>(R.id.ivComment)
    var ivRetweet = itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivLikes = itemView.findViewById<ImageView>(R.id.ivLikes)
    var ivShare = itemView.findViewById<ImageView>(R.id.ivShare)
}