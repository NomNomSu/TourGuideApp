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
        events.add(new Item(getString(R.string.restaurant1), R.drawable.nago));
        events.add(new Item(getString(R.string.restaurant2), R.drawable.starka));
        events.add(new Item(getString(R.string.restaurant3), R.drawable.zielona_kuchnia));
        events.add(new Item(getString(R.string.restaurant4), R.drawable.taste_of_india));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}