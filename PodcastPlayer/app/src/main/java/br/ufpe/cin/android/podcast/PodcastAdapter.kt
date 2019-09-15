package br.ufpe.cin.android.podcast

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View

class PodcastAdapter(private var episodes: List<ItemFeed>) : RecyclerView.Adapter<EpisodeHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EpisodeHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemlista, parent, false)
        return EpisodeHolder(view)
    }

    override fun onBindViewHolder(holder: EpisodeHolder, position: Int) {
        holder.title.text = episodes[position].title
        holder.date.text = episodes[position].pubDate
    }

    override fun getItemCount() = episodes.size

    fun updateList(episodes: List<ItemFeed>) {
        this.episodes = episodes
        notifyItemInserted(episodes.size);
    }

}

class EpisodeHolder(view: View) : RecyclerView.ViewHolder(view) {

    val title: TextView = view.findViewById(R.id.item_title)
    val date: TextView = view.findViewById(R.id.item_date)

}
