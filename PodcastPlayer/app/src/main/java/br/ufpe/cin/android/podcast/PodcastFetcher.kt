package br.ufpe.cin.android.podcast

import android.os.AsyncTask
import java.net.URL


class PodcastFetcher(val db: AppDatabase, val processItems: (List<ItemFeed>) -> Unit) :
    AsyncTask<String, Int, List<ItemFeed>>() {

    override fun doInBackground(vararg paths: String): List<ItemFeed> {
        try { // If any RSS parsing fails, retrieve data from DB
            val url = URL(paths[0])
            val feed = url.readText()
            val episodes = Parser.parse(feed)
            db.episodeDao().insertAll(*episodes.toTypedArray())
            return episodes
        }
        catch (e: Exception) {
            return db.episodeDao().getAll()
        }
    }

    override fun onPostExecute(items: List<ItemFeed>) {
        processItems(items)
    }
}
