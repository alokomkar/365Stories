package com.storiesforchildren.ramayana;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Alok on 03/07/17.
 */

public class ImageFragment extends Fragment {

    @BindView(R.id.trailerImageView)
    ImageView trailerImageView;
    Unbinder unbinder;

    private int imageDrawable;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_image, container, false);
        unbinder = ButterKnife.bind(this, fragmentView);
        trailerImageView.setImageDrawable(ContextCompat.getDrawable(getContext(), imageDrawable));
        return fragmentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }
}
