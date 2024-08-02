
public class CicloFor {

    public static void main(String[] args) {
        
        //cntinuacion de continue o del break--------
        inicio:
        for (var i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                continue inicio;
                //break inicio;
            }
            System.out.println("i = " + i);
        }
    }
}
