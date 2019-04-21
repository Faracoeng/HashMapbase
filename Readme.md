# HashMapbase

### Estrutura do HashMap:

O HashMap implementa a interface Map T<K,V>, Cloneable e Serializable, mas o que importa para nós 
aqui é apenas que ele implementa Map. Perceba que a própria implementação do Map T<K,V> usa Generics 
para atribuir um key-value para a lista, em outras palavras, com o HashMap e Generics podemos especificamente 
dizer qual o tipo da nossa chave (string, int, double e etc) e o tipo do nosso valor, que obviamente podem diferir 
sem problema algum.

### Capacidade inicial e Load Factor:

Quando você instancia um HashMap a sua capacidade inicial é 16, ou seja, você consegue inserir até 16 elementos no Map, sem a necessidade de criar novas posições. Caso você deseje, também pode instanciar um HashMap com mais ou menos de 16 posições, fica a seu critério e análise.

O atributo Load Factor está intrinsecamente ligado ao tamanho do HashMap, não é a toa que estamos explicando os dois juntos. O load factor é um atributo que mensura em que momento o HashMap deve dobrar seu tamanho, ou seja, antes que você possa preencher as 16 posições, em algum momento o tamanho do HashMap irá dobrar de 16 para 32,

### Criando objetos customizaveis

É muito importante ficar atento a alguns aspectos quando deseja-se utilizar objetos customizados como valores ou chaves no seu HashMap, objetos como: Um DTO de Funcionario, PessoaFisica e assim por diante.

Dois métodos são obrigatórios: equals() e hashCode(), caso estes não sejam implementados adequadamente seu HashMap terá sérios problemas de busca e organização. Veja na Listagem 5 uma implementação de exemplo.

## Listagem 5. Criando DTO com equals() e hashCode()

import java.io.Serializable;
  
public class DTOPadrao implements Serializable {
  
       /**
        *
        */
       private static final long serialVersionUID = 1L;
       private int id;
  
       public boolean equals(Object obj) {
  
             if (obj == null)
                    return false;
             if (this.getClass() != obj.getClass())
                    return false;
             String name = obj.toString();
             return this.toString().equals(name);
  
       }
  
       public int hashCode() {
             return this.toString().hashCode();
       }
  
       public String toString() {
             return new StringBuilder
              (this.getClass().getName()).append("#")
                           .append(this.getId()).toString();
       }
  
       public int getId() {
             return id;
       }
  
       public void setId(int id) {
             this.id = id;
       }
  
}

#### comentario:
O objetivo principal deste artigo foi demonstrar o uso do HashMap na prática e alguns conceitos muito importantes de pouco conhecidos, como é o caso do load factor. Em algumas situações é importante ter noção do que está acontecendo por “trás dos panos”. Imagine uma HashMap com 300 mil elementos e load factor 0,75, em algum momento esses 300 mil elementos irão se transformar em 600 mil e exigir muito processamento, assim você pode trabalhar com o load factor para atrasar esse “rehash” e ganhar performance.

O uso do HashMap é muito comum quando trabalhamos com valores “nomeados”, ou seja, não nos importa a posição do item mas sim o valor da sua chave. Um local onde o HashMap é utilizado com muita frequência é na parametrização de métodos, ou seja, imagine que você tem um método que pode receber um número diversificado de parâmetros cada um com nomes distintos, você pode usar o HashMap com o conceito de chave = nome do parâmetro e valor = valor do parâmetro.
