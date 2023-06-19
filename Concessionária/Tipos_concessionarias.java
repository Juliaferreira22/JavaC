import java.util.Scanner;

public enum Tipos_concessionarias {

    MULTIMARCAS("Diversas", "Curitiba"),
    IMPORTADOS("Import", "Londrina"),
    NACIONAIS("Brasileira", "São Paulo");

    String nome, cidade;

    private Tipos_concessionarias(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade; 
    }

        public static void main(String[] args) {
        Tipos_concessionarias vetorC[] = new Tipos_concessionarias[3];
            int i = 0;
            for(Tipos_concessionarias nome: Tipos_concessionarias.values()){
                vetorC[i] = nome;
                i++;
            }

            System.out.println("Digite um concessionária:");
            Scanner sc = new Scanner (System.in);
            String nomeConcessionaria = sc.nextLine();

            Tipos_concessionarias novo;
            novo = Tipos_concessionarias.valueOf(nomeConcessionaria.toUpperCase());

    }
    
}
