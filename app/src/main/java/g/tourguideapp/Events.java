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
        events.add(new Item("Milk Opera" + "\n" + "This unique “opera” was dramaturgically tuned and directed by Mikołaj Grabowski, a mocker of national sins. Four excellent performers gracefully fill in this created world of gigantic humour", R.drawable.milk_opera));
        events.add(new Item("18th Week of People with Disabilities" + "\n" + "For the last 18 years, late May and early June in Kraków have been dedicated to people who have been dealt a bit of a harsher card in life", R.drawable.niepelno_sprawni));
        events.add(new Item("Glass forming shows" + "\n" + "All interested in fascinating process of glass forming are invited to Glass and Ceramics Centre, Krakow, for glass forming shows!", R.drawable.glass_form));
        events.add(new Item("57th Krakow Film Festival" + "\n" + "Krakow Film Festival is one of the oldest events in Europe dedicated to documentary, animated and short feature films.", R.drawable.l));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);

        return view;
    }

}
