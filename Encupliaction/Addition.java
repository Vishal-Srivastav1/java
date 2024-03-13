class Addition{
     private int num;
     public void setNum(int num)throws IllegalArgumentException{
        if(num<0)
        throw new IllegalArgumentException("dont pass -ve values");
        this.num=num;
     }
     public int getNum(){
        return num;
     }
}