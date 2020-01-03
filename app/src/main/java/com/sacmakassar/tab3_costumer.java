package com.sacmakassar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class tab3_costumer extends Fragment{
    private static final String TAG ="tab3_costumer";
    private Button btn3;
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab3_costumer,container,false);
        btn3 = (Button) view.findViewById(R.id.btntab3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "tab3", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
