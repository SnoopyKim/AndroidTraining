package com.example.android.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LinkedList<String> mTitleList;
    private final LinkedList<String> mContentList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> titleList, LinkedList<String> contentList) {
        mInflater = LayoutInflater.from(context);
        this.mTitleList = titleList;
        this.mContentList = contentList;
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView titleItemView, contentItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(@NonNull View itemView, WordListAdapter adapter) {
            super(itemView);
            titleItemView = itemView.findViewById(R.id.word_title);
            contentItemView = itemView.findViewById(R.id.word_content);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            /*
            // Use that to access the affected item in mWordList.
            String element = mContentList.get(mPosition);
            // Change the word in the mWordList.
            mContentList.set(mPosition, "Clicked! " + element);
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display tha data.
            mAdapter.notifyDataSetChanged();
            */
            String title = mTitleList.get(mPosition);
            String content = mContentList.get(mPosition);
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("title", title);
            intent.putExtra("content", content);
            v.getContext().startActivity(intent);
        }
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);

        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mTitle = mTitleList.get(position);
        holder.titleItemView.setText(mTitle);

        String mContent = mContentList.get(position);
        holder.contentItemView.setText(mContent);
    }

    @Override
    public int getItemCount() {
        return mTitleList.size();
    }
}
