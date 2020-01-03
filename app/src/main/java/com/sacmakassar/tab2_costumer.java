package com.sacmakassar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class tab2_costumer extends Fragment {
    private static final String TAG ="tab2_costumer";
    private Button btn2;
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab2_costumer,container,false);
        btn2 = (Button) view.findViewById(R.id.btntab2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "tab2", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
