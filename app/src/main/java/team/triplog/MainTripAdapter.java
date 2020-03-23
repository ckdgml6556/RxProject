package team.triplog;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MainTripAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    MainTripAdapter(FragmentManager fm, int tabCount) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MainTripPlanFragment tabPlan = new MainTripPlanFragment();
                return tabPlan;
            case 1:
                MainTripLogFragment tabLog = new MainTripLogFragment();
                return tabLog;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}