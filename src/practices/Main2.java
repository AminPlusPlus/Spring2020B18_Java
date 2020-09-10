package practices;
public class Main2 {
    public static String  lastPos(String [] pos){
        String [] arr ={"N","E","S","W"};
        int index =0;
        String word ="";
        for (int i=0; i< pos.length; i++){
            String st = pos[i];
            if (st.equals("L")){
                if (index <0 ){
                    index =3;
                }else {
                    index--;
                }
            } else {
                if (index >3){
                    index =0;
                } else {
                    index++;
                }
            }
        }
        return arr[index];
    }
    public static void main(String[] args) {
        String [] arr ={"L","R","R","R","L","L","R","R","R","L"};
        System.out.println(lastPos(arr));
    }
}