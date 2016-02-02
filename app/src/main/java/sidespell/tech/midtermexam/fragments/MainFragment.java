package sidespell.tech.midtermexam.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

import sidespell.tech.midtermexam.R;
import sidespell.tech.midtermexam.adapter.MusicAdapter;
import sidespell.tech.midtermexam.entities.AlbumModel;

public class MainFragment extends Fragment {

    private EditText metAlbum;
    private ProgressBar mprgBar;
    private RecyclerView recyclerView;



    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // TODO: Find all views here..
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        TextView tvEmpty = (TextView) view.findViewById(android.R.id.empty);
//        MusicAdapter test = new MusicAdapter(getContext().getApplicationContext());
//        recyclerView.setAdapter(test);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);
        ArrayList<AlbumModel> albumModels = new ArrayList<AlbumModel>();
        MusicAdapter adapter = new MusicAdapter(getContext(),R.layout.recyclerview_item,albumModels);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..
    }

}
