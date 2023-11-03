package Chuoi_VanBan;

public class VanBan {
    private String st;
    public VanBan(){

    }
    public VanBan(String st){
        this.st=st;
    }
    public int count_word(String st){
        final char sapce = ' ';
        final char tab='\t';
        final char line ='\n';
        if (st==null){
            return -1;
        }
        int count=0;
        boolean temp=true;
        for (int i = 0 ; i< st.length();i++){
            if (st.charAt(i)!=sapce && st.charAt(i)!=tab && st.charAt(i)!=line){
                if (temp){
                    count++;
                    temp=false;
                }
            }else {
                temp=true;
            }
        }
        return count;
    }

    public String chuanHoa(String st){
         st = st.trim();
         st = st.replaceAll("\\s+", " ");
         return st;
    }
    public int countA(String st){
        int count=0;
        for (int i = 0; i < st.length(); i++) {
            if ((st.charAt(i)=='a') || (st.charAt(i) == 'A')){
                count++;
            }
        }
        return count;
    }
    public void hienThiVanBan() {
        System.out.println("Van ban vua nhap: " + st);
    }

}
