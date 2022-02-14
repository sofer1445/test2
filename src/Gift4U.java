public class Gift4U {
    final char MAN = 'M';
    private int code;
    private double price;
    private char type;


    public Gift4U(int code , double price , char type){
        this.code = code;
        this.price = price;
        this.type = type;

    }
    public int getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    public char getType(){
        return getType();
    }
    public void setCode(int code){
        this.code = code;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void setType(char type) {
        if(type == 'M' ||type == 'F' || type == 'U' || type == 'K'){
            this.type = type;

        }
    }
    public boolean isForMan(){
        boolean isForMen = false;
        if(this.type == MAN || this.type == 'U'){
          isForMen = true;
        }
        return isForMen;
    }

}

