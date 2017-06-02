package g.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends Fragment {


    public Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        ArrayList<Item> events = new ArrayList<>();
        events.add(new Item(getString(R.string.events1), R.drawable.milk_opera));
        events.add(new Item(getString(R.string.events2), R.drawable.niepelno_sprawni));
        events.add(new Item(getString(R.string.events3), R.drawable.glass_form));
        events.add(new Item(getString(R.string.events4), R.drawable.l));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);

        return view;
    }

}
