public class CD {
    private String title;
    public static final int MAX = 20;
    private String[] songList;
    private double price;

    public CD (String title, String[] songList, double price){
        this.title = title;
        this.price = price;
    }
    public CD (CD other){
        title = other.title;
        price = other.price;
    }
    public void songName(CD [] cds, String songName){
     CD[] ac = new CD[cds.length];
        for (int i = 0; i < cds.length; i++) {
            String[] str = cds[i].getSongList();
            for (int j = 0; j < str.length; j++) {
                if(str[j] != songName){
                    ac[j] = cds[i];
                }
            }
            }
        } // nadav , noy , shoham


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSongList() {
        return songList;
    }

    public void setSongList(String[] songList) {
        this.songList = songList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

