package com.storiesforchildren.ramayana;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Alok on 03/07/17.
 */

public class StoryFragment extends Fragment {

    private static StoryFragment instance;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.storyTextView)
    TextView storyTextView;
    Unbinder unbinder;
    @BindView(R.id.storyImageView)
    ImageView storyImageView;
    private Story story;

    public static StoryFragment getInstance() {
        if (instance == null) {
            instance = new StoryFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_story, container, false);
        unbinder = ButterKnife.bind(this, fragmentView);
        storyTextView.setText(story.getStory());
        return fragmentView;
    }

    public void setStory(Story story) {
        this.story = story;
        if (storyTextView != null) {
            storyTextView.setText(story.getStory());
            storyImageView.setImageDrawable(ContextCompat.getDrawable(getContext(), story.getImageDrawable()));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
