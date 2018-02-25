package com.example.khairennizamefid.khairennizamefid_1202150285_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mTitleList = new LinkedList<>();
    private final LinkedList<String> mSubTitleList = new LinkedList<>();
    private final LinkedList<Integer> mBackgroundList = new LinkedList<>();
    private int mCount = 0;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mAdapter = new ListAdapter(this, mTitleList, mSubTitleList, mBackgroundList);

        mRecyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }

    private void setData(){
        String brands[] = {"Ades","Amidis", "Aqua", "Cleo", "Club", "Equil", "Evian", "Leminerale", "Nestle", "Pristine", "Vit"};
        for (String brand: brands) {
            mTitleList.addLast(brand);
            mSubTitleList.addLast("AIR MINUM DARI "+brand);
        }
        mBackgroundList.addLast(R.drawable.ades);
        mBackgroundList.addLast(R.drawable.amidis);
        mBackgroundList.addLast(R.drawable.aqua);
        mBackgroundList.addLast(R.drawable.cleo);
        mBackgroundList.addLast(R.drawable.club);
        mBackgroundList.addLast(R.drawable.equil);
        mBackgroundList.addLast(R.drawable.evian);
        mBackgroundList.addLast(R.drawable.leminerale);
        mBackgroundList.addLast(R.drawable.nestle);
        mBackgroundList.addLast(R.drawable.pristine);
        mBackgroundList.addLast(R.drawable.vit);
    }
}
