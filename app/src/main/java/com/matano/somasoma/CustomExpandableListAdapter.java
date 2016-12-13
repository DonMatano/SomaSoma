package com.matano.somasoma;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by matano on 25/11/16.
 */

public class CustomExpandableListAdapter extends BaseExpandableListAdapter
{
    private Context context;
    private List<String> semesterTitle;
    private HashMap<String, List<String>> expandableListDetail;

    public CustomExpandableListAdapter(Context context, List<String> semesterTitle, HashMap<String, List<String>> expandableListDetail)
    {
        this.context = context;
        this.semesterTitle = semesterTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition)
    {
        return this.expandableListDetail.get(this.semesterTitle.
        get(listPosition)).get(expandedListPosition);
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition)
    {
        return expandedListPosition;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertview, ViewGroup parent)
    {
        final String expandedListText = (String) getChild(listPosition, expandedListPosition);
        if (convertview == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = layoutInflater.inflate(R.layout.subject_unit_list, null);
        }

        TextView expandedListTextView = (TextView) convertview
                .findViewById(R.id.subjectTextview);
        expandedListTextView.setText(expandedListText);
        return convertview;
    }

    @Override
    public int getChildrenCount(int listPosition)
    {
        return this.expandableListDetail.get(
                this.semesterTitle.get(listPosition)
        ).size();
    }

    @Override
    public Object getGroup(int listPosition)
    {
        return this.semesterTitle.get(listPosition);
    }

    @Override
    public int getGroupCount()
    {
        return this.semesterTitle.size();
    }

    @Override
    public long getGroupId(int listPosition)
    {
        return listPosition;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded, View convertView,
                             ViewGroup parent)
    {
        String listTitle = (String) getGroup(listPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group, null);
        }

        TextView listTitleTextView = (TextView)
                convertView.findViewById(R.id.semesterTitle);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds()
    {
        return false;
    }

    @Override
    public boolean isChildSelectable(int i, int i1)
    {
        return true;
    }
}
