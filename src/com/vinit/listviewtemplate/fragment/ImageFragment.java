package com.vinit.listviewtemplate.fragment;

 
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vinit.listviewtemplate.R;

 
@SuppressLint("ValidFragment")
public class ImageFragment extends Fragment {
    private final int imageResourceId;
 
    public ImageFragment(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test", "hello");
    }
 
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
 
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        imageView.setImageResource(imageResourceId);
        return view;
    }
}