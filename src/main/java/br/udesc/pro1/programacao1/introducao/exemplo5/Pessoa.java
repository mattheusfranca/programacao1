package br.udesc.pro1.programacao1.introducao.exemplo5;

/**
 *
 * @author mattheus
 */
public class Pessoa {
    
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    
    //private Pessoa conjuge;
    
    public Pessoa conjuge;
    
    /**
     * Contrutor da classe
     * @param anoNascimento 
     */
    public Pessoa(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Método para alterar o nome de uma pessoa
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Este método vai casar 2 pessoas quando possível, atribuindo 
     * os conjuges nas duas intâncias.
     * @param outraPessoa 
     */
    public void casar(Pessoa outraPessoa){ //this == Maria e OutraPessoa == joao
    
        if(conjuge == null && outraPessoa != null){
            if(!outraPessoa.ehCasado()){
                this.conjuge = outraPessoa;
                //o atributo só pode ser chamado aqui pois estamos na classe Pessoa. O método é privado.
                outraPessoa.conjuge = this;   
            }
        }
    }
    
    
    /**
     * Este método apenas atribui o conjuge a uma pessoa
     * @param outraPessoa 
     */
//    public void casar(Pessoa outraPessoa){
//        conjuge = outraPessoa;
//    }
    
    
    public boolean ehCasado(){
        if(conjuge == null)
            return false;
        else
            return true;
    }
    
    
    public String getNomeConjuge(){
        if(conjuge != null)
            return conjuge.getNome(); //conjuge é uma Pessoa
        else
            return null;
    }
    
    public String apresentarDados() {
        return "Pessoa{" + "anoNascimento=" + anoNascimento + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + '}';
    }

    @Override
    public String toString() {
        String nomeConjuge = "";
        if(conjuge != null)
            nomeConjuge = conjuge.getNome();
        
        return "Pessoa{" + "anoNascimento=" + anoNascimento + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", conjuge=" + nomeConjuge + '}';
    }

}
