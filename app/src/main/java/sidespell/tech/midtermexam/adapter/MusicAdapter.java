package sidespell.tech.midtermexam.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sidespell.tech.midtermexam.R;
import sidespell.tech.midtermexam.entities.AlbumModel;
import sidespell.tech.midtermexam.holder.MusicHolder;

/**
 * Created by jamesz on 2/2/2016.
 */
public class MusicAdapter extends RecyclerView.Adapter<MusicHolder>{



    Context context;
    int myLayoutId;
    List<AlbumModel> albumModelList;
    public MusicAdapter(Context context, int myLayoutId, List<AlbumModel> albumModelList) {
        this.context = context;
        this.myLayoutId = myLayoutId;
        this.albumModelList = albumModelList;
    }

    @Override
    public MusicHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(myLayoutId, parent, false);
        return new MusicHolder(view);
    }

    @Override
    public void onBindViewHolder(MusicHolder holder, int position) {
        AlbumModel albumMdl = albumModelList.get(position);

        if (albumMdl != null) {
            if (holder.imgMovie != null) {
                holder.imgMovie.setImageResource(albumMdl.getImgview());
            }
            if (holder.tvName != null) {
                holder.tvName.setText(albumMdl.getAlbumname());
            }
            if (holder.tvGenre != null) {
                holder.tvGenre.setText(albumMdl.getArtistname());
            }
        }
    }



    @Override
    public int getItemCount() {
        return 0;
    }


}
