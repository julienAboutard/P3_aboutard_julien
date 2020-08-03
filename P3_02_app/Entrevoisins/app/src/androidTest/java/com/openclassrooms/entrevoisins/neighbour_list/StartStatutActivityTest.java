package com.openclassrooms.entrevoisins.neighbour_list;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.openclassrooms.entrevoisins.utils.RecyclerViewItemCountAssertion.withItemCount;
import static org.hamcrest.core.IsNull.notNullValue;


@RunWith(AndroidJUnit4.class)
public class StartStatutActivityTest {

    private ListNeighbourActivity mActivity;

    private static int ITEMS_COUNT = DI.getNeighbourApiService().getNeighbours().size();

    @Rule
    public ActivityTestRule<ListNeighbourActivity> mActivityRule =
            new ActivityTestRule<>(ListNeighbourActivity.class);

    @Before
    public void setUp() {
        mActivity = mActivityRule.getActivity();
        assertThat(mActivity, notNullValue());
    }

    @After
    public void closeActivity() {
        mActivity.finish();
    }

    /**
     * Test for checking that StatutNeighbourActivity is displayed when a element of
     * recyclerview that contain the list of neighbour is clicked
     */
    @Test
    public void myNeighbourList_clickAction_showStatutNeighbourActivity() {
        //Checking that in the recyclerview contain the right number of elements
        onView(ViewMatchers.withId(R.id.list_neighbours)).check(withItemCount(ITEMS_COUNT));
        //Clicking on the element a position 0 in the recyclerview
        onView(ViewMatchers.withId(R.id.list_neighbours)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        //Checking toolbar of StatutNeighboutActivity matches what is displayed
        onView(ViewMatchers.withId(R.id.toolbarstatut)).check(matches(isDisplayed()));
    }

    /**
     * Test for checking that StatutNeighbourActivity and is nameTextView contain the name of the clicked
     * object on recyclerview
     */
    @Test
    public void StatutNeighbourActivityStart_nameChecking() {
        //Checking that in the recyclerview contain the right number of elements
        onView(ViewMatchers.withId(R.id.list_neighbours)).check(withItemCount(ITEMS_COUNT));
        //Clicking on the element a position 0 in the recyclerview
        onView(ViewMatchers.withId(R.id.list_neighbours)).perform(RecyclerViewActions.actionOnItemAtPosition(ITEMS_COUNT-1, click()));
        //Checking toolbar of StatutNeighboutActivity matches what is displayed
        onView(ViewMatchers.withId(R.id.nameTextView2)).check(matches(withText("Ludovic")));
    }
}
