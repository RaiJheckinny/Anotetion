import java.util.Objects;

public class App{
    public static void main(String args[]){
        Class<Demo> anotacaoTabela = Demo.class;
        if(anotacaoTabela.isAnnotationPresent(Tabela.class)){
            Tabela anotacao = anotacaoTabela.getAnnotation(Tabela.class);
            System.out.println("Value : " + anotacao.value());
        }
    }
}
