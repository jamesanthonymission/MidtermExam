package sidespell.tech.midtermexam.holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import sidespell.tech.midtermexam.R;

/**
 * Created by jamesz on 2/2/2016.
 */
public class MusicHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public CardView cardView;
    public ImageView imgMovie;
    public TextView tvName;
    public TextView  tvGenre;

    public MusicHolder(View view) {
        super(view);
        cardView = (CardView) view.findViewById(R.id.cardView);
        imgMovie = (ImageView) view.findViewById(R.id.imgMovie);
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvGenre = (TextView) view.findViewById(R.id.tvGenre);

        // once an item view (list item or grid item) is clicked
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//            Context context = v.getContext();
//            Intent intent = new Intent(context, MovieDetailsActivity.class);
//
//            intent.putExtra(Constants.EXTRA_POSITION, getAdapterPosition());
//            context.startActivity(intent);
    }
}
