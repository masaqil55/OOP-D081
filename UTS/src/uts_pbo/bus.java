package uts_pbo;

public class bus {
   private int jmlPenumpang;
   
   public bus(int penumpang) {
       this.jmlPenumpang = penumpang;
   }

   public int getPenumpang() {
       return jmlPenumpang;
   }

   public void setPenumpang(int penumpang) {
       this.jmlPenumpang = penumpang;
   }
}