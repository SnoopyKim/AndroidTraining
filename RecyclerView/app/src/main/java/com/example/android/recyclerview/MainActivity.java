package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mTitleList = new LinkedList<>();
    private final LinkedList<String> mContentList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int column = getResources().getInteger(R.integer.grid_column_count);

        for (int i=0; i<20; i++) {
            mTitleList.addLast("Title " + i);
            mContentList.addLast("Content " + i);
        }

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recylerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mTitleList, mContentList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, column));

       FloatingActionButton fab = findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int wordListSize = mTitleList.size();
               // Add a new word to the wordList.
               mTitleList.addLast("+ Title " + wordListSize);
               mContentList.addLast("+ Content " + wordListSize);
               // Notify the adapter, that tha data has changed.
               mRecyclerView.getAdapter().notifyItemInserted(wordListSize);
               // Scroll to the bottom.
               mRecyclerView.smoothScrollToPosition(wordListSize);
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
