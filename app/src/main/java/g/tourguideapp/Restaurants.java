package g.tourguideapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends Fragment {

    public Restaurants() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ArrayList<Item> events = new ArrayList<>();
        events.add(new Item("Nago Sushi & Sake" + "\n" + "Japanese, Sushi, Asian, Fusion, Vegetarian Friendly, Vegan Options" + "\n" + "ul. Sw. Gertrudy 7, Krakow 31-046, Poland", R.drawable.nago));
        events.add(new Item("Restaurant Starka" + "\n" + "Polish, Eastern European, Central European, Vegetarian Friendly, Vegan " + "\n" + "ul. Jozefa 14, Krakow 31-056, Poland", R.drawable.starka));
        events.add(new Item("Zielona Kuchnia" + "\n" + "Contemporary, Fusion, Healthy, Polish, European, Vegetarian " + "\n" + "Ul. Ambrozego Grabowskiego 8/9, Krakow 31-126, Poland", R.drawable.zielona_kuchnia));
        events.add(new Item("Taste of India" + "\n" + "Indian, Asian, Vegetarian Friendly, Vegan Options" + "\n" + "Dietla 46, Krakow 31-039, Poland", R.drawable.taste_of_india));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}
