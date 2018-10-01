package com.example.prpas.ejercicio7listas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;

public class NuevaEntradaAdapter extends ArrayAdapter<NuevaEntrada> {
    private final int entradaLayoutRecurso;
    public NuevaEntradaAdapter(@NonNull Context context, int resource) {
        super(context, 0);
        this.entradaLayoutRecurso=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final View v2 = getWorkingView(convertView);
        final ViewHolder vh = getViewHolder(v2);
        final NuevaEntrada ne = getItem(position);
        vh.tituloView.setText(ne.getTitulo());
        final String s = String.format("Por %s on %s", ne.getAutor(),
                DateFormat.getDateInstance(DateFormat.SHORT).format(ne.getFecha()) );
        vh.subTituloView.setText(s);
        vh.imagenView.setImageResource(ne.getIcono());

        return v2;
    }


    private View getWorkingView(final View v3) {
        View workingView = null;
        if(null == v3) {
            final Context c2 = getContext();
            final LayoutInflater inflater = (LayoutInflater)c2.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);             workingView = inflater.inflate(entradaLayoutRecurso, null);
        } else {
            workingView = v3;
        }
        return workingView;
    }


    private ViewHolder getViewHolder(final View workingView) {
        final Object tag = workingView.getTag();
        ViewHolder vh = null;
        if (null == tag || !(tag instanceof ViewHolder)) {
            vh = new ViewHolder();
            vh.tituloView = (TextView) workingView.findViewById(R.id.xtvtitulo);


            vh.subTituloView = (TextView) workingView.findViewById(R.id.xtvsubtitulo);
            vh.imagenView = (ImageView) workingView.findViewById(R.id.xivicono);
            workingView.setTag(vh);
        } else {
            vh = (ViewHolder) tag;
        }
        return vh;
    }

    private static class ViewHolder {
        public TextView tituloView;
        public TextView subTituloView;
        public ImageView imagenView;
    }

}
