# HashMapbase

### Estrutura do HashMap:
O HashMap implementa a interface Map T<K,V>, Cloneable e Serializable, mas o que importa para nós 
aqui é apenas que ele implementa Map. Perceba que a própria implementação do Map T<K,V> usa Generics 
para atribuir um key-value para a lista, em outras palavras, com o HashMap e Generics podemos especificamente 
dizer qual o tipo da nossa chave (string, int, double e etc) e o tipo do nosso valor, que obviamente podem diferir 
sem problema algum.
