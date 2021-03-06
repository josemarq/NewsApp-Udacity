/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package josemarq.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {


    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of articles, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }


    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the article at the given position in the list of news
        News currentNews = getItem(position);

        // Get the data
        String titulo = currentNews.getTitulo();
        String seccion = currentNews.getSeccion();
        String fecha = currentNews.getFecha();

        // Find the TextView with view Titulo
        TextView tituloView = (TextView) listItemView.findViewById(R.id.titulo);
        // Display the title of the current article in that TextView
        tituloView.setText(titulo);
        // Find the TextView with view seccion
        TextView seccionView = (TextView) listItemView.findViewById(R.id.seccion);
        // Display the Section of the current article in that TextView
        seccionView.setText(seccion);
        // Find the TextView with view fecha
        TextView fechaView = (TextView) listItemView.findViewById(R.id.fecha);
        // Display the fecha of the current article in that TextView
        fechaView.setText(fecha);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}