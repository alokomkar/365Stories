package com.storiesforchildren.ramayana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Alok on 03/07/17.
 */

class ImageViewPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Story> stories;

    public ImageViewPagerAdapter(FragmentManager supportFragmentManager, ArrayList<Story> stories) {
        super(supportFragmentManager);
        this.stories = stories;
    }

    @Override
    public Fragment getItem(int position) {
        ImageFragment imageFragment = new ImageFragment();
        imageFragment.setImageDrawable(stories.get(position).getImageDrawable());
        return imageFragment;
    }

    @Override
    public int getCount() {
        return stories.size();
    }
}
