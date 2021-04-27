package com.satanbakespancakes.russianlanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThemesAdapter extends RecyclerView.Adapter<ThemesAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Theme> themes;

    ThemesAdapter(Context context, List<Theme> themes){
        this.themes = themes;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.theme_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ThemesAdapter.ViewHolder holder, int position) {
        Theme theme = themes.get(position);
        holder.nameView.setText(theme.getName());
        holder.themeLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(inflater.getContext(), theme.getRule(), Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return themes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final TextView nameView;
        final LinearLayout themeLayout;

        ViewHolder(View view) {
            super(view);
            nameView = (TextView) view.findViewById(R.id.theme_name);
            themeLayout = (LinearLayout) view.findViewById(R.id.theme_layout);
        }
    }
}
