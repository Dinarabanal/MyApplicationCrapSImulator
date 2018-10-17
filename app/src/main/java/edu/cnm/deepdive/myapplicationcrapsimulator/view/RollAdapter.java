package edu.cnm.deepdive.myapplicationcrapsimulator.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import edu.cnm.deepdive.myapplicationcrapsimulator.R;
import edu.cnm.deepdive.myapplicationcrapsimulator.model.Game.Roll;

public class RollAdapter extends ArrayAdapter<Roll> {

  public RollAdapter(@NonNull Context context, int resource) {
    super(context, resource);
    //Load dice images into a Drawable[].
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
  Roll roll = getItem(position);
  View view = LayoutInflater.from(getContext()).inflate(R.layout.roll_item, parent, false);
  //TODO  populate and return view object.
    return view;
  }

}
