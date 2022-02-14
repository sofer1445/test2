public class taskKiril2 {
    public static void main(String[] args) {
        String[] ss = {"shoham","noy","nadav","rrrr"};
        CD cd = new CD("g1",ss,24);
        CD vd = new CD("g2",ss,24);
        CD bd = new CD("g3",ss,24);
        CD nd = new CD("g4",ss,24);
        CD md = new CD("g5",ss,24);
        CD[] cds = {cd,vd,bd,nd,md};
        cd.songName(cds,"nadav");
    }

}
