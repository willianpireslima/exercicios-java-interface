# exercicios-java-interface
Exercícios em java que usam a interface gráfica swing 
#  Tutorial básico de interfaces em Java

Para criar uma janela devemos seguir os seguintes passos, caso “creat main class” esteja marcado devesse desmarcar\
![img_01](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/40068cb6-f772-4b9f-b954-da92a7608da8)

Em seguida devemos adicionar a java swing gui em selecionado o default package do arquivo seguido de criar novo arquivo, após abrir a nova janela selecionar a Jframe Form da Swing\
![img_02](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/d68ffa2a-6ecb-4249-9ffc-8b576290a6f8)

Em seguida em aberta a tela do Jframe\
![img_03](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/7dd688b8-9216-4d5c-b59c-a262a360fd92)

A parte mais central é o Jbutton que aciona os comandos, após movê-lo para a tela uma configuração clicando com o botão direito em Jbutton devesse ser feita para que este acione uma um evento em “actionPerformed”, esta ação também cria um trecho de código que será usada posteriormente\
![img_04](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/47b2e2ed-0645-42c5-9ea0-afc8fc39f9aa)

A próxima etapa é controle de input o TextField este possui um nome de variável que será usado para idêntica-lo para que assim seja possível extrair as informações inseridas\
![img_05](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/3e6a3d00-382f-420b-a53a-5bab672ce5db)

Dentro do código de button action performed é inserido os comandos relacionados ao input de dados, o variável do Jtext denominada jTextField1 chama o método getText(), que será armazenada em uma String se o dado for de outro tipo este precisara se convertido usando os métodos Integer.parseInt , Float.parseFloat , Double.parseDoublepor exemplo\
![img_06](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/0286096e-d5f1-48df-81be-6ae799eb848c)

Para gerar um output é necessário usar um controle de label que mostrar os valores em tela\
![img_07](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/375d4f42-5bce-4c89-81e8-c2fc37d4e7b2)

Para passar os dados para a variável de Jlabel nesse caso jLabel1 chama o método setText , caso este não seja uma string é necessário usar um método denominado Integer.toString , Float.toString, ou Double.toString por exemplo\
![img_08](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/acd37c00-65c7-43bb-87b1-27424b9a7520)

A última etapa é a inserção de dados, é o acionamento do botão\
![img_09](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/7250524a-c6ad-4fde-80bb-1bdfded846aa)

Boas praticas nessa etapa consistem em deixar o textField em branco, é após isso usar o botão para remover o texto inserido usando um setText() para enviar um pagar o espaço\
![img_10](https://github.com/willianpireslima/exercicios-java-interface/assets/158337302/96a40f22-6322-4d68-a413-ed6bea2f7176)

