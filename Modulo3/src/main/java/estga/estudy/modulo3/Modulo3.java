package estga.estudy.modulo3;

public class Modulo3 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Paanda", 18, 1.85f, true);
        p.apresentar();
    }
    
    
    
}
class Pessoa{
    private String nome;
    private int idade;
    private float altura;
    private boolean estudante;
        
    public Pessoa(String nome, int idade, float altura, boolean estudante){
         this.nome = nome;
         this.idade = idade;
         this.altura = altura;
         this.estudante = estudante;
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome 
                        + " idade: " + idade 
                        + " altura: " + altura
                        + " estudante: " + estudante);
    }
    
    //GETTERS
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public float getAltura(){
        return altura;
    }
    public boolean isEstudante(){ //para booleans usa-se is, porque é true or false
        return estudante;
    }
    
    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
    
}

    

