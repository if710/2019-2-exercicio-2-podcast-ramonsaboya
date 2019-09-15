package br.ufpe.cin.android.podcast

import android.os.AsyncTask
import java.net.URL


class PodcastFetcher(val processItems: (List<ItemFeed>) -> Unit) :
    AsyncTask<String, Int, List<ItemFeed>>() {

    override fun doInBackground(vararg paths: String): List<ItemFeed> {
        val url = URL(paths[0])
        val feed = url.readText()
        return Parser.parse(feed)
    }

    override fun onPostExecute(items: List<ItemFeed>) {
        processItems(items)
    }
}
