package team.triplog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MainTripLogFragment extends Fragment {

    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main_trip_log, container, false);

        init();
        setUi();

        return rootView;
    }

    private void init() {

    }

    private void setUi() {
        if (isAdded()) {
        }
    }
}
