package com.edu4sure.edu4sure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OurCoursesFragment extends Fragment {
    private static final String TAG= "Our Courses tab fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.oc_tab_fragment,container,false);

        return view;
    }//onCreateView ends
}//class ends
