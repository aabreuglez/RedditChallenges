import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Tetromino {
        //We need to remove chars from the bag, so better an array list
        List<Character> piezas;
        
        public static void main(String[] args){
            Tetromino t1 = new Tetromino();
            for (int i = 0; i < 50; i++)
            {
                System.out.println(t1.sacar());
            }
        }
        
        public Tetromino() 
        {
            piezas = new ArrayList<Character>();
            rellenarBolsa();
        }
        
        private void rellenarBolsa()
        {
            for (char a : "OISZLJT".toCharArray())
                piezas.add(a);
            Collections.shuffle(piezas);
        }
        
        public String sacar() {
            if (piezas.isEmpty())
            {
                rellenarBolsa();
            }
            String result = piezas.get(0).toString();
            piezas.remove(0);
            return result;
        }
        
        
}