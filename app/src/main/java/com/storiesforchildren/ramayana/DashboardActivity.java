package com.storiesforchildren.ramayana;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DashboardActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {


    @BindView(R.id.imageViewPager)
    ViewPager imageViewPager;
    @Nullable
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Nullable
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @Nullable
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.container)
    FrameLayout container;

    @Nullable
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @Nullable
    @BindView(R.id.mainLayout)
    CoordinatorLayout mainLayout;

    private FragmentTransaction mFragmentTransaction;
    private ArrayList<Story> stories;
    private Story currentStory;
    private StoryFragment storyFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        if( findViewById(R.id.toolbar) != null ) {
            setSupportActionBar(toolbar);
            toolbar.setTitle(R.string.app_name);
            collapsingToolbar.setContentScrimColor(ContextCompat.getColor(DashboardActivity.this, R.color.colorPrimary));
            collapsingToolbar.setTitle(getString(R.string.app_name));
            collapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedToolbar);
            collapsingToolbar.setExpandedTitleTextAppearance(R.style.ExpandedToolbar);
            collapsingToolbar.setTitleEnabled(true);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }



        if( savedInstanceState == null ) {
            stories = Story.getStoryList();
            loadChapter(stories.get(0));
        }
        else {
            stories = savedInstanceState.getParcelableArrayList("Stories");
            currentStory = savedInstanceState.getParcelable("currentStory");
            loadChapter(currentStory);
        }

        imageViewPager.setAdapter(new ImageViewPagerAdapter(getSupportFragmentManager(), stories));
        imageViewPager.addOnPageChangeListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("Stories", stories);
        outState.putParcelable("currentStory", currentStory);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    private void loadChapter(Story story) {

        if( storyFragment == null ) {
            mFragmentTransaction = getSupportFragmentManager().beginTransaction();
            storyFragment = StoryFragment.getInstance();
            mFragmentTransaction.replace(R.id.container, storyFragment, StoryFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }

        currentStory = story;
        storyFragment.setStory(currentStory);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        loadChapter(stories.get(position));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
