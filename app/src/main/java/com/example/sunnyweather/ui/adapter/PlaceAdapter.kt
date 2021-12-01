package com.example.sunnyweather.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sunnyweather.BaseFragment
import com.example.sunnyweather.databinding.PlaceItemBinding
import com.example.sunnyweather.logic.model.Place
import com.example.sunnyweather.logic.model.Weather
import com.example.sunnyweather.ui.navigation.home.HomeFragment
import com.example.sunnyweather.ui.weather.WeatherActivity

/**
 * @Description:
 * @CreateDate: 2021/11/29 16:34
 */
class PlaceAdapter(private val fragment: HomeFragment, private val placeList: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: PlaceItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = PlaceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val place = placeList[position]
        holder.binding.placeName.text = place.name
        holder.binding.placeAddress.text = place.address

        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            val place = placeList[position]

            val intent=Intent(fragment.context,WeatherActivity::class.java).apply {
                putExtra("location_lng",place.location.lng)
                putExtra("location_lat",place.location.lat)
                putExtra("place_name",place.name)
            }
            fragment.homeViewModel.savePlace(place)
            fragment.startActivity(intent)
            fragment.activity?.finish()
        }
    }

    override fun getItemCount() = placeList.size
}