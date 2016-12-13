package com.matano.somasoma.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.matano.somasoma.R;
import com.matano.somasoma.Unit1;
import com.matano.somasoma.UnitsAdapter;

/**
 * Created by matano on 28/11/16.
 */

public class UnitFragment extends Fragment
{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager recycleViewLayoutManager;
    UnitsAdapter recycleViewAdapter;
    DividerItemDecoration divider;


    public UnitFragment()
    {
        //Empty public Constructor required
    }

    public static UnitFragment newInstance()
    {
        UnitFragment fragment = new UnitFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_unit, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.unitRecycleView);
        recycleViewLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(recycleViewLayoutManager);
        recycleViewAdapter = new UnitsAdapter(Unit1.getTopics(1), getContext());
        recyclerView.setAdapter(recycleViewAdapter);

        //TODO get the divider working
//        divider = new DividerItemDecoration(recyclerView.getContext(),
//                );
//        recyclerView.addItemDecoration(divider);




        return rootView;
    }
}
