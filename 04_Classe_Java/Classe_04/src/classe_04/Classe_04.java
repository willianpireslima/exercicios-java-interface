package classe_04;

public class Classe_04 {

    public static class Estoque {

        private char descricao;
        private int prodNum;
        private float preco;

        
        public void setEstoque(char auxDes, int auxProd, float auxPreco) {
            descricao = auxDes;
            prodNum = auxProd;
            preco = auxPreco;
        }

        public void getEstoque() {
            System.out.println("Descricao : " + descricao);
            System.out.println("Produto   : " + prodNum);
            System.out.println("Preco     : " + preco);
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Estoque[] obj = new Estoque[26];

        for (int i=0; i<26; i++ ) {
        obj[i] = new Estoque();
        }
        
        for (int i = 0; i < 26; i++) {
            obj[i].setEstoque((char) (i + 65), i, (i + 1) / 5.0f);  // Use "5.0f" para garantir a divisão de floats
        }
        
         for (int i = 0; i < 26; i++) {
            obj[i].getEstoque();
        }
    }
}
