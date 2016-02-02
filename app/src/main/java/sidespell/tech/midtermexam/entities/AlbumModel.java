package sidespell.tech.midtermexam.entities;

/**
 * Created by jamesz on 2/2/2016.
 */
public class AlbumModel {

    private String Albumname;
    private String Artistname;
    private int Imgview;

    public AlbumModel(){
    }

    public AlbumModel(String Albumname,String Artistname,int Imgview){

        this.Albumname = Albumname;
        this.Artistname = Artistname;
        this.Imgview = Imgview;
    }

    public String getAlbumname() {
        return Albumname;
    }

    public AlbumModel setAlbumname(String albumname) {
        Albumname = albumname;

        return this;
    }

    public String getArtistname() {
        return Artistname;
    }

    public AlbumModel setArtistname(String artistname) {
        Artistname = artistname;

        return this;
    }

    public int getImgview() {
        return Imgview;
    }

    public AlbumModel setImgview(int imgview) {
        Imgview = imgview;

        return this;
    }
}



