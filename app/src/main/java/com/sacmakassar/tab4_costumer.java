package com.sacmakassar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class tab4_costumer extends Fragment {
    private static final String TAG ="tab4_costumer";
    private Button btn4;
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab4_costumer,container,false);
        btn4 = (Button) view.findViewById(R.id.btntab4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "tab4", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
