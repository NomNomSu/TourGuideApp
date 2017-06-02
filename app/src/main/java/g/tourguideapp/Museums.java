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
        events.add(new Item("The Czartoryski Museum and Library is a museum located in Kraków, Poland, founded in Puławy in 1796 by Princess Izabela Czartoryska.", R.drawable.klasztorek));
        events.add(new Item("The Gallery of 19th-Century Polish Art at Sukiennice, is a division of the National Museum, Kraków, Poland.", R.drawable.sukiennice));
        events.add(new Item("Pharmacy Museum, (Jagiellonian University Medical College) is a museum on Floriańska Street, Kraków, Poland.", R.drawable.farmacja));
        events.add(new Item("Kraków National Museum was first housed at the upper floor of the Renaissance Sukiennice building located at the Main Square in the Kraków Old Town. ", R.drawable.narodowe));
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) view.findViewById(R.id.events_list);
        listView.setAdapter(itemAdapter);
        return view;
    }

}
