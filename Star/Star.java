class Star {
    public static void main(String[] args){
      int x=6;
      for (int i=1;i<=x;i++){
        for (int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
      }
      for (int i=1;i<=x;i++){
        for (int j=i;j<=x;j++){
        System.out.print("*");
        }
        System.out.println();
      }
    }
}
