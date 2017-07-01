package com.example.lakshay.googlemap.java;

import java.util.List;

/**
 * Created by Lakshay on 6/19/2017.
 */

public interface DirectionFinderListner {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
