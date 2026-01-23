import java.util.Random;

public class Book implements Publicacao {

    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual = 1;
    private boolean aberto = false;
    private Pessoa leitor;
    private Random random = new Random();


    public Book(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
    }

    public void detalhes(){

        System.out.println("O livro " + getTitulo() + " está com " + getLeitor() + " de " + getLeitor().getIdade() + " anos");
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPag());
        if (!isAberto()){
            System.out.println("No momento o livro está fechado");
        }else{
            System.out.println("No momento o livro está aberto na página " + getPagAtual());
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    //Versão OO que fiz sozinho
    @Override
    public void folhear() {

        if(isAberto()){

            int limite = getTotPag();
            setPagAtual(random.nextInt(limite)+1);

        }

    }

    public void folhear(int p){

        if(this.aberto && p >=1 && p <= totPag){
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {

        setPagAtual(getPagAtual()+1);

    }

    @Override
    public void voltarPag() {

        setPagAtual(getPagAtual()-1);

    }
}

