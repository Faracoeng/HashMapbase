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
