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
        events.add(new Item("Piwnica pod Baranami" + "\n" + "Piwnica Pod Baranami is the most bizarre and the most wonderful cabaret in the world – according to its viewers and friends. And there's a fair chance they are right", R.drawable.piwnica));
        events.add(new Item("Andrzej Mleczko Gallery" + "\n" + "Mleczkoland is a weird and mysterious realm.\n" +
                "In the south, it borders mountains, in the north – sea, in the west – Europe and in the east – Asia. The inhabitants of Mleczkoland observe uncommon customs and manifest bizarre attitudes.", R.drawable.mleczko));
        events.add(new Item("Groteska Theatre" + "\n" + "Groteska Theatre in Kraków is one of the oldest and most renowned puppetries in Poland. It was established in 1945 by outstanding artists: Zofia and Władysław Jarema", R.drawable.groteska));
        events.add(new Item("Wieliczka Slat Mine" + "\n" + "The “Wieliczka” Salt Mine is one of the most valuable monuments of material and spiritual culture in Poland", R.drawable.wieliczka));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}


