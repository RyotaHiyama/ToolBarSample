package com.nokopi.toolbarsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_layout, menu)
        val searchItem = menu?.findItem(R.id.search_bar)
        val searchView = searchItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                // 文字が入力されるたびに実行することを書く
                Log.i("change", "change")
                return false
            }

            override fun onQueryTextSubmit(newText: String?): Boolean {
                // キーボードの検索ボタンが押されたりとか文字入力が確定されたときに実行されることを書く
                Log.i("submit", "submit")
                return false
            }
        })
        return true
    }

}