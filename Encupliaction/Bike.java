class Bike{
    private int gear;

    public void setGear(int gear)throws IllegalArgumentException{
        if (gear<0 || gear>=6)
        throw new IllegalArgumentException("\11\6\5\4\3\2\1plz press gear only in 5 Don't use your brain");
        this.gear=gear;
    }
    public int getGear(){
        return gear;
    }

}