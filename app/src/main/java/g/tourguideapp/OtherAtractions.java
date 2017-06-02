package g.tourguideapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OtherAtractions extends Fragment {

    public OtherAtractions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other_atractions, container, false);
        ArrayList<Item> events = new ArrayList<>();
        events.add(new Item(getString(R.string.other1), R.drawable.piwnica));
        events.add(new Item(getString(R.string.other2), R.drawable.mleczko));
        events.add(new Item(getString(R.string.other3), R.drawable.groteska));
        events.add(new Item(getString(R.string.other4), R.drawable.wieliczka));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}

