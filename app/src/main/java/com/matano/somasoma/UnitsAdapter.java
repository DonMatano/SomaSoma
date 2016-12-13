package com.matano.somasoma;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matano on 28/11/16.
 */

public class UnitsAdapter extends
        RecyclerView.Adapter<UnitsAdapter.ViewHolder>
{
    ArrayList<String> topics;
    Context context;


    //When object created we give the list of tweets
    public UnitsAdapter(ArrayList<String> topics, Context context)
    {
        this.topics = topics;
        this.context = context;
    }

    @Override
    public int getItemCount()
    {
        return topics.size();
    }

    //Called by the layout manager. Sets the view of the text layout not the textView.
    //Returns the viewHolder to the layout manager.


    @Override
    public UnitsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UnitsAdapter.ViewHolder holder, final int position)
    {
        holder.topicTextView.setText(topics.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                switch (position)
                {
                    case 0:
                        Uri uri = Uri.parse(
                                "http://www.studytonight.com/dbms/overview-of-dbms");

                        startWebBrowser(uri);
                        return;

                    case 1:
                        Uri uri1 = Uri.parse(
                                "http://www.dbmsbasics.blogspot.in/2008/02/" +
                                        "database-system-and-its-components.html");

                        startWebBrowser(uri1);
                        return;
                    case 2:
                        Uri uri2 = Uri.parse(
                                "http://www.tutorialcup.com/dbms/database-management" +
                                        "-system.htm");

                        startWebBrowser(uri2);
                        return;

                    case 3:
                        Uri uri3 = Uri.parse(
                                "http://www.whatisdbms.com/characteristics-of-database" +
                                        "-management-system");

                        startWebBrowser(uri3);
                        return;

                    case 4:
                        Uri uri4 = Uri.parse(
                                "http://www.studytonight.com/dbms/database-model");

                        startWebBrowser(uri4);
                        return;

                    case 5:
                        Uri uri5 = Uri.parse(
                                "http://www.studytonight.com/dbms/architecture-of-database");

                        startWebBrowser(uri5);
                        return;

                    case 6:
                        Uri uri6 = Uri.parse(
                                "http://www.ecomputernotes.com/fundamental/what" +
                                        "-is-a-database/data-independence");

                        startWebBrowser(uri6);
                        return;

                    default:
                        Toast.makeText(context, "NA", Toast.LENGTH_SHORT)
                                .show();
                        return;
                }
            }
        });
    }

    public void startWebBrowser(Uri uri)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView topicTextView;

        public ViewHolder (View itemView)
        {
            super(itemView);
            topicTextView = (TextView) itemView.findViewById
                    (R.id.listItemTextView);
        }
    }

}
