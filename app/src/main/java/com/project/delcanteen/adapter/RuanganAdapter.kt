package com.project.delcanteen.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.project.delcanteen.R
import com.project.delcanteen.activity.DetailProdukKantinActivity
import com.project.delcanteen.app.ApiClient
import com.project.delcanteen.model.PeminjamanRuangan
import com.project.delcanteen.model.ProdukKantin
import com.project.delcanteen.model.Pulsa


class RuanganAdapter(
    private var dataList: List<PeminjamanRuangan>, private val
    context: Context
) : RecyclerView.Adapter<RuanganAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType:
        Int
    ): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_pulsa, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList.get(position)
        Log.i("Data on adapter: ",dataList.toString())
//        holder.titleTextView.text = dataModel.nama_ruangan
    }

    class ViewHolder(itemLayoutView: View) :
        RecyclerView.ViewHolder(itemLayoutView) {
        lateinit var titleTextView: TextView

        init {

//            titleTextView = itemLayoutView.findViewById(R.id.nama_ruangan)
        }
    }
}