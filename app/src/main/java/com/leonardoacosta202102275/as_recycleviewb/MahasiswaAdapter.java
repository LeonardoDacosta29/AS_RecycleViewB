package com.leonardoacosta202102275.as_recycleviewb;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder>
{
    private List<MahasiswaModel> _mahasiswaModelList;

    public MahasiswaAdapter(List<MahasiswaModel> mahasiswaModelList)
    {
        this._mahasiswaModelList = mahasiswaModelList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
