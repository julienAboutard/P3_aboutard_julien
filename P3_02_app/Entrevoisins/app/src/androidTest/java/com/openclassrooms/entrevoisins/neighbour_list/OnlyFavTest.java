package com.openclassrooms.entrevoisins.neighbour_list;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static com.openclassrooms.entrevoisins.utils.RecyclerViewItemCountAssertion.withItemCount;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(AndroidJUnit4.class)
public class OnlyFavTest {


    private static int ITEMS_COUNT = DI.getNeighbourApiService().getFavorite().size();


    private ListNeighbourActivity mActivity;

    @Rule
    public ActivityTestRule<ListNeighbourActivity> mActivityRule =
            new ActivityTestRule(ListNeighbourActivity.class);

    @Before
    public void setUp() {
        mActivity = mActivityRule.getActivity();
        assertThat(mActivity, notNullValue());
    }


    /**
     * Favorite Tab should only show favorties neighbours
     */
    @Test
    public void myFAvNeighboursList_shouldShowOnlyFav() {
        // Checking we have the right size of recyclerview for favorites neighbours
        onView(ViewMatchers.withId(R.id.recyclerview_fav)).check(withItemCount(ITEMS_COUNT));

        // Click on favorite button for a neighbour who is marked as favorite (pull out a neighbour from favorite list)
        onView(ViewMatchers.withId(R.id.list_neighbours)).perform(RecyclerViewActions.actionOnItemAtPosition(DI.getNeighbourApiService().getNeighbours().size()-1, click()));
        onView(ViewMatchers.withId(R.id.favButton)).perform(click());
        pressBack();
        // Checking recyclerview for favorite neighbours size has reduced by 1
        onView(ViewMatchers.withId(R.id.recyclerview_fav)).check(withItemCount(ITEMS_COUNT-1));
    }


}
