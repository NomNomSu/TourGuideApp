package g.tourguideapp;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_list_layout, parent, false);
        }

        Item currentItem = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.description);
        nameTextView.setText(currentItem.getDescritpion());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.photo);
        iconView.setImageResource(currentItem.getImageResourceId());
        return listItemView;
    }

}
