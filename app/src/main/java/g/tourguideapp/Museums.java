package g.tourguideapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Museums extends Fragment {

    public Museums() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museums, container, false);
        ArrayList<Item> events = new ArrayList<>();
        events.add(new Item(getString(R.string.museum1), R.drawable.klasztorek));
        events.add(new Item(getString(R.string.museum2), R.drawable.sukiennice));
        events.add(new Item(getString(R.string.museum3), R.drawable.farmacja));
        events.add(new Item(getString(R.string.museum4), R.drawable.narodowe));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}